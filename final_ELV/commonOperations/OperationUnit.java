package cn.edu.tju.scs.seql.final_ELV.commonOperations;


import cn.edu.tju.scs.seql.ELV.common.WebDriverConfiguration;
import cn.edu.tju.scs.seql.element.ByEnum;
import cn.edu.tju.scs.seql.element.ElementEnum;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.*;
import java.util.List;
import java.util.Vector;


import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

public class OperationUnit {
    public static void tuplesOperation(WebDriver driver, String name) throws IOException {
        WebElement preElement = null;
        InputStream is = new FileInputStream("E:\\命名体识别\\xlsToTuples\\testCasePredict_"+name+".xls");
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
        HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);
        boolean preSuccess = true;
        for (int rowNum = 0; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
            if(preSuccess) {
                HSSFRow hssfRow = hssfSheet.getRow(rowNum);
                String action = String.valueOf(hssfRow.getCell(0));
                /*if(action.equals(' '))
                    fail("该用例没有操作指令，测试失败");*/
                String target = String.valueOf(hssfRow.getCell(1)).replace("车型信息", "北京牌");
                //replace exact target
                target=target.replace("车型信息","北京牌");
                HSSFCell dataCell = hssfRow.getCell(2);
                dataCell.setCellType(dataCell.CELL_TYPE_STRING);
                String data = String.valueOf(dataCell);
                String expect = String.valueOf(hssfRow.getCell(3));

                String xpath = ("//body/descendant::*[contains(text(),'" + target + "')]").trim();
                boolean curSuccess = false;
                if (action.contains("写") || action.contains("输入")||action.contains("为")) {
                    xpath = ("//body/descendant::*[contains(text(),'" + target + "')]/../../following-sibling::td[1]/input").trim();
                    List<WebElement> elements = driver.findElements(By.xpath(xpath));
                    if (elements.size() < 1) {
                        xpath = ("//input[@name='inputItem']").trim();
                        elements = driver.findElements(By.xpath(xpath));
                        preElement = writeElement(driver, elements, data);
                    } else{
                        preElement = writeElement(driver, elements, data);
                    }
                    if (preElement==null){
                        curSuccess = false;
                    }else
                        curSuccess = true;

                }
                else if (action.contains("点击") || action.contains("单击") || action.contains("选择") || action.contains("按")) {
                    if(action.contains("回车")){
                        if (preElement!=null){
                            preElement.sendKeys(Keys.ENTER);
                            judgeMaskLoad(driver);
                            curSuccess = true;
                        }else {
                            curSuccess = false;
                        }
                    }else{
                        List<WebElement> elements = driver.findElements(By.xpath(xpath));
                        if (elements.size() > 1) {
                            for (int k = elements.size() - 1; k >= 0; k--) {
                                WebElement ele = elements.get(k);
                                if (ele.isEnabled() && ele.isDisplayed()) {
                                    ele.click();
                                    judgeMaskLoad(driver);
                                    WebDriverConfiguration.operationInterval();
                                    curSuccess = true;
                                    break;
                                }
                            }
                        } else if (elements.size() == 1) {
                            elements.get(0).getText();
                            if (elements.get(0).isEnabled() && elements.get(0).isDisplayed()) {
                                elements.get(0).click();
                                judgeMaskLoad(driver);
                                WebDriverConfiguration.operationInterval();
                                curSuccess = true;
                            }
                            else {
                                curSuccess = false;
                            }
                        }else {
                            xpath = ("//button[contains(@data-qtip, '" + target + "')]").trim();
                            elements = driver.findElements(By.xpath(xpath));
                            if(elements.size()>0){
                                for (int i = elements.size()-1; i >=0; i--) {
                                    WebElement element = elements.get(i);
                                    if(element.isEnabled() && element.isDisplayed()){
                                        element.click();
                                        judgeMaskLoad(driver);
                                        WebDriverConfiguration.operationInterval();
                                        curSuccess = true;
                                        break;
                                    }
                                }
                            }else {
                                curSuccess = false;
                            }
                        }
                    }
                    if(curSuccess){
                        //是否需要加断言
                        boolean assNeed = expect.contains("提示信息");
                        if (assNeed) {
                            String[] info = expect.split("：");
                            if (info.length > 1) {
                                String infoText = info[1].substring(0, info[1].length() - 1);
                                assertTrue(driver.getPageSource().contains(infoText));
                            }
                        }
                    }
                }
                if(curSuccess)
                    preSuccess = true;
                /*else if(curSuccess==false&&preSuccess==true){
                    fail("上一个三元组目标页面元素'"+target+"'跳转错页面，请重新运行页面元素候选集");
                }*/
                else
                    fail("未找到'"+target+"'页面元素，测试失败");
            }
        }
    }

    public static WebElement writeElement(WebDriver driver, List<WebElement> elements, String data) {
        if (elements.size() > 1) {
            for (int k = elements.size() - 1; k >= 0; k--) {
                WebElement ele = elements.get(k);
                if (ele.isEnabled() && ele.isDisplayed() && !("true".equals(ele.getAttribute("readonly")))) {
                    ele.clear();
                    ele.sendKeys(data);
                    WebDriverConfiguration.operationInterval();
                    return ele;
                }
            }
            return null;
        } else if (elements.size() == 1) {
            if (elements.get(0).isEnabled() && elements.get(0).isDisplayed()) {
                elements.get(0).clear();
                elements.get(0).sendKeys(data);
                WebDriverConfiguration.operationInterval();
                return elements.get(0);
            }
            return null;
        }else
            return null;
    }

    // 检测载入界面是否完成
    public static void judgeMaskLoad(WebDriver driver) {
        CommonOperationsAll a = new CommonOperationsAll(driver);
        ElementEnum elementEnum = new ElementEnum() {
            @Override
            public ByEnum getByWhat() {
                return ByEnum.ById;
            }

            @Override
            public String getName() {
                return "maskload";
            }
        };
        a.judgeElementDisplayNone(elementEnum);
    }
}

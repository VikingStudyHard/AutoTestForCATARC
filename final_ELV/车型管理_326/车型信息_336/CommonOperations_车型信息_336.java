package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型信息_336;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cn.edu.tju.scs.seql.ELV.common.WebDriverConfiguration;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;

public class CommonOperations_车型信息_336 extends CommonOperationsAll {

	public CommonOperations_车型信息_336(){
		super();
	}
	
	public CommonOperations_车型信息_336(WebDriver driver){
		super(driver);
	}
	
	/**
	 * 检测第一页载入界面是否完成
	 */
	public void judgeMaskLoadFirst(){
		judgeElementDisplayNone(ElementEnum_车型信息_336.换页载入界面);
	}
	
	/**
	 * 验证数据库中只有一条想要搜索到的记录(testBy樊向宇)
	 */
	public void verifyOnlyOneMyRecord(){
		getElement(ElementEnum_车型信息_336.车型商标输入框).clear();
		getElement(ElementEnum_车型信息_336.车型商标输入框).sendKeys("testBy樊向宇");
		getElement(ElementEnum_车型信息_336.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		List<WebElement> eles = getElements(ElementEnum_车型信息_336.检索结果所有行);
		WebDriverConfiguration.operationInterval();
		if(eles.size() < 2){
			addOneMyRecord();
		}else if(eles.size() > 2){
			deleteFirstMatchRecord();
			verifyOnlyOneMyRecord();
		}
	}
	
	/**
	 * 把第一条记录删除
	 */
	public void deleteFirstMatchRecord(){
		getElement(ElementEnum_车型信息_336.检索结果第一行车型商标中文).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.删除车型按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.第一页提示框是按钮).click();
		WebDriverConfiguration.operationInterval();
		verifySucess();
	}
	
	public void addOneMyRecord(){
		String defaultStr = "testBy樊向宇";
		getElement(ElementEnum_车型信息_336.新增车型按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_车型信息_336.新增车型商标中文输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型商标中文输入框).sendKeys(defaultStr);
		getElement(ElementEnum_车型信息_336.新增车型商标英文输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型商标英文输入框).sendKeys(defaultStr);
		getElement(ElementEnum_车型信息_336.新增车型中文名称输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型中文名称输入框).sendKeys(defaultStr);
		getElement(ElementEnum_车型信息_336.新增车型英文名称输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型英文名称输入框).sendKeys(defaultStr);
		getElement(ElementEnum_车型信息_336.新增车型通用名称输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型通用名称输入框).sendKeys(defaultStr);
		getElement(ElementEnum_车型信息_336.新增车型型号款式输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型型号款式输入框).sendKeys(defaultStr);
		getElement(ElementEnum_车型信息_336.新增车型种类输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型种类输入框).sendKeys(defaultStr);
		getElement(ElementEnum_车型信息_336.新增整车质量输入框).clear();
		getElement(ElementEnum_车型信息_336.新增整车质量输入框).sendKeys("100");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.新增生产企业输入框).clear();
		getElement(ElementEnum_车型信息_336.新增生产企业输入框).sendKeys(defaultStr);
		
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ ElementEnum_车型信息_336.新增生产年份输入框.getName()+"\");setDate.removeAttribute('readonly');");
		getElement(ElementEnum_车型信息_336.新增生产年份输入框).clear();
		getElement(ElementEnum_车型信息_336.新增生产年份输入框).sendKeys("2016-04-13");
		
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_车型信息_336.新增长输入框).clear();
		getElement(ElementEnum_车型信息_336.新增长输入框).sendKeys("10");
		getElement(ElementEnum_车型信息_336.新增宽输入框).clear();
		getElement(ElementEnum_车型信息_336.新增宽输入框).sendKeys("10");
		getElement(ElementEnum_车型信息_336.新增高输入框).clear();
		getElement(ElementEnum_车型信息_336.新增高输入框).sendKeys("10");
		
		getElement(ElementEnum_车型信息_336.新增备注输入框).clear();
		getElement(ElementEnum_车型信息_336.新增备注输入框).sendKeys(defaultStr);
		
		WebDriverConfiguration.operationInterval();
		
		if(!getElement(ElementEnum_车型信息_336.第一页提示框最外层).getAttribute("class").contains("x-hide-offsets")){
			getElement(ElementEnum_车型信息_336.第一页提示框确认按钮).click();
		}
		getElement(ElementEnum_车型信息_336.弹出窗口保存按钮).click();
		WebDriverConfiguration.operationInterval();
		verifySucess();
		
		
	}
	
	/**
	 * 操作成功后的验证，处理“操作成功”的弹窗
	 */
	public void verifySucess(){
		while(getElement(ElementEnum_车型信息_336.第一页提示框最外层).getAttribute("class").contains("x-hide-offsets")){
			
		}
		assertTrue(getElement(ElementEnum_车型信息_336.第一页提示信息).getText().contains("操作成功"),
				"期望值：操作成功\n"+"实际值："+getElement(ElementEnum_车型信息_336.第一页提示信息).getText());
		getElement(ElementEnum_车型信息_336.第一页提示框确认按钮).click();
	}
	
	/**
	 * 检索出测试时要操作的数据
	 */
	public void searchMyRecord(){
		testQueryByGeneralName("testBy樊向宇", ElementEnum_车型信息_336.车型商标输入框,
				ElementEnum_车型信息_336.检索按钮,
				ElementEnum_车型信息_336.检索结果所有行,
				ElementEnum_车型信息_336.检索结果第一行车型商标中文,
				ElementEnum_车型信息_336.检索结果第一行车型商标英文);
	}
}

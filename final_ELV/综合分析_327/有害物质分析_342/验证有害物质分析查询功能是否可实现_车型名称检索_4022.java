package cn.edu.tju.scs.seql.final_ELV.综合分析_327.有害物质分析_342;

import java.io.*;

import static cn.edu.tju.scs.seql.final_ELV.commonOperations.OperationUnit.tuplesOperation;

import org.openqa.selenium.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import org.testng.annotations.Test;

/**
 * 测试用例id: 4022
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 有害物质分析(#342)
 * 用例名称: 验证有害物质分析查询功能是否可实现-车型名称检索
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 在有害物质分析的查询条件：车型名称中填写1，点击检索按钮
 * 测试预期->1. 无符合条件的信息被检索出
 * 测试步骤->2. 在有害物质分析的查询条件：车型名称中填写ELVT，点击检索按钮
 * 测试预期->2. 无符合条件的信息被检索出
 * 测试步骤->3. 在有害物质分析的查询条件：车型名称中填写ELVTEST，点击检索按钮
 * 测试预期->3. 车型名称（中文或英文）名称中为ELVTEST的所有有害物质分析信息被检索出来
 */

public class 验证有害物质分析查询功能是否可实现_车型名称检索_4022 extends Selenium_Test_Base {

    public 验证有害物质分析查询功能是否可实现_车型名称检索_4022() {
        super();
    }

    public 验证有害物质分析查询功能是否可实现_车型名称检索_4022(WebDriver driver) {
        super(driver);
    }

    @Test
    public void testNg() throws Exception {
        LoginAction.loginAction(driver, baseUrl);
        WebElement leftFrame = getElement(ElementEnum_有害物质分析_342.leftFrame);
        WebElement mainFrame = getElement(ElementEnum_有害物质分析_342.rightFrame);
        driver.switchTo().frame(leftFrame);
        operationInLeftFrame();
        driver.switchTo().defaultContent();

        driver.switchTo().frame(mainFrame);
        detailedOperation();
    }

    /**
     * LeftFrame中的操作，主要是选择不同的功能
     */
    public void operationInLeftFrame() {
        WebDriverConfiguration.operationInterval();
        getElement(ElementEnum_有害物质分析_342.一级目录名称).click();
        WebDriverConfiguration.operationInterval();
        getElement(ElementEnum_有害物质分析_342.二级目录名称).click();
        WebDriverConfiguration.operationInterval();
    }

    /**
     * 具体的测试操作，在右边的mianFrame中进行
     */
    public void detailedOperation() throws IOException {
        String str=getDescription();
        String name= Han.getTestCaseName(str);
        //切割
        //segmentUnit(str,name);
        //读取三元组文件
        tuplesOperation(driver,name);

    }

    public void testQueryCarName(String name) {
        CommonOperations_有害物质分析_342 a = new CommonOperations_有害物质分析_342(driver);
        a.testQueryByGeneralName(name, ElementEnum_有害物质分析_342.车型名称输入框,
                ElementEnum_有害物质分析_342.检索按钮,
                ElementEnum_有害物质分析_342.检索结果所有行,
                ElementEnum_有害物质分析_342.检索结果第一行车型中文名称,
                ElementEnum_有害物质分析_342.检索结果第一行车型英文名称);

    }

    public String getDescription() {
        return "测试用例id: 4022\n"
                + " 所属产品: ELV环境合规系统（标准版）(#17)\n"
                + " 所属模块: 有害物质分析(#342)\n"
                + " 用例名称: 验证有害物质分析查询功能是否可实现-车型名称检索 \n"
                + " 前置条件: 能正常进入综合分析模块\n"
                + " 测试步骤->1. 车型名称中填写1，点击检索按钮\n"
                + " 测试预期->1. 无符合条件的信息被检索出\n"
                + " 测试步骤->2. 车型名称中填写ELVT，点击检索按钮\n"
                + " 测试预期->2. 无符合条件的信息被检索出\n"
                + " 测试步骤->3. 车型名称中填写ELVTEST，点击检索按钮\n"
                + " 测试预期->3. 车型名称（中文或英文）名称中为ELVTEST的所有有害物质分析信息被检索出来\n"
                ;
    }


}

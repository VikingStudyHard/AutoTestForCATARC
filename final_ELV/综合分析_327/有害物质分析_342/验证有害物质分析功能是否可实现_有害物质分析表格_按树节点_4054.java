package cn.edu.tju.scs.seql.final_ELV.综合分析_327.有害物质分析_342;

import static cn.edu.tju.scs.seql.ELV.common.Han.getOperation;
import static cn.edu.tju.scs.seql.ELV.common.Han.getSegment;
import static cn.edu.tju.scs.seql.ELV.common.Han.tokens;
import static cn.edu.tju.scs.seql.final_ELV.commonOperations.OperationUnit.tuplesOperation;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * 测试用例id: 4054
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 有害物质分析(#342)
 * 用例名称: 验证有害物质分析功能是否可实现-有害物质分析表格-按树节点
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮
 * 测试预期->1. 跳转至新页面，页面包含车型树形图和有害物质分析表格
 * 测试步骤->2. 点击有害物质分析表格右上角的确定按钮
 * 测试预期->2. 出现提示信息：请选择需要有害物质分析的节点！
 * 测试步骤->3. 在右侧的树形图中选择一个节点，点击有害物质分析表格右上角的确定按钮
 * 测试预期->3. 出现提示信息：请选择需要分析的法规！
 * 测试步骤->4. 在有害物质分析表格上方的分析的法规中选择一项规则，点击右上角的确定按钮
 * 测试预期->4. 检索出相应节点的符合所选择法规的有害物质分析信息
 * 测试步骤->5. 在有害物质分析表格上方的全部显示中选择不合规部分显示，点击右上角的确定按钮
 * 测试预期->5. 检索出相应节点的符合所选择法规的不合规部分的有害物质分析信息
 */

public class 验证有害物质分析功能是否可实现_有害物质分析表格_按树节点_4054 extends Selenium_Test_Base {

    public 验证有害物质分析功能是否可实现_有害物质分析表格_按树节点_4054() {
        super();
    }

    public 验证有害物质分析功能是否可实现_有害物质分析表格_按树节点_4054(WebDriver driver) {
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
        //读取三元组文件
        tuplesOperation(driver,name);






        /*WebElement mainFrame = getElement(ElementEnum_有害物质分析_342.rightFrame);*/
        /*getElement(ElementEnum_有害物质分析_342.检索结果第一行品牌中文名称).click();
        WebDriverConfiguration.operationInterval();
        getElement(ElementEnum_有害物质分析_342.第一页确定按钮).click();
        WebDriverConfiguration.operationInterval();
        judgeMaskLoad();*/


/*
        getElement(ElementEnum_有害物质分析_342.检索结果第一行品牌中文名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_有害物质分析_342.第一页确定按钮).click();
		WebDriverConfiguration.operationInterval();
		judgeMaskLoad();

		getElement(ElementEnum_有害物质分析_342.第二页确定按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(driver.getPageSource().contains("请选择需要有害物质分析的节点"));
		getElement(ElementEnum_有害物质分析_342.第二页弹窗确认按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_有害物质分析_342.树形图第一个根节点).click();
		WebDriverConfiguration.operationInterval();
		judgeMaskLoad();
		
		getElement(ElementEnum_有害物质分析_342.第二页确定按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(driver.getPageSource().contains("请选择需要分析的法规"));
		getElement(ElementEnum_有害物质分析_342.第二页弹窗确认按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_有害物质分析_342.法规选择下拉框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_有害物质分析_342.第一条法规).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_有害物质分析_342.第二页确定按钮).click();
		judgeMaskLoad();
		
		getElement(ElementEnum_有害物质分析_342.全部显示多选框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_有害物质分析_342.不合规部分显示选项).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_有害物质分析_342.第二页确定按钮).click();
		WebDriverConfiguration.operationInterval();
		judgeMaskLoad();*/

    }

    // 检测载入界面是否完成
    public void judgeMaskLoad() {
        CommonOperationsAll a = new CommonOperationsAll(driver);
        a.judgeElementDisplayNone(ElementEnum_有害物质分析_342.载入界面);
    }

    public String getDescription() {
        return "测试用例id: 4054\n"
                + " 所属产品: ELV环境合规系统（标准版）(#17)\n"
                + " 所属模块: 有害物质分析(#342)\n"
                + " 用例名称: 验证有害物质分析功能是否可实现-有害物质分析表格-按树节点\n"
                + " 前置条件: 能正常进入综合分析模块\n"
                + " 测试步骤->1. 单击北京牌，点击确定\n"
                + " 测试预期->1. 跳转至新页面，页面包含车型树形图和有害物质分析表格\n"
                + " 测试步骤->2. 点击确定\n"
                + " 测试预期->2. 出现提示信息：请选择需要有害物质分析的节点！\n"
                + " 测试步骤->3. 点击确定\n"
                + " 测试预期->3. 出现提示信息：请选择需要分析的法规！\n"
                + " 测试步骤->4. 点击确定\n"
                + " 测试预期->4. 检索出相应节点的符合所选择法规的有害物质分析信息\n"
                + " 测试步骤->5. 点击确定\n"
                + " 测试预期->5. 检索出相应节点的符合所选择法规的不合规部分的有害物质分析信息\n"
                ;
    }


}

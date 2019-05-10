package cn.edu.tju.scs.seql.final_ELV.综合分析_327.禁限用物质豁免分析_347;

import java.io.IOException;
import java.util.List;

import static cn.edu.tju.scs.seql.final_ELV.commonOperations.OperationUnit.tuplesOperation;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.有害物质分析_342.ElementEnum_有害物质分析_342;

/**
 * 测试用例id: 4026
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 禁限用物质豁免分析(#347)
 * 用例名称: 验证禁限用物质豁免分析中确定功能是否可实现
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 点击车型信息版面中的确定按钮
 * 测试预期->1. 出现提示信息：您要选择一条记录
 * 测试步骤->2. 随机选择一条记录单击左键
 * 测试预期->2. 跳转至新页面，页面包含所选信息的禁限用物质豁免分析信息，可查询参数来分析信息。
 * 
 */

public class 验证禁限用物质豁免分析中确定功能是否可实现_4026 extends Selenium_Test_Base {
	
	public 验证禁限用物质豁免分析中确定功能是否可实现_4026(){
		super();
	}
	
	public 验证禁限用物质豁免分析中确定功能是否可实现_4026(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_禁限用物质豁免分析_347.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_禁限用物质豁免分析_347.rightFrame);
	    driver.switchTo().frame(leftFrame);
	    operationInLeftFrame();
	    driver.switchTo().defaultContent();
		
		driver.switchTo().frame(mainFrame);
	    detailedOperation();
	}
	
	/**
	 * LeftFrame中的操作，主要是选择不同的功能
	 */
	public void operationInLeftFrame(){
	
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_禁限用物质豁免分析_347.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_禁限用物质豁免分析_347.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	// 检测载入界面是否完成
	public void judgeMaskLoad(){
		CommonOperationsAll a = new CommonOperationsAll(driver);
		a.judgeElementDisplayNone(ElementEnum_禁限用物质豁免分析_347.载入界面);
	}
	
	public void detailedOperation() throws IOException {
//		getElement(ElementEnum_禁限用物质豁免分析_347.第一页确定按钮).click();
//		WebDriverConfiguration.operationInterval();
//		assertTrue(driver.getPageSource().contains("您要选择一条记录"));
//		getElement(ElementEnum_禁限用物质豁免分析_347.提示信息确定按钮).click();
//		WebDriverConfiguration.operationInterval();
//
//		getElement(ElementEnum_禁限用物质豁免分析_347.车型信息第一行).click();
//		getElement(ElementEnum_禁限用物质豁免分析_347.第一页确定按钮).click();
//		WebDriverConfiguration.operationInterval();
		String str=getDescription();
		String name= Han.getTestCaseName(str);
		//读取三元组文件
		tuplesOperation(driver,name);
	}

	
	public String getDescription(){
		return "测试用例id: 4026\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 禁限用物质豁免分析(#347)\n"
				+" 用例名称: 验证禁限用物质豁免分析中确定功能是否可实现\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 点击车型信息版面中的确定按钮\n"
				+" 测试预期->1. 出现提示信息：您要选择一条记录\n"
				+" 测试步骤->2. 随机选择一条记录单击左键\n"
				+" 测试预期->2. 跳转至新页面，页面包含所选信息的禁限用物质豁免分析信息，可查询参数来分析信息。\n"
;
	}

}

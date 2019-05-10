package cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352;

import static org.testng.Assert.assertEquals;

import java.util.List;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4546
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 标准信息(#352)
 * 用例名称: 验证标准信息修改功能是否可实现-基本物质信息-删除
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 选择一条信息，点击页面中的选择按钮
 * 测试预期->1. 跳转至新页面，页面为所选标准信息的详细内容界面，可修改法规名称，选择法规类型，选择基本物质信息。
 * 测试步骤->2. 点击基本物质信息中的删除物质按钮。
 * 测试预期->2. 页面出现提示信息：请选择一种物质！
 * 测试步骤->3. 单击左键选择一种物质，点击基本物质信息中的删除物质按钮。
 * 测试预期->3. 所选择物质被删除
 * 测试步骤->4. 点击保存按钮
 * 测试预期->4. 页面正常关闭，返回到标准信息最初页面
 * 测试步骤->5. 选择查看更改过的信息
 * 测试预期->5. 所选信息的基本物质信息为修改后的，即修改成功
 * 
 */

public class 验证标准信息修改功能是否可实现_基本物质信息_删除_4546 extends Selenium_Test_Base {
	
	public 验证标准信息修改功能是否可实现_基本物质信息_删除_4546(){
		super();
	}
	
	public 验证标准信息修改功能是否可实现_基本物质信息_删除_4546(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_标准信息_352.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_标准信息_352.rightFrame);
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
		getElement(ElementEnum_标准信息_352.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_标准信息_352 a = new CommonOperations_标准信息_352(driver);
		a.verifyOnlyOneMyRecord();
		a.searchMyRecord();
		getElement(ElementEnum_标准信息_352.检索结果第一行法规名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.修改按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.查看窗口删除物质按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请选择一种物质");
		
		getElement(ElementEnum_标准信息_352.查看窗口基本物质信息第一行中文名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.查看窗口删除物质按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTipsAndThenOperateButton("是否删除",
									ElementEnum_标准信息_352.第一页提示信息, 
									ElementEnum_标准信息_352.第一页提示框是按钮);
		WebDriverConfiguration.operationInterval();
		a.verifyTips("删除物质成功");
		
		getElement(ElementEnum_标准信息_352.查看窗口关闭按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.searchMyRecord();
		getElement(ElementEnum_标准信息_352.检索结果第一行法规名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.修改按钮).click();
		
		List<WebElement> eles = getElements(ElementEnum_标准信息_352.查看窗口基本物质信息所有行);
		assertEquals(eles.size(), 1);
		
		getElement(ElementEnum_标准信息_352.查看窗口关闭按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.searchMyRecord();
		a.deleteFirstMatchRecord();
		
	}

	
	public String getDescription(){
		return "测试用例id: 4546\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 标准信息(#352)\n"
				+" 用例名称: 验证标准信息修改功能是否可实现-基本物质信息-删除\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 选择一条信息，点击页面中的选择按钮\n"
				+" 测试预期->1. 跳转至新页面，页面为所选标准信息的详细内容界面，可修改法规名称，选择法规类型，选择基本物质信息。\n"
				+" 测试步骤->2. 点击基本物质信息中的删除物质按钮。\n"
				+" 测试预期->2. 页面出现提示信息：请选择一种物质！\n"
				+" 测试步骤->3. 单击左键选择一种物质，点击基本物质信息中的删除物质按钮。\n"
				+" 测试预期->3. 所选择物质被删除\n"
				+" 测试步骤->4. 点击保存按钮\n"
				+" 测试预期->4. 页面正常关闭，返回到标准信息最初页面\n"
				+" 测试步骤->5. 选择查看更改过的信息\n"
				+" 测试预期->5. 所选信息的基本物质信息为修改后的，即修改成功\n"
;
	}

}

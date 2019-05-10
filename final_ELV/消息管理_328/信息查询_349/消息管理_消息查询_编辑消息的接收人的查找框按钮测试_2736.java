package cn.edu.tju.scs.seql.final_ELV.消息管理_328.信息查询_349;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2736
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 信息查询(#349)
 * 用例名称: 消息管理-消息查询-编辑消息的接收人的查找框按钮测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询
 *         勾选某一状态为未发送的、接收人为空的消息
 *         点击编辑按钮
 * 测试步骤->1. 点击第三行接收人右侧的查找按钮
 * 测试预期->1. 弹出接收人选择窗口，检索选项栏显示有部门、姓名，以及检索按钮，列表显示待选接收人信息以及确认按钮，以及下方显示的表格信息“第1页，共8页”“显示1-12条，共96条”，向前翻页按钮以及翻至首页按钮为灰色不可点击，向下翻页以及翻至尾页按钮为蓝色可以点击，以及刷新按钮
 * 测试步骤->2. 点击刷新按钮
 * 测试预期->2. 表格刷新，显示更新信息
 * 测试步骤->3. 点击向下翻页按钮
 * 测试预期->3. 表格跳转至第2页，下方信息显示为“第2页，共8页”和右下角的“显示13-24条，共96条”，且左下角的向前翻页和翻至首页按钮变为蓝色可以点击。
 * 测试步骤->4. 再点击翻至尾页按钮
 * 测试预期->4. 表格跳转至尾页，下方信息显示为“第8页，共8页”和右下角的“显示85-96条，共96条”，且左侧的向后翻页和翻至尾页按钮为灰色不可以点击。
 * 测试步骤->5. 再点击向上翻页按钮
 * 测试预期->5. 表格跳转至第7页，下方信息显示为“第7页，共8页”和右下角的“显示73-84条，共96条”，且左下角的向后翻页和翻至尾页按钮为蓝色可以点击。
 * 测试步骤->6. 再点击翻至首页按钮
 * 测试预期->6. 表格跳转至第1页，下方信息显示为“第1页，共8页”和右下角的“显示1-12条，共96条”，且左下角的向前翻页和翻至首页按钮为灰色不可点击。
 * 测试步骤->7. 在下方页数输入框内输入“3”并安enter键
 * 测试预期->7. 表格跳转至第3页，下方信息显示为“第3页，共8页”和右下角的“显示25-36条，共96条”，且左下角的向后翻页和翻至尾页和向上翻页和翻至首页按钮为蓝色可以点击。
 * 测试步骤->8. 在下方页数输入框内输入“10”并安enter键
 * 测试预期->8. 表格跳转至尾页，下方信息显示为“第8页，共8页”和右下角的“显示85-96条，共96条”，且左侧的向后翻页和翻至尾页按钮为灰色不可以点击。
 * 
 */

public class 消息管理_消息查询_编辑消息的接收人的查找框按钮测试_2736 extends Selenium_Test_Base {
	
	public 消息管理_消息查询_编辑消息的接收人的查找框按钮测试_2736(){
		super();
	}
	
	public 消息管理_消息查询_编辑消息的接收人的查找框按钮测试_2736(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_信息查询_349.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_信息查询_349.rightFrame);
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
		getElement(ElementEnum_信息查询_349.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_信息查询_349.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_信息查询_349 a = new CommonOperations_信息查询_349(driver);
		a.verifyFirstNMyRecord(1);
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_信息查询_349.检索结果第一行消息标题).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_信息查询_349.编辑按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		// TODO 后边编辑选框使用了showModalDialog，无法继续测试
	
	}

	
	public String getDescription(){
		return "测试用例id: 2736\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 信息查询(#349)\n"
				+" 用例名称: 消息管理-消息查询-编辑消息的接收人的查找框按钮测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询 勾选某一状态为未发送的、接收人为空的消息 点击编辑按钮\n"
				+" 测试步骤->1. 点击第三行接收人右侧的查找按钮\n"
				+" 测试预期->1. 弹出接收人选择窗口，检索选项栏显示有部门、姓名，以及检索按钮，列表显示待选接收人信息以及确认按钮，以及下方显示的表格信息“第1页，共8页”“显示1-12条，共96条”，向前翻页按钮以及翻至首页按钮为灰色不可点击，向下翻页以及翻至尾页按钮为蓝色可以点击，以及刷新按钮\n"
				+" 测试步骤->2. 点击刷新按钮\n"
				+" 测试预期->2. 表格刷新，显示更新信息\n"
				+" 测试步骤->3. 点击向下翻页按钮\n"
				+" 测试预期->3. 表格跳转至第2页，下方信息显示为“第2页，共8页”和右下角的“显示13-24条，共96条”，且左下角的向前翻页和翻至首页按钮变为蓝色可以点击。\n"
				+" 测试步骤->4. 再点击翻至尾页按钮\n"
				+" 测试预期->4. 表格跳转至尾页，下方信息显示为“第8页，共8页”和右下角的“显示85-96条，共96条”，且左侧的向后翻页和翻至尾页按钮为灰色不可以点击。\n"
				+" 测试步骤->5. 再点击向上翻页按钮\n"
				+" 测试预期->5. 表格跳转至第7页，下方信息显示为“第7页，共8页”和右下角的“显示73-84条，共96条”，且左下角的向后翻页和翻至尾页按钮为蓝色可以点击。\n"
				+" 测试步骤->6. 再点击翻至首页按钮\n"
				+" 测试预期->6. 表格跳转至第1页，下方信息显示为“第1页，共8页”和右下角的“显示1-12条，共96条”，且左下角的向前翻页和翻至首页按钮为灰色不可点击。\n"
				+" 测试步骤->7. 在下方页数输入框内输入“3”并安enter键\n"
				+" 测试预期->7. 表格跳转至第3页，下方信息显示为“第3页，共8页”和右下角的“显示25-36条，共96条”，且左下角的向后翻页和翻至尾页和向上翻页和翻至首页按钮为蓝色可以点击。\n"
				+" 测试步骤->8. 在下方页数输入框内输入“10”并安enter键\n"
				+" 测试预期->8. 表格跳转至尾页，下方信息显示为“第8页，共8页”和右下角的“显示85-96条，共96条”，且左侧的向后翻页和翻至尾页按钮为灰色不可以点击。\n"
;
	}

}

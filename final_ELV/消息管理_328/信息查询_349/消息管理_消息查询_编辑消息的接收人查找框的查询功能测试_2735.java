package cn.edu.tju.scs.seql.final_ELV.消息管理_328.信息查询_349;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2735
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 信息查询(#349)
 * 用例名称: 消息管理-消息查询-编辑消息的接收人查找框的查询功能测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询
 *         勾选某一状态为未发送的、接收人为空的消息
 *         点击编辑按钮
 *         点击编辑窗口第三行接收人一栏右侧的查找按钮
 * 测试步骤->1. 部门栏选择“经营部”，点击检索
 * 测试预期->1. 显示部门为经营部的接收人的信息列表
 * 测试步骤->2. 部门栏重置为空，姓名栏输入“李德平”，点击检索按钮
 * 测试预期->2. 列表显示姓名为“李德平”的接收人信息
 * 测试步骤->3. 姓名栏输入“lideping”，点击检索按钮
 * 测试预期->3. 列表显示姓名为“李德平”的接收人信息
 * 测试步骤->4. 部门栏选择“经营部”，姓名栏输入“lideping”，点击检索按钮
 * 测试预期->4. 显示姓名为“lideping”且所在部门为经营部的接收人信息
 * 
 */

public class 消息管理_消息查询_编辑消息的接收人查找框的查询功能测试_2735 extends Selenium_Test_Base {
	
	public 消息管理_消息查询_编辑消息的接收人查找框的查询功能测试_2735(){
		super();
	}
	
	public 消息管理_消息查询_编辑消息的接收人查找框的查询功能测试_2735(WebDriver driver){
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
		return "测试用例id: 2735\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 信息查询(#349)\n"
				+" 用例名称: 消息管理-消息查询-编辑消息的接收人查找框的查询功能测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询 勾选某一状态为未发送的、接收人为空的消息 点击编辑按钮 点击编辑窗口第三行接收人一栏右侧的查找按钮\n"
				+" 测试步骤->1. 部门栏选择“经营部”，点击检索\n"
				+" 测试预期->1. 显示部门为经营部的接收人的信息列表\n"
				+" 测试步骤->2. 部门栏重置为空，姓名栏输入“李德平”，点击检索按钮\n"
				+" 测试预期->2. 列表显示姓名为“李德平”的接收人信息\n"
				+" 测试步骤->3. 姓名栏输入“lideping”，点击检索按钮\n"
				+" 测试预期->3. 列表显示姓名为“李德平”的接收人信息\n"
				+" 测试步骤->4. 部门栏选择“经营部”，姓名栏输入“lideping”，点击检索按钮\n"
				+" 测试预期->4. 显示姓名为“lideping”且所在部门为经营部的接收人信息\n"
;
	}

}

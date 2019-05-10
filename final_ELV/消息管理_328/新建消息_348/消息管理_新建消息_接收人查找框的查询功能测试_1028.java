package cn.edu.tju.scs.seql.final_ELV.消息管理_328.新建消息_348;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1028
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 新建消息(#348)
 * 用例名称: 消息管理-新建消息-接收人查找框的查询功能测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息
 *         点击新建消息窗口第三行接收人一栏右侧的查找按钮
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

public class 消息管理_新建消息_接收人查找框的查询功能测试_1028 extends Selenium_Test_Base {
	
	public 消息管理_新建消息_接收人查找框的查询功能测试_1028(){
		super();
	}
	
	public 消息管理_新建消息_接收人查找框的查询功能测试_1028(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_新建消息_348.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_新建消息_348.rightFrame);
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
		getElement(ElementEnum_新建消息_348.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_新建消息_348.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		// TODO 选择接收人功能使用了showModalDialog，无法继续测试
	}

	
	public String getDescription(){
		return "测试用例id: 1028\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 新建消息(#348)\n"
				+" 用例名称: 消息管理-新建消息-接收人查找框的查询功能测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息 点击新建消息窗口第三行接收人一栏右侧的查找按钮\n"
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

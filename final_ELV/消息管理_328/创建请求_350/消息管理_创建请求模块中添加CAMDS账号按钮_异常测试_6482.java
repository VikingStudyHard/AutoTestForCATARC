package cn.edu.tju.scs.seql.final_ELV.消息管理_328.创建请求_350;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 6482
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 创建请求(#350)
 * 用例名称: 消息管理-创建请求模块中添加CAMDS账号按钮-异常测试
 * 前置条件: 
 * 测试步骤->1. 登录ELV环境合规系统，左侧树形结构选择 消息管理-创建请求
 * 测试预期->1. 进入创建请求界面，所有内容正常显示 （包括：CAMDS账户（添加CAMDS账号按钮）、项目、材料数据供应商（查找按钮）、材料数据表类型、截止日期， 下方模块信息包括供货编号、供货名称、制图号、制图日期、制图修改号、备注、报表编号、报表日期、购货订单号、提货单号、供应商代码）
 * 测试步骤->2. 点击第一行 添加CAMDS账号 按钮
 * 测试预期->2. 弹出创建账号信息， 包括：用户名、密码、企业部门ID以及下方使用记录列表，还有删除、添加按钮
 * 测试步骤->3. 错误填写用户名，正确填写密码、企业ID， 点击添加按钮
 * 测试预期->3. 弹出提示框提示用户名填写错误
 * 测试步骤->4. 错误填写密码，正确填写用户名、企业ID， 点击添加按钮
 * 测试预期->4. 弹出提示框提示密码填写错误
 * 测试步骤->5. 错误填写企业ID，正确填写用户名、密码， 点击添加按钮
 * 测试预期->5. 弹出提示框提示企业ID填写错误
 * 
 */

public class 消息管理_创建请求模块中添加CAMDS账号按钮_异常测试_6482 extends Selenium_Test_Base {
	
	public 消息管理_创建请求模块中添加CAMDS账号按钮_异常测试_6482(){
		super();
	}
	
	public 消息管理_创建请求模块中添加CAMDS账号按钮_异常测试_6482(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_创建请求_350.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_创建请求_350.rightFrame);
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
		
		//用例未给出什么样的输入叫错误的输入，无法进行测试
		//Assert.fail("用例未给出什么样的输入叫错误的输入，无法进行测试");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_创建请求_350.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_创建请求_350.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		
	}

	
	public String getDescription(){
		return "测试用例id: 6482\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 创建请求(#350)\n"
				+" 用例名称: 消息管理-创建请求模块中添加CAMDS账号按钮-异常测试\n"
				+" 前置条件: \n"
				+" 测试步骤->1. 登录ELV环境合规系统，左侧树形结构选择 消息管理-创建请求\n"
				+" 测试预期->1. 进入创建请求界面，所有内容正常显示 （包括：CAMDS账户（添加CAMDS账号按钮）、项目、材料数据供应商（查找按钮）、材料数据表类型、截止日期， 下方模块信息包括供货编号、供货名称、制图号、制图日期、制图修改号、备注、报表编号、报表日期、购货订单号、提货单号、供应商代码）\n"
				+" 测试步骤->2. 点击第一行 添加CAMDS账号 按钮\n"
				+" 测试预期->2. 弹出创建账号信息， 包括：用户名、密码、企业部门ID以及下方使用记录列表，还有删除、添加按钮\n"
				+" 测试步骤->3. 错误填写用户名，正确填写密码、企业ID， 点击添加按钮\n"
				+" 测试预期->3. 弹出提示框提示用户名填写错误\n"
				+" 测试步骤->4. 错误填写密码，正确填写用户名、企业ID， 点击添加按钮\n"
				+" 测试预期->4. 弹出提示框提示密码填写错误\n"
				+" 测试步骤->5. 错误填写企业ID，正确填写用户名、密码， 点击添加按钮\n"
				+" 测试预期->5. 弹出提示框提示企业ID填写错误\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.消息管理_328.查询请求_351;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 6485
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 查询请求(#351)
 * 用例名称: 消息管理-查询请求模块中添加CAMDS账号按钮-异常测试
 * 前置条件: 
 * 测试步骤->1. 登录ELV环境合规系统，左侧树形结构选择 消息管理-查询请求
 * 测试预期->1. 进入查询请求界面，所有内容正常显示
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

public class 消息管理_查询请求模块中添加CAMDS账号按钮_异常测试_6485 extends Selenium_Test_Base {
	
	public 消息管理_查询请求模块中添加CAMDS账号按钮_异常测试_6485(){
		super();
	}
	
	public 消息管理_查询请求模块中添加CAMDS账号按钮_异常测试_6485(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_查询请求_351.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_查询请求_351.rightFrame);
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
		// TODO 该用例尚未实现，请检查
	/*
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_查询请求_351.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_查询请求_351.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	*/
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		/*
		assertEquals(driver.findElement(By.xpath("//td")).getText(), "企业名称:");
	    assertEquals(driver.findElement(By.xpath("//td[3]")).getText(), "企业ID:");
	    assertEquals(driver.findElement(By.xpath("//td[5]")).getText(), "计划员:");
	    assertEquals(driver.findElement(By.xpath("//td[7]")).getText(), "区域");
	    assertEquals(driver.findElement(By.xpath("//td[9]")).getText(), "新增信息来源");
	    assertEquals(driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td/div/input")).getText(), "");
		*/
	
	}

	
	public String getDescription(){
		return "测试用例id: 6485\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 查询请求(#351)\n"
				+" 用例名称: 消息管理-查询请求模块中添加CAMDS账号按钮-异常测试\n"
				+" 前置条件: \n"
				+" 测试步骤->1. 登录ELV环境合规系统，左侧树形结构选择 消息管理-查询请求\n"
				+" 测试预期->1. 进入查询请求界面，所有内容正常显示\n"
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

package cn.edu.tju.scs.seql.final_ELV.系统管理_330.个人信息_359;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2194
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 个人信息(#359)
 * 用例名称: 验证用户个人密码修改功能是否可以实现-异常操作
 * 前置条件: 能正确进入ELV环境合规系统（标准版）个人信息界面
 * 测试步骤->1. 点击修改个人密码按钮
 * 测试预期->1. 跳出所需填写内容的新页面
 * 测试步骤->2. 在新页面上正确填写原始密码，不填写新密码和再次输入新密码，点击确认。
 * 测试预期->2. 提示未填写的项目，要求重新填写。
 * 测试步骤->3. 在新页面上不填写原始密码，正确填写新密码和再次输入新密码，点击确认。
 * 测试预期->3. 提示未填写的项目，要求重新填写。
 * 测试步骤->4. 在新页面上正确填写原始密码，新密码和再次输入新密码任意填写一项，点击确认。
 * 测试预期->4. 提示未填写的项目，要求重新填写。
 * 测试步骤->5. 关闭修改密码界面
 * 测试预期->5. 密码修改失败，现密码为修改操作前密码。
 * 
 */

public class 验证用户个人密码修改功能是否可以实现_异常操作_2194 extends Selenium_Test_Base {
	
	public 验证用户个人密码修改功能是否可以实现_异常操作_2194(){
		super();
	}
	
	public 验证用户个人密码修改功能是否可以实现_异常操作_2194(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_个人信息_359.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_个人信息_359.rightFrame);
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
		getElement(ElementEnum_个人信息_359.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_个人信息_359.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		// TODO 弹窗无法检测
	
	}

	
	public String getDescription(){
		return "测试用例id: 2194\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 个人信息(#359)\n"
				+" 用例名称: 验证用户个人密码修改功能是否可以实现-异常操作\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）个人信息界面\n"
				+" 测试步骤->1. 点击修改个人密码按钮\n"
				+" 测试预期->1. 跳出所需填写内容的新页面\n"
				+" 测试步骤->2. 在新页面上正确填写原始密码，不填写新密码和再次输入新密码，点击确认。\n"
				+" 测试预期->2. 提示未填写的项目，要求重新填写。\n"
				+" 测试步骤->3. 在新页面上不填写原始密码，正确填写新密码和再次输入新密码，点击确认。\n"
				+" 测试预期->3. 提示未填写的项目，要求重新填写。\n"
				+" 测试步骤->4. 在新页面上正确填写原始密码，新密码和再次输入新密码任意填写一项，点击确认。\n"
				+" 测试预期->4. 提示未填写的项目，要求重新填写。\n"
				+" 测试步骤->5. 关闭修改密码界面\n"
				+" 测试预期->5. 密码修改失败，现密码为修改操作前密码。\n"
;
	}

}

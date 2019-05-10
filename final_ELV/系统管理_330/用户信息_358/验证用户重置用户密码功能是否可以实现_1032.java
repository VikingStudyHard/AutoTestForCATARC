package cn.edu.tju.scs.seql.final_ELV.系统管理_330.用户信息_358;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1032
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 用户信息(#358)
 * 用例名称: 验证用户重置用户密码功能是否可以实现
 * 前置条件: 能正确进入ELV环境合规系统（标准版）用户信息界面
 * 测试步骤->1. 选择一条用户信息，点击重置用户密码按钮。
 * 测试预期->1. 出现提示信息：是否重置该用户密码
 * 测试步骤->2. 点击提示信息中的是按钮。
 * 测试预期->2. 出现提示信息：用户密码重置成功！重置后的密码为000000。
 * 测试步骤->3. 点击确认按钮。
 * 测试预期->3. 跳转回最初页面。
 * 
 */

public class 验证用户重置用户密码功能是否可以实现_1032 extends Selenium_Test_Base {
	
	public 验证用户重置用户密码功能是否可以实现_1032(){
		super();
	}
	
	public 验证用户重置用户密码功能是否可以实现_1032(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_用户信息_358.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_用户信息_358.rightFrame);
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
		getElement(ElementEnum_用户信息_358.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_用户信息_358.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_用户信息_358 a = new CommonOperations_用户信息_358(driver);
		getElement(ElementEnum_用户信息_358.检索结果第一行勾选框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_用户信息_358.重置用户密码).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_用户信息_358.删除是按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("用户密码重置成功！重置后的密码为000000");
	}

	
	public String getDescription(){
		return "测试用例id: 1032\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 用户信息(#358)\n"
				+" 用例名称: 验证用户重置用户密码功能是否可以实现\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）用户信息界面\n"
				+" 测试步骤->1. 选择一条用户信息，点击重置用户密码按钮。\n"
				+" 测试预期->1. 出现提示信息：是否重置该用户密码\n"
				+" 测试步骤->2. 点击提示信息中的是按钮。\n"
				+" 测试预期->2. 出现提示信息：用户密码重置成功！重置后的密码为000000。\n"
				+" 测试步骤->3. 点击确认按钮。\n"
				+" 测试预期->3. 跳转回最初页面。\n"
;
	}

}

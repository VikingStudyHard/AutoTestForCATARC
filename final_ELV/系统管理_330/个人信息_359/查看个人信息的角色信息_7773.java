package cn.edu.tju.scs.seql.final_ELV.系统管理_330.个人信息_359;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 7773
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 个人信息(#359)
 * 用例名称: 查看个人信息的角色信息
 * 前置条件: 1、能正常进入系统管理模块
 *         2、该用户为终极审核用户
 * 测试步骤->1. 点击个人信息
 * 测试预期->1. 刷新出新页面，页面内容分为三栏：用户信息、所属部门信息、拥有的角色信息
 * 测试步骤->2. 查看拥有的角色信息一栏的信息
 * 测试预期->2. 可看到两列信息，标题分别是用户权限、角色类型。用户权限与用户信息模块查找到的该用户的用户权限保持一致。角色类型与角色信息模块中的角色类型保持一致。
 * 
 */

public class 查看个人信息的角色信息_7773 extends Selenium_Test_Base {
	private String[] s = new String[5];
	private String[] s1 = new String[5];
	public 查看个人信息的角色信息_7773(){
		super();
	}
	
	public 查看个人信息的角色信息_7773(WebDriver driver){
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
	    
	    driver.switchTo().defaultContent();
	    
	    driver.switchTo().frame(leftFrame);
	    operationInLeftFrameOne();
	    driver.switchTo().defaultContent();
		
		driver.switchTo().frame(mainFrame);
	    detailedOperationOne();
	}
	
	private void detailedOperationOne() {
		getElement(ElementEnum_个人信息_359.姓名输入框).clear();
		getElement(ElementEnum_个人信息_359.姓名输入框).sendKeys("林华睿");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_个人信息_359.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		String res = getElement(ElementEnum_个人信息_359.权限).getText();
		s1 = res.split("/");
		for(int i = 0;i < 5;i++)
			assertEquals(s[i], s1[i]);
	}

	private void operationInLeftFrameOne() {
		getElement(ElementEnum_个人信息_359.用户信息).click();
		WebDriverConfiguration.operationInterval();
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

		s[0] = getElement(ElementEnum_个人信息_359.一).getText();
		s[1] = getElement(ElementEnum_个人信息_359.二).getText();
		s[2] = getElement(ElementEnum_个人信息_359.三).getText();
		s[3] = getElement(ElementEnum_个人信息_359.四).getText();
		s[4] = getElement(ElementEnum_个人信息_359.五).getText();
		for(int i = 0;i < 5;i++)
		{
			if(s[i].equals("-"))
				s[i] = "";
		}
	
	}

	
	public String getDescription(){
		return "测试用例id: 7773\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 个人信息(#359)\n"
				+" 用例名称: 查看个人信息的角色信息\n"
				+" 前置条件: 1、能正常进入系统管理模块 2、该用户为终极审核用户\n"
				+" 测试步骤->1. 点击个人信息\n"
				+" 测试预期->1. 刷新出新页面，页面内容分为三栏：用户信息、所属部门信息、拥有的角色信息\n"
				+" 测试步骤->2. 查看拥有的角色信息一栏的信息\n"
				+" 测试预期->2. 可看到两列信息，标题分别是用户权限、角色类型。用户权限与用户信息模块查找到的该用户的用户权限保持一致。角色类型与角色信息模块中的角色类型保持一致。\n"
;
	}

}

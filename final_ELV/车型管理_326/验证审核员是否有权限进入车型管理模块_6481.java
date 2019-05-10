package cn.edu.tju.scs.seql.final_ELV.车型管理_326;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;

/**
 * 测试用例id: 6481
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型管理(#326)
 * 用例名称: 验证审核员是否有权限进入车型管理模块
 * 前置条件: 以审核员的身份登录ELV环境合规系统
 * 测试步骤->1. 在用户名处输入yangjie，在密码处输入000000，点击登录
 * 测试预期->1. 正确跳转到系统首页，导航栏中没有车型管理模块
 * 
 */

public class 验证审核员是否有权限进入车型管理模块_6481 extends Selenium_Test_Base {
	
	public 验证审核员是否有权限进入车型管理模块_6481(){
		super();
	}
	
	public 验证审核员是否有权限进入车型管理模块_6481(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_车型管理_326.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_车型管理_326.rightFrame);
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
		assertTrue(driver.getPageSource().contains("车型管理"));
		
		driver.findElement(By.xpath(".//a[text()='退出']")).click();
		CommonOperationsAll a = new CommonOperationsAll(driver);
		a.closeAlertAndGetItsText();
		LoginAction.loginAction(driver, baseUrl, "ncfxy_data", "000000");
		assertTrue(!driver.getPageSource().contains("车型管理"));
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		
	}

	
	public String getDescription(){
		return "测试用例id: 6481\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型管理(#326)\n"
				+" 用例名称: 验证审核员是否有权限进入车型管理模块\n"
				+" 前置条件: 以审核员的身份登录ELV环境合规系统\n"
				+" 测试步骤->1. 在用户名处输入yangjie，在密码处输入000000，点击登录\n"
				+" 测试预期->1. 正确跳转到系统首页，导航栏中没有车型管理模块\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.系统管理_330.用户信息_358;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1010
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 用户信息(#358)
 * 用例名称: 验证用户信息检索功能是否可以实现-总流程
 * 前置条件: 能正确进入ELV环境合规系统（标准版）用户信息界面
 * 测试步骤->1. 在查询条件中的部门中选择经营部，点击查询按钮
 * 测试预期->1. 页面出现所属部门为经营部的所有用户，页面其余各项正常显示。
 * 
 */

public class 验证用户信息检索功能是否可以实现_总流程_1010 extends Selenium_Test_Base {
	
	public 验证用户信息检索功能是否可以实现_总流程_1010(){
		super();
	}
	
	public 验证用户信息检索功能是否可以实现_总流程_1010(WebDriver driver){
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
		getElement(ElementEnum_用户信息_358.部门输入框).sendKeys("经营部");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_用户信息_358.检索按钮).click();
		WebDriverConfiguration.operationInterval();
	
	}

	
	public String getDescription(){
		return "测试用例id: 1010\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 用户信息(#358)\n"
				+" 用例名称: 验证用户信息检索功能是否可以实现-总流程\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）用户信息界面\n"
				+" 测试步骤->1. 在查询条件中的部门中选择经营部，点击查询按钮\n"
				+" 测试预期->1. 页面出现所属部门为经营部的所有用户，页面其余各项正常显示。\n"
;
	}

}

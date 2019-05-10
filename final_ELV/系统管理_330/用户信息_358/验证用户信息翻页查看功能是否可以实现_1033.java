package cn.edu.tju.scs.seql.final_ELV.系统管理_330.用户信息_358;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.final_ELV.系统管理_330.日志信息_360.ElementEnum_日志信息_360;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1033
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 用户信息(#358)
 * 用例名称: 验证用户信息翻页查看功能是否可以实现
 * 前置条件: 能正确进入ELV环境合规系统（标准版）用户信息界面
 * 测试步骤->1. 点击页面下方下一页按钮。
 * 测试预期->1. 页面跳转至下一页，正常显示下一页用户信息。
 * 测试步骤->2. 点击页面下方最后一页按钮。
 * 测试预期->2. 页面跳转至最后一页，正常显示最后一页用户信息。
 * 
 */

public class 验证用户信息翻页查看功能是否可以实现_1033 extends Selenium_Test_Base {
	
	public 验证用户信息翻页查看功能是否可以实现_1033(){
		super();
	}
	
	public 验证用户信息翻页查看功能是否可以实现_1033(WebDriver driver){
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
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		for(int i= 0;i < 5;i++)
			WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_用户信息_358.下一页按钮).click();
		for(int i= 0;i < 5;i++)
			WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_用户信息_358.最后页按钮).click();
	
	}

	
	public String getDescription(){
		return "测试用例id: 1033\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 用户信息(#358)\n"
				+" 用例名称: 验证用户信息翻页查看功能是否可以实现\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）用户信息界面\n"
				+" 测试步骤->1. 点击页面下方下一页按钮。\n"
				+" 测试预期->1. 页面跳转至下一页，正常显示下一页用户信息。\n"
				+" 测试步骤->2. 点击页面下方最后一页按钮。\n"
				+" 测试预期->2. 页面跳转至最后一页，正常显示最后一页用户信息。\n"
;
	}

}

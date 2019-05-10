package cn.edu.tju.scs.seql.final_ELV.系统管理_330.个人信息_359;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1043
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 个人信息(#359)
 * 用例名称: 验证用户个人信息修改功能是否可以实现-不操作
 * 前置条件: 能正确进入ELV环境合规系统（标准版）个人信息界面
 * 测试步骤->1. 点击修改个人信息按钮
 * 测试预期->1. 跳出新页面，含有已存在的个人信息资料。
 * 测试步骤->2. 点击新页面中的关闭按钮。
 * 测试预期->2. 新页面关闭，回最初页面，个人信息无变化。
 * 
 */

public class 验证用户个人信息修改功能是否可以实现_不操作_1043 extends Selenium_Test_Base {
	
	public 验证用户个人信息修改功能是否可以实现_不操作_1043(){
		super();
	}
	
	public 验证用户个人信息修改功能是否可以实现_不操作_1043(WebDriver driver){
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

		getElement(ElementEnum_个人信息_359.修改个人信息).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_个人信息_359.修改页面关闭按钮).click();
		WebDriverConfiguration.operationInterval();
	}

	
	public String getDescription(){
		return "测试用例id: 1043\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 个人信息(#359)\n"
				+" 用例名称: 验证用户个人信息修改功能是否可以实现-不操作\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）个人信息界面\n"
				+" 测试步骤->1. 点击修改个人信息按钮\n"
				+" 测试预期->1. 跳出新页面，含有已存在的个人信息资料。\n"
				+" 测试步骤->2. 点击新页面中的关闭按钮。\n"
				+" 测试预期->2. 新页面关闭，回最初页面，个人信息无变化。\n"
;
	}

}

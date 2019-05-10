package cn.edu.tju.scs.seql.final_ELV.系统管理_330.角色信息_362;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1079
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 角色信息(#362)
 * 用例名称: 验证角色信息查看功能是否可以实现-正常流
 * 前置条件: 能正确进入ELV环境合规系统（标准版）角色信息界面
 * 测试步骤->1. 勾选某项角色信息，点击查看按钮。
 * 测试预期->1. 页面跳转至角色信息列表。
 * 测试步骤->2. 查看完点击关闭按钮。
 * 测试预期->2. 角色信息列表页面关闭，跳转至最初页面。
 * 
 */

public class 验证角色信息查看功能是否可以实现_正常流_1079 extends Selenium_Test_Base {
	
	public 验证角色信息查看功能是否可以实现_正常流_1079(){
		super();
	}
	
	public 验证角色信息查看功能是否可以实现_正常流_1079(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_角色信息_362.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_角色信息_362.rightFrame);
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
		getElement(ElementEnum_角色信息_362.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_角色信息_362.检索结果第一行勾选框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.查看按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_角色信息_362.查看页面关闭按钮).click();
		WebDriverConfiguration.operationInterval();
	
	}

	
	public String getDescription(){
		return "测试用例id: 1079\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 角色信息(#362)\n"
				+" 用例名称: 验证角色信息查看功能是否可以实现-正常流\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）角色信息界面\n"
				+" 测试步骤->1. 勾选某项角色信息，点击查看按钮。\n"
				+" 测试预期->1. 页面跳转至角色信息列表。\n"
				+" 测试步骤->2. 查看完点击关闭按钮。\n"
				+" 测试预期->2. 角色信息列表页面关闭，跳转至最初页面。\n"
;
	}

}

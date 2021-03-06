package cn.edu.tju.scs.seql.final_ELV.系统管理_330.角色信息_362;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1081
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 角色信息(#362)
 * 用例名称: 验证角色信息新增功能是否可以实现-正常流
 * 前置条件: 能正确进入ELV环境合规系统（标准版）角色信息界面
 * 测试步骤->1. 点击新增按钮。
 * 测试预期->1. 页面跳转至角色关联详细信息填写页面。
 * 测试步骤->2. 完整填写信息，点击保存按钮。
 * 测试预期->2. 页面出现提示信息：成功新增角色
 * 测试步骤->3. 点击提示信息中的确定按钮。
 * 测试预期->3. 页面跳转至最初，包含新增角色信息。
 * 
 */

public class 验证角色信息新增功能是否可以实现_正常流_1081 extends Selenium_Test_Base {
	
	public 验证角色信息新增功能是否可以实现_正常流_1081(){
		super();
	}
	
	public 验证角色信息新增功能是否可以实现_正常流_1081(WebDriver driver){
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
		CommonOperations_角色信息_362 a = new CommonOperations_角色信息_362(driver);
		getElement(ElementEnum_角色信息_362.新增按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.新增页面权限中文名称输入框).sendKeys("2");
		getElement(ElementEnum_角色信息_362.新增页面权限英文名称输入框).sendKeys("2");
		getElement(ElementEnum_角色信息_362.新增页面角色类型选择按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.新增页面角色类型选择按钮审核员).click();
		getElement(ElementEnum_角色信息_362.数据管理第一项).click();
		getElement(ElementEnum_角色信息_362.新增页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("新建角色信息成功！");
	
	}

	
	public String getDescription(){
		return "测试用例id: 1081\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 角色信息(#362)\n"
				+" 用例名称: 验证角色信息新增功能是否可以实现-正常流\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）角色信息界面\n"
				+" 测试步骤->1. 点击新增按钮。\n"
				+" 测试预期->1. 页面跳转至角色关联详细信息填写页面。\n"
				+" 测试步骤->2. 完整填写信息，点击保存按钮。\n"
				+" 测试预期->2. 页面出现提示信息：成功新增角色\n"
				+" 测试步骤->3. 点击提示信息中的确定按钮。\n"
				+" 测试预期->3. 页面跳转至最初，包含新增角色信息。\n"
;
	}

}

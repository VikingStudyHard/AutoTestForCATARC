package cn.edu.tju.scs.seql.final_ELV.数据管理_325.MDS数据同步_332;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3333
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: MDS数据同步(#332)
 * 用例名称: 验证输入CAMDS账户，切换账户信息是否能够同步查询MDS-正常操作
 * 前置条件: 1.有CAMDS帐号，拥有MDS数据同步的菜单权限。
 *         2.能够正确进入MDS数据同步界面
 * 测试步骤->1. 点击切换用户查询
 * 测试预期->1. 跳出新页面，含有需要填写的各项CAMDS用户信息。
 * 测试步骤->2. 填写用户名：vvbt0008，密码为000000，企业部门ID：21343，点击提交。
 * 测试预期->2. 跳转回初始界面。出现提示信息：使用CAMDS账户“vybt0008"成功获取到26条数据。
 * 
 */

public class 验证输入CAMDS账户_切换账户信息是否能够同步查询MDS_正常操作_3333 extends Selenium_Test_Base {
	
	public 验证输入CAMDS账户_切换账户信息是否能够同步查询MDS_正常操作_3333(){
		super();
	}
	
	public 验证输入CAMDS账户_切换账户信息是否能够同步查询MDS_正常操作_3333(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_MDS数据同步_332.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_MDS数据同步_332.rightFrame);
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
		// 数据管理不需要选一级目录
//		WebDriverConfiguration.operationInterval();
//		getElement(ElementEnum_MDS数据同步_332.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_MDS数据同步_332.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_MDS数据同步_332 a = new CommonOperations_MDS数据同步_332(driver);
		getElement(ElementEnum_MDS数据同步_332.切换用户查询按钮).click();
		WebDriverConfiguration.operationInterval();
		
		String user = "bjtyj0007";
		String pwd = "000000000";
		String companyid = "CA_3_4537";
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口用户名输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口用户名输入框).sendKeys(user);
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口密码输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口密码输入框).sendKeys(pwd);
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口企业部门ID输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口企业部门ID输入框).sendKeys(companyid);
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口提交按钮).click();
		WebDriverConfiguration.operationInterval();
		a.waitLoading();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("成功获取到");
	}

	
	public String getDescription(){
		return "测试用例id: 3333\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: MDS数据同步(#332)\n"
				+" 用例名称: 验证输入CAMDS账户，切换账户信息是否能够同步查询MDS-正常操作\n"
				+" 前置条件: 1.有CAMDS帐号，拥有MDS数据同步的菜单权限。 2.能够正确进入MDS数据同步界面\n"
				+" 测试步骤->1. 点击切换用户查询\n"
				+" 测试预期->1. 跳出新页面，含有需要填写的各项CAMDS用户信息。\n"
				+" 测试步骤->2. 填写用户名：vvbt0008，密码为000000，企业部门ID：21343，点击提交。\n"
				+" 测试预期->2. 跳转回初始界面。出现提示信息：使用CAMDS账户“vybt0008“成功获取到26条数据。\n"
;
	}

}

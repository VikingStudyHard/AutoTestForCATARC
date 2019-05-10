package cn.edu.tju.scs.seql.final_ELV.消息管理_328.创建请求_350;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1053
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 创建请求(#350)
 * 用例名称: 消息管理-创建请求模块中各项日期选择测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-创建请求
 * 测试步骤->1. 点击截止日期后方日期选择图标
 * 测试预期->1. 显示日期选择的日期列表
 * 测试步骤->2. 点选某一日期
 * 测试预期->2. 日期选择框关闭， 截止日期后方文本框出现所选日期， 格式为XXXX-XX-XX
 * 测试步骤->3. 点击制图日期后方日期选择图标
 * 测试预期->3. 显示日期选择的日期列表
 * 测试步骤->4. 点选某一日期
 * 测试预期->4. 日期选择框关闭， 制图日期后方文本框出现所选日期， 格式为XXXX-XX-XX
 * 测试步骤->5. 点击报表日期后方日期选择图标
 * 测试预期->5. 显示日期选择的日期列表
 * 测试步骤->6. 点选某一日期
 * 测试预期->6. 日期选择框关闭， 报表日期后方文本框出现所选日期， 格式为XXXX-XX-XX
 * 
 */

public class 消息管理_创建请求模块中各项日期选择测试_1053 extends Selenium_Test_Base {
	
	public 消息管理_创建请求模块中各项日期选择测试_1053(){
		super();
	}
	
	public 消息管理_创建请求模块中各项日期选择测试_1053(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_创建请求_350.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_创建请求_350.rightFrame);
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
		getElement(ElementEnum_创建请求_350.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_创建请求_350.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_创建请求_350 a = new CommonOperations_创建请求_350(driver);
		getElement(ElementEnum_创建请求_350.截止日期按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_创建请求_350.日期选择框的第一个日期).click();
		WebDriverConfiguration.operationInterval();
		String date = getElement(ElementEnum_创建请求_350.截止日期输入框).getText();
		date = getElement(ElementEnum_创建请求_350.截止日期输入框).getAttribute("value");
		
		System.out.println(date);
		assertTrue(date.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}"));
		
		getElement(ElementEnum_创建请求_350.报表日期按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_创建请求_350.日期选择框的第一个日期).click();
		WebDriverConfiguration.operationInterval();
		date = getElement(ElementEnum_创建请求_350.报表日期输入框).getText();
		date = getElement(ElementEnum_创建请求_350.截止日期输入框).getAttribute("value");
		
		assertTrue(date.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}"));
		
		getElement(ElementEnum_创建请求_350.制图日期按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_创建请求_350.日期选择框的第一个日期).click();
		WebDriverConfiguration.operationInterval();
		date = getElement(ElementEnum_创建请求_350.制图日期输入框).getText();
		date = getElement(ElementEnum_创建请求_350.截止日期输入框).getAttribute("value");
		
		assertTrue(date.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}"));
		
		
	}
	
	public String getDescription(){
		return "测试用例id: 1053\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 创建请求(#350)\n"
				+" 用例名称: 消息管理-创建请求模块中各项日期选择测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-创建请求\n"
				+" 测试步骤->1. 点击截止日期后方日期选择图标\n"
				+" 测试预期->1. 显示日期选择的日期列表\n"
				+" 测试步骤->2. 点选某一日期\n"
				+" 测试预期->2. 日期选择框关闭， 截止日期后方文本框出现所选日期， 格式为XXXX-XX-XX\n"
				+" 测试步骤->3. 点击制图日期后方日期选择图标\n"
				+" 测试预期->3. 显示日期选择的日期列表\n"
				+" 测试步骤->4. 点选某一日期\n"
				+" 测试预期->4. 日期选择框关闭， 制图日期后方文本框出现所选日期， 格式为XXXX-XX-XX\n"
				+" 测试步骤->5. 点击报表日期后方日期选择图标\n"
				+" 测试预期->5. 显示日期选择的日期列表\n"
				+" 测试步骤->6. 点选某一日期\n"
				+" 测试预期->6. 日期选择框关闭， 报表日期后方文本框出现所选日期， 格式为XXXX-XX-XX\n"
;
	}

}

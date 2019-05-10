package cn.edu.tju.scs.seql.final_ELV.消息管理_328.查询请求_351;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2454
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 查询请求(#351)
 * 用例名称: 消息管理-查询请求模块中查询功能测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-查询请求
 * 测试步骤->1. 直接点击右下方查询按钮
 * 测试预期->1. 弹出提示框提示输入CAMDS账户
 * 测试步骤->2. 选择某一CAMDS账户，点击查询按钮
 * 测试预期->2. 弹出提示框提示输入截止日期
 * 测试步骤->3. 再选择截止日期（开始日期晚于结束日期），点击查询按钮
 * 测试预期->3. 弹出提示框提示开始日期不能晚于结束日期
 * 测试步骤->4. 再更改截止日期（开始日期早于结束日期），点击查询按钮
 * 测试预期->4. 弹出相关记录列表
 * 
 */

public class 消息管理_查询请求模块中查询功能测试_2454 extends Selenium_Test_Base {
	
	public 消息管理_查询请求模块中查询功能测试_2454(){
		super();
	}
	
	public 消息管理_查询请求模块中查询功能测试_2454(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_查询请求_351.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_查询请求_351.rightFrame);
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
		// TODO 该用例尚未实现，请检查
	/*
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_查询请求_351.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_查询请求_351.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	*/
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		/*
		assertEquals(driver.findElement(By.xpath("//td")).getText(), "企业名称:");
	    assertEquals(driver.findElement(By.xpath("//td[3]")).getText(), "企业ID:");
	    assertEquals(driver.findElement(By.xpath("//td[5]")).getText(), "计划员:");
	    assertEquals(driver.findElement(By.xpath("//td[7]")).getText(), "区域");
	    assertEquals(driver.findElement(By.xpath("//td[9]")).getText(), "新增信息来源");
	    assertEquals(driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td/div/input")).getText(), "");
		*/
	
	}

	
	public String getDescription(){
		return "测试用例id: 2454\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 查询请求(#351)\n"
				+" 用例名称: 消息管理-查询请求模块中查询功能测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-查询请求\n"
				+" 测试步骤->1. 直接点击右下方查询按钮\n"
				+" 测试预期->1. 弹出提示框提示输入CAMDS账户\n"
				+" 测试步骤->2. 选择某一CAMDS账户，点击查询按钮\n"
				+" 测试预期->2. 弹出提示框提示输入截止日期\n"
				+" 测试步骤->3. 再选择截止日期（开始日期晚于结束日期），点击查询按钮\n"
				+" 测试预期->3. 弹出提示框提示开始日期不能晚于结束日期\n"
				+" 测试步骤->4. 再更改截止日期（开始日期早于结束日期），点击查询按钮\n"
				+" 测试预期->4. 弹出相关记录列表\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.法规管理_329.最新法规_354;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4485
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 最新法规(#354)
 * 用例名称: 验证最新法规查看功能是否可实现
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击页面中的查看按钮
 * 测试预期->1. 页面出现提示信息：请选择一条记录
 * 测试步骤->2. 点击选择两条或两条以上的信息
 * 测试预期->2. 页面中的查看按钮消失，不可以同时查看两条及以上信息
 * 测试步骤->3. 点击选择一条信息，点击页面中的查看按钮
 * 测试预期->3. 跳转至新页面，页面为所选择查看最新法规信息的详细内容，且内容不可更改。
 * 
 */

public class 验证最新法规查看功能是否可实现_4485 extends Selenium_Test_Base {
	
	public 验证最新法规查看功能是否可实现_4485(){
		super();
	}
	
	public 验证最新法规查看功能是否可实现_4485(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_最新法规_354.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_最新法规_354.rightFrame);
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
		getElement(ElementEnum_最新法规_354.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_最新法规_354.二级目录名称).click();
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
		return "测试用例id: 4485\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 最新法规(#354)\n"
				+" 用例名称: 验证最新法规查看功能是否可实现\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击页面中的查看按钮\n"
				+" 测试预期->1. 页面出现提示信息：请选择一条记录\n"
				+" 测试步骤->2. 点击选择两条或两条以上的信息\n"
				+" 测试预期->2. 页面中的查看按钮消失，不可以同时查看两条及以上信息\n"
				+" 测试步骤->3. 点击选择一条信息，点击页面中的查看按钮\n"
				+" 测试预期->3. 跳转至新页面，页面为所选择查看最新法规信息的详细内容，且内容不可更改。\n"
;
	}

}

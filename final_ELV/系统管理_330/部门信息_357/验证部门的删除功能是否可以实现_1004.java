package cn.edu.tju.scs.seql.final_ELV.系统管理_330.部门信息_357;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1004
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 部门信息(#357)
 * 用例名称: 验证部门的删除功能是否可以实现
 * 前置条件: 1、能正确进入ELV环境合规系统（标准版）部门信息页面
 *         2、部门内用户为空
 * 测试步骤->1. 随机选择一个可删除的部门右键选择删除
 * 测试预期->1. 左侧树形功能菜单刷新，所选定部门消失。
 * 
 */

public class 验证部门的删除功能是否可以实现_1004 extends Selenium_Test_Base {
	
	public 验证部门的删除功能是否可以实现_1004(){
		super();
	}
	
	public 验证部门的删除功能是否可以实现_1004(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_部门信息_357.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_部门信息_357.rightFrame);
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
		// TODO 删除功能在添加功能的用例中一并测试
	/*
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_部门信息_357.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_部门信息_357.二级目录名称).click();
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
		return "测试用例id: 1004\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 部门信息(#357)\n"
				+" 用例名称: 验证部门的删除功能是否可以实现\n"
				+" 前置条件: 1、能正确进入ELV环境合规系统（标准版）部门信息页面 2、部门内用户为空\n"
				+" 测试步骤->1. 随机选择一个可删除的部门右键选择删除\n"
				+" 测试预期->1. 左侧树形功能菜单刷新，所选定部门消失。\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.系统管理_330.部门信息_357;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 997
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 部门信息(#357)
 * 用例名称: 验证部门信息中功能菜单的关闭树按键是否正常工作
 * 前置条件: 能正确进入ELV环境合规系统（标准版）部门信息页面，功能菜单树形展开。
 * 测试步骤->1. 点击功能菜单中的关闭树按钮
 * 测试预期->1. 功能菜单中展开的树形菜单随即关闭，页面其余地方正常显示。
 * 
 */

public class 验证部门信息中功能菜单的关闭树按键是否正常工作_997 extends Selenium_Test_Base {
	
	public 验证部门信息中功能菜单的关闭树按键是否正常工作_997(){
		super();
	}
	
	public 验证部门信息中功能菜单的关闭树按键是否正常工作_997(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		CommonFunction.waitingForLoading(getElement(ElementEnum_部门信息_357.body));
		int rowNumber = getElements(ElementEnum_部门信息_357.功能菜单所有行).size();
		getElement(ElementEnum_部门信息_357.打开树键).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(getElements(ElementEnum_部门信息_357.功能菜单所有行).size() != rowNumber);
		rowNumber = getElements(ElementEnum_部门信息_357.功能菜单所有行).size();
		getElement(ElementEnum_部门信息_357.关闭树键).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(getElements(ElementEnum_部门信息_357.功能菜单所有行).size() != rowNumber);
	}
	
	/**
	 * LeftFrame中的操作，主要是选择不同的功能
	 */
	public void operationInLeftFrame(){
		// TODO 该用例尚未实现，请检查
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
		return "测试用例id: 997\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 部门信息(#357)\n"
				+" 用例名称: 验证部门信息中功能菜单的关闭树按键是否正常工作\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）部门信息页面，功能菜单树形展开。\n"
				+" 测试步骤->1. 点击功能菜单中的关闭树按钮\n"
				+" 测试预期->1. 功能菜单中展开的树形菜单随即关闭，页面其余地方正常显示。\n"
;
	}

}

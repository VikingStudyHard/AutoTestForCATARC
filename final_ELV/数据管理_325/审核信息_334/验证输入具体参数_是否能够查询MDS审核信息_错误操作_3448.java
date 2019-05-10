package cn.edu.tju.scs.seql.final_ELV.数据管理_325.审核信息_334;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3448
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 审核信息(#334)
 * 用例名称: 验证输入具体参数，是否能够查询MDS审核信息-错误操作
 * 前置条件: 拥有MDS审核信息的权限
 * 测试步骤->1. 选择查询类型为全部，表单来源为全部，名称为三个空格，供货编号为空，ID为	 CA_5_13182570，点击查询按钮
 * 测试预期->1. 查询到一条审核信息，数据的ID为CA_5_13182570。
 * 测试步骤->2. 选择查询类型为全部，表单来源为全部，名称为三个空格，供货编号为三个空格，ID为CA_5_13182570，点击查询按钮
 * 测试预期->2. 查询到一条审核信息，数据的ID为CA_5_13182570。
 * 测试步骤->3. 选择查询类型为全部，表单来源为全部，名称为S，供货编号为三个空格，ID为三个空格，点击查询按钮
 * 测试预期->3. 查询到一条审核信息，数据的名称含有字段S。
 * 
 */

public class 验证输入具体参数_是否能够查询MDS审核信息_错误操作_3448 extends Selenium_Test_Base {
	
	public 验证输入具体参数_是否能够查询MDS审核信息_错误操作_3448(){
		super();
	}
	
	public 验证输入具体参数_是否能够查询MDS审核信息_错误操作_3448(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_审核信息_334.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_审核信息_334.rightFrame);
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
		//getElement(ElementEnum_审核信息_334.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_审核信息_334.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_审核信息_334.查询按钮).click();
		Assert.fail("该模块表单类型没有在检索表单里出现，无法进一步进行测试");
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
		return "测试用例id: 3448\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 审核信息(#334)\n"
				+" 用例名称: 验证输入具体参数，是否能够查询MDS审核信息-错误操作\n"
				+" 前置条件: 拥有MDS审核信息的权限\n"
				+" 测试步骤->1. 选择查询类型为全部，表单来源为全部，名称为三个空格，供货编号为空，ID为	 CA_5_13182570，点击查询按钮\n"
				+" 测试预期->1. 查询到一条审核信息，数据的ID为CA_5_13182570。\n"
				+" 测试步骤->2. 选择查询类型为全部，表单来源为全部，名称为三个空格，供货编号为三个空格，ID为CA_5_13182570，点击查询按钮\n"
				+" 测试预期->2. 查询到一条审核信息，数据的ID为CA_5_13182570。\n"
				+" 测试步骤->3. 选择查询类型为全部，表单来源为全部，名称为S，供货编号为三个空格，ID为三个空格，点击查询按钮\n"
				+" 测试预期->3. 查询到一条审核信息，数据的名称含有字段S。\n"
;
	}

}

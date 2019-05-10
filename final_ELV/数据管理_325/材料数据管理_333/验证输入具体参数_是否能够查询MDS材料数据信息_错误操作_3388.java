package cn.edu.tju.scs.seql.final_ELV.数据管理_325.材料数据管理_333;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3388
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 材料数据管理(#333)
 * 用例名称: 验证输入具体参数，是否能够查询MDS材料数据信息-错误操作
 * 前置条件: 拥有MDS材料数据信息的权限
 * 测试步骤->1. 选择查询类型为全部，表单来源为全部，名称为S空格A，供货编号为空，ID为空，点击查询按钮
 * 测试预期->1. 查询到数据名称含有字段S空格A的材料数据信息。
 * 测试步骤->2. 选择查询类型为全部，表单来源为全部，名称为空格+S，供货编号为空，ID为空，点击查询按钮
 * 测试预期->2. 查询到数据名称含有字段S的材料数据信息。
 * 测试步骤->3. 选择查询类型为全部，表单来源为全部，名称为三个空格，供货编号为空，ID为CA_8_7163600，点击查询按钮
 * 测试预期->3. 查询到一条材料数据信息，数据的ID为CA_8_7163600。
 * 测试步骤->4. 选择查询类型为全部，表单来源为全部，名称为三个空格，供货编号为三个空格，ID为CA_8_7163600，点击查询按钮
 * 测试预期->4. 查询到一条材料数据信息，数据的ID为CA_8_7163600。
 * 测试步骤->5. 选择查询类型为全部，表单来源为全部，名称为S，供货编号为三个空格，ID为三个空格，点击查询按钮
 * 测试预期->5. 查询到一条材料数据信息，数据的名称含有字段S。
 * 
 */

public class 验证输入具体参数_是否能够查询MDS材料数据信息_错误操作_3388 extends Selenium_Test_Base {
	
	public 验证输入具体参数_是否能够查询MDS材料数据信息_错误操作_3388(){
		super();
	}
	
	public 验证输入具体参数_是否能够查询MDS材料数据信息_错误操作_3388(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_材料数据管理_333.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_材料数据管理_333.rightFrame);
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
//		getElement(ElementEnum_材料数据管理_333.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_材料数据管理_333.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
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
		return "测试用例id: 3388\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 材料数据管理(#333)\n"
				+" 用例名称: 验证输入具体参数，是否能够查询MDS材料数据信息-错误操作\n"
				+" 前置条件: 拥有MDS材料数据信息的权限\n"
				+" 测试步骤->1. 选择查询类型为全部，表单来源为全部，名称为S空格A，供货编号为空，ID为空，点击查询按钮\n"
				+" 测试预期->1. 查询到数据名称含有字段S空格A的材料数据信息。\n"
				+" 测试步骤->2. 选择查询类型为全部，表单来源为全部，名称为空格+S，供货编号为空，ID为空，点击查询按钮\n"
				+" 测试预期->2. 查询到数据名称含有字段S的材料数据信息。\n"
				+" 测试步骤->3. 选择查询类型为全部，表单来源为全部，名称为三个空格，供货编号为空，ID为CA_8_7163600，点击查询按钮\n"
				+" 测试预期->3. 查询到一条材料数据信息，数据的ID为CA_8_7163600。\n"
				+" 测试步骤->4. 选择查询类型为全部，表单来源为全部，名称为三个空格，供货编号为三个空格，ID为CA_8_7163600，点击查询按钮\n"
				+" 测试预期->4. 查询到一条材料数据信息，数据的ID为CA_8_7163600。\n"
				+" 测试步骤->5. 选择查询类型为全部，表单来源为全部，名称为S，供货编号为三个空格，ID为三个空格，点击查询按钮\n"
				+" 测试预期->5. 查询到一条材料数据信息，数据的名称含有字段S。\n"
;
	}

}

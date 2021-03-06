package cn.edu.tju.scs.seql.final_ELV.车型管理_326.零部件BOM信息_339;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3693
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件BOM信息(#339)
 * 用例名称: 验证零部件BOM信息功能是否可实现-新增BOM-BOM树形打开关闭操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 单击左键选择一条信息，点击新增BOM按钮
 * 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。
 * 测试步骤->2. 点击树形右上角的更多操作按钮，点击出现的打开树按钮
 * 测试预期->2. BOM树型图被展开
 * 测试步骤->3. 点击树形右上角的更多操作按钮，点击出现的打开树按钮
 * 测试预期->3. BOM树型图被关闭
 * 
 */

public class 验证零部件BOM信息功能是否可实现_新增BOM_BOM树形打开关闭操作_3693 extends Selenium_Test_Base {
	
	public 验证零部件BOM信息功能是否可实现_新增BOM_BOM树形打开关闭操作_3693(){
		super();
	}
	
	public 验证零部件BOM信息功能是否可实现_新增BOM_BOM树形打开关闭操作_3693(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_零部件BOM信息_339.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_零部件BOM信息_339.rightFrame);
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
		//TODO 树的打开关闭已经在别的用例测过，而且新增BOM中的树只有根节点，无法打开
		
		//Assert.fail("树的打开关闭已经在别的用例测过，而且新增BOM中的树只有根节点，无法打开");
	/*
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件BOM信息_339.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件BOM信息_339.二级目录名称).click();
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
		return "测试用例id: 3693\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件BOM信息(#339)\n"
				+" 用例名称: 验证零部件BOM信息功能是否可实现-新增BOM-BOM树形打开关闭操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 单击左键选择一条信息，点击新增BOM按钮\n"
				+" 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。\n"
				+" 测试步骤->2. 点击树形右上角的更多操作按钮，点击出现的打开树按钮\n"
				+" 测试预期->2. BOM树型图被展开\n"
				+" 测试步骤->3. 点击树形右上角的更多操作按钮，点击出现的打开树按钮\n"
				+" 测试预期->3. BOM树型图被关闭\n"
;
	}

}

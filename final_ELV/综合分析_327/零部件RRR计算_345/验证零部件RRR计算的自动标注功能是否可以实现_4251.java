package cn.edu.tju.scs.seql.final_ELV.综合分析_327.零部件RRR计算_345;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4251
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件RRR计算(#345)
 * 用例名称: 验证零部件RRR计算的自动标注功能是否可以实现
 * 前置条件: 能正确进入综合分析模块
 * 测试步骤->1. 点击零部件RRR计算页面中的自动标注按钮
 * 测试预期->1. 页面出现提示信息：请选择一个MDS！
 * 测试步骤->2. 勾选两项或多项MDS信息，点击零部件RRR计算页面中的自动标注按钮
 * 测试预期->2. 页面出现提示信息：操作不包含已经标注锁定的表单，是否继续进行标注？
 * 测试步骤->3. 点击是按钮
 * 测试预期->3. 页面出现进度条：RRR自动标注中.. 进度条完成后出现提示信息：标注成功！
 * 测试步骤->4. 勾选一项MDS信息，点击零部件RRR计算页面中的自动标注按钮
 * 测试预期->4. 页面出现进度条：RRR自动标注中.. 进度条完成后出现提示信息：标注成功！
 * 
 */

public class 验证零部件RRR计算的自动标注功能是否可以实现_4251 extends Selenium_Test_Base {
	
	public 验证零部件RRR计算的自动标注功能是否可以实现_4251(){
		super();
	}
	
	public 验证零部件RRR计算的自动标注功能是否可以实现_4251(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_零部件RRR计算_345.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_零部件RRR计算_345.rightFrame);
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
		getElement(ElementEnum_零部件RRR计算_345.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		//未标注
		getElement(ElementEnum_零部件RRR计算_345.标注状态选择).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.标注状态选择标注未锁定).click();
		getElement(ElementEnum_零部件RRR计算_345.查询按钮).click();
		WebDriverConfiguration.operationInterval();
		//choose no message
		getElement(ElementEnum_零部件RRR计算_345.自动筛选).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(driver.getPageSource().contains("请选择一个MDS"));
		getElement(ElementEnum_零部件RRR计算_345.MSD信息异常信息提示确定按钮).click();
		//choose two message
		getElement(ElementEnum_零部件RRR计算_345.MSD信息选择按钮1).click();
		getElement(ElementEnum_零部件RRR计算_345.MSD信息选择按钮2).click();
		getElement(ElementEnum_零部件RRR计算_345.自动筛选).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(driver.getPageSource().contains("操作成功！"));
		//choose one message
		getElement(ElementEnum_零部件RRR计算_345.MSD信息选择按钮1).click();
		getElement(ElementEnum_零部件RRR计算_345.自动筛选).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(driver.getPageSource().contains("操作成功！"));
		
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
		return "测试用例id: 4251\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件RRR计算(#345)\n"
				+" 用例名称: 验证零部件RRR计算的自动标注功能是否可以实现\n"
				+" 前置条件: 能正确进入综合分析模块\n"
				+" 测试步骤->1. 点击零部件RRR计算页面中的自动标注按钮\n"
				+" 测试预期->1. 页面出现提示信息：请选择一个MDS！\n"
				+" 测试步骤->2. 勾选两项或多项MDS信息，点击零部件RRR计算页面中的自动标注按钮\n"
				+" 测试预期->2. 页面出现提示信息：操作不包含已经标注锁定的表单，是否继续进行标注？\n"
				+" 测试步骤->3. 点击是按钮\n"
				+" 测试预期->3. 页面出现进度条：RRR自动标注中.. 进度条完成后出现提示信息：标注成功！\n"
				+" 测试步骤->4. 勾选一项MDS信息，点击零部件RRR计算页面中的自动标注按钮\n"
				+" 测试预期->4. 页面出现进度条：RRR自动标注中.. 进度条完成后出现提示信息：标注成功！\n"
;
	}

}

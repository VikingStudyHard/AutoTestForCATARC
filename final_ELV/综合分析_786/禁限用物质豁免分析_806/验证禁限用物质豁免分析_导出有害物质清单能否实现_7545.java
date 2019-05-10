package cn.edu.tju.scs.seql.final_ELV.综合分析_786.禁限用物质豁免分析_806;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 7545
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 禁限用物质豁免分析(#806)
 * 用例名称: 验证禁限用物质豁免分析 导出有害物质清单能否实现
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 点击禁限用物质豁免分析，选择一条车型信息，点击确定
 * 测试预期->1. 出现新页面，左侧为车型BOM,右侧为基本信息
 * 测试步骤->2. 进行有害物质标注，点击导出有害物质清单
 * 测试预期->2. 出现正在下载提示，用迅雷实现下载，下载完成得到一个excel表格。
 * 
 */

public class 验证禁限用物质豁免分析_导出有害物质清单能否实现_7545 extends Selenium_Test_Base {
	
	public 验证禁限用物质豁免分析_导出有害物质清单能否实现_7545(){
		super();
	}
	
	public 验证禁限用物质豁免分析_导出有害物质清单能否实现_7545(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_禁限用物质豁免分析_806.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_禁限用物质豁免分析_806.rightFrame);
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
		getElement(ElementEnum_禁限用物质豁免分析_806.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_禁限用物质豁免分析_806.二级目录名称).click();
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
		return "测试用例id: 7545\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 禁限用物质豁免分析(#806)\n"
				+" 用例名称: 验证禁限用物质豁免分析 导出有害物质清单能否实现\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 点击禁限用物质豁免分析，选择一条车型信息，点击确定\n"
				+" 测试预期->1. 出现新页面，左侧为车型BOM,右侧为基本信息\n"
				+" 测试步骤->2. 进行有害物质标注，点击导出有害物质清单\n"
				+" 测试预期->2. 出现正在下载提示，用迅雷实现下载，下载完成得到一个excel表格。\n"
;
	}

}

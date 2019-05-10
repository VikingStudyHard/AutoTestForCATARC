package cn.edu.tju.scs.seql.final_ELV.综合分析_786.报告管理_802;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 7581
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 报告管理(#802)
 * 用例名称: 验证报告管理的报告下载功能能否实现————正常操作
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 进入综合分析模块，点击报告管理
 * 测试预期->1. 出现新页面，页面内容报告选择信息和报表信息
 * 测试步骤->2. 选择一条创建时间最近的记录，点击报告下载
 * 测试预期->2. 弹出下载界面（迅雷下载）
 * 测试步骤->3. 选择一条创建时间较为久远的记录（该记录的时间为2016-2-18），点击报告下载
 * 测试预期->3. 弹出下载界面（迅雷下载）
 * 
 */

public class 验证报告管理的报告下载功能能否实现____正常操作_7581 extends Selenium_Test_Base {
	
	public 验证报告管理的报告下载功能能否实现____正常操作_7581(){
		super();
	}
	
	public 验证报告管理的报告下载功能能否实现____正常操作_7581(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_报告管理_802.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_报告管理_802.rightFrame);
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
		getElement(ElementEnum_报告管理_802.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_报告管理_802.二级目录名称).click();
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
		return "测试用例id: 7581\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 报告管理(#802)\n"
				+" 用例名称: 验证报告管理的报告下载功能能否实现————正常操作\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 进入综合分析模块，点击报告管理\n"
				+" 测试预期->1. 出现新页面，页面内容报告选择信息和报表信息\n"
				+" 测试步骤->2. 选择一条创建时间最近的记录，点击报告下载\n"
				+" 测试预期->2. 弹出下载界面（迅雷下载）\n"
				+" 测试步骤->3. 选择一条创建时间较为久远的记录（该记录的时间为2016-2-18），点击报告下载\n"
				+" 测试预期->3. 弹出下载界面（迅雷下载）\n"
;
	}

}

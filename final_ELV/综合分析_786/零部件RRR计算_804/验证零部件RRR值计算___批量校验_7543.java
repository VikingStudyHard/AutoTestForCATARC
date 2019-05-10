package cn.edu.tju.scs.seql.final_ELV.综合分析_786.零部件RRR计算_804;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 7543
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件RRR计算(#804)
 * 用例名称: 验证零部件RRR值计算---批量校验
 * 前置条件: 1、能整车进入综合分析模块
 *         2、该零部件节点已经标注并且标注锁定
 * 测试步骤->1. 进入综合分析模块，点击零部件RRR值计算，选择一条已经标注且已被标注锁定的MDS信息，点击批量校验。
 * 测试预期->1. 页面出现 请选择没有进行标注锁定的节点进行批量校验操作！        ”       ”
 * 
 */

public class 验证零部件RRR值计算___批量校验_7543 extends Selenium_Test_Base {
	
	public 验证零部件RRR值计算___批量校验_7543(){
		super();
	}
	
	public 验证零部件RRR值计算___批量校验_7543(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_零部件RRR计算_804.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_零部件RRR计算_804.rightFrame);
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
		getElement(ElementEnum_零部件RRR计算_804.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_804.二级目录名称).click();
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
		return "测试用例id: 7543\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件RRR计算(#804)\n"
				+" 用例名称: 验证零部件RRR值计算---批量校验\n"
				+" 前置条件: 1、能整车进入综合分析模块 2、该零部件节点已经标注并且标注锁定\n"
				+" 测试步骤->1. 进入综合分析模块，点击零部件RRR值计算，选择一条已经标注且已被标注锁定的MDS信息，点击批量校验。\n"
				+" 测试预期->1. 页面出现 请选择没有进行标注锁定的节点进行批量校验操作！        ”       ”\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.综合分析_327.零部件RRR计算_345;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4214
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件RRR计算(#345)
 * 用例名称: 验证零部件RRR计算的查找功能是否可以实现-标注状态
 * 前置条件: 能正确进入综合分析模块
 * 测试步骤->1. 点击选择标注状态中的全部，点击查询按钮
 * 测试预期->1. 查询出所有标注状态的MDS信息
 * 测试步骤->2. 点击选择标注状态中的标注锁定，点击查询按钮
 * 测试预期->2. 查询出标注状态中为标注锁定的MDS信息
 * 测试步骤->3. 点击选择标注状态中的标注未锁定，点击查询按钮
 * 测试预期->3. 查询出标注状态中为标注未锁定的MDS信息
 * 
 */

public class 验证零部件RRR计算的查找功能是否可以实现_标注状态_4214 extends Selenium_Test_Base {
	
	public 验证零部件RRR计算的查找功能是否可以实现_标注状态_4214(){
		super();
	}
	
	public 验证零部件RRR计算的查找功能是否可以实现_标注状态_4214(WebDriver driver){
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
		getElement(ElementEnum_零部件RRR计算_345.标注状态选择).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.标注状态选择全部).click();
		getElement(ElementEnum_零部件RRR计算_345.查询按钮).click();
		WebDriverConfiguration.operationInterval();
		
		
		getElement(ElementEnum_零部件RRR计算_345.标注状态选择).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.标注状态选择标注锁定).click();
		getElement(ElementEnum_零部件RRR计算_345.查询按钮).click();
		WebDriverConfiguration.operationInterval();
		List<WebElement> eles = getElements(ElementEnum_零部件RRR计算_345.检索结果所有行);
		for(int i = 1;i < eles.size();i++){
			
		
			String chXpath = ElementEnum_零部件RRR计算_345.检索结果第一行标注.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String chName = driver.findElement(By.xpath(chXpath)).getText();
			assertTrue(chName.contains("标注锁定"),"查询结果不符合要求");
		}
		getElement(ElementEnum_零部件RRR计算_345.标注状态选择).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.标注状态选择标注未锁定).click();
		getElement(ElementEnum_零部件RRR计算_345.查询按钮).click();
		WebDriverConfiguration.operationInterval();
		List<WebElement> eles1 = getElements(ElementEnum_零部件RRR计算_345.检索结果所有行);
		for(int i = 1;i < eles1.size();i++){
			
		
			String chXpath = ElementEnum_零部件RRR计算_345.检索结果第一行标注.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String chName = driver.findElement(By.xpath(chXpath)).getText();
			assertTrue(chName.contains("标注未锁定"),"查询结果不符合要求");
		}
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
		return "测试用例id: 4214\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件RRR计算(#345)\n"
				+" 用例名称: 验证零部件RRR计算的查找功能是否可以实现-标注状态\n"
				+" 前置条件: 能正确进入综合分析模块\n"
				+" 测试步骤->1. 点击选择标注状态中的全部，点击查询按钮\n"
				+" 测试预期->1. 查询出所有标注状态的MDS信息\n"
				+" 测试步骤->2. 点击选择标注状态中的标注锁定，点击查询按钮\n"
				+" 测试预期->2. 查询出标注状态中为标注锁定的MDS信息\n"
				+" 测试步骤->3. 点击选择标注状态中的标注未锁定，点击查询按钮\n"
				+" 测试预期->3. 查询出标注状态中为标注未锁定的MDS信息\n"
;
	}

}

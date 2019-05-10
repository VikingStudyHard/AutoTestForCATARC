package cn.edu.tju.scs.seql.final_ELV.综合分析_327.零部件RRR计算_345;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4235
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件RRR计算(#345)
 * 用例名称: 验证零部件RRR计算中标注功能是否可以实现-回收利用率报告-ID检索
 * 前置条件: 能正确进入综合分析模块
 * 测试步骤->1. 在零部件RRR计算的查询条件：ID中填写CA，点击检索按钮
 * 测试预期->1. 无符合条件的信息被检索出来
 * 测试步骤->2. 在零部件RRR计算的查询条件：ID中填写CA_5_13182570 / 1.0，点击检索按钮
 * 测试预期->2. 无符合条件的信息被检索出来
 * 测试步骤->3. 在零部件RRR计算的查询条件：ID中填写CA_5_13182570，点击检索按钮
 * 测试预期->3. ID为CA_5_13182570的所有车型信息被检索出来
 * 
 */

public class 验证零部件RRR计算中标注功能是否可以实现_回收利用率报告_ID检索_4235 extends Selenium_Test_Base {
	
	public 验证零部件RRR计算中标注功能是否可以实现_回收利用率报告_ID检索_4235(){
		super();
	}
	
	public 验证零部件RRR计算中标注功能是否可以实现_回收利用率报告_ID检索_4235(WebDriver driver){
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
		Assert.fail("该用例操作与标题不正确，请检查");
	/*
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.二级目录名称).click();
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
		return "测试用例id: 4235\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件RRR计算(#345)\n"
				+" 用例名称: 验证零部件RRR计算中标注功能是否可以实现-回收利用率报告-ID检索\n"
				+" 前置条件: 能正确进入综合分析模块\n"
				+" 测试步骤->1. 在零部件RRR计算的查询条件：ID中填写CA，点击检索按钮\n"
				+" 测试预期->1. 无符合条件的信息被检索出来\n"
				+" 测试步骤->2. 在零部件RRR计算的查询条件：ID中填写CA_5_13182570 / 1.0，点击检索按钮\n"
				+" 测试预期->2. 无符合条件的信息被检索出来\n"
				+" 测试步骤->3. 在零部件RRR计算的查询条件：ID中填写CA_5_13182570，点击检索按钮\n"
				+" 测试预期->3. ID为CA_5_13182570的所有车型信息被检索出来\n"
;
	}

}

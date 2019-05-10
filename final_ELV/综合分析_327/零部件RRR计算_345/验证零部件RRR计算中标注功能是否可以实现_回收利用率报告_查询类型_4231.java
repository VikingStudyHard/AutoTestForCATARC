package cn.edu.tju.scs.seql.final_ELV.综合分析_327.零部件RRR计算_345;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4231
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件RRR计算(#345)
 * 用例名称: 验证零部件RRR计算中标注功能是否可以实现-回收利用率报告-查询类型
 * 前置条件: 能正确进入综合分析模块
 * 测试步骤->1. 点击选择查询类型中的全部，点击查询按钮
 * 测试预期->1. 查询出所有类型的MDS信息
 * 测试步骤->2. 点击选择查询类型中的零部件，点击查询按钮
 * 测试预期->2. 查询出所有零部件的MDS信息
 * 测试步骤->3. 点击选择查询类型中的半成品，点击查询按钮
 * 测试预期->3. 查询出所有半成品的MDS信息
 * 测试步骤->4. 点击选择查询类型中的材料，点击查询按钮
 * 测试预期->4. 查询出所有材料的MDS信息
 * 
 */

public class 验证零部件RRR计算中标注功能是否可以实现_回收利用率报告_查询类型_4231 extends Selenium_Test_Base {
	
	public 验证零部件RRR计算中标注功能是否可以实现_回收利用率报告_查询类型_4231(){
		super();
	}
	
	public 验证零部件RRR计算中标注功能是否可以实现_回收利用率报告_查询类型_4231(WebDriver driver){
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
		return "测试用例id: 4231\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件RRR计算(#345)\n"
				+" 用例名称: 验证零部件RRR计算中标注功能是否可以实现-回收利用率报告-查询类型\n"
				+" 前置条件: 能正确进入综合分析模块\n"
				+" 测试步骤->1. 点击选择查询类型中的全部，点击查询按钮\n"
				+" 测试预期->1. 查询出所有类型的MDS信息\n"
				+" 测试步骤->2. 点击选择查询类型中的零部件，点击查询按钮\n"
				+" 测试预期->2. 查询出所有零部件的MDS信息\n"
				+" 测试步骤->3. 点击选择查询类型中的半成品，点击查询按钮\n"
				+" 测试预期->3. 查询出所有半成品的MDS信息\n"
				+" 测试步骤->4. 点击选择查询类型中的材料，点击查询按钮\n"
				+" 测试预期->4. 查询出所有材料的MDS信息\n"
;
	}

}

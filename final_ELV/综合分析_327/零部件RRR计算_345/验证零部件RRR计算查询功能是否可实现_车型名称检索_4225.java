package cn.edu.tju.scs.seql.final_ELV.综合分析_327.零部件RRR计算_345;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4225
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件RRR计算(#345)
 * 用例名称: 验证零部件RRR计算查询功能是否可实现-车型名称检索 
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 点击查询条件车型信息旁的选择按钮
 * 测试预期->1. 出现新页面，页面为输入检索信息可检索车型信息的版面
 * 测试步骤->2. 在有害物质分析的查询条件：车型名称中填写1，点击检索按钮
 * 测试预期->2. 无符合条件的信息被检索出
 * 测试步骤->3. 在有害物质分析的查询条件：车型名称中填写ELVT，点击检索按钮
 * 测试预期->3. 无符合条件的信息被检索出
 * 测试步骤->4. 在有害物质分析的查询条件：车型名称中填写ELVTEST，点击检索按钮
 * 测试预期->4. 车型名称（中文或英文）名称中为ELVTEST的所有有害物质分析信息被检索出来
 * 
 */

public class 验证零部件RRR计算查询功能是否可实现_车型名称检索_4225 extends Selenium_Test_Base {
	
	public 验证零部件RRR计算查询功能是否可实现_车型名称检索_4225(){
		super();
	}
	
	public 验证零部件RRR计算查询功能是否可实现_车型名称检索_4225(WebDriver driver){
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
		Assert.fail("该用例不是该模块，请检查");
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
		return "测试用例id: 4225\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件RRR计算(#345)\n"
				+" 用例名称: 验证零部件RRR计算查询功能是否可实现-车型名称检索 \n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 点击查询条件车型信息旁的选择按钮\n"
				+" 测试预期->1. 出现新页面，页面为输入检索信息可检索车型信息的版面\n"
				+" 测试步骤->2. 在有害物质分析的查询条件：车型名称中填写1，点击检索按钮\n"
				+" 测试预期->2. 无符合条件的信息被检索出\n"
				+" 测试步骤->3. 在有害物质分析的查询条件：车型名称中填写ELVT，点击检索按钮\n"
				+" 测试预期->3. 无符合条件的信息被检索出\n"
				+" 测试步骤->4. 在有害物质分析的查询条件：车型名称中填写ELVTEST，点击检索按钮\n"
				+" 测试预期->4. 车型名称（中文或英文）名称中为ELVTEST的所有有害物质分析信息被检索出来\n"
;
	}

}

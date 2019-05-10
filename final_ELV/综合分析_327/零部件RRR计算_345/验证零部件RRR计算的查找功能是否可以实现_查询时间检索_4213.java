package cn.edu.tju.scs.seql.final_ELV.综合分析_327.零部件RRR计算_345;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4213
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件RRR计算(#345)
 * 用例名称: 验证零部件RRR计算的查找功能是否可以实现-查询时间检索
 * 前置条件: 能正确进入综合分析模块
 * 测试步骤->1. 选择查询时间类型为创建时间，不选择开始和结束时间，点击查询按钮
 * 测试预期->1. 出现错误信息：请输入开始时间！
 * 测试步骤->2. 选择查询时间类型为创建时间，选择开始时间为16年03月29日 14:49:33，不选择结束时间，点击查询按钮
 * 测试预期->2. 出现错误信息：请输入结束时间！
 * 测试步骤->3. 选择查询时间类型为创建时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮
 * 测试预期->3. 获得部分MDS信息。时间为所选时间区间。
 * 测试步骤->4. 选择查询时间类型为更新时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮
 * 测试预期->4. 获得部分MDS信息。时间为所选时间区间。
 * 测试步骤->5. 选择查询时间类型为发布时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮
 * 测试预期->5. 获得部分MDS信息。时间为所选时间区间。
 * 测试步骤->6. 选择查询时间类型为不限，开始时间和结束时间不能选择，点击查询按钮
 * 测试预期->6. 获得部分MDS信息。
 * 
 */

public class 验证零部件RRR计算的查找功能是否可以实现_查询时间检索_4213 extends Selenium_Test_Base {
	
	public 验证零部件RRR计算的查找功能是否可以实现_查询时间检索_4213(){
		super();
	}
	
	public 验证零部件RRR计算的查找功能是否可以实现_查询时间检索_4213(WebDriver driver){
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
		Assert.fail("该用例检索结果无法核实.请检查");
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
		return "测试用例id: 4213\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件RRR计算(#345)\n"
				+" 用例名称: 验证零部件RRR计算的查找功能是否可以实现-查询时间检索\n"
				+" 前置条件: 能正确进入综合分析模块\n"
				+" 测试步骤->1. 选择查询时间类型为创建时间，不选择开始和结束时间，点击查询按钮\n"
				+" 测试预期->1. 出现错误信息：请输入开始时间！\n"
				+" 测试步骤->2. 选择查询时间类型为创建时间，选择开始时间为16年03月29日 14:49:33，不选择结束时间，点击查询按钮\n"
				+" 测试预期->2. 出现错误信息：请输入结束时间！\n"
				+" 测试步骤->3. 选择查询时间类型为创建时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮\n"
				+" 测试预期->3. 获得部分MDS信息。时间为所选时间区间。\n"
				+" 测试步骤->4. 选择查询时间类型为更新时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮\n"
				+" 测试预期->4. 获得部分MDS信息。时间为所选时间区间。\n"
				+" 测试步骤->5. 选择查询时间类型为发布时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮\n"
				+" 测试预期->5. 获得部分MDS信息。时间为所选时间区间。\n"
				+" 测试步骤->6. 选择查询时间类型为不限，开始时间和结束时间不能选择，点击查询按钮\n"
				+" 测试预期->6. 获得部分MDS信息。\n"
;
	}

}

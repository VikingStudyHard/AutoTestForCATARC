package cn.edu.tju.scs.seql.final_ELV.综合分析_327.有害物质分析_342;

import static org.testng.Assert.assertEquals;

import java.util.List;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import org.testng.annotations.Test;

/**
 * 测试用例id: 4023
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 有害物质分析(#342)
 * 用例名称: 验证有害物质分析查询功能是否可实现-创建时间检索
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 在有害物质分析的查询条件：创建时间从2016-03-08开始，点击检索按钮
 * 测试预期->1. 检索出创建时间为2016-03-08之后的所有有害物质分析信息。
 * 测试步骤->2. 在有害物质分析的查询条件：创建时间2016-04-08结束，点击检索按钮
 * 测试预期->2. 检索出创建时间为2016-04-08之前的所有有害物质分析信息。
 * 测试步骤->3. 在有害物质分析的查询条件：创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮
 * 测试预期->3. 检索出创建时间为2016-03-08到2016-04-11的所有有害物质分析信息。
 * 测试步骤->4. 在有害物质分析的查询条件：创建时间从2016-04-08开始，到2016-03-11结束，点击检索按钮
 * 测试预期->4. 出现错误提示：开始时间早于结束时间!
 * 
 */

public class 验证有害物质分析查询功能是否可实现_创建时间检索_4023 extends Selenium_Test_Base {
	
	public 验证有害物质分析查询功能是否可实现_创建时间检索_4023(){
		super();
	}
	
	public 验证有害物质分析查询功能是否可实现_创建时间检索_4023(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_有害物质分析_342.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_有害物质分析_342.rightFrame);
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
		getElement(ElementEnum_有害物质分析_342.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_有害物质分析_342.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		testQueryTime("2016-03-08", "");
		testQueryTime("", "2016-04-08");
		testQueryTime("2016-03-08", "2016-04-11");
		testQueryTime("2016-04-11", "2016-03-08");
		
	}
	
	public void testQueryTime(String startTime, String endTime){
		CommonOperations_有害物质分析_342 a = new CommonOperations_有害物质分析_342(driver);
		a.testQueryByTime(startTime, endTime, 
						ElementEnum_有害物质分析_342.创建时间起点输入框, 
						ElementEnum_有害物质分析_342.创建时间终点输入框, 
						ElementEnum_有害物质分析_342.检索按钮, 
						ElementEnum_有害物质分析_342.检索结果所有行, 
						ElementEnum_有害物质分析_342.检索结果第一行生产年份, 
						ElementEnum_有害物质分析_342.开始时间早于结束时间错误信息, 
						new ICallback() {
							@Override
							public void callback() {
								
							}
						});
		
	}
	
	public String getDescription(){
		return "测试用例id: 4023\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 有害物质分析(#342)\n"
				+" 用例名称: 验证有害物质分析查询功能是否可实现-创建时间检索\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 在有害物质分析的查询条件：创建时间从2016-03-08开始，点击检索按钮\n"
				+" 测试预期->1. 检索出创建时间为2016-03-08之后的所有有害物质分析信息。\n"
				+" 测试步骤->2. 在有害物质分析的查询条件：创建时间2016-04-08结束，点击检索按钮\n"
				+" 测试预期->2. 检索出创建时间为2016-04-08之前的所有有害物质分析信息。\n"
				+" 测试步骤->3. 在有害物质分析的查询条件：创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮\n"
				+" 测试预期->3. 检索出创建时间为2016-03-08到2016-04-11的所有有害物质分析信息。\n"
				+" 测试步骤->4. 在有害物质分析的查询条件：创建时间从2016-04-08开始，到2016-03-11结束，点击检索按钮\n"
				+" 测试预期->4. 出现错误提示：开始时间早于结束时间!\n"
;
	}


}

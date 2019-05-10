package cn.edu.tju.scs.seql.final_ELV.法规管理_329.行业动态_355;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4463
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 行业动态(#355)
 * 用例名称: 验证行业动态查询功能是否可实现-时间检索
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 在行业动态的查询条件：时间从2016-03-08开始，点击检索按钮
 * 测试预期->1. 检索出时间为2016-03-08之后的所有行业动态信息。
 * 测试步骤->2. 在行业动态的查询条件：时间2016-04-08结束，点击检索按钮
 * 测试预期->2. 检索出时间为2016-04-08之前的所有行业动态信息。
 * 测试步骤->3. 在行业动态的查询条件：时间从2016-03-08开始，到2016-04-11结束，点击检索按钮
 * 测试预期->3. 检索出时间为2016-03-08到2016-04-11的所有行业动态信息。
 * 测试步骤->4. 在行业动态的查询条件：时间从2016-04-08开始，到2016-03-11结束，点击检索按钮
 * 测试预期->4. 出现错误提示：开始时间早于结束时间!
 * 
 */

public class 验证行业动态查询功能是否可实现_时间检索_4463 extends Selenium_Test_Base {
	
	public 验证行业动态查询功能是否可实现_时间检索_4463(){
		super();
	}
	
	public 验证行业动态查询功能是否可实现_时间检索_4463(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_行业动态_355.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_行业动态_355.rightFrame);
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
		getElement(ElementEnum_行业动态_355.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_行业动态_355.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		testByTime("2016-03-08", "");
		testByTime("","2016-04-08");
		testByTime("2016-03-08","2016-04-11");
		testByTime("2016-04-08","2016-03-11");
	}
	
	public void testByTime(String startTime, String endTime){
		CommonOperations_行业动态_355 a = new CommonOperations_行业动态_355(driver);
		a.testQueryByTime(startTime, endTime, 
						ElementEnum_行业动态_355.开始时间输入框, 
						ElementEnum_行业动态_355.结束时间输入框, 
						ElementEnum_行业动态_355.检索按钮, 
						ElementEnum_行业动态_355.检索结果所有行, 
						ElementEnum_行业动态_355.检索结果第一行时间, 
						ElementEnum_行业动态_355.第一页提示信息, 
						new ICallback() {
							@Override
							public void callback() {
								
							}
						});
	}

	
	public String getDescription(){
		return "测试用例id: 4463\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 行业动态(#355)\n"
				+" 用例名称: 验证行业动态查询功能是否可实现-时间检索\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 在行业动态的查询条件：时间从2016-03-08开始，点击检索按钮\n"
				+" 测试预期->1. 检索出时间为2016-03-08之后的所有行业动态信息。\n"
				+" 测试步骤->2. 在行业动态的查询条件：时间2016-04-08结束，点击检索按钮\n"
				+" 测试预期->2. 检索出时间为2016-04-08之前的所有行业动态信息。\n"
				+" 测试步骤->3. 在行业动态的查询条件：时间从2016-03-08开始，到2016-04-11结束，点击检索按钮\n"
				+" 测试预期->3. 检索出时间为2016-03-08到2016-04-11的所有行业动态信息。\n"
				+" 测试步骤->4. 在行业动态的查询条件：时间从2016-04-08开始，到2016-03-11结束，点击检索按钮\n"
				+" 测试预期->4. 出现错误提示：开始时间早于结束时间!\n"
;
	}

}

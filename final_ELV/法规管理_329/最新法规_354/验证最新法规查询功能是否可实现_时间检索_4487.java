package cn.edu.tju.scs.seql.final_ELV.法规管理_329.最新法规_354;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4487
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 最新法规(#354)
 * 用例名称: 验证最新法规查询功能是否可实现-时间检索
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 在最新法规的查询条件：时间从2016-03-08开始，点击检索按钮
 * 测试预期->1. 检索出时间为2016-03-08之后的所有最新法规信息。
 * 测试步骤->2. 在最新法规的查询条件：时间2016-04-08结束，点击检索按钮
 * 测试预期->2. 检索出时间为2016-04-08之前的所有最新法规信息。
 * 测试步骤->3. 在最新法规的查询条件：时间从2016-03-08开始，到2016-04-11结束，点击检索按钮
 * 测试预期->3. 检索出时间为2016-03-08到2016-04-11的所有最新法规信息。
 * 测试步骤->4. 在最新法规的查询条件：时间从2016-04-08开始，到2016-03-11结束，点击检索按钮
 * 测试预期->4. 出现错误提示：开始时间早于结束时间!
 * 
 */

public class 验证最新法规查询功能是否可实现_时间检索_4487 extends Selenium_Test_Base {
	
	public 验证最新法规查询功能是否可实现_时间检索_4487(){
		super();
	}
	
	public 验证最新法规查询功能是否可实现_时间检索_4487(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_最新法规_354.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_最新法规_354.rightFrame);
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
		getElement(ElementEnum_最新法规_354.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_最新法规_354.二级目录名称).click();
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
		CommonOperations_最新法规_354 a = new CommonOperations_最新法规_354(driver);
		getElement(ElementEnum_最新法规_354.开始时间输入框).clear();
		getElement(ElementEnum_最新法规_354.开始时间输入框).sendKeys(startTime);
		getElement(ElementEnum_最新法规_354.结束时间输入框).clear();
		getElement(ElementEnum_最新法规_354.结束时间输入框).sendKeys(endTime);
		getElement(ElementEnum_最新法规_354.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		WebElement tip = null;
		tip = getElement(ElementEnum_最新法规_354.第一页提示信息);
		if(tip != null && tip.isDisplayed()){
			a.verifyTips("您查找的数据不存在");
		}else{
			a.verifyResultTimeSatisfy(startTime, endTime, 
						ElementEnum_最新法规_354.检索结果所有行, 
						ElementEnum_最新法规_354.检索结果第一行时间, 
						ElementEnum_最新法规_354.第一页提示信息);
		}
	}

	
	public String getDescription(){
		return "测试用例id: 4487\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 最新法规(#354)\n"
				+" 用例名称: 验证最新法规查询功能是否可实现-时间检索\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 在最新法规的查询条件：时间从2016-03-08开始，点击检索按钮\n"
				+" 测试预期->1. 检索出时间为2016-03-08之后的所有最新法规信息。\n"
				+" 测试步骤->2. 在最新法规的查询条件：时间2016-04-08结束，点击检索按钮\n"
				+" 测试预期->2. 检索出时间为2016-04-08之前的所有最新法规信息。\n"
				+" 测试步骤->3. 在最新法规的查询条件：时间从2016-03-08开始，到2016-04-11结束，点击检索按钮\n"
				+" 测试预期->3. 检索出时间为2016-03-08到2016-04-11的所有最新法规信息。\n"
				+" 测试步骤->4. 在最新法规的查询条件：时间从2016-04-08开始，到2016-03-11结束，点击检索按钮\n"
				+" 测试预期->4. 出现错误提示：开始时间早于结束时间!\n"
;
	}

}

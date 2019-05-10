package cn.edu.tju.scs.seql.final_ELV.法规管理_329.公告信息_353;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.法规管理_329.最新法规_354.CommonOperations_最新法规_354;
import cn.edu.tju.scs.seql.final_ELV.法规管理_329.最新法规_354.ElementEnum_最新法规_354;
import cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352.CommonOperations_标准信息_352;
import cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352.ElementEnum_标准信息_352;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.进展报表统计_344.ElementEnum_进展报表统计_344;

/**
 * 测试用例id: 4515
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 公告信息(#353)
 * 用例名称: 验证公告信息查询功能是否可实现-时间检索
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 在公告信息的查询条件：时间从2016-03-08开始，点击检索按钮
 * 测试预期->1. 检索出时间为2016-03-08之后的所有公告信息信息。
 * 测试步骤->2. 在公告信息的查询条件：时间2016-04-08结束，点击检索按钮
 * 测试预期->2. 检索出时间为2016-04-08之前的所有公告信息信息。
 * 测试步骤->3. 在公告信息的查询条件：时间从2016-03-08开始，到2016-04-11结束，点击检索按钮
 * 测试预期->3. 检索出时间为2016-03-08到2016-04-11的所有公告信息信息。
 * 测试步骤->4. 在公告信息的查询条件：时间从2016-04-08开始，到2016-03-11结束，点击检索按钮
 * 测试预期->4. 出现错误提示：开始时间早于结束时间!
 * 
 */

public class 验证公告信息查询功能是否可实现_时间检索_4515 extends Selenium_Test_Base {
	
	public 验证公告信息查询功能是否可实现_时间检索_4515(){
		super();
	}
	
	public 验证公告信息查询功能是否可实现_时间检索_4515(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_公告信息_353.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_公告信息_353.rightFrame);
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
		getElement(ElementEnum_公告信息_353.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_公告信息_353.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		testQueryByTime("2016-03-08","");
		testQueryByTime("","2016-04-08");
		testQueryByTime("2016-03-08","2016-04-11");
		testQueryByTime("2016-04-08","2016-03-11");
	}

	
	private void testQueryByTime(String startTime, String endTime) {

//		CommonOperations_公告信息_353 a = new CommonOperations_公告信息_353(driver);
//		getElement(ElementEnum_公告信息_353.起始时间输入框);
//		getElement(ElementEnum_公告信息_353.终止时间输入框);
//		a.testQueryByTime(startTime, endTime,
//						ElementEnum_公告信息_353.起始时间输入框, 
//						ElementEnum_公告信息_353.终止时间输入框, 
//						ElementEnum_公告信息_353.检索按钮, 
//						ElementEnum_公告信息_353.检索结果所有行, 
//						ElementEnum_公告信息_353.检索结果第一行创建时间, 
//						ElementEnum_公告信息_353.第一页提示信息, 
//						new ICallback() {
//							
//							public void callback() {
//								
//							}
//						});
		CommonOperations_公告信息_353 a = new CommonOperations_公告信息_353(driver);
		getElement(ElementEnum_公告信息_353.起始时间输入框).clear();
		getElement(ElementEnum_公告信息_353.起始时间输入框).sendKeys(startTime);
		getElement(ElementEnum_公告信息_353.终止时间输入框).clear();
		getElement(ElementEnum_公告信息_353.终止时间输入框).sendKeys(endTime);
		getElement(ElementEnum_公告信息_353.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		WebElement tip = null;
		tip = getElement(ElementEnum_公告信息_353.第一页提示信息);
		if(tip != null && tip.isDisplayed() && tip.getText().contains("您查找的数据不存在")){
			a.verifyTips("您查找的数据不存在");
		}else{
			a.verifyResultTimeSatisfy(startTime, endTime, 
					ElementEnum_公告信息_353.检索结果所有行, 
					ElementEnum_公告信息_353.检索结果第一行时间, 
					ElementEnum_公告信息_353.第一页提示信息);
		}
	}
	

	public String getDescription(){
		return "测试用例id: 4515\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 公告信息(#353)\n"
				+" 用例名称: 验证公告信息查询功能是否可实现-时间检索\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 在公告信息的查询条件：时间从2016-03-08开始，点击检索按钮\n"
				+" 测试预期->1. 检索出时间为2016-03-08之后的所有公告信息信息。\n"
				+" 测试步骤->2. 在公告信息的查询条件：时间2016-04-08结束，点击检索按钮\n"
				+" 测试预期->2. 检索出时间为2016-04-08之前的所有公告信息信息。\n"
				+" 测试步骤->3. 在公告信息的查询条件：时间从2016-03-08开始，到2016-04-11结束，点击检索按钮\n"
				+" 测试预期->3. 检索出时间为2016-03-08到2016-04-11的所有公告信息信息。\n"
				+" 测试步骤->4. 在公告信息的查询条件：时间从2016-04-08开始，到2016-03-11结束，点击检索按钮\n"
				+" 测试预期->4. 出现错误提示：开始时间早于结束时间!\n"
;
	}

}

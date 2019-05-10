package cn.edu.tju.scs.seql.final_ELV.法规管理_329.行业动态_355;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4462
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 行业动态(#355)
 * 用例名称: 验证行业动态查询功能是否可实现-综合检索
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击检索按钮
 * 测试预期->1. 页面出现提示信息：请至少输入一项检索条件！
 * 测试步骤->2. 在行业动态的查询条件：标题中填写sd，开始时间从2016-03-08开始，点击检索按钮
 * 测试预期->2. 检索出标题中含有sd字段的，且时间为2016-03-08之后的所有行业动态信息。
 * 测试步骤->3. 在行业动态的查询条件：标题中填写sd，时间从2016-03-08开始，到2016-04-08结束，点击检索按钮
 * 测试预期->3. 检索出标题中含有sd字段的，且时间为2016-03-08到2016-04-08结束的所有行业动态信息。
 * 测试步骤->4. 在行业动态的查询条件：标题中填写sd，时间从2016-04-08开始，到2016-03-11结束，点击检索按钮
 * 测试预期->4. 页面出现提示信息：查询的开始时间不能大于截止时间
 * 
 */

public class 验证行业动态查询功能是否可实现_综合检索_4462 extends Selenium_Test_Base {
	
	public 验证行业动态查询功能是否可实现_综合检索_4462(){
		super();
	}
	
	public 验证行业动态查询功能是否可实现_综合检索_4462(WebDriver driver){
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
		CommonOperations_行业动态_355 a = new CommonOperations_行业动态_355(driver);
		getElement(ElementEnum_行业动态_355.开始时间输入框);
		getElement(ElementEnum_行业动态_355.结束时间输入框);
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_行业动态_355.开始时间输入框.getName()+"\");setDate.removeAttribute('readonly');");
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_行业动态_355.结束时间输入框.getName()+"\");setDate.removeAttribute('readonly');");
		
		getElement(ElementEnum_行业动态_355.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请至少输入一项检索条件");
		
		combineSearch("sd", "2016-03-08", "");
		combineSearch("sd","2016-03-08","2016-04-08");
		combineSearch("sd", "2016-04-08", "2016-03-11");
		
		
		
		
		
	}
	
	public void combineSearch(String title, String startTime, String endTime){
		CommonOperations_行业动态_355 a = new CommonOperations_行业动态_355(driver);
		getElement(ElementEnum_行业动态_355.标题输入框).clear();
		getElement(ElementEnum_行业动态_355.标题输入框).sendKeys(title);
		getElement(ElementEnum_行业动态_355.开始时间输入框).clear();
		getElement(ElementEnum_行业动态_355.开始时间输入框).sendKeys(startTime);
		getElement(ElementEnum_行业动态_355.结束时间输入框).clear();
		getElement(ElementEnum_行业动态_355.结束时间输入框).sendKeys(endTime);
		getElement(ElementEnum_行业动态_355.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.verifyResultTimeSatisfy(startTime, endTime, 
				ElementEnum_行业动态_355.检索结果所有行, 
				ElementEnum_行业动态_355.检索结果第一行时间, 
				ElementEnum_行业动态_355.第一页提示信息);
		a.verifyAllSearchResult(title, ElementEnum_行业动态_355.检索结果所有行,
				ElementEnum_行业动态_355.检索结果第一行标题, 
				ElementEnum_行业动态_355.检索结果第一行标题);
		
	}

	
	public String getDescription(){
		return "测试用例id: 4462\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 行业动态(#355)\n"
				+" 用例名称: 验证行业动态查询功能是否可实现-综合检索\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击检索按钮\n"
				+" 测试预期->1. 页面出现提示信息：请至少输入一项检索条件！\n"
				+" 测试步骤->2. 在行业动态的查询条件：标题中填写sd，开始时间从2016-03-08开始，点击检索按钮\n"
				+" 测试预期->2. 检索出标题中含有sd字段的，且时间为2016-03-08之后的所有行业动态信息。\n"
				+" 测试步骤->3. 在行业动态的查询条件：标题中填写sd，时间从2016-03-08开始，到2016-04-08结束，点击检索按钮\n"
				+" 测试预期->3. 检索出标题中含有sd字段的，且时间为2016-03-08到2016-04-08结束的所有行业动态信息。\n"
				+" 测试步骤->4. 在行业动态的查询条件：标题中填写sd，时间从2016-04-08开始，到2016-03-11结束，点击检索按钮\n"
				+" 测试预期->4. 页面出现提示信息：查询的开始时间不能大于截止时间\n"
;
	}

}

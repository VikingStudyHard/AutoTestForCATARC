package cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4528
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 标准信息(#352)
 * 用例名称: 验证标准信息查询功能是否可实现-综合检索
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击检索按钮
 * 测试预期->1. 页面出现提示信息：请至少输入一项检索条件！
 * 测试步骤->2. 在标准信息的查询条件：法规名称中填写test，开始时间从2016-03-08开始，点击检索按钮
 * 测试预期->2. 检索出法规名称中含有test字段的，且时间为2016-03-08之后的所有标准信息。
 * 测试步骤->3. 在标准信息的查询条件：法规名称中填写test，选择法规类型为国家标准，创建人为admin，时间从2016-03-08开始，到2016-04-08结束，点击检索按钮
 * 测试预期->3. 检索出法规名称中含有test字段，选择法规类型为国家标准，创建人为admin，且时间为2016-03-08到2016-04-08结束的所有标准信息。
 * 测试步骤->4. 在标准信息的查询条件：法规名称中填写test，选择法规类型为国家标准，创建人为admin，时间从2016-04-08开始，到2016-03-11结束，点击检索按钮
 * 测试预期->4. 页面出现提示信息：查询的开始时间不能大于截止时间
 * 
 */

public class 验证标准信息查询功能是否可实现_综合检索_4528 extends Selenium_Test_Base {
	
	public 验证标准信息查询功能是否可实现_综合检索_4528(){
		super();
	}
	
	public 验证标准信息查询功能是否可实现_综合检索_4528(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_标准信息_352.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_标准信息_352.rightFrame);
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
		getElement(ElementEnum_标准信息_352.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_标准信息_352 a = new CommonOperations_标准信息_352(driver);
		
		getElement(ElementEnum_标准信息_352.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTipsAndThenOperateButton("请至少输入一项检索条件", ElementEnum_标准信息_352.第一页提示信息, ElementEnum_标准信息_352.第一页提示框确认按钮);
		
		getElement(ElementEnum_标准信息_352.法规名称输入框).clear();
		getElement(ElementEnum_标准信息_352.法规名称输入框).sendKeys("test");
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_标准信息_352.起始时间输入框.getName()+"\");setDate.removeAttribute('readonly');");
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_标准信息_352.终止时间输入框.getName()+"\");setDate.removeAttribute('readonly');");
		getElement(ElementEnum_标准信息_352.起始时间输入框).clear();
		getElement(ElementEnum_标准信息_352.起始时间输入框).sendKeys("2016-03-08");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadFirst();
		
		a.verifyAllSearchResult("test", 
					ElementEnum_标准信息_352.检索结果所有行, 
					ElementEnum_标准信息_352.检索结果第一行法规名称, 
					ElementEnum_标准信息_352.检索结果第一行法规名称);
		a.verifyResultTimeSatisfy("2016-03-08", "", 
					ElementEnum_标准信息_352.检索结果所有行, 
					ElementEnum_标准信息_352.检索结果第一行创建时间, 
					ElementEnum_标准信息_352.第一页提示信息);
		
		getElement(ElementEnum_标准信息_352.法规名称输入框).clear();
		getElement(ElementEnum_标准信息_352.法规名称输入框).sendKeys("test");
		getElement(ElementEnum_标准信息_352.创建人输入框).clear();
		getElement(ElementEnum_标准信息_352.创建人输入框).sendKeys("admin");
		getElement(ElementEnum_标准信息_352.法规类型下拉按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.法规类型下拉选项_国家标准).click();
		WebDriverConfiguration.operationInterval();
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_标准信息_352.起始时间输入框.getName()+"\");setDate.removeAttribute('readonly');");
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_标准信息_352.终止时间输入框.getName()+"\");setDate.removeAttribute('readonly');");
		getElement(ElementEnum_标准信息_352.起始时间输入框).clear();
		getElement(ElementEnum_标准信息_352.起始时间输入框).sendKeys("2016-03-08");
		getElement(ElementEnum_标准信息_352.终止时间输入框).clear();
		getElement(ElementEnum_标准信息_352.终止时间输入框).sendKeys("2016-04-08");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadFirst();
		
		a.verifyAllSearchResult("test", 
				ElementEnum_标准信息_352.检索结果所有行, 
				ElementEnum_标准信息_352.检索结果第一行法规名称, 
				ElementEnum_标准信息_352.检索结果第一行法规名称);
		a.verifyAllSearchResult("admin", 
				ElementEnum_标准信息_352.检索结果所有行, 
				ElementEnum_标准信息_352.检索结果第一行创建人, 
				ElementEnum_标准信息_352.检索结果第一行创建人);
		a.verifyAllSearchResult("国家标准", 
				ElementEnum_标准信息_352.检索结果所有行, 
				ElementEnum_标准信息_352.检索结果第一行法规类型, 
				ElementEnum_标准信息_352.检索结果第一行法规类型);
		a.verifyResultTimeSatisfy("2016-03-08", "2016-04-08", 
				ElementEnum_标准信息_352.检索结果所有行, 
				ElementEnum_标准信息_352.检索结果第一行创建时间, 
				ElementEnum_标准信息_352.第一页提示信息);
		
		
		getElement(ElementEnum_标准信息_352.法规名称输入框).clear();
		getElement(ElementEnum_标准信息_352.法规名称输入框).sendKeys("test");
		getElement(ElementEnum_标准信息_352.创建人输入框).clear();
		getElement(ElementEnum_标准信息_352.创建人输入框).sendKeys("admin");
		getElement(ElementEnum_标准信息_352.法规类型下拉按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.法规类型下拉选项_国家标准).click();
		WebDriverConfiguration.operationInterval();
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_标准信息_352.起始时间输入框.getName()+"\");setDate.removeAttribute('readonly');");
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_标准信息_352.终止时间输入框.getName()+"\");setDate.removeAttribute('readonly');");
		getElement(ElementEnum_标准信息_352.起始时间输入框).clear();
		getElement(ElementEnum_标准信息_352.起始时间输入框).sendKeys("2016-04-08");
		getElement(ElementEnum_标准信息_352.终止时间输入框).clear();
		getElement(ElementEnum_标准信息_352.终止时间输入框).sendKeys("2016-03-11");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadFirst();
		
		assertTrue(getElement(ElementEnum_标准信息_352.第一页提示信息).getText().contains("查询的开始时间不能大于截止时间"));
	}

	
	public String getDescription(){
		return "测试用例id: 4528\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 标准信息(#352)\n"
				+" 用例名称: 验证标准信息查询功能是否可实现-综合检索\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击检索按钮\n"
				+" 测试预期->1. 页面出现提示信息：请至少输入一项检索条件！\n"
				+" 测试步骤->2. 在标准信息的查询条件：法规名称中填写test，开始时间从2016-03-08开始，点击检索按钮\n"
				+" 测试预期->2. 检索出法规名称中含有test字段的，且时间为2016-03-08之后的所有标准信息。\n"
				+" 测试步骤->3. 在标准信息的查询条件：法规名称中填写test，选择法规类型为国家标准，创建人为admin，时间从2016-03-08开始，到2016-04-08结束，点击检索按钮\n"
				+" 测试预期->3. 检索出法规名称中含有test字段，选择法规类型为国家标准，创建人为admin，且时间为2016-03-08到2016-04-08结束的所有标准信息。\n"
				+" 测试步骤->4. 在标准信息的查询条件：法规名称中填写test，选择法规类型为国家标准，创建人为admin，时间从2016-04-08开始，到2016-03-11结束，点击检索按钮\n"
				+" 测试预期->4. 页面出现提示信息：查询的开始时间不能大于截止时间\n"
;
	}

}

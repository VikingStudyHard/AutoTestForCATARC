package cn.edu.tju.scs.seql.final_ELV.法规管理_329.高危清单_356;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352.ElementEnum_标准信息_352;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4446
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 高危清单(#356)
 * 用例名称: 验证高危清单查询功能是否可实现-综合检索
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击检索按钮
 * 测试预期->1. 页面出现提示信息：请至少输入一项检索条件！
 * 测试步骤->2. 在高危清单的查询条件：品牌名称中填写test，时间从2016-03-08开始，点击检索按钮
 * 测试预期->2. 检索出品牌（中文或英文）中含有test字段的，且时间为2016-03-08之后的所有高危清单信息。
 * 测试步骤->3. 在高危清单的查询条件：品牌名称中填写test，车型名称中填写ELV，时间从2016-03-08开始，点击检索按钮
 * 测试预期->3. 检索出品牌（中文或英文）中含有test字段的，车型名称（中文或英文）含有字段ELV的，且时间为2016-03-08之后的所有高危清单信息。
 * 测试步骤->4. 在高危清单的查询条件：品牌名称中填写test，车型名称中填写ELV，时间从2016-04-08开始，到2016-03-11结束，点击检索按钮
 * 测试预期->4. 页面出现提示信息：查询的开始时间不能大于截止时间
 * 
 */

public class 验证高危清单查询功能是否可实现_综合检索_4446 extends Selenium_Test_Base {
	
	public 验证高危清单查询功能是否可实现_综合检索_4446(){
		super();
	}
	
	public 验证高危清单查询功能是否可实现_综合检索_4446(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_高危清单_356.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_高危清单_356.rightFrame);
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
		getElement(ElementEnum_高危清单_356.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_高危清单_356 a = new CommonOperations_高危清单_356(driver);
		a.judgeMaskLoadFirst();
		getElement(ElementEnum_高危清单_356.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请至少输入一项检索条件");
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_标准信息_352.起始时间输入框.getName()+"\");setDate.removeAttribute('readonly');");
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_标准信息_352.终止时间输入框.getName()+"\");setDate.removeAttribute('readonly');");
		
		getElement(ElementEnum_高危清单_356.品牌名称输入框).clear();
		getElement(ElementEnum_高危清单_356.品牌名称输入框).sendKeys("test");
		getElement(ElementEnum_高危清单_356.起始时间输入框).clear();
		getElement(ElementEnum_高危清单_356.起始时间输入框).sendKeys("2016-03-08");
		getElement(ElementEnum_高危清单_356.检索按钮).click();
		WebDriverConfiguration.operationInterval();

		a.verifyAllSearchResult("test", ElementEnum_高危清单_356.检索结果所有行, 
								ElementEnum_高危清单_356.检索结果第一行品牌中文名称, 
								ElementEnum_高危清单_356.检索结果第一行品牌英文名称);
		a.verifyResultTimeSatisfy("2016-03-08", "", ElementEnum_高危清单_356.检索结果所有行, 
						ElementEnum_高危清单_356.检索结果第一行车型记录创建时间	, 
						ElementEnum_高危清单_356.第一页提示信息);
		
		
		getElement(ElementEnum_高危清单_356.车型名称输入框).clear();
		getElement(ElementEnum_高危清单_356.车型名称输入框).sendKeys("ELV");
		getElement(ElementEnum_高危清单_356.起始时间输入框).clear();
		getElement(ElementEnum_高危清单_356.起始时间输入框).sendKeys("2016-03-08");
		getElement(ElementEnum_高危清单_356.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.verifyAllSearchResult("test", ElementEnum_高危清单_356.检索结果所有行, 
				ElementEnum_高危清单_356.检索结果第一行车型中文名称, 
				ElementEnum_高危清单_356.检索结果第一行车型英文名称);
		a.verifyResultTimeSatisfy("2016-03-08", "", ElementEnum_高危清单_356.检索结果所有行, 
				ElementEnum_高危清单_356.检索结果第一行车型记录创建时间	, 
				ElementEnum_高危清单_356.第一页提示信息);
		
		getElement(ElementEnum_高危清单_356.品牌名称输入框).clear();
		getElement(ElementEnum_高危清单_356.品牌名称输入框).sendKeys("test");
		getElement(ElementEnum_高危清单_356.车型名称输入框).clear();
		getElement(ElementEnum_高危清单_356.车型名称输入框).sendKeys("ELV");
		getElement(ElementEnum_高危清单_356.起始时间输入框).clear();
		getElement(ElementEnum_高危清单_356.起始时间输入框).sendKeys("2016-03-08");
		getElement(ElementEnum_高危清单_356.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.verifyResultTimeSatisfy("2016-04-08", "2016-03-11", ElementEnum_高危清单_356.检索结果所有行, 
				ElementEnum_高危清单_356.检索结果第一行车型记录创建时间	, 
				ElementEnum_高危清单_356.第一页提示信息);
		
	}

	
	public String getDescription(){
		return "测试用例id: 4446\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 高危清单(#356)\n"
				+" 用例名称: 验证高危清单查询功能是否可实现-综合检索\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击检索按钮\n"
				+" 测试预期->1. 页面出现提示信息：请至少输入一项检索条件！\n"
				+" 测试步骤->2. 在高危清单的查询条件：品牌名称中填写test，时间从2016-03-08开始，点击检索按钮\n"
				+" 测试预期->2. 检索出品牌（中文或英文）中含有test字段的，且时间为2016-03-08之后的所有高危清单信息。\n"
				+" 测试步骤->3. 在高危清单的查询条件：品牌名称中填写test，车型名称中填写ELV，时间从2016-03-08开始，点击检索按钮\n"
				+" 测试预期->3. 检索出品牌（中文或英文）中含有test字段的，车型名称（中文或英文）含有字段ELV的，且时间为2016-03-08之后的所有高危清单信息。\n"
				+" 测试步骤->4. 在高危清单的查询条件：品牌名称中填写test，车型名称中填写ELV，时间从2016-04-08开始，到2016-03-11结束，点击检索按钮\n"
				+" 测试预期->4. 页面出现提示信息：查询的开始时间不能大于截止时间\n"
;
	}

}

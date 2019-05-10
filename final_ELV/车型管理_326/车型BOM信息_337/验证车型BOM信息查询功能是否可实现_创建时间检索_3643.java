package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型BOM信息_337;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.有害物质分析_342.ElementEnum_有害物质分析_342;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.禁限用物质豁免分析_347.ElementEnum_禁限用物质豁免分析_347;

/**
 * 测试用例id: 3643
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型BOM信息(#337)
 * 用例名称: 验证车型BOM信息查询功能是否可实现-创建时间检索
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 在车型BOM信息的查询条件：创建时间从2016-03-08开始，点击检索按钮
 * 测试预期->1. 检索出创建时间为2016-03-08之后的所有车型BOM信息。
 * 测试步骤->2. 在车型BOM信息的查询条件：创建时间2016-04-08结束，点击检索按钮
 * 测试预期->2. 检索出创建时间为2016-04-08之前的所有车型BOM信息。
 * 测试步骤->3. 在车型BOM信息的查询条件：创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮
 * 测试预期->3. 检索出创建时间为2016-03-08到2016-04-11的所有车型BOM信息。
 * 测试步骤->4. 在车型BOM信息的查询条件：创建时间从2016-04-08开始，到2016-03-11结束，点击检索按钮
 * 测试预期->4. 出现错误提示：开始时间早于结束时间!
 * 
 */

public class 验证车型BOM信息查询功能是否可实现_创建时间检索_3643 extends Selenium_Test_Base {
	
	public 验证车型BOM信息查询功能是否可实现_创建时间检索_3643(){
		super();
	}
	
	public 验证车型BOM信息查询功能是否可实现_创建时间检索_3643(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_车型BOM信息_337.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_车型BOM信息_337.rightFrame);
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
		getElement(ElementEnum_车型BOM信息_337.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.二级目录名称).click();
		WebDriverConfiguration.operationInterval();

	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void dealWithError(){
		String displayValue = getElement(ElementEnum_车型BOM信息_337.开始时间早于结束时间错误信息).getCssValue("display");
		assertTrue(!displayValue.equals("none"),"开始时间早于结束时间错误信息未显示");
	}
	public void testQueryTime(String startTime, String endTime){
		// 去掉输入框的readonly属性，直接输入起点时间和终点时间
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ ElementEnum_车型BOM信息_337.创建时间起点输入框.getName()+"\");setDate.removeAttribute('readonly');");
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ ElementEnum_车型BOM信息_337.创建时间终点输入框.getName()+"\");setDate.removeAttribute('readonly');");
		
		getElement(ElementEnum_车型BOM信息_337.创建时间起点输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.创建时间起点输入框).sendKeys(startTime);
		getElement(ElementEnum_车型BOM信息_337.创建时间终点输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.创建时间终点输入框).sendKeys(endTime);
		getElement(ElementEnum_车型BOM信息_337.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		if(startTime.equals("")||startTime==null||endTime.equals("")||endTime==null){
			
		}else{
			if(startTime.compareTo(endTime) > 0){
				dealWithError();
				return;
			}
		}

		
		List<WebElement> eles = getElements(ElementEnum_车型BOM信息_337.检索结果所有行);
		// 检查查询结果中是否包含所查关键字
		for(int i = 1;i < eles.size();i++){
			String xpath = ElementEnum_车型BOM信息_337.检索结果第一行更新时间.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String createTime = driver.findElement(By.xpath(xpath)).getText();
			assertTrue(startTime.equals("")||startTime==null?true:createTime.compareTo(startTime) > 0,"搜索结果小于起点时间");
			//assertTrue(endTime.equals("")||endTime==null?true:createTime.compareTo(endTime) < 0,"搜索结果大于终点时间");
		}
	}
	public void detailedOperation(){
		testQueryTime("2016-03-08", "");
		testQueryTime("", "2016-04-08");
		testQueryTime("2016-03-08", "2016-04-11");
		testQueryTime("2016-04-11", "2016-03-08");
	
	}

	
	public String getDescription(){
		return "测试用例id: 3643\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型BOM信息(#337)\n"
				+" 用例名称: 验证车型BOM信息查询功能是否可实现-创建时间检索\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 在车型BOM信息的查询条件：创建时间从2016-03-08开始，点击检索按钮\n"
				+" 测试预期->1. 检索出创建时间为2016-03-08之后的所有车型BOM信息。\n"
				+" 测试步骤->2. 在车型BOM信息的查询条件：创建时间2016-04-08结束，点击检索按钮\n"
				+" 测试预期->2. 检索出创建时间为2016-04-08之前的所有车型BOM信息。\n"
				+" 测试步骤->3. 在车型BOM信息的查询条件：创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮\n"
				+" 测试预期->3. 检索出创建时间为2016-03-08到2016-04-11的所有车型BOM信息。\n"
				+" 测试步骤->4. 在车型BOM信息的查询条件：创建时间从2016-04-08开始，到2016-03-11结束，点击检索按钮\n"
				+" 测试预期->4. 出现错误提示：开始时间早于结束时间!\n"
;
	}

}

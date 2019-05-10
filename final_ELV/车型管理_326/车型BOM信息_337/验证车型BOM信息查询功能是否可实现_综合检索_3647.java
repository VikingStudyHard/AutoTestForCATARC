package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型BOM信息_337;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3647
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型BOM信息(#337)
 * 用例名称: 验证车型BOM信息查询功能是否可实现-综合检索
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 在车型BOM信息的查询条件：车型商标中填写1，通用名称中填写1，创建时间从2016-03-08开始，点击检索按钮
 * 测试预期->1. 检索出创建时间为2016-03-08之后的车型商标中含有1，通用名称中含有1的所有车型BOM信息
 * 测试步骤->2. 在车型BOM信息的查询条件：车型商标中填写1，通用名称中填写ca，创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮
 * 测试预期->2. 未检索出任何符合条件的车型信息
 * 
 */

public class 验证车型BOM信息查询功能是否可实现_综合检索_3647 extends Selenium_Test_Base {
	
	public 验证车型BOM信息查询功能是否可实现_综合检索_3647(){
		super();
	}
	
	public 验证车型BOM信息查询功能是否可实现_综合检索_3647(WebDriver driver){
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
	public void testCarAll(String brand,String name,String startTime, String endTime){		
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_车型BOM信息_337.创建时间起点输入框.getName()+"\");setDate.removeAttribute('readonly');");
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_车型BOM信息_337.创建时间终点输入框.getName()+"\");setDate.removeAttribute('readonly');");
		getElement(ElementEnum_车型BOM信息_337.车型商标输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.车型商标输入框).sendKeys(brand);
		getElement(ElementEnum_车型BOM信息_337.通用名称输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.通用名称输入框).sendKeys(name);
		getElement(ElementEnum_车型BOM信息_337.创建时间起点输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.创建时间起点输入框).sendKeys(startTime);
		getElement(ElementEnum_车型BOM信息_337.创建时间终点输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.创建时间终点输入框).sendKeys(endTime);
		getElement(ElementEnum_车型BOM信息_337.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		List<WebElement> eles = getElements(ElementEnum_车型BOM信息_337.检索结果所有行);
		// 检查查询结果中是否包含所查关键字
		for(int i = 1;i < eles.size();i++){
			String chbXpath = ElementEnum_车型BOM信息_337.检索结果第一行车型中文商标.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String chProduceBrand = driver.findElement(By.xpath(chbXpath)).getText();
			String enbXpath = ElementEnum_车型BOM信息_337.检索结果第一行车型英文商标.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String enProduceBrand = driver.findElement(By.xpath(enbXpath)).getText();
			String chXpath = ElementEnum_车型BOM信息_337.检索结果第一行车型中文名称.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String chProduceName = driver.findElement(By.xpath(chXpath)).getText();
			String enXpath = ElementEnum_车型BOM信息_337.检索结果第一行车型英文名称.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String enProduceName = driver.findElement(By.xpath(enXpath)).getText();
			String xpath = ElementEnum_车型BOM信息_337.检索结果第一行更新时间.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String createTime = driver.findElement(By.xpath(xpath)).getText();
			assertTrue(startTime.equals("")||startTime==null?true:createTime.compareTo(startTime) > 0,"搜索结果小于起点时间");
			assertTrue(endTime.equals("")||endTime==null?true:createTime.compareTo(endTime) < 0,"搜索结果大于终点时间");
			assertTrue(chProduceName.contains(name)||enProduceName.contains(name)||
					chProduceBrand.contains(brand)||enProduceBrand.contains(brand),"查询结果不符合要求");
		}
		WebDriverConfiguration.operationInterval();
		if(startTime.equals("")||startTime==null||endTime.equals("")||endTime==null){
			
		}else{
			if(startTime.compareTo(endTime) > 0){
				dealWithError();
				return;
			}
		}
	}
	public void detailedOperation(){
		testCarAll("1","1","2016-03-08","");
		testCarAll("1","ca","2016-03-08","2016-04-11");
	}

	
	public String getDescription(){
		return "测试用例id: 3647\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型BOM信息(#337)\n"
				+" 用例名称: 验证车型BOM信息查询功能是否可实现-综合检索\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 在车型BOM信息的查询条件：车型商标中填写1，通用名称中填写1，创建时间从2016-03-08开始，点击检索按钮\n"
				+" 测试预期->1. 检索出创建时间为2016-03-08之后的车型商标中含有1，通用名称中含有1的所有车型BOM信息\n"
				+" 测试步骤->2. 在车型BOM信息的查询条件：车型商标中填写1，通用名称中填写ca，创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮\n"
				+" 测试预期->2. 未检索出任何符合条件的车型信息\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型信息_336;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3632
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型信息(#336)
 * 用例名称: 验证车型信息查询功能是否可实现-综合检索
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 在车型信息的查询条件：车型商标中填写1，通用名称中填写1，创建时间从2016-03-08开始，点击检索按钮
 * 测试预期->1. 检索出创建时间为2016-03-08之后的车型商标中含有1，通用名称中含有1的所有车型信息
 * 测试步骤->2. 在车型信息的查询条件：车型商标中填写1，通用名称中填写ca，创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮
 * 测试预期->2. 未检索出任何符合条件的车型信息
 * 
 */

public class 验证车型信息查询功能是否可实现_综合检索_3632 extends Selenium_Test_Base {
	
	public 验证车型信息查询功能是否可实现_综合检索_3632(){
		super();
	}
	
	public 验证车型信息查询功能是否可实现_综合检索_3632(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_车型信息_336.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_车型信息_336.rightFrame);
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
		getElement(ElementEnum_车型信息_336.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		testQueryAllCondition("1", "1", "2016-03-08", "");
		testQueryAllCondition("1", "ca", "2016-03-08", "2016-04-11");
		
	}
	
	public void testQueryAllCondition(String str1,String str2, String startTime, String endTime){
		getElement(ElementEnum_车型信息_336.车型商标输入框).clear();
		getElement(ElementEnum_车型信息_336.车型商标输入框).sendKeys(str1);
		getElement(ElementEnum_车型信息_336.通用名称输入框).clear();
		getElement(ElementEnum_车型信息_336.通用名称输入框).sendKeys(str2);
		
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ ElementEnum_车型信息_336.创建起始时间输入框.getName()+"\");setDate.removeAttribute('readonly');");
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ ElementEnum_车型信息_336.创建终止时间输入框.getName()+"\");setDate.removeAttribute('readonly');");
		getElement(ElementEnum_车型信息_336.创建起始时间输入框).clear();
		getElement(ElementEnum_车型信息_336.创建起始时间输入框).sendKeys(startTime);
		getElement(ElementEnum_车型信息_336.创建终止时间输入框).clear();
		getElement(ElementEnum_车型信息_336.创建终止时间输入框).sendKeys(endTime);
		
		getElement(ElementEnum_车型信息_336.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		CommonOperations_车型信息_336 a = new CommonOperations_车型信息_336(driver);
		a.judgeMaskLoadFirst();
		
		List<WebElement> eles = getElements(ElementEnum_车型信息_336.检索结果所有行);
		// 检查查询结果中是否包含所查关键字
		for(int i = 1;i < eles.size();i++){
			String xpath = ElementEnum_车型信息_336.检索结果第一行更新时间.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String createTime = driver.findElement(By.xpath(xpath)).getText();
			assertTrue(startTime.equals("")||startTime==null?true:createTime.compareTo(startTime) > 0,"搜索结果小于起点时间");
			assertTrue(endTime.equals("")||endTime==null?true:createTime.compareTo(endTime) < 0,"搜索结果大于终点时间");
		}
		
		for(int i = 1;i < eles.size();i++){
			String chXpath = ElementEnum_车型信息_336.检索结果第一行车型商标中文.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String chName = driver.findElement(By.xpath(chXpath)).getText();
			String enXpath = ElementEnum_车型信息_336.检索结果第一行车型商标英文.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String enName = driver.findElement(By.xpath(enXpath)).getText();
			assertTrue(chName.contains(str1) || enName.contains(str1));
		}
		
		for(int i = 1;i < eles.size();i++){
			String chXpath = ElementEnum_车型信息_336.检索结果第一行车型中文名称.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String chName = driver.findElement(By.xpath(chXpath)).getText();
			String enXpath = ElementEnum_车型信息_336.检索结果第一行车型英文名称.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String enName = driver.findElement(By.xpath(enXpath)).getText();
			assertTrue(chName.contains(str2) || enName.contains(str2));
		}
	}

	
	public String getDescription(){
		return "测试用例id: 3632\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型信息(#336)\n"
				+" 用例名称: 验证车型信息查询功能是否可实现-综合检索\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 在车型信息的查询条件：车型商标中填写1，通用名称中填写1，创建时间从2016-03-08开始，点击检索按钮\n"
				+" 测试预期->1. 检索出创建时间为2016-03-08之后的车型商标中含有1，通用名称中含有1的所有车型信息\n"
				+" 测试步骤->2. 在车型信息的查询条件：车型商标中填写1，通用名称中填写ca，创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮\n"
				+" 测试预期->2. 未检索出任何符合条件的车型信息\n"
;
	}

}

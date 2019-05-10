package cn.edu.tju.scs.seql.final_ELV.车型管理_326.BOM分发结果_338;

import static org.testng.Assert.*;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3667
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: BOM分发结果(#338)
 * 用例名称: 验证BOM分发结果查询功能是否可实现-车型名称检索
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 点击检索车型按钮
 * 测试预期->1. 出现新页面，页面含有检索信息可检索出车型商标名称等BOM信息
 * 测试步骤->2. 在车型BOM信息的查询条件：车型商标中填写1，点击检索按钮
 * 测试预期->2. 车型商标（中文或英文）名称中含有字段1的所有车型BOM信息被检索出来
 * 测试步骤->3. 在车型BOM信息的查询条件：通用名称中填写ca，点击检索按钮
 * 测试预期->3. 车型中文（或英文）名称中含有字段ca的所有车型BOM信息被检索出来
 * 测试步骤->4. 在车型BOM信息的查询条件：创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮
 * 测试预期->4. 检索出创建时间为2016-03-08到2016-04-11的所有车型BOM信息。
 * 测试步骤->5. 在车型BOM信息的查询条件：车型商标中填写1，通用名称中填写ca，创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮
 * 测试预期->5. 未检索出任何符合条件的车型信息
 * 测试步骤->6. 在车型BOM信息的查询条件：车型商标中填写1，通用名称中填写1，创建时间从2016-03-08开始，点击检索按钮
 * 测试预期->6. 检索出创建时间为2016-03-08之后的车型商标中含有1，通用名称中含有1的所有车型BOM信息
 * 测试步骤->7. 选择一条BOM信息，点击确定按钮
 * 测试预期->7. 页面关闭，车型名称的检索框中为所选择BOM信息的车型名称
 * 
 */

public class 验证BOM分发结果查询功能是否可实现_车型名称检索_3667 extends Selenium_Test_Base {
	
	public 验证BOM分发结果查询功能是否可实现_车型名称检索_3667(){
		super();
	}
	
	public 验证BOM分发结果查询功能是否可实现_车型名称检索_3667(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_BOM分发结果_338.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_BOM分发结果_338.rightFrame);
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
		getElement(ElementEnum_BOM分发结果_338.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_BOM分发结果_338.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_BOM分发结果_338.车型名称输入框).click();
		getElement(ElementEnum_BOM分发结果_338.检索车型键).click();
		Set<String> handlers = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		handlers.remove(parent);
		String child = handlers.iterator().next();
		driver.switchTo().window(child);

		query("1", null, null, null);
		query(null, "ca", null, null);
		query(null, null, "2016-03-08", "2016-04-11");
		query("1", "ca", "2016-03-08", "2016-04-11");
		query("1", "1", "2016-03-08", null);
		
		getElement(ElementEnum_BOM分发结果_338.检索车型子页面表格第一行).click();
		String cname = getElement(ElementEnum_BOM分发结果_338.检索车型子页面表格第一行车型中文名称).getText();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_BOM分发结果_338.检索车型子页面确定键).click();
		WebDriverConfiguration.operationInterval();
		driver.switchTo().window(parent);
		driver.switchTo().frame(getElement(ElementEnum_BOM分发结果_338.rightFrame));
		String searchName = getElement(ElementEnum_BOM分发结果_338.车型名称输入框).getAttribute("value");
		assertEquals(searchName, cname);
	}
	
	private void query(String brand, String name, String start, String end){
		getElement(ElementEnum_BOM分发结果_338.检索车型子页面车型商标输入框).clear();
		if (brand != null)
			getElement(ElementEnum_BOM分发结果_338.检索车型子页面车型商标输入框).sendKeys(brand);
		
		getElement(ElementEnum_BOM分发结果_338.检索车型子页面通用名称输入框).clear();
		if (name != null)
			getElement(ElementEnum_BOM分发结果_338.检索车型子页面通用名称输入框).sendKeys(name);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('readonly')", 
				getElement(ElementEnum_BOM分发结果_338.检索车型子页面创建时间起始));
		((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('readonly')", 
				getElement(ElementEnum_BOM分发结果_338.检索车型子页面创建时间截止));
		
		getElement(ElementEnum_BOM分发结果_338.检索车型子页面创建时间起始).clear();
		getElement(ElementEnum_BOM分发结果_338.检索车型子页面创建时间截止).clear();
		Calendar startTime = null;
		Calendar endTime = null;
		if (start != null){
			getElement(ElementEnum_BOM分发结果_338.检索车型子页面创建时间起始).sendKeys(start);
			String[] t = start.split("-");
			//System.out.println(t[0] + " " + t[1] + " " + t[2]);
			startTime = Calendar.getInstance();
			startTime.set(Integer.valueOf(t[0]), Integer.valueOf(t[1]), Integer.valueOf(t[2]));
		}
		if (end != null){
			getElement(ElementEnum_BOM分发结果_338.检索车型子页面创建时间截止).sendKeys(end);
			String[] t = end.split("-");
			//System.out.println(t[0] + " " + t[1] + " " + t[2]);
			endTime = Calendar.getInstance();
			endTime.set(Integer.valueOf(t[0]), Integer.valueOf(t[1]), Integer.valueOf(t[2]));
		}
		
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_BOM分发结果_338.检索车型子页面检索键).click();
		WebDriverConfiguration.operationInterval();
		
		List<WebElement> eles = getElements(ElementEnum_BOM分发结果_338.检索车型子页面表格所有行);
		if (eles.size() == 0)
			return;
		for (int i = 1; i < eles.size(); i++){
			String cbrand = driver.findElement(By.xpath(ElementEnum_BOM分发结果_338.检索车型子页面表格第一行车型商标中文.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			String ebrand = driver.findElement(By.xpath(ElementEnum_BOM分发结果_338.检索车型子页面表格第一行车型商标英文.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			
			String cname = driver.findElement(By.xpath(ElementEnum_BOM分发结果_338.检索车型子页面表格第一行车型中文名称.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			String ename = driver.findElement(By.xpath(ElementEnum_BOM分发结果_338.检索车型子页面表格第一行车型英文名称.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			
			if (brand != null)
				//assertTrue(cbrand.equals(brand) || ebrand.equals(brand));
				assertTrue(cbrand.contains(brand) || ebrand.contains(brand));
			
			if (name != null)
				assertTrue(cname.contains(name) || ename.contains(name));
		}
	}
		
	public String getDescription(){
		return "测试用例id: 3667\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: BOM分发结果(#338)\n"
				+" 用例名称: 验证BOM分发结果查询功能是否可实现-车型名称检索\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 点击检索车型按钮\n"
				+" 测试预期->1. 出现新页面，页面含有检索信息可检索出车型商标名称等BOM信息\n"
				+" 测试步骤->2. 在车型BOM信息的查询条件：车型商标中填写1，点击检索按钮\n"
				+" 测试预期->2. 车型商标（中文或英文）名称中含有字段1的所有车型BOM信息被检索出来\n"
				+" 测试步骤->3. 在车型BOM信息的查询条件：通用名称中填写ca，点击检索按钮\n"
				+" 测试预期->3. 车型中文（或英文）名称中含有字段ca的所有车型BOM信息被检索出来\n"
				+" 测试步骤->4. 在车型BOM信息的查询条件：创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮\n"
				+" 测试预期->4. 检索出创建时间为2016-03-08到2016-04-11的所有车型BOM信息。\n"
				+" 测试步骤->5. 在车型BOM信息的查询条件：车型商标中填写1，通用名称中填写ca，创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮\n"
				+" 测试预期->5. 未检索出任何符合条件的车型信息\n"
				+" 测试步骤->6. 在车型BOM信息的查询条件：车型商标中填写1，通用名称中填写1，创建时间从2016-03-08开始，点击检索按钮\n"
				+" 测试预期->6. 检索出创建时间为2016-03-08之后的车型商标中含有1，通用名称中含有1的所有车型BOM信息\n"
				+" 测试步骤->7. 选择一条BOM信息，点击确定按钮\n"
				+" 测试预期->7. 页面关闭，车型名称的检索框中为所选择BOM信息的车型名称\n"
;
	}

}

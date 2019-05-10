package cn.edu.tju.scs.seql.final_ELV.车型管理_326.BOM分发结果_338;

import static org.testng.Assert.*;

import java.util.Set;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3670
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: BOM分发结果(#338)
 * 用例名称: 验证BOM分发结果查询功能是否可实现-综合检索
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 点击检索车型按钮
 * 测试预期->1. 出现新页面，页面含有检索信息可检索出车型商标名称等BOM信息
 * 测试步骤->2. 点击查询按钮，选择一条BOM信息，点击确定按钮
 * 测试预期->2. 页面关闭，车型名称的检索框中为所选择BOM信息的车型名称
 * 测试步骤->3. 点击查找零部件bom按钮
 * 测试预期->3. 出现新页面，页面含有检索信息可检索出车型商标名称等BOM信息
 * 测试步骤->4. 点击查询按钮，选择一条BOM信息，点击确定按钮
 * 测试预期->4. 页面关闭，零部件bom名称的检索框中为所选择BOM信息的零部件bom名称
 * 测试步骤->5. 点击查询按钮
 * 测试预期->5. 查询出所有符合检索条件的bom分发结果
 * 
 */

public class 验证BOM分发结果查询功能是否可实现_综合检索_3670 extends Selenium_Test_Base {
	
	public 验证BOM分发结果查询功能是否可实现_综合检索_3670(){
		super();
	}
	
	public 验证BOM分发结果查询功能是否可实现_综合检索_3670(WebDriver driver){
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
		/*
		getElement(ElementEnum_BOM分发结果_338.车型名称输入框).click();
		getElement(ElementEnum_BOM分发结果_338.检索车型键).click();
		WebDriverConfiguration.operationInterval();
		Set<String> handlers = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		handlers.remove(parent);
		String child = handlers.iterator().next();
		driver.switchTo().window(child);
		getElement(ElementEnum_BOM分发结果_338.检索车型子页面表格第一行).click();
		getElement(ElementEnum_BOM分发结果_338.检索车型子页面确定键).click();
		WebDriverConfiguration.operationInterval();
		driver.switchTo().window(parent);
		driver.switchTo().frame(getElement(ElementEnum_BOM分发结果_338.rightFrame));
		
		getElement(ElementEnum_BOM分发结果_338.零部件BOM名称输入框).click();
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM键).click();
		
		handlers = driver.getWindowHandles();
		handlers.remove(parent);
		child = handlers.iterator().next();
		driver.switchTo().window(child);
		
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面查询键).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面表格第一行).click();
		
		getElement(ElementEnum_BOM分发结果_338.查询键).click();
		WebDriverConfiguration.operationInterval();
		*/
		
		Assert.fail("车型名称和零部件BOM名称一个添加搜索条件后另一个就会消失，无法做到综合搜索");
		Assert.fail("车型名称和零部件BOM名称不在结果中显示，无法验证搜索正确性");
	}

	
	public String getDescription(){
		return "测试用例id: 3670\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: BOM分发结果(#338)\n"
				+" 用例名称: 验证BOM分发结果查询功能是否可实现-综合检索\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 点击检索车型按钮\n"
				+" 测试预期->1. 出现新页面，页面含有检索信息可检索出车型商标名称等BOM信息\n"
				+" 测试步骤->2. 点击查询按钮，选择一条BOM信息，点击确定按钮\n"
				+" 测试预期->2. 页面关闭，车型名称的检索框中为所选择BOM信息的车型名称\n"
				+" 测试步骤->3. 点击查找零部件bom按钮\n"
				+" 测试预期->3. 出现新页面，页面含有检索信息可检索出车型商标名称等BOM信息\n"
				+" 测试步骤->4. 点击查询按钮，选择一条BOM信息，点击确定按钮\n"
				+" 测试预期->4. 页面关闭，零部件bom名称的检索框中为所选择BOM信息的零部件bom名称\n"
				+" 测试步骤->5. 点击查询按钮\n"
				+" 测试预期->5. 查询出所有符合检索条件的bom分发结果\n"
;
	}

}

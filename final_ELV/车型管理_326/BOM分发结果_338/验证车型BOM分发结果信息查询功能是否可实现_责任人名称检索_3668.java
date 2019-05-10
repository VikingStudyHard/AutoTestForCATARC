package cn.edu.tju.scs.seql.final_ELV.车型管理_326.BOM分发结果_338;

import static org.testng.Assert.*;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3668
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: BOM分发结果(#338)
 * 用例名称: 验证车型BOM分发结果信息查询功能是否可实现-责任人名称检索
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 在BOM分发结果的查询条件责任人名称中填写：411，点击查询
 * 测试预期->1. 无符合条件的查询结果
 * 测试步骤->2. 在BOM分发结果的查询条件责任人名称中填写：41107，点击查询
 * 测试预期->2. 查询出BOM信息，其中责任人均为41107
 * 
 */

public class 验证车型BOM分发结果信息查询功能是否可实现_责任人名称检索_3668 extends Selenium_Test_Base {
	
	public 验证车型BOM分发结果信息查询功能是否可实现_责任人名称检索_3668(){
		super();
	}
	
	public 验证车型BOM分发结果信息查询功能是否可实现_责任人名称检索_3668(WebDriver driver){
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
		
		query("411");
		query("411007");
	}
	
	private void query(String text){
		getElement(ElementEnum_BOM分发结果_338.责任人名称输入框).clear();
		getElement(ElementEnum_BOM分发结果_338.责任人名称输入框).sendKeys(text);
		getElement(ElementEnum_BOM分发结果_338.查询键).click();
		WebDriverConfiguration.operationInterval();
		
		List<WebElement> eles = getElements(ElementEnum_BOM分发结果_338.表格所有行);
		if (eles.size() == 0)
			return;
		for (int i = 1; i < eles.size(); i++){
			String name = driver.findElement(By.xpath(ElementEnum_BOM分发结果_338.表格第一行责任人名称.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			assertTrue(name.equals(text));
			//assertTrue(name.contains(word));
		}
	}

	
	public String getDescription(){
		return "测试用例id: 3668\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: BOM分发结果(#338)\n"
				+" 用例名称: 验证车型BOM分发结果信息查询功能是否可实现-责任人名称检索\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 在BOM分发结果的查询条件责任人名称中填写：411，点击查询\n"
				+" 测试预期->1. 无符合条件的查询结果\n"
				+" 测试步骤->2. 在BOM分发结果的查询条件责任人名称中填写：41107，点击查询\n"
				+" 测试预期->2. 查询出BOM信息，其中责任人均为41107\n"
;
	}

}

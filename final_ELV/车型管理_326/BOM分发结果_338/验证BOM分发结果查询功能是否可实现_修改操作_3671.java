package cn.edu.tju.scs.seql.final_ELV.车型管理_326.BOM分发结果_338;

import static org.testng.Assert.*;

import java.util.Set;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3671
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: BOM分发结果(#338)
 * 用例名称: 验证BOM分发结果查询功能是否可实现-修改操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 点击修改BOM按钮
 * 测试预期->1. 出现错误信息：请选择信息！
 * 测试步骤->2. 单击左键选择一条bom分发结果，点击修改按钮
 * 测试预期->2. 出现新页面，页面部分信息标注为不可修改，仅有责任人一栏可以修改
 * 测试步骤->3. 修改责任人为test，点击保存按钮
 * 测试预期->3. 出现提示信息：操作成功
 * 测试步骤->4. 点击刚刚修改过的信息，点击修改按钮
 * 测试预期->4. 出现新页面，责任人一栏为修改后的test，己修改成功
 * 
 */

public class 验证BOM分发结果查询功能是否可实现_修改操作_3671 extends Selenium_Test_Base {
	
	public 验证BOM分发结果查询功能是否可实现_修改操作_3671(){
		super();
	}
	
	public 验证BOM分发结果查询功能是否可实现_修改操作_3671(WebDriver driver){
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
		getElement(ElementEnum_BOM分发结果_338.修改键).click();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_BOM分发结果_338.未选择信息错误提示).getText(), "请选择信息!");
		getElement(ElementEnum_BOM分发结果_338.未选择信息错误提示确定键).click();
		
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
		getElement(ElementEnum_BOM分发结果_338.查询键).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_BOM分发结果_338.表格第一行).click();
		getElement(ElementEnum_BOM分发结果_338.修改键).click();
		WebDriverConfiguration.operationInterval();
		String oldName = getElement(ElementEnum_BOM分发结果_338.修改子页面责任人名称输入框).getAttribute("value");
		getElement(ElementEnum_BOM分发结果_338.修改子页面责任人名称输入框).clear();
		String newName = oldName.equals("test") ? "test2" : "test";
		getElement(ElementEnum_BOM分发结果_338.修改子页面责任人名称输入框).sendKeys(newName);
		getElement(ElementEnum_BOM分发结果_338.修改子页面保存键).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_BOM分发结果_338.操作成功提示确定键).click();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_BOM分发结果_338.表格第一行责任人名称).getText(), newName);
		getElement(ElementEnum_BOM分发结果_338.表格第一行).click();
		getElement(ElementEnum_BOM分发结果_338.修改键).click();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_BOM分发结果_338.修改子页面责任人名称输入框).getAttribute("value"), newName);
		getElement(ElementEnum_BOM分发结果_338.修改子页面关闭键).click();
	}

	
	public String getDescription(){
		return "测试用例id: 3671\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: BOM分发结果(#338)\n"
				+" 用例名称: 验证BOM分发结果查询功能是否可实现-修改操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 点击修改BOM按钮\n"
				+" 测试预期->1. 出现错误信息：请选择信息！\n"
				+" 测试步骤->2. 单击左键选择一条bom分发结果，点击修改按钮\n"
				+" 测试预期->2. 出现新页面，页面部分信息标注为不可修改，仅有责任人一栏可以修改\n"
				+" 测试步骤->3. 修改责任人为test，点击保存按钮\n"
				+" 测试预期->3. 出现提示信息：操作成功\n"
				+" 测试步骤->4. 点击刚刚修改过的信息，点击修改按钮\n"
				+" 测试预期->4. 出现新页面，责任人一栏为修改后的test，己修改成功\n"
;
	}

}

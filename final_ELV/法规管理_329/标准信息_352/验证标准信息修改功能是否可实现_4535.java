package cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4535
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 标准信息(#352)
 * 用例名称: 验证标准信息修改功能是否可实现
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击页面中的修改按钮
 * 测试预期->1. 页面出现提示信息：请选择信息!
 * 测试步骤->2. 点击选择两条或两条以上的信息
 * 测试预期->2. 无法同时选择两条或两条以上的信息，不可以同时修改两条及以上信息
 * 测试步骤->3. 点击选择一条信息，点击页面中的修改按钮
 * 测试预期->3. 跳转至新页面，页面为该标准信息的详细内容界面，可修改法规名称，选择法规类型，选择基本物质信息。
 * 测试步骤->4. 不修改任何信息，点击关闭按钮
 * 测试预期->4. 页面被正常关闭
 * 测试步骤->5. 点击选择刚刚所选择的信息，点击修改按钮
 * 测试预期->5. 跳转至新页面，页面为所选择修改的标准信息详细内容，无任何信息被改变。
 * 测试步骤->6. 修改任意信息，点击关闭按钮
 * 测试预期->6. 页面被正常关闭
 * 测试步骤->7. 点击选择刚刚所选择的信息，点击修改按钮
 * 测试预期->7. 跳转至新页面，页面为所选择修改的标准信息详细内容，无任何信息被改变。
 * 
 */

public class 验证标准信息修改功能是否可实现_4535 extends Selenium_Test_Base {
	
	public 验证标准信息修改功能是否可实现_4535(){
		super();
	}
	
	public 验证标准信息修改功能是否可实现_4535(WebDriver driver){
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
		getElement(ElementEnum_标准信息_352.修改按钮).click();
		a.verifyTips("请选择信息");
		
		getElement(ElementEnum_标准信息_352.检索结果第一行勾选框).click();
		WebDriverConfiguration.operationInterval();
		driver.findElement(By.xpath(ElementEnum_标准信息_352.检索结果第一行勾选框.getName().replaceAll("tr\\[2\\]", "tr[3]"))).click();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_标准信息_352.查看按钮).getCssValue("display"), "none");
		assertEquals(getElement(ElementEnum_标准信息_352.修改按钮).getCssValue("display"), "none");
		
		a.verifyOnlyOneMyRecord();
		a.searchMyRecord();
		getElement(ElementEnum_标准信息_352.检索结果第一行法规名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.修改按钮).click();
		WebDriverConfiguration.operationInterval();
		String name = getElement(ElementEnum_标准信息_352.查看窗口法规名称输入框).getText();
		String type = getElement(ElementEnum_标准信息_352.查看窗口法规类型输入框).getText();
		getElement(ElementEnum_标准信息_352.查看窗口关闭按钮).click();
		
		a.searchMyRecord();
		getElement(ElementEnum_标准信息_352.检索结果第一行法规名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.修改按钮).click();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_标准信息_352.查看窗口法规名称输入框).getText(), name);
		assertEquals(getElement(ElementEnum_标准信息_352.查看窗口法规类型输入框).getText(), type);
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_标准信息_352.查看窗口法规名称输入框.getName()+"\");setDate.removeAttribute('readonly');");
		getElement(ElementEnum_标准信息_352.查看窗口法规名称输入框).clear();
		getElement(ElementEnum_标准信息_352.查看窗口法规名称输入框).sendKeys("qqweqw");
		getElement(ElementEnum_标准信息_352.查看窗口关闭按钮).click();
		
		a.searchMyRecord();
		getElement(ElementEnum_标准信息_352.检索结果第一行法规名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.修改按钮).click();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_标准信息_352.查看窗口法规名称输入框).getText(), name);
		assertEquals(getElement(ElementEnum_标准信息_352.查看窗口法规类型输入框).getText(), type);
		getElement(ElementEnum_标准信息_352.查看窗口关闭按钮).click();
		
	}

	
	public String getDescription(){
		return "测试用例id: 4535\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 标准信息(#352)\n"
				+" 用例名称: 验证标准信息修改功能是否可实现\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击页面中的修改按钮\n"
				+" 测试预期->1. 页面出现提示信息：请选择信息!\n"
				+" 测试步骤->2. 点击选择两条或两条以上的信息\n"
				+" 测试预期->2. 无法同时选择两条或两条以上的信息，不可以同时修改两条及以上信息\n"
				+" 测试步骤->3. 点击选择一条信息，点击页面中的修改按钮\n"
				+" 测试预期->3. 跳转至新页面，页面为该标准信息的详细内容界面，可修改法规名称，选择法规类型，选择基本物质信息。\n"
				+" 测试步骤->4. 不修改任何信息，点击关闭按钮\n"
				+" 测试预期->4. 页面被正常关闭\n"
				+" 测试步骤->5. 点击选择刚刚所选择的信息，点击修改按钮\n"
				+" 测试预期->5. 跳转至新页面，页面为所选择修改的标准信息详细内容，无任何信息被改变。\n"
				+" 测试步骤->6. 修改任意信息，点击关闭按钮\n"
				+" 测试预期->6. 页面被正常关闭\n"
				+" 测试步骤->7. 点击选择刚刚所选择的信息，点击修改按钮\n"
				+" 测试预期->7. 跳转至新页面，页面为所选择修改的标准信息详细内容，无任何信息被改变。\n"
;
	}

}

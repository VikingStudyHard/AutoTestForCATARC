package cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4706
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 标准信息(#352)
 * 用例名称: 验证法规信息 标准信息 “修改”功能  法规名称  、法规类型 异常测试
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 选中一条信息，点击“修改”按钮
 * 测试预期->1. 弹出一个“修改”页面。页面包含法规名称、法规类型、基本物质信息（添加物质、修改物质、删除物质）。
 * 测试步骤->2. 点击法规名称、法规类型的输入框，按Backspace删除键
 * 测试预期->2. 系统不提供对法规名称、法规类型的修改功能，所以按Backspace键应该无反应。
 * 
 */

public class 验证法规信息_标准信息__修改_功能__法规名称___法规类型_异常测试_4706 extends Selenium_Test_Base {
	
	public 验证法规信息_标准信息__修改_功能__法规名称___法规类型_异常测试_4706(){
		super();
	}
	
	public 验证法规信息_标准信息__修改_功能__法规名称___法规类型_异常测试_4706(WebDriver driver){
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
		a.verifyOnlyOneMyRecord();
		a.searchMyRecord();
		getElement(ElementEnum_标准信息_352.检索结果第一行法规名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.修改按钮).click();
		WebDriverConfiguration.operationInterval();
		
		String name = getElement(ElementEnum_标准信息_352.查看窗口法规名称输入框).getText();
		
		getElement(ElementEnum_标准信息_352.查看窗口法规名称输入框).getLocation();
		Actions action = new Actions(driver);
		action.moveToElement(getElement(ElementEnum_标准信息_352.查看窗口法规名称输入框), 90, 10);
		action.click();
		
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		action.sendKeys(Keys.BACK_SPACE);
		
		assertEquals(getElement(ElementEnum_标准信息_352.查看窗口法规名称输入框).getText(), name);
		
	}

	
	public String getDescription(){
		return "测试用例id: 4706\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 标准信息(#352)\n"
				+" 用例名称: 验证法规信息 标准信息 “修改”功能  法规名称  、法规类型 异常测试\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 选中一条信息，点击“修改”按钮\n"
				+" 测试预期->1. 弹出一个“修改”页面。页面包含法规名称、法规类型、基本物质信息（添加物质、修改物质、删除物质）。\n"
				+" 测试步骤->2. 点击法规名称、法规类型的输入框，按Backspace删除键\n"
				+" 测试预期->2. 系统不提供对法规名称、法规类型的修改功能，所以按Backspace键应该无反应。\n"
;
	}

}

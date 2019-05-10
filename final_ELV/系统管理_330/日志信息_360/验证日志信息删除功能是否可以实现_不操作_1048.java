package cn.edu.tju.scs.seql.final_ELV.系统管理_330.日志信息_360;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1048
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 日志信息(#360)
 * 用例名称: 验证日志信息删除功能是否可以实现-不操作
 * 前置条件: 能正确进入ELV环境合规系统（标准版）日志信息界面
 * 测试步骤->1. 选择一条或多条日志信息，点击删除按钮。
 * 测试预期->1. 页面出现提示信息：是否删除！
 * 测试步骤->2. 点击提示信息中的否按钮。
 * 测试预期->2. 跳转回最初页面，所选定的日志信息未删除。
 * 
 */

public class 验证日志信息删除功能是否可以实现_不操作_1048 extends Selenium_Test_Base {
	
	public 验证日志信息删除功能是否可以实现_不操作_1048(){
		super();
	}
	
	public 验证日志信息删除功能是否可以实现_不操作_1048(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_日志信息_360.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_日志信息_360.rightFrame);
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
		getElement(ElementEnum_日志信息_360.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_日志信息_360.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		
		getElement(ElementEnum_日志信息_360.检索结果第一行勾选框).click();
		WebDriverConfiguration.operationInterval();
		driver.findElement(By.xpath(ElementEnum_日志信息_360.检索结果第一行勾选框.getName().replaceAll("tr\\[2\\]", "tr[3]"))).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_日志信息_360.删除按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_日志信息_360.删除否按钮).click();
		WebDriverConfiguration.operationInterval();
	}

	
	public String getDescription(){
		return "测试用例id: 1048\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 日志信息(#360)\n"
				+" 用例名称: 验证日志信息删除功能是否可以实现-不操作\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）日志信息界面\n"
				+" 测试步骤->1. 选择一条或多条日志信息，点击删除按钮。\n"
				+" 测试预期->1. 页面出现提示信息：是否删除！\n"
				+" 测试步骤->2. 点击提示信息中的否按钮。\n"
				+" 测试预期->2. 跳转回最初页面，所选定的日志信息未删除。\n"
;
	}

}

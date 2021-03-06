package cn.edu.tju.scs.seql.final_ELV.系统管理_330.日志信息_360;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1052
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 日志信息(#360)
 * 用例名称: 验证日志信息按照检索条件删除功能是否可以实现-不处理
 * 前置条件: 能正确进入ELV环境合规系统（标准版）日志信息界面
 * 测试步骤->1. 在检索条件中的开始时间选择今日日期，结束时间选择今日日期，用户姓名中填写李德平，点击按检索条件删除。
 * 测试预期->1. 页面出现提示信息：是否删除日志信息！
 * 测试步骤->2. 选择提示信息中的否按钮
 * 测试预期->2. 跳转回最初页面，满足检索条件的日志信息未被删除。
 * 
 */

public class 验证日志信息按照检索条件删除功能是否可以实现_不处理_1052 extends Selenium_Test_Base {
	
	public 验证日志信息按照检索条件删除功能是否可以实现_不处理_1052(){
		super();
	}
	
	public 验证日志信息按照检索条件删除功能是否可以实现_不处理_1052(WebDriver driver){
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
		getElement(ElementEnum_日志信息_360.开始时间按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_日志信息_360.开始时间今天).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_日志信息_360.结束时间按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_日志信息_360.结束时间今天).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_日志信息_360.用户姓名输入框).clear();
		getElement(ElementEnum_日志信息_360.用户姓名输入框).sendKeys("李德平");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_日志信息_360.按照检索条件删除).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_日志信息_360.删除否按钮).click();
		WebDriverConfiguration.operationInterval();
	}

	
	public String getDescription(){
		return "测试用例id: 1052\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 日志信息(#360)\n"
				+" 用例名称: 验证日志信息按照检索条件删除功能是否可以实现-不处理\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）日志信息界面\n"
				+" 测试步骤->1. 在检索条件中的开始时间选择今日日期，结束时间选择今日日期，用户姓名中填写李德平，点击按检索条件删除。\n"
				+" 测试预期->1. 页面出现提示信息：是否删除日志信息！\n"
				+" 测试步骤->2. 选择提示信息中的否按钮\n"
				+" 测试预期->2. 跳转回最初页面，满足检索条件的日志信息未被删除。\n"
;
	}

}

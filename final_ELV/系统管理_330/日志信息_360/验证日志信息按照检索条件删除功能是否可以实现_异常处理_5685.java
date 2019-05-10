package cn.edu.tju.scs.seql.final_ELV.系统管理_330.日志信息_360;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 5685
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 日志信息(#360)
 * 用例名称:  验证日志信息按照检索条件删除功能是否可以实现-异常处理
 * 前置条件: 1、能正确进入ELV环境合规系统（标准版）日志信息界面
 *         2、没有符合检索条件的日志信息
 * 测试步骤->1. 在检索条件中的开始时间选择今日日期，结束时间选择今日日期，用户姓名中填写李德平，开始检索
 * 测试预期->1. 页面提示：您查找的数据不存在！
 * 测试步骤->2. 点击确定，刷新页面
 * 测试预期->2. 回到日志信息原始界面
 * 测试步骤->3. 在检索条件中的开始时间选择今日日期，结束时间选择今日日期，用户姓名中填写李德平，点击按照检索条件删除
 * 测试预期->3. 页面提示：您所要删除的数据不存在！
 * 测试步骤->4. 点击确定，刷新页面
 * 测试预期->4. 回到日志信息原始界面
 * 
 */

public class 验证日志信息按照检索条件删除功能是否可以实现_异常处理_5685 extends Selenium_Test_Base {
	
	public 验证日志信息按照检索条件删除功能是否可以实现_异常处理_5685(){
		super();
	}
	
	public 验证日志信息按照检索条件删除功能是否可以实现_异常处理_5685(WebDriver driver){
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
		CommonOperations_日志信息_360 a = new CommonOperations_日志信息_360(driver);
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
		getElement(ElementEnum_日志信息_360.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("您查找的数据不存在！");
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
		a.verifyTips("您所要删除的数据不存在！");
	}

	
	public String getDescription(){
		return "测试用例id: 5685\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 日志信息(#360)\n"
				+" 用例名称:  验证日志信息按照检索条件删除功能是否可以实现-异常处理\n"
				+" 前置条件: 1、能正确进入ELV环境合规系统（标准版）日志信息界面 2、没有符合检索条件的日志信息\n"
				+" 测试步骤->1. 在检索条件中的开始时间选择今日日期，结束时间选择今日日期，用户姓名中填写李德平，开始检索\n"
				+" 测试预期->1. 页面提示：您查找的数据不存在！\n"
				+" 测试步骤->2. 点击确定，刷新页面\n"
				+" 测试预期->2. 回到日志信息原始界面\n"
				+" 测试步骤->3. 在检索条件中的开始时间选择今日日期，结束时间选择今日日期，用户姓名中填写李德平，点击按照检索条件删除\n"
				+" 测试预期->3. 页面提示：您所要删除的数据不存在！\n"
				+" 测试步骤->4. 点击确定，刷新页面\n"
				+" 测试预期->4. 回到日志信息原始界面\n"
;
	}

}

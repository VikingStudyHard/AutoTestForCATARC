package cn.edu.tju.scs.seql.final_ELV.系统管理_330.日志信息_360;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1049
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 日志信息(#360)
 * 用例名称: 验证日志信息按照检索条件删除功能是否可以实现-异常处理
 * 前置条件: 能正确进入ELV环境合规系统（标准版）日志信息界面
 * 测试步骤->1. 点击页面中按照检索条件删除按钮
 * 测试预期->1. 出现页面提示：检索条件内容不能为空！
 * 测试步骤->2. 点击提示信息中的确定按钮
 * 测试预期->2. 跳转到最初页面，日志信息没有变化。
 * 
 */

public class 验证日志信息按照检索条件删除功能是否可以实现_异常处理_1049 extends Selenium_Test_Base {
	
	public 验证日志信息按照检索条件删除功能是否可以实现_异常处理_1049(){
		super();
	}
	
	public 验证日志信息按照检索条件删除功能是否可以实现_异常处理_1049(WebDriver driver){
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
		getElement(ElementEnum_日志信息_360.按照检索条件删除).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("检索条件内容不能为空！");
	}

	
	public String getDescription(){
		return "测试用例id: 1049\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 日志信息(#360)\n"
				+" 用例名称: 验证日志信息按照检索条件删除功能是否可以实现-异常处理\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）日志信息界面\n"
				+" 测试步骤->1. 点击页面中按照检索条件删除按钮\n"
				+" 测试预期->1. 出现页面提示：检索条件内容不能为空！\n"
				+" 测试步骤->2. 点击提示信息中的确定按钮\n"
				+" 测试预期->2. 跳转到最初页面，日志信息没有变化。\n"
;
	}

}

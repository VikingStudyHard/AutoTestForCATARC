package cn.edu.tju.scs.seql.final_ELV.系统管理_330.日志信息_360;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2196
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 日志信息(#360)
 * 用例名称: 验证日志信息下方功能栏按钮是否可以实现
 * 前置条件: 能正确进入ELV环境合规系统（标准版）日志信息界面
 * 测试步骤->1. 点击日志信息界面最下方的翻页功能栏中的下一页按钮
 * 测试预期->1. 页面信息跳转至下一页，页面其余内容正常显示。
 * 测试步骤->2. 点击日志信息界面最下方的翻页功能栏中的最后一页按钮
 * 测试预期->2. 页面信息跳转至最后一页，页面其余内容正常显示。
 * 测试步骤->3. 点击日志信息界面最下方的翻页功能栏中的填写框填写20，按回车键。
 * 测试预期->3. 页面信息跳转至第20页，页面其余内容正常显示。
 * 测试步骤->4. 点击日志信息界面最下方的翻页功能栏中的填写框填写2000000，按回车键。
 * 测试预期->4. 页面信息跳转至最后一页，页面其余内容正常显示。
 * 
 */

public class 验证日志信息下方功能栏按钮是否可以实现_2196 extends Selenium_Test_Base {
	
	public 验证日志信息下方功能栏按钮是否可以实现_2196(){
		super();
	}
	
	public 验证日志信息下方功能栏按钮是否可以实现_2196(WebDriver driver){
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
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		for(int i= 0;i < 5;i++)
			WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_日志信息_360.下一页按钮).click();
		for(int i= 0;i < 5;i++)
			WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_日志信息_360.最后页按钮).click();
		for(int i= 0;i < 5;i++)
			WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_日志信息_360.页码显示及输入框).clear();
		getElement(ElementEnum_日志信息_360.页码显示及输入框).sendKeys("1");
		getElement(ElementEnum_日志信息_360.页码显示及输入框).sendKeys(Keys.ENTER);
		for(int i= 0;i < 5;i++)
			WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_日志信息_360.页码显示及输入框).clear();
		getElement(ElementEnum_日志信息_360.页码显示及输入框).sendKeys("2000000");
		getElement(ElementEnum_日志信息_360.页码显示及输入框).sendKeys(Keys.ENTER);
		for(int i= 0;i < 5;i++)
			WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
	
	}

	
	public String getDescription(){
		return "测试用例id: 2196\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 日志信息(#360)\n"
				+" 用例名称: 验证日志信息下方功能栏按钮是否可以实现\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）日志信息界面\n"
				+" 测试步骤->1. 点击日志信息界面最下方的翻页功能栏中的下一页按钮\n"
				+" 测试预期->1. 页面信息跳转至下一页，页面其余内容正常显示。\n"
				+" 测试步骤->2. 点击日志信息界面最下方的翻页功能栏中的最后一页按钮\n"
				+" 测试预期->2. 页面信息跳转至最后一页，页面其余内容正常显示。\n"
				+" 测试步骤->3. 点击日志信息界面最下方的翻页功能栏中的填写框填写20，按回车键。\n"
				+" 测试预期->3. 页面信息跳转至第20页，页面其余内容正常显示。\n"
				+" 测试步骤->4. 点击日志信息界面最下方的翻页功能栏中的填写框填写2000000，按回车键。\n"
				+" 测试预期->4. 页面信息跳转至最后一页，页面其余内容正常显示。\n"
;
	}

}

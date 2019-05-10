package cn.edu.tju.scs.seql.final_ELV.系统管理_330.日志信息_360;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cn.edu.tju.scs.seql.ELV.common.LoginAction;
import cn.edu.tju.scs.seql.ELV.common.Selenium_Test_Base;
import cn.edu.tju.scs.seql.ELV.common.WebDriverConfiguration;

/**
 * 测试用例id: 1046
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 日志信息(#360)
 * 用例名称: 验证日志信息检索功能是否可以实现-异常操作
 * 前置条件: 能正确进入ELV环境合规系统（标准版）日志信息界面
 * 测试步骤->1. 在检索条件中的开始时间选择明日日期，结束时间选择今日日期，点击检索。
 * 测试预期->1. 页面出现提示信息：查询的开始时间不能大于结时间。
 * 测试步骤->2. 点击提示信息中的确认按钮。
 * 测试预期->2. 提示信息关闭，跳转回最初页面。
 * 
 */

public class 验证日志信息检索功能是否可以实现_异常操作_1046 extends Selenium_Test_Base {
	
	public 验证日志信息检索功能是否可以实现_异常操作_1046(){
		super();
	}
	
	public 验证日志信息检索功能是否可以实现_异常操作_1046(WebDriver driver){
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
		Calendar now = Calendar.getInstance();
		
		Date date=new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(calendar.DATE,1);//把日期往后增加一天.整数往后推,负数往前移动
		date=calendar.getTime(); //这个时间就是日期往后推一天的结果 
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(date);
		getElement(ElementEnum_日志信息_360.开始时间输入框).sendKeys(dateString);
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_日志信息_360.结束时间按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_日志信息_360.开始时间今天).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_日志信息_360.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("查询的开始时间不能大于截止时间");
	}

	
	public String getDescription(){
		return "测试用例id: 1046\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 日志信息(#360)\n"
				+" 用例名称: 验证日志信息检索功能是否可以实现-异常操作\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）日志信息界面\n"
				+" 测试步骤->1. 在检索条件中的开始时间选择明日日期，结束时间选择今日日期，点击检索。\n"
				+" 测试预期->1. 页面出现提示信息：查询的开始时间不能大于结时间。\n"
				+" 测试步骤->2. 点击提示信息中的确认按钮。\n"
				+" 测试预期->2. 提示信息关闭，跳转回最初页面。\n"
;
	}

}

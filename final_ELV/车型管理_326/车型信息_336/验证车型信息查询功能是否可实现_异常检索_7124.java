package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型信息_336;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 7124
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型信息(#336)
 * 用例名称: 验证车型信息查询功能是否可实现-异常检索
 * 前置条件: 
 * 测试步骤->1. 不输入任何信息，直接点击检索
 * 测试预期->1. 出现错误提示信息：请至少输入一项检索条件
 * 
 */

public class 验证车型信息查询功能是否可实现_异常检索_7124 extends Selenium_Test_Base {
	
	public 验证车型信息查询功能是否可实现_异常检索_7124(){
		super();
	}
	
	public 验证车型信息查询功能是否可实现_异常检索_7124(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_车型信息_336.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_车型信息_336.rightFrame);
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
		getElement(ElementEnum_车型信息_336.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_车型信息_336.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(getElement(ElementEnum_车型信息_336.第一页提示信息).getText().contains("请至少输入一项检索条件"));
		getElement(ElementEnum_车型信息_336.第一页提示框确认按钮).click();
		WebDriverConfiguration.operationInterval();
		
	}

	
	public String getDescription(){
		return "测试用例id: 7124\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型信息(#336)\n"
				+" 用例名称: 验证车型信息查询功能是否可实现-异常检索\n"
				+" 前置条件: \n"
				+" 测试步骤->1. 不输入任何信息，直接点击检索\n"
				+" 测试预期->1. 出现错误提示信息：请至少输入一项检索条件\n"
;
	}

}

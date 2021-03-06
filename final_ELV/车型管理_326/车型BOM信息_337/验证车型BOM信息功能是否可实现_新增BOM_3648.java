package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型BOM信息_337;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3648
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型BOM信息(#337)
 * 用例名称: 验证车型BOM信息功能是否可实现-新增BOM
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 点击新增BOM按钮
 * 测试预期->1. 出现错误信息：请选择信息！
 * 测试步骤->2. 单击左键选择一条是否存在BOM一栏为是的信息，点击新增BOM按钮
 * 测试预期->2. 页面无反应，出现提示信息：BOM已存在
 * 测试步骤->3. 单击左键选择一条是否存在BOM一栏为否的信息，点击新增BOM按钮
 * 测试预期->3. 出现查看BOM窗口，含有各项车型BOM信息。
 * 
 */

public class 验证车型BOM信息功能是否可实现_新增BOM_3648 extends Selenium_Test_Base {
	
	public 验证车型BOM信息功能是否可实现_新增BOM_3648(){
		super();
	}
	
	public 验证车型BOM信息功能是否可实现_新增BOM_3648(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_车型BOM信息_337.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_车型BOM信息_337.rightFrame);
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
		getElement(ElementEnum_车型BOM信息_337.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_车型BOM信息_337.新增BOM按钮).click();
		WebDriverConfiguration.operationInterval();		
		assertTrue(driver.getPageSource().contains("请选择信息"));
		getElement(ElementEnum_车型BOM信息_337.错误信息确定按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_车型BOM信息_337.车型商标输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.车型商标输入框).sendKeys("test杨杨");
		getElement(ElementEnum_车型BOM信息_337.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		//BOM为是的一栏
		getElement(ElementEnum_车型BOM信息_337.检索BOM为是的行).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.新增BOM按钮).click();
		WebDriverConfiguration.operationInterval();
		//assertTrue(driver.getPageSource().contains("BOM已存在"));
		Alert alert = driver.switchTo().alert();  
	    String text = alert.getText();  
	    System.out.println(text);  
	    alert.dismiss();
		/*
		getElement(ElementEnum_车型BOM信息_337.检索BOM为否的行).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.新增BOM按钮).click();
		WebDriverConfiguration.operationInterval();
		*/
		
	}

	
	public String getDescription(){
		return "测试用例id: 3648\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型BOM信息(#337)\n"
				+" 用例名称: 验证车型BOM信息功能是否可实现-新增BOM\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 点击新增BOM按钮\n"
				+" 测试预期->1. 出现错误信息：请选择信息！\n"
				+" 测试步骤->2. 单击左键选择一条是否存在BOM一栏为是的信息，点击新增BOM按钮\n"
				+" 测试预期->2. 页面无反应，出现提示信息：BOM已存在\n"
				+" 测试步骤->3. 单击左键选择一条是否存在BOM一栏为否的信息，点击新增BOM按钮\n"
				+" 测试预期->3. 出现查看BOM窗口，含有各项车型BOM信息。\n"
;
	}

}

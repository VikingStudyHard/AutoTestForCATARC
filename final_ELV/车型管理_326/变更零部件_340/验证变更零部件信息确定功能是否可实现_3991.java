package cn.edu.tju.scs.seql.final_ELV.车型管理_326.变更零部件_340;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3991
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 变更零部件(#340)
 * 用例名称: 验证变更零部件信息确定功能是否可实现
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 点击车型信息版面中的确定按钮
 * 测试预期->1. 出现提示信息：您要选择一条记录
 * 测试步骤->2. 随机选择一条记录单击左键
 * 测试预期->2. 跳转至新页面，页面包含所选信息的零部件变更信息，可输入查询参数来查询变更信息。
 * 
 */

public class 验证变更零部件信息确定功能是否可实现_3991 extends Selenium_Test_Base {
	
	public 验证变更零部件信息确定功能是否可实现_3991(){
		super();
	}
	
	public 验证变更零部件信息确定功能是否可实现_3991(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_变更零部件_340.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_变更零部件_340.rightFrame);
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
		getElement(ElementEnum_变更零部件_340.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_变更零部件_340.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_变更零部件_340.确定按钮).click();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_变更零部件_340.未选中记录错误提示).getText(),
				"您要选择一条记录");
		getElement(ElementEnum_变更零部件_340.错误提示确定键).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_变更零部件_340.表格第一行).click();
		getElement(ElementEnum_变更零部件_340.确定按钮).click();
		WebDriverConfiguration.operationInterval();
	}

	
	public String getDescription(){
		return "测试用例id: 3991\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 变更零部件(#340)\n"
				+" 用例名称: 验证变更零部件信息确定功能是否可实现\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 点击车型信息版面中的确定按钮\n"
				+" 测试预期->1. 出现提示信息：您要选择一条记录\n"
				+" 测试步骤->2. 随机选择一条记录单击左键\n"
				+" 测试预期->2. 跳转至新页面，页面包含所选信息的零部件变更信息，可输入查询参数来查询变更信息。\n"
;
	}

}

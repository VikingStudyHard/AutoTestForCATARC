package cn.edu.tju.scs.seql.final_ELV.系统管理_330.供应商信息_361;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1068
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 供应商信息(#361)
 * 用例名称: 验证供应商信息新增功能是否可以实现-不操作处理
 * 前置条件: 能正确进入ELV环境合规系统（标准版）供应商信息界面
 * 测试步骤->1. 点击新增按钮
 * 测试预期->1. 出现新页面包含各项填写内容
 * 测试步骤->2. 点击窗口右上角关闭按钮
 * 测试预期->2. 页面跳转至最初页面，无新增供应商信息。
 * 
 */

public class 验证供应商信息新增功能是否可以实现_不操作处理_1068 extends Selenium_Test_Base {
	
	public 验证供应商信息新增功能是否可以实现_不操作处理_1068(){
		super();
	}
	
	public 验证供应商信息新增功能是否可以实现_不操作处理_1068(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_供应商信息_361.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_供应商信息_361.rightFrame);
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
		getElement(ElementEnum_供应商信息_361.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_供应商信息_361.新增按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.新增界面右上角关闭按钮).click();
		WebDriverConfiguration.operationInterval();
	
	}

	
	public String getDescription(){
		return "测试用例id: 1068\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 供应商信息(#361)\n"
				+" 用例名称: 验证供应商信息新增功能是否可以实现-不操作处理\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）供应商信息界面\n"
				+" 测试步骤->1. 点击新增按钮\n"
				+" 测试预期->1. 出现新页面包含各项填写内容\n"
				+" 测试步骤->2. 点击窗口右上角关闭按钮\n"
				+" 测试预期->2. 页面跳转至最初页面，无新增供应商信息。\n"
;
	}

}

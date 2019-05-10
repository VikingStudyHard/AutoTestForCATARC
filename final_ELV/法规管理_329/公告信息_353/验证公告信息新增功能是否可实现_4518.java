package cn.edu.tju.scs.seql.final_ELV.法规管理_329.公告信息_353;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4518
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 公告信息(#353)
 * 用例名称: 验证公告信息新增功能是否可实现
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击页面中的新增按钮
 * 测试预期->1. 跳转至新页面，页面为新增公告信息信息的详细内容界面，可填写标题等详细文本内容。
 * 测试步骤->2. 点击保存按钮
 * 测试预期->2. 页面中的标题填写框标记为红色，即为必填项目，页面无其他变化。
 * 测试步骤->3. 点击关闭按钮
 * 测试预期->3. 新增公告信息页面被正常关闭，页面返回到公告信息的初始页面。无新增内容。
 * 
 */

public class 验证公告信息新增功能是否可实现_4518 extends Selenium_Test_Base {
	
	public 验证公告信息新增功能是否可实现_4518(){
		super();
	}
	
	public 验证公告信息新增功能是否可实现_4518(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_公告信息_353.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_公告信息_353.rightFrame);
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
		getElement(ElementEnum_公告信息_353.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_公告信息_353.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		
		// TODO 新增功能使用showModalDialog实现，无法进行测试
		
	}

	
	public String getDescription(){
		return "测试用例id: 4518\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 公告信息(#353)\n"
				+" 用例名称: 验证公告信息新增功能是否可实现\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击页面中的新增按钮\n"
				+" 测试预期->1. 跳转至新页面，页面为新增公告信息信息的详细内容界面，可填写标题等详细文本内容。\n"
				+" 测试步骤->2. 点击保存按钮\n"
				+" 测试预期->2. 页面中的标题填写框标记为红色，即为必填项目，页面无其他变化。\n"
				+" 测试步骤->3. 点击关闭按钮\n"
				+" 测试预期->3. 新增公告信息页面被正常关闭，页面返回到公告信息的初始页面。无新增内容。\n"
;
	}

}

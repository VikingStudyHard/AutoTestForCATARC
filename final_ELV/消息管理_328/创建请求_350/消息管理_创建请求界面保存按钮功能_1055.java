package cn.edu.tju.scs.seql.final_ELV.消息管理_328.创建请求_350;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1055
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 创建请求(#350)
 * 用例名称: 消息管理-创建请求界面保存按钮功能
 * 前置条件: 
 * 测试步骤->1. 登录ELV环境合规系统，左侧树形结构选择 消息管理-创建请求
 * 测试预期->1. 进入创建请求界面，所有内容正常显示
 * 测试步骤->2. 根据提示按照要求正确填写内容，点击右下角保存按钮。
 * 测试预期->2. 提示该条请求保存成功，且相关数据后台成功插入到数据库中。返回到创建请求界面，右下角多出 发送 按钮。
 * 
 */

public class 消息管理_创建请求界面保存按钮功能_1055 extends Selenium_Test_Base {
	
	public 消息管理_创建请求界面保存按钮功能_1055(){
		super();
	}
	
	public 消息管理_创建请求界面保存按钮功能_1055(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_创建请求_350.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_创建请求_350.rightFrame);
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
		getElement(ElementEnum_创建请求_350.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_创建请求_350.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		消息管理_创建请求模块中星号项测试_1054 x = new 消息管理_创建请求模块中星号项测试_1054(driver);
		x.detailedOperation();
	}

	
	public String getDescription(){
		return "测试用例id: 1055\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 创建请求(#350)\n"
				+" 用例名称: 消息管理-创建请求界面保存按钮功能\n"
				+" 前置条件: \n"
				+" 测试步骤->1. 登录ELV环境合规系统，左侧树形结构选择 消息管理-创建请求\n"
				+" 测试预期->1. 进入创建请求界面，所有内容正常显示\n"
				+" 测试步骤->2. 根据提示按照要求正确填写内容，点击右下角保存按钮。\n"
				+" 测试预期->2. 提示该条请求保存成功，且相关数据后台成功插入到数据库中。返回到创建请求界面，右下角多出 发送 按钮。\n"
;
	}

}

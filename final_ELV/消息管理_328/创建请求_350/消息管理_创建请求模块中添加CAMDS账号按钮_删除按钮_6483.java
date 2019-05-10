package cn.edu.tju.scs.seql.final_ELV.消息管理_328.创建请求_350;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 6483
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 创建请求(#350)
 * 用例名称: 消息管理-创建请求模块中添加CAMDS账号按钮-删除按钮
 * 前置条件: 
 * 测试步骤->1. 登录ELV环境合规系统，左侧树形结构选择 消息管理-创建请求
 * 测试预期->1. 进入创建请求界面，所有内容正常显示 （包括：CAMDS账户（添加CAMDS账号按钮）、项目、材料数据供应商（查找按钮）、材料数据表类型、截止日期， 下方模块信息包括供货编号、供货名称、制图号、制图日期、制图修改号、备注、报表编号、报表日期、购货订单号、提货单号、供应商代码）
 * 测试步骤->2. 点击第一行 添加CAMDS账号 按钮
 * 测试预期->2. 弹出创建账号信息， 包括：用户名、密码、企业部门ID以及下方使用记录列表，还有删除、添加按钮
 * 测试步骤->3. 选择某一条使用记录， 点击删除按钮
 * 测试预期->3. 该使用记录被删除
 * 
 */

public class 消息管理_创建请求模块中添加CAMDS账号按钮_删除按钮_6483 extends Selenium_Test_Base {
	
	public 消息管理_创建请求模块中添加CAMDS账号按钮_删除按钮_6483(){
		super();
	}
	
	public 消息管理_创建请求模块中添加CAMDS账号按钮_删除按钮_6483(WebDriver driver){
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
		CommonOperations_创建请求_350 a = new CommonOperations_创建请求_350(driver);
		a.addOneCAMDSAccount();
		getElement(ElementEnum_创建请求_350.添加CAMDS账号按钮).click();
		WebDriverConfiguration.operationInterval();
		a.deleteRecord(a.getDefault_name());
	}

	
	public String getDescription(){
		return "测试用例id: 6483\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 创建请求(#350)\n"
				+" 用例名称: 消息管理-创建请求模块中添加CAMDS账号按钮-删除按钮\n"
				+" 前置条件: \n"
				+" 测试步骤->1. 登录ELV环境合规系统，左侧树形结构选择 消息管理-创建请求\n"
				+" 测试预期->1. 进入创建请求界面，所有内容正常显示 （包括：CAMDS账户（添加CAMDS账号按钮）、项目、材料数据供应商（查找按钮）、材料数据表类型、截止日期， 下方模块信息包括供货编号、供货名称、制图号、制图日期、制图修改号、备注、报表编号、报表日期、购货订单号、提货单号、供应商代码）\n"
				+" 测试步骤->2. 点击第一行 添加CAMDS账号 按钮\n"
				+" 测试预期->2. 弹出创建账号信息， 包括：用户名、密码、企业部门ID以及下方使用记录列表，还有删除、添加按钮\n"
				+" 测试步骤->3. 选择某一条使用记录， 点击删除按钮\n"
				+" 测试预期->3. 该使用记录被删除\n"
;
	}

}

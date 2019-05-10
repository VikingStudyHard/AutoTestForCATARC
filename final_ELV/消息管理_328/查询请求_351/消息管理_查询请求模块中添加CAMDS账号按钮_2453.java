package cn.edu.tju.scs.seql.final_ELV.消息管理_328.查询请求_351;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2453
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 查询请求(#351)
 * 用例名称: 消息管理-查询请求模块中添加CAMDS账号按钮
 * 前置条件: 
 * 测试步骤->1. 登录ELV环境合规系统，左侧树形结构选择 消息管理-查询请求
 * 测试预期->1. 进入创建请求界面，所有内容正常显示 （包括：CAMDS账户（添加CAMDS账号按钮）、请求类型、项目名称、材料数据表类型、部门、截止日期、供货编号、供货名称、已指派的材料数据表、请求状态）
 * 测试步骤->2. 点击第一行 添加CAMDS账号 按钮
 * 测试预期->2. 弹出创建账号信息， 包括：用户名、密码、企业部门ID以及下方使用记录列表，还有删除、添加按钮
 * 测试步骤->3. 用户名、密码、企业ID均为空， 点击添加按钮
 * 测试预期->3. 弹出提示框提示请输入用户名、密码、企业ID
 * 测试步骤->4. 只填写用户名， 密码、企业ID为空， 点击添加按钮
 * 测试预期->4. 弹出提示框提示填写密码和企业ID
 * 测试步骤->5. 填写用户名和密码， 企业ID为空， 点击添加按钮
 * 测试预期->5. 弹出提示框提示填写企业ID
 * 测试步骤->6. 正确填写用户名、密码、企业ID， 点击添加按钮
 * 测试预期->6. 创建新号窗口关闭， CAMDS账号一栏下拉条中出现刚刚创建的账户名称
 * 测试步骤->7. 再次点击添加CAMDS账号按钮，
 * 测试预期->7. 在弹出的创建新号窗口中，使用记录列表出现步骤6中所创建的用户
 * 测试步骤->8. 点击该条记录， 该条记录颜色变深， 点击删除按钮
 * 测试预期->8. 创新信号窗口关闭， 回到创建请求界面，CAMDS账号一栏下拉框中步骤6所创建用户被删除
 * 
 */

public class 消息管理_查询请求模块中添加CAMDS账号按钮_2453 extends Selenium_Test_Base {
	
	public 消息管理_查询请求模块中添加CAMDS账号按钮_2453(){
		super();
	}
	
	public 消息管理_查询请求模块中添加CAMDS账号按钮_2453(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_查询请求_351.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_查询请求_351.rightFrame);
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
		// TODO 该用例尚未实现，请检查
	/*
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_查询请求_351.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_查询请求_351.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	*/
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		/*
		assertEquals(driver.findElement(By.xpath("//td")).getText(), "企业名称:");
	    assertEquals(driver.findElement(By.xpath("//td[3]")).getText(), "企业ID:");
	    assertEquals(driver.findElement(By.xpath("//td[5]")).getText(), "计划员:");
	    assertEquals(driver.findElement(By.xpath("//td[7]")).getText(), "区域");
	    assertEquals(driver.findElement(By.xpath("//td[9]")).getText(), "新增信息来源");
	    assertEquals(driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td/div/input")).getText(), "");
		*/
	
	}

	
	public String getDescription(){
		return "测试用例id: 2453\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 查询请求(#351)\n"
				+" 用例名称: 消息管理-查询请求模块中添加CAMDS账号按钮\n"
				+" 前置条件: \n"
				+" 测试步骤->1. 登录ELV环境合规系统，左侧树形结构选择 消息管理-查询请求\n"
				+" 测试预期->1. 进入创建请求界面，所有内容正常显示 （包括：CAMDS账户（添加CAMDS账号按钮）、请求类型、项目名称、材料数据表类型、部门、截止日期、供货编号、供货名称、已指派的材料数据表、请求状态）\n"
				+" 测试步骤->2. 点击第一行 添加CAMDS账号 按钮\n"
				+" 测试预期->2. 弹出创建账号信息， 包括：用户名、密码、企业部门ID以及下方使用记录列表，还有删除、添加按钮\n"
				+" 测试步骤->3. 用户名、密码、企业ID均为空， 点击添加按钮\n"
				+" 测试预期->3. 弹出提示框提示请输入用户名、密码、企业ID\n"
				+" 测试步骤->4. 只填写用户名， 密码、企业ID为空， 点击添加按钮\n"
				+" 测试预期->4. 弹出提示框提示填写密码和企业ID\n"
				+" 测试步骤->5. 填写用户名和密码， 企业ID为空， 点击添加按钮\n"
				+" 测试预期->5. 弹出提示框提示填写企业ID\n"
				+" 测试步骤->6. 正确填写用户名、密码、企业ID， 点击添加按钮\n"
				+" 测试预期->6. 创建新号窗口关闭， CAMDS账号一栏下拉条中出现刚刚创建的账户名称\n"
				+" 测试步骤->7. 再次点击添加CAMDS账号按钮，\n"
				+" 测试预期->7. 在弹出的创建新号窗口中，使用记录列表出现步骤6中所创建的用户\n"
				+" 测试步骤->8. 点击该条记录， 该条记录颜色变深， 点击删除按钮\n"
				+" 测试预期->8. 创新信号窗口关闭， 回到创建请求界面，CAMDS账号一栏下拉框中步骤6所创建用户被删除\n"
;
	}

}

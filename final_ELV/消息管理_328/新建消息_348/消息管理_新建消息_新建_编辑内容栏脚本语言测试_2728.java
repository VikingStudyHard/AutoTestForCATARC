package cn.edu.tju.scs.seql.final_ELV.消息管理_328.新建消息_348;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2728
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 新建消息(#348)
 * 用例名称: 消息管理-新建消息-新建/编辑内容栏脚本语言测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息
 *         第一栏BOM节点版本组号栏选择任一组号，
 *         标题栏填写“test”，
 *         接收人栏任意选择一人，
 * 测试步骤->1. 新建/编辑内容栏输入"&lt;script&gt;alert("test");&lt;/script&gt;"，点击保存按钮
 * 测试预期->1. 弹出提示框提示数据已保存，并跳转至消息查询界面，该条消息状态显示为未发送，其他信息均为所填信息
 * 测试步骤->2. 勾选该条消息，点击左上角的查看按钮
 * 测试预期->2. 弹出消息详细信息窗口，内容栏显示为“&lt;script&gt;alert("test");&lt;/script&gt;”
 * 测试步骤->3. 标题栏改为”test2“，新建/编辑内容栏输入"<script>alert("test");</script>“，点击保存按钮
 * 测试预期->3. 弹出提示框提示数据已保存，并跳转至消息查询界面，该条消息状态显示为未发送，其他信息均为所填信息
 * 测试步骤->4. 勾选该条消息，点击左上角的查看按钮
 * 测试预期->4. 弹出消息详细信息窗口，内容栏显示为"<script>alert("test");</script>“
 * 
 */

public class 消息管理_新建消息_新建_编辑内容栏脚本语言测试_2728 extends Selenium_Test_Base {
	
	public 消息管理_新建消息_新建_编辑内容栏脚本语言测试_2728(){
		super();
	}
	
	public 消息管理_新建消息_新建_编辑内容栏脚本语言测试_2728(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_新建消息_348.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_新建消息_348.rightFrame);
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
		getElement(ElementEnum_新建消息_348.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_新建消息_348.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		testContent("&lt;script&gt;alert(\\'test\\');&lt;/script&gt;");
		testContent("<script>alert(\\'test\\');</script>");
		
	}
	
	public void testContent(String inputContent){
		CommonOperations_新建消息_348 a = new CommonOperations_新建消息_348(driver);
		a.changeBackToAddNew();
		a.deleteReadOnly();
		
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).clear();
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).sendKeys("EM_5_2238840");
		a.inputContent(inputContent);
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_新建消息_348.保存信息按钮).click();
		WebDriverConfiguration.operationInterval();
		a.dealWithAlert("数据已保存");
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		a.changeToQueryMsg();
		
		// TODO 后边使用showModalDialog弹出框，无法进行验证
		
//		((JavascriptExecutor) driver).executeScript("window.showModalDialog = window.open;");
//		getElement(ElementEnum_信息查询_349.检索结果第一行消息标题).click();
//		WebDriverConfiguration.operationInterval();
//		getElement(ElementEnum_信息查询_349.查看按钮).click();
//		String currentWindow  = driver.getWindowHandle();
//		a.switchToNextWindow();
//		
//		WebElement inputFrame=getElement(ElementEnum_新建消息_348.内容输入frame);
//		driver.switchTo().frame(inputFrame);
//		String s = driver.findElement(By.xpath("html/body")).getText();
//		assertEquals(s, inputContent);
//		driver.switchTo().parentFrame();
//		
//		
//		
//		driver.switchTo().window(currentWindow);
		
	}

	
	public String getDescription(){
		return "测试用例id: 2728\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 新建消息(#348)\n"
				+" 用例名称: 消息管理-新建消息-新建/编辑内容栏脚本语言测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息 第一栏BOM节点版本组号栏选择任一组号， 标题栏填写“test”， 接收人栏任意选择一人，\n"
				+" 测试步骤->1. 新建/编辑内容栏输入“&lt;script&gt;alert(“test“);&lt;/script&gt;“，点击保存按钮\n"
				+" 测试预期->1. 弹出提示框提示数据已保存，并跳转至消息查询界面，该条消息状态显示为未发送，其他信息均为所填信息\n"
				+" 测试步骤->2. 勾选该条消息，点击左上角的查看按钮\n"
				+" 测试预期->2. 弹出消息详细信息窗口，内容栏显示为“&lt;script&gt;alert(“test“);&lt;/script&gt;”\n"
				+" 测试步骤->3. 标题栏改为”test2“，新建/编辑内容栏输入“<script>alert(“test“);</script>“，点击保存按钮\n"
				+" 测试预期->3. 弹出提示框提示数据已保存，并跳转至消息查询界面，该条消息状态显示为未发送，其他信息均为所填信息\n"
				+" 测试步骤->4. 勾选该条消息，点击左上角的查看按钮\n"
				+" 测试预期->4. 弹出消息详细信息窗口，内容栏显示为“<script>alert(“test“);</script>“\n"
;
	}

}

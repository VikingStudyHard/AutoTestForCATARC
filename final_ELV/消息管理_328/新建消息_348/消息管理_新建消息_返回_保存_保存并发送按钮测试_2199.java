package cn.edu.tju.scs.seql.final_ELV.消息管理_328.新建消息_348;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.final_ELV.消息管理_328.信息查询_349.ElementEnum_信息查询_349;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2199
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 新建消息(#348)
 * 用例名称: 消息管理-新建消息-返回、保存、保存并发送按钮测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息
 *         第一栏BOM节点版本组号栏选择任一组号，
 *         标题栏填写“Han”，
 *         接收人栏任意选择一人，
 *         新建/编辑内容栏输入“This is a test”，
 *         所有栏均不为空
 * 测试步骤->1. 点击返回按钮
 * 测试预期->1. 界面跳转至上一页面
 * 测试步骤->2. 回到新建消息界面，按照前置条件内填写完整，点击保存按钮
 * 测试预期->2. 弹出提示框提示数据已保存，并跳转至消息查询界面，该条消息状态显示为未发送，其他信息均为所填信息
 * 测试步骤->3. 回到新建消息界面，标题填写为“test2”，其余按照前置条件将内容填写完整，点击保存并发送信息
 * 测试预期->3. 弹出提示框提示数据已保存并发送，点击确认后跳转至消息查询界面，该条消息状态为已发送，其余信息与填写信息一致
 * 测试步骤->4. 回到新建消息界面，标题填写为“test3”，接收人任意选择二人或二人以上，其余按照前置条件将内容填写完整，点击保存并发送信息
 * 测试预期->4. 弹出提示框提示数据已保存并发送，点击确认后跳转至消息查询界面，该条消息状态为已发送，且每个收件人都是独立的一行，其余信息与填写信息一致
 * 
 */

public class 消息管理_新建消息_返回_保存_保存并发送按钮测试_2199 extends Selenium_Test_Base {
	
	public 消息管理_新建消息_返回_保存_保存并发送按钮测试_2199(){
		super();
	}
	
	public 消息管理_新建消息_返回_保存_保存并发送按钮测试_2199(WebDriver driver){
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
		CommonOperations_新建消息_348 a = new CommonOperations_新建消息_348(driver);
		fillInformation();
		getElement(ElementEnum_新建消息_348.返回按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_新建消息_348.返回按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		a.changeBackToAddNew();
		
		fillInformation();
		
		getElement(ElementEnum_新建消息_348.保存并发送信息按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		a.dealWithAlert("数据已保存并发送");
		
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		a.changeToQueryMsg();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_信息查询_349.检索结果第一行消息标题).getText(), "樊向宇试试怎么发消息");
		assertEquals(getElement(ElementEnum_信息查询_349.检索结果第一行接收人).getText(), "樊向宇的selenium再奔跑");
		assertEquals(getElement(ElementEnum_信息查询_349.检索结果第一行状态).getText(), "已发送");
	}
	
	public void fillInformation(){
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框);
		getElement(ElementEnum_新建消息_348.接收人输入框);
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_新建消息_348.BOM节点版本组号输入框.getName()+"\");setDate.removeAttribute('readonly');");
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_新建消息_348.接收人输入框.getName()+"\");setDate.removeAttribute('readonly');");
		
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).clear();
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).sendKeys("EM_5_2238840");
		getElement(ElementEnum_新建消息_348.标题输入框).clear();
		getElement(ElementEnum_新建消息_348.标题输入框).sendKeys("樊向宇试试怎么发消息");
		
		String addMsgScript = "addRecipientEntOrg('樊向宇的selenium再奔跑', '779493');";
		((JavascriptExecutor)driver).executeScript(addMsgScript);
		
		WebElement inputFrame=getElement(ElementEnum_新建消息_348.内容输入frame);
		driver.switchTo().frame(inputFrame);
		String s = driver.findElement(By.xpath("html/body")).getText();
		
		String addMsgContentScript = "var body = document.getElementsByTagName('body');body[0].innerHTML = '" + "樊向宇试试怎么发消息的具体内容" + "';";
		((JavascriptExecutor)driver).executeScript(addMsgContentScript);
		
		driver.switchTo().parentFrame();
	}

	
	public String getDescription(){
		return "测试用例id: 2199\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 新建消息(#348)\n"
				+" 用例名称: 消息管理-新建消息-返回、保存、保存并发送按钮测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息 第一栏BOM节点版本组号栏选择任一组号， 标题栏填写“Han”， 接收人栏任意选择一人， 新建/编辑内容栏输入“This is a test”， 所有栏均不为空\n"
				+" 测试步骤->1. 点击返回按钮\n"
				+" 测试预期->1. 界面跳转至上一页面\n"
				+" 测试步骤->2. 回到新建消息界面，按照前置条件内填写完整，点击保存按钮\n"
				+" 测试预期->2. 弹出提示框提示数据已保存，并跳转至消息查询界面，该条消息状态显示为未发送，其他信息均为所填信息\n"
				+" 测试步骤->3. 回到新建消息界面，标题填写为“test2”，其余按照前置条件将内容填写完整，点击保存并发送信息\n"
				+" 测试预期->3. 弹出提示框提示数据已保存并发送，点击确认后跳转至消息查询界面，该条消息状态为已发送，其余信息与填写信息一致\n"
				+" 测试步骤->4. 回到新建消息界面，标题填写为“test3”，接收人任意选择二人或二人以上，其余按照前置条件将内容填写完整，点击保存并发送信息\n"
				+" 测试预期->4. 弹出提示框提示数据已保存并发送，点击确认后跳转至消息查询界面，该条消息状态为已发送，且每个收件人都是独立的一行，其余信息与填写信息一致\n"
;
	}

}

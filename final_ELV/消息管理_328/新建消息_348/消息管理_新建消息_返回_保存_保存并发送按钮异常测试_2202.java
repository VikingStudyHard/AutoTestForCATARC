package cn.edu.tju.scs.seql.final_ELV.消息管理_328.新建消息_348;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2202
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 新建消息(#348)
 * 用例名称: 消息管理-新建消息-返回、保存、保存并发送按钮异常测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息
 * 测试步骤->1. 内容均不填写，点击保存或保存并发送信息按钮
 * 测试预期->1. 弹出提示框提示输入BOM节点版本组号
 * 测试步骤->2. 任意选择BOM节点版本组号使其不为空， 其余项为空， 点击保存按钮
 * 测试预期->2. 提示数据已保存， 跳转至消息查询界面， 该条信息状态为未发送， BOM节点版本组号为所选择的组号， 其余信息为空。
 * 测试步骤->3. 回到新建消息界面， 任意选择BOM节点版本组号使其不为空， 其余项为空， 点击保存并发送信息按钮
 * 测试预期->3. 提示输入接收人
 * 测试步骤->4. 只填写标题项，点击保存或保存并发送信息按钮
 * 测试预期->4. 弹出提示框提示输入BOM节点版本组号
 * 测试步骤->5. 只填写收件人项，点击保存或保存并发送按钮
 * 测试预期->5. 弹出提示框提示输入BOM节点版本组号
 * 测试步骤->6. 只填写新建/编辑内容，点击保存或保存并发送按钮
 * 测试预期->6. 弹出提示框提示输入BOM节点版本组号
 * 测试步骤->7. 只填写BOM节点版本组号和标题， 或， 只填写BOM节点版本组号和新建/编辑内容， 点击保存按钮
 * 测试预期->7. 提示数据已保存， 跳转至消息查询界面， 该条信息状态为未发送， 
 * 测试步骤->8. 只填写BOM节点版本组号和标题， 或， 只填写BOM节点版本组号和新建/编辑内容， 点击保存并发送信息按钮
 * 测试预期->8. 弹出提示框提示输入接收人
 * 测试步骤->9. 只填写BOM节点版本组号和接收人， 点击保存按钮
 * 测试预期->9. 提示数据已保存， 跳转至消息查询界面， 该条信息状态为未发送
 * 测试步骤->10. 只填写BOM节点版本组号和接收人， 点击保存并发送按钮
 * 测试预期->10. 提示消息已发送， 跳转至消息查询界面， 该条信息状态为已发送。
 * 
 */

public class 消息管理_新建消息_返回_保存_保存并发送按钮异常测试_2202 extends Selenium_Test_Base {
	
	public 消息管理_新建消息_返回_保存_保存并发送按钮异常测试_2202(){
		super();
	}
	
	public 消息管理_新建消息_返回_保存_保存并发送按钮异常测试_2202(WebDriver driver){
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
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_新建消息_348.保存信息按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.dealWithAlert("请输入BOM节点零部件版本组号");
		
		getElement(ElementEnum_新建消息_348.保存并发送信息按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.dealWithAlert("请输入BOM节点零部件版本组号");
		
		a.deleteReadOnly();
		
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).clear();
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).sendKeys("EM_5_2238840");
		
		getElement(ElementEnum_新建消息_348.保存并发送信息按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.dealWithAlert("请输入接收人");
		
		a.changeBackToAddNew();
		getElement(ElementEnum_新建消息_348.标题输入框).clear();
		getElement(ElementEnum_新建消息_348.标题输入框).sendKeys("樊向宇试试怎么发消息");
		getElement(ElementEnum_新建消息_348.保存并发送信息按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.dealWithAlert("请输入BOM节点零部件版本组号");
		
		a.changeBackToAddNew();
		a.deleteReadOnly();
		String addMsgReceiverScript = "addRecipientEntOrg('樊向宇的selenium再奔跑', '779493');";
		((JavascriptExecutor)driver).executeScript(addMsgReceiverScript);
		getElement(ElementEnum_新建消息_348.保存并发送信息按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.dealWithAlert("请输入BOM节点零部件版本组号");
		
		a.changeBackToAddNew();
		a.deleteReadOnly();
		a.inputContent("樊向宇试试怎么发消息的具体内容");
		getElement(ElementEnum_新建消息_348.保存并发送信息按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.dealWithAlert("请输入BOM节点零部件版本组号");
		
		a.changeBackToAddNew();
		a.deleteReadOnly();
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).clear();
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).sendKeys("EM_5_2238840");
		getElement(ElementEnum_新建消息_348.标题输入框).clear();
		getElement(ElementEnum_新建消息_348.标题输入框).sendKeys("樊向宇试试怎么发消息");
		getElement(ElementEnum_新建消息_348.保存信息按钮).click();
		WebDriverConfiguration.operationInterval();
		a.dealWithAlert("数据已保存");
		
		a.changeBackToAddNew();
		a.deleteReadOnly();
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).clear();
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).sendKeys("EM_5_2238840");
		getElement(ElementEnum_新建消息_348.标题输入框).clear();
		getElement(ElementEnum_新建消息_348.标题输入框).sendKeys("樊向宇试试怎么发消息");
		getElement(ElementEnum_新建消息_348.保存并发送信息按钮).click();
		WebDriverConfiguration.operationInterval();
		a.dealWithAlert("请输入接收人");
		
		a.changeBackToAddNew();
		a.deleteReadOnly();
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).clear();
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).sendKeys("EM_5_2238840");
		a.inputContent("樊向宇试试怎么发消息的具体内容");
		getElement(ElementEnum_新建消息_348.保存信息按钮).click();
		WebDriverConfiguration.operationInterval();
		a.dealWithAlert("数据已保存");
		
		a.changeBackToAddNew();
		a.deleteReadOnly();
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).clear();
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).sendKeys("EM_5_2238840");
		a.inputContent("樊向宇试试怎么发消息的具体内容");
		getElement(ElementEnum_新建消息_348.保存并发送信息按钮).click();
		WebDriverConfiguration.operationInterval();
		a.dealWithAlert("请输入接收人");
		
		a.changeBackToAddNew();
		a.deleteReadOnly();
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).clear();
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).sendKeys("EM_5_2238840");
		((JavascriptExecutor)driver).executeScript(addMsgReceiverScript);
		getElement(ElementEnum_新建消息_348.保存信息按钮).click();
		WebDriverConfiguration.operationInterval();
		a.dealWithAlert("数据已保存");
		
		a.changeBackToAddNew();
		a.deleteReadOnly();
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).clear();
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).sendKeys("EM_5_2238840");
		((JavascriptExecutor)driver).executeScript(addMsgReceiverScript);
		getElement(ElementEnum_新建消息_348.保存并发送信息按钮).click();
		WebDriverConfiguration.operationInterval();
		a.dealWithAlert("数据已保存并发送");
		
	}

	public String getDescription(){
		return "测试用例id: 2202\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 新建消息(#348)\n"
				+" 用例名称: 消息管理-新建消息-返回、保存、保存并发送按钮异常测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息\n"
				+" 测试步骤->1. 内容均不填写，点击保存或保存并发送信息按钮\n"
				+" 测试预期->1. 弹出提示框提示输入BOM节点版本组号\n"
				+" 测试步骤->2. 任意选择BOM节点版本组号使其不为空， 其余项为空， 点击保存按钮\n"
				+" 测试预期->2. 提示数据已保存， 跳转至消息查询界面， 该条信息状态为未发送， BOM节点版本组号为所选择的组号， 其余信息为空。\n"
				+" 测试步骤->3. 回到新建消息界面， 任意选择BOM节点版本组号使其不为空， 其余项为空， 点击保存并发送信息按钮\n"
				+" 测试预期->3. 提示输入接收人\n"
				+" 测试步骤->4. 只填写标题项，点击保存或保存并发送信息按钮\n"
				+" 测试预期->4. 弹出提示框提示输入BOM节点版本组号\n"
				+" 测试步骤->5. 只填写收件人项，点击保存或保存并发送按钮\n"
				+" 测试预期->5. 弹出提示框提示输入BOM节点版本组号\n"
				+" 测试步骤->6. 只填写新建/编辑内容，点击保存或保存并发送按钮\n"
				+" 测试预期->6. 弹出提示框提示输入BOM节点版本组号\n"
				+" 测试步骤->7. 只填写BOM节点版本组号和标题， 或， 只填写BOM节点版本组号和新建/编辑内容， 点击保存按钮\n"
				+" 测试预期->7. 提示数据已保存， 跳转至消息查询界面， 该条信息状态为未发送， \n"
				+" 测试步骤->8. 只填写BOM节点版本组号和标题， 或， 只填写BOM节点版本组号和新建/编辑内容， 点击保存并发送信息按钮\n"
				+" 测试预期->8. 弹出提示框提示输入接收人\n"
				+" 测试步骤->9. 只填写BOM节点版本组号和接收人， 点击保存按钮\n"
				+" 测试预期->9. 提示数据已保存， 跳转至消息查询界面， 该条信息状态为未发送\n"
				+" 测试步骤->10. 只填写BOM节点版本组号和接收人， 点击保存并发送按钮\n"
				+" 测试预期->10. 提示消息已发送， 跳转至消息查询界面， 该条信息状态为已发送。\n"
;
	}

}

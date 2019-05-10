package cn.edu.tju.scs.seql.final_ELV.消息管理_328.信息查询_349;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.final_ELV.消息管理_328.新建消息_348.ElementEnum_新建消息_348;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2730
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 信息查询(#349)
 * 用例名称: 消息管理-消息查询模块中编辑功能的测试（1）
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询
 *         
 * 测试步骤->1. 勾选某一状态为未发送、收件人不为空的消息 点击编辑按钮
 * 测试预期->1. 页面跳转至编辑界面， 界面显示为： BOM节点版本组号、标题、接收人（无查找按钮）、新建/编辑内容，以及返回和保存信息按钮
 * 测试步骤->2. 鼠标点击第一行“BOM节点版本组号”， 光标定位在输入框内， 按一下退格按键
 * 测试预期->2. 无任何反应， BOM节点版本组号不会被删除
 * 测试步骤->3. 鼠标点击第三行“接收人”， 光标定位在输入框内， 按一下退格按键
 * 测试预期->3. 无任何反应， 接收人信息不会被删除
 * 测试步骤->4. 鼠标点击第二行标题栏， 删除文本框内内容， 输入"test"
 * 测试预期->4. 文本框内内容可删除，可输入
 * 测试步骤->5. 鼠标点击新建/编辑内容栏， 删除文本框内内容， 输入“this is a test ”
 * 测试预期->5. 文本框内内容可删除，可输入
 * 测试步骤->6. 点击返回按钮
 * 测试预期->6. 界面跳转回消息查询界面， 且步骤1中所勾选消息并未被修改
 * 测试步骤->7. 重复步骤1-步骤5， 点击保存按钮
 * 测试预期->7. 界面跳转到消息查询界面，
 * 测试步骤->8. 勾选该条消息， 点击左上方查看按钮
 * 测试预期->8. 弹出消息框显示详细信息， 内容均为已修改内容
 * 
 */

public class 消息管理_消息查询模块中编辑功能的测试_1__2730 extends Selenium_Test_Base {
	
	public 消息管理_消息查询模块中编辑功能的测试_1__2730(){
		super();
	}
	
	public 消息管理_消息查询模块中编辑功能的测试_1__2730(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_信息查询_349.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_信息查询_349.rightFrame);
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
		getElement(ElementEnum_信息查询_349.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_信息查询_349.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_信息查询_349 a = new CommonOperations_信息查询_349(driver);
		a.verifyFirstOneMyRecordWithReceiver();
		getElement(ElementEnum_信息查询_349.检索结果第一行消息标题).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_信息查询_349.编辑按钮).click();
		
		String firstLineNum = getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).getAttribute("value");
		String receiver = getElement(ElementEnum_新建消息_348.接收人输入框).getAttribute("value");
		String title = getElement(ElementEnum_新建消息_348.标题输入框).getAttribute("value");
		
		Actions action = new Actions(driver);
		action.click(getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框));
		action.clickAndHold(getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框));
		action.doubleClick(getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框));
		action.sendKeys(Keys.BACK_SPACE);
		
		action.click(getElement(ElementEnum_新建消息_348.接收人输入框));
		action.sendKeys(Keys.BACK_SPACE);
		
		getElement(ElementEnum_新建消息_348.标题输入框).clear();
		getElement(ElementEnum_新建消息_348.标题输入框).sendKeys("樊向宇试试怎么发消息test");
		
		assertEquals(getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).getAttribute("value"), firstLineNum);
		assertEquals(getElement(ElementEnum_新建消息_348.接收人输入框).getAttribute("value"), receiver);
		assertEquals(getElement(ElementEnum_新建消息_348.标题输入框).getAttribute("value"), "樊向宇试试怎么发消息test");
		
		getElement(ElementEnum_新建消息_348.返回按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_新建消息_348.返回按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_信息查询_349.检索结果第一行消息标题).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_信息查询_349.编辑按钮).click();
		WebDriverConfiguration.operationInterval();
		
		assertEquals(getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).getAttribute("value"), firstLineNum);
		assertEquals(getElement(ElementEnum_新建消息_348.接收人输入框).getAttribute("value"), receiver);
		assertEquals(getElement(ElementEnum_新建消息_348.标题输入框).getAttribute("value"), title);
		
		action.click(getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框));
		action.sendKeys(Keys.BACK_SPACE);
		
		action.click(getElement(ElementEnum_新建消息_348.接收人输入框));
		action.sendKeys(Keys.BACK_SPACE);
		
		getElement(ElementEnum_新建消息_348.标题输入框).clear();
		getElement(ElementEnum_新建消息_348.标题输入框).sendKeys("樊向宇试试怎么发消息test");
		
		assertEquals(getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).getAttribute("value"), firstLineNum);
		assertEquals(getElement(ElementEnum_新建消息_348.接收人输入框).getAttribute("value"), receiver);
		assertEquals(getElement(ElementEnum_新建消息_348.标题输入框).getAttribute("value"), "樊向宇试试怎么发消息test");
		
		getElement(ElementEnum_新建消息_348.保存信息按钮).click();
		WebDriverConfiguration.operationInterval();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Assert.assertTrue(alert.getText().contains("数据已保存"));
		alert.accept();
		
		String titleName = getElement(ElementEnum_信息查询_349.检索结果第一行消息标题).getText();
		assertEquals(titleName, "樊向宇试试怎么发消息test");
		a.deleteFirstRecord();
		
	}

	
	public String getDescription(){
		return "测试用例id: 2730\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 信息查询(#349)\n"
				+" 用例名称: 消息管理-消息查询模块中编辑功能的测试（1）\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询 \n"
				+" 测试步骤->1. 勾选某一状态为未发送、收件人不为空的消息 点击编辑按钮\n"
				+" 测试预期->1. 页面跳转至编辑界面， 界面显示为： BOM节点版本组号、标题、接收人（无查找按钮）、新建/编辑内容，以及返回和保存信息按钮\n"
				+" 测试步骤->2. 鼠标点击第一行“BOM节点版本组号”， 光标定位在输入框内， 按一下退格按键\n"
				+" 测试预期->2. 无任何反应， BOM节点版本组号不会被删除\n"
				+" 测试步骤->3. 鼠标点击第三行“接收人”， 光标定位在输入框内， 按一下退格按键\n"
				+" 测试预期->3. 无任何反应， 接收人信息不会被删除\n"
				+" 测试步骤->4. 鼠标点击第二行标题栏， 删除文本框内内容， 输入“test“\n"
				+" 测试预期->4. 文本框内内容可删除，可输入\n"
				+" 测试步骤->5. 鼠标点击新建/编辑内容栏， 删除文本框内内容， 输入“this is a test ”\n"
				+" 测试预期->5. 文本框内内容可删除，可输入\n"
				+" 测试步骤->6. 点击返回按钮\n"
				+" 测试预期->6. 界面跳转回消息查询界面， 且步骤1中所勾选消息并未被修改\n"
				+" 测试步骤->7. 重复步骤1-步骤5， 点击保存按钮\n"
				+" 测试预期->7. 界面跳转到消息查询界面，\n"
				+" 测试步骤->8. 勾选该条消息， 点击左上方查看按钮\n"
				+" 测试预期->8. 弹出消息框显示详细信息， 内容均为已修改内容\n"
;
	}

}

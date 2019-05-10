package cn.edu.tju.scs.seql.final_ELV.消息管理_328.信息查询_349;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.final_ELV.消息管理_328.新建消息_348.ElementEnum_新建消息_348;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2733
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 信息查询(#349)
 * 用例名称: 消息管理-消息查询-消息编辑的新建/编辑内容栏脚本语言测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询
 *         勾选某一状态为未发送的消息
 *         点击编辑按钮
 * 测试步骤->1. 新建/编辑内容栏输入"<script>alert("test");</script>"，点击保存按钮
 * 测试预期->1. 弹出提示框提示数据已保存， 并跳转至消息查询界面， 其他信息均为所填信息
 * 测试步骤->2. 勾选该条消息，点击左上角的查看按钮
 * 测试预期->2. 弹出消息详细信息窗口， 内容栏显示为“<script>alert("test");</script>”
 * 测试步骤->3. 回到消息查询界面， 勾选该条消息，点击编辑按钮 弹出界面的新建/编辑内容栏输入"<script>alert("test");</script>“， 点击保存按钮 
 * 测试预期->3. 弹出提示框提示数据已保存， 并跳转至消息查询界面， 其他信息均为所填信息
 * 测试步骤->4. 勾选该条消息，点击左上角的查看按钮
 * 测试预期->4. 弹出消息详细信息窗口，内容栏显示为"<script>alert("test");</script>“
 * 
 */

public class 消息管理_消息查询_消息编辑的新建_编辑内容栏脚本语言测试_2733 extends Selenium_Test_Base {
	
	public 消息管理_消息查询_消息编辑的新建_编辑内容栏脚本语言测试_2733(){
		super();
	}
	
	public 消息管理_消息查询_消息编辑的新建_编辑内容栏脚本语言测试_2733(WebDriver driver){
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
		a.verifyFirstNMyRecord(1);
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_信息查询_349.检索结果第一行消息标题).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_信息查询_349.编辑按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		String content = "\\<script\\>alert('樊向宇试试怎么发消息');\\</script\\>";
		content = "&lt;script&gt;alert(\\'樊向宇试试怎么发消息\\');&lt;/script&gt;";
		changeContent(content);
		getElement(ElementEnum_新建消息_348.保存信息按钮).click();
		
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Assert.assertTrue(alert.getText().contains("数据已保存"));
		alert.accept();
		
		
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_信息查询_349.检索结果第一行消息标题).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_信息查询_349.编辑按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		WebElement inputFrame=getElement(ElementEnum_新建消息_348.内容输入frame);
		driver.switchTo().frame(inputFrame);
		String s = driver.findElement(By.xpath("html/body")).getText();
		assertEquals(s, "<script>alert('樊向宇试试怎么发消息');</script>");
		
	}
	
	public void changeContent(String content){
		WebElement inputFrame=getElement(ElementEnum_新建消息_348.内容输入frame);
		driver.switchTo().frame(inputFrame);
		String s = driver.findElement(By.xpath("html/body")).getText();
		
		try {
			String script = "var body = document.getElementsByTagName('body');body[0].innerHTML = '" + content + "';";
			((JavascriptExecutor)driver).executeScript(script);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		driver.switchTo().parentFrame();
	}

	
	public String getDescription(){
		return "测试用例id: 2733\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 信息查询(#349)\n"
				+" 用例名称: 消息管理-消息查询-消息编辑的新建/编辑内容栏脚本语言测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询 勾选某一状态为未发送的消息 点击编辑按钮\n"
				+" 测试步骤->1. 新建/编辑内容栏输入“<script>alert(“test“);</script>“，点击保存按钮\n"
				+" 测试预期->1. 弹出提示框提示数据已保存， 并跳转至消息查询界面， 其他信息均为所填信息\n"
				+" 测试步骤->2. 勾选该条消息，点击左上角的查看按钮\n"
				+" 测试预期->2. 弹出消息详细信息窗口， 内容栏显示为“<script>alert(“test“);</script>”\n"
				+" 测试步骤->3. 回到消息查询界面， 勾选该条消息，点击编辑按钮 弹出界面的新建/编辑内容栏输入“<script>alert(“test“);</script>“， 点击保存按钮 \n"
				+" 测试预期->3. 弹出提示框提示数据已保存， 并跳转至消息查询界面， 其他信息均为所填信息\n"
				+" 测试步骤->4. 勾选该条消息，点击左上角的查看按钮\n"
				+" 测试预期->4. 弹出消息详细信息窗口，内容栏显示为“<script>alert(“test“);</script>“\n"
;
	}

}

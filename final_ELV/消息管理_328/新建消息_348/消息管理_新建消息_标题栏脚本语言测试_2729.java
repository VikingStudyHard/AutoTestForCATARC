package cn.edu.tju.scs.seql.final_ELV.消息管理_328.新建消息_348;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.final_ELV.消息管理_328.信息查询_349.CommonOperations_信息查询_349;
import cn.edu.tju.scs.seql.final_ELV.消息管理_328.信息查询_349.ElementEnum_信息查询_349;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2729
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 新建消息(#348)
 * 用例名称: 消息管理-新建消息-标题栏脚本语言测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息
 *         第一栏BOM节点版本组号栏选择任一组号，
 *         接收人栏任意选择一人，
 *         新建/编辑栏为空。
 * 测试步骤->1. 标题栏输入“<script>alert("test");</script>”,点击保存按钮
 * 测试预期->1. 提示数据保存成功， 并跳转至消息查询界面， 该条消息状态显示为未发送， 其他信息均为所填信息且显示正常
 * 测试步骤->2. 勾选该条消息，点击左上角的查看按钮
 * 测试预期->2. 弹出消息详细信息窗口， 且标题栏内内容为<script>alert("test");</script>
 * 测试步骤->3. 回到新建消息界面， 按照前置条件填好信息， 标题栏输入“&lt;script&gt;alert("test");&lt;/script&gt;”， 点击保存按钮
 * 测试预期->3. 提示数据保存成功， 并跳转至消息查询界面， 该条消息状态显示为未发送， 其他信息均为所填信息且显示正常
 * 测试步骤->4. 勾选该条消息，点击左上角的查看按钮
 * 测试预期->4. 弹出消息详细信息窗口， 且标题栏内内容为“&lt;script&gt;alert("test");&lt;/script&gt;”
 * 测试步骤->5. 标题栏输入“<b>test</b>”,点击保存按钮
 * 测试预期->5. 提示数据保存成功， 并跳转至消息查询界面， 该条消息状态显示为未发送， 其他信息均为所填信息且显示正常
 * 测试步骤->6. 勾选该条消息，点击左上角的查看按钮
 * 测试预期->6. 弹出消息详细信息窗口， 且标题栏内内容为“<b>test</b>”
 * 
 */

public class 消息管理_新建消息_标题栏脚本语言测试_2729 extends Selenium_Test_Base {
	
	public 消息管理_新建消息_标题栏脚本语言测试_2729(){
		super();
	}
	
	public 消息管理_新建消息_标题栏脚本语言测试_2729(WebDriver driver){
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
		
		testInputTitle("&lt;script&gt;alert('樊向宇试试怎么发消息');&lt;/script&gt;");
		testInputTitle("<script>alert('樊向宇试试怎么发消息');</script>");
	}
	
	public void testInputTitle(String inputTitle){
		CommonOperations_新建消息_348 a = new CommonOperations_新建消息_348(driver);
		CommonOperations_信息查询_349 b = new CommonOperations_信息查询_349(driver);
		a.createMyRecord(false, inputTitle, "");
		a.changeToQueryMsg();
		String title = getElement(ElementEnum_信息查询_349.检索结果第一行消息标题).getText();
		b.deleteFirstRecord();
		assertEquals(title, inputTitle);
		a.changeBackToAddNew();
	}

	
	public String getDescription(){
		return "测试用例id: 2729\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 新建消息(#348)\n"
				+" 用例名称: 消息管理-新建消息-标题栏脚本语言测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息 第一栏BOM节点版本组号栏选择任一组号， 接收人栏任意选择一人， 新建/编辑栏为空。\n"
				+" 测试步骤->1. 标题栏输入“<script>alert(“test“);</script>”,点击保存按钮\n"
				+" 测试预期->1. 提示数据保存成功， 并跳转至消息查询界面， 该条消息状态显示为未发送， 其他信息均为所填信息且显示正常\n"
				+" 测试步骤->2. 勾选该条消息，点击左上角的查看按钮\n"
				+" 测试预期->2. 弹出消息详细信息窗口， 且标题栏内内容为<script>alert(“test“);</script>\n"
				+" 测试步骤->3. 回到新建消息界面， 按照前置条件填好信息， 标题栏输入“&lt;script&gt;alert(“test“);&lt;/script&gt;”， 点击保存按钮\n"
				+" 测试预期->3. 提示数据保存成功， 并跳转至消息查询界面， 该条消息状态显示为未发送， 其他信息均为所填信息且显示正常\n"
				+" 测试步骤->4. 勾选该条消息，点击左上角的查看按钮\n"
				+" 测试预期->4. 弹出消息详细信息窗口， 且标题栏内内容为“&lt;script&gt;alert(“test“);&lt;/script&gt;”\n"
				+" 测试步骤->5. 标题栏输入“<b>test</b>”,点击保存按钮\n"
				+" 测试预期->5. 提示数据保存成功， 并跳转至消息查询界面， 该条消息状态显示为未发送， 其他信息均为所填信息且显示正常\n"
				+" 测试步骤->6. 勾选该条消息，点击左上角的查看按钮\n"
				+" 测试预期->6. 弹出消息详细信息窗口， 且标题栏内内容为“<b>test</b>”\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.消息管理_328.信息查询_349;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2732
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 信息查询(#349)
 * 用例名称: 消息管理-消息查询-消息编辑的标题栏脚本语言测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询
 *         勾选某一状态为未发送的消息
 *         点击编辑按钮
 * 测试步骤->1. 标题栏输入“<script>alert("test");</script>”,点击保存按钮
 * 测试预期->1. 提示数据保存成功， 并跳转至消息查询界面， 标题变为“<script>alert("test");</script>”
 * 测试步骤->2. 勾选该条消息，点击左上角的查看按钮
 * 测试预期->2. 弹出消息详细信息窗口， 且标题栏内内容为<script>alert("test");</script>
 * 测试步骤->3. 回到消息查询界面， 勾选该条消息，点击编辑按钮 弹出界面的标题栏输入“<script>alert("test");</script>”， 点击保存按钮
 * 测试预期->3. 提示数据保存成功， 并跳转至消息查询界面， 其他信息均为所填信息且显示正常
 * 测试步骤->4. 勾选该条消息，点击左上角的查看按钮
 * 测试预期->4. 弹出消息详细信息窗口， 且标题栏内内容为“<script>alert("test");</script>”
 * 测试步骤->5. 回到消息查询界面， 勾选该条消息，点击编辑按钮 弹出界面的标题栏输入“<b>test</b>” 点击保存按钮
 * 测试预期->5. 提示数据保存成功， 并跳转至消息查询界面， 其他信息均为所填信息且显示正常
 * 测试步骤->6. 勾选该条消息，点击左上角的查看按钮
 * 测试预期->6. 弹出消息详细信息窗口， 且标题栏内内容为“<b>test</b>”
 * 测试步骤->7. 回到消息查询界面， 勾选该条消息，点击编辑按钮 弹出界面的标题栏输入“&lt;script&gt;alert("test");&lt;/script&gt;”， 点击保存按钮
 * 测试预期->7. 提示数据保存成功， 并跳转至消息查询界面， 其他信息均为所填信息且显示正常
 * 测试步骤->8. 勾选该条消息，点击左上角的查看按钮
 * 测试预期->8. 弹出消息详细信息窗口， 且标题栏内内容为“&lt;script&gt;alert("test");&lt;/script&gt;”
 * 
 */

public class 消息管理_消息查询_消息编辑的标题栏脚本语言测试_2732 extends Selenium_Test_Base {
	
	public 消息管理_消息查询_消息编辑的标题栏脚本语言测试_2732(){
		super();
	}
	
	public 消息管理_消息查询_消息编辑的标题栏脚本语言测试_2732(WebDriver driver){
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
		Assert.fail("填入<script>alert('test');</script>导致程序发生异常，抛出Exception，无法继续进行测试");
	}

	
	public String getDescription(){
		return "测试用例id: 2732\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 信息查询(#349)\n"
				+" 用例名称: 消息管理-消息查询-消息编辑的标题栏脚本语言测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询 勾选某一状态为未发送的消息 点击编辑按钮\n"
				+" 测试步骤->1. 标题栏输入“<script>alert(“test“);</script>”,点击保存按钮\n"
				+" 测试预期->1. 提示数据保存成功， 并跳转至消息查询界面， 标题变为“<script>alert(“test“);</script>”\n"
				+" 测试步骤->2. 勾选该条消息，点击左上角的查看按钮\n"
				+" 测试预期->2. 弹出消息详细信息窗口， 且标题栏内内容为<script>alert(“test“);</script>\n"
				+" 测试步骤->3. 回到消息查询界面， 勾选该条消息，点击编辑按钮 弹出界面的标题栏输入“<script>alert(“test“);</script>”， 点击保存按钮\n"
				+" 测试预期->3. 提示数据保存成功， 并跳转至消息查询界面， 其他信息均为所填信息且显示正常\n"
				+" 测试步骤->4. 勾选该条消息，点击左上角的查看按钮\n"
				+" 测试预期->4. 弹出消息详细信息窗口， 且标题栏内内容为“<script>alert(“test“);</script>”\n"
				+" 测试步骤->5. 回到消息查询界面， 勾选该条消息，点击编辑按钮 弹出界面的标题栏输入“<b>test</b>” 点击保存按钮\n"
				+" 测试预期->5. 提示数据保存成功， 并跳转至消息查询界面， 其他信息均为所填信息且显示正常\n"
				+" 测试步骤->6. 勾选该条消息，点击左上角的查看按钮\n"
				+" 测试预期->6. 弹出消息详细信息窗口， 且标题栏内内容为“<b>test</b>”\n"
				+" 测试步骤->7. 回到消息查询界面， 勾选该条消息，点击编辑按钮 弹出界面的标题栏输入“&lt;script&gt;alert(“test“);&lt;/script&gt;”， 点击保存按钮\n"
				+" 测试预期->7. 提示数据保存成功， 并跳转至消息查询界面， 其他信息均为所填信息且显示正常\n"
				+" 测试步骤->8. 勾选该条消息，点击左上角的查看按钮\n"
				+" 测试预期->8. 弹出消息详细信息窗口， 且标题栏内内容为“&lt;script&gt;alert(“test“);&lt;/script&gt;”\n"
;
	}

}

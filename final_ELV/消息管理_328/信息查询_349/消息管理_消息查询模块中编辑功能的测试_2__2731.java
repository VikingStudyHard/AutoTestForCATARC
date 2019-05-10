package cn.edu.tju.scs.seql.final_ELV.消息管理_328.信息查询_349;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2731
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 信息查询(#349)
 * 用例名称: 消息管理-消息查询模块中编辑功能的测试（2）
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询
 * 测试步骤->1. 勾选某一状态为未发送、收件人为空的消息 点击编辑按钮
 * 测试预期->1. 页面跳转至编辑界面， 界面显示为： BOM节点版本组号、标题、接收人（有查找按钮）、新建/编辑内容，以及返回和保存信息按钮
 * 测试步骤->2. 鼠标点击第一行“BOM节点版本组号”， 光标定位在输入框内， 按一下退格按键
 * 测试预期->2. 无任何反应， BOM节点版本组号不会被删除
 * 测试步骤->3. 鼠标点击第二行标题栏， 删除文本框内内容， 输入"test"
 * 测试预期->3. 文本框内内容可删除，可输入
 * 测试步骤->4. 鼠标点击第三行“接收人”后查找按钮，
 * 测试预期->4. 弹出接收人信息列表窗口，
 * 测试步骤->5. 不选择任何接收人，点击确定按钮
 * 测试预期->5. 弹出提示窗口提示选择接收人
 * 测试步骤->6. 勾选任一接收人，点击确认按钮
 * 测试预期->6. 选择接收人窗口关闭， 返回到新建消息页面， 接收人一栏显示所勾选接收人的姓名
 * 测试步骤->7. 再次点击接收人右侧查找按钮， 勾选步骤6中所勾选的接收人， 点击确认按钮
 * 测试预期->7. 弹出提示窗口提示重复选择了该接收人
 * 测试步骤->8. 勾选任意两个接收人， 点击下一页， 再选择任意两个接收人， 且该四个接收人与步骤6中所选不同， 点击确认按钮
 * 测试预期->8. 接收人选择窗口关闭， 回到编辑消息界面， 接收人一栏中显示步骤6和步骤8中所选的5个接收人的姓名
 * 测试步骤->9. 鼠标光标定在接收人文本框内，按退格键一下
 * 测试预期->9. 光标前的接收人被删除一个
 * 测试步骤->10. 鼠标点击新建/编辑内容栏， 删除文本框内内容， 输入“this is a test ”
 * 测试预期->10. 文本框内内容可删除，可输入
 * 测试步骤->11. 点击保存按钮
 * 测试预期->11. 提示消息保存成功， 跳转回消息查询界面， 所编辑的消息分成四条不同接收人的消息
 * 测试步骤->12. 分别勾选四条消息， 点击左上方查看按钮
 * 测试预期->12. 弹出消息框显示详细信息， 内容均为已修改内容， 且四条消息除接收人不同，其他信息均相同
 * 
 */

public class 消息管理_消息查询模块中编辑功能的测试_2__2731 extends Selenium_Test_Base {
	
	public 消息管理_消息查询模块中编辑功能的测试_2__2731(){
		super();
	}
	
	public 消息管理_消息查询模块中编辑功能的测试_2__2731(WebDriver driver){
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
		// TODO 选择接收人功能使用了ShowModalDialog，无法进行测试
	}

	
	public String getDescription(){
		return "测试用例id: 2731\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 信息查询(#349)\n"
				+" 用例名称: 消息管理-消息查询模块中编辑功能的测试（2）\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询\n"
				+" 测试步骤->1. 勾选某一状态为未发送、收件人为空的消息 点击编辑按钮\n"
				+" 测试预期->1. 页面跳转至编辑界面， 界面显示为： BOM节点版本组号、标题、接收人（有查找按钮）、新建/编辑内容，以及返回和保存信息按钮\n"
				+" 测试步骤->2. 鼠标点击第一行“BOM节点版本组号”， 光标定位在输入框内， 按一下退格按键\n"
				+" 测试预期->2. 无任何反应， BOM节点版本组号不会被删除\n"
				+" 测试步骤->3. 鼠标点击第二行标题栏， 删除文本框内内容， 输入“test“\n"
				+" 测试预期->3. 文本框内内容可删除，可输入\n"
				+" 测试步骤->4. 鼠标点击第三行“接收人”后查找按钮，\n"
				+" 测试预期->4. 弹出接收人信息列表窗口，\n"
				+" 测试步骤->5. 不选择任何接收人，点击确定按钮\n"
				+" 测试预期->5. 弹出提示窗口提示选择接收人\n"
				+" 测试步骤->6. 勾选任一接收人，点击确认按钮\n"
				+" 测试预期->6. 选择接收人窗口关闭， 返回到新建消息页面， 接收人一栏显示所勾选接收人的姓名\n"
				+" 测试步骤->7. 再次点击接收人右侧查找按钮， 勾选步骤6中所勾选的接收人， 点击确认按钮\n"
				+" 测试预期->7. 弹出提示窗口提示重复选择了该接收人\n"
				+" 测试步骤->8. 勾选任意两个接收人， 点击下一页， 再选择任意两个接收人， 且该四个接收人与步骤6中所选不同， 点击确认按钮\n"
				+" 测试预期->8. 接收人选择窗口关闭， 回到编辑消息界面， 接收人一栏中显示步骤6和步骤8中所选的5个接收人的姓名\n"
				+" 测试步骤->9. 鼠标光标定在接收人文本框内，按退格键一下\n"
				+" 测试预期->9. 光标前的接收人被删除一个\n"
				+" 测试步骤->10. 鼠标点击新建/编辑内容栏， 删除文本框内内容， 输入“this is a test ”\n"
				+" 测试预期->10. 文本框内内容可删除，可输入\n"
				+" 测试步骤->11. 点击保存按钮\n"
				+" 测试预期->11. 提示消息保存成功， 跳转回消息查询界面， 所编辑的消息分成四条不同接收人的消息\n"
				+" 测试步骤->12. 分别勾选四条消息， 点击左上方查看按钮\n"
				+" 测试预期->12. 弹出消息框显示详细信息， 内容均为已修改内容， 且四条消息除接收人不同，其他信息均相同\n"
;
	}

}

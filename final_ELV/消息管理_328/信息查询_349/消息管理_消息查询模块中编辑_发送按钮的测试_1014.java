package cn.edu.tju.scs.seql.final_ELV.消息管理_328.信息查询_349;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1014
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 信息查询(#349)
 * 用例名称: 消息管理-消息查询模块中编辑、发送按钮的测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询
 * 测试步骤->1. 勾选某一状态为已发送的消息 点击编辑按钮
 * 测试预期->1. 弹出提示框提示已发送的消息不可编辑
 * 测试步骤->2. 回到消息查询界面 勾选某一状态为未发送、接收人为空的消息 点击编辑按钮
 * 测试预期->2. 页面跳转至编辑界面， 界面显示为： BOM节点版本组号、标题、接收人（查找按钮）、新建/编辑内容，以及返回和保存信息按钮
 * 测试步骤->3. 回到消息查询界面 勾选某一状态为未发送、接收人不为空的消息 点击编辑按钮
 * 测试预期->3. 页面跳转至编辑界面， 界面显示为： BOM节点版本组号、标题、接收人（无查找按钮）、新建/编辑内容，以及返回和保存信息按钮
 * 测试步骤->4. 勾选某一状态为已发送的消息， 点击上方左侧的发送按钮
 * 测试预期->4. 弹出提示框提示该条消息已发送
 * 测试步骤->5. 勾选某一状态为未发送，且接收人为空的消息， 点击上方左侧的发送按钮
 * 测试预期->5. 弹出提示框提示先制定接收人
 * 测试步骤->6. 勾选某一状态为未发送， 且接收人不为空， 且消息标题为空的消息， 点击上方左侧的发送按钮
 * 测试预期->6. 弹出提示框提示 是否发送该消息
 * 测试步骤->7. 点击是否发送消息提示框的否按钮
 * 测试预期->7. 回到消息查询界面，消息发送失败
 * 测试步骤->8. 重复步骤5， 点击是否发送提示框的是按钮
 * 测试预期->8. 消息发送成功， 返回消息查询界面， 该条消息的状态变为已发送
 * 测试步骤->9. 勾选某一状态为未发送， 接收人、消息标题均不为空的消息， 点击发送按钮
 * 测试预期->9. 弹出提示框提示 是否发送该消息
 * 测试步骤->10. 点击是否发送消息提示框的否按钮
 * 测试预期->10. 回到消息查询界面，消息发送失败
 * 测试步骤->11. 重复步骤8， 点击是否发送提示框的是按钮
 * 测试预期->11. 消息发送成功， 返回消息查询界面， 该条消息的状态变为已发送
 * 
 */

public class 消息管理_消息查询模块中编辑_发送按钮的测试_1014 extends Selenium_Test_Base {
	
	public 消息管理_消息查询模块中编辑_发送按钮的测试_1014(){
		super();
	}
	
	public 消息管理_消息查询模块中编辑_发送按钮的测试_1014(WebDriver driver){
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
		getElement(ElementEnum_信息查询_349.发送按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.verifyTipsAndThenOperateButton("是否要发送数据",
				ElementEnum_信息查询_349.第一页提示信息, 
				ElementEnum_信息查询_349.第一页提示框否按钮);
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_信息查询_349.发送按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.verifyTipsAndThenOperateButton("是否要发送数据",
				ElementEnum_信息查询_349.第一页提示信息, 
				ElementEnum_信息查询_349.第一页提示框是按钮);
		WebDriverConfiguration.operationInterval();
		
		a.verifyTips("发送成功");
		
		getElement(ElementEnum_信息查询_349.检索结果第一行消息标题).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_信息查询_349.编辑按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.verifyTips("已发送的消息不能编辑");
		
		
		getElement(ElementEnum_信息查询_349.检索结果第一行消息标题).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_信息查询_349.发送按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.verifyTips("消息已经发送");
		
	}

	
	public String getDescription(){
		return "测试用例id: 1014\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 信息查询(#349)\n"
				+" 用例名称: 消息管理-消息查询模块中编辑、发送按钮的测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询\n"
				+" 测试步骤->1. 勾选某一状态为已发送的消息 点击编辑按钮\n"
				+" 测试预期->1. 弹出提示框提示已发送的消息不可编辑\n"
				+" 测试步骤->2. 回到消息查询界面 勾选某一状态为未发送、接收人为空的消息 点击编辑按钮\n"
				+" 测试预期->2. 页面跳转至编辑界面， 界面显示为： BOM节点版本组号、标题、接收人（查找按钮）、新建/编辑内容，以及返回和保存信息按钮\n"
				+" 测试步骤->3. 回到消息查询界面 勾选某一状态为未发送、接收人不为空的消息 点击编辑按钮\n"
				+" 测试预期->3. 页面跳转至编辑界面， 界面显示为： BOM节点版本组号、标题、接收人（无查找按钮）、新建/编辑内容，以及返回和保存信息按钮\n"
				+" 测试步骤->4. 勾选某一状态为已发送的消息， 点击上方左侧的发送按钮\n"
				+" 测试预期->4. 弹出提示框提示该条消息已发送\n"
				+" 测试步骤->5. 勾选某一状态为未发送，且接收人为空的消息， 点击上方左侧的发送按钮\n"
				+" 测试预期->5. 弹出提示框提示先制定接收人\n"
				+" 测试步骤->6. 勾选某一状态为未发送， 且接收人不为空， 且消息标题为空的消息， 点击上方左侧的发送按钮\n"
				+" 测试预期->6. 弹出提示框提示 是否发送该消息\n"
				+" 测试步骤->7. 点击是否发送消息提示框的否按钮\n"
				+" 测试预期->7. 回到消息查询界面，消息发送失败\n"
				+" 测试步骤->8. 重复步骤5， 点击是否发送提示框的是按钮\n"
				+" 测试预期->8. 消息发送成功， 返回消息查询界面， 该条消息的状态变为已发送\n"
				+" 测试步骤->9. 勾选某一状态为未发送， 接收人、消息标题均不为空的消息， 点击发送按钮\n"
				+" 测试预期->9. 弹出提示框提示 是否发送该消息\n"
				+" 测试步骤->10. 点击是否发送消息提示框的否按钮\n"
				+" 测试预期->10. 回到消息查询界面，消息发送失败\n"
				+" 测试步骤->11. 重复步骤8， 点击是否发送提示框的是按钮\n"
				+" 测试预期->11. 消息发送成功， 返回消息查询界面， 该条消息的状态变为已发送\n"
;
	}

}

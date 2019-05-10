package cn.edu.tju.scs.seql.final_ELV.消息管理_328.信息查询_349;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1011
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 信息查询(#349)
 * 用例名称: 消息管理-消息查询模块消息查看、删除功能
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询
 * 测试步骤->1. 勾选一条某一消息前的对勾， 点击上方左侧的查看按钮
 * 测试预期->1. 弹出对话框显示该消息的详细信息 包括：消息标题，供货编号，创建人，接收人以及内容
 * 测试步骤->2. 鼠标点击详细消息窗口内的内容栏，
 * 测试预期->2. 点击无效果， 不可编辑
 * 测试步骤->3. 关闭消息详细查看窗口 回到消息查询界面 勾选某一条消息 点击上方左侧的删除按钮
 * 测试预期->3. 弹出提示框提示是否要删除该条消息
 * 测试步骤->4. 点击删除提示框的否
 * 测试预期->4. 该条消息删除失败
 * 测试步骤->5. 重复步骤3， 在弹出的删除提示框点击是
 * 测试预期->5. 该条消息删除成功
 * 测试步骤->6. 回到消息查询界面， 勾选两条或者两条以上消息
 * 测试预期->6. 上方左侧的四个按钮（查看、编辑、删除、发送）变为一个按钮（删除）
 * 测试步骤->7. 点击步骤6中的删除按钮
 * 测试预期->7. 弹出提示框提示是否要删除该条消息
 * 测试步骤->8. 重复步骤4
 * 测试预期->8. 该条消息删除失败
 * 测试步骤->9. 重复步骤6、7， 再弹出的删除提示框点击是
 * 测试预期->9. 该条消息删除成功
 * 
 */

public class 消息管理_消息查询模块消息查看_删除功能_1011 extends Selenium_Test_Base {
	
	public 消息管理_消息查询模块消息查看_删除功能_1011(){
		super();
	}
	
	public 消息管理_消息查询模块消息查看_删除功能_1011(WebDriver driver){
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
		a.verifyFirstThreeMyRecord();
		
		getElement(ElementEnum_信息查询_349.检索结果第一行前方勾选框).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_信息查询_349.删除按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTipsAndThenOperateButton("是否要删除数据", ElementEnum_信息查询_349.第一页提示信息, 
										ElementEnum_信息查询_349.第一页提示框否按钮);
		
		getElement(ElementEnum_信息查询_349.删除按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTipsAndThenOperateButton("是否要删除数据", ElementEnum_信息查询_349.第一页提示信息, 
										ElementEnum_信息查询_349.第一页提示框是按钮);
		a.verifyTips("删除消息信息成功");
		
		
		getElement(ElementEnum_信息查询_349.检索结果第一行前方勾选框).click();
		WebDriverConfiguration.operationInterval();
		driver.findElement(By.xpath(ElementEnum_信息查询_349.检索结果第一行前方勾选框.getName().replaceAll("tr\\[2\\]", "tr[3]"))).click();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_信息查询_349.查看按钮).isDisplayed(), false);
		assertEquals(getElement(ElementEnum_信息查询_349.编辑按钮).isDisplayed(), false);
		assertEquals(getElement(ElementEnum_信息查询_349.发送按钮).isDisplayed(), false);
		
		getElement(ElementEnum_信息查询_349.删除按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTipsAndThenOperateButton("是否要删除数据", ElementEnum_信息查询_349.第一页提示信息, 
										ElementEnum_信息查询_349.第一页提示框否按钮);
		
		getElement(ElementEnum_信息查询_349.删除按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTipsAndThenOperateButton("是否要删除数据", ElementEnum_信息查询_349.第一页提示信息, 
										ElementEnum_信息查询_349.第一页提示框是按钮);
		a.verifyTips("删除消息信息成功");
		
	}

	
	public String getDescription(){
		return "测试用例id: 1011\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 信息查询(#349)\n"
				+" 用例名称: 消息管理-消息查询模块消息查看、删除功能\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询\n"
				+" 测试步骤->1. 勾选一条某一消息前的对勾， 点击上方左侧的查看按钮\n"
				+" 测试预期->1. 弹出对话框显示该消息的详细信息 包括：消息标题，供货编号，创建人，接收人以及内容\n"
				+" 测试步骤->2. 鼠标点击详细消息窗口内的内容栏，\n"
				+" 测试预期->2. 点击无效果， 不可编辑\n"
				+" 测试步骤->3. 关闭消息详细查看窗口 回到消息查询界面 勾选某一条消息 点击上方左侧的删除按钮\n"
				+" 测试预期->3. 弹出提示框提示是否要删除该条消息\n"
				+" 测试步骤->4. 点击删除提示框的否\n"
				+" 测试预期->4. 该条消息删除失败\n"
				+" 测试步骤->5. 重复步骤3， 在弹出的删除提示框点击是\n"
				+" 测试预期->5. 该条消息删除成功\n"
				+" 测试步骤->6. 回到消息查询界面， 勾选两条或者两条以上消息\n"
				+" 测试预期->6. 上方左侧的四个按钮（查看、编辑、删除、发送）变为一个按钮（删除）\n"
				+" 测试步骤->7. 点击步骤6中的删除按钮\n"
				+" 测试预期->7. 弹出提示框提示是否要删除该条消息\n"
				+" 测试步骤->8. 重复步骤4\n"
				+" 测试预期->8. 该条消息删除失败\n"
				+" 测试步骤->9. 重复步骤6、7， 再弹出的删除提示框点击是\n"
				+" 测试预期->9. 该条消息删除成功\n"
;
	}

}

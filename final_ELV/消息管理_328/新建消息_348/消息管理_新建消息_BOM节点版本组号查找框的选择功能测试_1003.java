package cn.edu.tju.scs.seql.final_ELV.消息管理_328.新建消息_348;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1003
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 新建消息(#348)
 * 用例名称: 消息管理-新建消息-BOM节点版本组号查找框的选择功能测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息
 *         点击第一行BOM节点版本组号右侧的查找按钮
 *         在弹出的窗口中点击查询按钮
 * 测试步骤->1. 直接点击确认，不选择任何一条记录
 * 测试预期->1. 弹出提示框提示选择一条记录
 * 测试步骤->2. 勾选某一条记录，点击确认
 * 测试预期->2. BOM节点版本组号选择窗口关闭，回到新建消息窗口，且BOM节点版本组号栏显示为所勾选的记录ID 
 * 测试步骤->3. 再点击右侧查找按钮，然后点击查询按钮，在步骤2中所勾选的记录前再次勾选，点击确认
 * 测试预期->3. 弹出提示框提示该条记录已被选择
 * 测试步骤->4. 再进入到BOM节点版本组号选择窗口，在第一页勾选两条记录，点击下一页，再勾选两条记录，且选择的四条记录与步骤2中所选记录不重复，点击确认
 * 测试预期->4. 查找窗口关闭，回到新建消息界面，第一行BOM节点版本组号的输入框内显示5条信息，显示的ID分别为步骤2和步骤4中所选记录。
 * 测试步骤->5. 鼠标光标定位在BOM节点版本组号的文本框内，按退格键一下
 * 测试预期->5. 光标前的BOM版本节点组号ID被删除一个
 * 
 */

public class 消息管理_新建消息_BOM节点版本组号查找框的选择功能测试_1003 extends Selenium_Test_Base {
	
	public 消息管理_新建消息_BOM节点版本组号查找框的选择功能测试_1003(){
		super();
	}
	
	public 消息管理_新建消息_BOM节点版本组号查找框的选择功能测试_1003(WebDriver driver){
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
		// TODO BOM节点版本组号查找框使用showModalDialog实现，无法进行测试
	}

	
	public String getDescription(){
		return "测试用例id: 1003\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 新建消息(#348)\n"
				+" 用例名称: 消息管理-新建消息-BOM节点版本组号查找框的选择功能测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息 点击第一行BOM节点版本组号右侧的查找按钮 在弹出的窗口中点击查询按钮\n"
				+" 测试步骤->1. 直接点击确认，不选择任何一条记录\n"
				+" 测试预期->1. 弹出提示框提示选择一条记录\n"
				+" 测试步骤->2. 勾选某一条记录，点击确认\n"
				+" 测试预期->2. BOM节点版本组号选择窗口关闭，回到新建消息窗口，且BOM节点版本组号栏显示为所勾选的记录ID \n"
				+" 测试步骤->3. 再点击右侧查找按钮，然后点击查询按钮，在步骤2中所勾选的记录前再次勾选，点击确认\n"
				+" 测试预期->3. 弹出提示框提示该条记录已被选择\n"
				+" 测试步骤->4. 再进入到BOM节点版本组号选择窗口，在第一页勾选两条记录，点击下一页，再勾选两条记录，且选择的四条记录与步骤2中所选记录不重复，点击确认\n"
				+" 测试预期->4. 查找窗口关闭，回到新建消息界面，第一行BOM节点版本组号的输入框内显示5条信息，显示的ID分别为步骤2和步骤4中所选记录。\n"
				+" 测试步骤->5. 鼠标光标定位在BOM节点版本组号的文本框内，按退格键一下\n"
				+" 测试预期->5. 光标前的BOM版本节点组号ID被删除一个\n"
;
	}

}

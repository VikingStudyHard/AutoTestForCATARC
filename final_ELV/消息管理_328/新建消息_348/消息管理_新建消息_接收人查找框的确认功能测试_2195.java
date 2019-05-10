package cn.edu.tju.scs.seql.final_ELV.消息管理_328.新建消息_348;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2195
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 新建消息(#348)
 * 用例名称: 消息管理-新建消息-接收人查找框的确认功能测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息
 *         点击新建消息窗口第三行接收人一栏右侧的查找按钮，弹出选择接收人窗口
 * 测试步骤->1. 不选择任何接收人，点击确定按钮
 * 测试预期->1. 弹出提示窗口提示选择接收人
 * 测试步骤->2. 勾选任一接收人，点击确认按钮
 * 测试预期->2. 选择接收人窗口关闭，返回到新建消息页面，接收人一栏显示所勾选接收人的姓名
 * 测试步骤->3. 再次点击接收人右侧查找按钮，勾选步骤二中所勾选的接收人，点击确认按钮
 * 测试预期->3. 弹出提示窗口提示重复选择了该接收人
 * 测试步骤->4. 勾选任意两个接收人，点击下一页，再选择任意两个接收人，且该四个接收人与步骤二中所选不同，点击确认按钮
 * 测试预期->4. 接收人选择窗口关闭，回到新建消息界面，接收人一栏中显示步骤2和步骤4中所选的5个接收人的姓名
 * 测试步骤->5. 鼠标光标定在接收人文本框内，按退格键一下
 * 测试预期->5. 光标前的接收人被删除一个
 * 
 */

public class 消息管理_新建消息_接收人查找框的确认功能测试_2195 extends Selenium_Test_Base {
	
	public 消息管理_新建消息_接收人查找框的确认功能测试_2195(){
		super();
	}
	
	public 消息管理_新建消息_接收人查找框的确认功能测试_2195(WebDriver driver){
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
		// TODO 选择接收人功能使用了showModalDialog，无法继续测试
	}

	
	public String getDescription(){
		return "测试用例id: 2195\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 新建消息(#348)\n"
				+" 用例名称: 消息管理-新建消息-接收人查找框的确认功能测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息 点击新建消息窗口第三行接收人一栏右侧的查找按钮，弹出选择接收人窗口\n"
				+" 测试步骤->1. 不选择任何接收人，点击确定按钮\n"
				+" 测试预期->1. 弹出提示窗口提示选择接收人\n"
				+" 测试步骤->2. 勾选任一接收人，点击确认按钮\n"
				+" 测试预期->2. 选择接收人窗口关闭，返回到新建消息页面，接收人一栏显示所勾选接收人的姓名\n"
				+" 测试步骤->3. 再次点击接收人右侧查找按钮，勾选步骤二中所勾选的接收人，点击确认按钮\n"
				+" 测试预期->3. 弹出提示窗口提示重复选择了该接收人\n"
				+" 测试步骤->4. 勾选任意两个接收人，点击下一页，再选择任意两个接收人，且该四个接收人与步骤二中所选不同，点击确认按钮\n"
				+" 测试预期->4. 接收人选择窗口关闭，回到新建消息界面，接收人一栏中显示步骤2和步骤4中所选的5个接收人的姓名\n"
				+" 测试步骤->5. 鼠标光标定在接收人文本框内，按退格键一下\n"
				+" 测试预期->5. 光标前的接收人被删除一个\n"
;
	}

}

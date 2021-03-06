package cn.edu.tju.scs.seql.final_ELV.法规管理_329.最新法规_354;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4477
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 最新法规(#354)
 * 用例名称: 验证最新法规发布功能是否可实现
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击页面中的发布按钮
 * 测试预期->1. 页面出现提示信息：请选择则要发布的记录
 * 测试步骤->2. 选择一条信息，点击发布按钮
 * 测试预期->2. 页面出现提示信息：是否要发布这些数据？
 * 测试步骤->3. 点击提示信息中的是按钮
 * 测试预期->3. 页面出现提示信息：发布法规信息成功！
 * 测试步骤->4. 选择一条已发布信息，点击发布按钮
 * 测试预期->4. 页面出现提示信息：您选择的数据中一部分已经发布！
 * 测试步骤->5. 选择多条信息，点击发布按钮
 * 测试预期->5. 页面出现提示信息：是否要发布这些数据？
 * 测试步骤->6. 点击提示信息中的是按钮
 * 测试预期->6. 页面出现提示信息：发布法规信息成功！
 * 测试步骤->7. 退出ELV环境回归系统当前登录的用户，使用其他的用户登录，例如：yangjie，密码：000000，查看最新发布的法规信息
 * 测试预期->7. 最新法规中出现刚刚发布的法规信息
 * 
 */

public class 验证最新法规发布功能是否可实现_4477 extends Selenium_Test_Base {
	
	public 验证最新法规发布功能是否可实现_4477(){
		super();
	}
	
	public 验证最新法规发布功能是否可实现_4477(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_最新法规_354.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_最新法规_354.rightFrame);
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
		getElement(ElementEnum_最新法规_354.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_最新法规_354.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_最新法规_354 a = new CommonOperations_最新法规_354(driver);
		a.searchMyRecord();
		
		getElement(ElementEnum_最新法规_354.发布按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请选择则要发布的记录");
		
		
		// 这里应该想办法保证第一行是未发布的状态，以为新增功能无法使用，所以目前难以保证
		getElement(ElementEnum_最新法规_354.检索结果第一行标题).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_最新法规_354.发布按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.verifyTipsAndThenOperateButton("是否要发布这些数据", 
				ElementEnum_最新法规_354.第一页提示信息, 
				ElementEnum_最新法规_354.第一页提示框是按钮);
		
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		a.verifyTips("发布行业动态信息成功");
		
		getElement(ElementEnum_最新法规_354.检索结果第一行标题).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_最新法规_354.发布按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("您选择的数据中一部分已经发布");
	}

	
	public String getDescription(){
		return "测试用例id: 4477\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 最新法规(#354)\n"
				+" 用例名称: 验证最新法规发布功能是否可实现\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击页面中的发布按钮\n"
				+" 测试预期->1. 页面出现提示信息：请选择则要发布的记录\n"
				+" 测试步骤->2. 选择一条信息，点击发布按钮\n"
				+" 测试预期->2. 页面出现提示信息：是否要发布这些数据？\n"
				+" 测试步骤->3. 点击提示信息中的是按钮\n"
				+" 测试预期->3. 页面出现提示信息：发布法规信息成功！\n"
				+" 测试步骤->4. 选择一条已发布信息，点击发布按钮\n"
				+" 测试预期->4. 页面出现提示信息：您选择的数据中一部分已经发布！\n"
				+" 测试步骤->5. 选择多条信息，点击发布按钮\n"
				+" 测试预期->5. 页面出现提示信息：是否要发布这些数据？\n"
				+" 测试步骤->6. 点击提示信息中的是按钮\n"
				+" 测试预期->6. 页面出现提示信息：发布法规信息成功！\n"
				+" 测试步骤->7. 退出ELV环境回归系统当前登录的用户，使用其他的用户登录，例如：yangjie，密码：000000，查看最新发布的法规信息\n"
				+" 测试预期->7. 最新法规中出现刚刚发布的法规信息\n"
;
	}

}

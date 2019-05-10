package cn.edu.tju.scs.seql.final_ELV.系统管理_330.角色信息_362;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 7627
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 角色信息(#362)
 * 用例名称: 验证角色信息删除角色功能是否可以实现---正常操作
 * 前置条件: 能正确进入ELV环境合规系统（标准版）角色信息界面 
 * 测试步骤->1. 勾选某一角色信息，点击删除按钮。
 * 测试预期->1. 页面出现提示信息：您删除的角色中存在用户，请先删除用户再删除角色！
 * 测试步骤->2. 点击提示信息中的确定按钮。
 * 测试预期->2. 页面跳转至用户信息界面。
 * 测试步骤->3. 在用户信息界面的权限搜索框内输入想要删除角色信息的权限中文名或英文名，点击检索按钮
 * 测试预期->3. 刷新出新页面，页面列表为该角色信息下的所有用户
 * 测试步骤->4. 全选，点击删除
 * 测试预期->4. 用户删除成功
 * 测试步骤->5. 返回角色信息界面。
 * 测试预期->5. 所要删除的角色信息下的用户数量为0。
 * 测试步骤->6. 勾选中此角色信息，点击删除
 * 测试预期->6. 页面出现提示信息：删除角色成功！
 * 测试步骤->7. 点击提示信息中的确定按钮。
 * 测试预期->7. 页面跳转至最初，勾选的角色信息已被删除。
 * 
 */

public class 验证角色信息删除角色功能是否可以实现___正常操作_7627 extends Selenium_Test_Base {
	
	public 验证角色信息删除角色功能是否可以实现___正常操作_7627(){
		super();
	}
	
	public 验证角色信息删除角色功能是否可以实现___正常操作_7627(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_角色信息_362.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_角色信息_362.rightFrame);
	    driver.switchTo().frame(leftFrame);
	    operationInLeftFrame();
	    driver.switchTo().defaultContent();
		
		driver.switchTo().frame(mainFrame);
	    detailedOperation();
	    driver.switchTo().defaultContent();
	    
	    //2转
	    driver.switchTo().frame(leftFrame);
	    operationInLeftFrameOne();
	    driver.switchTo().defaultContent();
		
		driver.switchTo().frame(mainFrame);
	    detailedOperationOne();
	    driver.switchTo().defaultContent();
	}
	

	private void detailedOperationOne() {
		Assert.fail("无权限搜索框");
	}

	private void operationInLeftFrameOne() {
		getElement(ElementEnum_角色信息_362.用户信息).click();
		WebDriverConfiguration.operationInterval();
	}
	/**
	 * LeftFrame中的操作，主要是选择不同的功能
	 */
	public void operationInLeftFrame(){
	
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		
		getElement(ElementEnum_角色信息_362.检索结果第一行勾选框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.删除按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.删除提示信息确定按钮).click();
		WebDriverConfiguration.operationInterval();
	
	}

	
	public String getDescription(){
		return "测试用例id: 7627\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 角色信息(#362)\n"
				+" 用例名称: 验证角色信息删除角色功能是否可以实现---正常操作\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）角色信息界面 \n"
				+" 测试步骤->1. 勾选某一角色信息，点击删除按钮。\n"
				+" 测试预期->1. 页面出现提示信息：您删除的角色中存在用户，请先删除用户再删除角色！\n"
				+" 测试步骤->2. 点击提示信息中的确定按钮。\n"
				+" 测试预期->2. 页面跳转至用户信息界面。\n"
				+" 测试步骤->3. 在用户信息界面的权限搜索框内输入想要删除角色信息的权限中文名或英文名，点击检索按钮\n"
				+" 测试预期->3. 刷新出新页面，页面列表为该角色信息下的所有用户\n"
				+" 测试步骤->4. 全选，点击删除\n"
				+" 测试预期->4. 用户删除成功\n"
				+" 测试步骤->5. 返回角色信息界面。\n"
				+" 测试预期->5. 所要删除的角色信息下的用户数量为0。\n"
				+" 测试步骤->6. 勾选中此角色信息，点击删除\n"
				+" 测试预期->6. 页面出现提示信息：删除角色成功！\n"
				+" 测试步骤->7. 点击提示信息中的确定按钮。\n"
				+" 测试预期->7. 页面跳转至最初，勾选的角色信息已被删除。\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.系统管理_330.用户信息_358;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2190
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 用户信息(#358)
 * 用例名称: 验证用户信息新增功能是否可以实现-正常操作
 * 前置条件: 能正确进入ELV环境合规系统（标准版）用户信息界面
 * 测试步骤->1. 点击新增按钮
 * 测试预期->1. 跳出新页面显示新增一用户所需要填写的各项内容，其中姓名和用户名称红色星号标识为必填项。
 * 测试步骤->2. 将标识的必要两项姓名和登录名填写项目分别填写test和123，点击部门信息中的新增按钮。
 * 测试预期->2. 跳出新页面显示所有部门的信息内容。
 * 测试步骤->3. 选择一条部门信息，点击取消按钮。
 * 测试预期->3. 页面没有响应
 * 测试步骤->4. 点击部门信息中的新增按钮，选择一条部门信息，点击确认按钮。
 * 测试预期->4. 回到新增用户界面，部门信息中有一条新增内容。
 * 测试步骤->5. 点击部门信息中的新增按钮，选择两条部门信息，点击确认按钮。
 * 测试预期->5. 回到新增用户界面，部门信息中有三条新增内容。
 * 测试步骤->6. 点击部门信息中的新增按钮，点击新出页面下部的功能栏中的刷新按钮。
 * 测试预期->6. 新增部门信息页面刷新。
 * 测试步骤->7. 点击部门信息中的新增按钮，点击新出页面下部的功能栏中的下一页按钮。
 * 测试预期->7. 新增部门信息页面跳转至下一页信息。
 * 测试步骤->8. 点击部门信息中的新增按钮，点击新出页面下部的功能栏中的最后一页按钮。
 * 测试预期->8. 新增部门信息页面跳转至最后一页信息。
 * 
 */

public class 验证用户信息新增功能是否可以实现_正常操作_2190 extends Selenium_Test_Base {
	
	public 验证用户信息新增功能是否可以实现_正常操作_2190(){
		super();
	}
	
	public 验证用户信息新增功能是否可以实现_正常操作_2190(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_用户信息_358.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_用户信息_358.rightFrame);
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
		getElement(ElementEnum_用户信息_358.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_用户信息_358.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		// TODO 弹窗无法测试
	
	}

	
	public String getDescription(){
		return "测试用例id: 2190\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 用户信息(#358)\n"
				+" 用例名称: 验证用户信息新增功能是否可以实现-正常操作\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）用户信息界面\n"
				+" 测试步骤->1. 点击新增按钮\n"
				+" 测试预期->1. 跳出新页面显示新增一用户所需要填写的各项内容，其中姓名和用户名称红色星号标识为必填项。\n"
				+" 测试步骤->2. 将标识的必要两项姓名和登录名填写项目分别填写test和123，点击部门信息中的新增按钮。\n"
				+" 测试预期->2. 跳出新页面显示所有部门的信息内容。\n"
				+" 测试步骤->3. 选择一条部门信息，点击取消按钮。\n"
				+" 测试预期->3. 页面没有响应\n"
				+" 测试步骤->4. 点击部门信息中的新增按钮，选择一条部门信息，点击确认按钮。\n"
				+" 测试预期->4. 回到新增用户界面，部门信息中有一条新增内容。\n"
				+" 测试步骤->5. 点击部门信息中的新增按钮，选择两条部门信息，点击确认按钮。\n"
				+" 测试预期->5. 回到新增用户界面，部门信息中有三条新增内容。\n"
				+" 测试步骤->6. 点击部门信息中的新增按钮，点击新出页面下部的功能栏中的刷新按钮。\n"
				+" 测试预期->6. 新增部门信息页面刷新。\n"
				+" 测试步骤->7. 点击部门信息中的新增按钮，点击新出页面下部的功能栏中的下一页按钮。\n"
				+" 测试预期->7. 新增部门信息页面跳转至下一页信息。\n"
				+" 测试步骤->8. 点击部门信息中的新增按钮，点击新出页面下部的功能栏中的最后一页按钮。\n"
				+" 测试预期->8. 新增部门信息页面跳转至最后一页信息。\n"
;
	}

}

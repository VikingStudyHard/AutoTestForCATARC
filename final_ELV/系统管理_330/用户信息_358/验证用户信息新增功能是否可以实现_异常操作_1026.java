package cn.edu.tju.scs.seql.final_ELV.系统管理_330.用户信息_358;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1026
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 用户信息(#358)
 * 用例名称: 验证用户信息新增功能是否可以实现-异常操作
 * 前置条件: 能正确进入ELV环境合规系统（标准版）用户信息界面
 * 测试步骤->1. 点击新增按钮
 * 测试预期->1. 跳出新页面显示新增一用户所需要填写的各项内容，其中姓名和用户名称红色星号标识为必填项。
 * 测试步骤->2. 点击新页面的保存按钮
 * 测试预期->2. 新页面中的姓名和登录名两项必填项目出现红色标识，提示需要填写。
 * 测试步骤->3. 将标识的必要两项姓名和登录名其中的登录名填写123，点击保存按钮。
 * 测试预期->3. 新页面中的姓名必填项目出现红色标识，提示需要填写。
 * 测试步骤->4. 将标识的必要两项姓名和登录名填写项目分别填写test和123，点击保存按钮。
 * 测试预期->4. 出现提示信息：用户中英文名称，登录名，部门信息，角色权限不能为空！
 * 测试步骤->5. 将标识的必要两项姓名和登录名填写项目分别填写test和123，选择增加一个部门信息点击保存按钮。
 * 测试预期->5. 出现提示信息：用户中英文名称，登录名，部门信息，角色权限不能为空！
 * 测试步骤->6. 将标识的必要两项姓名和登录名填写项目分别填写test和123，选择增加一个部门信息，添加角色权限，点击保存按钮。
 * 测试预期->6. 出现提示信息：用户信息新建成功。
 * 测试步骤->7. 点击提示信息中的确定按钮
 * 测试预期->7. 跳转回最初页面，第一行为新增用户信息。
 * 
 */

public class 验证用户信息新增功能是否可以实现_异常操作_1026 extends Selenium_Test_Base {
	
	public 验证用户信息新增功能是否可以实现_异常操作_1026(){
		super();
	}
	
	public 验证用户信息新增功能是否可以实现_异常操作_1026(WebDriver driver){
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
		return "测试用例id: 1026\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 用户信息(#358)\n"
				+" 用例名称: 验证用户信息新增功能是否可以实现-异常操作\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）用户信息界面\n"
				+" 测试步骤->1. 点击新增按钮\n"
				+" 测试预期->1. 跳出新页面显示新增一用户所需要填写的各项内容，其中姓名和用户名称红色星号标识为必填项。\n"
				+" 测试步骤->2. 点击新页面的保存按钮\n"
				+" 测试预期->2. 新页面中的姓名和登录名两项必填项目出现红色标识，提示需要填写。\n"
				+" 测试步骤->3. 将标识的必要两项姓名和登录名其中的登录名填写123，点击保存按钮。\n"
				+" 测试预期->3. 新页面中的姓名必填项目出现红色标识，提示需要填写。\n"
				+" 测试步骤->4. 将标识的必要两项姓名和登录名填写项目分别填写test和123，点击保存按钮。\n"
				+" 测试预期->4. 出现提示信息：用户中英文名称，登录名，部门信息，角色权限不能为空！\n"
				+" 测试步骤->5. 将标识的必要两项姓名和登录名填写项目分别填写test和123，选择增加一个部门信息点击保存按钮。\n"
				+" 测试预期->5. 出现提示信息：用户中英文名称，登录名，部门信息，角色权限不能为空！\n"
				+" 测试步骤->6. 将标识的必要两项姓名和登录名填写项目分别填写test和123，选择增加一个部门信息，添加角色权限，点击保存按钮。\n"
				+" 测试预期->6. 出现提示信息：用户信息新建成功。\n"
				+" 测试步骤->7. 点击提示信息中的确定按钮\n"
				+" 测试预期->7. 跳转回最初页面，第一行为新增用户信息。\n"
;
	}

}

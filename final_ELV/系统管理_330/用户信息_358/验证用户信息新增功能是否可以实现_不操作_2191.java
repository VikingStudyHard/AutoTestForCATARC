package cn.edu.tju.scs.seql.final_ELV.系统管理_330.用户信息_358;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2191
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 用户信息(#358)
 * 用例名称: 验证用户信息新增功能是否可以实现-不操作
 * 前置条件: 能正确进入ELV环境合规系统（标准版）用户信息界面
 * 测试步骤->1. 点击新增按钮
 * 测试预期->1. 跳出新页面显示新增一用户所需要填写的各项内容，其中姓名和用户名称红色星号标识为必填项。
 * 测试步骤->2. 将标识的必要两项姓名和登录名填写项目分别填写test和123，点击部门信息中的新增按钮添加相应的部门信息，勾选第一条角色信息。
 * 测试预期->2. 相应角色信息被选中，页面其他内容正常显示。
 * 测试步骤->3. 勾选第三条角色信息。
 * 测试预期->3. 用户的角色信息栏跳出新选项：是否为最终审批用户。
 * 测试步骤->4. 勾选或不勾选最后一条新增角色信息。
 * 测试预期->4. 新增角色信息被选中或未被选中。
 * 
 */

public class 验证用户信息新增功能是否可以实现_不操作_2191 extends Selenium_Test_Base {
	
	public 验证用户信息新增功能是否可以实现_不操作_2191(){
		super();
	}
	
	public 验证用户信息新增功能是否可以实现_不操作_2191(WebDriver driver){
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
		return "测试用例id: 2191\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 用户信息(#358)\n"
				+" 用例名称: 验证用户信息新增功能是否可以实现-不操作\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）用户信息界面\n"
				+" 测试步骤->1. 点击新增按钮\n"
				+" 测试预期->1. 跳出新页面显示新增一用户所需要填写的各项内容，其中姓名和用户名称红色星号标识为必填项。\n"
				+" 测试步骤->2. 将标识的必要两项姓名和登录名填写项目分别填写test和123，点击部门信息中的新增按钮添加相应的部门信息，勾选第一条角色信息。\n"
				+" 测试预期->2. 相应角色信息被选中，页面其他内容正常显示。\n"
				+" 测试步骤->3. 勾选第三条角色信息。\n"
				+" 测试预期->3. 用户的角色信息栏跳出新选项：是否为最终审批用户。\n"
				+" 测试步骤->4. 勾选或不勾选最后一条新增角色信息。\n"
				+" 测试预期->4. 新增角色信息被选中或未被选中。\n"
;
	}

}

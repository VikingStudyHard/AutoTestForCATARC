package cn.edu.tju.scs.seql.final_ELV.系统管理_330.用户信息_358;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 5633
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 用户信息(#358)
 * 用例名称: 验证用户信息新增功能是否可以实现-异常操作
 * 前置条件: 能正确进入ELV环境合规系统（标准版）用户信息界面
 * 测试步骤->1. 点击新增按钮
 * 测试预期->1. 跳出新页面显示新增一用户所需要填写的各项内容，其中姓名和用户名称红色星号标识为必填项。
 * 测试步骤->2. 将标识的必要两项姓名和登录名填写项目分别填写test和123，点击部门信息中的新增按钮。
 * 测试预期->2. 跳出新页面显示所有部门的信息内容。
 * 测试步骤->3. 勾一条部门信息，点击确定。
 * 测试预期->3. 页面关闭，在所属部门信息的列表中出现新增加的部门。
 * 测试步骤->4. 再次点击所属部门信息下面的新增按钮。
 * 测试预期->4. 跳出新页面显示所有部门的信息内容。
 * 测试步骤->5. 勾选和步骤3相同的部门信息，点击确定。
 * 测试预期->5. 页面出现提示信息：已存在相同的部门。
 * 测试步骤->6. 点击确定按钮
 * 测试预期->6. 提示信息关闭，返回部门列表勾选界面。
 * 
 */

public class 验证用户信息新增功能是否可以实现_异常操作_5633 extends Selenium_Test_Base {
	
	public 验证用户信息新增功能是否可以实现_异常操作_5633(){
		super();
	}
	
	public 验证用户信息新增功能是否可以实现_异常操作_5633(WebDriver driver){
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
		return "测试用例id: 5633\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 用户信息(#358)\n"
				+" 用例名称: 验证用户信息新增功能是否可以实现-异常操作\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）用户信息界面\n"
				+" 测试步骤->1. 点击新增按钮\n"
				+" 测试预期->1. 跳出新页面显示新增一用户所需要填写的各项内容，其中姓名和用户名称红色星号标识为必填项。\n"
				+" 测试步骤->2. 将标识的必要两项姓名和登录名填写项目分别填写test和123，点击部门信息中的新增按钮。\n"
				+" 测试预期->2. 跳出新页面显示所有部门的信息内容。\n"
				+" 测试步骤->3. 勾一条部门信息，点击确定。\n"
				+" 测试预期->3. 页面关闭，在所属部门信息的列表中出现新增加的部门。\n"
				+" 测试步骤->4. 再次点击所属部门信息下面的新增按钮。\n"
				+" 测试预期->4. 跳出新页面显示所有部门的信息内容。\n"
				+" 测试步骤->5. 勾选和步骤3相同的部门信息，点击确定。\n"
				+" 测试预期->5. 页面出现提示信息：已存在相同的部门。\n"
				+" 测试步骤->6. 点击确定按钮\n"
				+" 测试预期->6. 提示信息关闭，返回部门列表勾选界面。\n"
;
	}

}

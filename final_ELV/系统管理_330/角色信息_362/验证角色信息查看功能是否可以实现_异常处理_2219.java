package cn.edu.tju.scs.seql.final_ELV.系统管理_330.角色信息_362;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.final_ELV.系统管理_330.供应商信息_361.ElementEnum_供应商信息_361;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2219
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 角色信息(#362)
 * 用例名称: 验证角色信息查看功能是否可以实现-异常处理
 * 前置条件: 能正确进入ELV环境合规系统（标准版）角色信息界面
 * 测试步骤->1. 勾选某项角色信息，点击查看按钮。
 * 测试预期->1. 页面跳转至角色关联详细信息页面。
 * 测试步骤->2. 点击新页面中的权限中文名称，权限英文名称，更改角色类型。
 * 测试预期->2. 权限中文名称和权限英文名称不能更改，角色信息不能更改。
 * 测试步骤->3. 查看完点击关闭按钮。
 * 测试预期->3. 角色信息列表页面关闭，跳转至角色关联详细信息页面。
 * 
 */

public class 验证角色信息查看功能是否可以实现_异常处理_2219 extends Selenium_Test_Base {
	
	public 验证角色信息查看功能是否可以实现_异常处理_2219(){
		super();
	}
	
	public 验证角色信息查看功能是否可以实现_异常处理_2219(WebDriver driver){
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
		getElement(ElementEnum_角色信息_362.查看按钮).click();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_角色信息_362.查看页面权限中文名称输入框).getAttribute("readonly"), "true");
		assertEquals(getElement(ElementEnum_角色信息_362.查看页面权限英文名称输入框).getAttribute("readonly"), "true");
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_角色信息_362.查看页面关闭按钮).click();
		WebDriverConfiguration.operationInterval();
	}

	
	public String getDescription(){
		return "测试用例id: 2219\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 角色信息(#362)\n"
				+" 用例名称: 验证角色信息查看功能是否可以实现-异常处理\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）角色信息界面\n"
				+" 测试步骤->1. 勾选某项角色信息，点击查看按钮。\n"
				+" 测试预期->1. 页面跳转至角色关联详细信息页面。\n"
				+" 测试步骤->2. 点击新页面中的权限中文名称，权限英文名称，更改角色类型。\n"
				+" 测试预期->2. 权限中文名称和权限英文名称不能更改，角色信息不能更改。\n"
				+" 测试步骤->3. 查看完点击关闭按钮。\n"
				+" 测试预期->3. 角色信息列表页面关闭，跳转至角色关联详细信息页面。\n"
;
	}

}

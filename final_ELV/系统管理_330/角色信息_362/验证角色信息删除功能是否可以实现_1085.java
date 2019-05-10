package cn.edu.tju.scs.seql.final_ELV.系统管理_330.角色信息_362;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.final_ELV.法规管理_329.公告信息_353.ElementEnum_公告信息_353;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.法规管理_329.行业动态_355.ElementEnum_行业动态_355;

/**
 * 测试用例id: 1085
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 角色信息(#362)
 * 用例名称: 验证角色信息删除功能是否可以实现
 * 前置条件: 能正确进入ELV环境合规系统（标准版）角色信息界面
 * 测试步骤->1. 勾选某一角色信息，点击删除按钮。
 * 测试预期->1. 页面出现提示信息：您删除的角色中存在用户，请先删除用户再删除角色！
 * 测试步骤->2. 点击提示信息中的确定按钮。
 * 测试预期->2. 页面跳转至最初，勾选的角色信息未被删除。
 * 测试步骤->3. 进入用户信息界面，删除有关勾选角色的所有用户。回到角色信息界面，勾选步骤一中的角色信息，点击删除按钮。
 * 测试预期->3. 页面出现提示信息：删除角色成功！
 * 测试步骤->4. 点击提示信息中的确定按钮。
 * 测试预期->4. 页面跳转至最初，勾选的角色信息已被删除。
 * 
 */

public class 验证角色信息删除功能是否可以实现_1085 extends Selenium_Test_Base {
	
	public 验证角色信息删除功能是否可以实现_1085(){
		super();
	}
	
	public 验证角色信息删除功能是否可以实现_1085(WebDriver driver){
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
	


	private void operationInLeftFrameTwo() {
		getElement(ElementEnum_角色信息_362.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}

	private void detailedOperationTwo() {
		getElement(ElementEnum_角色信息_362.检索结果第一行勾选框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.删除按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.删除是按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.删除确定按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
	}

	private void detailedOperationOne() {
		getElement(ElementEnum_角色信息_362.用户信息第一行勾选框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.用户界面删除按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.用户界面删除界面是按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.确定按钮).click();
		WebDriverConfiguration.operationInterval();
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
		System.out.println("该测用例已经实现，但是用户信息界面的新增功能使用的事showmodeldiag，无法自动新增，如要使用此测试用例，请手动添加数据，然后调用testNotUse函数");
//		testNotUse();
		
	}

	public void testNotUse(){
		CommonOperations_角色信息_362 a = new CommonOperations_角色信息_362(driver);
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_角色信息_362.删除按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.删除提示信息确定按钮).click();
		WebDriverConfiguration.operationInterval();
		driver.switchTo().defaultContent();
		WebElement leftFrame=getElement(ElementEnum_角色信息_362.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_角色信息_362.rightFrame);
		//2转
	    driver.switchTo().frame(leftFrame);
	    operationInLeftFrameOne();
	    driver.switchTo().defaultContent();
		
		driver.switchTo().frame(mainFrame);
	    detailedOperationOne();
	    driver.switchTo().defaultContent();
	    //3转
	    driver.switchTo().frame(leftFrame);
	    operationInLeftFrameTwo();
	    driver.switchTo().defaultContent();
		
		driver.switchTo().frame(mainFrame);
	    detailedOperationTwo();
	}
	
	public String getDescription(){
		return "测试用例id: 1085\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 角色信息(#362)\n"
				+" 用例名称: 验证角色信息删除功能是否可以实现\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）角色信息界面\n"
				+" 测试步骤->1. 勾选某一角色信息，点击删除按钮。\n"
				+" 测试预期->1. 页面出现提示信息：您删除的角色中存在用户，请先删除用户再删除角色！\n"
				+" 测试步骤->2. 点击提示信息中的确定按钮。\n"
				+" 测试预期->2. 页面跳转至最初，勾选的角色信息未被删除。\n"
				+" 测试步骤->3. 进入用户信息界面，删除有关勾选角色的所有用户。回到角色信息界面，勾选步骤一中的角色信息，点击删除按钮。\n"
				+" 测试预期->3. 页面出现提示信息：删除角色成功！\n"
				+" 测试步骤->4. 点击提示信息中的确定按钮。\n"
				+" 测试预期->4. 页面跳转至最初，勾选的角色信息已被删除。\n"
;
	}

}

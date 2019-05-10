package cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4550
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 标准信息(#352)
 * 用例名称:  验证标准信息修改功能是否可实现-名称及类型
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 选择一条信息，点击页面中的修改按钮
 * 测试预期->1. 跳转至新页面，页面为所选标准信息的详细内容界面，可修改法规名称，选择法规类型，选择基本物质信息。
 * 测试步骤->2. 删除法规名称和所选法规类型，点击保存按钮
 * 测试预期->2. 页面出现提示信息：法规名称及法规类型为必填项！
 * 测试步骤->3. 修改法规名称为test，选择法规类型为国家标准，点击保存按钮
 * 测试预期->3. 页面正常关闭，返回到标准信息最初页面
 * 测试步骤->4. 选择查看更改过的信息
 * 测试预期->4. 所选信息的法规名称和法规类型为修改后的，即修改成功
 * 
 */

public class 验证标准信息修改功能是否可实现_名称及类型_4550 extends Selenium_Test_Base {
	
	public 验证标准信息修改功能是否可实现_名称及类型_4550(){
		super();
	}
	
	public 验证标准信息修改功能是否可实现_名称及类型_4550(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_标准信息_352.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_标准信息_352.rightFrame);
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
		getElement(ElementEnum_标准信息_352.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_标准信息_352 a = new CommonOperations_标准信息_352(driver);
		a.verifyOnlyOneMyRecord();
		a.searchMyRecord();
		getElement(ElementEnum_标准信息_352.检索结果第一行法规名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.修改按钮).click();
		WebDriverConfiguration.operationInterval();
		String name = getElement(ElementEnum_标准信息_352.查看窗口法规名称输入框).getText();
		String type = getElement(ElementEnum_标准信息_352.查看窗口法规类型输入框).getText();
		
		getElement(ElementEnum_标准信息_352.查看窗口法规名称输入框).clear();
		getElement(ElementEnum_标准信息_352.查看窗口法规类型输入框).clear();
		
		getElement(ElementEnum_标准信息_352.查看窗口保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("法规名称及法规类型为必填项");
		
		getElement(ElementEnum_标准信息_352.查看窗口法规名称输入框).clear();
		getElement(ElementEnum_标准信息_352.查看窗口法规名称输入框).sendKeys(name+"1");
		getElement(ElementEnum_标准信息_352.查看窗口法规类型下拉按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.查看窗口法规类型下拉选项_国家标准).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_标准信息_352.查看窗口保存按钮).click();
		WebDriverConfiguration.operationInterval();

		assertEquals(getElement(ElementEnum_标准信息_352.检索结果第一行法规名称), name+"1");
		
	}

	
	public String getDescription(){
		return "测试用例id: 4550\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 标准信息(#352)\n"
				+" 用例名称:  验证标准信息修改功能是否可实现-名称及类型\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 选择一条信息，点击页面中的修改按钮\n"
				+" 测试预期->1. 跳转至新页面，页面为所选标准信息的详细内容界面，可修改法规名称，选择法规类型，选择基本物质信息。\n"
				+" 测试步骤->2. 删除法规名称和所选法规类型，点击保存按钮\n"
				+" 测试预期->2. 页面出现提示信息：法规名称及法规类型为必填项！\n"
				+" 测试步骤->3. 修改法规名称为test，选择法规类型为国家标准，点击保存按钮\n"
				+" 测试预期->3. 页面正常关闭，返回到标准信息最初页面\n"
				+" 测试步骤->4. 选择查看更改过的信息\n"
				+" 测试预期->4. 所选信息的法规名称和法规类型为修改后的，即修改成功\n"
;
	}

}

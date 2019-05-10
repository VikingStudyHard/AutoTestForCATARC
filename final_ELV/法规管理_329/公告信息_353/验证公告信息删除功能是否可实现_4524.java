package cn.edu.tju.scs.seql.final_ELV.法规管理_329.公告信息_353;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4524
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 公告信息(#353)
 * 用例名称: 验证公告信息删除功能是否可实现
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击页面中的删除按钮
 * 测试预期->1. 页面出现提示信息：请选择要删除的记录
 * 测试步骤->2. 选择一条信息，点击删除按钮
 * 测试预期->2. 页面出现提示信息：是否要删除数据？
 * 测试步骤->3. 点击提示信息中的是按钮
 * 测试预期->3. 页面出现提示信息：删除公告信息成功！
 * 测试步骤->4. 选择多条信息，点击删除按钮
 * 测试预期->4. 页面出现提示信息：是否要删除数据？
 * 测试步骤->5. 点击提示信息中的是按钮
 * 测试预期->5. 页面出现提示信息：删除公告信息成功！
 * 
 */

public class 验证公告信息删除功能是否可实现_4524 extends Selenium_Test_Base {
	
	public 验证公告信息删除功能是否可实现_4524(){
		super();
	}
	
	public 验证公告信息删除功能是否可实现_4524(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_公告信息_353.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_公告信息_353.rightFrame);
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
		getElement(ElementEnum_公告信息_353.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_公告信息_353.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){

		CommonOperations_公告信息_353 a = new CommonOperations_公告信息_353(driver);
		getElement(ElementEnum_公告信息_353.删除按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTipsAndThenOperateButton("请选择要删除的记录", ElementEnum_公告信息_353.第一页提示信息, ElementEnum_公告信息_353.第一页提示框确认按钮);
		getElement(ElementEnum_公告信息_353.检索结果第一行勾选框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_公告信息_353.删除按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_公告信息_353.删除是按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_公告信息_353.删除确定按钮).click();
		WebDriverConfiguration.operationInterval();
		
		
		getElement(ElementEnum_公告信息_353.检索结果第一行勾选框).click();
		WebDriverConfiguration.operationInterval();
		driver.findElement(By.xpath(ElementEnum_公告信息_353.检索结果第一行勾选框.getName().replaceAll("tr\\[2\\]", "tr[3]"))).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_公告信息_353.删除按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_公告信息_353.删除是按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_公告信息_353.删除确定按钮).click();
		WebDriverConfiguration.operationInterval();
	}

	
	public String getDescription(){
		return "测试用例id: 4524\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 公告信息(#353)\n"
				+" 用例名称: 验证公告信息删除功能是否可实现\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击页面中的删除按钮\n"
				+" 测试预期->1. 页面出现提示信息：请选择要删除的记录\n"
				+" 测试步骤->2. 选择一条信息，点击删除按钮\n"
				+" 测试预期->2. 页面出现提示信息：是否要删除数据？\n"
				+" 测试步骤->3. 点击提示信息中的是按钮\n"
				+" 测试预期->3. 页面出现提示信息：删除公告信息成功！\n"
				+" 测试步骤->4. 选择多条信息，点击删除按钮\n"
				+" 测试预期->4. 页面出现提示信息：是否要删除数据？\n"
				+" 测试步骤->5. 点击提示信息中的是按钮\n"
				+" 测试预期->5. 页面出现提示信息：删除公告信息成功！\n"
;
	}

}

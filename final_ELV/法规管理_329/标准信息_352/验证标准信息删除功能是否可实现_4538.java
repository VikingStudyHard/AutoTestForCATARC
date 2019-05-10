package cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352;

import static org.testng.Assert.assertEquals;

import java.util.List;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4538
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 标准信息(#352)
 * 用例名称: 验证标准信息删除功能是否可实现
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击页面中的删除按钮
 * 测试预期->1. 页面出现提示信息：请选择信息!
 * 测试步骤->2. 选择一条或多条信息，点击删除按钮
 * 测试预期->2. 页面出现提示信息：确实要删除这些记录吗?
 * 测试步骤->3. 点击提示信息中的是按钮
 * 测试预期->3. 页面出现提示信息：请至少输入一项检索条件！
 * 测试步骤->4. 选择法规类型为国际标准，点击查询按钮
 * 测试预期->4. 查询出法规类型为国际标准的标准信息信息
 * 测试步骤->5. 在查询结果中选择一条或多条信息，点击删除按钮
 * 测试预期->5. 页面出现提示信息：确实要删除这些记录吗?
 * 测试步骤->6. 点击提示信息中的是按钮
 * 测试预期->6. 页面出现提示信息：删除法规信息成功！
 * 
 */

public class 验证标准信息删除功能是否可实现_4538 extends Selenium_Test_Base {
	
	public 验证标准信息删除功能是否可实现_4538(){
		super();
	}
	
	public 验证标准信息删除功能是否可实现_4538(WebDriver driver){
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
		getElement(ElementEnum_标准信息_352.删除按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请选择信息");
		
		//getElement(ElementEnum_标准信息_352.检索结果第一行法规名称).click();
		driver.findElement(By.xpath(ElementEnum_标准信息_352.检索结果第一行法规名称.getName().replaceAll("tr\\[2\\]", "tr[3]"))).click();;
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.删除按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTipsAndThenOperateButton("确实要删除这些记录吗", 
									ElementEnum_标准信息_352.第一页提示信息, 
									ElementEnum_标准信息_352.第一页提示框是按钮);
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请至少输入一项检索条件");
		
		a.verifyOnlyOneMyRecord();
		a.searchMyRecord();
		a.deleteFirstMatchRecord();
		
		List<WebElement> eles = getElements(ElementEnum_标准信息_352.检索结果所有行);
		
		assertEquals(eles.size(), 1);
		
	}

	
	public String getDescription(){
		return "测试用例id: 4538\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 标准信息(#352)\n"
				+" 用例名称: 验证标准信息删除功能是否可实现\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击页面中的删除按钮\n"
				+" 测试预期->1. 页面出现提示信息：请选择信息!\n"
				+" 测试步骤->2. 选择一条或多条信息，点击删除按钮\n"
				+" 测试预期->2. 页面出现提示信息：确实要删除这些记录吗?\n"
				+" 测试步骤->3. 点击提示信息中的是按钮\n"
				+" 测试预期->3. 页面出现提示信息：请至少输入一项检索条件！\n"
				+" 测试步骤->4. 选择法规类型为国际标准，点击查询按钮\n"
				+" 测试预期->4. 查询出法规类型为国际标准的标准信息信息\n"
				+" 测试步骤->5. 在查询结果中选择一条或多条信息，点击删除按钮\n"
				+" 测试预期->5. 页面出现提示信息：确实要删除这些记录吗?\n"
				+" 测试步骤->6. 点击提示信息中的是按钮\n"
				+" 测试预期->6. 页面出现提示信息：删除法规信息成功！\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.数据管理_325.材料数据管理_333;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3389
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 材料数据管理(#333)
 * 用例名称: 验证查询MDS材料数据信息的查看按钮是否正常工作
 * 前置条件: 拥有MDS材料数据信息的权限
 * 测试步骤->1. 点击查看按钮
 * 测试预期->1. 出现提示信息：请选择一个MDS！
 * 测试步骤->2. 勾选任意两项MDS信息
 * 测试预期->2. 无法任意勾选两项，只能在同一时间选定某一项。
 * 测试步骤->3. 勾选一项MDS信息，点击查看按钮
 * 测试预期->3. 跳出新页面，页面标题为查看的材料数据表，表单中含有相关数据的参数信息。
 * 
 */

public class 验证查询MDS材料数据信息的查看按钮是否正常工作_3389 extends Selenium_Test_Base {
	
	public 验证查询MDS材料数据信息的查看按钮是否正常工作_3389(){
		super();
	}
	
	public 验证查询MDS材料数据信息的查看按钮是否正常工作_3389(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_材料数据管理_333.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_材料数据管理_333.rightFrame);
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
		// 数据管理不需要选一级目录
//		WebDriverConfiguration.operationInterval();
//		getElement(ElementEnum_材料数据管理_333.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_材料数据管理_333.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_材料数据管理_333 a = new CommonOperations_材料数据管理_333(driver);
		getElement(ElementEnum_材料数据管理_333.查找按钮).click();
		WebDriverConfiguration.operationInterval();
		a.waitLoading();
		getElement(ElementEnum_材料数据管理_333.查看按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请选择一个MDS");
		
		getElement(ElementEnum_材料数据管理_333.检索结果第一行勾选框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_材料数据管理_333.查看按钮).click();
		WebDriverConfiguration.operationInterval();
		WebElement ele = getElement(ElementEnum_材料数据管理_333.材料数据明细标题);
		assertTrue(ele != null);
		
	}

	
	public String getDescription(){
		return "测试用例id: 3389\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 材料数据管理(#333)\n"
				+" 用例名称: 验证查询MDS材料数据信息的查看按钮是否正常工作\n"
				+" 前置条件: 拥有MDS材料数据信息的权限\n"
				+" 测试步骤->1. 点击查看按钮\n"
				+" 测试预期->1. 出现提示信息：请选择一个MDS！\n"
				+" 测试步骤->2. 勾选任意两项MDS信息\n"
				+" 测试预期->2. 无法任意勾选两项，只能在同一时间选定某一项。\n"
				+" 测试步骤->3. 勾选一项MDS信息，点击查看按钮\n"
				+" 测试预期->3. 跳出新页面，页面标题为查看的材料数据表，表单中含有相关数据的参数信息。\n"
;
	}

}

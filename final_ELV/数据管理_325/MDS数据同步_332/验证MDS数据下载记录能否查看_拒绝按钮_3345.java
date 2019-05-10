package cn.edu.tju.scs.seql.final_ELV.数据管理_325.MDS数据同步_332;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3345
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: MDS数据同步(#332)
 * 用例名称: 验证MDS数据下载记录能否查看-拒绝按钮
 * 前置条件: 1.有CAMDS帐号，拥有MDS数据同步的菜单权限。
 *         2.能够正确进入MDS数据同步界面
 * 测试步骤->1. 点击下载记录按钮
 * 测试预期->1. 跳出新页面，含有MDS数据下载记录信息和各个功能按钮。
 * 测试步骤->2. 点击右上角的拒绝按钮
 * 测试预期->2. 出现提示信息：请至少选择一个MDS！
 * 测试步骤->3. 选择一条MDS数据下载记录
 * 测试预期->3. 右上角拒绝按钮消失
 * 测试步骤->4. 选择多条MDS数据下载记录
 * 测试预期->4. 右上角拒绝按钮消失
 * 
 */

public class 验证MDS数据下载记录能否查看_拒绝按钮_3345 extends Selenium_Test_Base {
	
	public 验证MDS数据下载记录能否查看_拒绝按钮_3345(){
		super();
	}
	
	public 验证MDS数据下载记录能否查看_拒绝按钮_3345(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_MDS数据同步_332.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_MDS数据同步_332.rightFrame);
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
//		getElement(ElementEnum_MDS数据同步_332.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_MDS数据同步_332.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_MDS数据同步_332 a = new CommonOperations_MDS数据同步_332(driver);
		getElement(ElementEnum_MDS数据同步_332.下载记录按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_MDS数据同步_332.MDS数据下载记录窗口拒绝按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请至少选择一个MDS");
		
		getElement(ElementEnum_MDS数据同步_332.MDS数据下载记录窗口表格第一行勾选框).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(!getElement(ElementEnum_MDS数据同步_332.MDS数据下载记录窗口拒绝按钮).isDisplayed());
	
	}

	
	public String getDescription(){
		return "测试用例id: 3345\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: MDS数据同步(#332)\n"
				+" 用例名称: 验证MDS数据下载记录能否查看-拒绝按钮\n"
				+" 前置条件: 1.有CAMDS帐号，拥有MDS数据同步的菜单权限。 2.能够正确进入MDS数据同步界面\n"
				+" 测试步骤->1. 点击下载记录按钮\n"
				+" 测试预期->1. 跳出新页面，含有MDS数据下载记录信息和各个功能按钮。\n"
				+" 测试步骤->2. 点击右上角的拒绝按钮\n"
				+" 测试预期->2. 出现提示信息：请至少选择一个MDS！\n"
				+" 测试步骤->3. 选择一条MDS数据下载记录\n"
				+" 测试预期->3. 右上角拒绝按钮消失\n"
				+" 测试步骤->4. 选择多条MDS数据下载记录\n"
				+" 测试预期->4. 右上角拒绝按钮消失\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.法规管理_329.最新法规_354;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 6827
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 最新法规(#354)
 * 用例名称: 验证最新法规编辑功能是否可实现-编辑文本4
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击选择一条信息，点击页面中的编辑按钮
 * 测试预期->1. 跳转至新页面，页面为所选择编辑最新法规信息的详细内容。
 * 测试步骤->2. 输入原文链接的地址，如www.baidu.com，点击保存
 * 测试预期->2. 显示更新法规信息成功
 * 测试步骤->3. 点击确定
 * 测试预期->3. 页面返回至最新法规
 * 测试步骤->4. 选中刚刚编辑过的法规信息，点击查看
 * 测试预期->4. 原文链接处显示刚刚输入的网址，如www.baidu.com
 * 测试步骤->5. 点击原文链接
 * 测试预期->5. 页面跳转至百度的页面
 * 
 */

public class 验证最新法规编辑功能是否可实现_编辑文本4_6827 extends Selenium_Test_Base {
	
	public 验证最新法规编辑功能是否可实现_编辑文本4_6827(){
		super();
	}
	
	public 验证最新法规编辑功能是否可实现_编辑文本4_6827(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_最新法规_354.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_最新法规_354.rightFrame);
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
		getElement(ElementEnum_最新法规_354.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_最新法规_354.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		// TODO 编辑功能使用showModalDialog实现，无法进行测试
	}

	
	public String getDescription(){
		return "测试用例id: 6827\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 最新法规(#354)\n"
				+" 用例名称: 验证最新法规编辑功能是否可实现-编辑文本4\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击选择一条信息，点击页面中的编辑按钮\n"
				+" 测试预期->1. 跳转至新页面，页面为所选择编辑最新法规信息的详细内容。\n"
				+" 测试步骤->2. 输入原文链接的地址，如www.baidu.com，点击保存\n"
				+" 测试预期->2. 显示更新法规信息成功\n"
				+" 测试步骤->3. 点击确定\n"
				+" 测试预期->3. 页面返回至最新法规\n"
				+" 测试步骤->4. 选中刚刚编辑过的法规信息，点击查看\n"
				+" 测试预期->4. 原文链接处显示刚刚输入的网址，如www.baidu.com\n"
				+" 测试步骤->5. 点击原文链接\n"
				+" 测试预期->5. 页面跳转至百度的页面\n"
;
	}

}

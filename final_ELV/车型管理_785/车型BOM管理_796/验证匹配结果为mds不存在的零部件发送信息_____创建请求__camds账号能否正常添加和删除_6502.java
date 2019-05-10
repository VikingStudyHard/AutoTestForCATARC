package cn.edu.tju.scs.seql.final_ELV.车型管理_785.车型BOM管理_796;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 6502
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型BOM管理(#796)
 * 用例名称: 验证匹配结果为mds不存在的零部件发送信息-----创建请求--camds账号能否正常添加和删除
 * 前置条件: 正常进入车型管理模块
 * 测试步骤->1. 单击添加camds账号
 * 测试预期->1. 出现camds账号填写的对话框
 * 测试步骤->2. 直接点击添加或者删除按钮
 * 测试预期->2. 出现提示信息：请输入用户名，密码和企业部门
 * 测试步骤->3. 输入正确的用户名、密码和企业部门ID，单击添加按钮
 * 测试预期->3. camds账号填写的对话框关闭，camds账号正确填写
 * 测试步骤->4. 输入正确的用户名、密码和企业部门ID，单击删除按钮
 * 测试预期->4. 使用记录中对应的camds账号被删除
 * 
 */

public class 验证匹配结果为mds不存在的零部件发送信息_____创建请求__camds账号能否正常添加和删除_6502 extends Selenium_Test_Base {
	
	public 验证匹配结果为mds不存在的零部件发送信息_____创建请求__camds账号能否正常添加和删除_6502(){
		super();
	}
	
	public 验证匹配结果为mds不存在的零部件发送信息_____创建请求__camds账号能否正常添加和删除_6502(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
//		LoginAction.loginAction(driver,baseUrl);
//		WebElement leftFrame=getElement(ElementEnum_车型BOM管理_796.leftFrame);
//		WebElement mainFrame=getElement(ElementEnum_车型BOM管理_796.rightFrame);
//	    driver.switchTo().frame(leftFrame);
//	    operationInLeftFrame();
//	    driver.switchTo().defaultContent();
//		
//		driver.switchTo().frame(mainFrame);
//	    detailedOperation();
	}
	
	/**
	 * LeftFrame中的操作，主要是选择不同的功能
	 */
	public void operationInLeftFrame(){
		// TODO 找不到这个模块
	/*
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM管理_796.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM管理_796.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	*/
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		/*
		assertEquals(driver.findElement(By.xpath("//td")).getText(), "企业名称:");
	    assertEquals(driver.findElement(By.xpath("//td[3]")).getText(), "企业ID:");
	    assertEquals(driver.findElement(By.xpath("//td[5]")).getText(), "计划员:");
	    assertEquals(driver.findElement(By.xpath("//td[7]")).getText(), "区域");
	    assertEquals(driver.findElement(By.xpath("//td[9]")).getText(), "新增信息来源");
	    assertEquals(driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td/div/input")).getText(), "");
		*/
	
	}

	
	public String getDescription(){
		return "测试用例id: 6502\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型BOM管理(#796)\n"
				+" 用例名称: 验证匹配结果为mds不存在的零部件发送信息-----创建请求--camds账号能否正常添加和删除\n"
				+" 前置条件: 正常进入车型管理模块\n"
				+" 测试步骤->1. 单击添加camds账号\n"
				+" 测试预期->1. 出现camds账号填写的对话框\n"
				+" 测试步骤->2. 直接点击添加或者删除按钮\n"
				+" 测试预期->2. 出现提示信息：请输入用户名，密码和企业部门\n"
				+" 测试步骤->3. 输入正确的用户名、密码和企业部门ID，单击添加按钮\n"
				+" 测试预期->3. camds账号填写的对话框关闭，camds账号正确填写\n"
				+" 测试步骤->4. 输入正确的用户名、密码和企业部门ID，单击删除按钮\n"
				+" 测试预期->4. 使用记录中对应的camds账号被删除\n"
;
	}

}

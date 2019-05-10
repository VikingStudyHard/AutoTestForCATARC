package cn.edu.tju.scs.seql.final_ELV.数据管理_325.MDS数据同步_332;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3334
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: MDS数据同步(#332)
 * 用例名称: 验证输入CAMDS账户，切换账户信息是否能够同步查询MDS-异常操作
 * 前置条件: 1.有CAMDS帐号，拥有MDS数据同步的菜单权限。
 *         2.能够正确进入MDS数据同步界面
 * 测试步骤->1. 点击切换用户查询
 * 测试预期->1. 跳出新页面，含有需要填写的各项CAMDS用户信息。
 * 测试步骤->2. 点击页面右上角关闭键
 * 测试预期->2. 新页面被关闭，跳转回初始界面。
 * 测试步骤->3. 点击右下角提交按钮
 * 测试预期->3. 出现提示信息：请输入用户名、密码和企业部门ID
 * 测试步骤->4. 填写用户名为12345，点击提交按钮
 * 测试预期->4. 出现提示信息：请输入密码和企业部门ID
 * 测试步骤->5. 填写用户名为空，密码为1111，点击提交按钮
 * 测试预期->5. 出现提示信息：请输入用户名、企业部门ID
 * 测试步骤->6. 填写用户名为空，密码为空，企业部门ID为123，点击提交按钮
 * 测试预期->6. 出现提示信息：请输入用户名、密码
 * 测试步骤->7. 填写用户名为123，密码为000000，企业部门ID为123，点击提交按钮
 * 测试预期->7. 出现提示信息：E059输入授权码不正确
 * 测试步骤->8. 填写用户名为vybt0008，密码为000000，企业部门ID为123，点击提交按钮
 * 测试预期->8. 出现提示信息：E001输入用户名或密码验证不正确
 * 测试步骤->9. 填写用户名为000，密码为000000，企业部门ID为21343，点击提交按钮
 * 测试预期->9. 出现提示信息：E059输入授权码不正确
 * 测试步骤->10. 填写用户名为000，密码为12345，企业部门ID为21343，点击提交按钮
 * 测试预期->10. 出现提示信息：E001输入用户名或密码验证不正确
 * 测试步骤->11. 填写用户名为vybt0008，密码为12345，企业部门ID为21343，点击提交按钮
 * 测试预期->11. 出现提示信息：E001输入用户名或密码验证不正确
 * 
 */

public class 验证输入CAMDS账户_切换账户信息是否能够同步查询MDS_异常操作_3334 extends Selenium_Test_Base {
	
	public 验证输入CAMDS账户_切换账户信息是否能够同步查询MDS_异常操作_3334(){
		super();
	}
	
	public 验证输入CAMDS账户_切换账户信息是否能够同步查询MDS_异常操作_3334(WebDriver driver){
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
		getElement(ElementEnum_MDS数据同步_332.切换用户查询按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口右上角关闭按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_MDS数据同步_332.切换用户查询按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口提交按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请输入用户名、密码和企业部门ID");
		
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口用户名输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口用户名输入框).sendKeys("12345");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口提交按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请输入用户名、密码和企业部门ID");
		
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口用户名输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口密码输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口密码输入框).sendKeys("1111");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口提交按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请输入用户名、密码和企业部门ID");
		
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口用户名输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口密码输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口企业部门ID输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口企业部门ID输入框).sendKeys("123");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口提交按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请输入用户名、密码和企业部门ID");
		
		
		failedLogin("123", "000000", "123","E059 输入授权码不正确");
		failedLogin("vybt0008", "000000", "123","E001 用户名或密码验证不正确");
		failedLogin("000", "000000", "21343","E059 输入授权码不正确");
		failedLogin("000", "12345", "21343","E001 用户名或密码验证不正确");
		failedLogin("vybt0008", "12345", "21343","E001 用户名或密码验证不正确");
	}
	
	public void failedLogin(String user, String pwd, String companyid, String tip){
		CommonOperations_MDS数据同步_332 a = new CommonOperations_MDS数据同步_332(driver);
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口用户名输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口用户名输入框).sendKeys(user);
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口密码输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口密码输入框).sendKeys(pwd);
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口企业部门ID输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口企业部门ID输入框).sendKeys(companyid);
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_MDS数据同步_332.输入CAMDS窗口提交按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		a.verifyTips(tip);
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_MDS数据同步_332.切换用户查询按钮).click();
	}

	
	public String getDescription(){
		return "测试用例id: 3334\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: MDS数据同步(#332)\n"
				+" 用例名称: 验证输入CAMDS账户，切换账户信息是否能够同步查询MDS-异常操作\n"
				+" 前置条件: 1.有CAMDS帐号，拥有MDS数据同步的菜单权限。 2.能够正确进入MDS数据同步界面\n"
				+" 测试步骤->1. 点击切换用户查询\n"
				+" 测试预期->1. 跳出新页面，含有需要填写的各项CAMDS用户信息。\n"
				+" 测试步骤->2. 点击页面右上角关闭键\n"
				+" 测试预期->2. 新页面被关闭，跳转回初始界面。\n"
				+" 测试步骤->3. 点击右下角提交按钮\n"
				+" 测试预期->3. 出现提示信息：请输入用户名、密码和企业部门ID\n"
				+" 测试步骤->4. 填写用户名为12345，点击提交按钮\n"
				+" 测试预期->4. 出现提示信息：请输入密码和企业部门ID\n"
				+" 测试步骤->5. 填写用户名为空，密码为1111，点击提交按钮\n"
				+" 测试预期->5. 出现提示信息：请输入用户名、企业部门ID\n"
				+" 测试步骤->6. 填写用户名为空，密码为空，企业部门ID为123，点击提交按钮\n"
				+" 测试预期->6. 出现提示信息：请输入用户名、密码\n"
				+" 测试步骤->7. 填写用户名为123，密码为000000，企业部门ID为123，点击提交按钮\n"
				+" 测试预期->7. 出现提示信息：E059输入授权码不正确\n"
				+" 测试步骤->8. 填写用户名为vybt0008，密码为000000，企业部门ID为123，点击提交按钮\n"
				+" 测试预期->8. 出现提示信息：E001输入用户名或密码验证不正确\n"
				+" 测试步骤->9. 填写用户名为000，密码为000000，企业部门ID为21343，点击提交按钮\n"
				+" 测试预期->9. 出现提示信息：E059输入授权码不正确\n"
				+" 测试步骤->10. 填写用户名为000，密码为12345，企业部门ID为21343，点击提交按钮\n"
				+" 测试预期->10. 出现提示信息：E001输入用户名或密码验证不正确\n"
				+" 测试步骤->11. 填写用户名为vybt0008，密码为12345，企业部门ID为21343，点击提交按钮\n"
				+" 测试预期->11. 出现提示信息：E001输入用户名或密码验证不正确\n"
;
	}

}

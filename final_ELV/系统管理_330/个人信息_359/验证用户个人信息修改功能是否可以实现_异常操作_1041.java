package cn.edu.tju.scs.seql.final_ELV.系统管理_330.个人信息_359;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1041
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 个人信息(#359)
 * 用例名称: 验证用户个人信息修改功能是否可以实现-异常操作
 * 前置条件: 能正确进入ELV环境合规系统（标准版）个人信息界面
 * 测试步骤->1. 点击修改个人信息按钮
 * 测试预期->1. 跳出新页面，含有已存在的个人信息资料。
 * 测试步骤->2. 修改用户中文名称为admin3，点击保存。
 * 测试预期->2. 出现提示信息：个人信息修改成功。
 * 测试步骤->3. 点击修改个人信息按钮，修改用户英文名称为admin，点击保存。
 * 测试预期->3. 出现提示信息：个人信息修改成功。
 * 测试步骤->4. 修改用户中文名称为空
 * 测试预期->4. 页面用户中文名称标识为红色，点击保存信息无响应。
 * 测试步骤->5. 修改用户中文名称为admin2，电话为11111，手机为22222，传真为qqqqq，电子邮箱为123456。
 * 测试预期->5. 页面电话信息栏，手机信息栏，传真信息栏，电子邮箱信息栏标识为红色，点击保存信息无响应。
 * 测试步骤->6. 点击用户登录名一栏，试图修改内容。
 * 测试预期->6. 页面无响应，不能修改用户登录名。
 * 测试步骤->7. 正确填写除用户登录名的其他各项信息，点击保存。
 * 测试预期->7. 出现提示信息：个人信息修改成功。
 * 测试步骤->8. 点击提示信息中的确认按钮。
 * 测试预期->8. 跳转回最初页面，个人信息更新完毕。
 * 
 */

public class 验证用户个人信息修改功能是否可以实现_异常操作_1041 extends Selenium_Test_Base {
	
	public 验证用户个人信息修改功能是否可以实现_异常操作_1041(){
		super();
	}
	
	public 验证用户个人信息修改功能是否可以实现_异常操作_1041(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_个人信息_359.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_个人信息_359.rightFrame);
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
		getElement(ElementEnum_个人信息_359.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_个人信息_359.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_个人信息_359.修改个人信息).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_个人信息_359.修改页面用户中文名称输入框).clear();
		getElement(ElementEnum_个人信息_359.修改页面用户中文名称输入框).sendKeys("admin3");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_个人信息_359.修改页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		getElement(ElementEnum_个人信息_359.修改个人信息).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_个人信息_359.修改页面用户中文名称输入框).clear();
		getElement(ElementEnum_个人信息_359.修改页面用户中文名称输入框).sendKeys("admin");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_个人信息_359.修改页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		getElement(ElementEnum_个人信息_359.修改个人信息).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_个人信息_359.修改页面用户中文名称输入框).clear();
		getElement(ElementEnum_个人信息_359.修改页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_个人信息_359.修改页面用户中文名称输入框).getAttribute("aria-invalid"),"true");
		getElement(ElementEnum_个人信息_359.修改页面用户中文名称输入框).clear();
		getElement(ElementEnum_个人信息_359.修改页面电话输入框).clear();
		getElement(ElementEnum_个人信息_359.修改页面手机输入框).clear();
		getElement(ElementEnum_个人信息_359.修改页面传真输入框).clear();
		getElement(ElementEnum_个人信息_359.修改页面电子邮箱输入框).clear();
		
		getElement(ElementEnum_个人信息_359.修改页面用户中文名称输入框).sendKeys("admin2");
		getElement(ElementEnum_个人信息_359.修改页面电话输入框).sendKeys("11111");
		getElement(ElementEnum_个人信息_359.修改页面手机输入框).sendKeys("22222");
		getElement(ElementEnum_个人信息_359.修改页面传真输入框).sendKeys("qqqqq");
		getElement(ElementEnum_个人信息_359.修改页面电子邮箱输入框).sendKeys("123456");
		getElement(ElementEnum_个人信息_359.修改页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_个人信息_359.修改页面电话输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_个人信息_359.修改页面手机输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_个人信息_359.修改页面传真输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_个人信息_359.修改页面电子邮箱输入框).getAttribute("aria-invalid"),"true");
		
		assertEquals(getElement(ElementEnum_个人信息_359.修改页面用户登录名输入框).getAttribute("readonly"),"true");
		getElement(ElementEnum_个人信息_359.修改页面电话输入框).clear();
		getElement(ElementEnum_个人信息_359.修改页面手机输入框).clear();
		getElement(ElementEnum_个人信息_359.修改页面传真输入框).clear();
		getElement(ElementEnum_个人信息_359.修改页面电子邮箱输入框).clear();
		getElement(ElementEnum_个人信息_359.修改页面电话输入框).sendKeys("11111111");
		getElement(ElementEnum_个人信息_359.修改页面手机输入框).sendKeys("22222222");
		getElement(ElementEnum_个人信息_359.修改页面传真输入框).sendKeys("11111111");
		getElement(ElementEnum_个人信息_359.修改页面电子邮箱输入框).sendKeys("123@qq.com");
		getElement(ElementEnum_个人信息_359.修改页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		Alert alert3 = driver.switchTo().alert();
		alert3.accept();
		
	}

	
	public String getDescription(){
		return "测试用例id: 1041\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 个人信息(#359)\n"
				+" 用例名称: 验证用户个人信息修改功能是否可以实现-异常操作\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）个人信息界面\n"
				+" 测试步骤->1. 点击修改个人信息按钮\n"
				+" 测试预期->1. 跳出新页面，含有已存在的个人信息资料。\n"
				+" 测试步骤->2. 修改用户中文名称为admin3，点击保存。\n"
				+" 测试预期->2. 出现提示信息：个人信息修改成功。\n"
				+" 测试步骤->3. 点击修改个人信息按钮，修改用户英文名称为admin，点击保存。\n"
				+" 测试预期->3. 出现提示信息：个人信息修改成功。\n"
				+" 测试步骤->4. 修改用户中文名称为空\n"
				+" 测试预期->4. 页面用户中文名称标识为红色，点击保存信息无响应。\n"
				+" 测试步骤->5. 修改用户中文名称为admin2，电话为11111，手机为22222，传真为qqqqq，电子邮箱为123456。\n"
				+" 测试预期->5. 页面电话信息栏，手机信息栏，传真信息栏，电子邮箱信息栏标识为红色，点击保存信息无响应。\n"
				+" 测试步骤->6. 点击用户登录名一栏，试图修改内容。\n"
				+" 测试预期->6. 页面无响应，不能修改用户登录名。\n"
				+" 测试步骤->7. 正确填写除用户登录名的其他各项信息，点击保存。\n"
				+" 测试预期->7. 出现提示信息：个人信息修改成功。\n"
				+" 测试步骤->8. 点击提示信息中的确认按钮。\n"
				+" 测试预期->8. 跳转回最初页面，个人信息更新完毕。\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.系统管理_330.角色信息_362;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.final_ELV.法规管理_329.公告信息_353.CommonOperations_公告信息_353;
import cn.edu.tju.scs.seql.final_ELV.系统管理_330.供应商信息_361.ElementEnum_供应商信息_361;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1080
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 角色信息(#362)
 * 用例名称: 验证角色信息新增功能是否可以实现-异常流
 * 前置条件: 能正确进入ELV环境合规系统（标准版）角色信息界面
 * 测试步骤->1. 点击新增按钮。
 * 测试预期->1. 页面跳转至角色关联详细信息填写页面。
 * 测试步骤->2. 不填写信息，点击保存按钮。
 * 测试预期->2. 页面出现提示信息：提交数据不完整，请改正后再提交。同时权限中文名称标识为红色框。
 * 测试步骤->3. 点击提示信息中的确定按钮。填写权限中文名称为1，点击保存按钮。
 * 测试预期->3. 页面出现提示信息：提交数据不完整，请改正后再提交。
 * 测试步骤->4. 点击提示信息中的确定按钮。删除权限中文名称，填写权限英文名称为1，点击保存按钮。
 * 测试预期->4. 页面出现提示信息：提交数据不完整，请改正后再提交。同时权限中文名称标识为红色框。
 * 测试步骤->5. 点击提示信息中的确定按钮。删除权限中文名称和权限英文名称，选择角色类型为审核员，点击保存按钮。
 * 测试预期->5. 页面出现提示信息：提交数据不完整，请改正后再提交。同时权限中文名称和权限英文名称标识为红色框。
 * 测试步骤->6. 点击提示信息中的确定按钮。填写权限中文名称为1，删除权限英文名称，不选择角色类型，在数据管理中任意选取一项或几项内容，点击保存按钮。
 * 测试预期->6. 页面出现提示信息：提交数据不完整，请改正后再提交。
 * 测试步骤->7. 点击提示信息中的确定按钮。填写权限中文名称为1，填写权限英文名称为1，选择角色信息为其他，点击保存按钮。
 * 测试预期->7. 页面出现提示信息：请选择角色信息。
 * 测试步骤->8. 点击提示信息中的确定按钮。填写权限中文名称为1，填写权限英文名称为1，选择角色信息为审核员，点击保存按钮。
 * 测试预期->8. 页面出现提示信息：请选择角色信息。
 * 测试步骤->9. 点击提示信息中的确定按钮。填写权限中文名称为1，填写权限英文名称为1，不选择角色信息，在数据管理中选择一项或几项内容，点击保存按钮。
 * 测试预期->9. 页面出现提示信息：新建角色信息成功！
 * 测试步骤->10. 点击确认按钮，
 * 测试预期->10. 页面跳转至最初，页面包含新增角色信息。
 * 
 */

public class 验证角色信息新增功能是否可以实现_异常流_1080 extends Selenium_Test_Base {
	
	public 验证角色信息新增功能是否可以实现_异常流_1080(){
		super();
	}
	
	public 验证角色信息新增功能是否可以实现_异常流_1080(WebDriver driver){
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
		CommonOperations_角色信息_362 a = new CommonOperations_角色信息_362(driver);
		//1
		getElement(ElementEnum_角色信息_362.新增按钮).click();
		WebDriverConfiguration.operationInterval();
		//2
		getElement(ElementEnum_角色信息_362.新增页面权限中文名称输入框).sendKeys("");
		getElement(ElementEnum_角色信息_362.新增页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("提交数据不完整，请改正后再提交");
		assertEquals(getElement(ElementEnum_角色信息_362.新增页面权限中文名称输入框).getAttribute("aria-invalid"),"true");
		//3
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.新增页面权限中文名称输入框).sendKeys("1");
		getElement(ElementEnum_角色信息_362.新增页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("提交数据不完整，请改正后再提交");
		//4
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.新增页面权限中文名称输入框).clear();
		getElement(ElementEnum_角色信息_362.新增页面权限英文名称输入框).sendKeys("1");
		getElement(ElementEnum_角色信息_362.新增页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("提交数据不完整，请改正后再提交");
		assertEquals(getElement(ElementEnum_角色信息_362.新增页面权限中文名称输入框).getAttribute("aria-invalid"),"true");
		//5
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.新增页面权限中文名称输入框).clear();
		getElement(ElementEnum_角色信息_362.新增页面权限英文名称输入框).clear();
		getElement(ElementEnum_角色信息_362.新增页面角色类型选择按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.新增页面角色类型选择按钮审核员).click();
		getElement(ElementEnum_角色信息_362.新增页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("提交数据不完整，请改正后再提交");
		assertEquals(getElement(ElementEnum_角色信息_362.新增页面权限中文名称输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_角色信息_362.新增页面权限英文名称输入框).getAttribute("aria-invalid"),"true");
		//6
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.新增页面权限中文名称输入框).sendKeys("1");
		getElement(ElementEnum_角色信息_362.新增页面权限英文名称输入框).clear();
		getElement(ElementEnum_角色信息_362.数据管理第一项).click();
		getElement(ElementEnum_角色信息_362.新增页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("提交数据不完整，请改正后再提交");
		//7
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.新增页面权限中文名称输入框).clear();
		getElement(ElementEnum_角色信息_362.新增页面权限中文名称输入框).sendKeys("1");
		getElement(ElementEnum_角色信息_362.新增页面权限英文名称输入框).clear();
		getElement(ElementEnum_角色信息_362.新增页面权限英文名称输入框).sendKeys("1");
		getElement(ElementEnum_角色信息_362.新增页面角色类型选择按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.新增页面角色类型选择按钮其他).click();
		getElement(ElementEnum_角色信息_362.数据管理第一项).click();
		getElement(ElementEnum_角色信息_362.新增页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请选择角色信息");
		//8
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.新增页面权限中文名称输入框).clear();
		getElement(ElementEnum_角色信息_362.新增页面权限中文名称输入框).sendKeys("1");
		getElement(ElementEnum_角色信息_362.新增页面权限英文名称输入框).clear();
		getElement(ElementEnum_角色信息_362.新增页面权限英文名称输入框).sendKeys("1");
		getElement(ElementEnum_角色信息_362.新增页面角色类型选择按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.新增页面角色类型选择按钮审核员).click();
		getElement(ElementEnum_角色信息_362.新增页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请选择角色信息");
		
		//9
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.新增页面权限中文名称输入框).clear();
		getElement(ElementEnum_角色信息_362.新增页面权限中文名称输入框).sendKeys("1");
		getElement(ElementEnum_角色信息_362.新增页面权限英文名称输入框).clear();
		getElement(ElementEnum_角色信息_362.新增页面权限英文名称输入框).sendKeys("1");
		getElement(ElementEnum_角色信息_362.数据管理第一项).click();
		getElement(ElementEnum_角色信息_362.新增页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("新建角色信息成功！");
		//10
	}

	
	public String getDescription(){
		return "测试用例id: 1080\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 角色信息(#362)\n"
				+" 用例名称: 验证角色信息新增功能是否可以实现-异常流\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）角色信息界面\n"
				+" 测试步骤->1. 点击新增按钮。\n"
				+" 测试预期->1. 页面跳转至角色关联详细信息填写页面。\n"
				+" 测试步骤->2. 不填写信息，点击保存按钮。\n"
				+" 测试预期->2. 页面出现提示信息：提交数据不完整，请改正后再提交。同时权限中文名称标识为红色框。\n"
				+" 测试步骤->3. 点击提示信息中的确定按钮。填写权限中文名称为1，点击保存按钮。\n"
				+" 测试预期->3. 页面出现提示信息：提交数据不完整，请改正后再提交。\n"
				+" 测试步骤->4. 点击提示信息中的确定按钮。删除权限中文名称，填写权限英文名称为1，点击保存按钮。\n"
				+" 测试预期->4. 页面出现提示信息：提交数据不完整，请改正后再提交。同时权限中文名称标识为红色框。\n"
				+" 测试步骤->5. 点击提示信息中的确定按钮。删除权限中文名称和权限英文名称，选择角色类型为审核员，点击保存按钮。\n"
				+" 测试预期->5. 页面出现提示信息：提交数据不完整，请改正后再提交。同时权限中文名称和权限英文名称标识为红色框。\n"
				+" 测试步骤->6. 点击提示信息中的确定按钮。填写权限中文名称为1，删除权限英文名称，不选择角色类型，在数据管理中任意选取一项或几项内容，点击保存按钮。\n"
				+" 测试预期->6. 页面出现提示信息：提交数据不完整，请改正后再提交。\n"
				+" 测试步骤->7. 点击提示信息中的确定按钮。填写权限中文名称为1，填写权限英文名称为1，选择角色信息为其他，点击保存按钮。\n"
				+" 测试预期->7. 页面出现提示信息：请选择角色信息。\n"
				+" 测试步骤->8. 点击提示信息中的确定按钮。填写权限中文名称为1，填写权限英文名称为1，选择角色信息为审核员，点击保存按钮。\n"
				+" 测试预期->8. 页面出现提示信息：请选择角色信息。\n"
				+" 测试步骤->9. 点击提示信息中的确定按钮。填写权限中文名称为1，填写权限英文名称为1，不选择角色信息，在数据管理中选择一项或几项内容，点击保存按钮。\n"
				+" 测试预期->9. 页面出现提示信息：新建角色信息成功！\n"
				+" 测试步骤->10. 点击确认按钮，\n"
				+" 测试预期->10. 页面跳转至最初，页面包含新增角色信息。\n"
;
	}

}

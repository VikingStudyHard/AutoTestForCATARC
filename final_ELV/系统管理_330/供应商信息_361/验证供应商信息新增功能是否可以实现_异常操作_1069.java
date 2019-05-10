package cn.edu.tju.scs.seql.final_ELV.系统管理_330.供应商信息_361;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.final_ELV.法规管理_329.公告信息_353.ElementEnum_公告信息_353;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1069
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 供应商信息(#361)
 * 用例名称: 验证供应商信息新增功能是否可以实现-异常操作
 * 前置条件: 能正确进入ELV环境合规系统（标准版）供应商信息界面
 * 测试步骤->1. 点击新增按钮
 * 测试预期->1. 出现新页面包含各项填写内容
 * 测试步骤->2. 点击保存按钮
 * 测试预期->2. 页面下半部分的四项企业管理员信息标识为红色框，页面无其他相应。
 * 测试步骤->3. 填写企业管理员中的姓名为我，传真号码为123，联系电话为1234，电子邮箱为123，点击保存按钮。
 * 测试预期->3. 页面下半部分的四项企业管理员信息中传真号码，联系电话，电子邮箱标识为红色框，页面无其他相应。
 * 测试步骤->4. 填写企业管理员中的姓名为我，传真号码为1234567，联系电话为11111111，电子邮箱为123@qq.com，点击保存按钮。
 * 测试预期->4. 出现系统消息：用户输入的项目有误！页面上半部分的企业相关数据除企业外文名称一项外其余项目标识为红色框。
 * 测试步骤->5. 点击确定按钮，输入DUNS编码为123456，点击保存按钮。
 * 测试预期->5. 出现提示信息提示填写项目有错误
 * 测试步骤->6. 点击确定按钮，输入DUNS编码为99-999-9999，点击保存按钮。
 * 测试预期->6. 出现提示信息提示填写项目有错误
 * 测试步骤->7. 点击确定按钮，输入DUNS编码为99-999-9999，企业中文名称为test，企业英文名称为test，机构代码为111，国家为中国，省市为tj，地址为111，邮政编码为111，主营业务为111，企业身份为111，点击保存按钮。
 * 测试预期->7. 出现提示信息：新建供应商信息成功！
 * 测试步骤->8. 点击确定按钮，输入DUNS编码为99-999-9999，企业中文名称为test，企业外文名称为test，机构代码为111，国家为中国，省市为tj，地址为111，邮政编码为111，主营业务为111，企业身份为111，点击保存按钮。
 * 测试预期->8. 出现提示信息提示填写项目有错误
 * 测试步骤->9. 按步骤七修改所填写内容，点击保存按钮。
 * 测试预期->9. 出现提示信息：成功新增供应商
 * 测试步骤->10. 点击提示信息中的确认按钮
 * 测试预期->10. 页面跳转至最初页面，并包含新增供应商信息。
 * 
 */

public class 验证供应商信息新增功能是否可以实现_异常操作_1069 extends Selenium_Test_Base {
	
	public 验证供应商信息新增功能是否可以实现_异常操作_1069(){
		super();
	}
	
	public 验证供应商信息新增功能是否可以实现_异常操作_1069(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_供应商信息_361.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_供应商信息_361.rightFrame);
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
		getElement(ElementEnum_供应商信息_361.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_供应商信息_361.新增按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.新增页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_供应商信息_361.新增页面姓名输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.新增页面联系电话输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.新增页面传真号码输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.新增页面电子邮箱输入框).getAttribute("aria-invalid"),"true");
		
		getElement(ElementEnum_供应商信息_361.新增页面姓名输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面姓名输入框).sendKeys("我");
		getElement(ElementEnum_供应商信息_361.新增页面传真号码输入框).sendKeys("123");
		getElement(ElementEnum_供应商信息_361.新增页面联系电话输入框).sendKeys("1234");
		getElement(ElementEnum_供应商信息_361.新增页面电子邮箱输入框).sendKeys("123");
		getElement(ElementEnum_供应商信息_361.新增页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		
		assertEquals(getElement(ElementEnum_供应商信息_361.新增页面联系电话输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.新增页面传真号码输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.新增页面电子邮箱输入框).getAttribute("aria-invalid"),"true");
		

		getElement(ElementEnum_供应商信息_361.新增页面姓名输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面姓名输入框).sendKeys("我");
		getElement(ElementEnum_供应商信息_361.新增页面传真号码输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面传真号码输入框).sendKeys("1234567");
		getElement(ElementEnum_供应商信息_361.新增页面联系电话输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面联系电话输入框).sendKeys("11111111");
		getElement(ElementEnum_供应商信息_361.新增页面电子邮箱输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面电子邮箱输入框).sendKeys("123@qq.com");
		getElement(ElementEnum_供应商信息_361.新增页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.系统消息确定按钮).click();
		WebDriverConfiguration.operationInterval();
		
		assertEquals(getElement(ElementEnum_供应商信息_361.新增页面DUNS编码输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.新增页面企业中文名称输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.新增页面国家输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.新增页面地址输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.新增页面主营业务输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.新增页面企业英文名称输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.新增页面机构代码输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.新增页面省市输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.新增页面邮政编码输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.新增页面企业身份输入框).getAttribute("aria-invalid"),"true");
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_供应商信息_361.新增页面DUNS编码输入框).sendKeys("123456");
		getElement(ElementEnum_供应商信息_361.新增页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.系统消息确定按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.新增页面DUNS编码输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面DUNS编码输入框).sendKeys("99-999-9999");
		getElement(ElementEnum_供应商信息_361.新增页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.系统消息确定按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_供应商信息_361.新增页面DUNS编码输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面DUNS编码输入框).sendKeys("99-999-9999");
		getElement(ElementEnum_供应商信息_361.新增页面企业中文名称输入框).sendKeys("test");
		getElement(ElementEnum_供应商信息_361.新增页面国家选择按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.新增页面国家选择中国按钮).click();
		getElement(ElementEnum_供应商信息_361.新增页面地址输入框).sendKeys("111");
		getElement(ElementEnum_供应商信息_361.新增页面主营业务输入框).sendKeys("111");
		getElement(ElementEnum_供应商信息_361.新增页面企业英文名称输入框).sendKeys("test");
		getElement(ElementEnum_供应商信息_361.新增页面机构代码输入框).sendKeys("111");
		getElement(ElementEnum_供应商信息_361.新增页面省市输入框).sendKeys("tj");
		getElement(ElementEnum_供应商信息_361.新增页面邮政编码输入框).sendKeys("111");
		getElement(ElementEnum_供应商信息_361.新增页面企业身份输入框).sendKeys("111");
		
		getElement(ElementEnum_供应商信息_361.新增页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.系统消息确定按钮).click();
		WebDriverConfiguration.operationInterval();
		
		
		getElement(ElementEnum_供应商信息_361.新增按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.新增页面DUNS编码输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面DUNS编码输入框).sendKeys("99-999-9999");
		getElement(ElementEnum_供应商信息_361.新增页面企业中文名称输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面企业中文名称输入框).sendKeys("test");
		getElement(ElementEnum_供应商信息_361.新增页面国家选择按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.新增页面国家选择中国按钮).click();
		getElement(ElementEnum_供应商信息_361.新增页面地址输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面地址输入框).sendKeys("111");
		getElement(ElementEnum_供应商信息_361.新增页面主营业务输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面主营业务输入框).sendKeys("111");
		getElement(ElementEnum_供应商信息_361.新增页面企业外文名称输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面企业外文名称输入框).sendKeys("test");
		getElement(ElementEnum_供应商信息_361.新增页面机构代码输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面机构代码输入框).sendKeys("111");
		getElement(ElementEnum_供应商信息_361.新增页面省市输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面省市输入框).sendKeys("tj");
		getElement(ElementEnum_供应商信息_361.新增页面邮政编码输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面邮政编码输入框).sendKeys("111");
		getElement(ElementEnum_供应商信息_361.新增页面企业身份输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面企业身份输入框).sendKeys("111");
		getElement(ElementEnum_供应商信息_361.新增页面姓名输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面姓名输入框).sendKeys("我");
		getElement(ElementEnum_供应商信息_361.新增页面传真号码输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面传真号码输入框).sendKeys("1234567");
		getElement(ElementEnum_供应商信息_361.新增页面联系电话输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面联系电话输入框).sendKeys("11111111");
		getElement(ElementEnum_供应商信息_361.新增页面电子邮箱输入框).clear();
		getElement(ElementEnum_供应商信息_361.新增页面电子邮箱输入框).sendKeys("123@qq.com");
		
		getElement(ElementEnum_供应商信息_361.新增页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.系统消息确定按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_供应商信息_361.新增页面企业英文名称输入框).sendKeys("test");
		
		getElement(ElementEnum_供应商信息_361.新增页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.系统消息确定按钮).click();
		WebDriverConfiguration.operationInterval();
	}

	
	public String getDescription(){
		return "测试用例id: 1069\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 供应商信息(#361)\n"
				+" 用例名称: 验证供应商信息新增功能是否可以实现-异常操作\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）供应商信息界面\n"
				+" 测试步骤->1. 点击新增按钮\n"
				+" 测试预期->1. 出现新页面包含各项填写内容\n"
				+" 测试步骤->2. 点击保存按钮\n"
				+" 测试预期->2. 页面下半部分的四项企业管理员信息标识为红色框，页面无其他相应。\n"
				+" 测试步骤->3. 填写企业管理员中的姓名为我，传真号码为123，联系电话为1234，电子邮箱为123，点击保存按钮。\n"
				+" 测试预期->3. 页面下半部分的四项企业管理员信息中传真号码，联系电话，电子邮箱标识为红色框，页面无其他相应。\n"
				+" 测试步骤->4. 填写企业管理员中的姓名为我，传真号码为1234567，联系电话为11111111，电子邮箱为123@qq.com，点击保存按钮。\n"
				+" 测试预期->4. 出现系统消息：用户输入的项目有误！页面上半部分的企业相关数据除企业外文名称一项外其余项目标识为红色框。\n"
				+" 测试步骤->5. 点击确定按钮，输入DUNS编码为123456，点击保存按钮。\n"
				+" 测试预期->5. 出现提示信息提示填写项目有错误\n"
				+" 测试步骤->6. 点击确定按钮，输入DUNS编码为99-999-9999，点击保存按钮。\n"
				+" 测试预期->6. 出现提示信息提示填写项目有错误\n"
				+" 测试步骤->7. 点击确定按钮，输入DUNS编码为99-999-9999，企业中文名称为test，企业英文名称为test，机构代码为111，国家为中国，省市为tj，地址为111，邮政编码为111，主营业务为111，企业身份为111，点击保存按钮。\n"
				+" 测试预期->7. 出现提示信息：新建供应商信息成功！\n"
				+" 测试步骤->8. 点击确定按钮，输入DUNS编码为99-999-9999，企业中文名称为test，企业外文名称为test，机构代码为111，国家为中国，省市为tj，地址为111，邮政编码为111，主营业务为111，企业身份为111，点击保存按钮。\n"
				+" 测试预期->8. 出现提示信息提示填写项目有错误\n"
				+" 测试步骤->9. 按步骤七修改所填写内容，点击保存按钮。\n"
				+" 测试预期->9. 出现提示信息：成功新增供应商\n"
				+" 测试步骤->10. 点击提示信息中的确认按钮\n"
				+" 测试预期->10. 页面跳转至最初页面，并包含新增供应商信息。\n"
;
	}

}

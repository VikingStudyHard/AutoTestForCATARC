package cn.edu.tju.scs.seql.final_ELV.系统管理_330.供应商信息_361;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1073
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 供应商信息(#361)
 * 用例名称: 验证供应商信息修改功能是否可以实现-异常操作
 * 前置条件: 能正确进入ELV环境合规系统（标准版）供应商信息界面
 * 测试步骤->1. 选择一条供应商信息，点击修改按钮。
 * 测试预期->1. 出现新页面包含该供应商已存在的各项信息内容。但存在必填项目中没有信息。
 * 测试步骤->2. 点击新页面的保存按钮
 * 测试预期->2. 页面下半部分的四项企业管理员信息中的未填写信息标识为红色框，上半部分未填写的DUNS编码标识为红色框，页面无其他相应。
 * 测试步骤->3. 填写企业管理员中的姓名为我，传真号码为1234567，联系电话为11111111，电子邮箱为123@qq.com，点击保存按钮。
 * 测试预期->3. 出现系统消息：用户输入的项目有误！页面上半部分的企业相关数据除企业外文名称一项外其余未填写的项目标识为红色框。
 * 测试步骤->4. 点击确定按钮，输入DUNS编码为123456，点击保存按钮。
 * 测试预期->4. 出现提示信息提示填写项目有错误
 * 测试步骤->5. 点击确定按钮，输入DUNS编码为99-999-9999，点击保存按钮。
 * 测试预期->5. 出现提示信息提示填写项目有错误
 * 测试步骤->6. 点击确定按钮，输入DUNS编码为99-999-9999，企业中文名称为test，企业英文名称为test，机构代码为111，国家为中国，省市为tj，地址为111，邮政编码为111，主营业务为111，企业身份为111，点击保存按钮。
 * 测试预期->6. 出现提示信息：更新供应商信息成功！
 * 测试步骤->7. 点击确认按钮。
 * 测试预期->7. 页面跳回至最初页面。
 * 测试步骤->8. 点击查看修改后的供应商信息。
 * 测试预期->8. 供应商信息更新正确。
 * 
 */

public class 验证供应商信息修改功能是否可以实现_异常操作_1073 extends Selenium_Test_Base {
	
	public 验证供应商信息修改功能是否可以实现_异常操作_1073(){
		super();
	}
	
	public 验证供应商信息修改功能是否可以实现_异常操作_1073(WebDriver driver){
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
		add();
		getElement(ElementEnum_供应商信息_361.检索结果第一行勾选框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.修改按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_供应商信息_361.修改页面姓名输入框).clear();
		getElement(ElementEnum_供应商信息_361.修改页面传真号码输入框).clear();
		getElement(ElementEnum_供应商信息_361.修改页面联系电话输入框).clear();
		getElement(ElementEnum_供应商信息_361.修改页面电子邮箱输入框).clear();
		getElement(ElementEnum_供应商信息_361.修改页面DUNS编码输入框).clear();
		getElement(ElementEnum_供应商信息_361.修改页面企业中文名称输入框).clear();
		getElement(ElementEnum_供应商信息_361.修改页面企业英文名称输入框).clear();
		getElement(ElementEnum_供应商信息_361.修改页面机构代码输入框).clear();
		getElement(ElementEnum_供应商信息_361.修改页面省市输入框).clear();
		getElement(ElementEnum_供应商信息_361.修改页面地址输入框).clear();
		getElement(ElementEnum_供应商信息_361.修改页面主营业务输入框).clear();
		getElement(ElementEnum_供应商信息_361.修改页面邮政编码输入框).clear();
		getElement(ElementEnum_供应商信息_361.修改页面企业身份输入框).clear();
		getElement(ElementEnum_供应商信息_361.修改页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		
		assertEquals(getElement(ElementEnum_供应商信息_361.修改页面DUNS编码输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.修改页面姓名输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.修改页面联系电话输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.修改页面传真号码输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.修改页面电子邮箱输入框).getAttribute("aria-invalid"),"true");
		
		getElement(ElementEnum_供应商信息_361.修改页面姓名输入框).sendKeys("我");
		getElement(ElementEnum_供应商信息_361.修改页面传真号码输入框).sendKeys("1234567");
		getElement(ElementEnum_供应商信息_361.修改页面联系电话输入框).sendKeys("11111111");
		getElement(ElementEnum_供应商信息_361.修改页面电子邮箱输入框).sendKeys("123@qq.com");
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_供应商信息_361.修改页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		
		assertEquals(getElement(ElementEnum_供应商信息_361.修改页面DUNS编码输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.修改页面企业中文名称输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.修改页面地址输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.修改页面主营业务输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.修改页面企业英文名称输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.修改页面机构代码输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.修改页面省市输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.修改页面邮政编码输入框).getAttribute("aria-invalid"),"true");
		assertEquals(getElement(ElementEnum_供应商信息_361.修改页面企业身份输入框).getAttribute("aria-invalid"),"true");
		
		getElement(ElementEnum_供应商信息_361.系统消息确定按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_供应商信息_361.修改页面DUNS编码输入框).sendKeys("123456");
		getElement(ElementEnum_供应商信息_361.修改页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.系统消息确定按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.修改页面DUNS编码输入框).clear();
		getElement(ElementEnum_供应商信息_361.修改页面DUNS编码输入框).sendKeys("99-999-9999");
		getElement(ElementEnum_供应商信息_361.修改页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.系统消息确定按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.修改页面DUNS编码输入框).clear();
		getElement(ElementEnum_供应商信息_361.修改页面DUNS编码输入框).sendKeys("99-999-9999");
		getElement(ElementEnum_供应商信息_361.修改页面企业中文名称输入框).sendKeys("test");
		getElement(ElementEnum_供应商信息_361.修改页面国家选择按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.修改页面国家选择中国按钮).click();
		getElement(ElementEnum_供应商信息_361.修改页面地址输入框).sendKeys("111");
		getElement(ElementEnum_供应商信息_361.修改页面主营业务输入框).sendKeys("111");
		getElement(ElementEnum_供应商信息_361.修改页面企业英文名称输入框).sendKeys("test");
		getElement(ElementEnum_供应商信息_361.修改页面机构代码输入框).sendKeys("111");
		getElement(ElementEnum_供应商信息_361.修改页面省市输入框).sendKeys("tj");
		getElement(ElementEnum_供应商信息_361.修改页面邮政编码输入框).sendKeys("111");
		getElement(ElementEnum_供应商信息_361.修改页面企业身份输入框).sendKeys("111");
		getElement(ElementEnum_供应商信息_361.修改页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.系统消息确定按钮).click();
		WebDriverConfiguration.operationInterval();
		
	}
	private void add() {
		getElement(ElementEnum_供应商信息_361.新增按钮).click();
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
	}

	public String getDescription(){
		return "测试用例id: 1073\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 供应商信息(#361)\n"
				+" 用例名称: 验证供应商信息修改功能是否可以实现-异常操作\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）供应商信息界面\n"
				+" 测试步骤->1. 选择一条供应商信息，点击修改按钮。\n"
				+" 测试预期->1. 出现新页面包含该供应商已存在的各项信息内容。但存在必填项目中没有信息。\n"
				+" 测试步骤->2. 点击新页面的保存按钮\n"
				+" 测试预期->2. 页面下半部分的四项企业管理员信息中的未填写信息标识为红色框，上半部分未填写的DUNS编码标识为红色框，页面无其他相应。\n"
				+" 测试步骤->3. 填写企业管理员中的姓名为我，传真号码为1234567，联系电话为11111111，电子邮箱为123@qq.com，点击保存按钮。\n"
				+" 测试预期->3. 出现系统消息：用户输入的项目有误！页面上半部分的企业相关数据除企业外文名称一项外其余未填写的项目标识为红色框。\n"
				+" 测试步骤->4. 点击确定按钮，输入DUNS编码为123456，点击保存按钮。\n"
				+" 测试预期->4. 出现提示信息提示填写项目有错误\n"
				+" 测试步骤->5. 点击确定按钮，输入DUNS编码为99-999-9999，点击保存按钮。\n"
				+" 测试预期->5. 出现提示信息提示填写项目有错误\n"
				+" 测试步骤->6. 点击确定按钮，输入DUNS编码为99-999-9999，企业中文名称为test，企业英文名称为test，机构代码为111，国家为中国，省市为tj，地址为111，邮政编码为111，主营业务为111，企业身份为111，点击保存按钮。\n"
				+" 测试预期->6. 出现提示信息：更新供应商信息成功！\n"
				+" 测试步骤->7. 点击确认按钮。\n"
				+" 测试预期->7. 页面跳回至最初页面。\n"
				+" 测试步骤->8. 点击查看修改后的供应商信息。\n"
				+" 测试预期->8. 供应商信息更新正确。\n"
;
	}

}

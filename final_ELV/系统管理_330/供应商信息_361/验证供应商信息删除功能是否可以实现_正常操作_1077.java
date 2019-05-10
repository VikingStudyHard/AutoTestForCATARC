package cn.edu.tju.scs.seql.final_ELV.系统管理_330.供应商信息_361;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1077
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 供应商信息(#361)
 * 用例名称: 验证供应商信息删除功能是否可以实现-正常操作
 * 前置条件: 能正确进入ELV环境合规系统（标准版）供应商信息界面
 * 测试步骤->1. 勾选某项供应商信息，点击删除按钮。
 * 测试预期->1. 出现提示信息：是否删除！
 * 测试步骤->2. 点击提示信息中的是按钮。
 * 测试预期->2. 出现提示信息：删除供应商信息成功！
 * 测试步骤->3. 点击提示信息中的确认按钮。
 * 测试预期->3. 页面跳回至最初页面，勾选的供应商已被删除。
 * 
 */

public class 验证供应商信息删除功能是否可以实现_正常操作_1077 extends Selenium_Test_Base {
	
	public 验证供应商信息删除功能是否可以实现_正常操作_1077(){
		super();
	}
	
	public 验证供应商信息删除功能是否可以实现_正常操作_1077(WebDriver driver){
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
		getElement(ElementEnum_供应商信息_361.删除按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.删除界面是按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.删除确定按钮).click();
		WebDriverConfiguration.operationInterval();
	}

	public void add(){
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
		return "测试用例id: 1077\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 供应商信息(#361)\n"
				+" 用例名称: 验证供应商信息删除功能是否可以实现-正常操作\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）供应商信息界面\n"
				+" 测试步骤->1. 勾选某项供应商信息，点击删除按钮。\n"
				+" 测试预期->1. 出现提示信息：是否删除！\n"
				+" 测试步骤->2. 点击提示信息中的是按钮。\n"
				+" 测试预期->2. 出现提示信息：删除供应商信息成功！\n"
				+" 测试步骤->3. 点击提示信息中的确认按钮。\n"
				+" 测试预期->3. 页面跳回至最初页面，勾选的供应商已被删除。\n"
;
	}

}

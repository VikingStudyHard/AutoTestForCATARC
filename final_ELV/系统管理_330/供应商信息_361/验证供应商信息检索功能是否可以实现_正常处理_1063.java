package cn.edu.tju.scs.seql.final_ELV.系统管理_330.供应商信息_361;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.法规管理_329.行业动态_355.CommonOperations_行业动态_355;
import cn.edu.tju.scs.seql.final_ELV.法规管理_329.行业动态_355.ElementEnum_行业动态_355;

/**
 * 测试用例id: 1063
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 供应商信息(#361)
 * 用例名称: 验证供应商信息检索功能是否可以实现-正常处理
 * 前置条件: 能正确进入ELV环境合规系统（标准版）供应商信息界面
 * 测试步骤->1. 填写查找参数中的企业中文名称为bool，点击检索。
 * 测试预期->1. 检索出符合查找参数的供应商信息。
 * 测试步骤->2. 删除已填写检索内容，填写查找参数中的企业英文名称为1，点击检索。
 * 测试预期->2. 检索出符合查找参数的供应商信息。
 * 测试步骤->3. 删除已填写检索内容，填写查找参数中的供应商联系人为1，点击检索。
 * 测试预期->3. 检索出符合查找参数的供应商信息。
 * 测试步骤->4. 填写查找参数中的企业中文名称为1，填写查找参数中的企业英文名称为1，填写查找参数中的供应商联系人为1，点击检索。
 * 测试预期->4. 检索出符合查找参数的供应商信息。
 * 
 */

public class 验证供应商信息检索功能是否可以实现_正常处理_1063 extends Selenium_Test_Base {
	
	public 验证供应商信息检索功能是否可以实现_正常处理_1063(){
		super();
	}
	
	public 验证供应商信息检索功能是否可以实现_正常处理_1063(WebDriver driver){
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

		combineSearch("1", "", "");
		combineSearch("","1","");
		combineSearch("1", "1", "1");
	}

	private void combineSearch(String chinese, String english, String contract) {
		CommonOperations_行业动态_355 a = new CommonOperations_行业动态_355(driver);
		getElement(ElementEnum_供应商信息_361.企业中午名称输入框).clear();
		getElement(ElementEnum_供应商信息_361.企业中午名称输入框).sendKeys(chinese);
		getElement(ElementEnum_供应商信息_361.企业英文名称输入框).clear();
		getElement(ElementEnum_供应商信息_361.企业英文名称输入框).sendKeys(english);
		getElement(ElementEnum_供应商信息_361.供应商联系人输入框).clear();
		getElement(ElementEnum_供应商信息_361.供应商联系人输入框).sendKeys(contract);
		getElement(ElementEnum_供应商信息_361.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		WebElement tip = null;
		tip = getElement(ElementEnum_供应商信息_361.第一页提示信息);
		if(tip != null && tip.isDisplayed() && tip.getText().contains("您查找的数据不存在")){
			a.verifyTips("您查找的数据不存在");
			
		}
	}
	
	public String getDescription(){
		return "测试用例id: 1063\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 供应商信息(#361)\n"
				+" 用例名称: 验证供应商信息检索功能是否可以实现-正常处理\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）供应商信息界面\n"
				+" 测试步骤->1. 填写查找参数中的企业中文名称为bool，点击检索。\n"
				+" 测试预期->1. 检索出符合查找参数的供应商信息。\n"
				+" 测试步骤->2. 删除已填写检索内容，填写查找参数中的企业英文名称为1，点击检索。\n"
				+" 测试预期->2. 检索出符合查找参数的供应商信息。\n"
				+" 测试步骤->3. 删除已填写检索内容，填写查找参数中的供应商联系人为1，点击检索。\n"
				+" 测试预期->3. 检索出符合查找参数的供应商信息。\n"
				+" 测试步骤->4. 填写查找参数中的企业中文名称为1，填写查找参数中的企业英文名称为1，填写查找参数中的供应商联系人为1，点击检索。\n"
				+" 测试预期->4. 检索出符合查找参数的供应商信息。\n"
;
	}

}

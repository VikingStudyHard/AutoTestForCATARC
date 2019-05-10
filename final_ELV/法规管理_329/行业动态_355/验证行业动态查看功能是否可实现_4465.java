package cn.edu.tju.scs.seql.final_ELV.法规管理_329.行业动态_355;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4465
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 行业动态(#355)
 * 用例名称: 验证行业动态查看功能是否可实现
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击页面中的查看按钮
 * 测试预期->1. 页面出现提示信息：请选择一条记录
 * 测试步骤->2. 点击选择两条或两条以上的信息
 * 测试预期->2. 页面中的查看按钮消失，不可以同时查看两条及以上信息
 * 测试步骤->3. 点击选择一条信息，点击页面中的查看按钮
 * 测试预期->3. 跳转至新页面，页面为所选择查看行业动态信息的详细内容，且内容不可更改。
 * 
 */

public class 验证行业动态查看功能是否可实现_4465 extends Selenium_Test_Base {
	
	public 验证行业动态查看功能是否可实现_4465(){
		super();
	}
	
	public 验证行业动态查看功能是否可实现_4465(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_行业动态_355.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_行业动态_355.rightFrame);
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
		getElement(ElementEnum_行业动态_355.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_行业动态_355.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_行业动态_355 a = new CommonOperations_行业动态_355(driver);
		a.searchMyRecord();
		
		int nums = getElements(ElementEnum_行业动态_355.检索结果所有行).size();
		if(nums < 3){
			Assert.fail("该功能测试至少要保证搜索到两条记录，请添加\"樊向宇用来测试的行业动态\"的记录");
		}
		
		getElement(ElementEnum_行业动态_355.查看按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请选择一条记录");
		
		a.searchMyRecord();
		getElement(ElementEnum_行业动态_355.检索结果第一行勾选框).click();
		driver.findElement(By.xpath(ElementEnum_行业动态_355.检索结果第一行勾选框.getName().replaceAll("tr\\[2\\]", "tr[3]"))).click();;
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_行业动态_355.查看按钮).isDisplayed(), false);
		
		
		// 后边的时候showModalDialog实现，目前无法进行测试
	}

	
	public String getDescription(){
		return "测试用例id: 4465\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 行业动态(#355)\n"
				+" 用例名称: 验证行业动态查看功能是否可实现\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击页面中的查看按钮\n"
				+" 测试预期->1. 页面出现提示信息：请选择一条记录\n"
				+" 测试步骤->2. 点击选择两条或两条以上的信息\n"
				+" 测试预期->2. 页面中的查看按钮消失，不可以同时查看两条及以上信息\n"
				+" 测试步骤->3. 点击选择一条信息，点击页面中的查看按钮\n"
				+" 测试预期->3. 跳转至新页面，页面为所选择查看行业动态信息的详细内容，且内容不可更改。\n"
;
	}

}

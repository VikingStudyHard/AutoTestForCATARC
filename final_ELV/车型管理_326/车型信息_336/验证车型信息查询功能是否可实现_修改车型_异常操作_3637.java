package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型信息_336;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3637
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型信息(#336)
 * 用例名称: 验证车型信息查询功能是否可实现-修改车型-异常操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 单击左键选择一条创建者不为自己的车型信息，点击修改车型按钮
 * 测试预期->1. 出现失败信息：您无此权限修改该车型!
 * 测试步骤->2. 单击左键选择一条创建者为自己的车型信息，点击修改车型按钮
 * 测试预期->2. 出现修改车型窗口，含有各项需要填写的车型信息。
 * 测试步骤->3. 修改其中车型中文名称为空，整车质量：（千克）为空，点击保存按钮
 * 测试预期->3. 出现错误信息：提交数据不完整，请改正后再提交!
 * 测试步骤->4. 修改其中车型中文名称为test，整车质量：（千克）为-1，点击保存按钮
 * 测试预期->4. 出现错误信息：请输入有效数值 
 * 测试步骤->5. 修改其中车型中文名称为test，整车质量：（千克）为0，点击保存按钮
 * 测试预期->5. 出现错误信息：提交数据不完整，请改正后再提交!
 * 测试步骤->6. 修改其中车型中文名称为test0，整车质量：（千克）为10，点击关闭按钮
 * 测试预期->6. 恢复到查看车型信息页面，刚刚选择修改的车型信息未被修改。
 * 
 */

public class 验证车型信息查询功能是否可实现_修改车型_异常操作_3637 extends Selenium_Test_Base {
	
	public 验证车型信息查询功能是否可实现_修改车型_异常操作_3637(){
		super();
	}
	
	public 验证车型信息查询功能是否可实现_修改车型_异常操作_3637(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_车型信息_336.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_车型信息_336.rightFrame);
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
		getElement(ElementEnum_车型信息_336.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		// 选择第七行，应该肯定不是我创建的，哈哈
		String line7Xpath = ElementEnum_车型信息_336.检索结果第一行车型中文名称.getName().replaceAll("tr\\[2\\]", "tr["+(7+1)+"]");
		WebElement ele = driver.findElement(By.xpath(line7Xpath));
		ele.click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_车型信息_336.修改车型按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(getElement(ElementEnum_车型信息_336.第一页提示信息).getText().contains("您无此权限修改该车型"));
		getElement(ElementEnum_车型信息_336.第一页提示框确认按钮).click();
		WebDriverConfiguration.operationInterval();
		
		CommonOperations_车型信息_336 a = new CommonOperations_车型信息_336(driver);
		a.verifyOnlyOneMyRecord();
		a.searchMyRecord();
		getElement(ElementEnum_车型信息_336.检索结果第一行车型中文名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.修改车型按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_车型信息_336.新增车型中文名称输入框).clear();
		getElement(ElementEnum_车型信息_336.新增整车质量输入框).clear();
		
		verifySubmitError();
		
		getElement(ElementEnum_车型信息_336.新增车型中文名称输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型中文名称输入框).sendKeys("testBy樊向宇");
		getElement(ElementEnum_车型信息_336.新增整车质量输入框).clear();
		getElement(ElementEnum_车型信息_336.新增整车质量输入框).sendKeys("-1");
		
		verifySubmitError();
		
		getElement(ElementEnum_车型信息_336.新增车型中文名称输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型中文名称输入框).sendKeys("testBy樊向宇");
		getElement(ElementEnum_车型信息_336.新增整车质量输入框).clear();
		getElement(ElementEnum_车型信息_336.新增整车质量输入框).sendKeys("0");
		
		verifySubmitError();
		
		getElement(ElementEnum_车型信息_336.新增车型中文名称输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型中文名称输入框).sendKeys("testBy樊向宇");
		getElement(ElementEnum_车型信息_336.新增整车质量输入框).clear();
		getElement(ElementEnum_车型信息_336.新增整车质量输入框).sendKeys("10");
		getElement(ElementEnum_车型信息_336.弹出窗口关闭按钮).click();
		
	}

	public void verifySubmitError() {
		// 弹出输入有效数值提示框
		assertTrue(!getElement(ElementEnum_车型信息_336.第一页提示框最外层).getAttribute("class").contains("x-hide-offsets"));
		assertTrue(getElement(ElementEnum_车型信息_336.第一页提示信息).getText().contains("请输入有效数值"));
		getElement(ElementEnum_车型信息_336.第一页提示框确认按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.弹出窗口保存按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(getElement(ElementEnum_车型信息_336.第一页提示信息).getText().contains("提交数据不完整，请改正后再提交"));
		getElement(ElementEnum_车型信息_336.第一页提示框确认按钮).click();
		WebDriverConfiguration.operationInterval();
	}

	
	public String getDescription(){
		return "测试用例id: 3637\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型信息(#336)\n"
				+" 用例名称: 验证车型信息查询功能是否可实现-修改车型-异常操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 单击左键选择一条创建者不为自己的车型信息，点击修改车型按钮\n"
				+" 测试预期->1. 出现失败信息：您无此权限修改该车型!\n"
				+" 测试步骤->2. 单击左键选择一条创建者为自己的车型信息，点击修改车型按钮\n"
				+" 测试预期->2. 出现修改车型窗口，含有各项需要填写的车型信息。\n"
				+" 测试步骤->3. 修改其中车型中文名称为空，整车质量：（千克）为空，点击保存按钮\n"
				+" 测试预期->3. 出现错误信息：提交数据不完整，请改正后再提交!\n"
				+" 测试步骤->4. 修改其中车型中文名称为test，整车质量：（千克）为-1，点击保存按钮\n"
				+" 测试预期->4. 出现错误信息：请输入有效数值 \n"
				+" 测试步骤->5. 修改其中车型中文名称为test，整车质量：（千克）为0，点击保存按钮\n"
				+" 测试预期->5. 出现错误信息：提交数据不完整，请改正后再提交!\n"
				+" 测试步骤->6. 修改其中车型中文名称为test0，整车质量：（千克）为10，点击关闭按钮\n"
				+" 测试预期->6. 恢复到查看车型信息页面，刚刚选择修改的车型信息未被修改。\n"
;
	}

}

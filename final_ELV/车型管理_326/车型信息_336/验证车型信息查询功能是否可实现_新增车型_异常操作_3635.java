package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型信息_336;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3635
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型信息(#336)
 * 用例名称: 验证车型信息查询功能是否可实现-新增车型-异常操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 点击新增车型按钮
 * 测试预期->1. 出现新增车型窗口，含有各项需要填写的车型信息。
 * 测试步骤->2. 不填写任何信息，点击保存按钮
 * 测试预期->2. 出现错误信息：提交数据不完整，请改正后再提交!
 * 测试步骤->3. 填写任意部分带红色星标的必填项信息为test，点击保存按钮
 * 测试预期->3. 出现错误信息：提交数据不完整，请改正后再提交!
 * 测试步骤->4. 填写部分带红色星标的必填项信息为test，生产年份为2016-04-13，点击保存按钮
 * 测试预期->4. 出现错误信息：提交数据不完整，请改正后再提交!
 * 测试步骤->5. 填写所有带红色星标的必填项信息为test，生产年份为2016-04-13，点击关闭按钮
 * 测试预期->5. 页面被关闭，返回的车型信息界面不含有新增的车型信息
 * 
 */

public class 验证车型信息查询功能是否可实现_新增车型_异常操作_3635 extends Selenium_Test_Base {
	
	public 验证车型信息查询功能是否可实现_新增车型_异常操作_3635(){
		super();
	}
	
	public 验证车型信息查询功能是否可实现_新增车型_异常操作_3635(WebDriver driver){
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
		getElement(ElementEnum_车型信息_336.新增车型按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.弹出窗口保存按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(getElement(ElementEnum_车型信息_336.第一页提示信息).getText().contains("提交数据不完整，请改正后再提交"));
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.第一页提示框确认按钮).click();
		
		String defaultStr = "testBy樊向宇";
		getElement(ElementEnum_车型信息_336.新增车型商标中文输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型商标中文输入框).sendKeys(defaultStr);
		getElement(ElementEnum_车型信息_336.新增车型商标英文输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型商标英文输入框).sendKeys(defaultStr);
		getElement(ElementEnum_车型信息_336.新增车型中文名称输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型中文名称输入框).sendKeys(defaultStr);
		getElement(ElementEnum_车型信息_336.新增车型英文名称输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型英文名称输入框).sendKeys(defaultStr);
		getElement(ElementEnum_车型信息_336.新增车型通用名称输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型通用名称输入框).sendKeys(defaultStr);
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.弹出窗口保存按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(getElement(ElementEnum_车型信息_336.第一页提示信息).getText().contains("提交数据不完整，请改正后再提交"));
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.第一页提示框确认按钮).click();
		
		getElement(ElementEnum_车型信息_336.新增车型商标中文输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型商标中文输入框).sendKeys(defaultStr);
		getElement(ElementEnum_车型信息_336.新增车型商标英文输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型商标英文输入框).sendKeys(defaultStr);
		getElement(ElementEnum_车型信息_336.新增车型中文名称输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型中文名称输入框).sendKeys(defaultStr);
		getElement(ElementEnum_车型信息_336.新增车型英文名称输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型英文名称输入框).sendKeys(defaultStr);
		getElement(ElementEnum_车型信息_336.新增车型通用名称输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型通用名称输入框).sendKeys(defaultStr);
		getElement(ElementEnum_车型信息_336.新增车型型号款式输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型型号款式输入框).sendKeys(defaultStr);
		getElement(ElementEnum_车型信息_336.新增车型种类输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型种类输入框).sendKeys(defaultStr);
		getElement(ElementEnum_车型信息_336.新增整车质量输入框).clear();
		getElement(ElementEnum_车型信息_336.新增整车质量输入框).sendKeys("100");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.新增生产企业输入框).clear();
		getElement(ElementEnum_车型信息_336.新增生产企业输入框).sendKeys(defaultStr);
		
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ ElementEnum_车型信息_336.新增生产年份输入框.getName()+"\");setDate.removeAttribute('readonly');");
		getElement(ElementEnum_车型信息_336.新增生产年份输入框).clear();
		getElement(ElementEnum_车型信息_336.新增生产年份输入框).sendKeys("2016-04-13");
		
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_车型信息_336.新增长输入框).clear();
		getElement(ElementEnum_车型信息_336.新增长输入框).sendKeys("10");
		getElement(ElementEnum_车型信息_336.新增宽输入框).clear();
		getElement(ElementEnum_车型信息_336.新增宽输入框).sendKeys("10");
		getElement(ElementEnum_车型信息_336.新增高输入框).clear();
		getElement(ElementEnum_车型信息_336.新增高输入框).sendKeys("10");
		
		getElement(ElementEnum_车型信息_336.新增备注输入框).clear();
		getElement(ElementEnum_车型信息_336.新增备注输入框).sendKeys(defaultStr);
		
		WebDriverConfiguration.operationInterval();
		if(!getElement(ElementEnum_车型信息_336.第一页提示框最外层).getAttribute("class").contains("x-hide-offsets")){
			getElement(ElementEnum_车型信息_336.第一页提示框确认按钮).click();
		}
		
		getElement(ElementEnum_车型信息_336.弹出窗口关闭按钮).click();
		WebDriverConfiguration.operationInterval();
		
	}

	
	public String getDescription(){
		return "测试用例id: 3635\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型信息(#336)\n"
				+" 用例名称: 验证车型信息查询功能是否可实现-新增车型-异常操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 点击新增车型按钮\n"
				+" 测试预期->1. 出现新增车型窗口，含有各项需要填写的车型信息。\n"
				+" 测试步骤->2. 不填写任何信息，点击保存按钮\n"
				+" 测试预期->2. 出现错误信息：提交数据不完整，请改正后再提交!\n"
				+" 测试步骤->3. 填写任意部分带红色星标的必填项信息为test，点击保存按钮\n"
				+" 测试预期->3. 出现错误信息：提交数据不完整，请改正后再提交!\n"
				+" 测试步骤->4. 填写部分带红色星标的必填项信息为test，生产年份为2016-04-13，点击保存按钮\n"
				+" 测试预期->4. 出现错误信息：提交数据不完整，请改正后再提交!\n"
				+" 测试步骤->5. 填写所有带红色星标的必填项信息为test，生产年份为2016-04-13，点击关闭按钮\n"
				+" 测试预期->5. 页面被关闭，返回的车型信息界面不含有新增的车型信息\n"
;
	}

}

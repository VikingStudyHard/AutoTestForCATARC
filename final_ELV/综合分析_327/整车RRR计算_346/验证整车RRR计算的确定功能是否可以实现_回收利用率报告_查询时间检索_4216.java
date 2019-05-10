package cn.edu.tju.scs.seql.final_ELV.综合分析_327.整车RRR计算_346;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.有害物质分析_342.ElementEnum_有害物质分析_342;

/**
 * 测试用例id: 4216
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 整车RRR计算(#346)
 * 用例名称: 验证整车RRR计算的确定功能是否可以实现-回收利用率报告-查询时间检索
 * 前置条件: 能正确进入综合分析模块
 * 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮
 * 测试预期->1. 跳转至新页面，页面包含整车RRR计算基础信息表格
 * 测试步骤->2. 点击基本信息界面右上角的回收利用率报告按钮
 * 测试预期->2. 跳转至查找MDS信息页面，含有可以填写参数来查找的功能
 * 测试步骤->3. 选择查询时间类型为创建时间，不选择开始和结束时间，点击查询按钮
 * 测试预期->3. 出现错误信息：请输入开始时间！
 * 测试步骤->4. 选择查询时间类型为创建时间，选择开始时间为16年03月29日 14:49:33，不选择结束时间，点击查询按钮
 * 测试预期->4. 出现错误信息：请输入结束时间！
 * 测试步骤->5. 选择查询时间类型为创建时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮
 * 测试预期->5. 获得部分MDS信息。时间为所选时间区间。
 * 测试步骤->6. 选择查询时间类型为更新时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮
 * 测试预期->6. 获得部分MDS信息。时间为所选时间区间。
 * 测试步骤->7. 选择查询时间类型为发布时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮
 * 测试预期->7. 获得部分MDS信息。时间为所选时间区间。
 * 测试步骤->8. 选择查询时间类型为不限，开始时间和结束时间不能选择，点击查询按钮
 * 测试预期->8. 获得部分MDS信息。
 * 
 */

public class 验证整车RRR计算的确定功能是否可以实现_回收利用率报告_查询时间检索_4216 extends Selenium_Test_Base {
	
	public 验证整车RRR计算的确定功能是否可以实现_回收利用率报告_查询时间检索_4216(){
		super();
	}
	
	public 验证整车RRR计算的确定功能是否可以实现_回收利用率报告_查询时间检索_4216(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_整车RRR计算_346.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_整车RRR计算_346.rightFrame);
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
		getElement(ElementEnum_整车RRR计算_346.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_整车RRR计算_346.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_整车RRR计算_346 a = new CommonOperations_整车RRR计算_346(driver);
		a.getIntoThirdPage();
		
		getElement(ElementEnum_整车RRR计算_346.第三页查询时间类型输入框).click();
	    WebDriverConfiguration.operationInterval();
	    getElement(ElementEnum_整车RRR计算_346.第三页查询时间类型选项_不限).click();
	    WebDriverConfiguration.operationInterval();
	    getElement(ElementEnum_整车RRR计算_346.第三页报告查询按钮).click();
	    WebDriverConfiguration.operationInterval();
	    a.judgeMaskLoadPageThird();
	    
	    ((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ ElementEnum_整车RRR计算_346.第三页开始时间输入框.getName()+"\");setDate.removeAttribute('readonly');");
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ ElementEnum_整车RRR计算_346.第三页结束时间输入框.getName()+"\");setDate.removeAttribute('readonly');");
		
	    getElement(ElementEnum_整车RRR计算_346.第三页查询时间类型输入框).click();
	    WebDriverConfiguration.operationInterval();
	    getElement(ElementEnum_整车RRR计算_346.第三页查询时间类型选项_创建时间).click();
	    WebDriverConfiguration.operationInterval();
	    getElement(ElementEnum_整车RRR计算_346.第三页报告查询按钮).click();
	    WebDriverConfiguration.operationInterval();
	    assertTrue(getElement(ElementEnum_整车RRR计算_346.第三页提示信息).getText().contains("请输入开始时间"));
	    getElement(ElementEnum_整车RRR计算_346.第三页弹窗确认按钮).click();
	    WebDriverConfiguration.operationInterval();
	    
	    getElement(ElementEnum_整车RRR计算_346.第三页开始时间输入框).clear();
	    getElement(ElementEnum_整车RRR计算_346.第三页开始时间输入框).sendKeys("16年03月29日 14:49:33");
	    getElement(ElementEnum_整车RRR计算_346.第三页结束时间输入框).clear();
	    getElement(ElementEnum_整车RRR计算_346.第三页结束时间输入框).sendKeys("16年04月05日 14:49:33");
	    getElement(ElementEnum_整车RRR计算_346.第三页报告查询按钮).click();
	    WebDriverConfiguration.operationInterval();
	    a.judgeMaskLoadPageThird();
	    
	    
	    getElement(ElementEnum_整车RRR计算_346.第三页查询时间类型输入框).click();
	    WebDriverConfiguration.operationInterval();
	    getElement(ElementEnum_整车RRR计算_346.第三页查询时间类型选项_更新时间).click();
	    WebDriverConfiguration.operationInterval();
	    getElement(ElementEnum_整车RRR计算_346.第三页开始时间输入框).clear();
	    getElement(ElementEnum_整车RRR计算_346.第三页开始时间输入框).sendKeys("16年03月29日 14:49:33");
	    getElement(ElementEnum_整车RRR计算_346.第三页结束时间输入框).clear();
	    getElement(ElementEnum_整车RRR计算_346.第三页结束时间输入框).sendKeys("16年04月05日 14:49:33");
	    getElement(ElementEnum_整车RRR计算_346.第三页报告查询按钮).click();
	    WebDriverConfiguration.operationInterval();
	    a.judgeMaskLoadPageThird();
	    
	    getElement(ElementEnum_整车RRR计算_346.第三页查询时间类型输入框).click();
	    WebDriverConfiguration.operationInterval();
	    getElement(ElementEnum_整车RRR计算_346.第三页查询时间类型选项_发布时间).click();
	    WebDriverConfiguration.operationInterval();
	    getElement(ElementEnum_整车RRR计算_346.第三页开始时间输入框).clear();
	    getElement(ElementEnum_整车RRR计算_346.第三页开始时间输入框).sendKeys("16年03月29日 14:49:33");
	    getElement(ElementEnum_整车RRR计算_346.第三页结束时间输入框).clear();
	    getElement(ElementEnum_整车RRR计算_346.第三页结束时间输入框).sendKeys("16年04月05日 14:49:33");
	    getElement(ElementEnum_整车RRR计算_346.第三页报告查询按钮).click();
	    WebDriverConfiguration.operationInterval();
	    a.judgeMaskLoadPageThird();
	    
	
	}
	
	public String getDescription(){
		return "测试用例id: 4216\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 整车RRR计算(#346)\n"
				+" 用例名称: 验证整车RRR计算的确定功能是否可以实现-回收利用率报告-查询时间检索\n"
				+" 前置条件: 能正确进入综合分析模块\n"
				+" 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮\n"
				+" 测试预期->1. 跳转至新页面，页面包含整车RRR计算基础信息表格\n"
				+" 测试步骤->2. 点击基本信息界面右上角的回收利用率报告按钮\n"
				+" 测试预期->2. 跳转至查找MDS信息页面，含有可以填写参数来查找的功能\n"
				+" 测试步骤->3. 选择查询时间类型为创建时间，不选择开始和结束时间，点击查询按钮\n"
				+" 测试预期->3. 出现错误信息：请输入开始时间！\n"
				+" 测试步骤->4. 选择查询时间类型为创建时间，选择开始时间为16年03月29日 14:49:33，不选择结束时间，点击查询按钮\n"
				+" 测试预期->4. 出现错误信息：请输入结束时间！\n"
				+" 测试步骤->5. 选择查询时间类型为创建时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮\n"
				+" 测试预期->5. 获得部分MDS信息。时间为所选时间区间。\n"
				+" 测试步骤->6. 选择查询时间类型为更新时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮\n"
				+" 测试预期->6. 获得部分MDS信息。时间为所选时间区间。\n"
				+" 测试步骤->7. 选择查询时间类型为发布时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮\n"
				+" 测试预期->7. 获得部分MDS信息。时间为所选时间区间。\n"
				+" 测试步骤->8. 选择查询时间类型为不限，开始时间和结束时间不能选择，点击查询按钮\n"
				+" 测试预期->8. 获得部分MDS信息。\n"
;
	}

}

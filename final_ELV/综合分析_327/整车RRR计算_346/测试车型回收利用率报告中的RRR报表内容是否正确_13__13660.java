package cn.edu.tju.scs.seql.final_ELV.综合分析_327.整车RRR计算_346;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 13660
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 整车RRR计算(#346)
 * 用例名称: 测试车型回收利用率报告中的RRR报表内容是否正确（13）
 * 前置条件: 正确进入ELV环境合规系统中的整车RRR计算模块
 * 测试步骤->1. 单击选择品牌名称为zhongtai的车型信息，点击确定按钮。
 * 测试预期->1. 进入该车型的基础信息界面。
 * 测试步骤->2. 点击基础信息右侧上方的回收利用率报告按钮
 * 测试预期->2. 进入“请选择需要提交回收利用判定信息的零部件”界面
 * 测试步骤->3. 点击查询按钮
 * 测试预期->3. 查询得到该车型所含的三件零部件信息
 * 测试步骤->4. 点击选择产品名称为锂离子动力电池C80的MDS信息，点击确定按钮。
 * 测试预期->4. 页面出现RRR计算的进度条，进度条满格后自动下载该零部件的数据信息表到本地，格式为xlsx
 * 测试步骤->5. 点击查看已下载的RRR数据报表
 * 测试预期->5. 按照结构层次全部导出，节点类型仅涉及零部件、半成品、材料，节点名称按中文字段导出
 * 
 */

public class 测试车型回收利用率报告中的RRR报表内容是否正确_13__13660 extends Selenium_Test_Base {
	
	public 测试车型回收利用率报告中的RRR报表内容是否正确_13__13660(){
		super();
	}
	
	public 测试车型回收利用率报告中的RRR报表内容是否正确_13__13660(WebDriver driver){
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
	    
	    
	    getElement(ElementEnum_整车RRR计算_346.第三页报告查询按钮).click();
	    a.judgeMaskLoadPageThird();
//	    getElement(ElementEnum_整车RRR计算_346.第三页检索结果第一行ID).click();
//	    WebDriverConfiguration.operationInterval();
//	    getElement(ElementEnum_整车RRR计算_346.第三页确定按钮).click();
//	    WebDriverConfiguration.operationInterval();
	    
	    // TODO 其他部分测试正常，无法解决获取showModalDialog的问题
	}
	
	
	public String getDescription(){
		return "测试用例id: 13660\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 整车RRR计算(#346)\n"
				+" 用例名称: 测试车型回收利用率报告中的RRR报表内容是否正确（13）\n"
				+" 前置条件: 正确进入ELV环境合规系统中的整车RRR计算模块\n"
				+" 测试步骤->1. 单击选择品牌名称为zhongtai的车型信息，点击确定按钮。\n"
				+" 测试预期->1. 进入该车型的基础信息界面。\n"
				+" 测试步骤->2. 点击基础信息右侧上方的回收利用率报告按钮\n"
				+" 测试预期->2. 进入“请选择需要提交回收利用判定信息的零部件”界面\n"
				+" 测试步骤->3. 点击查询按钮\n"
				+" 测试预期->3. 查询得到该车型所含的三件零部件信息\n"
				+" 测试步骤->4. 点击选择产品名称为锂离子动力电池C80的MDS信息，点击确定按钮。\n"
				+" 测试预期->4. 页面出现RRR计算的进度条，进度条满格后自动下载该零部件的数据信息表到本地，格式为xlsx\n"
				+" 测试步骤->5. 点击查看已下载的RRR数据报表\n"
				+" 测试预期->5. 按照结构层次全部导出，节点类型仅涉及零部件、半成品、材料，节点名称按中文字段导出\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.综合分析_327.整车RRR计算_346;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4207
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 整车RRR计算(#346)
 * 用例名称: 验证整车RRR计算中确定功能是否可实现-基本信息操作-回收利用率报告
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮
 * 测试预期->1. 跳转至新页面，页面包含整车RRR计算基础信息表格
 * 测试步骤->2. 点击基本信息界面右上角的回收利用率报告按钮
 * 测试预期->2. 跳转至查找MDS信息页面，含有可以填写参数来查找的功能
 * 测试步骤->3. 选取任意一条查找到的MDS信息，点击确定按钮
 * 测试预期->3. 页面被正常关闭，出现进度条：RRR计算...，进度条结束后，所选择信息的回收利用率报告成功下载到本地，文件格式为.xlsx
 * 
 */

public class 验证整车RRR计算中确定功能是否可实现_基本信息操作_回收利用率报告_4207 extends Selenium_Test_Base {
	
	public 验证整车RRR计算中确定功能是否可实现_基本信息操作_回收利用率报告_4207(){
		super();
	}
	
	public 验证整车RRR计算中确定功能是否可实现_基本信息操作_回收利用率报告_4207(WebDriver driver){
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
	    getElement(ElementEnum_整车RRR计算_346.第三页检索结果第一行ID).click();
	    WebDriverConfiguration.operationInterval();
	    getElement(ElementEnum_整车RRR计算_346.第三页确定按钮).click();
	    WebDriverConfiguration.operationInterval();
	    
	    // TODO 其他部分测试正常，无法解决获取showModalDialog的问题
	}

	
	public String getDescription(){
		return "测试用例id: 4207\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 整车RRR计算(#346)\n"
				+" 用例名称: 验证整车RRR计算中确定功能是否可实现-基本信息操作-回收利用率报告\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮\n"
				+" 测试预期->1. 跳转至新页面，页面包含整车RRR计算基础信息表格\n"
				+" 测试步骤->2. 点击基本信息界面右上角的回收利用率报告按钮\n"
				+" 测试预期->2. 跳转至查找MDS信息页面，含有可以填写参数来查找的功能\n"
				+" 测试步骤->3. 选取任意一条查找到的MDS信息，点击确定按钮\n"
				+" 测试预期->3. 页面被正常关闭，出现进度条：RRR计算...，进度条结束后，所选择信息的回收利用率报告成功下载到本地，文件格式为.xlsx\n"
;
	}

}

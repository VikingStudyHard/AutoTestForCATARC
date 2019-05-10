package cn.edu.tju.scs.seql.final_ELV.综合分析_327.整车RRR计算_346;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4033
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 整车RRR计算(#346)
 * 用例名称: 验证整车RRR计算刷新功能是否可实现
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 点击整车RRR计算的车型信息版面中的刷新按钮
 * 测试预期->1. 页面处理片刻后刷新完成
 * 
 */

public class 验证整车RRR计算刷新功能是否可实现_4033 extends Selenium_Test_Base {
	
	public 验证整车RRR计算刷新功能是否可实现_4033(){
		super();
	}
	
	public 验证整车RRR计算刷新功能是否可实现_4033(WebDriver driver){
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
		
		getElement(ElementEnum_整车RRR计算_346.第一页刷新按钮).click();
		a.judgeMaskLoadFirst();
		getElement(ElementEnum_整车RRR计算_346.第一页刷新按钮).click();
		a.judgeMaskLoadFirst();
		getElement(ElementEnum_整车RRR计算_346.第一页刷新按钮).click();
		a.judgeMaskLoadFirst();
	}
	
	public String getDescription(){
		return "测试用例id: 4033\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 整车RRR计算(#346)\n"
				+" 用例名称: 验证整车RRR计算刷新功能是否可实现\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 点击整车RRR计算的车型信息版面中的刷新按钮\n"
				+" 测试预期->1. 页面处理片刻后刷新完成\n"
;
	}

}

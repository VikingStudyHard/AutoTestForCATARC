package cn.edu.tju.scs.seql.final_ELV.消息管理_328.新建消息_348;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2725
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 新建消息(#348)
 * 用例名称: 消息管理-新建消息-BOM节点版本组号查找框- 时间栏异常测试
 * 前置条件: 
 * 测试步骤->1. 查询时间类型选择“创建时间”，选择某一开始时间，以及比开始时间更早的结束时间
 * 测试预期->1. 弹出提示框提示时间选择错误
 * 
 */

public class 消息管理_新建消息_BOM节点版本组号查找框__时间栏异常测试_2725 extends Selenium_Test_Base {
	
	public 消息管理_新建消息_BOM节点版本组号查找框__时间栏异常测试_2725(){
		super();
	}
	
	public 消息管理_新建消息_BOM节点版本组号查找框__时间栏异常测试_2725(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_新建消息_348.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_新建消息_348.rightFrame);
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
		getElement(ElementEnum_新建消息_348.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_新建消息_348.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		// TODO BOM节点版本组号查找框使用showModalDialog实现，无法进行测试
	}

	
	public String getDescription(){
		return "测试用例id: 2725\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 新建消息(#348)\n"
				+" 用例名称: 消息管理-新建消息-BOM节点版本组号查找框- 时间栏异常测试\n"
				+" 前置条件: \n"
				+" 测试步骤->1. 查询时间类型选择“创建时间”，选择某一开始时间，以及比开始时间更早的结束时间\n"
				+" 测试预期->1. 弹出提示框提示时间选择错误\n"
;
	}

}

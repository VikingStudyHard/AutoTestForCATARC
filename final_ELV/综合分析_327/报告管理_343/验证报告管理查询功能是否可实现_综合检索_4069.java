package cn.edu.tju.scs.seql.final_ELV.综合分析_327.报告管理_343;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4069
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 报告管理(#343)
 * 用例名称: 验证报告管理查询功能是否可实现-综合检索
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 点击查询按钮
 * 测试预期->1. 出现提示信息：检索条件不能为空！
 * 测试步骤->2. 点击选择零部件，选择报告类型为有害物质分析报告，点击查询按钮
 * 测试预期->2. 检索出符合所选报告类型的零部件信息
 * 测试步骤->3. 点击选择零部件，选择报告类型为有害物质分析报告，零部件名称填写A，点击查询按钮
 * 测试预期->3. 检索出符合所选报告类型的零部件名称含有A字段的零部件信息
 * 
 */

public class 验证报告管理查询功能是否可实现_综合检索_4069 extends Selenium_Test_Base {
	
	public 验证报告管理查询功能是否可实现_综合检索_4069(){
		super();
	}
	
	public 验证报告管理查询功能是否可实现_综合检索_4069(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_报告管理_343.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_报告管理_343.rightFrame);
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
		getElement(ElementEnum_报告管理_343.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_报告管理_343.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		System.out.println("测试用例描述功能与实际系统不符合");
	}

	
	public String getDescription(){
		return "测试用例id: 4069\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 报告管理(#343)\n"
				+" 用例名称: 验证报告管理查询功能是否可实现-综合检索\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 点击查询按钮\n"
				+" 测试预期->1. 出现提示信息：检索条件不能为空！\n"
				+" 测试步骤->2. 点击选择零部件，选择报告类型为有害物质分析报告，点击查询按钮\n"
				+" 测试预期->2. 检索出符合所选报告类型的零部件信息\n"
				+" 测试步骤->3. 点击选择零部件，选择报告类型为有害物质分析报告，零部件名称填写A，点击查询按钮\n"
				+" 测试预期->3. 检索出符合所选报告类型的零部件名称含有A字段的零部件信息\n"
;
	}

}

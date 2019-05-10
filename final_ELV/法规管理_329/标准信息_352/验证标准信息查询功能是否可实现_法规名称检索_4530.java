package cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4530
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 标准信息(#352)
 * 用例名称: 验证标准信息查询功能是否可实现-法规名称检索 
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 在标准信息的查询条件：法规名称中填写1，点击检索按钮
 * 测试预期->1. 法规名称中含有字段1的所有标准信息被检索出来
 * 测试步骤->2. 在标准信息的查询条件：法规名称中填写test，点击检索按钮
 * 测试预期->2. 法规名称中含有字段test的所有标准信息被检索出来
 * 测试步骤->3. 在标准信息的查询条件：法规名称中填写铅，点击检索按钮
 * 测试预期->3. 法规名称中含有字段铅的所有标准信息被检索出来
 * 
 */

public class 验证标准信息查询功能是否可实现_法规名称检索_4530 extends Selenium_Test_Base {
	
	public 验证标准信息查询功能是否可实现_法规名称检索_4530(){
		super();
	}
	
	public 验证标准信息查询功能是否可实现_法规名称检索_4530(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_标准信息_352.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_标准信息_352.rightFrame);
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
		getElement(ElementEnum_标准信息_352.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		testQueryByName("1");
		testQueryByName("test");
		testQueryByName("铅");
	}
	
	public void testQueryByName(String name){
		CommonOperations_标准信息_352 a = new CommonOperations_标准信息_352(driver);
		a.testQueryByGeneralName(name, ElementEnum_标准信息_352.法规名称输入框, 
									ElementEnum_标准信息_352.检索按钮, 
									ElementEnum_标准信息_352.检索结果所有行, 
									ElementEnum_标准信息_352.检索结果第一行法规名称, 
									ElementEnum_标准信息_352.检索结果第一行法规名称);
		
	}

	
	public String getDescription(){
		return "测试用例id: 4530\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 标准信息(#352)\n"
				+" 用例名称: 验证标准信息查询功能是否可实现-法规名称检索 \n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 在标准信息的查询条件：法规名称中填写1，点击检索按钮\n"
				+" 测试预期->1. 法规名称中含有字段1的所有标准信息被检索出来\n"
				+" 测试步骤->2. 在标准信息的查询条件：法规名称中填写test，点击检索按钮\n"
				+" 测试预期->2. 法规名称中含有字段test的所有标准信息被检索出来\n"
				+" 测试步骤->3. 在标准信息的查询条件：法规名称中填写铅，点击检索按钮\n"
				+" 测试预期->3. 法规名称中含有字段铅的所有标准信息被检索出来\n"
;
	}

}

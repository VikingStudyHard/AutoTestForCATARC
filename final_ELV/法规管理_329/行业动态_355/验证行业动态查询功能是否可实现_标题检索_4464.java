package cn.edu.tju.scs.seql.final_ELV.法规管理_329.行业动态_355;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4464
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 行业动态(#355)
 * 用例名称: 验证行业动态查询功能是否可实现-标题检索 
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 在行业动态的查询条件：标题中填写1，点击检索按钮
 * 测试预期->1. 标题中含有字段1的所有行业动态被检索出来
 * 测试步骤->2. 在行业动态的查询条件：标题中填写sd，点击检索按钮
 * 测试预期->2. 标题中含有字段sd的所有行业动态被检索出来
 * 测试步骤->3. 在行业动态的查询条件：标题中填写汽车前景，点击检索按钮
 * 测试预期->3. 标题中含有字段汽车前景的所有行业动态被检索出来
 * 
 */

public class 验证行业动态查询功能是否可实现_标题检索_4464 extends Selenium_Test_Base {
	
	public 验证行业动态查询功能是否可实现_标题检索_4464(){
		super();
	}
	
	public 验证行业动态查询功能是否可实现_标题检索_4464(WebDriver driver){
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
		testByTitle("1");
		testByTitle("sd");
		testByTitle("汽车前景");
	}
	
	public void testByTitle(String title){
		CommonOperations_行业动态_355 a = new CommonOperations_行业动态_355(driver);
		a.testQueryByGeneralName(title, ElementEnum_行业动态_355.标题输入框,
								ElementEnum_行业动态_355.检索按钮, 
								ElementEnum_行业动态_355.检索结果所有行, 
								ElementEnum_行业动态_355.检索结果第一行标题, 
								ElementEnum_行业动态_355.检索结果第一行标题);
	}

	
	public String getDescription(){
		return "测试用例id: 4464\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 行业动态(#355)\n"
				+" 用例名称: 验证行业动态查询功能是否可实现-标题检索 \n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 在行业动态的查询条件：标题中填写1，点击检索按钮\n"
				+" 测试预期->1. 标题中含有字段1的所有行业动态被检索出来\n"
				+" 测试步骤->2. 在行业动态的查询条件：标题中填写sd，点击检索按钮\n"
				+" 测试预期->2. 标题中含有字段sd的所有行业动态被检索出来\n"
				+" 测试步骤->3. 在行业动态的查询条件：标题中填写汽车前景，点击检索按钮\n"
				+" 测试预期->3. 标题中含有字段汽车前景的所有行业动态被检索出来\n"
;
	}

}

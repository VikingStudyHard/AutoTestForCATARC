package cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4542
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 标准信息(#352)
 * 用例名称: 验证标准信息查询功能是否可实现-创建人检索 
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 在标准信息的查询条件：创建人中填写admin，点击检索按钮
 * 测试预期->1. 创建人为管理员的所有标准信息被检索出来
 * 测试步骤->2. 在标准信息的查询条件：创建人中填写test，点击检索按钮
 * 测试预期->2. 无符合条件的信息被检索出来
 * 测试步骤->3. 在标准信息的查询条件：创建人中填写-，点击检索按钮
 * 测试预期->3. 创建人为-的信息被检索出来
 * 
 */

public class 验证标准信息查询功能是否可实现_创建人检索_4542 extends Selenium_Test_Base {
	
	public 验证标准信息查询功能是否可实现_创建人检索_4542(){
		super();
	}
	
	public 验证标准信息查询功能是否可实现_创建人检索_4542(WebDriver driver){
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
		testQueryByCreatePeopel("admin");
		testQueryByCreatePeopel("test");
		testQueryByCreatePeopel("-");
		testQueryByCreatePeopel("樊向宇的测试账户");
	}
	
	public void testQueryByCreatePeopel(String name){
		CommonOperations_标准信息_352 a = new CommonOperations_标准信息_352(driver);
		a.testQueryByGeneralName(name, ElementEnum_标准信息_352.创建人输入框, 
									ElementEnum_标准信息_352.检索按钮,
									ElementEnum_标准信息_352.检索结果所有行, 
									ElementEnum_标准信息_352.检索结果第一行创建人, 
									ElementEnum_标准信息_352.检索结果第一行创建人);
	}

	
	public String getDescription(){
		return "测试用例id: 4542\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 标准信息(#352)\n"
				+" 用例名称: 验证标准信息查询功能是否可实现-创建人检索 \n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 在标准信息的查询条件：创建人中填写admin，点击检索按钮\n"
				+" 测试预期->1. 创建人为管理员的所有标准信息被检索出来\n"
				+" 测试步骤->2. 在标准信息的查询条件：创建人中填写test，点击检索按钮\n"
				+" 测试预期->2. 无符合条件的信息被检索出来\n"
				+" 测试步骤->3. 在标准信息的查询条件：创建人中填写-，点击检索按钮\n"
				+" 测试预期->3. 创建人为-的信息被检索出来\n"
;
	}

}

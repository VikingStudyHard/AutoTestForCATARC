package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型信息_336;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3629
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型信息(#336)
 * 用例名称: 验证车型信息查询功能是否可实现-通用名称检索
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 在车型信息的查询条件：通用名称中填写1，点击检索按钮
 * 测试预期->1. 车型中文（或英文）名称中含有字段1的所有车型信息被检索出来
 * 测试步骤->2. 在车型信息的查询条件：通用名称中填写ca，点击检索按钮
 * 测试预期->2. 车型中文（或英文）名称中含有字段ca的所有车型信息被检索出来
 * 测试步骤->3. 在车型信息的查询条件：通用名称中填写抱抱熊，点击检索按钮
 * 测试预期->3. 车型中文（或英文）名称中含有字段抱抱熊的所有车型信息被检索出来
 * 
 */

public class 验证车型信息查询功能是否可实现_通用名称检索_3629 extends Selenium_Test_Base {
	
	public 验证车型信息查询功能是否可实现_通用名称检索_3629(){
		super();
	}
	
	public 验证车型信息查询功能是否可实现_通用名称检索_3629(WebDriver driver){
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
		testQueryByGeneralName("1");
		testQueryByGeneralName("ca");
		testQueryByGeneralName("抱抱熊");
	}
	
	public void testQueryByGeneralName(String name){
		CommonOperations_车型信息_336 a = new CommonOperations_车型信息_336(driver);
		a.testQueryByGeneralName(name, ElementEnum_车型信息_336.通用名称输入框, 
							ElementEnum_车型信息_336.检索按钮, 
							ElementEnum_车型信息_336.检索结果所有行, 
							ElementEnum_车型信息_336.检索结果第一行车型中文名称, 
							ElementEnum_车型信息_336.检索结果第一行车型英文名称);
	}
	
	

	
	public String getDescription(){
		return "测试用例id: 3629\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型信息(#336)\n"
				+" 用例名称: 验证车型信息查询功能是否可实现-通用名称检索\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 在车型信息的查询条件：通用名称中填写1，点击检索按钮\n"
				+" 测试预期->1. 车型中文（或英文）名称中含有字段1的所有车型信息被检索出来\n"
				+" 测试步骤->2. 在车型信息的查询条件：通用名称中填写ca，点击检索按钮\n"
				+" 测试预期->2. 车型中文（或英文）名称中含有字段ca的所有车型信息被检索出来\n"
				+" 测试步骤->3. 在车型信息的查询条件：通用名称中填写抱抱熊，点击检索按钮\n"
				+" 测试预期->3. 车型中文（或英文）名称中含有字段抱抱熊的所有车型信息被检索出来\n"
;
	}

}

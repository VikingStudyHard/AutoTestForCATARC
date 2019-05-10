package cn.edu.tju.scs.seql.final_ELV.法规管理_329.高危清单_356;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4439
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 高危清单(#356)
 * 用例名称: 验证高危清单查询功能是否可实现-品牌名称检索 
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 在高危清单的查询条件：品牌名称中填写1，点击检索按钮
 * 测试预期->1. 品牌（中文或英文）名称中含有字段1的所有车型信息被检索出来
 * 测试步骤->2. 在高危清单的查询条件：品牌名称中填写ca，点击检索按钮
 * 测试预期->2. 品牌（中文或英文）名称中含有字段ca的所有车型信息被检索出来
 * 测试步骤->3. 在高危清单的查询条件：品牌名称中填写卡达克，点击检索按钮
 * 测试预期->3. 品牌（中文或英文）名称中含有字段卡达克的所有车型信息被检索出来
 * 
 */

public class 验证高危清单查询功能是否可实现_品牌名称检索_4439 extends Selenium_Test_Base {
	
	public 验证高危清单查询功能是否可实现_品牌名称检索_4439(){
		super();
	}
	
	public 验证高危清单查询功能是否可实现_品牌名称检索_4439(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_高危清单_356.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_高危清单_356.rightFrame);
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
		getElement(ElementEnum_高危清单_356.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		testByPingPaiName("1");
		testByPingPaiName("ca");
		testByPingPaiName("卡达克");
		
	}
	
	public void testByPingPaiName(String name){
		CommonOperations_高危清单_356 a = new CommonOperations_高危清单_356(driver);
		a.testQueryByGeneralName(name, ElementEnum_高危清单_356.品牌名称输入框, 
				ElementEnum_高危清单_356.检索按钮, 
				ElementEnum_高危清单_356.检索结果所有行, 
				ElementEnum_高危清单_356.检索结果第一行品牌中文名称, 
				ElementEnum_高危清单_356.检索结果第一行品牌英文名称);
	}

	
	public String getDescription(){
		return "测试用例id: 4439\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 高危清单(#356)\n"
				+" 用例名称: 验证高危清单查询功能是否可实现-品牌名称检索 \n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 在高危清单的查询条件：品牌名称中填写1，点击检索按钮\n"
				+" 测试预期->1. 品牌（中文或英文）名称中含有字段1的所有车型信息被检索出来\n"
				+" 测试步骤->2. 在高危清单的查询条件：品牌名称中填写ca，点击检索按钮\n"
				+" 测试预期->2. 品牌（中文或英文）名称中含有字段ca的所有车型信息被检索出来\n"
				+" 测试步骤->3. 在高危清单的查询条件：品牌名称中填写卡达克，点击检索按钮\n"
				+" 测试预期->3. 品牌（中文或英文）名称中含有字段卡达克的所有车型信息被检索出来\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.综合分析_327.报告管理_343;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4046
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 报告管理(#343)
 * 用例名称: 验证报告管理查询功能是否可实现-整车品牌名称检索 
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 在报告管理的查询条件：品牌名称中填写1，点击检索按钮
 * 测试预期->1. 品牌名称中含有字段1的所有报表信息被检索出来
 * 测试步骤->2. 在报告管理的查询条件：品牌名称中填写ca，点击检索按钮
 * 测试预期->2. 品牌名称中含有字段ca的所有报表信息被检索出来
 * 测试步骤->3. 在报告管理的查询条件：品牌名称中填写卡达克，点击检索按钮
 * 测试预期->3. 品牌名称中含有字段卡达克的所有报表信息被检索出来
 * 
 */

public class 验证报告管理查询功能是否可实现_整车品牌名称检索_4046 extends Selenium_Test_Base {
	
	public 验证报告管理查询功能是否可实现_整车品牌名称检索_4046(){
		super();
	}
	
	public 验证报告管理查询功能是否可实现_整车品牌名称检索_4046(WebDriver driver){
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
		return "测试用例id: 4046\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 报告管理(#343)\n"
				+" 用例名称: 验证报告管理查询功能是否可实现-整车品牌名称检索 \n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 在报告管理的查询条件：品牌名称中填写1，点击检索按钮\n"
				+" 测试预期->1. 品牌名称中含有字段1的所有报表信息被检索出来\n"
				+" 测试步骤->2. 在报告管理的查询条件：品牌名称中填写ca，点击检索按钮\n"
				+" 测试预期->2. 品牌名称中含有字段ca的所有报表信息被检索出来\n"
				+" 测试步骤->3. 在报告管理的查询条件：品牌名称中填写卡达克，点击检索按钮\n"
				+" 测试预期->3. 品牌名称中含有字段卡达克的所有报表信息被检索出来\n"
;
	}

}

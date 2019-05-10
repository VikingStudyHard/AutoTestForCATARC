package cn.edu.tju.scs.seql.final_ELV.综合分析_327.整车RRR计算_346;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.有害物质分析_342.验证有害物质分析查询功能是否可实现_品牌名称检索_4021;

/**
 * 测试用例id: 4036
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 整车RRR计算(#346)
 * 用例名称: 验证整车RRR计算查询功能是否可实现-品牌名称检索 
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 在整车RRR计算的查询条件：品牌名称中填写1，点击检索按钮
 * 测试预期->1. 品牌（中文或英文）名称中含有字段1的所有车型信息被检索出来
 * 测试步骤->2. 在整车RRR计算的查询条件：品牌名称中填写ca，点击检索按钮
 * 测试预期->2. 品牌（中文或英文）名称中含有字段ca的所有车型信息被检索出来
 * 测试步骤->3. 在整车RRR计算的查询条件：品牌名称中填写卡达克，点击检索按钮
 * 测试预期->3. 品牌（中文或英文）名称中含有字段卡达克的所有车型信息被检索出来
 * 
 */

public class 验证整车RRR计算查询功能是否可实现_品牌名称检索_4036 extends Selenium_Test_Base {
	
	public 验证整车RRR计算查询功能是否可实现_品牌名称检索_4036(){
		super();
	}
	
	public 验证整车RRR计算查询功能是否可实现_品牌名称检索_4036(WebDriver driver){
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
		// 与“验证有害物质分析查询功能是否可实现_品牌名称检索_4021”的测试内容相同
		验证有害物质分析查询功能是否可实现_品牌名称检索_4021 a = new 验证有害物质分析查询功能是否可实现_品牌名称检索_4021(driver);
		try {
			a.detailedOperation();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	
	public String getDescription(){
		return "测试用例id: 4036\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 整车RRR计算(#346)\n"
				+" 用例名称: 验证整车RRR计算查询功能是否可实现-品牌名称检索 \n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 在整车RRR计算的查询条件：品牌名称中填写1，点击检索按钮\n"
				+" 测试预期->1. 品牌（中文或英文）名称中含有字段1的所有车型信息被检索出来\n"
				+" 测试步骤->2. 在整车RRR计算的查询条件：品牌名称中填写ca，点击检索按钮\n"
				+" 测试预期->2. 品牌（中文或英文）名称中含有字段ca的所有车型信息被检索出来\n"
				+" 测试步骤->3. 在整车RRR计算的查询条件：品牌名称中填写卡达克，点击检索按钮\n"
				+" 测试预期->3. 品牌（中文或英文）名称中含有字段卡达克的所有车型信息被检索出来\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型信息_336;

import java.util.List;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3630
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型信息(#336)
 * 用例名称: 验证车型信息查询功能是否可实现-创建时间检索
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 在车型信息的查询条件：创建时间从2016-03-08开始，点击检索按钮
 * 测试预期->1. 检索出创建时间为2016-03-08之后的所有车型信息。
 * 测试步骤->2. 在车型信息的查询条件：创建时间2016-04-08结束，点击检索按钮
 * 测试预期->2. 检索出创建时间为2016-04-08之前的所有车型信息。
 * 测试步骤->3. 在车型信息的查询条件：创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮
 * 测试预期->3. 检索出创建时间为2016-03-08到2016-04-11的所有车型信息。
 * 测试步骤->4. 在车型信息的查询条件：创建时间从2016-04-08开始，到2016-03-11结束，点击检索按钮
 * 测试预期->4. 出现错误提示：开始时间早于结束时间!
 * 
 */

public class 验证车型信息查询功能是否可实现_创建时间检索_3630 extends Selenium_Test_Base {
	
	public 验证车型信息查询功能是否可实现_创建时间检索_3630(){
		super();
	}
	
	public 验证车型信息查询功能是否可实现_创建时间检索_3630(WebDriver driver){
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
		testQueryByTime("2016-03-08", "");
		testQueryByTime("", "2016-04-08");
		testQueryByTime("2016-03-08", "2016-04-11");
		testQueryByTime("2016-04-11", "2016-03-08");
	}
	
	public void testQueryByTime(String startTime, String endTime){
		CommonOperations_车型信息_336 a = new CommonOperations_车型信息_336(driver);
		a.testQueryByTime(startTime, endTime, 
				ElementEnum_车型信息_336.创建起始时间输入框, 
				ElementEnum_车型信息_336.创建终止时间输入框, 
				ElementEnum_车型信息_336.检索按钮, 
				ElementEnum_车型信息_336.检索结果所有行, 
				ElementEnum_车型信息_336.检索结果第一行更新时间, 
				ElementEnum_车型信息_336.第一页提示信息,
				new ICallback() {
					@Override
					public void callback() {
						CommonOperations_车型信息_336 a = new CommonOperations_车型信息_336(driver);
						a.judgeMaskLoadFirst();
					}
				});
	}
	
	

	
	public String getDescription(){
		return "测试用例id: 3630\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型信息(#336)\n"
				+" 用例名称: 验证车型信息查询功能是否可实现-创建时间检索\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 在车型信息的查询条件：创建时间从2016-03-08开始，点击检索按钮\n"
				+" 测试预期->1. 检索出创建时间为2016-03-08之后的所有车型信息。\n"
				+" 测试步骤->2. 在车型信息的查询条件：创建时间2016-04-08结束，点击检索按钮\n"
				+" 测试预期->2. 检索出创建时间为2016-04-08之前的所有车型信息。\n"
				+" 测试步骤->3. 在车型信息的查询条件：创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮\n"
				+" 测试预期->3. 检索出创建时间为2016-03-08到2016-04-11的所有车型信息。\n"
				+" 测试步骤->4. 在车型信息的查询条件：创建时间从2016-04-08开始，到2016-03-11结束，点击检索按钮\n"
				+" 测试预期->4. 出现错误提示：开始时间早于结束时间!\n"
;
	}

}

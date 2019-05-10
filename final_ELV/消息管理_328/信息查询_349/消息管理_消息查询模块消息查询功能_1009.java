package cn.edu.tju.scs.seql.final_ELV.消息管理_328.信息查询_349;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1009
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 信息查询(#349)
 * 用例名称: 消息管理-消息查询模块消息查询功能
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询
 * 测试步骤->1. 上方查询栏，在消息类型一栏选择发送方/接收方， 点击查询按钮
 * 测试预期->1. 消息列表分页显示已发送消息/已接收消息
 * 测试步骤->2. 只选择某一开始时间， 结束时间选择为空， 点击查询按钮
 * 测试预期->2. 消息列表分页显示所有从开始时间到当前时间内的消息
 * 测试步骤->3. 只选择某一结束时间， 开始时间选择为空， 点击查询按钮
 * 测试预期->3. 分页显示从最早时间到结束时间内的所有消息
 * 测试步骤->4. 选择某一开始时间， 再选择某一比开始时间更晚的结束时间， 点击查询按钮
 * 测试预期->4. 列表分页显示开始时间到结束时间内的所有消息
 * 测试步骤->5. 选择某一比当前时间更晚的开始时间， 在选择某一比开始时间更晚的结束时间， 点击查询按钮
 * 测试预期->5. 弹出提示框提示查询无数据
 * 测试步骤->6. 选择某一开始时间， 再选择某一比开始时间更早的结束时间 点击查询按钮
 * 测试预期->6. 弹出提示框提示开始时间不能大于截止时间
 * 
 */

public class 消息管理_消息查询模块消息查询功能_1009 extends Selenium_Test_Base {
	
	public 消息管理_消息查询模块消息查询功能_1009(){
		super();
	}
	
	public 消息管理_消息查询模块消息查询功能_1009(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_信息查询_349.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_信息查询_349.rightFrame);
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
		getElement(ElementEnum_信息查询_349.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_信息查询_349.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		testByTime("2016-03-08","");
		testByTime("","2016-04-08");
		testByTime("2016-03-08","2016-04-11");
	}
	
	public void testByTime(String startTime, String endTime){
		CommonOperations_信息查询_349 a = new CommonOperations_信息查询_349(driver);
		a.testQueryByTime(startTime, endTime, 
				ElementEnum_信息查询_349.开始时间输入框, 
				ElementEnum_信息查询_349.结束时间输入框, 
				ElementEnum_信息查询_349.查询按钮, 
				ElementEnum_信息查询_349.检索结果所有行, 
				ElementEnum_信息查询_349.检索结果第一行创建时间, 
				ElementEnum_信息查询_349.第一页提示信息, 
				new ICallback() {
					@Override
					public void callback() {
						WebDriverConfiguration.operationInterval();
						WebDriverConfiguration.operationInterval();
						WebDriverConfiguration.operationInterval();
						WebDriverConfiguration.operationInterval();
						
					}
				});
	}

	
	public String getDescription(){
		return "测试用例id: 1009\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 信息查询(#349)\n"
				+" 用例名称: 消息管理-消息查询模块消息查询功能\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询\n"
				+" 测试步骤->1. 上方查询栏，在消息类型一栏选择发送方/接收方， 点击查询按钮\n"
				+" 测试预期->1. 消息列表分页显示已发送消息/已接收消息\n"
				+" 测试步骤->2. 只选择某一开始时间， 结束时间选择为空， 点击查询按钮\n"
				+" 测试预期->2. 消息列表分页显示所有从开始时间到当前时间内的消息\n"
				+" 测试步骤->3. 只选择某一结束时间， 开始时间选择为空， 点击查询按钮\n"
				+" 测试预期->3. 分页显示从最早时间到结束时间内的所有消息\n"
				+" 测试步骤->4. 选择某一开始时间， 再选择某一比开始时间更晚的结束时间， 点击查询按钮\n"
				+" 测试预期->4. 列表分页显示开始时间到结束时间内的所有消息\n"
				+" 测试步骤->5. 选择某一比当前时间更晚的开始时间， 在选择某一比开始时间更晚的结束时间， 点击查询按钮\n"
				+" 测试预期->5. 弹出提示框提示查询无数据\n"
				+" 测试步骤->6. 选择某一开始时间， 再选择某一比开始时间更早的结束时间 点击查询按钮\n"
				+" 测试预期->6. 弹出提示框提示开始时间不能大于截止时间\n"
;
	}

}

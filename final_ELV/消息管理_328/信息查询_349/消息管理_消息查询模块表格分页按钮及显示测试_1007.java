package cn.edu.tju.scs.seql.final_ELV.消息管理_328.信息查询_349;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1007
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 信息查询(#349)
 * 用例名称: 消息管理-消息查询模块表格分页按钮及显示测试
 * 前置条件: 
 * 测试步骤->1. 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询
 * 测试预期->1. 进入消息查询界面，所有内容正常显示 （查询条件包括开始时间、结束时间、消息类型、以及查询按钮； 消息列表包括查看、编辑、删除、发送按钮以及表格翻页按钮，表格页数显示，表格信息显示：下方左侧“第1页，共6页”，下方右侧“显示1-25条，共128条”）
 * 测试步骤->2. 点击下方左侧部分的向下翻页按钮
 * 测试预期->2. 表格跳转至第2页，下方信息显示为“第2页，共6页”和右下角的“显示26-50条，共128条”，且左下角的向前翻页和翻至首页按钮由灰色不可点击变为蓝色可以点击。
 * 测试步骤->3. 点击下方左侧部分的翻至尾页按钮
 * 测试预期->3. 表格跳转至尾页，下方信息显示为“第6页，共6页”和右下角的“显示126-128条，共128条”，且左侧的向后翻页和翻至尾页按钮为灰色不可以点击。
 * 测试步骤->4. 点击下方左侧部分的向上翻页按钮
 * 测试预期->4. 表格跳转至第5页，下方信息显示为“第5页，共6页”和右下角的“显示101-125条，共128条”，且左下角的向后翻页和翻至尾页按钮为蓝色可以点击。
 * 测试步骤->5. 点击下方左侧部分的翻至首页按钮
 * 测试预期->5. 表格跳转至第1页，下方信息显示为“第1页，共6页”和右下角的“显示1-25条，共128条”，且左下角的向前翻页和翻至首页按钮为灰色不可点击。
 * 测试步骤->6. 在下方页数输入框内输入“3”并安enter键
 * 测试预期->6. 表格跳转至第3页，下方信息显示为“第3页，共6页”和右下角的“显示51-75条，共128条”，且左下角的向后翻页和翻至尾页按钮为蓝色可以点击。
 * 测试步骤->7. 在下方页数输入框内输入“10”并安enter键
 * 测试预期->7. 表格跳转至尾页，下方信息显示为“第6页，共6页”和右下角的“显示126-128条，共128条”，且左侧的向后翻页和翻至尾页按钮为灰色不可以点击。
 * 
 */

public class 消息管理_消息查询模块表格分页按钮及显示测试_1007 extends Selenium_Test_Base {
	
	public 消息管理_消息查询模块表格分页按钮及显示测试_1007(){
		super();
	}
	
	public 消息管理_消息查询模块表格分页按钮及显示测试_1007(WebDriver driver){
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
		// 与“验证有害物质分析下方工具栏是否可实现_含异常操作_4256”用例类似	
	}

	
	public String getDescription(){
		return "测试用例id: 1007\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 信息查询(#349)\n"
				+" 用例名称: 消息管理-消息查询模块表格分页按钮及显示测试\n"
				+" 前置条件: \n"
				+" 测试步骤->1. 登录ELV环境合规系统，左侧树形结构选择 消息管理-消息查询\n"
				+" 测试预期->1. 进入消息查询界面，所有内容正常显示 （查询条件包括开始时间、结束时间、消息类型、以及查询按钮； 消息列表包括查看、编辑、删除、发送按钮以及表格翻页按钮，表格页数显示，表格信息显示：下方左侧“第1页，共6页”，下方右侧“显示1-25条，共128条”）\n"
				+" 测试步骤->2. 点击下方左侧部分的向下翻页按钮\n"
				+" 测试预期->2. 表格跳转至第2页，下方信息显示为“第2页，共6页”和右下角的“显示26-50条，共128条”，且左下角的向前翻页和翻至首页按钮由灰色不可点击变为蓝色可以点击。\n"
				+" 测试步骤->3. 点击下方左侧部分的翻至尾页按钮\n"
				+" 测试预期->3. 表格跳转至尾页，下方信息显示为“第6页，共6页”和右下角的“显示126-128条，共128条”，且左侧的向后翻页和翻至尾页按钮为灰色不可以点击。\n"
				+" 测试步骤->4. 点击下方左侧部分的向上翻页按钮\n"
				+" 测试预期->4. 表格跳转至第5页，下方信息显示为“第5页，共6页”和右下角的“显示101-125条，共128条”，且左下角的向后翻页和翻至尾页按钮为蓝色可以点击。\n"
				+" 测试步骤->5. 点击下方左侧部分的翻至首页按钮\n"
				+" 测试预期->5. 表格跳转至第1页，下方信息显示为“第1页，共6页”和右下角的“显示1-25条，共128条”，且左下角的向前翻页和翻至首页按钮为灰色不可点击。\n"
				+" 测试步骤->6. 在下方页数输入框内输入“3”并安enter键\n"
				+" 测试预期->6. 表格跳转至第3页，下方信息显示为“第3页，共6页”和右下角的“显示51-75条，共128条”，且左下角的向后翻页和翻至尾页按钮为蓝色可以点击。\n"
				+" 测试步骤->7. 在下方页数输入框内输入“10”并安enter键\n"
				+" 测试预期->7. 表格跳转至尾页，下方信息显示为“第6页，共6页”和右下角的“显示126-128条，共128条”，且左侧的向后翻页和翻至尾页按钮为灰色不可以点击。\n"
;
	}

}

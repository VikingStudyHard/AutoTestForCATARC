package cn.edu.tju.scs.seql.final_ELV.消息管理_328.查询请求_351;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.消息管理_328.创建请求_350.ElementEnum_创建请求_350;

/**
 * 测试用例id: 2451
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 查询请求(#351)
 * 用例名称: 消息管理-查询请求模块中部门选择及表格测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-查询请求
 *         点击第三行 材料数据供应商 后的查找按钮
 *         
 * 测试步骤->1. 在国家下拉栏中选择中国.，点击查找按钮
 * 测试预期->1. 下方分页显示国家为中国的企业列表， 表格右上方有确定、取消两个按钮， 表格中各项可以选择， 下方有翻页按钮，且翻至首页和向前翻页按钮为灰色不可点击， 下方左侧显示“第1页，共1138页”， 下方右侧显示“显示1-25条，共28440条”
 * 测试步骤->2. 点击向下翻页按钮
 * 测试预期->2. 表格跳转至第二页， 下方翻页按钮的向前翻页和翻至首页按钮变为蓝色可以点击，下方信息变为： 左侧“第2页，共1138页”， 右侧“显示26-50条，共28440条”
 * 测试步骤->3. 点击翻至尾页按钮
 * 测试预期->3. 表格跳转至尾页， 下方翻页按钮的向后翻页和翻至尾页按钮变为灰色不可以点击，下方信息变为： 左侧“第1138页，共1138页”， 右侧“显示28426-28440条，共28440条”
 * 测试步骤->4. 点击向上翻页按钮
 * 测试预期->4. 表格跳转至1137， 下方翻页按钮的向后翻页和翻至尾页按钮变为蓝色可以点击，下方信息变为： 左侧“第1137页，共1138页”， 右侧“显示28401-28425条，共28440条”
 * 测试步骤->5. 点击翻至首页按钮
 * 测试预期->5. 表格跳转至首页， 下方翻页按钮的向前翻页和翻至首页按钮变为灰色不可以点击，下方显示变为： 左侧“第1页，共1138页”， 右侧“显示1-25条，共28440条”
 * 测试步骤->6. 在下方页码框内输入30， 按enter键
 * 测试预期->6. 表格跳转至第30页， 下方翻页按钮的向前翻页和翻至首页按钮变为蓝色可以点击，下方显示变为： 左侧“第30页，共1138页”， 右侧“显示726-750条，共28440条”
 * 测试步骤->7. 在下方页码框内输入1140， 按enter键
 * 测试预期->7. 表格跳转至尾页， 下方翻页按钮的向后翻页和翻至尾页按钮变为灰色不可以点击，下方信息变为： 左侧“第1138页，共1138页”， 右侧“显示28426-28440条，共28440条”
 * 测试步骤->8. 点选任意一个企业
 * 测试预期->8. 该企业的一整行颜色变深
 * 测试步骤->9. 点击确定按钮
 * 测试预期->9. 企业选择窗口关闭， 回到创建请求界面， 部门一栏中显示为步骤8中所选企业
 * 
 */

public class 消息管理_查询请求模块中部门选择及表格测试_2451 extends Selenium_Test_Base {
	
	public 消息管理_查询请求模块中部门选择及表格测试_2451(){
		super();
	}
	
	public 消息管理_查询请求模块中部门选择及表格测试_2451(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_查询请求_351.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_查询请求_351.rightFrame);
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
		getElement(ElementEnum_查询请求_351.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_查询请求_351.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_查询请求_351 a = new CommonOperations_查询请求_351(driver);
		getElement(ElementEnum_查询请求_351.部门查找按钮).click();
		String currentWindow = driver.getWindowHandle();
		System.out.println(currentWindow);
		a.switchToNextWindow();
		searchCompanyTest();
		driver.switchTo().window(currentWindow);
		WebElement mainFrame=getElement(ElementEnum_创建请求_350.rightFrame);
		driver.switchTo().frame(mainFrame);
		System.out.println(driver.getWindowHandle());
	}
	
	public void searchCompanyTest(){
		// 测试翻页功能，统一进行
	}

	
	public String getDescription(){
		return "测试用例id: 2451\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 查询请求(#351)\n"
				+" 用例名称: 消息管理-查询请求模块中部门选择及表格测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-查询请求 点击第三行 材料数据供应商 后的查找按钮 \n"
				+" 测试步骤->1. 在国家下拉栏中选择中国.，点击查找按钮\n"
				+" 测试预期->1. 下方分页显示国家为中国的企业列表， 表格右上方有确定、取消两个按钮， 表格中各项可以选择， 下方有翻页按钮，且翻至首页和向前翻页按钮为灰色不可点击， 下方左侧显示“第1页，共1138页”， 下方右侧显示“显示1-25条，共28440条”\n"
				+" 测试步骤->2. 点击向下翻页按钮\n"
				+" 测试预期->2. 表格跳转至第二页， 下方翻页按钮的向前翻页和翻至首页按钮变为蓝色可以点击，下方信息变为： 左侧“第2页，共1138页”， 右侧“显示26-50条，共28440条”\n"
				+" 测试步骤->3. 点击翻至尾页按钮\n"
				+" 测试预期->3. 表格跳转至尾页， 下方翻页按钮的向后翻页和翻至尾页按钮变为灰色不可以点击，下方信息变为： 左侧“第1138页，共1138页”， 右侧“显示28426-28440条，共28440条”\n"
				+" 测试步骤->4. 点击向上翻页按钮\n"
				+" 测试预期->4. 表格跳转至1137， 下方翻页按钮的向后翻页和翻至尾页按钮变为蓝色可以点击，下方信息变为： 左侧“第1137页，共1138页”， 右侧“显示28401-28425条，共28440条”\n"
				+" 测试步骤->5. 点击翻至首页按钮\n"
				+" 测试预期->5. 表格跳转至首页， 下方翻页按钮的向前翻页和翻至首页按钮变为灰色不可以点击，下方显示变为： 左侧“第1页，共1138页”， 右侧“显示1-25条，共28440条”\n"
				+" 测试步骤->6. 在下方页码框内输入30， 按enter键\n"
				+" 测试预期->6. 表格跳转至第30页， 下方翻页按钮的向前翻页和翻至首页按钮变为蓝色可以点击，下方显示变为： 左侧“第30页，共1138页”， 右侧“显示726-750条，共28440条”\n"
				+" 测试步骤->7. 在下方页码框内输入1140， 按enter键\n"
				+" 测试预期->7. 表格跳转至尾页， 下方翻页按钮的向后翻页和翻至尾页按钮变为灰色不可以点击，下方信息变为： 左侧“第1138页，共1138页”， 右侧“显示28426-28440条，共28440条”\n"
				+" 测试步骤->8. 点选任意一个企业\n"
				+" 测试预期->8. 该企业的一整行颜色变深\n"
				+" 测试步骤->9. 点击确定按钮\n"
				+" 测试预期->9. 企业选择窗口关闭， 回到创建请求界面， 部门一栏中显示为步骤8中所选企业\n"
;
	}

}

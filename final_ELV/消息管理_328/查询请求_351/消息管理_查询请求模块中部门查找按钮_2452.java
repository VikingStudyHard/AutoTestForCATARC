package cn.edu.tju.scs.seql.final_ELV.消息管理_328.查询请求_351;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.final_ELV.消息管理_328.创建请求_350.ElementEnum_创建请求_350;
import cn.edu.tju.scs.seql.final_ELV.消息管理_328.创建请求_350.消息管理_创建请求模块中材料数据供应商查找按钮_1036;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2452
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 查询请求(#351)
 * 用例名称: 消息管理-查询请求模块中部门查找按钮
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-查询请求
 * 测试步骤->1. 鼠标点击部门后的文本框
 * 测试预期->1. 不可输入
 * 测试步骤->2. 点击部门后的查找按钮
 * 测试预期->2. 弹出企业查找窗口，查询项包括： 企业名称、企业/部门ID、部门名称、城市、DUNS编码、邮政编码、机构代码、国家一级查找按钮
 * 测试步骤->3. 直接点击查找按钮
 * 测试预期->3. 弹出提示框提示输入其中一项查找项
 * 测试步骤->4. 在国家下拉栏中选择中国/越南/etc...， 点击查找按钮
 * 测试预期->4. 下方分页显示企业列表， 表格各行可选择， 表格右上角有确定、取消两个按钮， 表格下方有翻页按钮以及页码显示以及表格数量的显示
 * 测试步骤->5. 在城市栏搜索“香港”，点击查找按钮
 * 测试预期->5. 下方分页显示企业列表， 所显示企业的城市均为香港， 表格各行可选择， 表格右上角有确定、取消两个按钮， 表格下方有翻页按钮以及页码显示以及表格数量的显示
 * 测试步骤->6. 在邮政编码栏搜索“518057”， 点击查找按钮
 * 测试预期->6. 下方分页显示企业列表， 所显示企业的邮政编码均为518057， 表格各行可选择， 表格右上角有确定、取消两个按钮， 表格下方有翻页按钮以及页码显示以及表格数量的显示
 * 测试步骤->7. 企业/部门-ID一栏输入“CA_3_19858”， 点击查找按钮，
 * 测试预期->7. 显示“丰宝贸易香港有限公司”的详细信息
 * 测试步骤->8. 企业名称一栏输入“丰宝贸易香港有限公司”， 点击查找按钮，
 * 测试预期->8. 显示“丰宝贸易香港有限公司”的详细信息
 * 测试步骤->9. 部门名称一栏输入“丰宝贸易香港有限公司”， 点击查找按钮，
 * 测试预期->9. 显示“丰宝贸易香港有限公司”的详细信息
 * 
 */

public class 消息管理_查询请求模块中部门查找按钮_2452 extends Selenium_Test_Base {
	
	public 消息管理_查询请求模块中部门查找按钮_2452(){
		super();
	}
	
	public 消息管理_查询请求模块中部门查找按钮_2452(WebDriver driver){
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
		消息管理_创建请求模块中材料数据供应商查找按钮_1036 x = new 消息管理_创建请求模块中材料数据供应商查找按钮_1036(driver);
		x.searchCompanyTest();
	}

	
	public String getDescription(){
		return "测试用例id: 2452\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 查询请求(#351)\n"
				+" 用例名称: 消息管理-查询请求模块中部门查找按钮\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-查询请求\n"
				+" 测试步骤->1. 鼠标点击部门后的文本框\n"
				+" 测试预期->1. 不可输入\n"
				+" 测试步骤->2. 点击部门后的查找按钮\n"
				+" 测试预期->2. 弹出企业查找窗口，查询项包括： 企业名称、企业/部门ID、部门名称、城市、DUNS编码、邮政编码、机构代码、国家一级查找按钮\n"
				+" 测试步骤->3. 直接点击查找按钮\n"
				+" 测试预期->3. 弹出提示框提示输入其中一项查找项\n"
				+" 测试步骤->4. 在国家下拉栏中选择中国/越南/etc...， 点击查找按钮\n"
				+" 测试预期->4. 下方分页显示企业列表， 表格各行可选择， 表格右上角有确定、取消两个按钮， 表格下方有翻页按钮以及页码显示以及表格数量的显示\n"
				+" 测试步骤->5. 在城市栏搜索“香港”，点击查找按钮\n"
				+" 测试预期->5. 下方分页显示企业列表， 所显示企业的城市均为香港， 表格各行可选择， 表格右上角有确定、取消两个按钮， 表格下方有翻页按钮以及页码显示以及表格数量的显示\n"
				+" 测试步骤->6. 在邮政编码栏搜索“518057”， 点击查找按钮\n"
				+" 测试预期->6. 下方分页显示企业列表， 所显示企业的邮政编码均为518057， 表格各行可选择， 表格右上角有确定、取消两个按钮， 表格下方有翻页按钮以及页码显示以及表格数量的显示\n"
				+" 测试步骤->7. 企业/部门-ID一栏输入“CA_3_19858”， 点击查找按钮，\n"
				+" 测试预期->7. 显示“丰宝贸易香港有限公司”的详细信息\n"
				+" 测试步骤->8. 企业名称一栏输入“丰宝贸易香港有限公司”， 点击查找按钮，\n"
				+" 测试预期->8. 显示“丰宝贸易香港有限公司”的详细信息\n"
				+" 测试步骤->9. 部门名称一栏输入“丰宝贸易香港有限公司”， 点击查找按钮，\n"
				+" 测试预期->9. 显示“丰宝贸易香港有限公司”的详细信息\n"
;
	}

}

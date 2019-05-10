package cn.edu.tju.scs.seql.final_ELV.消息管理_328.创建请求_350;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2739
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 创建请求(#350)
 * 用例名称: 消息管理-创建请求模块中材料数据供应商查找-部门名称栏异常测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-创建请求
 *         点击第三行 材料数据供应商后的查找按钮
 * 测试步骤->1. 部门名称中搜索“Hong Kong”，点击查找按钮
 * 测试预期->1. 显示部门名称中带有“Hong Kong”的企业信息
 * 测试步骤->2. 部门名称中搜索“hong kong”，点击查找按钮
 * 测试预期->2. 无企业信息显示
 * 测试步骤->3. 部门名称中搜索“Ｈｏｎｇ　Ｋｏｎｇ”，点击查找按钮
 * 测试预期->3. 无企业信息显示
 * 测试步骤->4. 部门名称中搜索空格“ ”，点击查找按钮
 * 测试预期->4. 显示所有企业信息
 * 测试步骤->5. 部门名称中搜索“香港”，点击查找按钮
 * 测试预期->5. 显示部门名称中带有“香港”的企业信息
 * 测试步骤->6. 部门名称中搜索“<script>alert("test");</script>”， 点击查找按钮
 * 测试预期->6. 无企业信息显示
 * 测试步骤->7. 部门名称中搜索“&lt;script&gt;alert("test");&lt;/script&gt;”， 点击查找按钮
 * 测试预期->7. 无企业信息显示
 * 
 */

public class 消息管理_创建请求模块中材料数据供应商查找_部门名称栏异常测试_2739 extends Selenium_Test_Base {
	
	public 消息管理_创建请求模块中材料数据供应商查找_部门名称栏异常测试_2739(){
		super();
	}
	
	public 消息管理_创建请求模块中材料数据供应商查找_部门名称栏异常测试_2739(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_创建请求_350.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_创建请求_350.rightFrame);
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
		getElement(ElementEnum_创建请求_350.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_创建请求_350.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_创建请求_350 a = new CommonOperations_创建请求_350(driver);
		getElement(ElementEnum_创建请求_350.材料数据供应商查找按钮).click();
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
		getElement(ElementEnum_创建请求_350.搜索企业窗口部门名称输入框).clear();
		getElement(ElementEnum_创建请求_350.搜索企业窗口部门名称输入框).sendKeys(" ");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_创建请求_350.搜索企业窗口查找按钮).click();
		WebDriverConfiguration.operationInterval();
		
		int result = getElements(ElementEnum_创建请求_350.搜索企业窗口检索结果所有行).size();
		assertTrue(result > 1,"数据库中没有企业记录，请验证");
		
		getElement(ElementEnum_创建请求_350.搜索企业窗口部门名称输入框).clear();
		getElement(ElementEnum_创建请求_350.搜索企业窗口部门名称输入框).sendKeys("Hong Kong");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_创建请求_350.搜索企业窗口查找按钮).click();
		WebDriverConfiguration.operationInterval();
		
		result = getElements(ElementEnum_创建请求_350.搜索企业窗口检索结果所有行).size();
		assertTrue(result > 1);
		
		getElement(ElementEnum_创建请求_350.搜索企业窗口部门名称输入框).clear();
		getElement(ElementEnum_创建请求_350.搜索企业窗口部门名称输入框).sendKeys("hong kong");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_创建请求_350.搜索企业窗口查找按钮).click();
		WebDriverConfiguration.operationInterval();
		
		result = getElements(ElementEnum_创建请求_350.搜索企业窗口检索结果所有行).size();
		assertTrue(result == 1);
		
		getElement(ElementEnum_创建请求_350.搜索企业窗口部门名称输入框).clear();
		getElement(ElementEnum_创建请求_350.搜索企业窗口部门名称输入框).sendKeys("Ｈｏｎｇ　Ｋｏｎｇ");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_创建请求_350.搜索企业窗口查找按钮).click();
		WebDriverConfiguration.operationInterval();
		
		result = getElements(ElementEnum_创建请求_350.搜索企业窗口检索结果所有行).size();
		assertTrue(result == 1);
		
		getElement(ElementEnum_创建请求_350.搜索企业窗口部门名称输入框).clear();
		getElement(ElementEnum_创建请求_350.搜索企业窗口部门名称输入框).sendKeys("<script>alert('test');</script>");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_创建请求_350.搜索企业窗口查找按钮).click();
		WebDriverConfiguration.operationInterval();
		
		result = getElements(ElementEnum_创建请求_350.搜索企业窗口检索结果所有行).size();
		assertTrue(result == 1);
		
		getElement(ElementEnum_创建请求_350.搜索企业窗口部门名称输入框).clear();
		getElement(ElementEnum_创建请求_350.搜索企业窗口部门名称输入框).sendKeys("&lt;script&gt;alert('test');&lt;/script&gt;");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_创建请求_350.搜索企业窗口查找按钮).click();
		WebDriverConfiguration.operationInterval();
		
		result = getElements(ElementEnum_创建请求_350.搜索企业窗口检索结果所有行).size();
		assertTrue(result == 1);
		
		WebDriverConfiguration.operationInterval();
	}

	
	public String getDescription(){
		return "测试用例id: 2739\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 创建请求(#350)\n"
				+" 用例名称: 消息管理-创建请求模块中材料数据供应商查找-部门名称栏异常测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-创建请求 点击第三行 材料数据供应商后的查找按钮\n"
				+" 测试步骤->1. 部门名称中搜索“Hong Kong”，点击查找按钮\n"
				+" 测试预期->1. 显示部门名称中带有“Hong Kong”的企业信息\n"
				+" 测试步骤->2. 部门名称中搜索“hong kong”，点击查找按钮\n"
				+" 测试预期->2. 无企业信息显示\n"
				+" 测试步骤->3. 部门名称中搜索“Ｈｏｎｇ　Ｋｏｎｇ”，点击查找按钮\n"
				+" 测试预期->3. 无企业信息显示\n"
				+" 测试步骤->4. 部门名称中搜索空格“ ”，点击查找按钮\n"
				+" 测试预期->4. 显示所有企业信息\n"
				+" 测试步骤->5. 部门名称中搜索“香港”，点击查找按钮\n"
				+" 测试预期->5. 显示部门名称中带有“香港”的企业信息\n"
				+" 测试步骤->6. 部门名称中搜索“<script>alert(“test“);</script>”， 点击查找按钮\n"
				+" 测试预期->6. 无企业信息显示\n"
				+" 测试步骤->7. 部门名称中搜索“&lt;script&gt;alert(“test“);&lt;/script&gt;”， 点击查找按钮\n"
				+" 测试预期->7. 无企业信息显示\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.消息管理_328.查询请求_351;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2745
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 查询请求(#351)
 * 用例名称: 消息管理-查询求模块中部门查找-部门名称栏异常测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-查询请求
 *         点击部门栏后的查找按钮
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

public class 消息管理_查询求模块中部门查找_部门名称栏异常测试_2745 extends Selenium_Test_Base {
	
	public 消息管理_查询求模块中部门查找_部门名称栏异常测试_2745(){
		super();
	}
	
	public 消息管理_查询求模块中部门查找_部门名称栏异常测试_2745(WebDriver driver){
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
		// TODO 该用例尚未实现，请检查
	/*
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_查询请求_351.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_查询请求_351.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	*/
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		/*
		assertEquals(driver.findElement(By.xpath("//td")).getText(), "企业名称:");
	    assertEquals(driver.findElement(By.xpath("//td[3]")).getText(), "企业ID:");
	    assertEquals(driver.findElement(By.xpath("//td[5]")).getText(), "计划员:");
	    assertEquals(driver.findElement(By.xpath("//td[7]")).getText(), "区域");
	    assertEquals(driver.findElement(By.xpath("//td[9]")).getText(), "新增信息来源");
	    assertEquals(driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td/div/input")).getText(), "");
		*/
	
	}

	
	public String getDescription(){
		return "测试用例id: 2745\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 查询请求(#351)\n"
				+" 用例名称: 消息管理-查询求模块中部门查找-部门名称栏异常测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-查询请求 点击部门栏后的查找按钮\n"
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

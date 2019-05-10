package cn.edu.tju.scs.seql.final_ELV.消息管理_328.查询请求_351;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.final_ELV.消息管理_328.创建请求_350.ElementEnum_创建请求_350;
import cn.edu.tju.scs.seql.final_ELV.消息管理_328.创建请求_350.消息管理_创建请求模块中材料数据供应商查找_企业_部门_ID栏异常测试_2738;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2744
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 查询请求(#351)
 * 用例名称: 消息管理-查询请求模块中部门查找-企业/部门-ID栏异常测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-查询请求
 *         点击部门栏后的查找按钮
 * 测试步骤->1. 企业/部门-ID中搜索“CA”，点击查找按钮
 * 测试预期->1. 显示企业/部门-ID中含有CA的企业信息列表
 * 测试步骤->2. 企业/部门-ID中搜索“ca”，点击查找按钮
 * 测试预期->2. 无企业信息显示
 * 测试步骤->3. 企业/部门-ID中搜索“ＣＡ”，点击查找按钮
 * 测试预期->3. 无企业信息显示
 * 测试步骤->4. 企业/部门-ID中搜索空格“ ”，点击查找按钮
 * 测试预期->4. 显示所有企业信息
 * 测试步骤->5. 企业/部门-ID中搜索“31910”，点击查找按钮
 * 测试预期->5. 显示ID中含有字段“30910”的企业信息
 * 测试步骤->6. 企业/部门-ID中搜索“<script>alert("test");</script>”， 点击查找按钮
 * 测试预期->6. 无企业信息显示， 无异常提示
 * 测试步骤->7. 企业/部门-ID中搜索“&lt;script&gt;alert("test");&lt;/script&gt;”， 点击查找按钮
 * 测试预期->7. 无企业信息显示， 无异常提示
 * 
 */

public class 消息管理_查询请求模块中部门查找_企业_部门_ID栏异常测试_2744 extends Selenium_Test_Base {
	
	public 消息管理_查询请求模块中部门查找_企业_部门_ID栏异常测试_2744(){
		super();
	}
	
	public 消息管理_查询请求模块中部门查找_企业_部门_ID栏异常测试_2744(WebDriver driver){
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
		消息管理_创建请求模块中材料数据供应商查找_企业_部门_ID栏异常测试_2738 x = 
				new 消息管理_创建请求模块中材料数据供应商查找_企业_部门_ID栏异常测试_2738(driver);
		x.searchCompanyTest();
	}

	
	public String getDescription(){
		return "测试用例id: 2744\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 查询请求(#351)\n"
				+" 用例名称: 消息管理-查询请求模块中部门查找-企业/部门-ID栏异常测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-查询请求 点击部门栏后的查找按钮\n"
				+" 测试步骤->1. 企业/部门-ID中搜索“CA”，点击查找按钮\n"
				+" 测试预期->1. 显示企业/部门-ID中含有CA的企业信息列表\n"
				+" 测试步骤->2. 企业/部门-ID中搜索“ca”，点击查找按钮\n"
				+" 测试预期->2. 无企业信息显示\n"
				+" 测试步骤->3. 企业/部门-ID中搜索“ＣＡ”，点击查找按钮\n"
				+" 测试预期->3. 无企业信息显示\n"
				+" 测试步骤->4. 企业/部门-ID中搜索空格“ ”，点击查找按钮\n"
				+" 测试预期->4. 显示所有企业信息\n"
				+" 测试步骤->5. 企业/部门-ID中搜索“31910”，点击查找按钮\n"
				+" 测试预期->5. 显示ID中含有字段“30910”的企业信息\n"
				+" 测试步骤->6. 企业/部门-ID中搜索“<script>alert(“test“);</script>”， 点击查找按钮\n"
				+" 测试预期->6. 无企业信息显示， 无异常提示\n"
				+" 测试步骤->7. 企业/部门-ID中搜索“&lt;script&gt;alert(“test“);&lt;/script&gt;”， 点击查找按钮\n"
				+" 测试预期->7. 无企业信息显示， 无异常提示\n"
;
	}

}

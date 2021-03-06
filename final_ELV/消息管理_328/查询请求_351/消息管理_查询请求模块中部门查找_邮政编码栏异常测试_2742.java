package cn.edu.tju.scs.seql.final_ELV.消息管理_328.查询请求_351;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.final_ELV.消息管理_328.创建请求_350.ElementEnum_创建请求_350;
import cn.edu.tju.scs.seql.final_ELV.消息管理_328.创建请求_350.消息管理_创建请求模块中材料数据供应商查找_邮政编码栏异常测试_2741;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2742
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 查询请求(#351)
 * 用例名称: 消息管理-查询请求模块中部门查找-邮政编码栏异常测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-查询请求
 *         点击部门栏后的查找按钮
 * 测试步骤->1. 邮政编码一栏输入“510410”，点击查找按钮
 * 测试预期->1. 显示邮政编码为“510410”的企业信息列表
 * 测试步骤->2. 邮政编码一栏输入“510”，点击查找按钮
 * 测试预期->2. 显示邮政编码字段含有“510”的企业信息列表
 * 测试步骤->3. 邮政编码一栏输入“５１０４１０”，点击查找按钮
 * 测试预期->3. 无相关信息显示
 * 测试步骤->4. 邮政编码一栏输入“abc”，点击查找按钮
 * 测试预期->4. 无相关信息显示
 * 测试步骤->5. 邮政编码一栏输入“<script>alert("test");</script>”， 点击查找按钮
 * 测试预期->5. 无相关信息显示
 * 测试步骤->6. 邮政编码一栏输入“&lt;script&gt;alert("test");&lt;/script&gt;”， 点击查找按钮
 * 测试预期->6. 无相关信息显示
 * 
 */

public class 消息管理_查询请求模块中部门查找_邮政编码栏异常测试_2742 extends Selenium_Test_Base {
	
	public 消息管理_查询请求模块中部门查找_邮政编码栏异常测试_2742(){
		super();
	}
	
	public 消息管理_查询请求模块中部门查找_邮政编码栏异常测试_2742(WebDriver driver){
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
		消息管理_创建请求模块中材料数据供应商查找_邮政编码栏异常测试_2741 x= new 消息管理_创建请求模块中材料数据供应商查找_邮政编码栏异常测试_2741(driver);
		x.searchCompanyTest();
	}

	
	public String getDescription(){
		return "测试用例id: 2742\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 查询请求(#351)\n"
				+" 用例名称: 消息管理-查询请求模块中部门查找-邮政编码栏异常测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-查询请求 点击部门栏后的查找按钮\n"
				+" 测试步骤->1. 邮政编码一栏输入“510410”，点击查找按钮\n"
				+" 测试预期->1. 显示邮政编码为“510410”的企业信息列表\n"
				+" 测试步骤->2. 邮政编码一栏输入“510”，点击查找按钮\n"
				+" 测试预期->2. 显示邮政编码字段含有“510”的企业信息列表\n"
				+" 测试步骤->3. 邮政编码一栏输入“５１０４１０”，点击查找按钮\n"
				+" 测试预期->3. 无相关信息显示\n"
				+" 测试步骤->4. 邮政编码一栏输入“abc”，点击查找按钮\n"
				+" 测试预期->4. 无相关信息显示\n"
				+" 测试步骤->5. 邮政编码一栏输入“<script>alert(“test“);</script>”， 点击查找按钮\n"
				+" 测试预期->5. 无相关信息显示\n"
				+" 测试步骤->6. 邮政编码一栏输入“&lt;script&gt;alert(“test“);&lt;/script&gt;”， 点击查找按钮\n"
				+" 测试预期->6. 无相关信息显示\n"
;
	}

}

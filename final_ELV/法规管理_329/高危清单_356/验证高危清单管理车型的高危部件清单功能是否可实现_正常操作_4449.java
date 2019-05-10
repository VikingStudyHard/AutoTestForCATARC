package cn.edu.tju.scs.seql.final_ELV.法规管理_329.高危清单_356;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4449
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 高危清单(#356)
 * 用例名称: 验证高危清单管理车型的高危部件清单功能是否可实现-正常操作
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击管理车型的高危部件清单按钮
 * 测试预期->1. 页面出现提示信息：请选择一条记录
 * 测试步骤->2. 单击左键选择一条车型信息，点击管理车型的高危部件清单按钮
 * 测试预期->2. 跳转至新页面，管理车型的高危部件清单页面包含车型的各项信息和汽车高风险零部件有害物质备案参数表
 * 测试步骤->3. 点击新页面中的返回按钮
 * 测试预期->3. 页面被正常关闭，返回高危清单页面
 * 
 */

public class 验证高危清单管理车型的高危部件清单功能是否可实现_正常操作_4449 extends Selenium_Test_Base {
	
	public 验证高危清单管理车型的高危部件清单功能是否可实现_正常操作_4449(){
		super();
	}
	
	public 验证高危清单管理车型的高危部件清单功能是否可实现_正常操作_4449(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_高危清单_356.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_高危清单_356.rightFrame);
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
		getElement(ElementEnum_高危清单_356.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_高危清单_356 a = new CommonOperations_高危清单_356(driver);
		getElement(ElementEnum_高危清单_356.管理车型的高危部件清单按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请选择一条记录");
		
		
		a.searchMyRecordWithBOM();
		a.judgeMaskLoadFirst();
		
		getElement(ElementEnum_高危清单_356.检索结果第一行品牌中文名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.管理车型的高危部件清单按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadSecondPage();
		
		getElement(ElementEnum_高危清单_356.第二页返回按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		//再进一遍已显示刚才放回成功
		a.searchMyRecordWithBOM();
		a.judgeMaskLoadFirst();
		getElement(ElementEnum_高危清单_356.检索结果第一行品牌中文名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.管理车型的高危部件清单按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadSecondPage();
		
		getElement(ElementEnum_高危清单_356.第二页返回按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		
		
	}

	
	public String getDescription(){
		return "测试用例id: 4449\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 高危清单(#356)\n"
				+" 用例名称: 验证高危清单管理车型的高危部件清单功能是否可实现-正常操作\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击管理车型的高危部件清单按钮\n"
				+" 测试预期->1. 页面出现提示信息：请选择一条记录\n"
				+" 测试步骤->2. 单击左键选择一条车型信息，点击管理车型的高危部件清单按钮\n"
				+" 测试预期->2. 跳转至新页面，管理车型的高危部件清单页面包含车型的各项信息和汽车高风险零部件有害物质备案参数表\n"
				+" 测试步骤->3. 点击新页面中的返回按钮\n"
				+" 测试预期->3. 页面被正常关闭，返回高危清单页面\n"
;
	}

}

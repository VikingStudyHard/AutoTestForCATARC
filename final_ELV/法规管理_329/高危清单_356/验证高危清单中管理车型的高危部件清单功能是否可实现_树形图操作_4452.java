package cn.edu.tju.scs.seql.final_ELV.法规管理_329.高危清单_356;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4452
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 高危清单(#356)
 * 用例名称: 验证高危清单中管理车型的高危部件清单功能是否可实现-树形图操作
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 单击左键选择一条车型信息，点击管理车型的高危部件清单按钮
 * 测试预期->1. 跳转至新页面，管理车型的高危部件清单页面包含车型的各项信息和汽车高风险零部件有害物质备案参数表
 * 测试步骤->2. 点击BOM树形图界面右上角的刷新按钮
 * 测试预期->2. BOM树形图页面被刷新
 * 测试步骤->3. 点击BOM树形图界面右上角的打开树按钮
 * 测试预期->3. BOM树形图页面被展开
 * 测试步骤->4. 点击BOM树形图界面右上角的关闭树按钮
 * 测试预期->4. BOM树形图页面被关闭
 * 测试步骤->5. 点击BOM树形图界面母树左侧的加号键
 * 测试预期->5. BOM树形图页面被展开
 * 测试步骤->6. 点击BOM树形图界面母树左侧的减号键
 * 测试预期->6. BOM树形图页面被关闭
 * 
 */

public class 验证高危清单中管理车型的高危部件清单功能是否可实现_树形图操作_4452 extends Selenium_Test_Base {
	
	public 验证高危清单中管理车型的高危部件清单功能是否可实现_树形图操作_4452(){
		super();
	}
	
	public 验证高危清单中管理车型的高危部件清单功能是否可实现_树形图操作_4452(WebDriver driver){
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
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		a.searchMyRecordWithBOM();
		getElement(ElementEnum_高危清单_356.检索结果第一行品牌中文名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.管理车型的高危部件清单按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		int listNum = getElements(ElementEnum_高危清单_356.BOM树所有节点列表).size();
		
		getElement(ElementEnum_高危清单_356.BOM树刷新按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		int listNum2 = getElements(ElementEnum_高危清单_356.BOM树所有节点列表).size();
		assertEquals(listNum2, 2);
		
		getElement(ElementEnum_高危清单_356.BOM树根节点_BOM节点).click();
		listNum = getElements(ElementEnum_高危清单_356.BOM树所有节点列表).size();
		getElement(ElementEnum_高危清单_356.BOM树打开树按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		int listNum3 = getElements(ElementEnum_高危清单_356.BOM树所有节点列表).size();
		assertTrue(listNum3 > listNum);
		
		getElement(ElementEnum_高危清单_356.BOM树根节点_BOM节点).click();
		listNum = getElements(ElementEnum_高危清单_356.BOM树所有节点列表).size();
		getElement(ElementEnum_高危清单_356.BOM树关闭树按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		int listNum4 = getElements(ElementEnum_高危清单_356.BOM树所有节点列表).size();
		assertTrue(listNum4 < listNum);
		
		listNum = getElements(ElementEnum_高危清单_356.BOM树所有节点列表).size();
		getElement(ElementEnum_高危清单_356.BOM树根节点前加减号).click();
		WebDriverConfiguration.operationInterval();
		int listNum5 = getElements(ElementEnum_高危清单_356.BOM树所有节点列表).size();
		assertTrue(listNum5 > listNum);
		
		listNum = getElements(ElementEnum_高危清单_356.BOM树所有节点列表).size();
		getElement(ElementEnum_高危清单_356.BOM树根节点前加减号).click();
		WebDriverConfiguration.operationInterval();
		int listNum6 = getElements(ElementEnum_高危清单_356.BOM树所有节点列表).size();
		assertTrue(listNum6 < listNum);
		
	}

	
	public String getDescription(){
		return "测试用例id: 4452\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 高危清单(#356)\n"
				+" 用例名称: 验证高危清单中管理车型的高危部件清单功能是否可实现-树形图操作\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 单击左键选择一条车型信息，点击管理车型的高危部件清单按钮\n"
				+" 测试预期->1. 跳转至新页面，管理车型的高危部件清单页面包含车型的各项信息和汽车高风险零部件有害物质备案参数表\n"
				+" 测试步骤->2. 点击BOM树形图界面右上角的刷新按钮\n"
				+" 测试预期->2. BOM树形图页面被刷新\n"
				+" 测试步骤->3. 点击BOM树形图界面右上角的打开树按钮\n"
				+" 测试预期->3. BOM树形图页面被展开\n"
				+" 测试步骤->4. 点击BOM树形图界面右上角的关闭树按钮\n"
				+" 测试预期->4. BOM树形图页面被关闭\n"
				+" 测试步骤->5. 点击BOM树形图界面母树左侧的加号键\n"
				+" 测试预期->5. BOM树形图页面被展开\n"
				+" 测试步骤->6. 点击BOM树形图界面母树左侧的减号键\n"
				+" 测试预期->6. BOM树形图页面被关闭\n"
;
	}

}

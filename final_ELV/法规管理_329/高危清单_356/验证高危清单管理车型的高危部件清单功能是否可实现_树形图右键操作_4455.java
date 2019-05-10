package cn.edu.tju.scs.seql.final_ELV.法规管理_329.高危清单_356;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4455
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 高危清单(#356)
 * 用例名称:  验证高危清单管理车型的高危部件清单功能是否可实现-树形图右键操作
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 单击左键选择一条车型信息，点击管理车型的高危部件清单按钮
 * 测试预期->1. 跳转至新页面，管理车型的高危部件清单页面包含车型的各项信息和汽车高风险零部件有害物质备案参数表
 * 测试步骤->2. 右键单击零部件节点信息，出现功能选择栏，选择点击填报功能
 * 测试预期->2. 出现新页面可进行填报，含有需要填写的各项信息。操作同基本信息中的填报按钮
 * 测试步骤->3. 右键单击零部件节点信息，出现功能选择栏，选择点击取消填报功能
 * 测试预期->3. 出现提示信息：确定要取消该标注信息吗？操作同基本信息中的取消填报按钮
 * 
 */

public class 验证高危清单管理车型的高危部件清单功能是否可实现_树形图右键操作_4455 extends Selenium_Test_Base {
	
	public 验证高危清单管理车型的高危部件清单功能是否可实现_树形图右键操作_4455(){
		super();
	}
	
	public 验证高危清单管理车型的高危部件清单功能是否可实现_树形图右键操作_4455(WebDriver driver){
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
		a.searchMyRecord();
		getElement(ElementEnum_高危清单_356.检索结果第一行品牌中文名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.管理车型的高危部件清单按钮).click();
		WebDriverConfiguration.operationInterval();
		
		openAllBOMTree(a);
		
		int originalNum = getElements(ElementEnum_高危清单_356.下方备案参数表所有行).size();
		
		Actions action = new Actions(driver);
		action.contextClick(getElement(ElementEnum_高危清单_356.BOM树第二层节点_零部件));
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.BOM树右键菜单填报按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.弹出窗口填报按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请您选择回收利用阶段");
		
		getElement(ElementEnum_高危清单_356.弹出窗口零部件通用名称输入框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.弹出窗口零部件通用名称选项一).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.弹出窗口填报按钮).click();
		WebDriverConfiguration.operationInterval();
		
		int newNum = getElements(ElementEnum_高危清单_356.下方备案参数表所有行).size();
		assertEquals(newNum, originalNum+1);
		
		
		
		
		action.contextClick(getElement(ElementEnum_高危清单_356.BOM树第二层节点_零部件));
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.BOM树右键菜单取消填报按钮).click();
		WebDriverConfiguration.operationInterval();
		
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.第二页取消填报按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTipsAndThenOperateButton("确定要取消该标注信息吗", 
				ElementEnum_高危清单_356.第一页提示信息, 
				ElementEnum_高危清单_356.第一页提示框否按钮);
		
		action.contextClick(getElement(ElementEnum_高危清单_356.BOM树第二层节点_零部件));
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.BOM树右键菜单取消填报按钮).click();
		WebDriverConfiguration.operationInterval();
		
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.第二页取消填报按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTipsAndThenOperateButton("确定要取消该标注信息吗",
				ElementEnum_高危清单_356.第一页提示信息, 
				ElementEnum_高危清单_356.第一页提示框是按钮);
		
		
		
	}
	
	public void openAllBOMTree(CommonOperations_高危清单_356 a) {
		// 多按几次全部打开
		getElement(ElementEnum_高危清单_356.BOM树打开树按钮).click();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadSecondPage();
		getElement(ElementEnum_高危清单_356.BOM树打开树按钮).click();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadSecondPage();
		getElement(ElementEnum_高危清单_356.BOM树打开树按钮).click();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadSecondPage();
		getElement(ElementEnum_高危清单_356.BOM树打开树按钮).click();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadSecondPage();
		getElement(ElementEnum_高危清单_356.BOM树打开树按钮).click();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadSecondPage();
	}

	
	public String getDescription(){
		return "测试用例id: 4455\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 高危清单(#356)\n"
				+" 用例名称:  验证高危清单管理车型的高危部件清单功能是否可实现-树形图右键操作\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 单击左键选择一条车型信息，点击管理车型的高危部件清单按钮\n"
				+" 测试预期->1. 跳转至新页面，管理车型的高危部件清单页面包含车型的各项信息和汽车高风险零部件有害物质备案参数表\n"
				+" 测试步骤->2. 右键单击零部件节点信息，出现功能选择栏，选择点击填报功能\n"
				+" 测试预期->2. 出现新页面可进行填报，含有需要填写的各项信息。操作同基本信息中的填报按钮\n"
				+" 测试步骤->3. 右键单击零部件节点信息，出现功能选择栏，选择点击取消填报功能\n"
				+" 测试预期->3. 出现提示信息：确定要取消该标注信息吗？操作同基本信息中的取消填报按钮\n"
;
	}

}

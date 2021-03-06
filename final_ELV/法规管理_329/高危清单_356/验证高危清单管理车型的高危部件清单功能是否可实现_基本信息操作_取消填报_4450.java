package cn.edu.tju.scs.seql.final_ELV.法规管理_329.高危清单_356;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4450
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 高危清单(#356)
 * 用例名称: 验证高危清单管理车型的高危部件清单功能是否可实现-基本信息操作-取消填报
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 单击左键选择一条车型信息，点击管理车型的高危部件清单按钮
 * 测试预期->1. 跳转至新页面，管理车型的高危部件清单页面包含车型的各项信息和汽车高风险零部件有害物质备案参数表
 * 测试步骤->2. 点击材料节点信息，点击基本信息界面右上角的取消填报按钮
 * 测试预期->2. 出现提示信息：无法为物质节点标注回收利用信息 
 * 测试步骤->3. 点击标注过的零部件节点信息，点击基本信息界面右上角的取消填报按钮
 * 测试预期->3. 出现提示信息：确定要取消该标注信息吗？
 * 测试步骤->4. 点击提示信息中的否按钮
 * 测试预期->4. 提示信息关闭，节点的填报信息未被取消
 * 测试步骤->5. 点击标注过的零部件信息，点击基本信息界面右上角的取消填报按钮
 * 测试预期->5. 出现提示信息：确定要取消该标注信息吗？
 * 测试步骤->6. 点击提示信息中的是按钮
 * 测试预期->6. 提示信息关闭，节点的标注信息被成功取消
 * 
 */

public class 验证高危清单管理车型的高危部件清单功能是否可实现_基本信息操作_取消填报_4450 extends Selenium_Test_Base {
	
	public 验证高危清单管理车型的高危部件清单功能是否可实现_基本信息操作_取消填报_4450(){
		super();
	}
	
	public 验证高危清单管理车型的高危部件清单功能是否可实现_基本信息操作_取消填报_4450(WebDriver driver){
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
		
		int originalNum = getElements(ElementEnum_高危清单_356.下方备案参数表所有行).size();
		
		if(originalNum == 1){
			a.addTianBaoForNode();
		}
		getElement(ElementEnum_高危清单_356.BOM树第五层节点_物质).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("无法为物质节点标注回收利用信息");
		
		getElement(ElementEnum_高危清单_356.BOM树第二层节点_零部件).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.第二页取消填报按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTipsAndThenOperateButton("确定要取消该标注信息吗", 
				ElementEnum_高危清单_356.第一页提示信息, 
				ElementEnum_高危清单_356.第一页提示框否按钮);
		
		getElement(ElementEnum_高危清单_356.BOM树第二层节点_零部件).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.第二页取消填报按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTipsAndThenOperateButton("确定要取消该标注信息吗",
				ElementEnum_高危清单_356.第一页提示信息, 
				ElementEnum_高危清单_356.第一页提示框是按钮);
		
	}

	
	public String getDescription(){
		return "测试用例id: 4450\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 高危清单(#356)\n"
				+" 用例名称: 验证高危清单管理车型的高危部件清单功能是否可实现-基本信息操作-取消填报\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 单击左键选择一条车型信息，点击管理车型的高危部件清单按钮\n"
				+" 测试预期->1. 跳转至新页面，管理车型的高危部件清单页面包含车型的各项信息和汽车高风险零部件有害物质备案参数表\n"
				+" 测试步骤->2. 点击材料节点信息，点击基本信息界面右上角的取消填报按钮\n"
				+" 测试预期->2. 出现提示信息：无法为物质节点标注回收利用信息 \n"
				+" 测试步骤->3. 点击标注过的零部件节点信息，点击基本信息界面右上角的取消填报按钮\n"
				+" 测试预期->3. 出现提示信息：确定要取消该标注信息吗？\n"
				+" 测试步骤->4. 点击提示信息中的否按钮\n"
				+" 测试预期->4. 提示信息关闭，节点的填报信息未被取消\n"
				+" 测试步骤->5. 点击标注过的零部件信息，点击基本信息界面右上角的取消填报按钮\n"
				+" 测试预期->5. 出现提示信息：确定要取消该标注信息吗？\n"
				+" 测试步骤->6. 点击提示信息中的是按钮\n"
				+" 测试预期->6. 提示信息关闭，节点的标注信息被成功取消\n"
;
	}

}

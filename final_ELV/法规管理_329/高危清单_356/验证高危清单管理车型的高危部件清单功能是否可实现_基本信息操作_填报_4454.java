package cn.edu.tju.scs.seql.final_ELV.法规管理_329.高危清单_356;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4454
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 高危清单(#356)
 * 用例名称: 验证高危清单管理车型的高危部件清单功能是否可实现-基本信息操作-填报
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 单击左键选择一条车型信息，点击管理车型的高危部件清单按钮
 * 测试预期->1. 跳转至新页面，管理车型的高危部件清单页面包含车型的各项信息和汽车高风险零部件有害物质备案参数表
 * 测试步骤->2. 点击基本信息界面右上角的填报按钮
 * 测试预期->2. 页面出现提示信息：BOM节点不允许填报!
 * 测试步骤->3. 点击材料节点信息，点击基本信息界面右上角的填报按钮
 * 测试预期->3. 页面出现提示信息：材料节点不允许填报!
 * 测试步骤->4. 点击物质节点信息，点击基本信息界面右上角的填报按钮
 * 测试预期->4. 页面出现提示信息：无法为物质节点标注回收利用信息
 * 测试步骤->5. 点击零部件节点信息，点击基本信息界面右上角的填报按钮
 * 测试预期->5. 出现新页面可进行填报，含有需要填写的各项信息。
 * 测试步骤->6. 点击新页面中的填报按钮
 * 测试预期->6. 页面出现提示信息：请您选择回收利用阶段！
 * 测试步骤->7. 选择零部件通用名称为：变速器左侧半轴油封，点击新页面中的填报按钮
 * 测试预期->7. 填报成功，填报页面正常关闭，返回至管理车型的高危部件清单页面，汽车高风险零部件有害物质备案参数表中含有已填报信息。
 * 
 */

public class 验证高危清单管理车型的高危部件清单功能是否可实现_基本信息操作_填报_4454 extends Selenium_Test_Base {
	
	public 验证高危清单管理车型的高危部件清单功能是否可实现_基本信息操作_填报_4454(){
		super();
	}
	
	public 验证高危清单管理车型的高危部件清单功能是否可实现_基本信息操作_填报_4454(WebDriver driver){
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
		
		openAllBOMTree(a);
		
		
		
		getElement(ElementEnum_高危清单_356.BOM树根节点_BOM节点).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.第二页填报按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("BOM节点不允许填报");
		
		getElement(ElementEnum_高危清单_356.BOM树第四层节点_材料).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.第二页填报按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("材料节点不允许填报");
		
		getElement(ElementEnum_高危清单_356.BOM树第五层节点_物质).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.第二页填报按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("无法为物质节点标注回收利用信息");
		
		a.deleteTianBaoForNode();
		a.addTianBaoForNode();
		
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
		return "测试用例id: 4454\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 高危清单(#356)\n"
				+" 用例名称: 验证高危清单管理车型的高危部件清单功能是否可实现-基本信息操作-填报\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 单击左键选择一条车型信息，点击管理车型的高危部件清单按钮\n"
				+" 测试预期->1. 跳转至新页面，管理车型的高危部件清单页面包含车型的各项信息和汽车高风险零部件有害物质备案参数表\n"
				+" 测试步骤->2. 点击基本信息界面右上角的填报按钮\n"
				+" 测试预期->2. 页面出现提示信息：BOM节点不允许填报!\n"
				+" 测试步骤->3. 点击材料节点信息，点击基本信息界面右上角的填报按钮\n"
				+" 测试预期->3. 页面出现提示信息：材料节点不允许填报!\n"
				+" 测试步骤->4. 点击物质节点信息，点击基本信息界面右上角的填报按钮\n"
				+" 测试预期->4. 页面出现提示信息：无法为物质节点标注回收利用信息\n"
				+" 测试步骤->5. 点击零部件节点信息，点击基本信息界面右上角的填报按钮\n"
				+" 测试预期->5. 出现新页面可进行填报，含有需要填写的各项信息。\n"
				+" 测试步骤->6. 点击新页面中的填报按钮\n"
				+" 测试预期->6. 页面出现提示信息：请您选择回收利用阶段！\n"
				+" 测试步骤->7. 选择零部件通用名称为：变速器左侧半轴油封，点击新页面中的填报按钮\n"
				+" 测试预期->7. 填报成功，填报页面正常关闭，返回至管理车型的高危部件清单页面，汽车高风险零部件有害物质备案参数表中含有已填报信息。\n"
;
	}

}

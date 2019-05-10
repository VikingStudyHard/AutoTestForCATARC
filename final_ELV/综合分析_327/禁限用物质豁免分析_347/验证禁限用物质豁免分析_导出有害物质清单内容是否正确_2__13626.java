package cn.edu.tju.scs.seql.final_ELV.综合分析_327.禁限用物质豁免分析_347;

import static cn.edu.tju.scs.seql.final_ELV.commonOperations.OperationUnit.tuplesOperation;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;

import java.io.IOException;

/**
 * 测试用例id: 13626
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 禁限用物质豁免分析(#347)
 * 用例名称: 验证禁限用物质豁免分析 导出有害物质清单内容是否正确（2）
 * 前置条件: 能正常进入综合分析中的禁限用物质豁免分析模块 
 * 测试步骤->1. 点击禁限用物质豁免分析，选择一条车型信息，点击确定
 * 测试预期->1. 出现新页面，左侧为车型BOM,右侧为基本信息
 * 测试步骤->2. 进行有害物质标注，点击导出有害物质清单
 * 测试预期->2. 出现正在下载提示，用迅雷实现下载，下载完成得到一个excel表格。
 * 测试步骤->3. 点击查看清单内容
 * 测试预期->3. 导出表中，有害物质铅、汞、六价铬的含量低于0.1%，镉低于0.01%时，需系统进行必要标识方便企业做技术说明；对于23.十溴联苯醚（需对非金属材料的阻燃剂十溴二苯醚的替代情况进行大概说明）
 * 
 */

public class 验证禁限用物质豁免分析_导出有害物质清单内容是否正确_2__13626 extends Selenium_Test_Base {
	
	public 验证禁限用物质豁免分析_导出有害物质清单内容是否正确_2__13626(){
		super();
	}
	
	public 验证禁限用物质豁免分析_导出有害物质清单内容是否正确_2__13626(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_禁限用物质豁免分析_347.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_禁限用物质豁免分析_347.rightFrame);
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
		getElement(ElementEnum_禁限用物质豁免分析_347.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_禁限用物质豁免分析_347.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	// 检测载入界面是否完成
	public void judgeMaskLoad(){
		CommonOperationsAll a = new CommonOperationsAll(driver);
		a.judgeElementDisplayNone(ElementEnum_禁限用物质豁免分析_347.载入界面);
	}
	public void detailedOperation() throws IOException {
		String str=getDescription();
		String name= Han.getTestCaseName(str);
		//读取三元组文件
		tuplesOperation(driver,name);
//		getElement(ElementEnum_禁限用物质豁免分析_347.检索结果第一行品牌中文名称).click();
//		WebDriverConfiguration.operationInterval();
//		getElement(ElementEnum_禁限用物质豁免分析_347.第一页确定按钮).click();
//		WebDriverConfiguration.operationInterval();
//		judgeMaskLoad();
//
//		getElement(ElementEnum_禁限用物质豁免分析_347.第二页导出有害物质清单按钮).click();
//		WebDriverConfiguration.operationInterval();
		
	}

	
	public String getDescription(){
		return "测试用例id: 13626\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 禁限用物质豁免分析(#347)\n"
				+" 用例名称: 验证禁限用物质豁免分析 导出有害物质清单内容是否正确（2）\n"
				+" 前置条件: 能正常进入综合分析中的禁限用物质豁免分析模块 \n"
				+" 测试步骤->1. 点击禁限用物质豁免分析，选择一条车型信息，点击确定\n"
				+" 测试预期->1. 出现新页面，左侧为车型BOM,右侧为基本信息\n"
				+" 测试步骤->2. 进行有害物质标注，点击导出有害物质清单\n"
				+" 测试预期->2. 出现正在下载提示，用迅雷实现下载，下载完成得到一个excel表格。\n"
				+" 测试步骤->3. 点击查看清单内容\n"
				+" 测试预期->3. 导出表中，有害物质铅、汞、六价铬的含量低于0.1%，镉低于0.01%时，需系统进行必要标识方便企业做技术说明；对于23.十溴联苯醚（需对非金属材料的阻燃剂十溴二苯醚的替代情况进行大概说明）\n"
;
	}

}

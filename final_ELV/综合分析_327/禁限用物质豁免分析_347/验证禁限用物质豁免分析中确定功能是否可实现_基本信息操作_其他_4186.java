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
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.有害物质分析_342.ElementEnum_有害物质分析_342;

import java.io.IOException;

/**
 * 测试用例id: 4186
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 禁限用物质豁免分析(#347)
 * 用例名称: 验证禁限用物质豁免分析中确定功能是否可实现-基本信息操作-其他
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮
 * 测试预期->1. 跳转至新页面，页面包含禁限用物质豁免分析表格
 * 测试步骤->2. 点击基本信息界面右上角的返回按钮
 * 测试预期->2. 页面被正常关闭，返回至禁限用物质豁免分析界面
 * 测试步骤->3. 单击左键选择一条车型信息，点击确定按钮
 * 测试预期->3. 跳转至新页面，页面包含禁限用物质豁免分析表格
 * 测试步骤->4. 点击基本信息界面右上角的导出有害物质清单按钮
 * 测试预期->4. 所选择的车型信息中的所有有害物质的清单被下载到本地，文件格式为.xlsx
 * 
 */

public class 验证禁限用物质豁免分析中确定功能是否可实现_基本信息操作_其他_4186 extends Selenium_Test_Base {
	
	public 验证禁限用物质豁免分析中确定功能是否可实现_基本信息操作_其他_4186(){
		super();
	}
	
	public 验证禁限用物质豁免分析中确定功能是否可实现_基本信息操作_其他_4186(WebDriver driver){
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
//		getElement(ElementEnum_禁限用物质豁免分析_347.检索结果第一行品牌中文名称).click();
//		WebDriverConfiguration.operationInterval();
//		getElement(ElementEnum_禁限用物质豁免分析_347.第一页确定按钮).click();
//		WebDriverConfiguration.operationInterval();
//		judgeMaskLoad();
//
//		getElement(ElementEnum_禁限用物质豁免分析_347.第二页返回按钮).click();
//
//		getElement(ElementEnum_禁限用物质豁免分析_347.检索结果第一行品牌中文名称).click();
//		WebDriverConfiguration.operationInterval();
//		getElement(ElementEnum_禁限用物质豁免分析_347.第一页确定按钮).click();
//		WebDriverConfiguration.operationInterval();
//		judgeMaskLoad();
//
//		getElement(ElementEnum_禁限用物质豁免分析_347.第二页导出有害物质清单按钮).click();
//		WebDriverConfiguration.operationInterval();
		//System.out.print("0000");
		//所选择的车型信息中的所有有害物质的清单被下载到本地，文件格式为.xlsx???
		String str=getDescription();
		String name= Han.getTestCaseName(str);
		//读取三元组文件
		tuplesOperation(driver,name);
	}

	
	public String getDescription(){
		return "测试用例id: 4186\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 禁限用物质豁免分析(#347)\n"
				+" 用例名称: 验证禁限用物质豁免分析中确定功能是否可实现-基本信息操作-其他\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮\n"
				+" 测试预期->1. 跳转至新页面，页面包含禁限用物质豁免分析表格\n"
				+" 测试步骤->2. 点击基本信息界面右上角的返回按钮\n"
				+" 测试预期->2. 页面被正常关闭，返回至禁限用物质豁免分析界面\n"
				+" 测试步骤->3. 单击左键选择一条车型信息，点击确定按钮\n"
				+" 测试预期->3. 跳转至新页面，页面包含禁限用物质豁免分析表格\n"
				+" 测试步骤->4. 点击基本信息界面右上角的到处有害物质清单按钮\n"
				+" 测试预期->4. 所选择的车型信息中的所有有害物质的清单被下载到本地，文件格式为.xlsx\n"
;
	}

}

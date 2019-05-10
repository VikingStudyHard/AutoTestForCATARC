package cn.edu.tju.scs.seql.final_ELV.综合分析_327.禁限用物质豁免分析_347;

import static cn.edu.tju.scs.seql.final_ELV.commonOperations.OperationUnit.tuplesOperation;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;

import java.io.IOException;

/**
 * 测试用例id: 4183
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 禁限用物质豁免分析(#347)
 * 用例名称: 验证禁限用物质豁免分析中确定功能是否可实现-基本信息操作-有害标注
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮
 * 测试预期->1. 跳转至新页面，页面包含禁限用物质豁免分析表格
 * 测试步骤->2. 点击基本信息界面右上角的有害标注按钮
 * 测试预期->2. 出现提示信息：不能标注根节点！
 * 测试步骤->3. 单击左键选择任意一个非根节点，点击基本信息界面右上角的有害标注按钮
 * 测试预期->3. 跳转至新页面，页面为有害标注，其中含有不可更改的基本信息，和可填写的有害标注信息
 * 测试步骤->4. 点击新页面的有害标注按钮
 * 测试预期->4. 出现提示信息：请选择标注名称！
 * 测试步骤->5. 点击选择有害标注信息为（减震器）点击新页面的有害标注按钮
 * 测试预期->5. 页面正常关闭，有害标注成功
 * 
 */

public class 验证禁限用物质豁免分析中确定功能是否可实现_基本信息操作_有害标注_4183 extends Selenium_Test_Base {
	
	public 验证禁限用物质豁免分析中确定功能是否可实现_基本信息操作_有害标注_4183(){
		super();
	}
	
	public 验证禁限用物质豁免分析中确定功能是否可实现_基本信息操作_有害标注_4183(WebDriver driver){
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
//		getElement(ElementEnum_禁限用物质豁免分析_347.第二页有害标注按钮).click();
//		WebDriverConfiguration.operationInterval();
//		assertTrue(driver.getPageSource().contains("不能标注根节点！"));
//		getElement(ElementEnum_禁限用物质豁免分析_347.第二页弹窗确认按钮).click();
//		WebDriverConfiguration.operationInterval();
		String str=getDescription();
		String name= Han.getTestCaseName(str);
		//读取三元组文件
		tuplesOperation(driver,name);
		
		//非根节点不能确定，有些只有跟节点
		/* *测试步骤->3. 单击左键选择任意一个非根节点，点击基本信息界面右上角的有害标注按钮
		 * 测试预期->3. 跳转至新页面，页面为有害标注，其中含有不可更改的基本信息，和可填写的有害标注信息
		 * 测试步骤->4. 点击新页面的有害标注按钮
		 * 测试预期->4. 出现提示信息：请选择标注名称！
		 * 测试步骤->5. 点击选择有害标注信息为（减震器）点击新页面的有害标注按钮
		 * 测试预期->5. 页面正常关闭，有害标注成功
		 * 
		
		getElement(ElementEnum_禁限用物质豁免分析_347.BOM树形图第一个子节点).click();
		WebDriverConfiguration.operationInterval();
		//judgeMaskLoad();
		
		getElement(ElementEnum_禁限用物质豁免分析_347.第二页有害标注按钮).click();
		WebDriverConfiguration.operationInterval();
		//???跳转至新页面，页面为有害标注，其中含有不可更改的基本信息，和可填写的有害标注信息
		assertTrue(driver.getPageSource().contains("有害标注"));
		//assertTrue(getElement(ElementEnum_禁限用物质豁免分析_347.有害标注页面节点中文名称输入框).getCssValue("aria-invalid").equals("false"));
		
		getElement(ElementEnum_禁限用物质豁免分析_347.有害标注页面的有害标注按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(driver.getPageSource().contains("请选择标注名称！"));
		getElement(ElementEnum_禁限用物质豁免分析_347.第二页弹窗确认按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_禁限用物质豁免分析_347.有害标注页面的有害标注信息选择输入框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_禁限用物质豁免分析_347.有害标注信息为减震器).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_禁限用物质豁免分析_347.有害标注页面的有害标注按钮).click();
		WebDriverConfiguration.operationInterval();
		//???页面正常关闭，有害标注成功
		 */
	}

	
	public String getDescription(){
		return "测试用例id: 4183\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 禁限用物质豁免分析(#347)\n"
				+" 用例名称: 验证禁限用物质豁免分析中确定功能是否可实现-基本信息操作-有害标注\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮\n"
				+" 测试预期->1. 跳转至新页面，页面包含禁限用物质豁免分析表格\n"
				+" 测试步骤->2. 点击基本信息界面右上角的有害标注按钮\n"
				+" 测试预期->2. 出现提示信息：不能标注根节点！\n"
				+" 测试步骤->3. 单击左键选择任意一个非根节点，点击基本信息界面右上角的有害标注按钮\n"
				+" 测试预期->3. 跳转至新页面，页面为有害标注，其中含有不可更改的基本信息，和可填写的有害标注信息\n"
				+" 测试步骤->4. 点击新页面的有害标注按钮\n"
				+" 测试预期->4. 出现提示信息：请选择标注名称！\n"
				+" 测试步骤->5. 点击选择有害标注信息为（减震器）点击新页面的有害标注按钮\n"
				+" 测试预期->5. 页面正常关闭，有害标注成功\n"
;
	}

}

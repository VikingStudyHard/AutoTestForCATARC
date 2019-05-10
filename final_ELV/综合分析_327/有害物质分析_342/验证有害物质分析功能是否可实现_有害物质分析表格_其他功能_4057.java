package cn.edu.tju.scs.seql.final_ELV.综合分析_327.有害物质分析_342;

import static cn.edu.tju.scs.seql.final_ELV.commonOperations.OperationUnit.tuplesOperation;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Vector;

/**
 * 测试用例id: 4057
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 有害物质分析(#342)
 * 用例名称: 验证有害物质分析功能是否可实现-有害物质分析表格-其他功能
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮
 * 测试预期->1. 跳转至新页面，页面包含车型树形图和有害物质分析表格
 * 测试步骤->2. 点击有害物质分析表格右上角的返回按钮
 * 测试预期->2. 页面正常关闭，返回至有害物质分析的首页面
 * 测试步骤->3. 单击左键选择一条车型信息，点击确定按钮
 * 测试预期->3. 跳转至新页面，页面包含车型树形图和有害物质分析表格
 * 测试步骤->4. 点击有害物质分析表格右上角的备注按钮
 * 测试预期->4. 显示备注信息
 * 测试步骤->5. 关闭备注信息，点击有害物质分析表格右上角的下载分析结果按钮
 * 测试预期->5. 当没有分析到有害物质时，会出现提示信息：文件导出失败！
分析到有害物质时，出现提示下载的对话框
 * 测试步骤->6. 查看下载的报告
 * 测试预期->6. 报告内容应与有害物质分析表格中的内容相一致。
 * 
 */

public class 验证有害物质分析功能是否可实现_有害物质分析表格_其他功能_4057 extends Selenium_Test_Base {
	
	public 验证有害物质分析功能是否可实现_有害物质分析表格_其他功能_4057(){
		super();
	}
	
	public 验证有害物质分析功能是否可实现_有害物质分析表格_其他功能_4057(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_有害物质分析_342.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_有害物质分析_342.rightFrame);
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
		getElement(ElementEnum_有害物质分析_342.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_有害物质分析_342.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation() throws IOException {
		String str=getDescription();
		String name= Han.getTestCaseName(str);
		//读取三元组文件
		tuplesOperation(driver,name);

		
		/*getElement(ElementEnum_有害物质分析_342.检索结果第一行品牌中文名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_有害物质分析_342.第一页确定按钮).click();
		WebDriverConfiguration.operationInterval();
		judgeMaskLoad();
		
		getElement(ElementEnum_有害物质分析_342.第二页返回按钮).click();
		
		getElement(ElementEnum_有害物质分析_342.检索结果第一行品牌中文名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_有害物质分析_342.第一页确定按钮).click();
		WebDriverConfiguration.operationInterval();
		judgeMaskLoad();
		
		
		getElement(ElementEnum_有害物质分析_342.第二页备注按钮).click();
		WebDriverConfiguration.operationInterval();
		String warningInfo = getElement(ElementEnum_有害物质分析_342.第二页弹窗提示信息).getText();
		assertTrue(warningInfo.contains("1.结果为\"√\"：表示该零部件下基本物质的含量低于法规的要求,即为合格;"));
		assertTrue(warningInfo.contains("2.结果为\"〇\"：表示该零部件下基本物质的含量超过法规的要求,但存在豁免选项,即为合格;"));
		assertTrue(warningInfo.contains("3.结果为\"╳\"：表示该零部件下基本物质的含量超过法规的要求,并且不存在豁免选项,即为不合格;"));
		getElement(ElementEnum_有害物质分析_342.第二页弹窗确认按钮).click();
		WebDriverConfiguration.operationInterval();
		
		
		getElement(ElementEnum_有害物质分析_342.第二页下载分析结果按钮).click();
		WebDriverConfiguration.operationInterval();
		warningInfo = getElement(ElementEnum_有害物质分析_342.第二页弹窗提示信息).getText();
		System.out.println(warningInfo);
		assertTrue(warningInfo.contains("文件导出失败"));
		getElement(ElementEnum_有害物质分析_342.第二页弹窗确认按钮).click();
		WebDriverConfiguration.operationInterval();
		*/
		
	}
	
	// 检测载入界面是否完成
	public void judgeMaskLoad(){
		CommonOperationsAll a = new CommonOperationsAll(driver);
		a.judgeElementDisplayNone(ElementEnum_有害物质分析_342.载入界面);
	}

	
	public String getDescription(){
		return "测试用例id: 4057\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 有害物质分析(#342)\n"
				+" 用例名称: 验证有害物质分析功能是否可实现-有害物质分析表格-其他功能\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮\n"
				+" 测试预期->1. 跳转至新页面，页面包含车型树形图和有害物质分析表格\n"
				+" 测试步骤->2. 点击有害物质分析表格右上角的返回按钮\n"
				+" 测试预期->2. 页面正常关闭，返回至有害物质分析的首页面\n"
				+" 测试步骤->3. 单击左键选择一条车型信息，点击确定按钮\n"
				+" 测试预期->3. 跳转至新页面，页面包含车型树形图和有害物质分析表格\n"
				+" 测试步骤->4. 点击有害物质分析表格右上角的备注按钮\n"
				+" 测试预期->4. 显示备注信息\n"
				+" 测试步骤->5. 关闭备注信息，点击有害物质分析表格右上角的下载分析结果按钮\n"
				+" 测试预期->5. 当没有分析到有害物质时，会出现提示信息：文件导出失败！ 分析到有害物质时，出现提示下载的对话框\n"
				+" 测试步骤->6. 查看下载的报告\n"
				+" 测试预期->6. 报告内容应与有害物质分析表格中的内容相一致。\n"
;
	}

}

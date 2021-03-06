package cn.edu.tju.scs.seql.final_ELV.综合分析_327.有害物质分析_342;

import java.io.IOException;


import cn.edu.tju.scs.seql.final_ELV.commonOperations.OperationUnit;
import org.openqa.selenium.*;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;

import static cn.edu.tju.scs.seql.final_ELV.commonOperations.OperationUnit.tuplesOperation;

/**
 * 测试用例id: 4025
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 有害物质分析(#342)
 * 用例名称: 验证有害物质分析中确定功能是否可实现
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 点击车型信息版面中的确定按钮
 * 测试预期->1. 出现提示信息：您要选择一条记录
 * 测试步骤->2. 随机选择一条记录单击左键
 * 测试预期->2. 跳转至新页面，页面包含所选信息的有害物质分析信息，可查询参数来分析信息。
 * 
 */

public class 验证有害物质分析中确定功能是否可实现_4025 extends Selenium_Test_Base {
	
	public 验证有害物质分析中确定功能是否可实现_4025(){
		super();
	}
	
	public 验证有害物质分析中确定功能是否可实现_4025(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame = getElement(ElementEnum_有害物质分析_342.leftFrame);
		WebElement mainFrame = getElement(ElementEnum_有害物质分析_342.rightFrame);
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
		//切割
		//segmentUnit(str,name);
		//读取三元组文件
		tuplesOperation(driver,name);






		/*List<WebElement> eles = getElements(ElementEnum_有害物质分析_342.检索结果所有行);
		// 检查查询结果中是否包含所查关键字
		for(int i = 1;i < eles.size();i++){
			openAndReturn(i);
		}
		WebDriverConfiguration.operationInterval();*/
		
	}
	
	public void openAndReturn(int lineNum){
//		getElement(ElementEnum_有害物质分析_342.检索结果第一行品牌中文名称).click();
		String chXpath = ElementEnum_有害物质分析_342.检索结果第一行车型中文名称.getName().replaceAll("tr\\[2\\]", "tr["+(lineNum+1)+"]");
		driver.findElement(By.xpath(chXpath)).click();
		
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_有害物质分析_342.第一页确定按钮).click();
		WebDriverConfiguration.operationInterval();
		judgeMaskLoad();
		
		getElement(ElementEnum_有害物质分析_342.第二页返回按钮).click();
	}
	
	// 检测载入界面是否完成
	public void judgeMaskLoad(){
		CommonOperationsAll a = new CommonOperationsAll(driver);
		a.judgeElementDisplayNone(ElementEnum_有害物质分析_342.载入界面);
	}

	
	public String getDescription(){
		return "测试用例id: 4025\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 有害物质分析(#342)\n"
				+" 用例名称: 验证有害物质分析中确定功能是否可实现\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 点击车型信息版面中的确定按钮\n"
				+" 测试预期->1. 出现提示信息：您要选择一条记录\n"
				+" 测试步骤->2. 随机选择一条记录单击左键\n"
				+" 测试预期->2. 跳转至新页面，页面包含所选信息的有害物质分析信息，可查询参数来分析信息。\n"
;
	}

}

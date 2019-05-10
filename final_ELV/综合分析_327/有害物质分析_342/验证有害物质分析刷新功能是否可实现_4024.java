package cn.edu.tju.scs.seql.final_ELV.综合分析_327.有害物质分析_342;

import org.junit.Test;
import org.openqa.selenium.*;

import cn.edu.tju.scs.seql.ELV.common.*;

import java.io.IOException;

import static cn.edu.tju.scs.seql.final_ELV.commonOperations.OperationUnit.tuplesOperation;

/**
 * 测试用例id: 4024
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 有害物质分析(#342)
 * 用例名称: 验证有害物质分析刷新功能是否可实现
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 点击有害物质分析的车型信息版面中的刷新按钮
 * 测试预期->1. 页面处理片刻后刷新完成
 * 
 */

public class 验证有害物质分析刷新功能是否可实现_4024 extends Selenium_Test_Base {
	
	public 验证有害物质分析刷新功能是否可实现_4024(){
		super();
	}
	
	public 验证有害物质分析刷新功能是否可实现_4024(WebDriver driver){
		super(driver);
	}
	
	@org.testng.annotations.Test
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
		/*getElement(ElementEnum_有害物质分析_342.第一页刷新按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_有害物质分析_342.第一页刷新按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_有害物质分析_342.第一页刷新按钮).click();
		WebDriverConfiguration.operationInterval();*/




		String str=getDescription();
		String name= Han.getTestCaseName(str);
		//读取三元组文件
		tuplesOperation(driver,name);
	}

	
	public String getDescription(){
		return "测试用例id: 4024\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 有害物质分析(#342)\n"
				+" 用例名称: 验证有害物质分析刷新功能是否可实现\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 点击有害物质分析的车型信息版面中的刷新按钮\n"
				+" 测试预期->1. 页面处理片刻后刷新完成\n"
;
	}

}

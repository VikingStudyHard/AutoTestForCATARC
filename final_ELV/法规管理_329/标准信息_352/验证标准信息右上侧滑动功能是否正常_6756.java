package cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 6756
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 标准信息(#352)
 * 用例名称: 验证标准信息右上侧滑动功能是否正常
 * 前置条件: 正常登陆ELV环境合规系统（标准版）
 * 测试步骤->1. 点击进入标准信息模块
 * 测试预期->1. 模块界面内各项内容显示正常
 * 测试步骤->2. 滑动界面右侧的上下滑动块
 * 测试预期->2. 内容随滑动功能逐步显示
 * 
 */

public class 验证标准信息右上侧滑动功能是否正常_6756 extends Selenium_Test_Base {
	
	public 验证标准信息右上侧滑动功能是否正常_6756(){
		super();
	}
	
	public 验证标准信息右上侧滑动功能是否正常_6756(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_标准信息_352.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_标准信息_352.rightFrame);
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
		getElement(ElementEnum_标准信息_352.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		String setScroll = "document.getElementById('lawsGrid-body').childNodes.item(0).scrollTop=";
		System.out.println(setScroll);
		for(int i = 0;i < 10;i++){
			((JavascriptExecutor)driver).executeScript(setScroll+10*i);
			WebDriverConfiguration.operationInterval();
		}
	}

	
	public String getDescription(){
		return "测试用例id: 6756\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 标准信息(#352)\n"
				+" 用例名称: 验证标准信息右上侧滑动功能是否正常\n"
				+" 前置条件: 正常登陆ELV环境合规系统（标准版）\n"
				+" 测试步骤->1. 点击进入标准信息模块\n"
				+" 测试预期->1. 模块界面内各项内容显示正常\n"
				+" 测试步骤->2. 滑动界面右侧的上下滑动块\n"
				+" 测试预期->2. 内容随滑动功能逐步显示\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.车型管理_326.扩展零部件_341;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4017
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 扩展零部件(#341)
 * 用例名称: 验证扩展零部件信息刷新功能是否可实现
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 点击车型信息版面中的刷新按钮
 * 测试预期->1. 页面处理片刻后刷新完成
 * 
 */

public class 验证扩展零部件信息刷新功能是否可实现_4017 extends Selenium_Test_Base {
	
	public 验证扩展零部件信息刷新功能是否可实现_4017(){
		super();
	}
	
	public 验证扩展零部件信息刷新功能是否可实现_4017(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_扩展零部件_341.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_扩展零部件_341.rightFrame);
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
		getElement(ElementEnum_扩展零部件_341.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_扩展零部件_341.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		WebElement body = driver.findElement(By.tagName("body"));
		getElement(ElementEnum_扩展零部件_341.刷新按钮).click();
		//assertTrue(!getElement(ElementEnum_扩展零部件_341.Loading框).getCssValue("display").equals("none"));
		System.out.println(body.getText());
		waitingForLoading();
	}
	
	private void waitingForLoading(){
		
		do{
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e){
				
			}
		} while((!getElement(ElementEnum_扩展零部件_341.Loading框).getCssValue("display").equals("none")));
	}

	
	public String getDescription(){
		return "测试用例id: 4017\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 扩展零部件(#341)\n"
				+" 用例名称: 验证扩展零部件信息刷新功能是否可实现\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 点击车型信息版面中的刷新按钮\n"
				+" 测试预期->1. 页面处理片刻后刷新完成\n"
;
	}

}

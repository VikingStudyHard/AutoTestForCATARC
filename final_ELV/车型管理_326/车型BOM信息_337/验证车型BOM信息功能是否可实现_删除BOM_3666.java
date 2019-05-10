package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型BOM信息_337;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3666
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型BOM信息(#337)
 * 用例名称:  验证车型BOM信息功能是否可实现-删除BOM
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 点击删除BOM按钮
 * 测试预期->1. 出现错误信息：请选择信息！
 * 测试步骤->2. 单击左键选择一条是否存在BOM一栏为否的信息，点击删除BOM按钮
 * 测试预期->2. 出现提示信息：BOM未创建
 * 测试步骤->3. 单击左键选择一条是否存在BOM一栏为是的信息，点击删除BOM按钮
 * 测试预期->3. 出现提示信息： 确实要删除这些记录吗?
 * 测试步骤->4. 点击提示消息中的否按钮
 * 测试预期->4. 页面关闭，BOM信息未删除
 * 测试步骤->5. 点击提示消息中的是按钮
 * 测试预期->5. 页面关闭，BOM信息被删除
 * 
 */

public class 验证车型BOM信息功能是否可实现_删除BOM_3666 extends Selenium_Test_Base {
	
	public 验证车型BOM信息功能是否可实现_删除BOM_3666(){
		super();
	}
	
	public 验证车型BOM信息功能是否可实现_删除BOM_3666(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_车型BOM信息_337.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_车型BOM信息_337.rightFrame);
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
		getElement(ElementEnum_车型BOM信息_337.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
		
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	// 检测载入界面是否完成
	public void judgeMaskLoad(){
		int times = 20;
		while(times > 0){
			if(getElement(ElementEnum_车型BOM信息_337.载入界面).getCssValue("display").equals("none")){
				return;
			}else{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			times--;
		}
		Assert.fail("页面载入时间过久，请检查");
	}
	public void detailedOperation(){
		
		getElement(ElementEnum_车型BOM信息_337.删除BOM按钮).click();	
		WebDriverConfiguration.operationInterval();		
		assertTrue(driver.getPageSource().contains("请选择信息"));
		getElement(ElementEnum_车型BOM信息_337.错误信息确定按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.车型商标输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.车型商标输入框).sendKeys("杨杨1");
		getElement(ElementEnum_车型BOM信息_337.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		//是否存在BOM一栏为否的信息
		getElement(ElementEnum_车型BOM信息_337.检索BOM为否的行).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_车型BOM信息_337.删除BOM按钮).click();
		WebDriverConfiguration.operationInterval();
//		assertTrue(driver.getPageSource().contains("BOM未创建"));
		
		Alert alert = driver.switchTo().alert();  
	    String text = alert.getText();  
	    System.out.println(text);  
	    alert.dismiss();  
	    
		//BOM为是的一栏
	    getElement(ElementEnum_车型BOM信息_337.车型商标输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.车型商标输入框).sendKeys("test杨杨");
		getElement(ElementEnum_车型BOM信息_337.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.检索BOM为是的行).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.删除BOM按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(driver.getPageSource().contains("确实要删除这些记录吗?"));
		getElement(ElementEnum_车型BOM信息_337.删除BOM确认提示信息否按钮).click();
		WebDriverConfiguration.operationInterval();
		
		//BOM为是的一栏
		getElement(ElementEnum_车型BOM信息_337.检索BOM为是的行).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.删除BOM按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(driver.getPageSource().contains("确实要删除这些记录吗?"));
		getElement(ElementEnum_车型BOM信息_337.删除BOM确认提示信息是按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.操作成功确定按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_车型BOM信息_337.车型商标输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.车型商标输入框).sendKeys("test杨杨");
		getElement(ElementEnum_车型BOM信息_337.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.检索BOM为是的行).click();
		getElement(ElementEnum_车型BOM信息_337.新增BOM按钮).click();
		WebDriverConfiguration.operationInterval();
		judgeMaskLoad();
		
		getElement(ElementEnum_车型BOM信息_337.保存按钮).click();
		WebDriverConfiguration.operationInterval();
		
		Alert alerts = driver.switchTo().alert();  
	    String texts = alerts.getText();  
	    System.out.println(texts);  
	    alert.dismiss();
		
		
	}

	
	public String getDescription(){
		return "测试用例id: 3666\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型BOM信息(#337)\n"
				+" 用例名称:  验证车型BOM信息功能是否可实现-删除BOM\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 点击删除BOM按钮\n"
				+" 测试预期->1. 出现错误信息：请选择信息！\n"
				+" 测试步骤->2. 单击左键选择一条是否存在BOM一栏为否的信息，点击删除BOM按钮\n"
				+" 测试预期->2. 出现提示信息：BOM未创建\n"
				+" 测试步骤->3. 单击左键选择一条是否存在BOM一栏为是的信息，点击删除BOM按钮\n"
				+" 测试预期->3. 出现提示信息： 确实要删除这些记录吗?\n"
				+" 测试步骤->4. 点击提示消息中的否按钮\n"
				+" 测试预期->4. 页面关闭，BOM信息未删除\n"
				+" 测试步骤->5. 点击提示消息中的是按钮\n"
				+" 测试预期->5. 页面关闭，BOM信息被删除\n"
;
	}

}

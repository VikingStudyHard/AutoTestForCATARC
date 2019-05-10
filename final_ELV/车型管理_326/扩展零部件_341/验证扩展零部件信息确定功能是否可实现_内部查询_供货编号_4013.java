package cn.edu.tju.scs.seql.final_ELV.车型管理_326.扩展零部件_341;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4013
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 扩展零部件(#341)
 * 用例名称: 验证扩展零部件信息确定功能是否可实现-内部查询-供货编号
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 在供货编号中填写7511，点击检索按钮
 * 测试预期->1. 未检索出符合条件的信息
 * 测试步骤->2. 在供货编号中填写75111LA220，点击检索按钮
 * 测试预期->2. 检索出供货编号为75111LA220的信息
 * 
 */

public class 验证扩展零部件信息确定功能是否可实现_内部查询_供货编号_4013 extends Selenium_Test_Base {
	
	public 验证扩展零部件信息确定功能是否可实现_内部查询_供货编号_4013(){
		super();
	}
	
	public 验证扩展零部件信息确定功能是否可实现_内部查询_供货编号_4013(WebDriver driver){
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
		getElement(ElementEnum_扩展零部件_341.表格第一行).click();
		getElement(ElementEnum_扩展零部件_341.确定按钮).click();
		WebDriverConfiguration.operationInterval();
		
		query("7511");
		query("75111LA220");
	}
	
	void query(String word){
		getElement(ElementEnum_扩展零部件_341.供货编号输入框).clear();
		getElement(ElementEnum_扩展零部件_341.供货编号输入框).sendKeys(word);
		getElement(ElementEnum_扩展零部件_341.子页面检索按钮).click();
		waitingForLoading();
		List<WebElement> eles = getElements(ElementEnum_扩展零部件_341.检索结果所有行);
		if (eles.size() == 0)
			return;
		for (int i = 1; i < eles.size(); i++){
			String name = driver.findElement(By.xpath(ElementEnum_扩展零部件_341.检索结果第一行供货编号.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			assertTrue(name.equals(word));
			//assertTrue(name.contains(word));
		}
	}
	
	private void waitingForLoading(){
		
		do{
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e){
				
			}
		} while((!getElement(ElementEnum_扩展零部件_341.子页面Loading框).getCssValue("display").equals("none")));
	}

	
	public String getDescription(){
		return "测试用例id: 4013\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 扩展零部件(#341)\n"
				+" 用例名称: 验证扩展零部件信息确定功能是否可实现-内部查询-供货编号\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 在供货编号中填写7511，点击检索按钮\n"
				+" 测试预期->1. 未检索出符合条件的信息\n"
				+" 测试步骤->2. 在供货编号中填写75111LA220，点击检索按钮\n"
				+" 测试预期->2. 检索出供货编号为75111LA220的信息\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.车型管理_326.零部件BOM信息_339;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3697
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件BOM信息(#339)
 * 用例名称: 验证零部件BOM信息功能是否可实现-新增BOM-BOM树形新增操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 击新增BOM按钮
 * 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。
 * 测试步骤->2. 点击BOM树形左上角的新增按钮
 * 测试预期->2. 出现新增界面，含有各项需要填写的新增信息
 * 测试步骤->3. 点击确认按钮
 * 测试预期->3. 必填项供货编号标记为红色，
 * 测试步骤->4. 填写供货编号为11，点击确认按钮
 * 测试预期->4. 新增节点为：新增节点（11），为根节点下第一节点
 * 测试步骤->5. 点击BOM树形左上角的新增按钮
 * 测试预期->5. 出现新增界面，含有各项需要填写的新增信息
 * 测试步骤->6. 填写名称为测试，数量为2，质量为10，责任人为admin，供货编号为13，点击确认按钮
 * 测试预期->6. 新增节点为：测试（13），为根节点下第二节点
 * 测试步骤->7. 点击BOM树形左上角的新增按钮
 * 测试预期->7. 出现新增界面，含有各项需要填写的新增信息
 * 测试步骤->8. 点击取消按钮
 * 测试预期->8. 无新增节点
 * 
 */

public class 验证零部件BOM信息功能是否可实现_新增BOM_BOM树形新增操作_3697 extends Selenium_Test_Base {
	
	public 验证零部件BOM信息功能是否可实现_新增BOM_BOM树形新增操作_3697(){
		super();
	}
	
	public 验证零部件BOM信息功能是否可实现_新增BOM_BOM树形新增操作_3697(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_零部件BOM信息_339.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_零部件BOM信息_339.rightFrame);
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
		getElement(ElementEnum_零部件BOM信息_339.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件BOM信息_339.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		waitingForLoading();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM键).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增键).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框名称).clear();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框供货编号).clear();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框责任人).clear();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框确定键).click();
		WebDriverConfiguration.operationInterval();
		try{
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e){
			Assert.fail("供货编号应是必填项");
		}
		
		String name1 = "testname1";
		String number1 = "123456";
		String person1 = "John";
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框名称).sendKeys(name1);
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框供货编号).sendKeys(number1);
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框责任人).sendKeys(person1);
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框确定键).click();
		WebDriverConfiguration.operationInterval();
		
		List<WebElement> rows = getElements(ElementEnum_零部件BOM信息_339.树形图所有行);
		assertEquals(rows.size(), 3);
		
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增键).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框名称).clear();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框供货编号).clear();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框责任人).clear();
		
		String name2 = "testname2";
		String number2 = "123456";
		String person2 = "John";
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框名称).sendKeys(name2);
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框供货编号).sendKeys(number2);
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框责任人).sendKeys(person2);
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框确定键).click();
		WebDriverConfiguration.operationInterval();
		
		rows = getElements(ElementEnum_零部件BOM信息_339.树形图所有行);
		assertEquals(rows.size(), 4);
		assertTrue(rows.get(2).getText().contains(name1));
		assertTrue(rows.get(3).getText().contains(name2));
		
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增键).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框取消键).click();
		WebDriverConfiguration.operationInterval();
		
		rows = getElements(ElementEnum_零部件BOM信息_339.树形图所有行);
		String name = rows.get(3).getText();
		rows.get(3).click();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面删除键).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件BOM信息_339.删除节点取消键).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(findRow(name));
		
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面删除键).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件BOM信息_339.删除节点确定键).click();
		WebDriverConfiguration.operationInterval();
		
		assertFalse(findRow(name));
	}
	
	private boolean findRow(String name){
		boolean result = false;
		List<WebElement> rows = getElements(ElementEnum_零部件BOM信息_339.树形图所有行);
		for (int i = 1; i < rows.size(); i++){
			if (rows.get(i).getText().equals(name)){
				result = true;
				break;
			}
		}
		return result;
	}
	
	private void waitingForLoading(){
		
		do{
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e){
				
			}
		} while((!getElement(ElementEnum_零部件BOM信息_339.Loading框).getCssValue("display").equals("none")));
	}

	
	public String getDescription(){
		return "测试用例id: 3697\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件BOM信息(#339)\n"
				+" 用例名称: 验证零部件BOM信息功能是否可实现-新增BOM-BOM树形新增操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 击新增BOM按钮\n"
				+" 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。\n"
				+" 测试步骤->2. 点击BOM树形左上角的新增按钮\n"
				+" 测试预期->2. 出现新增界面，含有各项需要填写的新增信息\n"
				+" 测试步骤->3. 点击确认按钮\n"
				+" 测试预期->3. 必填项供货编号标记为红色，\n"
				+" 测试步骤->4. 填写供货编号为11，点击确认按钮\n"
				+" 测试预期->4. 新增节点为：新增节点（11），为根节点下第一节点\n"
				+" 测试步骤->5. 点击BOM树形左上角的新增按钮\n"
				+" 测试预期->5. 出现新增界面，含有各项需要填写的新增信息\n"
				+" 测试步骤->6. 填写名称为测试，数量为2，质量为10，责任人为admin，供货编号为13，点击确认按钮\n"
				+" 测试预期->6. 新增节点为：测试（13），为根节点下第二节点\n"
				+" 测试步骤->7. 点击BOM树形左上角的新增按钮\n"
				+" 测试预期->7. 出现新增界面，含有各项需要填写的新增信息\n"
				+" 测试步骤->8. 点击取消按钮\n"
				+" 测试预期->8. 无新增节点\n"
;
	}

}

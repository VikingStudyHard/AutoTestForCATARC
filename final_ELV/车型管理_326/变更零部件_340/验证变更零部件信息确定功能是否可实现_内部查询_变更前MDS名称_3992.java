package cn.edu.tju.scs.seql.final_ELV.车型管理_326.变更零部件_340;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3992
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 变更零部件(#340)
 * 用例名称: 验证变更零部件信息确定功能是否可实现-内部查询-变更前MDS名称
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 点击检索按钮
 * 测试预期->1. 出现提示信息：请至少输入一项检索条件！
 * 测试步骤->2. 在变更前MDS名称中填写M，点击检索按钮
 * 测试预期->2. 检索出变更前MDS名称中含有M字段的信息
 * 测试步骤->3. 在变更前MDS名称中填写MBR ASSY-FR SIDE RH，点击检索按钮
 * 测试预期->3. 检索出变更前MDS名称中含有MBR ASSY-FR SIDE RH字段的信息
 * 
 */

public class 验证变更零部件信息确定功能是否可实现_内部查询_变更前MDS名称_3992 extends Selenium_Test_Base {
	
	public 验证变更零部件信息确定功能是否可实现_内部查询_变更前MDS名称_3992(){
		super();
	}
	
	public 验证变更零部件信息确定功能是否可实现_内部查询_变更前MDS名称_3992(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_变更零部件_340.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_变更零部件_340.rightFrame);
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
		getElement(ElementEnum_变更零部件_340.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_变更零部件_340.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_变更零部件_340.表格第一行).click();
		getElement(ElementEnum_变更零部件_340.确定按钮).click();
		WebDriverConfiguration.operationInterval();
		
		query("M");
		query("MBR ASSY-FR SIDE RH");
	}

	void query(String word){
		getElement(ElementEnum_变更零部件_340.变更前MDS名称输入框).clear();
		getElement(ElementEnum_变更零部件_340.变更前MDS名称输入框).sendKeys(word);
		getElement(ElementEnum_变更零部件_340.子页面检索按钮).click();
		waitingForLoading();
		List<WebElement> eles = getElements(ElementEnum_变更零部件_340.检索结果所有行);
		if (eles.size() == 0)
			return;
		for (int i = 1; i < eles.size(); i++){
			String name = driver.findElement(By.xpath(ElementEnum_变更零部件_340.检索结果第一行变更前MDS名称.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			//assertTrue(name.equals(word));
			assertTrue(name.contains(word));
		}
	}
	 
	 private void waitingForLoading(){
			
			do{
				try{
					Thread.sleep(1000);
				} catch(InterruptedException e){
					
				}
			} while((!getElement(ElementEnum_变更零部件_340.子页面Loading框).getCssValue("display").equals("none")));
		}
	
	public String getDescription(){
		return "测试用例id: 3992\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 变更零部件(#340)\n"
				+" 用例名称: 验证变更零部件信息确定功能是否可实现-内部查询-变更前MDS名称\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 点击检索按钮\n"
				+" 测试预期->1. 出现提示信息：请至少输入一项检索条件！\n"
				+" 测试步骤->2. 在变更前MDS名称中填写M，点击检索按钮\n"
				+" 测试预期->2. 检索出变更前MDS名称中含有M字段的信息\n"
				+" 测试步骤->3. 在变更前MDS名称中填写MBR ASSY-FR SIDE RH，点击检索按钮\n"
				+" 测试预期->3. 检索出变更前MDS名称中含有MBR ASSY-FR SIDE RH字段的信息\n"
;
	}

}

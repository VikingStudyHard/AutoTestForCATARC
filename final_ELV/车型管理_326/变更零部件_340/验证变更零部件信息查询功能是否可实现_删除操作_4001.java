package cn.edu.tju.scs.seql.final_ELV.车型管理_326.变更零部件_340;

import static org.testng.Assert.*;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4001
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 变更零部件(#340)
 * 用例名称: 验证变更零部件信息查询功能是否可实现-删除操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 任选一条车型信息，点击确定按钮
 * 测试预期->1. 跳转至新页面，页面包含所选信息的零部件变更信息，可输入查询参数来查询变更信息。
 * 测试步骤->2. 点击左上角的删除按钮
 * 测试预期->2. 出现错误提示：请选择信息!
 * 测试步骤->3. 选择一条或多条信息，点击删除按钮
 * 测试预期->3. 出现提示信息：确实要删除这些记录吗?
 * 测试步骤->4. 点击是按钮
 * 测试预期->4. 出现提示信息：删除成功，页面跳转回上一页面，所选信息被删除
 * 测试步骤->5. 选择一条或多条信息，点击删除按钮
 * 测试预期->5. 出现提示信息：确实要删除这些记录吗?
 * 测试步骤->6. 点击否按钮
 * 测试预期->6. 页面跳转回上一页面，所选信息未被删除
 * 
 */

public class 验证变更零部件信息查询功能是否可实现_删除操作_4001 extends Selenium_Test_Base {
	
	public 验证变更零部件信息查询功能是否可实现_删除操作_4001(){
		super();
	}
	
	public 验证变更零部件信息查询功能是否可实现_删除操作_4001(WebDriver driver){
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
		
		List<WebElement> eles = getElements(ElementEnum_变更零部件_340.表格所有项);
		if (eles.size() == 0)
			return;
		for (int i = 1; i < eles.size(); i++){
			driver.findElement(By.xpath(ElementEnum_变更零部件_340.表格第一行.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).click();
			waitingForLoading();
			boolean result = doInSubpage();
			if (result){
				//找到了一个有变更记录的零件，不用再尝试下一个零件
				break;
			}
			
			WebElement leftFrame=getElement(ElementEnum_变更零部件_340.leftFrame);
			WebElement mainFrame=getElement(ElementEnum_变更零部件_340.rightFrame);
		    driver.switchTo().frame(leftFrame);
			getElement(ElementEnum_变更零部件_340.二级目录名称).click();
			WebDriverConfiguration.operationInterval();
			driver.switchTo().frame(mainFrame);
		}
	}
	
	private boolean doInSubpage(){
		List<WebElement> eles = getElements(ElementEnum_变更零部件_340.检索结果所有行);
		if (eles.size() < 2){
			return false;
		}
		else{
			getElement(ElementEnum_变更零部件_340.删除按钮).click();
			String message = getElement(ElementEnum_变更零部件_340.子页面未选择信息错误提示).getText();
			assertEquals(message, "请选择信息!");
			getElement(ElementEnum_变更零部件_340.子页面未选择信息错误提示确定键).click();
			WebDriverConfiguration.operationInterval();
			
			String time = getElement(ElementEnum_变更零部件_340.检索结果第一行时间).getText();
			
			getElement(ElementEnum_变更零部件_340.检索结果第一行).click();
			getElement(ElementEnum_变更零部件_340.删除按钮).click();
			message = getElement(ElementEnum_变更零部件_340.子页面未选择信息错误提示).getText();
			assertEquals(message, "确实要删除这些记录吗?");
			getElement(ElementEnum_变更零部件_340.删除取消键).click();
			WebDriverConfiguration.operationInterval();
			assertTrue(isRecordExists(time));
			
			getElement(ElementEnum_变更零部件_340.删除按钮).click();
			message = getElement(ElementEnum_变更零部件_340.子页面未选择信息错误提示).getText();
			assertEquals(message, "确实要删除这些记录吗?");
			getElement(ElementEnum_变更零部件_340.删除确定键).click();
			WebDriverConfiguration.operationInterval();
			assertFalse(isRecordExists(time));
			return true;
		}
	}
	
	private boolean isRecordExists(String time){
		List<WebElement> eles = getElements(ElementEnum_变更零部件_340.检索结果所有行);
		if (eles.size() == 0)
			return false;
		for (int i = 1; i < eles.size(); i++){
			String t = driver.findElement(By.xpath(ElementEnum_变更零部件_340.检索结果第一行时间.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			if (time.equals(t)){
				return true;
			}
		}
		return false;
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
		return "测试用例id: 4001\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 变更零部件(#340)\n"
				+" 用例名称: 验证变更零部件信息查询功能是否可实现-删除操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 任选一条车型信息，点击确定按钮\n"
				+" 测试预期->1. 跳转至新页面，页面包含所选信息的零部件变更信息，可输入查询参数来查询变更信息。\n"
				+" 测试步骤->2. 点击左上角的删除按钮\n"
				+" 测试预期->2. 出现错误提示：请选择信息!\n"
				+" 测试步骤->3. 选择一条或多条信息，点击删除按钮\n"
				+" 测试预期->3. 出现提示信息：确实要删除这些记录吗?\n"
				+" 测试步骤->4. 点击是按钮\n"
				+" 测试预期->4. 出现提示信息：删除成功，页面跳转回上一页面，所选信息被删除\n"
				+" 测试步骤->5. 选择一条或多条信息，点击删除按钮\n"
				+" 测试预期->5. 出现提示信息：确实要删除这些记录吗?\n"
				+" 测试步骤->6. 点击否按钮\n"
				+" 测试预期->6. 页面跳转回上一页面，所选信息未被删除\n"
;
	}

}

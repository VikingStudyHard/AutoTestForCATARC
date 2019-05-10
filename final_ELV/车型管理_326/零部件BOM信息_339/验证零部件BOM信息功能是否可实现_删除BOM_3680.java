package cn.edu.tju.scs.seql.final_ELV.车型管理_326.零部件BOM信息_339;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3680
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件BOM信息(#339)
 * 用例名称: 验证零部件BOM信息功能是否可实现-删除BOM
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 点击删除BOM按钮
 * 测试预期->1. 出现错误信息：请选择信息！
 * 测试步骤->2. 单击左键选择一条信息，点击删除BOM按钮
 * 测试预期->2. 页面无反应
 * 测试步骤->3. 点击提示消息中的否按钮
 * 测试预期->3. 页面关闭，BOM信息未删除
 * 测试步骤->4. 点击提示消息中的是按钮
 * 测试预期->4. 页面关闭，BOM信息被删除
 * 
 */

public class 验证零部件BOM信息功能是否可实现_删除BOM_3680 extends Selenium_Test_Base {
	
	public 验证零部件BOM信息功能是否可实现_删除BOM_3680(){
		super();
	}
	
	public 验证零部件BOM信息功能是否可实现_删除BOM_3680(WebDriver driver){
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
		getElement(ElementEnum_零部件BOM信息_339.删除键).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件BOM信息_339.未选择信息确定键).click();
		WebDriverConfiguration.operationInterval();

		List<WebElement> eles = getElements(ElementEnum_零部件BOM信息_339.检索结果所有行);
		if (eles.size() == 0)
			return;
		int i;
		for (i = 1; i < eles.size(); i++){
			String s = driver.findElement(By.xpath(ElementEnum_零部件BOM信息_339.检索结果第一行MDS状态.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			if (s.equals("已转换")){
				continue;
			}
			
			driver.findElement(By.xpath(ElementEnum_零部件BOM信息_339.检索结果第一行.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).click();
			break;
		}
		
		if (i == eles.size()){
			Assert.fail("表格中没有能够删除的数据，需要手动添加状态不为已转换的数据");
		}
		
		String name = driver.findElement(By.xpath(ElementEnum_零部件BOM信息_339.检索结果第一行产品名称.getName()
				.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
				//getElement(ElementEnum_零部件BOM信息_339.检索结果第一行产品名称).getText();
		getElement(ElementEnum_零部件BOM信息_339.删除键).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件BOM信息_339.删除节点取消键).click();
		WebDriverConfiguration.operationInterval();
		
		assertTrue(findRow(name));
		
		getElement(ElementEnum_零部件BOM信息_339.删除键).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件BOM信息_339.删除节点确定键).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件BOM信息_339.未选择信息确定键).click();
		WebDriverConfiguration.operationInterval();
		assertFalse(findRow(name), "记录未被删除");
	}
	
	private boolean findRow(String name){
		boolean result = false;
		List<WebElement> eles = getElements(ElementEnum_零部件BOM信息_339.检索结果所有行);
		
		for (int i = 1; i < eles.size(); i++){
			String n = driver.findElement(By.xpath(ElementEnum_零部件BOM信息_339.检索结果第一行产品名称.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			if (n.equals(name)){
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
		return "测试用例id: 3680\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件BOM信息(#339)\n"
				+" 用例名称: 验证零部件BOM信息功能是否可实现-删除BOM\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 点击删除BOM按钮\n"
				+" 测试预期->1. 出现错误信息：请选择信息！\n"
				+" 测试步骤->2. 单击左键选择一条信息，点击删除BOM按钮\n"
				+" 测试预期->2. 页面无反应\n"
				+" 测试步骤->3. 点击提示消息中的否按钮\n"
				+" 测试预期->3. 页面关闭，BOM信息未删除\n"
				+" 测试步骤->4. 点击提示消息中的是按钮\n"
				+" 测试预期->4. 页面关闭，BOM信息被删除\n"
;
	}

}

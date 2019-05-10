package cn.edu.tju.scs.seql.final_ELV.车型管理_326.零部件BOM信息_339;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3692
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件BOM信息(#339)
 * 用例名称: 验证零部件BOM信息功能是否可实现-新增BOM-BOM树形查找操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 单击左键选择一条信息，点击新增BOM按钮
 * 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。
 * 测试步骤->2. 点击树形右上角的更多操作按钮，点击出现的查找树按钮
 * 测试预期->2. 出现新页面，页面为树操作的查找定位，含有可填写的参数信息
 * 测试步骤->3. 点击页面中的查找按钮
 * 测试预期->3. 页面无响应
 * 测试步骤->4. 填写查找参数中的名称为ABS，点击查找
 * 测试预期->4. 页面正常关闭，查找到名称为ABS的节点信息
 * 测试步骤->5. 填写查找参数中的部件号为5.5.1_test，点击查找
 * 测试预期->5. 页面正常关闭，查找到部件号为5.5.1_test的节点信息
 * 测试步骤->6. 填写查找参数中的ID为EM_8_1855506，点击查找
 * 测试预期->6. 页面正常关闭，查找到ID为EM_8_1855506的节点信息
 * 测试步骤->7. 填写查找参数中的名称为ABS，部件号为5.5.1_test，ID为EM_8_1855506，点击查找
 * 测试预期->7. 页面正常关闭，查找到名称为ABS，部件号为5.5.1_test，ID为EM_8_1855506的节点信息
 * 
 */

public class 验证零部件BOM信息功能是否可实现_新增BOM_BOM树形查找操作_3692 extends Selenium_Test_Base {
	
	public 验证零部件BOM信息功能是否可实现_新增BOM_BOM树形查找操作_3692(){
		super();
	}
	
	public 验证零部件BOM信息功能是否可实现_新增BOM_BOM树形查找操作_3692(WebDriver driver){
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
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树键).click();
		WebDriverConfiguration.operationInterval();
		
		String name = "ABS";
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框名称).clear();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框部件号).clear();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框ID编号).clear();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框名称).sendKeys(name);
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框查找键).click();
		WebDriverConfiguration.operationInterval();
		try{
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e){
			assertEquals(getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面节点信息中文名称).getText(), name);
			getElement(ElementEnum_零部件BOM信息_339.返回键).click();
			waitingForLoading();
		}
		
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树键).click();
		WebDriverConfiguration.operationInterval();
		
		String id = "EM_8_1855506";
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框名称).clear();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框部件号).clear();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框ID编号).clear();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框ID编号).sendKeys(id);
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框查找键).click();
		WebDriverConfiguration.operationInterval();
		try{
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e){
			assertEquals(getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面节点信息ID).getText(), id, "没有找到数据或者缺乏未找到弹窗提示");
			getElement(ElementEnum_零部件BOM信息_339.返回键).click();
			waitingForLoading();
		}
		
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树键).click();
		WebDriverConfiguration.operationInterval();
		
		String number = "5.5.1_test";
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框名称).clear();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框部件号).clear();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框ID编号).clear();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框部件号).sendKeys(number);
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框查找键).click();
		WebDriverConfiguration.operationInterval();
		try{
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e){
			assertEquals(getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面节点信息供货编号).getText(), number);
			getElement(ElementEnum_零部件BOM信息_339.返回键).click();
			waitingForLoading();
		}
		
		
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框名称).clear();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框部件号).clear();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框ID编号).clear();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框名称).sendKeys(name);
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框ID编号).sendKeys(id);
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框部件号).sendKeys(number);
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框查找键).click();
		WebDriverConfiguration.operationInterval();
		try{
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e){
			assertEquals(getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面节点信息中文名称).getText(), name);
			assertEquals(getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面节点信息ID).getText(), id);
			assertEquals(getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面节点信息供货编号).getText(), number);
			getElement(ElementEnum_零部件BOM信息_339.返回键).click();
			waitingForLoading();
		}
		
		
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树键).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面查找树框取消键).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树框).getAttribute("class").contains("x-hide-offsets"));
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
		return "测试用例id: 3692\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件BOM信息(#339)\n"
				+" 用例名称: 验证零部件BOM信息功能是否可实现-新增BOM-BOM树形查找操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 单击左键选择一条信息，点击新增BOM按钮\n"
				+" 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。\n"
				+" 测试步骤->2. 点击树形右上角的更多操作按钮，点击出现的查找树按钮\n"
				+" 测试预期->2. 出现新页面，页面为树操作的查找定位，含有可填写的参数信息\n"
				+" 测试步骤->3. 点击页面中的查找按钮\n"
				+" 测试预期->3. 页面无响应\n"
				+" 测试步骤->4. 填写查找参数中的名称为ABS，点击查找\n"
				+" 测试预期->4. 页面正常关闭，查找到名称为ABS的节点信息\n"
				+" 测试步骤->5. 填写查找参数中的部件号为5.5.1_test，点击查找\n"
				+" 测试预期->5. 页面正常关闭，查找到部件号为5.5.1_test的节点信息\n"
				+" 测试步骤->6. 填写查找参数中的ID为EM_8_1855506，点击查找\n"
				+" 测试预期->6. 页面正常关闭，查找到ID为EM_8_1855506的节点信息\n"
				+" 测试步骤->7. 填写查找参数中的名称为ABS，部件号为5.5.1_test，ID为EM_8_1855506，点击查找\n"
				+" 测试预期->7. 页面正常关闭，查找到名称为ABS，部件号为5.5.1_test，ID为EM_8_1855506的节点信息\n"
;
	}

}

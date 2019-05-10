package cn.edu.tju.scs.seql.final_ELV.车型管理_326.零部件BOM信息_339;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3687
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件BOM信息(#339)
 * 用例名称: 验证零部件BOM信息功能是否可实现-修改BOM-BOM树形修改操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 单击左键选择一条信息，点击修改BOM按钮
 * 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。
 * 测试步骤->2. 在根节点条件下点击修改按钮
 * 测试预期->2. 出现提示信息：根节点不允许修改！
 * 测试步骤->3. 在叶子节点条件下点击挂接按钮
 * 测试预期->3. 跳出新页面，页面可修改各项整体匹配的信息。
 * 测试步骤->4. 修改名称和供货编号为空
 * 测试预期->4. 名称和供货编号不可修改
 * 测试步骤->5. 修改质量为20，修改数量为10，责任人为test，点击确定按钮
 * 测试预期->5. 页面被正常关闭，所更改内容更新为修改后信息。
 * 
 */

public class 验证零部件BOM信息功能是否可实现_修改BOM_BOM树形修改操作_3687 extends Selenium_Test_Base {
	
	public 验证零部件BOM信息功能是否可实现_修改BOM_BOM树形修改操作_3687(){
		super();
	}
	
	public 验证零部件BOM信息功能是否可实现_修改BOM_BOM树形修改操作_3687(WebDriver driver){
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
		List<WebElement> eles = getElements(ElementEnum_零部件BOM信息_339.检索结果所有行);
		boolean find = false;
		for (int i = 1; i < eles.size(); i++){
			String mds = driver.findElement(By.xpath(ElementEnum_零部件BOM信息_339.检索结果第一行MDS状态.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			if (mds.equals("编辑中")){
				find = true;
				driver.findElement(By.xpath(ElementEnum_零部件BOM信息_339.检索结果第一行.getName()
						.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).click();
				break;
			}
		}
		
		if (!find){
			Assert.fail("页面中没有mds状态为编辑中的记录");
		}
		else {
			getElement(ElementEnum_零部件BOM信息_339.修改BOM键).click();
			WebDriverConfiguration.operationInterval();
			WebDriverConfiguration.operationInterval();
			
			assertNotNull(getElement(ElementEnum_零部件BOM信息_339.BOM树形标签));
			
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面修改键).click();
			WebDriverConfiguration.operationInterval();
			Assert.fail("网页上弹出根节点修改框，而用例要求根节点不可修改");
			
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增键).click();
			WebDriverConfiguration.operationInterval();
			
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框名称).clear();
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框供货编号).clear();
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框责任人).clear();
			
			String name = "testname";
			String number = "123456";
			String person = "John";
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框名称).sendKeys(name);
			//getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框供货编号).sendKeys(number);
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框责任人).sendKeys(person);
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框确定键).click();
			WebDriverConfiguration.operationInterval();
			try{
				Alert alert = driver.switchTo().alert();
				alert.accept();
			} catch (Exception e){
				Assert.fail("供货编号应是必填项");
			}
			
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框名称).clear();
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框供货编号).clear();
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框责任人).clear();
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框名称).sendKeys(name);
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框供货编号).sendKeys(number);
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框责任人).sendKeys(person);
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框确定键).click();
			WebDriverConfiguration.operationInterval();
			
			List<WebElement> rows = getElements(ElementEnum_零部件BOM信息_339.树形图所有行);
			rows.get(2).click();
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面修改键).click();
			WebDriverConfiguration.operationInterval();
			
			String name2 = "testname1";
			String number2 = "1234567";
			String person2 = "John2";
			String quantity2 = "10";
			String weight2 = "20";
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框名称).clear();
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框供货编号).clear();
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框责任人).clear();
			
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框名称).sendKeys(name2);
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框供货编号).sendKeys(number2);
			//getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框责任人).sendKeys(person2);
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框确定键).click();
			WebDriverConfiguration.operationInterval();
			try{
				Alert alert = driver.switchTo().alert();
				alert.accept();
			} catch (Exception e){
				Assert.fail("名称和供货编号应不可修改");
			}
			
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框名称).clear();
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框供货编号).clear();
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框责任人).clear();
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框质量).clear();
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框数量).clear();
			//getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框名称).sendKeys(name2);
			//getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框供货编号).sendKeys(number2);
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框责任人).sendKeys(person2);
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框质量).sendKeys(weight2);
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框数量).sendKeys(quantity2);
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框确定键).click();
			WebDriverConfiguration.operationInterval();
			
			getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面修改键).click();
			WebDriverConfiguration.operationInterval();
			assertEquals(getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框责任人).getAttribute("value"), person2);
			assertEquals(getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框质量).getAttribute("value"), weight2);
			assertEquals(getElement(ElementEnum_零部件BOM信息_339.新增BOM子页面新增框数量).getAttribute("value"), quantity2);
		}
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
		return "测试用例id: 3687\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件BOM信息(#339)\n"
				+" 用例名称: 验证零部件BOM信息功能是否可实现-修改BOM-BOM树形修改操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 单击左键选择一条信息，点击修改BOM按钮\n"
				+" 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。\n"
				+" 测试步骤->2. 在根节点条件下点击修改按钮\n"
				+" 测试预期->2. 出现提示信息：根节点不允许修改！\n"
				+" 测试步骤->3. 在叶子节点条件下点击挂接按钮\n"
				+" 测试预期->3. 跳出新页面，页面可修改各项整体匹配的信息。\n"
				+" 测试步骤->4. 修改名称和供货编号为空\n"
				+" 测试预期->4. 名称和供货编号不可修改\n"
				+" 测试步骤->5. 修改质量为20，修改数量为10，责任人为test，点击确定按钮\n"
				+" 测试预期->5. 页面被正常关闭，所更改内容更新为修改后信息。\n"
;
	}

}

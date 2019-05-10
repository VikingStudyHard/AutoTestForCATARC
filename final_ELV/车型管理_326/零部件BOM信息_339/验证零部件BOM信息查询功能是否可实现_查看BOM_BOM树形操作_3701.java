package cn.edu.tju.scs.seql.final_ELV.车型管理_326.零部件BOM信息_339;

import static org.testng.Assert.*;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3701
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件BOM信息(#339)
 * 用例名称: 验证零部件BOM信息查询功能是否可实现-查看BOM-BOM树形操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 单击左键选择一条信息，点击查看BOM按钮
 * 测试预期->1. 出现查看车型窗口，含有各项车型BOM信息。
 * 测试步骤->2. 点击BOM树形中的打开树按钮
 * 测试预期->2. BOM树形中的树形图被打开
 * 测试步骤->3. 点击BOM树形中的关闭树按钮
 * 测试预期->3. BOM树形中的树形图被关闭
 * 测试步骤->4. 点击BOM树形中的查找树按钮
 * 测试预期->4. 出现查找树界面
 * 测试步骤->5. 在树操作界面中的名称填写AEPDS5.4.2，点击查找
 * 测试预期->5. 查找到树中中文名称为AEPDS5.4.2的节点信息
 * 测试步骤->6. 在树操作界面中的ID填写CA_8_6820622，点击查找
 * 测试预期->6. 查找到树中ID为CA_8_6820622的节点信息
 * 测试步骤->7. 在树操作界面中的部件号填写AS5.4.3，点击查找
 * 测试预期->7. 查找到树中部件号为AS5.4.3的节点信息
 * 测试步骤->8. 在树操作界面中的名称填写AEPDS5.4.2，点击取消
 * 测试预期->8. 查找页面被正常关闭，其余正常显示
 * 
 */

public class 验证零部件BOM信息查询功能是否可实现_查看BOM_BOM树形操作_3701 extends Selenium_Test_Base {
	
	public 验证零部件BOM信息查询功能是否可实现_查看BOM_BOM树形操作_3701(){
		super();
	}
	
	public 验证零部件BOM信息查询功能是否可实现_查看BOM_BOM树形操作_3701(WebDriver driver){
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
		if (eles.size() == 0)
			return;
		for (int i = 1; i < eles.size(); i++){
			driver.findElement(By.xpath(ElementEnum_零部件BOM信息_339.检索结果第一行.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).click();
			getElement(ElementEnum_零部件BOM信息_339.查看BOM键).click();
			WebDriverConfiguration.operationInterval();
			
			String attClass = getElement(ElementEnum_零部件BOM信息_339.树形图根节点左侧加号).getAttribute("class");
			String[] atts = attClass.split(" ");
			boolean canExpand = false;
			for (String att : atts){
				if (att.equals("x-tree-expander")){
					canExpand = true;
					break;
				}
			}
			
			if (canExpand){
				List<WebElement> rows = getElements(ElementEnum_零部件BOM信息_339.树形图所有行);
				if (rows.size() > 2){
					getElement(ElementEnum_零部件BOM信息_339.树形图根节点左侧加号).click();
					WebDriverConfiguration.operationInterval();
				}
				
				getElement(ElementEnum_零部件BOM信息_339.树形图根节点左侧加号).click();
				WebDriverConfiguration.operationInterval();
				rows = getElements(ElementEnum_零部件BOM信息_339.树形图所有行);
				assertTrue(rows.size() > 2);
				
				getElement(ElementEnum_零部件BOM信息_339.树形图根节点左侧加号).click();
				WebDriverConfiguration.operationInterval();
				rows = getElements(ElementEnum_零部件BOM信息_339.树形图所有行);
				assertTrue(rows.size() == 2);
				
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树键).click();
				WebDriverConfiguration.operationInterval();
				
				String name = "AEPDS5.4.2";
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树框名称).clear();
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树框部件号).clear();
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树框ID编号).clear();
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树框名称).sendKeys(name);
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树框查找键).click();
				WebDriverConfiguration.operationInterval();
				try{
					Alert alert = driver.switchTo().alert();
					alert.accept();
				} catch (NoAlertPresentException e){
					assertEquals(getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面节点信息中文名称).getText(), name);
					getElement(ElementEnum_零部件BOM信息_339.返回键).click();
					waitingForLoading();
				}
				
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树键).click();
				WebDriverConfiguration.operationInterval();
				
				String id = "CA_8_6820622";
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树框名称).clear();
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树框部件号).clear();
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树框ID编号).clear();
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树框ID编号).sendKeys(id);
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树框查找键).click();
				WebDriverConfiguration.operationInterval();
				try{
					Alert alert = driver.switchTo().alert();
					alert.accept();
				} catch (NoAlertPresentException e){
					assertEquals(getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面节点信息ID).getText(), id);
					getElement(ElementEnum_零部件BOM信息_339.返回键).click();
					waitingForLoading();
				}
				
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树键).click();
				WebDriverConfiguration.operationInterval();
				
				String number = "CA_8_6820622";
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树框名称).clear();
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树框部件号).clear();
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树框ID编号).clear();
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树框部件号).sendKeys(number);
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树框查找键).click();
				WebDriverConfiguration.operationInterval();
				try{
					Alert alert = driver.switchTo().alert();
					alert.accept();
				} catch (NoAlertPresentException e){
					assertEquals(getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面节点信息供货编号).getText(), number);
					getElement(ElementEnum_零部件BOM信息_339.返回键).click();
					waitingForLoading();
				}
				
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树键).click();
				WebDriverConfiguration.operationInterval();
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树框取消键).click();
				WebDriverConfiguration.operationInterval();
				assertTrue(getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面查找树框).getAttribute("class").contains("x-hide-offsets"));
				
				break;
			}
			
			getElement(ElementEnum_零部件BOM信息_339.返回键).click();
			waitingForLoading();
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
		return "测试用例id: 3701\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件BOM信息(#339)\n"
				+" 用例名称: 验证零部件BOM信息查询功能是否可实现-查看BOM-BOM树形操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 单击左键选择一条信息，点击查看BOM按钮\n"
				+" 测试预期->1. 出现查看车型窗口，含有各项车型BOM信息。\n"
				+" 测试步骤->2. 点击BOM树形中的打开树按钮\n"
				+" 测试预期->2. BOM树形中的树形图被打开\n"
				+" 测试步骤->3. 点击BOM树形中的关闭树按钮\n"
				+" 测试预期->3. BOM树形中的树形图被关闭\n"
				+" 测试步骤->4. 点击BOM树形中的查找树按钮\n"
				+" 测试预期->4. 出现查找树界面\n"
				+" 测试步骤->5. 在树操作界面中的名称填写AEPDS5.4.2，点击查找\n"
				+" 测试预期->5. 查找到树中中文名称为AEPDS5.4.2的节点信息\n"
				+" 测试步骤->6. 在树操作界面中的ID填写CA_8_6820622，点击查找\n"
				+" 测试预期->6. 查找到树中ID为CA_8_6820622的节点信息\n"
				+" 测试步骤->7. 在树操作界面中的部件号填写AS5.4.3，点击查找\n"
				+" 测试预期->7. 查找到树中部件号为AS5.4.3的节点信息\n"
				+" 测试步骤->8. 在树操作界面中的名称填写AEPDS5.4.2，点击取消\n"
				+" 测试预期->8. 查找页面被正常关闭，其余正常显示\n"
;
	}

}

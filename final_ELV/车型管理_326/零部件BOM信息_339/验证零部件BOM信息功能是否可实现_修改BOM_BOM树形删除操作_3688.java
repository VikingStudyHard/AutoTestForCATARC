package cn.edu.tju.scs.seql.final_ELV.车型管理_326.零部件BOM信息_339;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3688
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件BOM信息(#339)
 * 用例名称: 验证零部件BOM信息功能是否可实现-修改BOM-BOM树形删除操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 在根节点上点击删除按钮
 * 测试预期->1. 出现信息提示：根节点不允许删除！
 * 测试步骤->2. 在叶子节点上点击删除按钮
 * 测试预期->2. 出现提示信息：确定删除节点：新增节点(11)？
 * 测试步骤->3. 点击提示信息的否按钮
 * 测试预期->3. 叶子节点并未被删除
 * 测试步骤->4. 在叶子节点上点击删除按钮
 * 测试预期->4. 出现提示信息：确定删除节点：新增节点(11)？
 * 测试步骤->5. 点击提示信息的是按钮
 * 测试预期->5. 叶子节点被删除
 * 
 */

public class 验证零部件BOM信息功能是否可实现_修改BOM_BOM树形删除操作_3688 extends Selenium_Test_Base {
	
	public 验证零部件BOM信息功能是否可实现_修改BOM_BOM树形删除操作_3688(){
		super();
	}
	
	public 验证零部件BOM信息功能是否可实现_修改BOM_BOM树形删除操作_3688(WebDriver driver){
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
			String s = driver.findElement(By.xpath(ElementEnum_零部件BOM信息_339.检索结果第一行MDS状态.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			if (s.equals("已转换")){
				continue;
			}
			
			driver.findElement(By.xpath(ElementEnum_零部件BOM信息_339.检索结果第一行.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).click();
			getElement(ElementEnum_零部件BOM信息_339.修改BOM键).click();
			WebDriverConfiguration.operationInterval();
			
			try{
				Alert alert = driver.switchTo().alert();
				alert.accept();
				continue;
			} catch (Exception e){
				
			}
			
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
				rows.get(2).click();
				String name = rows.get(2).getText();
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
				
				break;
			}
			
			getElement(ElementEnum_零部件BOM信息_339.返回键).click();
			waitingForLoading();
		}
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
		return "测试用例id: 3688\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件BOM信息(#339)\n"
				+" 用例名称: 验证零部件BOM信息功能是否可实现-修改BOM-BOM树形删除操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 在根节点上点击删除按钮\n"
				+" 测试预期->1. 出现信息提示：根节点不允许删除！\n"
				+" 测试步骤->2. 在叶子节点上点击删除按钮\n"
				+" 测试预期->2. 出现提示信息：确定删除节点：新增节点(11)？\n"
				+" 测试步骤->3. 点击提示信息的否按钮\n"
				+" 测试预期->3. 叶子节点并未被删除\n"
				+" 测试步骤->4. 在叶子节点上点击删除按钮\n"
				+" 测试预期->4. 出现提示信息：确定删除节点：新增节点(11)？\n"
				+" 测试步骤->5. 点击提示信息的是按钮\n"
				+" 测试预期->5. 叶子节点被删除\n"
;
	}

}

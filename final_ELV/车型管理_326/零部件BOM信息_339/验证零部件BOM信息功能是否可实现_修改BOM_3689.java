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
 * 测试用例id: 3689
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件BOM信息(#339)
 * 用例名称: 验证零部件BOM信息功能是否可实现-修改BOM
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 点击修改BOM按钮
 * 测试预期->1. 出现错误信息：请选择信息！
 * 测试步骤->2. 单击左键选择一条MDS状态一栏为已转换的信息，点击修改BOM按钮
 * 测试预期->2. 出现修改失败提示信息：不能修改已转换的零部件
 * 测试步骤->3. 单击左键选择一条MDS状态一栏为编辑中的信息，点击修改BOM按钮
 * 测试预期->3. 出现查看BOM窗口，含有各项车型BOM信息。
 * 
 */

public class 验证零部件BOM信息功能是否可实现_修改BOM_3689 extends Selenium_Test_Base {
	
	public 验证零部件BOM信息功能是否可实现_修改BOM_3689(){
		super();
	}
	
	public 验证零部件BOM信息功能是否可实现_修改BOM_3689(WebDriver driver){
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
		getElement(ElementEnum_零部件BOM信息_339.修改BOM键).click();
		WebDriverConfiguration.operationInterval();
		boolean isShown = !getElement(ElementEnum_零部件BOM信息_339.修改未选择错误提示).getAttribute("class")
			.contains("x-hide-offsets");
		assertTrue(isShown);
		getElement(ElementEnum_零部件BOM信息_339.修改未选择错误提示确定键).click();
		WebDriverConfiguration.operationInterval();
		
		List<WebElement> eles = getElements(ElementEnum_零部件BOM信息_339.检索结果所有行);
		if (eles.size() == 0)
			return;
		boolean find = false;
		for (int i = 1; i < eles.size(); i++){
			String mds = driver.findElement(By.xpath(ElementEnum_零部件BOM信息_339.检索结果第一行MDS状态.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			if (mds.equals("已转换")){
				find = true;
				driver.findElement(By.xpath(ElementEnum_零部件BOM信息_339.检索结果第一行.getName()
						.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).click();
				break;
			}
		}
		
		if (!find){
			Assert.fail("页面中没有mds状态为已转换的记录");
		}
		else {
			getElement(ElementEnum_零部件BOM信息_339.修改BOM键).click();
			WebDriverConfiguration.operationInterval();
			
			isShown = !getElement(ElementEnum_零部件BOM信息_339.修改未选择错误提示).getAttribute("class")
					.contains("x-hide-offsets");
				assertTrue(isShown);
			getElement(ElementEnum_零部件BOM信息_339.修改未选择错误提示确定键).click();
			WebDriverConfiguration.operationInterval();
		}
		
		find = false;
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
		}
	}

	
	public String getDescription(){
		return "测试用例id: 3689\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件BOM信息(#339)\n"
				+" 用例名称: 验证零部件BOM信息功能是否可实现-修改BOM\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 点击修改BOM按钮\n"
				+" 测试预期->1. 出现错误信息：请选择信息！\n"
				+" 测试步骤->2. 单击左键选择一条MDS状态一栏为已转换的信息，点击修改BOM按钮\n"
				+" 测试预期->2. 出现修改失败提示信息：不能修改已转换的零部件\n"
				+" 测试步骤->3. 单击左键选择一条MDS状态一栏为编辑中的信息，点击修改BOM按钮\n"
				+" 测试预期->3. 出现查看BOM窗口，含有各项车型BOM信息。\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.综合分析_327.进展报表统计_344;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4076
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 进展报表统计(#344)
 * 用例名称: 验证进展报表统计查看车型两率功能是否可实现-正常操作
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 点击进展报表统计的车型信息版面中的查看车型两率按钮
 * 测试预期->1. 出现提示信息：请选择一条记录
 * 测试步骤->2. 单击左键选择一条车型信息，点击查看车型两率按钮
 * 测试预期->2. 跳出新页面，页面名称为查看车型两率，含有该车型两率的各项信息内容，含有已填写的参数信息
 * 测试步骤->3. 点击新页面右下角的关闭按钮
 * 测试预期->3. 查看车型两率页面被正常关闭，页面回到进展报表统计首页
 * 
 */

public class 验证进展报表统计查看车型两率功能是否可实现_正常操作_4076 extends Selenium_Test_Base {
	
	public 验证进展报表统计查看车型两率功能是否可实现_正常操作_4076(){
		super();
	}
	
	public 验证进展报表统计查看车型两率功能是否可实现_正常操作_4076(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_进展报表统计_344.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_进展报表统计_344.rightFrame);
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
		getElement(ElementEnum_进展报表统计_344.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_进展报表统计_344.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_进展报表统计_344.查看车型两率按钮).click();
		assertEquals("请选择一条记录", getElement(ElementEnum_进展报表统计_344.未选择记录提示).getText());
		getElement(ElementEnum_进展报表统计_344.提示窗口确定按钮).click();
		
		List<WebElement> l = getElements(ElementEnum_进展报表统计_344.表格所有项);
		int i;
		String xpath = null;
		for (i = 0; i < l.size(); i++){
			String x = ElementEnum_进展报表统计_344.表格第一行BOM.getName().replaceAll("tr\\[2\\]", "tr[" + (i + 2) + "]");
			if (driver.findElement(By.xpath(x)).getText().equals("是")){
				xpath = ElementEnum_进展报表统计_344.表格第一行.getName().replaceAll("tr\\[2\\]", "tr[" + (i + 2) + "]");
				driver.findElement(By.xpath(xpath)).click();
				getElement(ElementEnum_进展报表统计_344.查看车型两率按钮).click();
				WebDriverConfiguration.operationInterval();
				
				WebElement error = getElement(ElementEnum_进展报表统计_344.错误提示框);
				if (error.getAttribute("class").contains("x-hide-offsets")){
					break;
				}
				getElement(ElementEnum_进展报表统计_344.提示窗口确定按钮).click();
				WebDriverConfiguration.operationInterval();
			}
		}
		
		//String xpath = ElementEnum_进展报表统计_344.表格第一行.getName().replaceAll("tr\\[2\\]", "tr[" + (i + 2) + "]");
		//driver.findElement(By.xpath(xpath)).click();
		//getElement(ElementEnum_进展报表统计_344.查看车型两率按钮).click();
		assertNotEquals("", getElement(ElementEnum_进展报表统计_344.两率_车型中文).getAttribute("value"));
		assertNotEquals("", getElement(ElementEnum_进展报表统计_344.两率_车型英文).getAttribute("value"));
		String fillRate = getElement(ElementEnum_进展报表统计_344.填报率).getAttribute("value");
		String checkRate = getElement(ElementEnum_进展报表统计_344.审核率).getAttribute("value");
		char c = fillRate.toCharArray()[fillRate.length() - 1];
		Double fillRateDouble = Double.valueOf(fillRate.substring(0, fillRate.length() - 1));
		assertEquals('%', c);
		assertNotNull(fillRateDouble);
		assertTrue(fillRateDouble >= 0.0);
		assertTrue(fillRateDouble <= 100.0);
		c = checkRate.toCharArray()[checkRate.length() - 1];
		Double checkRateDouble = Double.valueOf(checkRate.substring(0, checkRate.length() - 1));
		assertEquals('%', c);
		assertNotNull(checkRateDouble);
		assertTrue(checkRateDouble >= 0.0);
		assertTrue(checkRateDouble <= 100.0);
		
		getElement(ElementEnum_进展报表统计_344.两率_关闭按钮).click();
	}

	
	public String getDescription(){
		return "测试用例id: 4076\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 进展报表统计(#344)\n"
				+" 用例名称: 验证进展报表统计查看车型两率功能是否可实现-正常操作\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 点击进展报表统计的车型信息版面中的查看车型两率按钮\n"
				+" 测试预期->1. 出现提示信息：请选择一条记录\n"
				+" 测试步骤->2. 单击左键选择一条车型信息，点击查看车型两率按钮\n"
				+" 测试预期->2. 跳出新页面，页面名称为查看车型两率，含有该车型两率的各项信息内容，含有已填写的参数信息\n"
				+" 测试步骤->3. 点击新页面右下角的关闭按钮\n"
				+" 测试预期->3. 查看车型两率页面被正常关闭，页面回到进展报表统计首页\n"
;
	}

}

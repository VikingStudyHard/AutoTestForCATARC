package cn.edu.tju.scs.seql.final_ELV.综合分析_327.进展报表统计_344;

import static org.testng.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4078
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 进展报表统计(#344)
 * 用例名称: 验证进展报表统计查看车型所属部门的两率清单功能是否可实现-正常操作
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 点击进展报表统计的车型信息版面中的查看车型所属部门的两率清单按钮
 * 测试预期->1. 出现提示信息：请选择一条记录
 * 测试步骤->2. 单击左键选择一条车型信息，点击查看车型所属部门的两率清单按钮
 * 测试预期->2. 跳出新页面，页面为车型所属部门和部门审核率填报率信息，含有该车型两率的各项信息内容，含有已填写的参数信息
 * 测试步骤->3. 点击新页面右上角的返回按钮
 * 测试预期->3. 查看车型两率页面被正常关闭，页面回到进展报表统计首页
 * 
 */

public class 验证进展报表统计查看车型所属部门的两率清单功能是否可实现_正常操作_4078 extends Selenium_Test_Base {
	
	public 验证进展报表统计查看车型所属部门的两率清单功能是否可实现_正常操作_4078(){
		super();
	}
	
	public 验证进展报表统计查看车型所属部门的两率清单功能是否可实现_正常操作_4078(WebDriver driver){
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
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		getElement(ElementEnum_进展报表统计_344.查看车型所属部门的两率清单).click();
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
				getElement(ElementEnum_进展报表统计_344.查看车型所属部门的两率清单).click();
				WebDriverConfiguration.operationInterval();
				
				WebElement error = getElement(ElementEnum_进展报表统计_344.错误提示框);
				if (error == null || error.getAttribute("class").contains("x-hide-offsets")){
					break;
				}
				getElement(ElementEnum_进展报表统计_344.提示窗口确定按钮).click();
				WebDriverConfiguration.operationInterval();
			}
		}
		
		//String xpath = ElementEnum_进展报表统计_344.表格第一行.getName().replaceAll("tr\\[2\\]", "tr[" + (i + 2) + "]");
		//driver.findElement(By.xpath(xpath)).click();
		//getElement(ElementEnum_进展报表统计_344.查看车型所属部门的两率清单).click();
		
		List<WebElement> eles = getElements(ElementEnum_进展报表统计_344.总部门);
		
		assertTrue(eles.size() != 0);
		
		//Assert.fail("该页面没有返回按钮");
	}

	
	public String getDescription(){
		return "测试用例id: 4078\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 进展报表统计(#344)\n"
				+" 用例名称: 验证进展报表统计查看车型所属部门的两率清单功能是否可实现-正常操作\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 点击进展报表统计的车型信息版面中的查看车型所属部门的两率清单按钮\n"
				+" 测试预期->1. 出现提示信息：请选择一条记录\n"
				+" 测试步骤->2. 单击左键选择一条车型信息，点击查看车型所属部门的两率清单按钮\n"
				+" 测试预期->2. 跳出新页面，页面为车型所属部门和部门审核率填报率信息，含有该车型两率的各项信息内容，含有已填写的参数信息\n"
				+" 测试步骤->3. 点击新页面右上角的返回按钮\n"
				+" 测试预期->3. 查看车型两率页面被正常关闭，页面回到进展报表统计首页\n"
;
	}

}

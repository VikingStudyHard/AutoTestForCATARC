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
 * 测试用例id: 4079
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 进展报表统计(#344)
 * 用例名称: 验证进展报表统计查看车型所属部门的两率清单功能是否可实现-内部操作-树形图
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 单击左键选择一条车型信息，点击查看车型所属部门的两率清单按钮
 * 测试预期->1. 跳出新页面，页面为车型所属部门和部门审核率填报率信息，含有该车型两率的各项信息内容，含有已填写的参数信息
 * 测试步骤->2. 点击树形图界面右上角的刷新按钮
 * 测试预期->2. 树形图页面被刷新
 * 测试步骤->3. 点击树形图界面右上角的打开树按钮
 * 测试预期->3. 树形图页面被展开
 * 测试步骤->4. 点击树形图界面右上角的关闭树按钮
 * 测试预期->4. 树形图页面被关闭
 * 测试步骤->5. 点击树形图界面母树左侧的加号键
 * 测试预期->5. 树形图页面被展开
 * 测试步骤->6. 点击树形图界面母树左侧的减号键
 * 测试预期->6. 树形图页面被关闭
 * 
 */

public class 验证进展报表统计查看车型所属部门的两率清单功能是否可实现_内部操作_树形图_4079 extends Selenium_Test_Base {
	
	public 验证进展报表统计查看车型所属部门的两率清单功能是否可实现_内部操作_树形图_4079(){
		super();
	}
	
	public 验证进展报表统计查看车型所属部门的两率清单功能是否可实现_内部操作_树形图_4079(WebDriver driver){
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
		WebDriverConfiguration.operationInterval();
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
		String oldId = getElement(ElementEnum_进展报表统计_344.总部门).getAttribute("id");
		getElement(ElementEnum_进展报表统计_344.刷新).click();
		String newId = getElement(ElementEnum_进展报表统计_344.总部门).getAttribute("id");
		assertEquals(oldId, newId); //如果刷新成功，列表里的项会被分配与原来不同的id
		getElement(ElementEnum_进展报表统计_344.打开树按钮).click();
		WebDriverConfiguration.operationInterval();
		int number = getElements(ElementEnum_进展报表统计_344.树图所有项).size() - 1;
		assertTrue(number > 1, "树展开失败");
		getElement(ElementEnum_进展报表统计_344.关闭树按钮).click();
		WebDriverConfiguration.operationInterval();
		number = getElements(ElementEnum_进展报表统计_344.树图所有项).size() - 1;
		assertTrue(number == 1);
	}

	
	public String getDescription(){
		return "测试用例id: 4079\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 进展报表统计(#344)\n"
				+" 用例名称: 验证进展报表统计查看车型所属部门的两率清单功能是否可实现-内部操作-树形图\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 单击左键选择一条车型信息，点击查看车型所属部门的两率清单按钮\n"
				+" 测试预期->1. 跳出新页面，页面为车型所属部门和部门审核率填报率信息，含有该车型两率的各项信息内容，含有已填写的参数信息\n"
				+" 测试步骤->2. 点击树形图界面右上角的刷新按钮\n"
				+" 测试预期->2. 树形图页面被刷新\n"
				+" 测试步骤->3. 点击树形图界面右上角的打开树按钮\n"
				+" 测试预期->3. 树形图页面被展开\n"
				+" 测试步骤->4. 点击树形图界面右上角的关闭树按钮\n"
				+" 测试预期->4. 树形图页面被关闭\n"
				+" 测试步骤->5. 点击树形图界面母树左侧的加号键\n"
				+" 测试预期->5. 树形图页面被展开\n"
				+" 测试步骤->6. 点击树形图界面母树左侧的减号键\n"
				+" 测试预期->6. 树形图页面被关闭\n"
;
	}

}

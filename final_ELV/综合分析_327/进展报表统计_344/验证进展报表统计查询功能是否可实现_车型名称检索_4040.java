package cn.edu.tju.scs.seql.final_ELV.综合分析_327.进展报表统计_344;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.有害物质分析_342.ElementEnum_有害物质分析_342;

/**
 * 测试用例id: 4040
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 进展报表统计(#344)
 * 用例名称: 验证进展报表统计查询功能是否可实现-车型名称检索 
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 在进展报表统计的查询条件：车型名称中填写1，点击检索按钮
 * 测试预期->1. 无符合条件的信息被检索出
 * 测试步骤->2. 在进展报表统计的查询条件：车型名称中填写ELVT，点击检索按钮
 * 测试预期->2. 无符合条件的信息被检索出
 * 测试步骤->3. 在进展报表统计的查询条件：车型名称中填写ELVTEST，点击检索按钮
 * 测试预期->3. 车型名称（中文或英文）名称中为ELVTEST的所有进展报表统计信息被检索出来
 * 
 */

public class 验证进展报表统计查询功能是否可实现_车型名称检索_4040 extends Selenium_Test_Base {
	
	public 验证进展报表统计查询功能是否可实现_车型名称检索_4040(){
		super();
	}
	
	public 验证进展报表统计查询功能是否可实现_车型名称检索_4040(WebDriver driver){
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
		query("1");
		query("ELVT");
		query("ELVTEST");
	}
	
	private void query(String word){
		getElement(ElementEnum_进展报表统计_344.车型名称查询).clear();
		getElement(ElementEnum_进展报表统计_344.车型名称查询).sendKeys(word);
		getElement(ElementEnum_进展报表统计_344.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		List<WebElement> eles = getElements(ElementEnum_进展报表统计_344.表格所有项);
		if (eles.size() == 0)
			return;
		for (int i = 1; i < eles.size(); i++){
			String cname = driver.findElement(By.xpath(ElementEnum_进展报表统计_344.表格第一行车型中文名称.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			String ename = driver.findElement(By.xpath(ElementEnum_进展报表统计_344.表格第一行车型英文名称.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			assertTrue(cname.equals(word) || ename.equals(word));
			//assertTrue(cname.contains(word) || ename.contains(word));
		}
	}

	
	public String getDescription(){
		return "测试用例id: 4040\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 进展报表统计(#344)\n"
				+" 用例名称: 验证进展报表统计查询功能是否可实现-车型名称检索 \n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 在进展报表统计的查询条件：车型名称中填写1，点击检索按钮\n"
				+" 测试预期->1. 无符合条件的信息被检索出\n"
				+" 测试步骤->2. 在进展报表统计的查询条件：车型名称中填写ELVT，点击检索按钮\n"
				+" 测试预期->2. 无符合条件的信息被检索出\n"
				+" 测试步骤->3. 在进展报表统计的查询条件：车型名称中填写ELVTEST，点击检索按钮\n"
				+" 测试预期->3. 车型名称（中文或英文）名称中为ELVTEST的所有进展报表统计信息被检索出来\n"
;
	}

}

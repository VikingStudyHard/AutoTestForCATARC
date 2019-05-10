package cn.edu.tju.scs.seql.final_ELV.综合分析_327.进展报表统计_344;

import static org.testng.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4039
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 进展报表统计(#344)
 * 用例名称: 验证进展报表统计查询功能是否可实现-创建时间检索
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 在进展报表统计的查询条件：创建时间从2016-03-08开始，点击检索按钮
 * 测试预期->1. 检索出创建时间为2016-03-08之后的所有进展报表统计信息。
 * 测试步骤->2. 在进展报表统计的查询条件：创建时间2016-04-08结束，点击检索按钮
 * 测试预期->2. 检索出创建时间为2016-04-08之前的所有进展报表统计信息。
 * 测试步骤->3. 在进展报表统计的查询条件：创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮
 * 测试预期->3. 检索出创建时间为2016-03-08到2016-04-11的所有进展报表统计信息。
 * 测试步骤->4. 在进展报表统计的查询条件：创建时间从2016-04-08开始，到2016-03-11结束，点击检索按钮
 * 测试预期->4. 出现错误提示：开始时间早于结束时间!
 * 
 */

public class 验证进展报表统计查询功能是否可实现_创建时间检索_4039 extends Selenium_Test_Base {
	
	public 验证进展报表统计查询功能是否可实现_创建时间检索_4039(){
		super();
	}
	
	public 验证进展报表统计查询功能是否可实现_创建时间检索_4039(WebDriver driver){
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
		query("2013-03-08", null);
		query(null, "2013-04-08");
		query("2013-03-08", "2013-04-11");
		query("2013-04-11", "2013-03-08");
	}
	
	private void query(String start, String end){
		((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('readonly')", getElement(ElementEnum_进展报表统计_344.创建时间起始));
		((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('readonly')", getElement(ElementEnum_进展报表统计_344.创建时间截止));
		getElement(ElementEnum_进展报表统计_344.创建时间起始).clear();
		getElement(ElementEnum_进展报表统计_344.创建时间截止).clear();
		Calendar startTime = null;
		Calendar endTime = null;
		if (start != null){
			getElement(ElementEnum_进展报表统计_344.创建时间起始).sendKeys(start);
			String[] t = start.split("-");
			//System.out.println(t[0] + " " + t[1] + " " + t[2]);
			startTime = Calendar.getInstance();
			startTime.set(Integer.valueOf(t[0]), Integer.valueOf(t[1]), Integer.valueOf(t[2]));
		}
		if (end != null){
			getElement(ElementEnum_进展报表统计_344.创建时间截止).sendKeys(end);
			String[] t = end.split("-");
			//System.out.println(t[0] + " " + t[1] + " " + t[2]);
			endTime = Calendar.getInstance();
			endTime.set(Integer.valueOf(t[0]), Integer.valueOf(t[1]), Integer.valueOf(t[2]));
		}
		getElement(ElementEnum_进展报表统计_344.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		if (startTime != null && endTime != null && startTime.compareTo(endTime) > 0){
			String text = getElement(ElementEnum_进展报表统计_344.时间错误提示).getText();
			assertEquals(text, "查询的开始时间不能大于截止时间");
			WebDriverConfiguration.operationInterval();
			getElement(ElementEnum_进展报表统计_344.时间错误提示确定键).click();
			return;
		}
		
		List<WebElement> eles = getElements(ElementEnum_进展报表统计_344.表格所有项);
		if (eles.size() == 0)
			return;
		for (int i = 1; i < eles.size(); i++){
			String time = driver.findElement(By.xpath(ElementEnum_进展报表统计_344.表格第一行时间.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			String[] t = time.split("-");
			Calendar currentTime = Calendar.getInstance();
			currentTime.set(Integer.valueOf(t[0]), Integer.valueOf(t[1]), Integer.valueOf(t[2]));
			if (startTime != null){
				assertTrue(currentTime.compareTo(startTime) >= 0);
			}
			if (endTime != null){
				assertTrue(currentTime.compareTo(endTime) <= 0);
			}
		}
	}

	
	public String getDescription(){
		return "测试用例id: 4039\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 进展报表统计(#344)\n"
				+" 用例名称: 验证进展报表统计查询功能是否可实现-创建时间检索\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 在进展报表统计的查询条件：创建时间从2016-03-08开始，点击检索按钮\n"
				+" 测试预期->1. 检索出创建时间为2016-03-08之后的所有进展报表统计信息。\n"
				+" 测试步骤->2. 在进展报表统计的查询条件：创建时间2016-04-08结束，点击检索按钮\n"
				+" 测试预期->2. 检索出创建时间为2016-04-08之前的所有进展报表统计信息。\n"
				+" 测试步骤->3. 在进展报表统计的查询条件：创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮\n"
				+" 测试预期->3. 检索出创建时间为2016-03-08到2016-04-11的所有进展报表统计信息。\n"
				+" 测试步骤->4. 在进展报表统计的查询条件：创建时间从2016-04-08开始，到2016-03-11结束，点击检索按钮\n"
				+" 测试预期->4. 出现错误提示：开始时间早于结束时间!\n"
;
	}

}

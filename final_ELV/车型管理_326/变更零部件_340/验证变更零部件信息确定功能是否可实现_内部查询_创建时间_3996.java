package cn.edu.tju.scs.seql.final_ELV.车型管理_326.变更零部件_340;

import static org.testng.Assert.*;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.进展报表统计_344.ElementEnum_进展报表统计_344;

/**
 * 测试用例id: 3996
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 变更零部件(#340)
 * 用例名称: 验证变更零部件信息确定功能是否可实现-内部查询-创建时间
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 在变更零部件信息的查询条件：创建时间从2016-03-08开始，点击检索按钮
 * 测试预期->1. 检索出创建时间为2016-03-08之后的所有变更零部件信息。
 * 测试步骤->2. 在变更零部件信息的查询条件：创建时间2016-04-08结束，点击检索按钮
 * 测试预期->2. 检索出创建时间为2016-04-08之前的所有变更零部件信息。
 * 测试步骤->3. 在变更零部件信息的查询条件：创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮
 * 测试预期->3. 检索出创建时间为2016-03-08到2016-04-11的所有变更零部件信息。
 * 测试步骤->4. 在变更零部件信息的查询条件：创建时间从2016-04-08开始，到2016-03-11结束，点击检索按钮
 * 测试预期->4. 出现错误提示：开始时间早于结束时间!
 * 
 */

public class 验证变更零部件信息确定功能是否可实现_内部查询_创建时间_3996 extends Selenium_Test_Base {
	
	public 验证变更零部件信息确定功能是否可实现_内部查询_创建时间_3996(){
		super();
	}
	
	public 验证变更零部件信息确定功能是否可实现_内部查询_创建时间_3996(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_变更零部件_340.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_变更零部件_340.rightFrame);
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
		getElement(ElementEnum_变更零部件_340.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_变更零部件_340.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_变更零部件_340.表格第一行).click();
		getElement(ElementEnum_变更零部件_340.确定按钮).click();
		WebDriverConfiguration.operationInterval();
		
		query("2013-03-08", null);
		query(null, "2013-04-08");
		query("2013-03-08", "2013-04-11");
		query("2013-04-11", "2013-03-08");
	}
	
	private void query(String start, String end){
		((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('readonly')", 
				getElement(ElementEnum_变更零部件_340.子页面创建时间起始));
		((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('readonly')", 
				getElement(ElementEnum_变更零部件_340.子页面创建时间截止));
		getElement(ElementEnum_变更零部件_340.子页面创建时间起始).clear();
		getElement(ElementEnum_变更零部件_340.子页面创建时间截止).clear();
		Calendar startTime = null;
		Calendar endTime = null;
		if (start != null){
			getElement(ElementEnum_变更零部件_340.子页面创建时间起始).sendKeys(start);
			String[] t = start.split("-");
			//System.out.println(t[0] + " " + t[1] + " " + t[2]);
			startTime = Calendar.getInstance();
			startTime.set(Integer.valueOf(t[0]), Integer.valueOf(t[1]), Integer.valueOf(t[2]));
		}
		if (end != null){
			getElement(ElementEnum_变更零部件_340.子页面创建时间截止).sendKeys(end);
			String[] t = end.split("-");
			//System.out.println(t[0] + " " + t[1] + " " + t[2]);
			endTime = Calendar.getInstance();
			endTime.set(Integer.valueOf(t[0]), Integer.valueOf(t[1]), Integer.valueOf(t[2]));
		}
		getElement(ElementEnum_变更零部件_340.子页面检索按钮).click();
		WebDriverConfiguration.operationInterval();
		if (startTime != null && endTime != null && startTime.compareTo(endTime) > 0){
			String text = getElement(ElementEnum_变更零部件_340.子页面时间错误提示).getText();
			assertEquals(text, "开始时间早于结束时间!");
			WebDriverConfiguration.operationInterval();
			getElement(ElementEnum_变更零部件_340.子页面时间错误提示确定键).click();
			return;
		}
		List<WebElement> eles = getElements(ElementEnum_变更零部件_340.检索结果所有行);
		if (eles.size() == 0)
			return;
		for (int i = 1; i < eles.size(); i++){
			String time = driver.findElement(By.xpath(ElementEnum_变更零部件_340.检索结果第一行时间.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			time = time.split(" ")[0];
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
		return "测试用例id: 3996\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 变更零部件(#340)\n"
				+" 用例名称: 验证变更零部件信息确定功能是否可实现-内部查询-创建时间\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 在变更零部件信息的查询条件：创建时间从2016-03-08开始，点击检索按钮\n"
				+" 测试预期->1. 检索出创建时间为2016-03-08之后的所有变更零部件信息。\n"
				+" 测试步骤->2. 在变更零部件信息的查询条件：创建时间2016-04-08结束，点击检索按钮\n"
				+" 测试预期->2. 检索出创建时间为2016-04-08之前的所有变更零部件信息。\n"
				+" 测试步骤->3. 在变更零部件信息的查询条件：创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮\n"
				+" 测试预期->3. 检索出创建时间为2016-03-08到2016-04-11的所有变更零部件信息。\n"
				+" 测试步骤->4. 在变更零部件信息的查询条件：创建时间从2016-04-08开始，到2016-03-11结束，点击检索按钮\n"
				+" 测试预期->4. 出现错误提示：开始时间早于结束时间!\n"
;
	}

}

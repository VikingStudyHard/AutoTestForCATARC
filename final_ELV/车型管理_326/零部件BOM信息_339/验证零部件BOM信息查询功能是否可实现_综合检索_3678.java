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
 * 测试用例id: 3678
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件BOM信息(#339)
 * 用例名称: 验证零部件BOM信息查询功能是否可实现-综合检索
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 在零部件BOM信息的查询条件：BOM名称中填写1，供货编号中填写20150309，创建时间从2016-03-08开始，点击检索按钮
 * 测试预期->1. 检索出创建时间为2016-03-08之后的车型商标中含有1，通用名称中含有1的所有零部件BOM信息
 * 测试步骤->2. 在零部件BOM信息的查询条件：BOM名称中填写1，供货编号中填写2015，创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮
 * 测试预期->2. 未检索出任何符合条件的零部件BOM信息
 * 
 */

public class 验证零部件BOM信息查询功能是否可实现_综合检索_3678 extends Selenium_Test_Base {
	
	public 验证零部件BOM信息查询功能是否可实现_综合检索_3678(){
		super();
	}
	
	public 验证零部件BOM信息查询功能是否可实现_综合检索_3678(WebDriver driver){
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
		query("1", "20150309", "2016-03-08", null);
		query("1", "2015", "2016-03-08", "2016-04-11");
	}
	
	private void query(String word, String number, String start, String end){
		((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('readonly')", getElement(ElementEnum_零部件BOM信息_339.创建时间起始));
		((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('readonly')", getElement(ElementEnum_零部件BOM信息_339.创建时间截止));
		getElement(ElementEnum_零部件BOM信息_339.BOM名称输入框).clear();
		if (word != null){
			getElement(ElementEnum_零部件BOM信息_339.BOM名称输入框).sendKeys(word);
		}
		getElement(ElementEnum_零部件BOM信息_339.供货编号输入框).clear();
		if (number != null){
			getElement(ElementEnum_零部件BOM信息_339.供货编号输入框).sendKeys(number);
		}
		
		getElement(ElementEnum_零部件BOM信息_339.创建时间起始).clear();
		getElement(ElementEnum_零部件BOM信息_339.创建时间截止).clear();
		Calendar startTime = null;
		Calendar endTime = null;
		if (start != null){
			getElement(ElementEnum_零部件BOM信息_339.创建时间起始).sendKeys(start);
			String[] t = start.split("-");
			//System.out.println(t[0] + " " + t[1] + " " + t[2]);
			startTime = Calendar.getInstance();
			startTime.set(Integer.valueOf(t[0]), Integer.valueOf(t[1]), Integer.valueOf(t[2]));
		}
		if (end != null){
			getElement(ElementEnum_零部件BOM信息_339.创建时间截止).sendKeys(end);
			String[] t = end.split("-");
			//System.out.println(t[0] + " " + t[1] + " " + t[2]);
			endTime = Calendar.getInstance();
			endTime.set(Integer.valueOf(t[0]), Integer.valueOf(t[1]), Integer.valueOf(t[2]));
		}
		getElement(ElementEnum_零部件BOM信息_339.检索键).click();
		waitingForLoading();
		
		if (startTime != null && endTime != null && startTime.compareTo(endTime) > 0){
			String text = getElement(ElementEnum_零部件BOM信息_339.时间错误提示).getText();
			assertEquals(text, "开始时间早于结束时间!");
			WebDriverConfiguration.operationInterval();
			getElement(ElementEnum_零部件BOM信息_339.时间错误提示确定键).click();
			return;
		}
		
		List<WebElement> eles = getElements(ElementEnum_零部件BOM信息_339.检索结果所有行);
		if (eles.size() == 0)
			return;
		for (int i = 1; i < eles.size(); i++){
			if (word != null){
				String n = driver.findElement(By.xpath(ElementEnum_零部件BOM信息_339.检索结果第一行产品名称.getName()
						.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
				assertTrue(n.contains(word) || n.contains(word));
			}
			
			if (number != null){
				String n = driver.findElement(By.xpath(ElementEnum_零部件BOM信息_339.检索结果第一行供货编号.getName()
						.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
				assertTrue(n.equals(number) || n.equals(number));
			}
			
			String time = driver.findElement(By.xpath(ElementEnum_零部件BOM信息_339.检索结果第一行时间.getName()
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
	
	private void waitingForLoading(){
		
		do{
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e){
				
			}
		} while((!getElement(ElementEnum_零部件BOM信息_339.Loading框).getCssValue("display").equals("none")));
	}

	
	public String getDescription(){
		return "测试用例id: 3678\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件BOM信息(#339)\n"
				+" 用例名称: 验证零部件BOM信息查询功能是否可实现-综合检索\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 在零部件BOM信息的查询条件：BOM名称中填写1，供货编号中填写20150309，创建时间从2016-03-08开始，点击检索按钮\n"
				+" 测试预期->1. 检索出创建时间为2016-03-08之后的车型商标中含有1，通用名称中含有1的所有零部件BOM信息\n"
				+" 测试步骤->2. 在零部件BOM信息的查询条件：BOM名称中填写1，供货编号中填写2015，创建时间从2016-03-08开始，到2016-04-11结束，点击检索按钮\n"
				+" 测试预期->2. 未检索出任何符合条件的零部件BOM信息\n"
;
	}

}

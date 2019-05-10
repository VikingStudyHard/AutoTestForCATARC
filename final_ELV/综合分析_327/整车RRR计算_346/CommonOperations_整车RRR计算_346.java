package cn.edu.tju.scs.seql.final_ELV.综合分析_327.整车RRR计算_346;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cn.edu.tju.scs.seql.ELV.common.Selenium_Test_Base;
import cn.edu.tju.scs.seql.ELV.common.WebDriverConfiguration;
import cn.edu.tju.scs.seql.element.ElementEnum;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.有害物质分析_342.ElementEnum_有害物质分析_342;
import cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型信息_336.CommonOperations_车型信息_336;
import cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型信息_336.ElementEnum_车型信息_336;

public class CommonOperations_整车RRR计算_346 extends CommonOperationsAll {
	
	public CommonOperations_整车RRR计算_346() {
		super();
	}
	
	public CommonOperations_整车RRR计算_346(WebDriver driver){
		super(driver);
	}
	
	public void verifyHaveOneRecord(String name){
		getElement(ElementEnum_整车RRR计算_346.品牌名称输入框).clear();
		getElement(ElementEnum_整车RRR计算_346.品牌名称输入框).sendKeys(name);
		getElement(ElementEnum_整车RRR计算_346.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		List<WebElement> eles = getElements(ElementEnum_整车RRR计算_346.检索结果所有行);
		if(eles.size() == 1){
			WebElement leftFrame = getElement(ElementEnum_整车RRR计算_346.leftFrame);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(leftFrame);
			getElement(ElementEnum_车型信息_336.一级目录名称).click();
			WebDriverConfiguration.operationInterval();
			getElement(ElementEnum_车型信息_336.二级目录名称).click();
			WebDriverConfiguration.operationInterval();
			driver.switchTo().defaultContent();
			WebElement rightFrame = getElement(ElementEnum_整车RRR计算_346.rightFrame);
			driver.switchTo().frame(rightFrame);
			CommonOperations_车型信息_336 a = new CommonOperations_车型信息_336(driver);
			a.addOneMyRecord();
			
			driver.switchTo().defaultContent();
			driver.switchTo().frame(leftFrame);
			getElement(ElementEnum_整车RRR计算_346.一级目录名称).click();
			WebDriverConfiguration.operationInterval();
			getElement(ElementEnum_整车RRR计算_346.二级目录名称).click();
			WebDriverConfiguration.operationInterval();
			driver.switchTo().defaultContent();
			driver.switchTo().frame(rightFrame);
		}
	}
	
	/**
	 * 默认使用testbiaosheng车型进行测试，进入到第二级页面
	 */
	public void getIntoSecondPage(){
		getIntoSecondPage("testBy樊向宇");
	}
	
	/**
	 * 根据name查询得到的车型，进入到第二级页面
	 */
	public void getIntoSecondPage(String name){
		getElement(ElementEnum_整车RRR计算_346.品牌名称输入框).clear();
		getElement(ElementEnum_整车RRR计算_346.品牌名称输入框).sendKeys(name);
		getElement(ElementEnum_整车RRR计算_346.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_整车RRR计算_346.检索结果第一行品牌中文名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_整车RRR计算_346.第一页确定按钮).click();
		judgeMaskLoadSecond();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 默认使用testbiaosheng车型进行测试，进入到第三级（回收利用率报告）页面
	 */
	public void getIntoThirdPage(){
		getIntoThridPage("testBy樊向宇");
	}
	
	/**
	 * 根据name查询得到的车型，进入到第三级（回收利用率报告）页面
	 */
	public void getIntoThridPage(String name){
		getElement(ElementEnum_整车RRR计算_346.品牌名称输入框).clear();
		getElement(ElementEnum_整车RRR计算_346.品牌名称输入框).sendKeys(name);
		getElement(ElementEnum_整车RRR计算_346.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_整车RRR计算_346.检索结果第一行品牌中文名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_整车RRR计算_346.第一页确定按钮).click();
		judgeMaskLoadSecond();
		WebDriverConfiguration.operationInterval();
		
		((JavascriptExecutor) driver).executeScript("window.showModalDialog = window.open;");
		
		
		getElement(ElementEnum_整车RRR计算_346.第二页回收利用率报告按钮).click();
		WebDriverConfiguration.operationInterval();
		
		String[] handles=new String[driver.getWindowHandles().size()];
	    driver.getWindowHandles().toArray(handles);
	    driver.switchTo().window(handles[1]);
	}
	
	/**
	 * 检测快速提示信息是否消失，下一页会挡住最后一页的按钮
	 */
	public void judgeQuickTips(){
		judgeElementDisplayNone(ElementEnum_有害物质分析_342.快速提示信息);
	}
	
	/**
	 * 检测第一页载入界面是否完成
	 */
	public void judgeMaskLoadFirst(){
		judgeElementDisplayNone(ElementEnum_整车RRR计算_346.换页载入界面);
	}
	
	/**
	 * 检测第二页载入界面是否完成
	 */
	public void judgeMaskLoadSecond(){
		judgeElementDisplayNone(ElementEnum_整车RRR计算_346.第二页载入界面);
	}
	
	/**
	 * 检测第三页载入界面是否完成
	 */
	public void judgeMaskLoadPageThird(){
		judgeElementDisplayNone(ElementEnum_整车RRR计算_346.第三页载入界面);
	}

}

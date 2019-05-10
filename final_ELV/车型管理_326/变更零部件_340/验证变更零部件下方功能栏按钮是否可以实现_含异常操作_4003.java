package cn.edu.tju.scs.seql.final_ELV.车型管理_326.变更零部件_340;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.进展报表统计_344.ElementEnum_进展报表统计_344;

/**
 * 测试用例id: 4003
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 变更零部件(#340)
 * 用例名称: 验证变更零部件下方功能栏按钮是否可以实现-含异常操作 
 * 前置条件: 能正常进入车型信息界面
 * 测试步骤->1. 点击变更零部件信息界面最下方的翻页功能栏中的下一页按钮
 * 测试预期->1. 页面信息跳转至下一页，页面其余内容正常显示。
 * 测试步骤->2. 点击变更零部件信息界面最下方的翻页功能栏中的最后一页按钮
 * 测试预期->2. 页面信息跳转至最后一页，页面其余内容正常显示。
 * 测试步骤->3. 点击变更零部件信息界面最下方的翻页功能栏中的填写框填写1，按回车键
 * 测试预期->3. 页面信息跳转至第1页，页面其余内容正常显示。
 * 测试步骤->4. 点击变更零部件信息界面最下方的翻页功能栏中的填写框填写2000000，按回车键。
 * 测试预期->4. 页面信息跳转至最后一页，页面其余内容正常显示。
 * 
 */

public class 验证变更零部件下方功能栏按钮是否可以实现_含异常操作_4003 extends Selenium_Test_Base {
	
	public 验证变更零部件下方功能栏按钮是否可以实现_含异常操作_4003(){
		super();
	}
	
	public 验证变更零部件下方功能栏按钮是否可以实现_含异常操作_4003(WebDriver driver){
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
		waitingForLoading();
		getElement(ElementEnum_变更零部件_340.下一页).click();
		waitingForLoading();
		Integer[] n = getRecordsNumber();
		Integer count = n[1] - n[0] + 1;
		checkTable(2, getElements(ElementEnum_变更零部件_340.表格所有项), getRecordsNumber(), count);
		
		//这个上一页点击是因为下一页按钮的提示标签遮住了最后一页的按钮导致不能直接点击
		getElement(ElementEnum_变更零部件_340.上一页).click();
		waitingForLoading();
		getElement(ElementEnum_变更零部件_340.最后一页).click();
		waitingForLoading();
		
		//取出总页数，从而得出最后一页的页码
		String pageContent = getElement(ElementEnum_变更零部件_340.总页数).getText();
		Integer page = Integer.valueOf(pageContent.substring(pageContent.indexOf("共") + 2, pageContent.length() - 2));
		System.out.println("[" + page + "]");
		checkTable(page, getElements(ElementEnum_变更零部件_340.表格所有项), getRecordsNumber(), count);
		getElement(ElementEnum_变更零部件_340.页码输入框).clear();
		getElement(ElementEnum_变更零部件_340.页码输入框).sendKeys("1");
		getElement(ElementEnum_变更零部件_340.页码输入框).sendKeys(Keys.ENTER);
		WebDriverConfiguration.operationInterval();
		checkTable(1, getElements(ElementEnum_变更零部件_340.表格所有项), getRecordsNumber(), count);
		getElement(ElementEnum_变更零部件_340.页码输入框).clear();
		getElement(ElementEnum_变更零部件_340.页码输入框).sendKeys("2000000");
		getElement(ElementEnum_变更零部件_340.页码输入框).sendKeys(Keys.ENTER);
		WebDriverConfiguration.operationInterval();
		checkTable(page, getElements(ElementEnum_变更零部件_340.表格所有项), getRecordsNumber(), count);
	}
	
	/*
	 * 检查：
	 * 1、翻页后页码是否正确。如：翻页前是第一页，翻页后是否为第二页
	 * （由于input输入框中的内容无法获取，所以页码通过右侧的“显示XXX-XXX条”换算获得）
	 * 2、翻页后列表中显示内容是否与右下方的显示XXX-XXX条一致
	 * 
	 * 参数：
	 * page：当前期望在的页号 l：当前表格所有列 se：当前表格中记录期望的起始和截止标号 count：一页的记录数
	 */
	private void checkTable(Integer page, List<WebElement> l, Integer[] se, Integer count){
		assertEquals(se[0], (Integer)(count * (page - 1) + 1));
		
		for (int i = 0; i < l.size() - 1; i++){
			String xpath = ElementEnum_变更零部件_340.表格第一行序号.getName().replaceAll("tr\\[2\\]", "tr[" + (i + 2) + "]");
			Integer number = Integer.valueOf(driver.findElement(By.xpath(xpath)).getText());
			assertEquals(number, (Integer)(se[0] + i));
		}
	}
	
	private Integer[] getRecordsNumber(){
		Integer start, end;
		String text = getElement(ElementEnum_变更零部件_340.右下角数量提示).getText();
		text = text.substring(text.indexOf("示") + 2, text.indexOf("条"));
		System.out.println("[" + text + "]");
		start = Integer.valueOf(text.substring(0, text.indexOf("-") - 1));
		end = Integer.valueOf(text.substring(text.indexOf("-") + 2));
		
		return new Integer[]{start, end};
	}
	
	//等待翻页加载
	private void waitingForLoading(){
		
		do{
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e){
				
			}
		} while((!getElement(ElementEnum_变更零部件_340.Loading框).getCssValue("display").equals("none")));
	}

	
	public String getDescription(){
		return "测试用例id: 4003\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 变更零部件(#340)\n"
				+" 用例名称: 验证变更零部件下方功能栏按钮是否可以实现-含异常操作 \n"
				+" 前置条件: 能正常进入车型信息界面\n"
				+" 测试步骤->1. 点击变更零部件信息界面最下方的翻页功能栏中的下一页按钮\n"
				+" 测试预期->1. 页面信息跳转至下一页，页面其余内容正常显示。\n"
				+" 测试步骤->2. 点击变更零部件信息界面最下方的翻页功能栏中的最后一页按钮\n"
				+" 测试预期->2. 页面信息跳转至最后一页，页面其余内容正常显示。\n"
				+" 测试步骤->3. 点击变更零部件信息界面最下方的翻页功能栏中的填写框填写1，按回车键\n"
				+" 测试预期->3. 页面信息跳转至第1页，页面其余内容正常显示。\n"
				+" 测试步骤->4. 点击变更零部件信息界面最下方的翻页功能栏中的填写框填写2000000，按回车键。\n"
				+" 测试预期->4. 页面信息跳转至最后一页，页面其余内容正常显示。\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.综合分析_327.整车RRR计算_346;

import static org.testng.Assert.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4259
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 整车RRR计算(#346)
 * 用例名称: 验证整车RRR计算下方工具栏是否可实现-含异常操作
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 点击整车RRR计算界面最下方的翻页功能栏中的下一页按钮
 * 测试预期->1. 页面信息跳转至下一页，页面其余内容正常显示。
 * 测试步骤->2. 点击整车RRR计算界面最下方的翻页功能栏中的最后一页按钮
 * 测试预期->2. 页面信息跳转至最后一页，页面其余内容正常显示。
 * 测试步骤->3. 点击整车RRR计算界面最下方的翻页功能栏中的填写框填写1，按回车键。
 * 测试预期->3. 页面信息跳转至第1页，页面其余内容正常显示。
 * 测试步骤->4. 点击整车RRR计算界面最下方的翻页功能栏中的填写框填写2000000，按回车键。
 * 测试预期->4. 页面信息跳转至最后一页，页面其余内容正常显示。
 * 
 */

public class 验证整车RRR计算下方工具栏是否可实现_含异常操作_4259 extends Selenium_Test_Base {
	
	public 验证整车RRR计算下方工具栏是否可实现_含异常操作_4259(){
		super();
	}
	
	public 验证整车RRR计算下方工具栏是否可实现_含异常操作_4259(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_整车RRR计算_346.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_整车RRR计算_346.rightFrame);
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
		getElement(ElementEnum_整车RRR计算_346.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_整车RRR计算_346.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		int totalPage = getTotalPageNumber();
		System.out.println("总共有 "+totalPage+" 页");
		
		CommonOperations_整车RRR计算_346 a = new CommonOperations_整车RRR计算_346(driver);
		a.judgeMaskLoadFirst();
		getElement(ElementEnum_整车RRR计算_346.下一页按钮).click();
		a.judgeMaskLoadFirst();
		a.judgeQuickTips();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_整车RRR计算_346.最后页按钮).click();
		a.judgeMaskLoadFirst();
		a.judgeQuickTips();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_整车RRR计算_346.页码显示及输入框).clear();
		getElement(ElementEnum_整车RRR计算_346.页码显示及输入框).sendKeys("1");
		getElement(ElementEnum_整车RRR计算_346.页码显示及输入框).sendKeys(Keys.ENTER);
		a.judgeMaskLoadFirst();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_整车RRR计算_346.页码显示及输入框).clear();
		getElement(ElementEnum_整车RRR计算_346.页码显示及输入框).sendKeys("2000000");
		getElement(ElementEnum_整车RRR计算_346.页码显示及输入框).sendKeys(Keys.ENTER);
		a.judgeMaskLoadFirst();
		WebDriverConfiguration.operationInterval();
	}
	
	
	/**
	 * 获取总共有多少页
	 */
	public int getTotalPageNumber(){
		String s = getElement(ElementEnum_整车RRR计算_346.页码总数显示).getText();
		Pattern p = Pattern.compile("[0-9]+");
		Matcher mat = p.matcher(s);
		if(mat.find()){
			return Integer.parseInt(mat.group());
		}else{
			return 0;
		}
	}

	
	public String getDescription(){
		return "测试用例id: 4259\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 整车RRR计算(#346)\n"
				+" 用例名称: 验证整车RRR计算下方工具栏是否可实现-含异常操作\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 点击整车RRR计算界面最下方的翻页功能栏中的下一页按钮\n"
				+" 测试预期->1. 页面信息跳转至下一页，页面其余内容正常显示。\n"
				+" 测试步骤->2. 点击整车RRR计算界面最下方的翻页功能栏中的最后一页按钮\n"
				+" 测试预期->2. 页面信息跳转至最后一页，页面其余内容正常显示。\n"
				+" 测试步骤->3. 点击整车RRR计算界面最下方的翻页功能栏中的填写框填写1，按回车键。\n"
				+" 测试预期->3. 页面信息跳转至第1页，页面其余内容正常显示。\n"
				+" 测试步骤->4. 点击整车RRR计算界面最下方的翻页功能栏中的填写框填写2000000，按回车键。\n"
				+" 测试预期->4. 页面信息跳转至最后一页，页面其余内容正常显示。\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.数据管理_325.审核信息_334;

import static org.testng.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.零部件RRR计算_345.ElementEnum_零部件RRR计算_345;

/**
 * 测试用例id: 3470
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 审核信息(#334)
 * 用例名称: 验证审核信息下方功能栏按钮是否可以实现-含异常操作
 * 前置条件: 拥有MDS审核信息的权限
 * 测试步骤->1. 点击审核信息界面最下方的翻页功能栏中的下一页按钮
 * 测试预期->1. 页面信息跳转至下一页，页面其余内容正常显示。
 * 测试步骤->2. 点击审核信息界面最下方的翻页功能栏中的最后一页按钮
 * 测试预期->2. 页面信息跳转至最后一页，页面其余内容正常显示。
 * 测试步骤->3. 点击审核信息界面最下方的翻页功能栏中的填写框填写1，按回车键。
 * 测试预期->3. 页面信息跳转至第1页，页面其余内容正常显示。
 * 测试步骤->4. 点击审核信息界面最下方的翻页功能栏中的填写框填写2000000，按回车键。
 * 测试预期->4. 页面信息跳转至最后一页，页面其余内容正常显示。
 * 
 */

public class 验证审核信息下方功能栏按钮是否可以实现_含异常操作_3470 extends Selenium_Test_Base {
	
	public 验证审核信息下方功能栏按钮是否可以实现_含异常操作_3470(){
		super();
	}
	
	public 验证审核信息下方功能栏按钮是否可以实现_含异常操作_3470(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_审核信息_334.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_审核信息_334.rightFrame);
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
		//getElement(ElementEnum_审核信息_334.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_审核信息_334.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
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
		
		judgeMaskLoad();
		getElement(ElementEnum_审核信息_334.下一页按钮).click();
		judgeMaskLoad();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_审核信息_334.最后页按钮).click();
		judgeMaskLoad();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_审核信息_334.页码显示及输入框).clear();
		getElement(ElementEnum_审核信息_334.页码显示及输入框).sendKeys("1");
		getElement(ElementEnum_审核信息_334.页码显示及输入框).sendKeys(Keys.ENTER);
		judgeMaskLoad();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_审核信息_334.页码显示及输入框).clear();
		getElement(ElementEnum_审核信息_334.页码显示及输入框).sendKeys("2000000");
		getElement(ElementEnum_审核信息_334.页码显示及输入框).sendKeys(Keys.ENTER);
		judgeMaskLoad();
		WebDriverConfiguration.operationInterval();
		
	}
	
	// 检测载入界面是否完成
	public void judgeMaskLoad(){
		CommonOperationsAll a = new CommonOperationsAll(driver);
		a.judgeElementDisplayNone(ElementEnum_审核信息_334.换页载入界面);
	}
	
	public int getTotalPageNumber(){
		String s = getElement(ElementEnum_审核信息_334.页码总数显示).getText();
		Pattern p = Pattern.compile("[0-9]+");
		Matcher mat = p.matcher(s);
		if(mat.find()){
			return Integer.parseInt(mat.group());
		}else{
			return 0;
		}
	
		/*
		assertEquals(driver.findElement(By.xpath("//td")).getText(), "企业名称:");
	    assertEquals(driver.findElement(By.xpath("//td[3]")).getText(), "企业ID:");
	    assertEquals(driver.findElement(By.xpath("//td[5]")).getText(), "计划员:");
	    assertEquals(driver.findElement(By.xpath("//td[7]")).getText(), "区域");
	    assertEquals(driver.findElement(By.xpath("//td[9]")).getText(), "新增信息来源");
	    assertEquals(driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td/div/input")).getText(), "");
		*/
	
	}

	
	public String getDescription(){
		return "测试用例id: 3470\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 审核信息(#334)\n"
				+" 用例名称: 验证审核信息下方功能栏按钮是否可以实现-含异常操作\n"
				+" 前置条件: 拥有MDS审核信息的权限\n"
				+" 测试步骤->1. 点击审核信息界面最下方的翻页功能栏中的下一页按钮\n"
				+" 测试预期->1. 页面信息跳转至下一页，页面其余内容正常显示。\n"
				+" 测试步骤->2. 点击审核信息界面最下方的翻页功能栏中的最后一页按钮\n"
				+" 测试预期->2. 页面信息跳转至最后一页，页面其余内容正常显示。\n"
				+" 测试步骤->3. 点击审核信息界面最下方的翻页功能栏中的填写框填写1，按回车键。\n"
				+" 测试预期->3. 页面信息跳转至第1页，页面其余内容正常显示。\n"
				+" 测试步骤->4. 点击审核信息界面最下方的翻页功能栏中的填写框填写2000000，按回车键。\n"
				+" 测试预期->4. 页面信息跳转至最后一页，页面其余内容正常显示。\n"
;
	}

}

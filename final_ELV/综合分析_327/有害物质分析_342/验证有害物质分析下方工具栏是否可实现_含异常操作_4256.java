package cn.edu.tju.scs.seql.final_ELV.综合分析_327.有害物质分析_342;

import static cn.edu.tju.scs.seql.final_ELV.commonOperations.OperationUnit.tuplesOperation;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;
import org.testng.annotations.Test;

/**
 * 测试用例id: 4256
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 有害物质分析(#342)
 * 用例名称: 验证有害物质分析下方工具栏是否可实现-含异常操作
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 点击有害物质分析界面最下方的翻页功能栏中的下一页按钮
 * 测试预期->1. 页面信息跳转至下一页，页面其余内容正常显示。
 * 测试步骤->2. 点击有害物质分析界面最下方的翻页功能栏中的最后一页按钮
 * 测试预期->2. 页面信息跳转至最后一页，页面其余内容正常显示。
 * 测试步骤->3. 点击有害物质分析界面最下方的翻页功能栏中的填写框填写1，按回车键。
 * 测试预期->3. 页面信息跳转至第1页，页面其余内容正常显示。
 * 测试步骤->4. 点击有害物质分析界面最下方的翻页功能栏中的填写框填写2000000，按回车键。
 * 测试预期->4. 页面信息跳转至最后一页，页面其余内容正常显示。
 * 
 */

public class 验证有害物质分析下方工具栏是否可实现_含异常操作_4256 extends Selenium_Test_Base {
	
	public 验证有害物质分析下方工具栏是否可实现_含异常操作_4256(){
		super();
	}
	
	public 验证有害物质分析下方工具栏是否可实现_含异常操作_4256(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_有害物质分析_342.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_有害物质分析_342.rightFrame);
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
		getElement(ElementEnum_有害物质分析_342.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_有害物质分析_342.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation() throws IOException {

		//OperationUnit.segmentUnit(getDescription());
		//OperationUnit.tuplesOperation(driver);
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		String str=getDescription();
		String name= Han.getTestCaseName(str);
		//读取三元组文件
		tuplesOperation(driver,name);
		/*int totalPage = getTotalPageNumber();
		System.out.println("总共有 "+totalPage+" 页");
		
		judgeMaskLoad();
		getElement(ElementEnum_有害物质分析_342.下一页按钮).click();
		judgeMaskLoad();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_有害物质分析_342.最后页按钮).click();
		judgeMaskLoad();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_有害物质分析_342.页码显示及输入框).clear();
		getElement(ElementEnum_有害物质分析_342.页码显示及输入框).sendKeys("1");
		getElement(ElementEnum_有害物质分析_342.页码显示及输入框).sendKeys(Keys.ENTER);
		judgeMaskLoad();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_有害物质分析_342.页码显示及输入框).clear();
		getElement(ElementEnum_有害物质分析_342.页码显示及输入框).sendKeys("2000000");
		getElement(ElementEnum_有害物质分析_342.页码显示及输入框).sendKeys(Keys.ENTER);
		judgeMaskLoad();
		WebDriverConfiguration.operationInterval();*/
		
	}
	
	// 检测载入界面是否完成
	public void judgeMaskLoad(){
		CommonOperationsAll a = new CommonOperationsAll(driver);
		a.judgeElementDisplayNone(ElementEnum_有害物质分析_342.载入界面);
	}
	
	public int getTotalPageNumber(){
		String s = getElement(ElementEnum_有害物质分析_342.页码总数显示).getText();
		Pattern p = Pattern.compile("[0-9]+");
		Matcher mat = p.matcher(s);
		if(mat.find()){
			return Integer.parseInt(mat.group());
		}else{
			return 0;
		}
	}

	
	public String getDescription(){
		return "测试用例id: 4256\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 有害物质分析(#342)\n"
				+" 用例名称: 验证有害物质分析下方工具栏是否可实现-含异常操作\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 点击有害物质分析界面最下方的翻页功能栏中的下一页按钮\n"
				+" 测试预期->1. 页面信息跳转至下一页，页面其余内容正常显示。\n"
				+" 测试步骤->2. 点击有害物质分析界面最下方的翻页功能栏中的最后一页按钮\n"
				+" 测试预期->2. 页面信息跳转至最后一页，页面其余内容正常显示。\n"
				+" 测试步骤->3. 点击有害物质分析界面最下方的翻页功能栏中的填写框填写1，按回车键。\n"
				+" 测试预期->3. 页面信息跳转至第1页，页面其余内容正常显示。\n"
				+" 测试步骤->4. 点击有害物质分析界面最下方的翻页功能栏中的填写框填写2000000，按回车键。\n"
				+" 测试预期->4. 页面信息跳转至最后一页，页面其余内容正常显示。\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4540
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 标准信息(#352)
 * 用例名称: 验证标准信息下方工具栏是否可实现-含异常操作
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击标准信息界面最下方的翻页功能栏中的下一页按钮
 * 测试预期->1. 页面信息跳转至下一页，页面其余内容正常显示。
 * 测试步骤->2. 点击标准信息界面最下方的翻页功能栏中的最后一页按钮
 * 测试预期->2. 页面信息跳转至最后一页，页面其余内容正常显示。
 * 测试步骤->3. 点击标准信息界面最下方的翻页功能栏中的填写框填写1，按回车键。
 * 测试预期->3. 页面信息跳转至第1页，页面其余内容正常显示。
 * 测试步骤->4. 点击标准信息界面最下方的翻页功能栏中的填写框填写2000000，按回车键。
 * 测试预期->4. 页面信息跳转至最后一页，页面其余内容正常显示。
 * 
 */

public class 验证标准信息下方工具栏是否可实现_含异常操作_4540 extends Selenium_Test_Base {
	
	public 验证标准信息下方工具栏是否可实现_含异常操作_4540(){
		super();
	}
	
	public 验证标准信息下方工具栏是否可实现_含异常操作_4540(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_标准信息_352.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_标准信息_352.rightFrame);
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
		// TODO 该用例尚未实现，请检查
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		// 与“验证有害物质分析下方工具栏是否可实现_含异常操作_4256”用例类似
	
	}

	
	public String getDescription(){
		return "测试用例id: 4540\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 标准信息(#352)\n"
				+" 用例名称: 验证标准信息下方工具栏是否可实现-含异常操作\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击标准信息界面最下方的翻页功能栏中的下一页按钮\n"
				+" 测试预期->1. 页面信息跳转至下一页，页面其余内容正常显示。\n"
				+" 测试步骤->2. 点击标准信息界面最下方的翻页功能栏中的最后一页按钮\n"
				+" 测试预期->2. 页面信息跳转至最后一页，页面其余内容正常显示。\n"
				+" 测试步骤->3. 点击标准信息界面最下方的翻页功能栏中的填写框填写1，按回车键。\n"
				+" 测试预期->3. 页面信息跳转至第1页，页面其余内容正常显示。\n"
				+" 测试步骤->4. 点击标准信息界面最下方的翻页功能栏中的填写框填写2000000，按回车键。\n"
				+" 测试预期->4. 页面信息跳转至最后一页，页面其余内容正常显示。\n"
;
	}

}

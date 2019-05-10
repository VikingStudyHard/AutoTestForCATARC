package cn.edu.tju.scs.seql.final_ELV.系统管理_330.部门信息_357;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 996
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 部门信息(#357)
 * 用例名称: 验证部门信息中功能菜单的打开树按键是否正常工作
 * 前置条件: 能正确进入ELV环境合规系统（标准版）部门信息页面
 * 测试步骤->1. 点击功能菜单中的打开树按钮
 * 测试预期->1. 功能菜单中的树形菜单随即展开，页面其余地方正常显示。
 * 
 */

public class 验证部门信息中功能菜单的打开树按键是否正常工作_996 extends Selenium_Test_Base {
	
	public 验证部门信息中功能菜单的打开树按键是否正常工作_996(){
		super();
	}
	
	public 验证部门信息中功能菜单的打开树按键是否正常工作_996(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_部门信息_357.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_部门信息_357.rightFrame);
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
		getElement(ElementEnum_部门信息_357.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_部门信息_357.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonFunction.waitingForLoading(getElement(ElementEnum_部门信息_357.body));
		int rowNumber = getElements(ElementEnum_部门信息_357.功能菜单所有行).size();
		getElement(ElementEnum_部门信息_357.打开树键).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(getElements(ElementEnum_部门信息_357.功能菜单所有行).size() != rowNumber);
	}

	
	public String getDescription(){
		return "测试用例id: 996\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 部门信息(#357)\n"
				+" 用例名称: 验证部门信息中功能菜单的打开树按键是否正常工作\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）部门信息页面\n"
				+" 测试步骤->1. 点击功能菜单中的打开树按钮\n"
				+" 测试预期->1. 功能菜单中的树形菜单随即展开，页面其余地方正常显示。\n"
;
	}

}

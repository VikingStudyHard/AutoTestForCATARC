package cn.edu.tju.scs.seql.final_ELV.系统管理_330.部门信息_357;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1001
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 部门信息(#357)
 * 用例名称: 验证部门的添加功能是否可以实现-总流程
 * 前置条件: 能正确进入ELV环境合规系统（标准版）部门信息页面
 * 测试步骤->1. 随机选择一个部门右键选择添加
 * 测试预期->1. 页面右侧显示添加部门所需要填写的各项内容，页面其余各项正常显示。
 * 测试步骤->2. 填写必填项目，点击保存键
 * 测试预期->2. 左侧树形功能菜单刷新，其中步骤一所选定位置出现新添加的部门。页面右侧显示新添加部门的详细信息。
 * 
 */

public class 验证部门的添加功能是否可以实现_总流程_1001 extends Selenium_Test_Base {
	
	public 验证部门的添加功能是否可以实现_总流程_1001(){
		super();
	}
	
	public 验证部门的添加功能是否可以实现_总流程_1001(WebDriver driver){
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
		
		Actions action = new Actions(driver);
		
		
		String name = "test123";
		String id = "123123";
		getElement(ElementEnum_部门信息_357.打开树键).click();
		WebDriverConfiguration.operationInterval();
		
		WebElement row = findRow(name);
		if (row != null){
			action.contextClick(row).perform();
			WebDriverConfiguration.operationInterval();
			getElement(ElementEnum_部门信息_357.右键菜单删除键).click();
			WebDriverConfiguration.operationInterval();
			getElement(ElementEnum_部门信息_357.删除确定键).click();
			WebDriverConfiguration.operationInterval();
			getElement(ElementEnum_部门信息_357.添加成功确定键).click();
			WebDriverConfiguration.operationInterval();
		}
		
		List<WebElement> rows = getElements(ElementEnum_部门信息_357.功能菜单所有行);
		action.contextClick(rows.get(1)).perform();;
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_部门信息_357.右键菜单添加键).click();
		WebDriverConfiguration.operationInterval();
		driver.switchTo().frame(getElement(ElementEnum_部门信息_357.contentFrame));
		
		
		getElement(ElementEnum_部门信息_357.添加页面名称).clear();
		getElement(ElementEnum_部门信息_357.添加页面ID).clear();
		getElement(ElementEnum_部门信息_357.添加页面名称).sendKeys(name);
		getElement(ElementEnum_部门信息_357.添加页面ID).sendKeys(id);
		getElement(ElementEnum_部门信息_357.添加页面保存键).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_部门信息_357.添加成功确定键).click();
		WebDriverConfiguration.operationInterval();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(getElement(ElementEnum_部门信息_357.rightFrame));
		
		getElement(ElementEnum_部门信息_357.打开树键).click();
		WebDriverConfiguration.operationInterval();
		assertNotNull(findRow(name));
	}
	
	private WebElement findRow(String name){
		List<WebElement> rows = getElements(ElementEnum_部门信息_357.功能菜单所有行);
		for (WebElement row : rows){
			if (row.getText().equals(name)){
				return row;
			}
		}
		return null;
	}

	
	public String getDescription(){
		return "测试用例id: 1001\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 部门信息(#357)\n"
				+" 用例名称: 验证部门的添加功能是否可以实现-总流程\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）部门信息页面\n"
				+" 测试步骤->1. 随机选择一个部门右键选择添加\n"
				+" 测试预期->1. 页面右侧显示添加部门所需要填写的各项内容，页面其余各项正常显示。\n"
				+" 测试步骤->2. 填写必填项目，点击保存键\n"
				+" 测试预期->2. 左侧树形功能菜单刷新，其中步骤一所选定位置出现新添加的部门。页面右侧显示新添加部门的详细信息。\n"
;
	}

}

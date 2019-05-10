package cn.edu.tju.scs.seql.final_ELV.系统管理_330.角色信息_362;

import static org.testng.Assert.assertEquals;

import java.util.List;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1084
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 角色信息(#362)
 * 用例名称: 验证角色信息修改功能是否可以实现-正常流
 * 前置条件: 能正确进入ELV环境合规系统（标准版）角色信息界面
 * 测试步骤->1. 勾选某一角色信息，点击修改按钮。
 * 测试预期->1. 页面跳转至角色关联详细信息填写页面，包含已填写信息。
 * 测试步骤->2. 修改其中一条或某些条信息，点击关闭按钮。
 * 测试预期->2. 页面跳转至最初。
 * 测试步骤->3. 查看已勾选的角色信息。
 * 测试预期->3. 页面跳转至角色关联详细信息填写页面，信息未经修改。
 * 
 */

public class 验证角色信息修改功能是否可以实现_正常流_1084 extends Selenium_Test_Base {
	
	public 验证角色信息修改功能是否可以实现_正常流_1084(){
		super();
	}
	
	public 验证角色信息修改功能是否可以实现_正常流_1084(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_角色信息_362.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_角色信息_362.rightFrame);
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
		getElement(ElementEnum_角色信息_362.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		
		CommonOperations_角色信息_362 a = new CommonOperations_角色信息_362(driver);
		
		//新增角色
		getElement(ElementEnum_角色信息_362.新增按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.新增页面权限中文名称输入框).sendKeys("林华睿在删除");
		getElement(ElementEnum_角色信息_362.新增页面权限英文名称输入框).sendKeys("林华睿在删除");
		getElement(ElementEnum_角色信息_362.新增页面角色类型选择按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.新增页面角色类型选择按钮审核员).click();
		getElement(ElementEnum_角色信息_362.数据管理第一项).click();
		getElement(ElementEnum_角色信息_362.新增页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
			
		a.verifyTips("新建角色信息成功！");
		verifyAllSearchResult("林华睿在删除", ElementEnum_角色信息_362.检索结果所有行,
				ElementEnum_角色信息_362.检索结果第一行中文);
		getElement(ElementEnum_角色信息_362.修改按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.修改页面权限英文名称).clear();
		getElement(ElementEnum_角色信息_362.修改页面权限英文名称).sendKeys("s");
		getElement(ElementEnum_角色信息_362.修改页面关闭按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.查看按钮).click();
		WebDriverConfiguration.operationInterval();
	}

	public void verifyAllSearchResult(String name, ElementEnum allResult, ElementEnum firstLineCH) {
		List<WebElement> eles = getElements(allResult);
		// 检查查询结果中是否包含所查关键字
		for(int i = 1;i < eles.size();i++){
			String chXpath = firstLineCH.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String chName = driver.findElement(By.xpath(chXpath)).getText();
			if(chName.equals(name)){
				driver.findElement(By.xpath(chXpath.replaceAll("td\\[3\\]", "td[1]"))).click(); 
				return;
			}
		}
		WebDriverConfiguration.operationInterval();
	}
	
	public String getDescription(){
		return "测试用例id: 1084\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 角色信息(#362)\n"
				+" 用例名称: 验证角色信息修改功能是否可以实现-正常流\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）角色信息界面\n"
				+" 测试步骤->1. 勾选某一角色信息，点击修改按钮。\n"
				+" 测试预期->1. 页面跳转至角色关联详细信息填写页面，包含已填写信息。\n"
				+" 测试步骤->2. 修改其中一条或某些条信息，点击关闭按钮。\n"
				+" 测试预期->2. 页面跳转至最初。\n"
				+" 测试步骤->3. 查看已勾选的角色信息。\n"
				+" 测试预期->3. 页面跳转至角色关联详细信息填写页面，信息未经修改。\n"
;
	}

}

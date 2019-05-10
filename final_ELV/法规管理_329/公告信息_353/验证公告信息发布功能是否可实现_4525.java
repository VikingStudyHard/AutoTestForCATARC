package cn.edu.tju.scs.seql.final_ELV.法规管理_329.公告信息_353;

import static org.testng.Assert.assertEquals;

import java.util.List;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352.ElementEnum_标准信息_352;
import cn.edu.tju.scs.seql.final_ELV.系统管理_330.角色信息_362.ElementEnum_角色信息_362;

/**
 * 测试用例id: 4525
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 公告信息(#353)
 * 用例名称: 验证公告信息发布功能是否可实现
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击页面中的发布按钮
 * 测试预期->1. 页面出现提示信息：请选择则要发布的记录
 * 测试步骤->2. 选择一条信息，点击发布按钮
 * 测试预期->2. 页面出现提示信息：是否要发布这些数据？
 * 测试步骤->3. 点击提示信息中的是按钮
 * 测试预期->3. 页面出现提示信息：发布公告信息成功！
 * 测试步骤->4. 选择一条已发布信息，点击发布按钮
 * 测试预期->4. 页面出现提示信息：您选择的数据中一部分已经发布！
 * 测试步骤->5. 选择多条信息，点击发布按钮
 * 测试预期->5. 页面出现提示信息：是否要发布这些数据？
 * 测试步骤->6. 点击提示信息中的是按钮
 * 测试预期->6. 页面出现提示信息：发布公告信息成功！
 * 测试步骤->7. 退出当前登录的ELV环境合规系统的用户，使用其他的用户重新登录，例如用户：yangjie，密码：000000，查看公告信息
 * 测试预期->7. 在公告信息栏查看到刚刚发布的公告信息
 * 
 */

public class 验证公告信息发布功能是否可实现_4525 extends Selenium_Test_Base {
	
	public 验证公告信息发布功能是否可实现_4525(){
		super();
	}
	
	public 验证公告信息发布功能是否可实现_4525(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_公告信息_353.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_公告信息_353.rightFrame);
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
		getElement(ElementEnum_公告信息_353.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_公告信息_353.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_公告信息_353 a = new CommonOperations_公告信息_353(driver);
		
		getElement(ElementEnum_公告信息_353.发布按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTipsAndThenOperateButton("请选择则要发布的记录", ElementEnum_公告信息_353.第一页提示信息, ElementEnum_公告信息_353.第一页提示框确认按钮);
		verifyAllSearchResult("未发布", ElementEnum_公告信息_353.检索结果所有行,
				ElementEnum_公告信息_353.检索结果第一行状态);
		getElement(ElementEnum_公告信息_353.发布按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_公告信息_353.发布是按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_公告信息_353.发布确定按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_公告信息_353.检索结果第一行勾选框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_公告信息_353.发布按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_公告信息_353.已发布确定按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_公告信息_353.检索结果第一行勾选框).click();
		WebDriverConfiguration.operationInterval();
		verifyAllSearchResultMore("未发布", ElementEnum_公告信息_353.检索结果所有行,
				ElementEnum_公告信息_353.检索结果第一行状态);
		getElement(ElementEnum_公告信息_353.发布按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_公告信息_353.发布是按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_公告信息_353.发布确定按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		System.out.println("退出弹窗无法测试");
	}

	private void verifyAllSearchResultMore(String name, ElementEnum allResult, ElementEnum firstLineCH) {
		List<WebElement> eles = getElements(allResult);
		int num = 1;
		// 检查查询结果中是否包含所查关键字
		for(int i = 1;i < eles.size();i++){
			String chXpath = firstLineCH.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String chName = driver.findElement(By.xpath(chXpath)).getText();
			if(chName.equals(name)){
				driver.findElement(By.xpath(chXpath.replaceAll("td\\[3\\]", "td[1]"))).click(); 
				num++;
			}
			if(num == 3)
				return;
		}
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
		return "测试用例id: 4525\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 公告信息(#353)\n"
				+" 用例名称: 验证公告信息发布功能是否可实现\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击页面中的发布按钮\n"
				+" 测试预期->1. 页面出现提示信息：请选择则要发布的记录\n"
				+" 测试步骤->2. 选择一条信息，点击发布按钮\n"
				+" 测试预期->2. 页面出现提示信息：是否要发布这些数据？\n"
				+" 测试步骤->3. 点击提示信息中的是按钮\n"
				+" 测试预期->3. 页面出现提示信息：发布公告信息成功！\n"
				+" 测试步骤->4. 选择一条已发布信息，点击发布按钮\n"
				+" 测试预期->4. 页面出现提示信息：您选择的数据中一部分已经发布！\n"
				+" 测试步骤->5. 选择多条信息，点击发布按钮\n"
				+" 测试预期->5. 页面出现提示信息：是否要发布这些数据？\n"
				+" 测试步骤->6. 点击提示信息中的是按钮\n"
				+" 测试预期->6. 页面出现提示信息：发布公告信息成功！\n"
				+" 测试步骤->7. 退出当前登录的ELV环境合规系统的用户，使用其他的用户重新登录，例如用户：yangjie，密码：000000，查看公告信息\n"
				+" 测试预期->7. 在公告信息栏查看到刚刚发布的公告信息\n"
;
	}

}

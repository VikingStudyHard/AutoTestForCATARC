package cn.edu.tju.scs.seql.final_ELV.系统管理_330.角色信息_362;

import static org.testng.Assert.assertEquals;

import java.util.List;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.final_ELV.法规管理_329.最新法规_354.ElementEnum_最新法规_354;
import cn.edu.tju.scs.seql.final_ELV.系统管理_330.供应商信息_361.ElementEnum_供应商信息_361;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1083
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 角色信息(#362)
 * 用例名称: 验证角色信息修改功能是否可以实现-异常流
 * 前置条件: 能正确进入ELV环境合规系统（标准版）角色信息界面
 * 测试步骤->1. 勾选某两项角色信息
 * 测试预期->1. 上方工具栏中的查看和修改按钮消失，仅剩下新增和删除按钮。
 * 测试步骤->2. 勾选某一角色信息，点击修改按钮。
 * 测试预期->2. 页面跳转至角色关联详细信息填写页面，包含已填写信息。
 * 测试步骤->3. 删除角色关联详细信息中的权限中文名称，点击保存按钮。
 * 测试预期->3. 页面出现提示信息：更新角色信息成功！
 * 测试步骤->4. 点击提示信息中的确认按钮。
 * 测试预期->4. 页面跳转至最初，已勾选的角色信息中的权限中文名称为空。
 * 测试步骤->5. 勾选某一角色信息，点击修改按钮。
 * 测试预期->5. 页面跳转至角色关联详细信息填写页面，包含已填写信息。
 * 测试步骤->6. 删除角色关联详细信息中的权限中文名称和英文名称，点击保存按钮。
 * 测试预期->6. 页面出现提示信息：更新角色信息成功！
 * 测试步骤->7. 点击提示信息中的确认按钮。
 * 测试预期->7. 页面跳转至最初，已勾选的角色信息中的权限中文名称和英文名称为空。
 * 测试步骤->8. 勾选某一角色信息，点击修改按钮。
 * 测试预期->8. 页面跳转至角色关联详细信息填写页面，包含已填写信息。
 * 测试步骤->9. 删除角色关联详细信息中的权限中文名称和英文名称，选择角色类型为其他，点击保存按钮。
 * 测试预期->9. 页面出现提示信息：更新角色信息成功！
 * 测试步骤->10. 点击提示信息中的确认按钮。
 * 测试预期->10. 页面跳转至最初，已勾选的角色信息中的权限中文名称和英文名称为空角色类型为其他。
 * 测试步骤->11. 勾选某一角色信息，点击修改按钮。
 * 测试预期->11. 页面跳转至角色关联详细信息填写页面，包含已填写信息。
 * 测试步骤->12. 修改其中数据管理，法规信息，消息管理，系统管理，车型管理，点击保存按钮。
 * 测试预期->12. 页面出现提示信息：更新角色信息成功！
 * 测试步骤->13. 点击提示信息中的确认按钮。
 * 测试预期->13. 页面跳转至最初。
 * 测试步骤->14. 查看已修改的角色信息。
 * 测试预期->14. 页面跳转至角色关联详细信息填写页面，修改后的信息更新完毕。
 * 
 */

public class 验证角色信息修改功能是否可以实现_异常流_1083 extends Selenium_Test_Base {
	public 验证角色信息修改功能是否可以实现_异常流_1083(){
		super();
	}
	
	public 验证角色信息修改功能是否可以实现_异常流_1083(WebDriver driver){
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
		//1
		getElement(ElementEnum_角色信息_362.检索结果第一行勾选框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.检索结果第二行勾选框).click();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_角色信息_362.查看按钮).getCssValue("display"), "none");
		assertEquals(getElement(ElementEnum_角色信息_362.修改按钮).getCssValue("display"), "none");
		assertEquals(getElement(ElementEnum_角色信息_362.新增按钮).getCssValue("display"), "block");
		assertEquals(getElement(ElementEnum_角色信息_362.删除按钮).getCssValue("display"), "block");
		//2
		getElement(ElementEnum_角色信息_362.检索结果第一行勾选框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.检索结果第二行勾选框).click();
		WebDriverConfiguration.operationInterval();
		addNew(a);
				
		getElement(ElementEnum_角色信息_362.修改按钮).click();
		WebDriverConfiguration.operationInterval();
		//3
		getElement(ElementEnum_角色信息_362.修改页面权限中文名称).clear();
		getElement(ElementEnum_角色信息_362.修改页面权限中文名称).sendKeys(" ");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.修改页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("更新角色信息成功");
		//5
		addNew(a);
		getElement(ElementEnum_角色信息_362.修改按钮).click();
		WebDriverConfiguration.operationInterval();
		//6
		getElement(ElementEnum_角色信息_362.修改页面权限中文名称).clear();
		getElement(ElementEnum_角色信息_362.修改页面权限英文名称).clear();
		getElement(ElementEnum_角色信息_362.修改页面权限中文名称).sendKeys(" ");
		getElement(ElementEnum_角色信息_362.修改页面权限英文名称).sendKeys(" ");
		getElement(ElementEnum_角色信息_362.修改页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("更新角色信息成功");
		//8
		addNew(a);
		getElement(ElementEnum_角色信息_362.修改按钮).click();
		WebDriverConfiguration.operationInterval();
		//9
		getElement(ElementEnum_角色信息_362.修改页面权限中文名称).clear();
		getElement(ElementEnum_角色信息_362.修改页面权限英文名称).clear();
		getElement(ElementEnum_角色信息_362.修改页面权限中文名称).sendKeys(" ");
		getElement(ElementEnum_角色信息_362.修改页面权限英文名称).sendKeys(" ");
		getElement(ElementEnum_角色信息_362.修改页面角色选择按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.新增页面角色类型选择按钮其他).click();
		getElement(ElementEnum_角色信息_362.修改页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("更新角色信息成功");
		//11
		addNew(a);
		getElement(ElementEnum_角色信息_362.修改按钮).click();
		WebDriverConfiguration.operationInterval();
		//12
		getElement(ElementEnum_角色信息_362.修改页面全选按钮).click();
		WebDriverConfiguration.operationInterval();
		if(!getElement(ElementEnum_角色信息_362.数据管理第一项).isDisplayed())
			getElement(ElementEnum_角色信息_362.修改页面打开数据管理).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.数据管理第一项).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_角色信息_362.修改页面保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("更新角色信息成功");
		//14
		addNew(a);
		getElement(ElementEnum_角色信息_362.查看按钮).click();
		WebDriverConfiguration.operationInterval();
	}

	private void addNew(CommonOperations_角色信息_362 a) {
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
		return "测试用例id: 1083\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 角色信息(#362)\n"
				+" 用例名称: 验证角色信息修改功能是否可以实现-异常流\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）角色信息界面\n"
				+" 测试步骤->1. 勾选某两项角色信息\n"
				+" 测试预期->1. 上方工具栏中的查看和修改按钮消失，仅剩下新增和删除按钮。\n"
				+" 测试步骤->2. 勾选某一角色信息，点击修改按钮。\n"
				+" 测试预期->2. 页面跳转至角色关联详细信息填写页面，包含已填写信息。\n"
				+" 测试步骤->3. 删除角色关联详细信息中的权限中文名称，点击保存按钮。\n"
				+" 测试预期->3. 页面出现提示信息：更新角色信息成功！\n"
				+" 测试步骤->4. 点击提示信息中的确认按钮。\n"
				+" 测试预期->4. 页面跳转至最初，已勾选的角色信息中的权限中文名称为空。\n"
				+" 测试步骤->5. 勾选某一角色信息，点击修改按钮。\n"
				+" 测试预期->5. 页面跳转至角色关联详细信息填写页面，包含已填写信息。\n"
				+" 测试步骤->6. 删除角色关联详细信息中的权限中文名称和英文名称，点击保存按钮。\n"
				+" 测试预期->6. 页面出现提示信息：更新角色信息成功！\n"
				+" 测试步骤->7. 点击提示信息中的确认按钮。\n"
				+" 测试预期->7. 页面跳转至最初，已勾选的角色信息中的权限中文名称和英文名称为空。\n"
				+" 测试步骤->8. 勾选某一角色信息，点击修改按钮。\n"
				+" 测试预期->8. 页面跳转至角色关联详细信息填写页面，包含已填写信息。\n"
				+" 测试步骤->9. 删除角色关联详细信息中的权限中文名称和英文名称，选择角色类型为其他，点击保存按钮。\n"
				+" 测试预期->9. 页面出现提示信息：更新角色信息成功！\n"
				+" 测试步骤->10. 点击提示信息中的确认按钮。\n"
				+" 测试预期->10. 页面跳转至最初，已勾选的角色信息中的权限中文名称和英文名称为空角色类型为其他。\n"
				+" 测试步骤->11. 勾选某一角色信息，点击修改按钮。\n"
				+" 测试预期->11. 页面跳转至角色关联详细信息填写页面，包含已填写信息。\n"
				+" 测试步骤->12. 修改其中数据管理，法规信息，消息管理，系统管理，车型管理，点击保存按钮。\n"
				+" 测试预期->12. 页面出现提示信息：更新角色信息成功！\n"
				+" 测试步骤->13. 点击提示信息中的确认按钮。\n"
				+" 测试预期->13. 页面跳转至最初。\n"
				+" 测试步骤->14. 查看已修改的角色信息。\n"
				+" 测试预期->14. 页面跳转至角色关联详细信息填写页面，修改后的信息更新完毕。\n"
;
	}

}

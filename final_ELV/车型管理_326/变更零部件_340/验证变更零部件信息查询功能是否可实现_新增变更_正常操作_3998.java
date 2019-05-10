package cn.edu.tju.scs.seql.final_ELV.车型管理_326.变更零部件_340;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3998
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 变更零部件(#340)
 * 用例名称: 验证变更零部件信息查询功能是否可实现-新增变更-正常操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 点击新增变更按钮
 * 测试预期->1. 跳转新页面，含有可填写或查询的变更部件信息
 * 测试步骤->2. 点击新页面中变更前ID的查找按钮
 * 测试预期->2. 跳转至查找MDS信息页面，即可填写查询参数查找MDS信息
 * 测试步骤->3. 勾选未变更过的信息，点击确定按钮
 * 测试预期->3. 回到新增变更页面，变更前ID为刚勾选信息的ID
 * 测试步骤->4. 点击新页面中的变更后ID查找按钮
 * 测试预期->4. 跳转至查找MDS信息页面，即可填写查询参数查找MDS信息
 * 测试步骤->5. 勾选未变更过的信息，点击确定按钮
 * 测试预期->5. 回到新增变更页面，变更后ID为刚勾选信息的ID
 * 测试步骤->6. 点击保存按钮
 * 测试预期->6. 出现提示信息：数据已保存。页面回到零部件变更信息界面，含有刚刚提交的更改信息
 * 
 */

public class 验证变更零部件信息查询功能是否可实现_新增变更_正常操作_3998 extends Selenium_Test_Base {
	
	public 验证变更零部件信息查询功能是否可实现_新增变更_正常操作_3998(){
		super();
	}
	
	public 验证变更零部件信息查询功能是否可实现_新增变更_正常操作_3998(WebDriver driver){
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
		//TODO 新增变更的窗口webdriver无法获取
		
		//Assert.fail("新增变更的窗口webdriver无法获取");
	/*
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_变更零部件_340.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_变更零部件_340.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	*/
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
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
		return "测试用例id: 3998\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 变更零部件(#340)\n"
				+" 用例名称: 验证变更零部件信息查询功能是否可实现-新增变更-正常操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 点击新增变更按钮\n"
				+" 测试预期->1. 跳转新页面，含有可填写或查询的变更部件信息\n"
				+" 测试步骤->2. 点击新页面中变更前ID的查找按钮\n"
				+" 测试预期->2. 跳转至查找MDS信息页面，即可填写查询参数查找MDS信息\n"
				+" 测试步骤->3. 勾选未变更过的信息，点击确定按钮\n"
				+" 测试预期->3. 回到新增变更页面，变更前ID为刚勾选信息的ID\n"
				+" 测试步骤->4. 点击新页面中的变更后ID查找按钮\n"
				+" 测试预期->4. 跳转至查找MDS信息页面，即可填写查询参数查找MDS信息\n"
				+" 测试步骤->5. 勾选未变更过的信息，点击确定按钮\n"
				+" 测试预期->5. 回到新增变更页面，变更后ID为刚勾选信息的ID\n"
				+" 测试步骤->6. 点击保存按钮\n"
				+" 测试预期->6. 出现提示信息：数据已保存。页面回到零部件变更信息界面，含有刚刚提交的更改信息\n"
;
	}

}

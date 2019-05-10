package cn.edu.tju.scs.seql.final_ELV.车型管理_326.扩展零部件_341;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4009
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 扩展零部件(#341)
 * 用例名称: 验证扩展零部件信息查询功能是否可实现-添加-正常操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 点击添加按钮
 * 测试预期->1. 跳转新页面，含有可填写或查询的扩展部件信息
 * 测试步骤->2. 选择查询类型为零部件，表单来源为camds系统，点击查询按钮
 * 测试预期->2. 查询出满足条件的所有MDS信息
 * 测试步骤->3. 填写名称为test，点击查询按钮
 * 测试预期->3. 查询出所有名称中含有test字段的MDS信息
 * 测试步骤->4. 填写供货编号为1，点击查询按钮
 * 测试预期->4. 未查询出符合条件的MDS信息，即不为模糊查询
 * 测试步骤->5. 选择查询类型为零部件，表单来源为camds系统，填写名称为test，点击查询按钮
 * 测试预期->5. 查询出所有满足条件的名称中含有test字段的MDS信息
 * 测试步骤->6. 勾选一条MDS信息，点击保存按钮
 * 测试预期->6. 出现提示信息：数据已保存。页面回到零部件扩展信息界面，含有刚刚提交的提交信息
 * 
 */

public class 验证扩展零部件信息查询功能是否可实现_添加_正常操作_4009 extends Selenium_Test_Base {
	
	public 验证扩展零部件信息查询功能是否可实现_添加_正常操作_4009(){
		super();
	}
	
	public 验证扩展零部件信息查询功能是否可实现_添加_正常操作_4009(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_扩展零部件_341.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_扩展零部件_341.rightFrame);
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
	/*
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_扩展零部件_341.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_扩展零部件_341.二级目录名称).click();
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
		return "测试用例id: 4009\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 扩展零部件(#341)\n"
				+" 用例名称: 验证扩展零部件信息查询功能是否可实现-添加-正常操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 点击添加按钮\n"
				+" 测试预期->1. 跳转新页面，含有可填写或查询的扩展部件信息\n"
				+" 测试步骤->2. 选择查询类型为零部件，表单来源为camds系统，点击查询按钮\n"
				+" 测试预期->2. 查询出满足条件的所有MDS信息\n"
				+" 测试步骤->3. 填写名称为test，点击查询按钮\n"
				+" 测试预期->3. 查询出所有名称中含有test字段的MDS信息\n"
				+" 测试步骤->4. 填写供货编号为1，点击查询按钮\n"
				+" 测试预期->4. 未查询出符合条件的MDS信息，即不为模糊查询\n"
				+" 测试步骤->5. 选择查询类型为零部件，表单来源为camds系统，填写名称为test，点击查询按钮\n"
				+" 测试预期->5. 查询出所有满足条件的名称中含有test字段的MDS信息\n"
				+" 测试步骤->6. 勾选一条MDS信息，点击保存按钮\n"
				+" 测试预期->6. 出现提示信息：数据已保存。页面回到零部件扩展信息界面，含有刚刚提交的提交信息\n"
;
	}

}

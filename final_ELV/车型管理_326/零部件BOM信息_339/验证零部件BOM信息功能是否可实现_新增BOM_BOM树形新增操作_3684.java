package cn.edu.tju.scs.seql.final_ELV.车型管理_326.零部件BOM信息_339;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3684
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件BOM信息(#339)
 * 用例名称: 验证零部件BOM信息功能是否可实现-新增BOM-BOM树形新增操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 单击左键选择一条信息，点击修改BOM按钮
 * 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。
 * 测试步骤->2. 点击BOM树形左上角的新增按钮
 * 测试预期->2. 出现新增界面，含有各项需要填写的新增信息
 * 测试步骤->3. 点击确认按钮
 * 测试预期->3. 出现提示信息：供货编号必须为空
 * 测试步骤->4. 填写供货编号为11，点击确认按钮
 * 测试预期->4. 新增节点为：新增节点（11），为原有子节点下的第一节点
 * 测试步骤->5. 点击BOM树形左上角的新增按钮
 * 测试预期->5. 出现新增界面，含有各项需要填写的新增信息
 * 测试步骤->6. 填写名称为测试，数量为2，质量为10，责任人为admin，供货编号为13，点击确认按钮
 * 测试预期->6. 新增节点为：测试（13），为原有子节点下的第二节点
 * 测试步骤->7. 点击BOM树形左上角的新增按钮
 * 测试预期->7. 出现新增界面，含有各项需要填写的新增信息
 * 测试步骤->8. 点击取消按钮
 * 测试预期->8. 无新增节点
 * 
 */

public class 验证零部件BOM信息功能是否可实现_新增BOM_BOM树形新增操作_3684 extends Selenium_Test_Base {
	
	public 验证零部件BOM信息功能是否可实现_新增BOM_BOM树形新增操作_3684(){
		super();
	}
	
	public 验证零部件BOM信息功能是否可实现_新增BOM_BOM树形新增操作_3684(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_零部件BOM信息_339.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_零部件BOM信息_339.rightFrame);
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
		//TODO 用例重复
		
		//Assert.fail("用例重复");
	/*
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件BOM信息_339.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件BOM信息_339.二级目录名称).click();
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
		return "测试用例id: 3684\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件BOM信息(#339)\n"
				+" 用例名称: 验证零部件BOM信息功能是否可实现-新增BOM-BOM树形新增操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 单击左键选择一条信息，点击修改BOM按钮\n"
				+" 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。\n"
				+" 测试步骤->2. 点击BOM树形左上角的新增按钮\n"
				+" 测试预期->2. 出现新增界面，含有各项需要填写的新增信息\n"
				+" 测试步骤->3. 点击确认按钮\n"
				+" 测试预期->3. 出现提示信息：供货编号必须为空\n"
				+" 测试步骤->4. 填写供货编号为11，点击确认按钮\n"
				+" 测试预期->4. 新增节点为：新增节点（11），为原有子节点下的第一节点\n"
				+" 测试步骤->5. 点击BOM树形左上角的新增按钮\n"
				+" 测试预期->5. 出现新增界面，含有各项需要填写的新增信息\n"
				+" 测试步骤->6. 填写名称为测试，数量为2，质量为10，责任人为admin，供货编号为13，点击确认按钮\n"
				+" 测试预期->6. 新增节点为：测试（13），为原有子节点下的第二节点\n"
				+" 测试步骤->7. 点击BOM树形左上角的新增按钮\n"
				+" 测试预期->7. 出现新增界面，含有各项需要填写的新增信息\n"
				+" 测试步骤->8. 点击取消按钮\n"
				+" 测试预期->8. 无新增节点\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.车型管理_326.零部件BOM信息_339;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3691
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件BOM信息(#339)
 * 用例名称: 验证零部件BOM信息功能是否可实现-新增BOM-基础信息操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 单击左键选择一条信息，点击新增BOM按钮
 * 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。
 * 测试步骤->2. 点击基础信息右上角的保存按钮
 * 测试预期->2. 页面等待后保存当前信息
 * 测试步骤->3. 点击基础信息右上角的导入按钮
 * 测试预期->3. 出现新页面，页面可选择文件后进行资源上传
 * 测试步骤->4. 点击选取文件按钮，选取任意.xlsx.doc等文件，点击导入
 * 测试预期->4. 出现提示信息：文件格式错误！
 * 测试步骤->5. 点击选取文件按钮，选取任意.xlsx.doc等文件，点击取消
 * 测试预期->5. 页面被关闭，没有上传导入任何信息
 * 
 */

public class 验证零部件BOM信息功能是否可实现_新增BOM_基础信息操作_3691 extends Selenium_Test_Base {
	
	public 验证零部件BOM信息功能是否可实现_新增BOM_基础信息操作_3691(){
		super();
	}
	
	public 验证零部件BOM信息功能是否可实现_新增BOM_基础信息操作_3691(WebDriver driver){
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
		//TODO 涉及到文件导入操作，暂时无法编写
		
		//Assert.fail("涉及到文件导入操作，暂时无法编写");
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
		return "测试用例id: 3691\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件BOM信息(#339)\n"
				+" 用例名称: 验证零部件BOM信息功能是否可实现-新增BOM-基础信息操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 单击左键选择一条信息，点击新增BOM按钮\n"
				+" 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。\n"
				+" 测试步骤->2. 点击基础信息右上角的保存按钮\n"
				+" 测试预期->2. 页面等待后保存当前信息\n"
				+" 测试步骤->3. 点击基础信息右上角的导入按钮\n"
				+" 测试预期->3. 出现新页面，页面可选择文件后进行资源上传\n"
				+" 测试步骤->4. 点击选取文件按钮，选取任意.xlsx.doc等文件，点击导入\n"
				+" 测试预期->4. 出现提示信息：文件格式错误！\n"
				+" 测试步骤->5. 点击选取文件按钮，选取任意.xlsx.doc等文件，点击取消\n"
				+" 测试预期->5. 页面被关闭，没有上传导入任何信息\n"
;
	}

}

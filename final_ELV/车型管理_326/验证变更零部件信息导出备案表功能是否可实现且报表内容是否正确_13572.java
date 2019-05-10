package cn.edu.tju.scs.seql.final_ELV.车型管理_326;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 13572
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型管理(#326)
 * 用例名称: 验证变更零部件信息导出备案表功能是否可实现且报表内容是否正确
 * 前置条件: 能正常进入车型管理的变更零部件信息模块
 * 测试步骤->1. 任选一条具有零部件变更信息的车型信息，点击确定按钮
 * 测试预期->1. 跳转至新页面，页面包含所选信息的零部件变更信息，可输入查询参数来查询变更信息。
 * 测试步骤->2. 点击左上角的导出按钮
 * 测试预期->2. 所有变更信息被下载到本地，文件为.xlsx文件
 * 测试步骤->3. 点击查看导出的报表内容
 * 测试预期->3. 导出内容为：整车生产企业指定因变更而更换的零部件名称（包括更换前后的零部件名称），基于零部件名称，由系统自动导出该零部件的零部件编号、供应商名称及材料数据报表编号/版本信息。
 * 
 */

public class 验证变更零部件信息导出备案表功能是否可实现且报表内容是否正确_13572 extends Selenium_Test_Base {
	
	public 验证变更零部件信息导出备案表功能是否可实现且报表内容是否正确_13572(){
		super();
	}
	
	public 验证变更零部件信息导出备案表功能是否可实现且报表内容是否正确_13572(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_车型管理_326.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_车型管理_326.rightFrame);
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
		getElement(ElementEnum_车型管理_326.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型管理_326.二级目录名称).click();
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
		return "测试用例id: 13572\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型管理(#326)\n"
				+" 用例名称: 验证变更零部件信息导出备案表功能是否可实现且报表内容是否正确\n"
				+" 前置条件: 能正常进入车型管理的变更零部件信息模块\n"
				+" 测试步骤->1. 任选一条具有零部件变更信息的车型信息，点击确定按钮\n"
				+" 测试预期->1. 跳转至新页面，页面包含所选信息的零部件变更信息，可输入查询参数来查询变更信息。\n"
				+" 测试步骤->2. 点击左上角的导出按钮\n"
				+" 测试预期->2. 所有变更信息被下载到本地，文件为.xlsx文件\n"
				+" 测试步骤->3. 点击查看导出的报表内容\n"
				+" 测试预期->3. 导出内容为：整车生产企业指定因变更而更换的零部件名称（包括更换前后的零部件名称），基于零部件名称，由系统自动导出该零部件的零部件编号、供应商名称及材料数据报表编号/版本信息。\n"
;
	}

}

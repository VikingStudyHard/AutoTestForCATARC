package cn.edu.tju.scs.seql.final_ELV.综合分析_327.零部件RRR计算_345;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4237
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件RRR计算(#345)
 * 用例名称: 验证零部件RRR计算中标注功能是否可实现-基本信息操作-回收利用率报告
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 单击左键选择一条MDS信息，点击标注按钮
 * 测试预期->1. 跳转至新页面，页面包含零部件RRR计算基础信息表格
 * 测试步骤->2. 点击基本信息界面右上角的回收利用率报告按钮
 * 测试预期->2. 跳转至查找MDS信息页面，含有可以填写参数来查找的功能
 * 测试步骤->3. 选取任意一条查找到的MDS信息，点击确定按钮
 * 测试预期->3. 页面被正常关闭，出现进度条：RRR计算...，进度条结束后，所选择信息的回收利用率报告成功下载到本地，文件格式为.xlsx
 * 
 */

public class 验证零部件RRR计算中标注功能是否可实现_基本信息操作_回收利用率报告_4237 extends Selenium_Test_Base {
	
	public 验证零部件RRR计算中标注功能是否可实现_基本信息操作_回收利用率报告_4237(){
		super();
	}
	
	public 验证零部件RRR计算中标注功能是否可实现_基本信息操作_回收利用率报告_4237(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_零部件RRR计算_345.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_零部件RRR计算_345.rightFrame);
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
		getElement(ElementEnum_零部件RRR计算_345.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.二级目录名称).click();
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
		return "测试用例id: 4237\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件RRR计算(#345)\n"
				+" 用例名称: 验证零部件RRR计算中标注功能是否可实现-基本信息操作-回收利用率报告\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 单击左键选择一条MDS信息，点击标注按钮\n"
				+" 测试预期->1. 跳转至新页面，页面包含零部件RRR计算基础信息表格\n"
				+" 测试步骤->2. 点击基本信息界面右上角的回收利用率报告按钮\n"
				+" 测试预期->2. 跳转至查找MDS信息页面，含有可以填写参数来查找的功能\n"
				+" 测试步骤->3. 选取任意一条查找到的MDS信息，点击确定按钮\n"
				+" 测试预期->3. 页面被正常关闭，出现进度条：RRR计算...，进度条结束后，所选择信息的回收利用率报告成功下载到本地，文件格式为.xlsx\n"
;
	}

}

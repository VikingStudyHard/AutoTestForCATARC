package cn.edu.tju.scs.seql.final_ELV.综合分析_327.零部件RRR计算_345;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4244
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件RRR计算(#345)
 * 用例名称: 验证零部件RRR计算中标注功能是否可实现-树形图操作
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 单击左键选择一条MDS信息，点击确定按钮
 * 测试预期->1. 跳转至新页面，页面包含零部件RRR计算基础信息表格
 * 测试步骤->2. 点击BOM树形图界面右上角的刷新按钮
 * 测试预期->2. BOM树形图页面被刷新
 * 测试步骤->3. 点击BOM树形图界面右上角的打开树按钮
 * 测试预期->3. BOM树形图页面被展开
 * 测试步骤->4. 点击BOM树形图界面右上角的关闭树按钮
 * 测试预期->4. BOM树形图页面被关闭
 * 测试步骤->5. 点击BOM树形图界面母树左侧的加号键
 * 测试预期->5. BOM树形图页面被展开
 * 测试步骤->6. 点击BOM树形图界面母树左侧的减号键
 * 测试预期->6. BOM树形图页面被关闭
 * 
 */

public class 验证零部件RRR计算中标注功能是否可实现_树形图操作_4244 extends Selenium_Test_Base {
	
	public 验证零部件RRR计算中标注功能是否可实现_树形图操作_4244(){
		super();
	}
	
	public 验证零部件RRR计算中标注功能是否可实现_树形图操作_4244(WebDriver driver){
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
		
	
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_零部件RRR计算_345.MSD信息选择按钮1).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.MSD信息标注按钮).click();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_零部件RRR计算_345.标注页面跳转标题).getText(),"MDS树形");
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.标注页面刷新按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_零部件RRR计算_345.标注页面打开树按钮).click();
		WebDriverConfiguration.operationInterval();
		List<WebElement> pictureopenlist = getElements(ElementEnum_零部件RRR计算_345.标注打开树所有行);
		assertTrue( pictureopenlist.size()>2,"没有打开");
		
		//关闭图片
		getElement(ElementEnum_零部件RRR计算_345.标注页面关闭树按钮).click();
		WebDriverConfiguration.operationInterval();
		List<WebElement>  picturecloselist = getElements(ElementEnum_零部件RRR计算_345.标注打开树所有行);
		assertTrue( picturecloselist.size()==2,"没有关闭");
		
		//加号标志
        getElement(ElementEnum_零部件RRR计算_345.标注符号树操作).click();
		WebDriverConfiguration.operationInterval();
		List<WebElement> openlist = getElements(ElementEnum_零部件RRR计算_345.标注打开树所有行);
		assertTrue( openlist.size()>2,"没有打开");
				
		//减号标志
		getElement(ElementEnum_零部件RRR计算_345.标注符号树操作).click();
		WebDriverConfiguration.operationInterval();
		List<WebElement> closelist = getElements(ElementEnum_零部件RRR计算_345.标注打开树所有行);
		assertTrue(closelist.size()==2,"没有关闭");
		
		
		
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
		return "测试用例id: 4244\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件RRR计算(#345)\n"
				+" 用例名称: 验证零部件RRR计算中标注功能是否可实现-树形图操作\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 单击左键选择一条MDS信息，点击确定按钮\n"
				+" 测试预期->1. 跳转至新页面，页面包含零部件RRR计算基础信息表格\n"
				+" 测试步骤->2. 点击BOM树形图界面右上角的刷新按钮\n"
				+" 测试预期->2. BOM树形图页面被刷新\n"
				+" 测试步骤->3. 点击BOM树形图界面右上角的打开树按钮\n"
				+" 测试预期->3. BOM树形图页面被展开\n"
				+" 测试步骤->4. 点击BOM树形图界面右上角的关闭树按钮\n"
				+" 测试预期->4. BOM树形图页面被关闭\n"
				+" 测试步骤->5. 点击BOM树形图界面母树左侧的加号键\n"
				+" 测试预期->5. BOM树形图页面被展开\n"
				+" 测试步骤->6. 点击BOM树形图界面母树左侧的减号键\n"
				+" 测试预期->6. BOM树形图页面被关闭\n"
;
	}

}

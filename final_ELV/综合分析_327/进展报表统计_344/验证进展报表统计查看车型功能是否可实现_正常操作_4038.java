package cn.edu.tju.scs.seql.final_ELV.综合分析_327.进展报表统计_344;

import static org.testng.Assert.*;

import java.sql.Date;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4038
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 进展报表统计(#344)
 * 用例名称: 验证进展报表统计查看车型功能是否可实现-正常操作
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 点击进展报表统计的车型信息版面中的查看车型按钮
 * 测试预期->1. 出现提示信息：请选择一条记录
 * 测试步骤->2. 单击左键选择一条车型信息，点击查看车型按钮
 * 测试预期->2. 跳出新页面，页面名称为查看车型，含有该车型的各项信息内容，含有已填写的参数信息
 * 测试步骤->3. 点击新页面右下角的关闭按钮
 * 测试预期->3. 查看车型页面被正常关闭，页面回到进展报表统计首页
 * 
 */

public class 验证进展报表统计查看车型功能是否可实现_正常操作_4038 extends Selenium_Test_Base {
	
	public 验证进展报表统计查看车型功能是否可实现_正常操作_4038(){
		super();
	}
	
	public 验证进展报表统计查看车型功能是否可实现_正常操作_4038(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_进展报表统计_344.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_进展报表统计_344.rightFrame);
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
		getElement(ElementEnum_进展报表统计_344.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_进展报表统计_344.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		String bcname = getElement(ElementEnum_进展报表统计_344.表格第一行品牌中文名称).getText();
		String bename = getElement(ElementEnum_进展报表统计_344.表格第一行品牌英文名称).getText();
		String ccname = getElement(ElementEnum_进展报表统计_344.表格第一行车型中文名称).getText();
		String cename = getElement(ElementEnum_进展报表统计_344.表格第一行车型英文名称).getText();
		getElement(ElementEnum_进展报表统计_344.表格第一行).click();
		getElement(ElementEnum_进展报表统计_344.查看车型按钮).click();
		assertEquals(bcname, getElement(ElementEnum_进展报表统计_344.品牌中文名称).getAttribute("value"));
		assertEquals(bename, getElement(ElementEnum_进展报表统计_344.品牌英文名称).getAttribute("value"));
		assertEquals(ccname, getElement(ElementEnum_进展报表统计_344.车型中文名称).getAttribute("value"));
		assertEquals(cename, getElement(ElementEnum_进展报表统计_344.车型英文名称).getAttribute("value"));
		assertNotEquals("", getElement(ElementEnum_进展报表统计_344.车型编号).getAttribute("value"));
		String weight = getElement(ElementEnum_进展报表统计_344.整车质量).getAttribute("value");
		boolean isWeightLegal = Double.valueOf(weight) == null ? false : true;
		assertNotEquals("", weight);
		assertTrue(isWeightLegal);
		String date = getElement(ElementEnum_进展报表统计_344.生产年份).getAttribute("value");
		boolean isDateLegal = Date.valueOf(date) == null ? false : true;
		assertNotEquals("", date);
		assertTrue(isDateLegal);
		String l = getElement(ElementEnum_进展报表统计_344.长).getAttribute("value");
		String w = getElement(ElementEnum_进展报表统计_344.宽).getAttribute("value");
		String h = getElement(ElementEnum_进展报表统计_344.高).getAttribute("value");
		boolean isLLegal = Double.valueOf(l) == null ? false : true;
		boolean isWLegal = Double.valueOf(w) == null ? false : true;
		boolean isHLegal = Double.valueOf(h) == null ? false : true;
		assertNotEquals("", l);
		assertNotEquals("", w);
		assertNotEquals("", h);
		assertTrue(isLLegal);
		assertTrue(isWLegal);
		assertTrue(isHLegal);
		getElement(ElementEnum_进展报表统计_344.关闭按钮).click();
	}

	
	public String getDescription(){
		return "测试用例id: 4038\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 进展报表统计(#344)\n"
				+" 用例名称: 验证进展报表统计查看车型功能是否可实现-正常操作\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 点击进展报表统计的车型信息版面中的查看车型按钮\n"
				+" 测试预期->1. 出现提示信息：请选择一条记录\n"
				+" 测试步骤->2. 单击左键选择一条车型信息，点击查看车型按钮\n"
				+" 测试预期->2. 跳出新页面，页面名称为查看车型，含有该车型的各项信息内容，含有已填写的参数信息\n"
				+" 测试步骤->3. 点击新页面右下角的关闭按钮\n"
				+" 测试预期->3. 查看车型页面被正常关闭，页面回到进展报表统计首页\n"
;
	}

}

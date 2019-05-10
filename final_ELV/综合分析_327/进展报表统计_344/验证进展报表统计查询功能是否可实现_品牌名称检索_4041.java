package cn.edu.tju.scs.seql.final_ELV.综合分析_327.进展报表统计_344;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4041
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 进展报表统计(#344)
 * 用例名称: 验证进展报表统计查询功能是否可实现-品牌名称检索 
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 在进展报表统计的查询条件：品牌名称中填写1，点击检索按钮
 * 测试预期->1. 品牌（中文或英文）名称中含有字段1的所有车型信息被检索出来
 * 测试步骤->2. 在进展报表统计的查询条件：品牌名称中填写ca，点击检索按钮
 * 测试预期->2. 品牌（中文或英文）名称中含有字段ca的所有车型信息被检索出来
 * 测试步骤->3. 在进展报表统计的查询条件：品牌名称中填写卡达克，点击检索按钮
 * 测试预期->3. 品牌（中文或英文）名称中含有字段卡达克的所有车型信息被检索出来
 * 
 */

public class 验证进展报表统计查询功能是否可实现_品牌名称检索_4041 extends Selenium_Test_Base {
	
	public 验证进展报表统计查询功能是否可实现_品牌名称检索_4041(){
		super();
	}
	
	public 验证进展报表统计查询功能是否可实现_品牌名称检索_4041(WebDriver driver){
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
		query("1");
		query("ca");
		query("卡达克");
	}
	
	private void query(String word){
		getElement(ElementEnum_进展报表统计_344.品牌名称查询).clear();
		getElement(ElementEnum_进展报表统计_344.品牌名称查询).sendKeys(word);
		getElement(ElementEnum_进展报表统计_344.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		List<WebElement> eles = getElements(ElementEnum_进展报表统计_344.表格所有项);
		if (eles.size() == 0)
			return;
		for (int i = 1; i < eles.size(); i++){
			String cname = driver.findElement(By.xpath(ElementEnum_进展报表统计_344.表格第一行品牌中文名称.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			String ename = driver.findElement(By.xpath(ElementEnum_进展报表统计_344.表格第一行品牌英文名称.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			//assertTrue(cname.equals(word) || ename.equals(word));
			assertTrue(cname.contains(word) || ename.contains(word));
		}
	}

	
	public String getDescription(){
		return "测试用例id: 4041\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 进展报表统计(#344)\n"
				+" 用例名称: 验证进展报表统计查询功能是否可实现-品牌名称检索 \n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 在进展报表统计的查询条件：品牌名称中填写1，点击检索按钮\n"
				+" 测试预期->1. 品牌（中文或英文）名称中含有字段1的所有车型信息被检索出来\n"
				+" 测试步骤->2. 在进展报表统计的查询条件：品牌名称中填写ca，点击检索按钮\n"
				+" 测试预期->2. 品牌（中文或英文）名称中含有字段ca的所有车型信息被检索出来\n"
				+" 测试步骤->3. 在进展报表统计的查询条件：品牌名称中填写卡达克，点击检索按钮\n"
				+" 测试预期->3. 品牌（中文或英文）名称中含有字段卡达克的所有车型信息被检索出来\n"
;
	}

}

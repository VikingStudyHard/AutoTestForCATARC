package cn.edu.tju.scs.seql.final_ELV.综合分析_327.禁限用物质豁免分析_347;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.有害物质分析_342.ElementEnum_有害物质分析_342;

/**
 * 测试用例id: 4029
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 禁限用物质豁免分析(#347)
 * 用例名称: 验证禁限用物质豁免分析查询功能是否可实现-车型名称检索 
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 在禁限用物质豁免分析的查询条件：车型名称中填写1，点击检索按钮
 * 测试预期->1. 车型名称（中文或英文）名称中含有1字段的所有禁限用物质豁免分析信息被检索出来
 * 测试步骤->2. 在禁限用物质豁免分析的查询条件：车型名称中填写ELVT，点击检索按钮
 * 测试预期->2. 车型名称（中文或英文）名称中含有ELVT字段的所有禁限用物质豁免分析信息被检索出来
 * 测试步骤->3. 在禁限用物质豁免分析的查询条件：车型名称中填写ELVTEST，点击检索按钮
 * 测试预期->3. 车型名称（中文或英文）名称中为ELVTEST的所有禁限用物质豁免分析信息被检索出来
 * 
 */

public class 验证禁限用物质豁免分析查询功能是否可实现_车型名称检索_4029 extends Selenium_Test_Base {
	
	public 验证禁限用物质豁免分析查询功能是否可实现_车型名称检索_4029(){
		super();
	}
	
	public 验证禁限用物质豁免分析查询功能是否可实现_车型名称检索_4029(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_禁限用物质豁免分析_347.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_禁限用物质豁免分析_347.rightFrame);
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
		getElement(ElementEnum_禁限用物质豁免分析_347.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_禁限用物质豁免分析_347.二级目录名称).click();
		WebDriverConfiguration.operationInterval();

	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */

	public void testQueryCarName(String name){
		getElement(ElementEnum_禁限用物质豁免分析_347.车型名称输入框).clear();
		getElement(ElementEnum_禁限用物质豁免分析_347.车型名称输入框).sendKeys(name);
		getElement(ElementEnum_禁限用物质豁免分析_347.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		List<WebElement> eles = getElements(ElementEnum_禁限用物质豁免分析_347.检索结果所有行);
		// 检查查询结果中是否包含所查关键字
		for(int i = 1;i < eles.size();i++){
			String chXpath = ElementEnum_禁限用物质豁免分析_347.检索结果第一行车型中文名称.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String chProduceName = driver.findElement(By.xpath(chXpath)).getText();
			String enXpath = ElementEnum_禁限用物质豁免分析_347.检索结果第一行车型英文名称.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String enProduceName = driver.findElement(By.xpath(enXpath)).getText();
			assertTrue(chProduceName.contains(name)||enProduceName.contains(name),"查询结果不符合要求");
		}
		WebDriverConfiguration.operationInterval();
		
	}
	public void detailedOperation(){
		testQueryCarName("1");
		testQueryCarName("ELVT");
		testQueryCarName("ELVTEST");
	
	}

	
	public String getDescription(){
		return "测试用例id: 4029\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 禁限用物质豁免分析(#347)\n"
				+" 用例名称: 验证禁限用物质豁免分析查询功能是否可实现-车型名称检索 \n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 在禁限用物质豁免分析的查询条件：车型名称中填写1，点击检索按钮\n"
				+" 测试预期->1. 车型名称（中文或英文）名称中含有1字段的所有禁限用物质豁免分析信息被检索出来\n"
				+" 测试步骤->2. 在禁限用物质豁免分析的查询条件：车型名称中填写ELVT，点击检索按钮\n"
				+" 测试预期->2. 车型名称（中文或英文）名称中含有ELVT字段的所有禁限用物质豁免分析信息被检索出来\n"
				+" 测试步骤->3. 在禁限用物质豁免分析的查询条件：车型名称中填写ELVTEST，点击检索按钮\n"
				+" 测试预期->3. 车型名称（中文或英文）名称中为ELVTEST的所有禁限用物质豁免分析信息被检索出来\n"
;
	}

}

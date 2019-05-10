package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型BOM信息_337;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3642
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型BOM信息(#337)
 * 用例名称: 验证车型BOM信息查询功能是否可实现-通用名称检索
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 在车型BOM信息的查询条件：通用名称中填写1，点击检索按钮
 * 测试预期->1. 车型中文（或英文）名称中含有字段1的所有车型BOM信息被检索出来
 * 测试步骤->2. 在车型BOM信息的查询条件：通用名称中填写ca，点击检索按钮
 * 测试预期->2. 车型中文（或英文）名称中含有字段ca的所有车型BOM信息被检索出来
 * 测试步骤->3. 在车型BOM信息的查询条件：通用名称中填写抱抱熊，点击检索按钮
 * 测试预期->3. 车型中文（或英文）名称中含有字段抱抱熊的所有车型BOM信息被检索出来
 * 
 */

public class 验证车型BOM信息查询功能是否可实现_通用名称检索_3642 extends Selenium_Test_Base {
	
	public 验证车型BOM信息查询功能是否可实现_通用名称检索_3642(){
		super();
	}
	
	public 验证车型BOM信息查询功能是否可实现_通用名称检索_3642(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_车型BOM信息_337.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_车型BOM信息_337.rightFrame);
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
		getElement(ElementEnum_车型BOM信息_337.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void testCarName(String name){
		getElement(ElementEnum_车型BOM信息_337.通用名称输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.通用名称输入框).sendKeys(name);
		getElement(ElementEnum_车型BOM信息_337.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		List<WebElement> eles = getElements(ElementEnum_车型BOM信息_337.检索结果所有行);
		// 检查查询结果中是否包含所查关键字
		for(int i = 1;i < eles.size();i++){
			String chXpath = ElementEnum_车型BOM信息_337.检索结果第一行车型中文名称.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String chProduceName = driver.findElement(By.xpath(chXpath)).getText();
			String enXpath = ElementEnum_车型BOM信息_337.检索结果第一行车型英文名称.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String enProduceName = driver.findElement(By.xpath(enXpath)).getText();
			assertTrue(chProduceName.contains(name)||enProduceName.contains(name),"查询结果不符合要求");
		}
		WebDriverConfiguration.operationInterval();
		
	}
	public void detailedOperation(){
		testCarName("1");
		testCarName("ca");
		testCarName("抱抱熊");
	
	}

	
	public String getDescription(){
		return "测试用例id: 3642\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型BOM信息(#337)\n"
				+" 用例名称: 验证车型BOM信息查询功能是否可实现-通用名称检索\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 在车型BOM信息的查询条件：通用名称中填写1，点击检索按钮\n"
				+" 测试预期->1. 车型中文（或英文）名称中含有字段1的所有车型BOM信息被检索出来\n"
				+" 测试步骤->2. 在车型BOM信息的查询条件：通用名称中填写ca，点击检索按钮\n"
				+" 测试预期->2. 车型中文（或英文）名称中含有字段ca的所有车型BOM信息被检索出来\n"
				+" 测试步骤->3. 在车型BOM信息的查询条件：通用名称中填写抱抱熊，点击检索按钮\n"
				+" 测试预期->3. 车型中文（或英文）名称中含有字段抱抱熊的所有车型BOM信息被检索出来\n"
;
	}

}

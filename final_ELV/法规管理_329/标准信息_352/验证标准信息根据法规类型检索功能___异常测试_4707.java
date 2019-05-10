package cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4707
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 标准信息(#352)
 * 用例名称: 验证标准信息根据法规类型检索功能   异常测试
 * 前置条件: 顺利进入标准信息界面
 * 测试步骤->1. 点击”标准信息“，在法规类型的下拉列表中选择一项，例如”国家标准“，点击”检索“按钮
 * 测试预期->1. 系统会将法规类型为”国家标准“的全部信息列出
 * 测试步骤->2. 然后继续输入检索条件——法规名称，例如“123”。
 * 测试预期->2. 系统会将法规名称为“123”并且法规类型为“国家标准”的全部信息列出
 * 测试步骤->3. 再次选择法规名称输入框，将检索条件删除，法规类型选择”国家标准“，点击检索
 * 测试预期->3. 系统会将法规类型为”国家标准“的全部信息列出，结果同第一步的预期
 * 
 */

public class 验证标准信息根据法规类型检索功能___异常测试_4707 extends Selenium_Test_Base {
	
	public 验证标准信息根据法规类型检索功能___异常测试_4707(){
		super();
	}
	
	public 验证标准信息根据法规类型检索功能___异常测试_4707(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_标准信息_352.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_标准信息_352.rightFrame);
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
		getElement(ElementEnum_标准信息_352.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_标准信息_352.法规类型下拉按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.法规类型下拉选项_国家标准).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		List<WebElement> eles = getElements(ElementEnum_标准信息_352.检索结果所有行);
		List<String> result = new ArrayList<String>();
		for(int i = 1;i < eles.size();i++){
			String xpath = ElementEnum_标准信息_352.检索结果第一行法规名称.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String name = driver.findElement(By.xpath(xpath)).getText();
			result.add(name);
		}
		
		getElement(ElementEnum_标准信息_352.法规名称输入框).clear();
		getElement(ElementEnum_标准信息_352.法规名称输入框).sendKeys("123");
		getElement(ElementEnum_标准信息_352.法规类型下拉按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.法规类型下拉选项_国家标准).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		
		getElement(ElementEnum_标准信息_352.法规名称输入框).clear();
		getElement(ElementEnum_标准信息_352.法规类型下拉按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.法规类型下拉选项_国家标准).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		eles = getElements(ElementEnum_标准信息_352.检索结果所有行);
		for(int i = 1;i < eles.size();i++){
			String xpath = ElementEnum_标准信息_352.检索结果第一行法规名称.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String name = driver.findElement(By.xpath(xpath)).getText();
			result.add(name);
			assertEquals(result.get(i-1), name);
		}
	}

	
	public String getDescription(){
		return "测试用例id: 4707\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 标准信息(#352)\n"
				+" 用例名称: 验证标准信息根据法规类型检索功能   异常测试\n"
				+" 前置条件: 顺利进入标准信息界面\n"
				+" 测试步骤->1. 点击”标准信息“，在法规类型的下拉列表中选择一项，例如”国家标准“，点击”检索“按钮\n"
				+" 测试预期->1. 系统会将法规类型为”国家标准“的全部信息列出\n"
				+" 测试步骤->2. 然后继续输入检索条件——法规名称，例如“123”。\n"
				+" 测试预期->2. 系统会将法规名称为“123”并且法规类型为“国家标准”的全部信息列出\n"
				+" 测试步骤->3. 再次选择法规名称输入框，将检索条件删除，法规类型选择”国家标准“，点击检索\n"
				+" 测试预期->3. 系统会将法规类型为”国家标准“的全部信息列出，结果同第一步的预期\n"
;
	}

}

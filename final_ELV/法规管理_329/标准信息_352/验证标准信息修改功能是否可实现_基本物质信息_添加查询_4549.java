package cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352;

import static org.testng.Assert.assertEquals;

import java.util.List;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4549
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 标准信息(#352)
 * 用例名称: 验证标准信息修改功能是否可实现-基本物质信息-添加查询
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 选择一条信息，点击页面中的修改按钮
 * 测试预期->1. 跳转至新页面，页面为所选标准信息的详细内容界面，可新增法规名称，选择法规类型，选择基本物质信息。
 * 测试步骤->2. 点击基本物质信息中的添加物质按钮。
 * 测试预期->2. 跳转至新页面，页面为添加物质的详细内容界面，可填参数查找所需物质。
 * 测试步骤->3. 点击查询按钮
 * 测试预期->3. 页面刷新，显示所有物质信息
 * 测试步骤->4. 选择物质分类为：铅及其化合物，中文名称填写：二，点击查询按钮
 * 测试预期->4. 无满足条件的信息被查询出来
 * 测试步骤->5. 中文名称填写：六氟丙烷，点击查询按钮
 * 测试预期->5. 中文名称为六氟丙烷的物质被检测出来，即中文名称查询为精确查询
 * 测试步骤->6. 英文名称填写：2-phen，点击查询按钮
 * 测试预期->6. 无满足条件的信息被查询出来
 * 测试步骤->7. 英文名称填写：2-phenylimidazole，点击查询按钮
 * 测试预期->7. 英文名称为2-phenylimidazole的物质被检测出来，即中文名称查询为精确查询
 * 
 */

public class 验证标准信息修改功能是否可实现_基本物质信息_添加查询_4549 extends Selenium_Test_Base {
	
	public 验证标准信息修改功能是否可实现_基本物质信息_添加查询_4549(){
		super();
	}
	
	public 验证标准信息修改功能是否可实现_基本物质信息_添加查询_4549(WebDriver driver){
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
		CommonOperations_标准信息_352 a = new CommonOperations_标准信息_352(driver);
		a.verifyOnlyOneMyRecord();
		a.searchMyRecord();
		getElement(ElementEnum_标准信息_352.检索结果第一行法规名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.修改按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_标准信息_352.查看窗口添加物质按钮).click();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadFirst();
		getElement(ElementEnum_标准信息_352.添加物质窗口查询按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadFirst();
		
		getElement(ElementEnum_标准信息_352.添加物质窗口物质分类下拉按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.添加物质窗口物质分类下拉选项_铅及化合物).click();
		getElement(ElementEnum_标准信息_352.添加物质窗口中文名称输入框).clear();
		getElement(ElementEnum_标准信息_352.添加物质窗口中文名称输入框).sendKeys("二");
		getElement(ElementEnum_标准信息_352.添加物质窗口查询按钮).click();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadFirst();
		
		List<WebElement> eles = getElements(ElementEnum_标准信息_352.添加物质窗口物质信息所有行);
		assertEquals(eles.size(), 1);
		
		getElement(ElementEnum_标准信息_352.添加物质窗口物质分类下拉按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.添加物质窗口物质分类下拉选项_全部).click();
		getElement(ElementEnum_标准信息_352.添加物质窗口中文名称输入框).clear();
		getElement(ElementEnum_标准信息_352.添加物质窗口中文名称输入框).sendKeys("六氟丙烷");
		getElement(ElementEnum_标准信息_352.添加物质窗口查询按钮).click();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadFirst();
		
		eles = getElements(ElementEnum_标准信息_352.添加物质窗口物质信息所有行);
		assertEquals(eles.size(), 2);
		
		getElement(ElementEnum_标准信息_352.添加物质窗口物质分类下拉按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.添加物质窗口物质分类下拉选项_全部).click();
		getElement(ElementEnum_标准信息_352.添加物质窗口中文名称输入框).clear();
		getElement(ElementEnum_标准信息_352.添加物质窗口中文名称输入框).sendKeys("2-phen");
		getElement(ElementEnum_标准信息_352.添加物质窗口查询按钮).click();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadFirst();
		
		eles = getElements(ElementEnum_标准信息_352.添加物质窗口物质信息所有行);
		assertEquals(eles.size(), 1);
		
		getElement(ElementEnum_标准信息_352.添加物质窗口物质分类下拉按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.添加物质窗口物质分类下拉选项_全部).click();
		getElement(ElementEnum_标准信息_352.添加物质窗口中文名称输入框).clear();
		getElement(ElementEnum_标准信息_352.添加物质窗口中文名称输入框).sendKeys("2-phenylimidazole");
		getElement(ElementEnum_标准信息_352.添加物质窗口查询按钮).click();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadFirst();
		
		eles = getElements(ElementEnum_标准信息_352.添加物质窗口物质信息所有行);
		assertEquals(eles.size(), 2);
	}

	
	public String getDescription(){
		return "测试用例id: 4549\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 标准信息(#352)\n"
				+" 用例名称: 验证标准信息修改功能是否可实现-基本物质信息-添加查询\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 选择一条信息，点击页面中的修改按钮\n"
				+" 测试预期->1. 跳转至新页面，页面为所选标准信息的详细内容界面，可新增法规名称，选择法规类型，选择基本物质信息。\n"
				+" 测试步骤->2. 点击基本物质信息中的添加物质按钮。\n"
				+" 测试预期->2. 跳转至新页面，页面为添加物质的详细内容界面，可填参数查找所需物质。\n"
				+" 测试步骤->3. 点击查询按钮\n"
				+" 测试预期->3. 页面刷新，显示所有物质信息\n"
				+" 测试步骤->4. 选择物质分类为：铅及其化合物，中文名称填写：二，点击查询按钮\n"
				+" 测试预期->4. 无满足条件的信息被查询出来\n"
				+" 测试步骤->5. 中文名称填写：六氟丙烷，点击查询按钮\n"
				+" 测试预期->5. 中文名称为六氟丙烷的物质被检测出来，即中文名称查询为精确查询\n"
				+" 测试步骤->6. 英文名称填写：2-phen，点击查询按钮\n"
				+" 测试预期->6. 无满足条件的信息被查询出来\n"
				+" 测试步骤->7. 英文名称填写：2-phenylimidazole，点击查询按钮\n"
				+" 测试预期->7. 英文名称为2-phenylimidazole的物质被检测出来，即中文名称查询为精确查询\n"
;
	}

}

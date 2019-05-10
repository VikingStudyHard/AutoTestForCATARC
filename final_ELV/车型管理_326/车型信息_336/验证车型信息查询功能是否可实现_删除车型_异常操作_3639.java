package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型信息_336;

import static org.testng.Assert.assertEquals;

import java.util.List;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3639
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型信息(#336)
 * 用例名称: 验证车型信息查询功能是否可实现-删除车型-异常操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 点击删除车型按钮
 * 测试预期->1. 出现错误信息：请选择信息!
 * 测试步骤->2. 单击左键选择一条车型信息，点击删除车型按钮
 * 测试预期->2. 出现确认提示信息：确实要删除这些记录吗?
 * 测试步骤->3. 点击提示信息中的否按钮
 * 测试预期->3. 页面恢复到车型信息页面，所删除的车型信息仍然存在
 * 测试步骤->4. 单击左键选择一条车型信息，点击删除车型按钮
 * 测试预期->4. 出现确认提示信息：确实要删除这些记录吗?
 * 测试步骤->5. 点击提示信息中的右上角的关闭按钮
 * 测试预期->5. 页面恢复到车型信息页面，所删除的车型信息仍然存在
 * 
 */

public class 验证车型信息查询功能是否可实现_删除车型_异常操作_3639 extends Selenium_Test_Base {
	
	public 验证车型信息查询功能是否可实现_删除车型_异常操作_3639(){
		super();
	}
	
	public 验证车型信息查询功能是否可实现_删除车型_异常操作_3639(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_车型信息_336.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_车型信息_336.rightFrame);
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
		getElement(ElementEnum_车型信息_336.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_车型信息_336 a = new CommonOperations_车型信息_336(driver);
		a.verifyOnlyOneMyRecord();
		a.searchMyRecord();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.删除车型按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(getElement(ElementEnum_车型信息_336.第一页提示信息).getText().contains("请选择信息"));
		getElement(ElementEnum_车型信息_336.第一页提示框确认按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_车型信息_336.检索结果第一行车型商标中文).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.删除车型按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.第一页提示框否按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_车型信息_336.检索结果第一行车型商标中文).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.删除车型按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.第一页提示框右上角关闭按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.searchMyRecord();
		List<WebElement> eles = getElements(ElementEnum_车型信息_336.检索结果所有行);
		assertTrue(eles.size() == 2);
		
	}

	
	public String getDescription(){
		return "测试用例id: 3639\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型信息(#336)\n"
				+" 用例名称: 验证车型信息查询功能是否可实现-删除车型-异常操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 点击删除车型按钮\n"
				+" 测试预期->1. 出现错误信息：请选择信息!\n"
				+" 测试步骤->2. 单击左键选择一条车型信息，点击删除车型按钮\n"
				+" 测试预期->2. 出现确认提示信息：确实要删除这些记录吗?\n"
				+" 测试步骤->3. 点击提示信息中的否按钮\n"
				+" 测试预期->3. 页面恢复到车型信息页面，所删除的车型信息仍然存在\n"
				+" 测试步骤->4. 单击左键选择一条车型信息，点击删除车型按钮\n"
				+" 测试预期->4. 出现确认提示信息：确实要删除这些记录吗?\n"
				+" 测试步骤->5. 点击提示信息中的右上角的关闭按钮\n"
				+" 测试预期->5. 页面恢复到车型信息页面，所删除的车型信息仍然存在\n"
;
	}

}

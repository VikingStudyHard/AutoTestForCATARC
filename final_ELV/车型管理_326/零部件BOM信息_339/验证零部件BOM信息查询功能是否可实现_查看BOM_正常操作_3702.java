package cn.edu.tju.scs.seql.final_ELV.车型管理_326.零部件BOM信息_339;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3702
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件BOM信息(#339)
 * 用例名称: 验证零部件BOM信息查询功能是否可实现-查看BOM-正常操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 点击查看BOM按钮
 * 测试预期->1. 出现错误提示信息：请选择信息!
 * 测试步骤->2. 单击左键选择一条信息，点击查看BOM
 * 测试预期->2. 出现查看BOM窗口，含有各项车型BOM信息。
 * 测试步骤->3. 点击右上角返回按钮
 * 测试预期->3. 查看BOM页面被正常关闭
 * 
 */

public class 验证零部件BOM信息查询功能是否可实现_查看BOM_正常操作_3702 extends Selenium_Test_Base {
	
	public 验证零部件BOM信息查询功能是否可实现_查看BOM_正常操作_3702(){
		super();
	}
	
	public 验证零部件BOM信息查询功能是否可实现_查看BOM_正常操作_3702(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_零部件BOM信息_339.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_零部件BOM信息_339.rightFrame);
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
		getElement(ElementEnum_零部件BOM信息_339.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件BOM信息_339.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_零部件BOM信息_339.查看BOM键).click();
		WebDriverConfiguration.operationInterval();
		String text = getElement(ElementEnum_零部件BOM信息_339.未选择信息错误提示).getText();
		assertEquals(text, "请选择信息!");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件BOM信息_339.未选择信息错误提示确定键).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件BOM信息_339.检索结果第一行).click();
		getElement(ElementEnum_零部件BOM信息_339.查看BOM键).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件BOM信息_339.返回键).click();
		assertFalse(getElement(ElementEnum_零部件BOM信息_339.Loading框).getCssValue("display").equals("none"));
	}

	
	public String getDescription(){
		return "测试用例id: 3702\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件BOM信息(#339)\n"
				+" 用例名称: 验证零部件BOM信息查询功能是否可实现-查看BOM-正常操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 点击查看BOM按钮\n"
				+" 测试预期->1. 出现错误提示信息：请选择信息!\n"
				+" 测试步骤->2. 单击左键选择一条信息，点击查看BOM\n"
				+" 测试预期->2. 出现查看BOM窗口，含有各项车型BOM信息。\n"
				+" 测试步骤->3. 点击右上角返回按钮\n"
				+" 测试预期->3. 查看BOM页面被正常关闭\n"
;
	}

}

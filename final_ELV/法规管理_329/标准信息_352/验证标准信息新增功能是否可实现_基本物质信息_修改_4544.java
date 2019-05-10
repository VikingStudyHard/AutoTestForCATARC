package cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4544
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 标准信息(#352)
 * 用例名称:  验证标准信息新增功能是否可实现-基本物质信息-修改
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击页面中的新增按钮
 * 测试预期->1. 跳转至新页面，页面为新增标准信息的详细内容界面，可填写法规名称，选择法规类型，选择基本物质信息。
 * 测试步骤->2. 填写法规名称为test，选择法规类型为国家标准，点击基本物质信息中的修改物质按钮。
 * 测试预期->2. 页面出现提示信息：请选择一种物质！
 * 测试步骤->3. 单击左键选择一种物质，点击基本物质信息中的修改物质按钮。
 * 测试预期->3. 出现新页面，页面名称为：关闭中文名称，页面包含物质的中文名称，英文名称和比例，比例可进行修改。
 * 测试步骤->4. 修改比例为20%，点击保存按钮
 * 测试预期->4. 页面正常关闭，返回到新增基本物质界面
 * 测试步骤->5. 点击查看修改的物质信息
 * 测试预期->5. 比例为修改后的20%，即修改成功
 * 测试步骤->6. 修改比例为30%，点击关闭按钮
 * 测试预期->6. 页面正常关闭，返回到新增基本物质界面
 * 测试步骤->7. 点击查看修改的物质信息
 * 测试预期->7. 比例为修改前的20%，即未被修改
 * 
 */

public class 验证标准信息新增功能是否可实现_基本物质信息_修改_4544 extends Selenium_Test_Base {
	
	public 验证标准信息新增功能是否可实现_基本物质信息_修改_4544(){
		super();
	}
	
	public 验证标准信息新增功能是否可实现_基本物质信息_修改_4544(WebDriver driver){
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
		a.verifyOnlyNoMyRecord();
		
		getElement(ElementEnum_标准信息_352.新增按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.查看窗口法规名称输入框).clear();
		getElement(ElementEnum_标准信息_352.查看窗口法规名称输入框).sendKeys("testBy樊向宇");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.查看窗口法规类型下拉按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.查看窗口法规类型下拉选项_国家标准).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.查看窗口添加物质按钮).click();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadFirst();

		getElement(ElementEnum_标准信息_352.添加物质窗口查询按钮).click();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadFirst();
		getElement(ElementEnum_标准信息_352.添加物质窗口确定按钮).click();
		a.verifyTips("请至少选择一种物质");
		
		getElement(ElementEnum_标准信息_352.添加物质窗口物质信息第一行中文名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.添加物质窗口确定按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("法规比例为大于0的数字");
		
		getElement(ElementEnum_标准信息_352.添加物质窗口法规比例输入框).clear();
		getElement(ElementEnum_标准信息_352.添加物质窗口法规比例输入框).sendKeys("10");
		getElement(ElementEnum_标准信息_352.添加物质窗口确定按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("下列物质成功添加到新增列表中");
		
		getElement(ElementEnum_标准信息_352.查看窗口修改物质按钮).click();
		a.verifyTips("请选择一种物质");
		
		getElement(ElementEnum_标准信息_352.查看窗口基本物质信息第一行中文名称).click();
		getElement(ElementEnum_标准信息_352.查看窗口修改物质按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_标准信息_352.修改物质比例输入框).clear();
		getElement(ElementEnum_标准信息_352.修改物质比例输入框).sendKeys("20");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.修改物质比例输入框关闭按钮).click();
		
		assertEquals(getElement(ElementEnum_标准信息_352.查看窗口基本物质信息第一行比例), "10");
	}

	
	public String getDescription(){
		return "测试用例id: 4544\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 标准信息(#352)\n"
				+" 用例名称:  验证标准信息新增功能是否可实现-基本物质信息-修改\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击页面中的新增按钮\n"
				+" 测试预期->1. 跳转至新页面，页面为新增标准信息的详细内容界面，可填写法规名称，选择法规类型，选择基本物质信息。\n"
				+" 测试步骤->2. 填写法规名称为test，选择法规类型为国家标准，点击基本物质信息中的修改物质按钮。\n"
				+" 测试预期->2. 页面出现提示信息：请选择一种物质！\n"
				+" 测试步骤->3. 单击左键选择一种物质，点击基本物质信息中的修改物质按钮。\n"
				+" 测试预期->3. 出现新页面，页面名称为：关闭中文名称，页面包含物质的中文名称，英文名称和比例，比例可进行修改。\n"
				+" 测试步骤->4. 修改比例为20%，点击保存按钮\n"
				+" 测试预期->4. 页面正常关闭，返回到新增基本物质界面\n"
				+" 测试步骤->5. 点击查看修改的物质信息\n"
				+" 测试预期->5. 比例为修改后的20%，即修改成功\n"
				+" 测试步骤->6. 修改比例为30%，点击关闭按钮\n"
				+" 测试预期->6. 页面正常关闭，返回到新增基本物质界面\n"
				+" 测试步骤->7. 点击查看修改的物质信息\n"
				+" 测试预期->7. 比例为修改前的20%，即未被修改\n"
;
	}

}

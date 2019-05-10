package cn.edu.tju.scs.seql.final_ELV.综合分析_327.零部件RRR计算_345;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4229
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件RRR计算(#345)
 * 用例名称: 验证零部件RRR计算查看功能是否可实现-表单内操作2
 * 前置条件: 能正确进入综合分析模块
 * 测试步骤->1. 点击表单右侧下方的下一步按钮
 * 测试预期->1. 表单翻动至下一页，显示相关数据的本企业信息。
 * 测试步骤->2. 点击表单左侧下方的上一步按钮
 * 测试预期->2. 表单翻动至上一页，显示最初始表单内容，页面无其他变化。
 * 测试步骤->3. 任意更改表单左侧可修改内容，点击表单右侧下方的下一步按钮
 * 测试预期->3. 表单翻动至下一页，显示相关数据的本企业信息。
 * 测试步骤->4. 任意更改表单可修改内容，点击表单左侧下方的上一步按钮
 * 测试预期->4. 最初始表单内容，信息为修改前状态，任何信息未被修改，页面无其他变化。
 * 测试步骤->5. 点击表单右侧下方的下一步按钮
 * 测试预期->5. 表单翻动至下一页，显示相关数据的本企业信息，信息为修改前内容，任何信息未被修改。
 * 测试步骤->6. 点击表单右侧下方的关闭按钮
 * 测试预期->6. 表单被关闭，页面跳转至零部件RRR计算的首页面。
 * 
 */

public class 验证零部件RRR计算查看功能是否可实现_表单内操作2_4229 extends Selenium_Test_Base {
	
	public 验证零部件RRR计算查看功能是否可实现_表单内操作2_4229(){
		super();
	}
	
	public 验证零部件RRR计算查看功能是否可实现_表单内操作2_4229(WebDriver driver){
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
		Assert.fail("该用例信息不能修改，请检查");
	
		/*WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.二级目录名称).click();
		WebDriverConfiguration.operationInterval();*/
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		/*getElement(ElementEnum_零部件RRR计算_345.MSD信息选择按钮1).click();
		getElement(ElementEnum_零部件RRR计算_345.MSD信息查看按钮).click();
		
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_零部件RRR计算_345.查看信息页标题).getText(),"查看的材料数据表");
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_零部件RRR计算_345.明细下一步).click();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_零部件RRR计算_345.企业信息标题).getText(),"本企业信息");
		
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.企业信息页上一步按钮).click();
		assertEquals(getElement(ElementEnum_零部件RRR计算_345.查看信息页标题).getText(),"查看的材料数据表");
		
		
		*/
	
	}

	
	public String getDescription(){
		return "测试用例id: 4229\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件RRR计算(#345)\n"
				+" 用例名称: 验证零部件RRR计算查看功能是否可实现-表单内操作2\n"
				+" 前置条件: 能正确进入综合分析模块\n"
				+" 测试步骤->1. 点击表单右侧下方的下一步按钮\n"
				+" 测试预期->1. 表单翻动至下一页，显示相关数据的本企业信息。\n"
				+" 测试步骤->2. 点击表单左侧下方的上一步按钮\n"
				+" 测试预期->2. 表单翻动至上一页，显示最初始表单内容，页面无其他变化。\n"
				+" 测试步骤->3. 任意更改表单左侧可修改内容，点击表单右侧下方的下一步按钮\n"
				+" 测试预期->3. 表单翻动至下一页，显示相关数据的本企业信息。\n"
				+" 测试步骤->4. 任意更改表单可修改内容，点击表单左侧下方的上一步按钮\n"
				+" 测试预期->4. 最初始表单内容，信息为修改前状态，任何信息未被修改，页面无其他变化。\n"
				+" 测试步骤->5. 点击表单右侧下方的下一步按钮\n"
				+" 测试预期->5. 表单翻动至下一页，显示相关数据的本企业信息，信息为修改前内容，任何信息未被修改。\n"
				+" 测试步骤->6. 点击表单右侧下方的关闭按钮\n"
				+" 测试预期->6. 表单被关闭，页面跳转至零部件RRR计算的首页面。\n"
;
	}

}

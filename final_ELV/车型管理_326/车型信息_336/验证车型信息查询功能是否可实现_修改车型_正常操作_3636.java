package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型信息_336;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3636
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型信息(#336)
 * 用例名称: 验证车型信息查询功能是否可实现-修改车型-正常操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 点击修改车型按钮
 * 测试预期->1. 出现错误信息：请选择一条信息!
 * 测试步骤->2. 单击左键选择一条创建者为自己的车型信息，点击修改车型按钮
 * 测试预期->2. 出现修改车型窗口，含有各项需要填写的车型信息。
 * 测试步骤->3. 修改其中车型中文名称为测试，整车质量：（千克）为450.2，点击保存按钮
 * 测试预期->3. 出现成功提示信息：操作成功
 * 测试步骤->4. 点击确定按钮
 * 测试预期->4. 页面恢复到车型信息页面，被修改的车型的车型中文名称为测试，更新者为自己，更新时间为刚刚修改车型的时间
 * 测试步骤->5. 单击左键选择这条修改的车型信息，点击查看车型按钮
 * 测试预期->5. 出现查看车型窗口，各项填写的车型信息为最近更新的信息，即修改车型信息成功。
 * 
 */

public class 验证车型信息查询功能是否可实现_修改车型_正常操作_3636 extends Selenium_Test_Base {
	
	public 验证车型信息查询功能是否可实现_修改车型_正常操作_3636(){
		super();
	}
	
	public 验证车型信息查询功能是否可实现_修改车型_正常操作_3636(WebDriver driver){
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
		
		getElement(ElementEnum_车型信息_336.修改车型按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(getElement(ElementEnum_车型信息_336.第一页提示信息).getText().contains("请选择信息"));
		getElement(ElementEnum_车型信息_336.第一页提示框确认按钮).click();
		
		String original = getElement(ElementEnum_车型信息_336.检索结果第一行车型中文名称).getText();
		String newStr = original + "_change";
		
		getElement(ElementEnum_车型信息_336.检索结果第一行车型中文名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型信息_336.修改车型按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_车型信息_336.新增车型中文名称输入框).clear();
		getElement(ElementEnum_车型信息_336.新增车型中文名称输入框).sendKeys(newStr);
		
		WebDriverConfiguration.operationInterval();
		if(!getElement(ElementEnum_车型信息_336.第一页提示框最外层).getAttribute("class").contains("x-hide-offsets")){
			getElement(ElementEnum_车型信息_336.第一页提示框确认按钮).click();
		}
		
		getElement(ElementEnum_车型信息_336.弹出窗口保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifySucess();
		
		assertEquals(getElement(ElementEnum_车型信息_336.检索结果第一行车型中文名称).getText(),newStr);
		
	}

	
	public String getDescription(){
		return "测试用例id: 3636\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型信息(#336)\n"
				+" 用例名称: 验证车型信息查询功能是否可实现-修改车型-正常操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 点击修改车型按钮\n"
				+" 测试预期->1. 出现错误信息：请选择一条信息!\n"
				+" 测试步骤->2. 单击左键选择一条创建者为自己的车型信息，点击修改车型按钮\n"
				+" 测试预期->2. 出现修改车型窗口，含有各项需要填写的车型信息。\n"
				+" 测试步骤->3. 修改其中车型中文名称为测试，整车质量：（千克）为450.2，点击保存按钮\n"
				+" 测试预期->3. 出现成功提示信息：操作成功\n"
				+" 测试步骤->4. 点击确定按钮\n"
				+" 测试预期->4. 页面恢复到车型信息页面，被修改的车型的车型中文名称为测试，更新者为自己，更新时间为刚刚修改车型的时间\n"
				+" 测试步骤->5. 单击左键选择这条修改的车型信息，点击查看车型按钮\n"
				+" 测试预期->5. 出现查看车型窗口，各项填写的车型信息为最近更新的信息，即修改车型信息成功。\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.法规管理_329.高危清单_356;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4448
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 高危清单(#356)
 * 用例名称:  验证高危清单查看车型功能是否可实现-异常操作
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 单机左键选择一条车型信息，点击查看车型按钮
 * 测试预期->1. 跳转至新页面，查看车型页面包含车型的各项信息
 * 测试步骤->2. 随机更改新页面上的几项参数内容，例如：将品牌中文名称改为test，车型编号改为123，整车质量改为0，点击关闭按钮。
 * 测试预期->2. 页面被正常关闭，返回高危清单页面
 * 测试步骤->3. 单击选择刚刚更改过的车型信息，点击查看车型按钮
 * 测试预期->3. 跳转至新页面，查看车型页面包含车型的各项信息，其中各项信息均未被修改。
 * 
 */

public class 验证高危清单查看车型功能是否可实现_异常操作_4448 extends Selenium_Test_Base {
	
	public 验证高危清单查看车型功能是否可实现_异常操作_4448(){
		super();
	}
	
	public 验证高危清单查看车型功能是否可实现_异常操作_4448(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_高危清单_356.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_高危清单_356.rightFrame);
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
		getElement(ElementEnum_高危清单_356.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_高危清单_356 a= new CommonOperations_高危清单_356(driver);
		a.searchMyRecord();
		getElement(ElementEnum_高危清单_356.检索结果第一行品牌中文名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.查看车型按钮).click();
		WebDriverConfiguration.operationInterval();
		String bcname = getElement(ElementEnum_高危清单_356.查看车型窗口输入框_品牌中文名称).getText();
		String bename = getElement(ElementEnum_高危清单_356.查看车型窗口输入框_品牌英文名称).getText();
		String mcname = getElement(ElementEnum_高危清单_356.查看车型窗口输入框_车型中文名称).getText();
		String mename = getElement(ElementEnum_高危清单_356.查看车型窗口输入框_车型英文名称).getText();
		String num = getElement(ElementEnum_高危清单_356.查看车型窗口输入框_车型编号).getText();
		String quality = getElement(ElementEnum_高危清单_356.查看车型窗口输入框_整车质量).getText();
		
		getElement(ElementEnum_高危清单_356.查看车型窗口输入框_品牌中文名称).clear();
		getElement(ElementEnum_高危清单_356.查看车型窗口输入框_品牌中文名称).sendKeys("test");
		getElement(ElementEnum_高危清单_356.查看车型窗口输入框_品牌英文名称).clear();
		getElement(ElementEnum_高危清单_356.查看车型窗口输入框_品牌英文名称).sendKeys("test");
		getElement(ElementEnum_高危清单_356.查看车型窗口输入框_车型中文名称).clear();
		getElement(ElementEnum_高危清单_356.查看车型窗口输入框_车型中文名称).sendKeys("test");
		getElement(ElementEnum_高危清单_356.查看车型窗口输入框_车型英文名称).clear();
		getElement(ElementEnum_高危清单_356.查看车型窗口输入框_车型英文名称).sendKeys("test");
		getElement(ElementEnum_高危清单_356.查看车型窗口输入框_车型编号).clear();
		getElement(ElementEnum_高危清单_356.查看车型窗口输入框_车型编号).sendKeys("0");
		getElement(ElementEnum_高危清单_356.查看车型窗口输入框_整车质量).clear();
		getElement(ElementEnum_高危清单_356.查看车型窗口输入框_整车质量).sendKeys("0");
		
		getElement(ElementEnum_高危清单_356.查看车型窗口关闭按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.searchMyRecord();
		getElement(ElementEnum_高危清单_356.检索结果第一行品牌中文名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.查看车型按钮).click();
		WebDriverConfiguration.operationInterval();
		
		assertEquals(getElement(ElementEnum_高危清单_356.查看车型窗口输入框_品牌中文名称).getText(), bcname);
		assertEquals(getElement(ElementEnum_高危清单_356.查看车型窗口输入框_品牌英文名称).getText(), bename);
		assertEquals(getElement(ElementEnum_高危清单_356.查看车型窗口输入框_车型中文名称).getText(), mcname);
		assertEquals(getElement(ElementEnum_高危清单_356.查看车型窗口输入框_车型英文名称).getText(), mename);
		assertEquals(getElement(ElementEnum_高危清单_356.查看车型窗口输入框_车型编号).getText(), num);
		assertEquals(getElement(ElementEnum_高危清单_356.查看车型窗口输入框_整车质量).getText(), quality);
	}

	
	public String getDescription(){
		return "测试用例id: 4448\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 高危清单(#356)\n"
				+" 用例名称:  验证高危清单查看车型功能是否可实现-异常操作\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 单机左键选择一条车型信息，点击查看车型按钮\n"
				+" 测试预期->1. 跳转至新页面，查看车型页面包含车型的各项信息\n"
				+" 测试步骤->2. 随机更改新页面上的几项参数内容，例如：将品牌中文名称改为test，车型编号改为123，整车质量改为0，点击关闭按钮。\n"
				+" 测试预期->2. 页面被正常关闭，返回高危清单页面\n"
				+" 测试步骤->3. 单击选择刚刚更改过的车型信息，点击查看车型按钮\n"
				+" 测试预期->3. 跳转至新页面，查看车型页面包含车型的各项信息，其中各项信息均未被修改。\n"
;
	}

}

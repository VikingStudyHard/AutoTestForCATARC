package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型信息_336;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3634
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型信息(#336)
 * 用例名称:  验证车型信息查询功能是否可实现-新增车型-正常操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 点击新增车型按钮
 * 测试预期->1. 出现新增车型窗口，含有各项需要填写的车型信息。
 * 测试步骤->2. 填写所有带红色星标的必填项信息为test，生产年份为2016-04-13，整车质量为10，长、宽、高都为10，点击保存按钮
 * 测试预期->2. 出现成功提示信息：操作成功
 * 测试步骤->3. 点击提示信息中的确认按钮
 * 测试预期->3. 页面返回为查看车型页面，车型信息新增一条。
 * 
 */

public class 验证车型信息查询功能是否可实现_新增车型_正常操作_3634 extends Selenium_Test_Base {
	
	public 验证车型信息查询功能是否可实现_新增车型_正常操作_3634(){
		super();
	}
	
	public 验证车型信息查询功能是否可实现_新增车型_正常操作_3634(WebDriver driver){
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
		a.addOneMyRecord();
		
	}

	
	public String getDescription(){
		return "测试用例id: 3634\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型信息(#336)\n"
				+" 用例名称:  验证车型信息查询功能是否可实现-新增车型-正常操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 点击新增车型按钮\n"
				+" 测试预期->1. 出现新增车型窗口，含有各项需要填写的车型信息。\n"
				+" 测试步骤->2. 填写所有带红色星标的必填项信息为test，生产年份为2016-04-13，整车质量为10，长、宽、高都为10，点击保存按钮\n"
				+" 测试预期->2. 出现成功提示信息：操作成功\n"
				+" 测试步骤->3. 点击提示信息中的确认按钮\n"
				+" 测试预期->3. 页面返回为查看车型页面，车型信息新增一条。\n"
;
	}

}

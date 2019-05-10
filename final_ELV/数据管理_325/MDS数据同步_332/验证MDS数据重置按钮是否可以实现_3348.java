package cn.edu.tju.scs.seql.final_ELV.数据管理_325.MDS数据同步_332;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3348
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: MDS数据同步(#332)
 * 用例名称: 验证MDS数据重置按钮是否可以实现
 * 前置条件: 1.有CAMDS帐号，拥有MDS数据同步的菜单权限。
 *         2.能够正确进入MDS数据同步界面
 * 测试步骤->1. 点击重置按钮
 * 测试预期->1. 页面无改变
 * 测试步骤->2. 选择查询类型为零部件，表单来源为环境合规系统，名称为1，供货编号为1，ID为123，查询时间类型为全部时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击重置按钮
 * 测试预期->2. 填写的参数信息被清空，页面无其他响应
 * 
 */

public class 验证MDS数据重置按钮是否可以实现_3348 extends Selenium_Test_Base {
	
	public 验证MDS数据重置按钮是否可以实现_3348(){
		super();
	}
	
	public 验证MDS数据重置按钮是否可以实现_3348(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_MDS数据同步_332.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_MDS数据同步_332.rightFrame);
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
		// 数据管理不需要选一级目录
//		WebDriverConfiguration.operationInterval();
//		getElement(ElementEnum_MDS数据同步_332.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_MDS数据同步_332.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_MDS数据同步_332.重置按钮).click();
		WebDriverConfiguration.operationInterval();
		verifyAllEmpty();
		
		getElement(ElementEnum_MDS数据同步_332.名称输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.名称输入框).sendKeys("1");
		getElement(ElementEnum_MDS数据同步_332.供货编号输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.供货编号输入框).sendKeys("1");
		getElement(ElementEnum_MDS数据同步_332.ID输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.ID输入框).sendKeys("123");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_MDS数据同步_332.重置按钮).click();
		WebDriverConfiguration.operationInterval();
		verifyAllEmpty();
	}
	
	public void verifyAllEmpty(){
		String name = getElement(ElementEnum_MDS数据同步_332.名称输入框).getText();
		String number = getElement(ElementEnum_MDS数据同步_332.供货编号输入框).getText();
		String ID = getElement(ElementEnum_MDS数据同步_332.ID输入框).getText();
		assertEquals(name, "");
		assertEquals(number, "");
		assertEquals(ID, "");
	}

	
	public String getDescription(){
		return "测试用例id: 3348\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: MDS数据同步(#332)\n"
				+" 用例名称: 验证MDS数据重置按钮是否可以实现\n"
				+" 前置条件: 1.有CAMDS帐号，拥有MDS数据同步的菜单权限。 2.能够正确进入MDS数据同步界面\n"
				+" 测试步骤->1. 点击重置按钮\n"
				+" 测试预期->1. 页面无改变\n"
				+" 测试步骤->2. 选择查询类型为零部件，表单来源为环境合规系统，名称为1，供货编号为1，ID为123，查询时间类型为全部时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击重置按钮\n"
				+" 测试预期->2. 填写的参数信息被清空，页面无其他响应\n"
;
	}

}

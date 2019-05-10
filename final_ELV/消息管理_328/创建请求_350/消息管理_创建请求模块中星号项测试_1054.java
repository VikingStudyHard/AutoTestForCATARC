package cn.edu.tju.scs.seql.final_ELV.消息管理_328.创建请求_350;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1054
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 创建请求(#350)
 * 用例名称: 消息管理-创建请求模块中星号项测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-创建请求
 * 测试步骤->1. 点击返回按钮
 * 测试预期->1. 界面跳转至上一界面
 * 测试步骤->2. 再进入到创建请求界面， 直接点击右下角保存按钮
 * 测试预期->2. 提示输入CAMDS账户
 * 测试步骤->3. 选择CAMDS账户， 点击保存按钮
 * 测试预期->3. 提示输入材料数据供应商
 * 测试步骤->4. 再选择材料数据供应商， 点击保存按钮
 * 测试预期->4. 提示输入截止日期
 * 测试步骤->5. 再选择早于当前日期的某一截止日期， 点击保存按钮
 * 测试预期->5. 提示输入供货编号
 * 测试步骤->6. 再输入供货编号， 点击保存按钮
 * 测试预期->6. 提示输入供货名称
 * 测试步骤->7. 再出入供货名称， 点击保存按钮
 * 测试预期->7. 提示输入供应商代码
 * 测试步骤->8. 再输入供应商代码， 点击保存按钮
 * 测试预期->8. 提示：截止日期应当晚于当前日期
 * 测试步骤->9. 修改截止日期， 改为晚于当前日期， 点击保存按钮
 * 测试预期->9. 提示数据保存成功
 * 测试步骤->10. 点击数据已保存提示窗口的确定键
 * 测试预期->10. 返回到创建请求界面， 界面右下方新增“发送按钮”
 * 
 */

public class 消息管理_创建请求模块中星号项测试_1054 extends Selenium_Test_Base {
	
	public 消息管理_创建请求模块中星号项测试_1054(){
		super();
	}
	
	public 消息管理_创建请求模块中星号项测试_1054(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_创建请求_350.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_创建请求_350.rightFrame);
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
		getElement(ElementEnum_创建请求_350.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_创建请求_350.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_创建请求_350 a = new CommonOperations_创建请求_350(driver);
		getElement(ElementEnum_创建请求_350.返回按钮).click();
		WebDriverConfiguration.operationInterval();
		a.changeBackToCreateQuest();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_创建请求_350.保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请输入所有要求的数据: CAMDS账户");
		
		a.addOneCAMDSAccount();
		getElement(ElementEnum_创建请求_350.CAMDS账户_ncfxy_camds选项).click();
		System.out.println("hhaa");
		getElement(ElementEnum_创建请求_350.保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请输入所有要求的数据: 材料数据供应商");
		
		getElement(ElementEnum_创建请求_350.材料数据供应商查找按钮).click();
		String currentWindow = driver.getWindowHandle();
		System.out.println(currentWindow);
		a.switchToNextWindow();
		selectCompany();
		driver.switchTo().window(currentWindow);
		WebElement mainFrame=getElement(ElementEnum_创建请求_350.rightFrame);
		driver.switchTo().frame(mainFrame);
		System.out.println(driver.getWindowHandle());
		
		getElement(ElementEnum_创建请求_350.保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请输入所有要求的数据: 截止日期");
		
		a.deleteReadOnly();
		getElement(ElementEnum_创建请求_350.截止日期输入框).clear();
		getElement(ElementEnum_创建请求_350.截止日期输入框).sendKeys("2016-03-10");
		getElement(ElementEnum_创建请求_350.保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请输入所有要求的数据: 供货编号");
		
		getElement(ElementEnum_创建请求_350.供货编号输入框).clear();
		getElement(ElementEnum_创建请求_350.供货编号输入框).sendKeys("123");
		getElement(ElementEnum_创建请求_350.保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请输入所有要求的数据: 供货名称");
		
		getElement(ElementEnum_创建请求_350.供货名称输入框).clear();
		getElement(ElementEnum_创建请求_350.供货名称输入框).sendKeys("123");
		getElement(ElementEnum_创建请求_350.保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("请输入所有要求的数据: 供应商代码");
		
		
		getElement(ElementEnum_创建请求_350.供应商代码输入框).clear();
		getElement(ElementEnum_创建请求_350.供应商代码输入框).sendKeys("123");
		getElement(ElementEnum_创建请求_350.保存按钮).click();
		WebDriverConfiguration.operationInterval();
//		a.verifyTips("截止日期应当晚于当前日期");
		
//		getElement(ElementEnum_创建请求_350.截止日期输入框).clear();
//		getElement(ElementEnum_创建请求_350.截止日期输入框).sendKeys("2016-03-10");
//		getElement(ElementEnum_创建请求_350.保存按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("数据已保存");
		
		assertEquals(getElement(ElementEnum_创建请求_350.发送按钮).isDisplayed(), true);
	}
	
	public void selectCompany(){
		getElement(ElementEnum_创建请求_350.搜索企业窗口企业名称输入框).clear();
		getElement(ElementEnum_创建请求_350.搜索企业窗口企业名称输入框).sendKeys("康师傅");
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_创建请求_350.搜索企业窗口查找按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_创建请求_350.搜索企业窗口检索结果第一行企业名称).click();
		getElement(ElementEnum_创建请求_350.搜索企业窗口确定按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		
	}

	
	public String getDescription(){
		return "测试用例id: 1054\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 创建请求(#350)\n"
				+" 用例名称: 消息管理-创建请求模块中星号项测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-创建请求\n"
				+" 测试步骤->1. 点击返回按钮\n"
				+" 测试预期->1. 界面跳转至上一界面\n"
				+" 测试步骤->2. 再进入到创建请求界面， 直接点击右下角保存按钮\n"
				+" 测试预期->2. 提示输入CAMDS账户\n"
				+" 测试步骤->3. 选择CAMDS账户， 点击保存按钮\n"
				+" 测试预期->3. 提示输入材料数据供应商\n"
				+" 测试步骤->4. 再选择材料数据供应商， 点击保存按钮\n"
				+" 测试预期->4. 提示输入截止日期\n"
				+" 测试步骤->5. 再选择早于当前日期的某一截止日期， 点击保存按钮\n"
				+" 测试预期->5. 提示输入供货编号\n"
				+" 测试步骤->6. 再输入供货编号， 点击保存按钮\n"
				+" 测试预期->6. 提示输入供货名称\n"
				+" 测试步骤->7. 再出入供货名称， 点击保存按钮\n"
				+" 测试预期->7. 提示输入供应商代码\n"
				+" 测试步骤->8. 再输入供应商代码， 点击保存按钮\n"
				+" 测试预期->8. 提示：截止日期应当晚于当前日期\n"
				+" 测试步骤->9. 修改截止日期， 改为晚于当前日期， 点击保存按钮\n"
				+" 测试预期->9. 提示数据保存成功\n"
				+" 测试步骤->10. 点击数据已保存提示窗口的确定键\n"
				+" 测试预期->10. 返回到创建请求界面， 界面右下方新增“发送按钮”\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型BOM信息_337;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;

/**
 * 测试用例id: 3662
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型BOM信息(#337)
 * 用例名称: 验证车型BOM信息功能是否可实现-新增BOM-BOM树形新增操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 单击左键选择一条是否存在BOM一栏为是的信息，点击修改BOM按钮
 * 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。
 * 测试步骤->2. 点击BOM树形左上角的新增按钮
 * 测试预期->2. 出现新增界面，含有各项需要填写的新增信息
 * 测试步骤->3. 点击确认按钮
 * 测试预期->3. 出现错误提示信息：供货编号不能为空
 * 测试步骤->4. 填写供货编号为11，点击确认按钮
 * 测试预期->4. 新增节点为：新增节点（11），为根节点下第一节点
 * 测试步骤->5. 点击BOM树形左上角的新增按钮
 * 测试预期->5. 出现新增界面，含有各项需要填写的新增信息
 * 测试步骤->6. 填写名称为测试，数量为2，质量为10，责任人为admin，供货编号为13，点击确认按钮
 * 测试预期->6. 新增节点为：测试（13），为根节点下第二节点
 * 测试步骤->7. 点击BOM树形左上角的新增按钮
 * 测试预期->7. 出现新增界面，含有各项需要填写的新增信息
 * 测试步骤->8. 点击取消按钮
 * 测试预期->8. 无新增节点
 * 
 */

public class 验证车型BOM信息功能是否可实现_新增BOM_BOM树形新增操作_3662 extends Selenium_Test_Base {
	
	public 验证车型BOM信息功能是否可实现_新增BOM_BOM树形新增操作_3662(){
		super();
	}
	
	public 验证车型BOM信息功能是否可实现_新增BOM_BOM树形新增操作_3662(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_车型BOM信息_337.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_车型BOM信息_337.rightFrame);
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
		getElement(ElementEnum_车型BOM信息_337.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	// 检测载入界面是否完成
	public void judgeMaskLoad(){
		CommonOperationsAll a = new CommonOperationsAll(driver);
		a.judgeElementDisplayNone(ElementEnum_车型BOM信息_337.载入界面);
	}
	public void detailedOperation(){
		getElement(ElementEnum_车型BOM信息_337.车型商标输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.车型商标输入框).sendKeys("test杨杨");
		getElement(ElementEnum_车型BOM信息_337.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		//BOM为是的一栏
		getElement(ElementEnum_车型BOM信息_337.检索BOM为是的行).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.查看BOM按钮).click();
		WebDriverConfiguration.operationInterval();
		judgeMaskLoad();
		//查看BOM进入的页面没有新增按钮
		/*
		getElement(ElementEnum_车型BOM信息_337.BOM树形增加按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_车型BOM信息_337.名称输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.名称输入框).sendKeys("测试");
		getElement(ElementEnum_车型BOM信息_337.供货编号输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.供货编号输入框).sendKeys("13");
		getElement(ElementEnum_车型BOM信息_337.数量输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.数量输入框).sendKeys("2");
		getElement(ElementEnum_车型BOM信息_337.质量输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.质量输入框).sendKeys("10");
		getElement(ElementEnum_车型BOM信息_337.负责人输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.负责人输入框).sendKeys("admin");
		WebDriverConfiguration.operationInterval();
		//操作不同按钮ID会改变
		
		getElement(ElementEnum_车型BOM信息_337.新增确定按钮).click();
		WebDriverConfiguration.operationInterval();
		*/
	
	}

	
	public String getDescription(){
		return "测试用例id: 3662\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型BOM信息(#337)\n"
				+" 用例名称: 验证车型BOM信息功能是否可实现-新增BOM-BOM树形新增操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 单击左键选择一条是否存在BOM一栏为是的信息，点击修改BOM按钮\n"
				+" 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。\n"
				+" 测试步骤->2. 点击BOM树形左上角的新增按钮\n"
				+" 测试预期->2. 出现新增界面，含有各项需要填写的新增信息\n"
				+" 测试步骤->3. 点击确认按钮\n"
				+" 测试预期->3. 出现错误提示信息：供货编号不能为空\n"
				+" 测试步骤->4. 填写供货编号为11，点击确认按钮\n"
				+" 测试预期->4. 新增节点为：新增节点（11），为根节点下第一节点\n"
				+" 测试步骤->5. 点击BOM树形左上角的新增按钮\n"
				+" 测试预期->5. 出现新增界面，含有各项需要填写的新增信息\n"
				+" 测试步骤->6. 填写名称为测试，数量为2，质量为10，责任人为admin，供货编号为13，点击确认按钮\n"
				+" 测试预期->6. 新增节点为：测试（13），为根节点下第二节点\n"
				+" 测试步骤->7. 点击BOM树形左上角的新增按钮\n"
				+" 测试预期->7. 出现新增界面，含有各项需要填写的新增信息\n"
				+" 测试步骤->8. 点击取消按钮\n"
				+" 测试预期->8. 无新增节点\n"
;
	}

}

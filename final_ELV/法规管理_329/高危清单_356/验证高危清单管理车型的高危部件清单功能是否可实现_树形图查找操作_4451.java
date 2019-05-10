package cn.edu.tju.scs.seql.final_ELV.法规管理_329.高危清单_356;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4451
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 高危清单(#356)
 * 用例名称:  验证高危清单管理车型的高危部件清单功能是否可实现-树形图查找操作
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 单击左键选择一条车型信息，点击管理车型的高位部件清单
 * 测试预期->1. 跳转至新页面，管理车型的高危部件清单页面包含车型的各项信息和汽车高风险零部件有害物质备案参数表
 * 测试步骤->2. 点击BOM树形图界面右上角的查找按钮
 * 测试预期->2. 跳出新页面以定位树形图节点
 * 测试步骤->3. 不填写任何内容点击定位页面中的查找按钮
 * 测试预期->3. 弹出对话框提示“请输入查询条件！”
 * 测试步骤->4. 填写定位页面信息中的节点名称为CA，点击查找按钮
 * 测试预期->4. 页面出现请稍等进度条，搜索到节点名称中包含CA的节点
 * 测试步骤->5. 填写定位页面信息中的节点名称为CA_5_13175222，点击查找按钮
 * 测试预期->5. 页面出现请稍等进度条，搜索到名称为CA_5_13175222的节点信息
 * 测试步骤->6. 填写定位页面信息中的节点名称为tuu,点击查找按钮
 * 测试预期->6. 页面出现稍等进度条，弹出对话框提示“没有查询结果！（该查询不包含基本物质信息查询）”
 * 测试步骤->7. 填写定位页面信息中的供货编号为test5.4-5.5，点击搜索按钮
 * 测试预期->7. 页面出现请稍等进度条，搜索到供货编号为test5.4-5.5的节点信息
 * 测试步骤->8. 点击定位页面的关闭按钮
 * 测试预期->8. 定位查找页面正常关闭
 * 
 */

public class 验证高危清单管理车型的高危部件清单功能是否可实现_树形图查找操作_4451 extends Selenium_Test_Base {
	
	public 验证高危清单管理车型的高危部件清单功能是否可实现_树形图查找操作_4451(){
		super();
	}
	
	public 验证高危清单管理车型的高危部件清单功能是否可实现_树形图查找操作_4451(WebDriver driver){
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
		CommonOperations_高危清单_356 a = new CommonOperations_高危清单_356(driver);
		a.searchMyRecordWithBOM();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadFirst();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.检索结果第一行品牌中文名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.管理车型的高危部件清单按钮).click();
		WebDriverConfiguration.operationInterval();
		a.judgeMaskLoadSecondPage();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_高危清单_356.BOM树查找按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_高危清单_356.BOM查找查找按钮).click();
		WebDriverConfiguration.operationInterval();
		Alert alert = driver.switchTo().alert();
	    String alertText = alert.getText();
	    assertTrue(alertText.contains("请输入查询条件"));
	    alert.accept();
	    
//		a.verifyTips("请输入查询条件");
		
		searchAndVerifyName("testBy");
		searchAndVerifyName("樊向宇");
		
		getElement(ElementEnum_高危清单_356.BOM查找关闭按钮).click();
		
	}

	public void searchAndVerifyName(String name) {
		getElement(ElementEnum_高危清单_356.BOM查找节点名称输入框).clear();
		getElement(ElementEnum_高危清单_356.BOM查找节点名称输入框).sendKeys(name);
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.BOM查找查找按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		assertTrue(getElement(ElementEnum_高危清单_356.BOM树选中节点).getText().contains(name));
	}

	
	public String getDescription(){
		return "测试用例id: 4451\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 高危清单(#356)\n"
				+" 用例名称:  验证高危清单管理车型的高危部件清单功能是否可实现-树形图查找操作\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 单击左键选择一条车型信息，点击管理车型的高位部件清单\n"
				+" 测试预期->1. 跳转至新页面，管理车型的高危部件清单页面包含车型的各项信息和汽车高风险零部件有害物质备案参数表\n"
				+" 测试步骤->2. 点击BOM树形图界面右上角的查找按钮\n"
				+" 测试预期->2. 跳出新页面以定位树形图节点\n"
				+" 测试步骤->3. 不填写任何内容点击定位页面中的查找按钮\n"
				+" 测试预期->3. 弹出对话框提示“请输入查询条件！”\n"
				+" 测试步骤->4. 填写定位页面信息中的节点名称为CA，点击查找按钮\n"
				+" 测试预期->4. 页面出现请稍等进度条，搜索到节点名称中包含CA的节点\n"
				+" 测试步骤->5. 填写定位页面信息中的节点名称为CA_5_13175222，点击查找按钮\n"
				+" 测试预期->5. 页面出现请稍等进度条，搜索到名称为CA_5_13175222的节点信息\n"
				+" 测试步骤->6. 填写定位页面信息中的节点名称为tuu,点击查找按钮\n"
				+" 测试预期->6. 页面出现稍等进度条，弹出对话框提示“没有查询结果！（该查询不包含基本物质信息查询）”\n"
				+" 测试步骤->7. 填写定位页面信息中的供货编号为test5.4-5.5，点击搜索按钮\n"
				+" 测试预期->7. 页面出现请稍等进度条，搜索到供货编号为test5.4-5.5的节点信息\n"
				+" 测试步骤->8. 点击定位页面的关闭按钮\n"
				+" 测试预期->8. 定位查找页面正常关闭\n"
;
	}

}

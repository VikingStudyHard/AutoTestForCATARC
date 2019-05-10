package cn.edu.tju.scs.seql.final_ELV.法规管理_329.行业动态_355;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4467
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 行业动态(#355)
 * 用例名称:  验证行业动态新增功能是否可实现-编辑文本
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击页面中的新增按钮
 * 测试预期->1. 跳转至新页面，页面为新增行业动态信息的详细内容界面，可填写标题等详细文本内容。
 * 测试步骤->2. 填写标题和类别为：test，点击内容编辑框中的字体选择下拉框，选择宋体，写文字：测试
 * 测试预期->2. 测试字体为宋体
 * 测试步骤->3. 点击内容编辑框中的字体选择下拉框，选择隶书，写文字：再测试
 * 测试预期->3. 再测试字体为隶书
 * 测试步骤->4. 点击内容编辑框中的加粗按钮写文字：再再测试
 * 测试预期->4. 再再测试字体被加粗
 * 测试步骤->5. 点击内容编辑框中的斜体按钮写文字：再再再测试
 * 测试预期->5. 再再再测试字体变为斜体
 * 测试步骤->6. 点击内容编辑框中的下划线按钮写文字：再再再再测试
 * 测试预期->6. 再再再再测试被加下划线
 * 测试步骤->7. 点击内容编辑框中的字体变大按钮写文字：再再再再再测试
 * 测试预期->7. 再再再再再测试字体变大
 * 测试步骤->8. 点击内容编辑框中的字体变大按钮写文字：测试
 * 测试预期->8. 测试字体变小
 * 测试步骤->9. 点击内容编辑框中的选择字体颜色按钮选择红色，写文字：再测试
 * 测试预期->9. 再测试字体变为红色
 * 测试步骤->10. 点击内容编辑框中的选择字体背景颜色为黄色，写文字：再再测试
 * 测试预期->10. 再再测试字体背景颜色变为黄色
 * 
 */

public class 验证行业动态新增功能是否可实现_编辑文本_4467 extends Selenium_Test_Base {
	
	public 验证行业动态新增功能是否可实现_编辑文本_4467(){
		super();
	}
	
	public 验证行业动态新增功能是否可实现_编辑文本_4467(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_行业动态_355.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_行业动态_355.rightFrame);
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
		getElement(ElementEnum_行业动态_355.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_行业动态_355.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		// TODO 新增功能使用showModalDialog实现，无法进行测试
	}

	
	public String getDescription(){
		return "测试用例id: 4467\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 行业动态(#355)\n"
				+" 用例名称:  验证行业动态新增功能是否可实现-编辑文本\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击页面中的新增按钮\n"
				+" 测试预期->1. 跳转至新页面，页面为新增行业动态信息的详细内容界面，可填写标题等详细文本内容。\n"
				+" 测试步骤->2. 填写标题和类别为：test，点击内容编辑框中的字体选择下拉框，选择宋体，写文字：测试\n"
				+" 测试预期->2. 测试字体为宋体\n"
				+" 测试步骤->3. 点击内容编辑框中的字体选择下拉框，选择隶书，写文字：再测试\n"
				+" 测试预期->3. 再测试字体为隶书\n"
				+" 测试步骤->4. 点击内容编辑框中的加粗按钮写文字：再再测试\n"
				+" 测试预期->4. 再再测试字体被加粗\n"
				+" 测试步骤->5. 点击内容编辑框中的斜体按钮写文字：再再再测试\n"
				+" 测试预期->5. 再再再测试字体变为斜体\n"
				+" 测试步骤->6. 点击内容编辑框中的下划线按钮写文字：再再再再测试\n"
				+" 测试预期->6. 再再再再测试被加下划线\n"
				+" 测试步骤->7. 点击内容编辑框中的字体变大按钮写文字：再再再再再测试\n"
				+" 测试预期->7. 再再再再再测试字体变大\n"
				+" 测试步骤->8. 点击内容编辑框中的字体变大按钮写文字：测试\n"
				+" 测试预期->8. 测试字体变小\n"
				+" 测试步骤->9. 点击内容编辑框中的选择字体颜色按钮选择红色，写文字：再测试\n"
				+" 测试预期->9. 再测试字体变为红色\n"
				+" 测试步骤->10. 点击内容编辑框中的选择字体背景颜色为黄色，写文字：再再测试\n"
				+" 测试预期->10. 再再测试字体背景颜色变为黄色\n"
;
	}

}

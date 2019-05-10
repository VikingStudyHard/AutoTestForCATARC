package cn.edu.tju.scs.seql.final_ELV.法规管理_329.行业动态_355;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4470
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 行业动态(#355)
 * 用例名称: 验证行业动态编辑功能是否可实现-编辑文本
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击选择一条信息，点击页面中的编辑按钮
 * 测试预期->1. 跳转至新页面，页面为所选择编辑行业动态信息的详细内容。
 * 测试步骤->2. 修改标题和类别为：test，选择一部分文字，点击内容编辑框中的字体选择下拉框，选择隶书
 * 测试预期->2. 所选字体更改为隶书
 * 测试步骤->3. 选择一部分文字，点击内容编辑框中的加粗按钮
 * 测试预期->3. 所选字体被加粗
 * 测试步骤->4. 选择一部分文字，点击内容编辑框中的斜体按钮
 * 测试预期->4. 所选字体变为斜体
 * 测试步骤->5. 选择一部分文字，点击内容编辑框中的下划线按钮
 * 测试预期->5. 所选字体被加下划线
 * 测试步骤->6. 选择一部分文字，点击内容编辑框中的字体变大按钮
 * 测试预期->6. 所选字体变大
 * 测试步骤->7. 选择一部分文字，点击内容编辑框中的字体变大按钮
 * 测试预期->7. 所选字体变小
 * 测试步骤->8. 选择一部分文字，点击内容编辑框中的选择字体颜色按钮选择红色
 * 测试预期->8. 所选字体变为红色
 * 测试步骤->9. 选择一部分文字，点击内容编辑框中的选择字体背景颜色为黄色
 * 测试预期->9. 所选字体背景颜色变为黄色
 * 
 */

public class 验证行业动态编辑功能是否可实现_编辑文本_4470 extends Selenium_Test_Base {
	
	public 验证行业动态编辑功能是否可实现_编辑文本_4470(){
		super();
	}
	
	public 验证行业动态编辑功能是否可实现_编辑文本_4470(WebDriver driver){
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
		// TODO 编辑功能使用showModalDialog实现，无法进行测试
	}

	
	public String getDescription(){
		return "测试用例id: 4470\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 行业动态(#355)\n"
				+" 用例名称: 验证行业动态编辑功能是否可实现-编辑文本\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击选择一条信息，点击页面中的编辑按钮\n"
				+" 测试预期->1. 跳转至新页面，页面为所选择编辑行业动态信息的详细内容。\n"
				+" 测试步骤->2. 修改标题和类别为：test，选择一部分文字，点击内容编辑框中的字体选择下拉框，选择隶书\n"
				+" 测试预期->2. 所选字体更改为隶书\n"
				+" 测试步骤->3. 选择一部分文字，点击内容编辑框中的加粗按钮\n"
				+" 测试预期->3. 所选字体被加粗\n"
				+" 测试步骤->4. 选择一部分文字，点击内容编辑框中的斜体按钮\n"
				+" 测试预期->4. 所选字体变为斜体\n"
				+" 测试步骤->5. 选择一部分文字，点击内容编辑框中的下划线按钮\n"
				+" 测试预期->5. 所选字体被加下划线\n"
				+" 测试步骤->6. 选择一部分文字，点击内容编辑框中的字体变大按钮\n"
				+" 测试预期->6. 所选字体变大\n"
				+" 测试步骤->7. 选择一部分文字，点击内容编辑框中的字体变大按钮\n"
				+" 测试预期->7. 所选字体变小\n"
				+" 测试步骤->8. 选择一部分文字，点击内容编辑框中的选择字体颜色按钮选择红色\n"
				+" 测试预期->8. 所选字体变为红色\n"
				+" 测试步骤->9. 选择一部分文字，点击内容编辑框中的选择字体背景颜色为黄色\n"
				+" 测试预期->9. 所选字体背景颜色变为黄色\n"
;
	}

}

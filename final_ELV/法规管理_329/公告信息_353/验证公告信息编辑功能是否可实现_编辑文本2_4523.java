package cn.edu.tju.scs.seql.final_ELV.法规管理_329.公告信息_353;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4523
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 公告信息(#353)
 * 用例名称: 验证公告信息编辑功能是否可实现-编辑文本2
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击选择一条信息，点击页面中的编辑按钮
 * 测试预期->1. 跳转至新页面，页面为所选择编辑公告信息信息的详细内容。
 * 测试步骤->2. 选择一部分文字，点击内容编辑框中的向左靠齐按钮
 * 测试预期->2. 所选文字向左靠齐
 * 测试步骤->3. 选择一部分文字，点击内容编辑框中的居中按钮
 * 测试预期->3. 所选文字居中
 * 测试步骤->4. 选择一部分文字，点击内容编辑框中的向右靠齐按键
 * 测试预期->4. 所选文字向右靠齐
 * 测试步骤->5. 点击内容编辑框中的添加链接按钮
 * 测试预期->5. 出现超链接添加页面，可填写需要添加至文本内的超链接
 * 测试步骤->6. 选择一部分文字，点击内容编辑框中的编号按钮
 * 测试预期->6. 所选文字被编号
 * 测试步骤->7. 选择一部分文字，点击内容编辑框中的项目分类按钮
 * 测试预期->7. 所选文字被分类
 * 测试步骤->8. 点击内容编辑框中的代码视图按钮
 * 测试预期->8. 编辑文本框中可输入代码，字体修改类按钮变灰色不可选择
 * 测试步骤->9. 点击保存按钮
 * 测试预期->9. 页面正常关闭
 * 测试步骤->10. 点击刚刚更改信息，点击查看按钮
 * 测试预期->10. 信息含有修改后内容，即信息修改成功
 * 
 */

public class 验证公告信息编辑功能是否可实现_编辑文本2_4523 extends Selenium_Test_Base {
	
	public 验证公告信息编辑功能是否可实现_编辑文本2_4523(){
		super();
	}
	
	public 验证公告信息编辑功能是否可实现_编辑文本2_4523(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_公告信息_353.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_公告信息_353.rightFrame);
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
		getElement(ElementEnum_公告信息_353.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_公告信息_353.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		// TODO 编辑功能使用showModalDialog实现，无法进行测试
		/*
		assertEquals(driver.findElement(By.xpath("//td")).getText(), "企业名称:");
	    assertEquals(driver.findElement(By.xpath("//td[3]")).getText(), "企业ID:");
	    assertEquals(driver.findElement(By.xpath("//td[5]")).getText(), "计划员:");
	    assertEquals(driver.findElement(By.xpath("//td[7]")).getText(), "区域");
	    assertEquals(driver.findElement(By.xpath("//td[9]")).getText(), "新增信息来源");
	    assertEquals(driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td/div/input")).getText(), "");
		*/
	
	}

	
	public String getDescription(){
		return "测试用例id: 4523\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 公告信息(#353)\n"
				+" 用例名称: 验证公告信息编辑功能是否可实现-编辑文本2\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击选择一条信息，点击页面中的编辑按钮\n"
				+" 测试预期->1. 跳转至新页面，页面为所选择编辑公告信息信息的详细内容。\n"
				+" 测试步骤->2. 选择一部分文字，点击内容编辑框中的向左靠齐按钮\n"
				+" 测试预期->2. 所选文字向左靠齐\n"
				+" 测试步骤->3. 选择一部分文字，点击内容编辑框中的居中按钮\n"
				+" 测试预期->3. 所选文字居中\n"
				+" 测试步骤->4. 选择一部分文字，点击内容编辑框中的向右靠齐按键\n"
				+" 测试预期->4. 所选文字向右靠齐\n"
				+" 测试步骤->5. 点击内容编辑框中的添加链接按钮\n"
				+" 测试预期->5. 出现超链接添加页面，可填写需要添加至文本内的超链接\n"
				+" 测试步骤->6. 选择一部分文字，点击内容编辑框中的编号按钮\n"
				+" 测试预期->6. 所选文字被编号\n"
				+" 测试步骤->7. 选择一部分文字，点击内容编辑框中的项目分类按钮\n"
				+" 测试预期->7. 所选文字被分类\n"
				+" 测试步骤->8. 点击内容编辑框中的代码视图按钮\n"
				+" 测试预期->8. 编辑文本框中可输入代码，字体修改类按钮变灰色不可选择\n"
				+" 测试步骤->9. 点击保存按钮\n"
				+" 测试预期->9. 页面正常关闭\n"
				+" 测试步骤->10. 点击刚刚更改信息，点击查看按钮\n"
				+" 测试预期->10. 信息含有修改后内容，即信息修改成功\n"
;
	}

}

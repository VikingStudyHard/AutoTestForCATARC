package cn.edu.tju.scs.seql.final_ELV.法规管理_329.行业动态_355;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4468
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 行业动态(#355)
 * 用例名称: 验证行业动态新增功能是否可实现-编辑文本2
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击页面中的新增按钮
 * 测试预期->1. 跳转至新页面，页面为新增行业动态信息的详细内容界面，可填写标题等详细文本内容。
 * 测试步骤->2. 填写标题和类别为：test，写文字：测试，选中，点击内容编辑框中的向左靠齐按钮，
 * 测试预期->2. 测试两字向左靠齐
 * 测试步骤->3. 写文字：再测试，选中，点击内容编辑框中的居中按钮
 * 测试预期->3. 再测试三个字居中
 * 测试步骤->4. 写文字：再再测试，选中，点击内容编辑框中的按钮向右对齐
 * 测试预期->4. 再再测试四字向右靠齐
 * 测试步骤->5. 点击内容编辑框中的添加链接按钮
 * 测试预期->5. 出现超链接添加页面，可填写需要添加至文本内的超链接
 * 测试步骤->6. 点击内容编辑框中的编号按钮
 * 测试预期->6. 编辑文本框中出现数字1，可编号文本内容
 * 测试步骤->7. 点击内容编辑框中的项目分类按钮
 * 测试预期->7. 编辑文本框中出现实心圆点，可分类文本内容
 * 测试步骤->8. 点击内容编辑框中的代码视图按钮
 * 测试预期->8. 编辑文本框中可输入代码，字体修改类按钮变灰色不可选择
 * 测试步骤->9. 点击保存按钮
 * 测试预期->9. 页面被正常关闭，返回至最初页面，页面含有刚新增内容
 * 测试步骤->10. 点击刚刚新增保存的信息，点击查看按钮
 * 测试预期->10. 信息内容修改成功
 * 
 */

public class 验证行业动态新增功能是否可实现_编辑文本2_4468 extends Selenium_Test_Base {
	
	public 验证行业动态新增功能是否可实现_编辑文本2_4468(){
		super();
	}
	
	public 验证行业动态新增功能是否可实现_编辑文本2_4468(WebDriver driver){
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
		return "测试用例id: 4468\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 行业动态(#355)\n"
				+" 用例名称: 验证行业动态新增功能是否可实现-编辑文本2\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击页面中的新增按钮\n"
				+" 测试预期->1. 跳转至新页面，页面为新增行业动态信息的详细内容界面，可填写标题等详细文本内容。\n"
				+" 测试步骤->2. 填写标题和类别为：test，写文字：测试，选中，点击内容编辑框中的向左靠齐按钮，\n"
				+" 测试预期->2. 测试两字向左靠齐\n"
				+" 测试步骤->3. 写文字：再测试，选中，点击内容编辑框中的居中按钮\n"
				+" 测试预期->3. 再测试三个字居中\n"
				+" 测试步骤->4. 写文字：再再测试，选中，点击内容编辑框中的按钮向右对齐\n"
				+" 测试预期->4. 再再测试四字向右靠齐\n"
				+" 测试步骤->5. 点击内容编辑框中的添加链接按钮\n"
				+" 测试预期->5. 出现超链接添加页面，可填写需要添加至文本内的超链接\n"
				+" 测试步骤->6. 点击内容编辑框中的编号按钮\n"
				+" 测试预期->6. 编辑文本框中出现数字1，可编号文本内容\n"
				+" 测试步骤->7. 点击内容编辑框中的项目分类按钮\n"
				+" 测试预期->7. 编辑文本框中出现实心圆点，可分类文本内容\n"
				+" 测试步骤->8. 点击内容编辑框中的代码视图按钮\n"
				+" 测试预期->8. 编辑文本框中可输入代码，字体修改类按钮变灰色不可选择\n"
				+" 测试步骤->9. 点击保存按钮\n"
				+" 测试预期->9. 页面被正常关闭，返回至最初页面，页面含有刚新增内容\n"
				+" 测试步骤->10. 点击刚刚新增保存的信息，点击查看按钮\n"
				+" 测试预期->10. 信息内容修改成功\n"
;
	}

}

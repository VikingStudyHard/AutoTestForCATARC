package cn.edu.tju.scs.seql.final_ELV.消息管理_328.新建消息_348;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2197
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 新建消息(#348)
 * 用例名称: 消息管理-新建消息-新建/编辑内容栏按钮测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息
 *         在新建/编辑内容文本框内输入一下内容：
 *         “​
 *         This is a test.
 *         这是一条测试文本。
 *         ”
 * 测试步骤->1. 全选文本，文本框上方选项第一项，分别选择隶属、黑体、宋体
 * 测试预期->1. 文本内容的字体分别变为隶属、黑体、宋体
 * 测试步骤->2. 全选文本，点击加黑、斜体和下划线按钮
 * 测试预期->2. 文本变化为：先变为加黑、再变为加黑斜体、最后为加黑斜体下划线
 * 测试步骤->3. 全选文本，再次点击加黑、斜体和下划线按钮
 * 测试预期->3. 文本效果一次消失变为默认效果
 * 测试步骤->4. 全选文本，依次点击字体增大、字体减小按钮
 * 测试预期->4. 文本先增大、后减小为默认大小
 * 测试步骤->5. 全选文本，依次点击居中、右对齐、左对齐按钮
 * 测试预期->5. 文本对齐方式依次随之改变
 * 测试步骤->6. 全选文本，点击加超链接按钮，弹出框内输入“baidu.com”，点击确认
 * 测试预期->6. 文本变为蓝色加下划线
 * 测试步骤->7. 全选文本，点击编号按钮两次以及项目符号按钮两次
 * 测试预期->7. 文本依次显示编号，编号消失，显示项目符号，项目符号消失
 * 测试步骤->8. 点击最右侧箭头，代码视图前打勾
 * 测试预期->8. 文本框内内容显示为<p align="left"><font face="宋体" size="2"><a href="http://baidu.com">​This is a test.<br>这是一条测试文本。</a></font></p>
 * 测试步骤->9. 不全选文本，重复步骤1-8,
 * 测试预期->9. 除了步骤5和步骤7结果相同外，其余均无任何效果
 * 
 */

public class 消息管理_新建消息_新建_编辑内容栏按钮测试_2197 extends Selenium_Test_Base {
	
	public 消息管理_新建消息_新建_编辑内容栏按钮测试_2197(){
		super();
	}
	
	public 消息管理_新建消息_新建_编辑内容栏按钮测试_2197(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_新建消息_348.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_新建消息_348.rightFrame);
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
		getElement(ElementEnum_新建消息_348.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_新建消息_348.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		// TODO 编辑操作的插件使用无需使用自动化测试
	
	}

	
	public String getDescription(){
		return "测试用例id: 2197\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 新建消息(#348)\n"
				+" 用例名称: 消息管理-新建消息-新建/编辑内容栏按钮测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息 在新建/编辑内容文本框内输入一下内容： “​ This is a test. 这是一条测试文本。 ”\n"
				+" 测试步骤->1. 全选文本，文本框上方选项第一项，分别选择隶属、黑体、宋体\n"
				+" 测试预期->1. 文本内容的字体分别变为隶属、黑体、宋体\n"
				+" 测试步骤->2. 全选文本，点击加黑、斜体和下划线按钮\n"
				+" 测试预期->2. 文本变化为：先变为加黑、再变为加黑斜体、最后为加黑斜体下划线\n"
				+" 测试步骤->3. 全选文本，再次点击加黑、斜体和下划线按钮\n"
				+" 测试预期->3. 文本效果一次消失变为默认效果\n"
				+" 测试步骤->4. 全选文本，依次点击字体增大、字体减小按钮\n"
				+" 测试预期->4. 文本先增大、后减小为默认大小\n"
				+" 测试步骤->5. 全选文本，依次点击居中、右对齐、左对齐按钮\n"
				+" 测试预期->5. 文本对齐方式依次随之改变\n"
				+" 测试步骤->6. 全选文本，点击加超链接按钮，弹出框内输入“baidu.com”，点击确认\n"
				+" 测试预期->6. 文本变为蓝色加下划线\n"
				+" 测试步骤->7. 全选文本，点击编号按钮两次以及项目符号按钮两次\n"
				+" 测试预期->7. 文本依次显示编号，编号消失，显示项目符号，项目符号消失\n"
				+" 测试步骤->8. 点击最右侧箭头，代码视图前打勾\n"
				+" 测试预期->8. 文本框内内容显示为<p align=“left“><font face=“宋体“ size=“2“><a href=“http://baidu.com“>​This is a test.<br>这是一条测试文本。</a></font></p>\n"
				+" 测试步骤->9. 不全选文本，重复步骤1-8,\n"
				+" 测试预期->9. 除了步骤5和步骤7结果相同外，其余均无任何效果\n"
;
	}

}

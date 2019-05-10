package cn.edu.tju.scs.seql.final_ELV.综合分析_327.报告管理_343;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 7576
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 报告管理(#343)
 * 用例名称: 验证报告管理的报告下载按钮能否实现———异常操作
 * 前置条件: 1、能正常进入综合分析模块
 *         2、在有害物质分析、整车rrr值计算、禁限用物质豁免分析中存在下载失败的报告
 * 测试步骤->1. 进入综合分析模块，点击报告管理
 * 测试预期->1. 出现新页面，页面内容报告选择信息和报表信息
 * 测试步骤->2. 选择之前在禁限用物质豁免分析模块中下载失败的一条记录，点击报告下载。
 * 测试预期->2. 弹出下载界面（迅雷下载），下载完成后所下载的文件后缀为.action，无法打开。
 * 测试步骤->3. 选择之前在有害物质分析模块下载成功的一条记录，点击报告下载。
 * 测试预期->3. 弹出下载界面（迅雷下载），下载excel文件成功。
 * 测试步骤->4. 选择之前在整车rrr值计算模块下载成功的一条记录，点击报告下载。
 * 测试预期->4. 弹出下载界面（迅雷下载），下载excel文件成功。
 * 
 */

public class 验证报告管理的报告下载按钮能否实现___异常操作_7576 extends Selenium_Test_Base {
	
	public 验证报告管理的报告下载按钮能否实现___异常操作_7576(){
		super();
	}
	
	public 验证报告管理的报告下载按钮能否实现___异常操作_7576(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_报告管理_343.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_报告管理_343.rightFrame);
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
		getElement(ElementEnum_报告管理_343.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_报告管理_343.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		System.out.println("测试用例描述功能与实际系统不符合");
	}

	
	public String getDescription(){
		return "测试用例id: 7576\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 报告管理(#343)\n"
				+" 用例名称: 验证报告管理的报告下载按钮能否实现———异常操作\n"
				+" 前置条件: 1、能正常进入综合分析模块 2、在有害物质分析、整车rrr值计算、禁限用物质豁免分析中存在下载失败的报告\n"
				+" 测试步骤->1. 进入综合分析模块，点击报告管理\n"
				+" 测试预期->1. 出现新页面，页面内容报告选择信息和报表信息\n"
				+" 测试步骤->2. 选择之前在禁限用物质豁免分析模块中下载失败的一条记录，点击报告下载。\n"
				+" 测试预期->2. 弹出下载界面（迅雷下载），下载完成后所下载的文件后缀为.action，无法打开。\n"
				+" 测试步骤->3. 选择之前在有害物质分析模块下载成功的一条记录，点击报告下载。\n"
				+" 测试预期->3. 弹出下载界面（迅雷下载），下载excel文件成功。\n"
				+" 测试步骤->4. 选择之前在整车rrr值计算模块下载成功的一条记录，点击报告下载。\n"
				+" 测试预期->4. 弹出下载界面（迅雷下载），下载excel文件成功。\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.车型管理_326.扩展零部件_341;

import static org.testng.Assert.*;

import java.io.File;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4005
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 扩展零部件(#341)
 * 用例名称: 验证扩展零部件信息查询功能是否可实现-导出操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 任选一条车型信息，点击确定按钮
 * 测试预期->1. 跳转至新页面，页面包含所选信息的零部件变更信息，可输入查询参数来查询变更信息。
 * 测试步骤->2. 点击左上角的导出按钮
 * 测试预期->2. 所有变更信息被下载到本地，文件为.xlsx文件
 * 测试步骤->3. 选择一条没有变更过的车型信息，点击确定按钮
 * 测试预期->3. 跳转至新页面，页面包含所选信息的零部件变更信息，可输入查询参数来查询变更信息。
 * 测试步骤->4. 点击左上角的导出按钮
 * 测试预期->4. 出现提示信息：无可导出信息。
 * 
 */

public class 验证扩展零部件信息查询功能是否可实现_导出操作_4005 extends Selenium_Test_Base {
	
	public 验证扩展零部件信息查询功能是否可实现_导出操作_4005(){
		super();
	}
	
	public 验证扩展零部件信息查询功能是否可实现_导出操作_4005(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_扩展零部件_341.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_扩展零部件_341.rightFrame);
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
		getElement(ElementEnum_扩展零部件_341.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_扩展零部件_341.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_扩展零部件_341.表格第一行).click();
		getElement(ElementEnum_扩展零部件_341.确定按钮).click();
		WebDriverConfiguration.operationInterval();
		int count = getElements(ElementEnum_扩展零部件_341.检索结果所有行).size();
		boolean result = downloadOperation(getElement(ElementEnum_扩展零部件_341.导出按钮));
		if (count >= 2){
			assertTrue(result);
		}
		else{
			assertFalse(result);
		}
		//由于检索现在页面上不管有没有记录都会进行下载，所以无法抓取没有记录点击导出按钮后的错误提示框
	}
	
	private boolean downloadOperation(WebElement button){
		File folder = new File("d:\\zddFiles\\downdir");
		for (String file : folder.list()){
			new File("d:\\zddFiles\\downdir\\" + file).delete();
		}
		button.click();
		WebDriverConfiguration.operationInterval();
		return folder.list().length == 1 && (folder.list()[0].endsWith(".xlsx") || folder.list()[0].endsWith(".xls"));
	}

	
	public String getDescription(){
		return "测试用例id: 4005\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 扩展零部件(#341)\n"
				+" 用例名称: 验证扩展零部件信息查询功能是否可实现-导出操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 任选一条车型信息，点击确定按钮\n"
				+" 测试预期->1. 跳转至新页面，页面包含所选信息的零部件变更信息，可输入查询参数来查询变更信息。\n"
				+" 测试步骤->2. 点击左上角的导出按钮\n"
				+" 测试预期->2. 所有变更信息被下载到本地，文件为.xlsx文件\n"
				+" 测试步骤->3. 选择一条没有变更过的车型信息，点击确定按钮\n"
				+" 测试预期->3. 跳转至新页面，页面包含所选信息的零部件变更信息，可输入查询参数来查询变更信息。\n"
				+" 测试步骤->4. 点击左上角的导出按钮\n"
				+" 测试预期->4. 出现提示信息：无可导出信息。\n"
;
	}

}

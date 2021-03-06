package cn.edu.tju.scs.seql.final_ELV.车型管理_326.零部件BOM信息_339;

import static org.testng.Assert.*;

import java.io.File;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3690
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件BOM信息(#339)
 * 用例名称: 验证零部件BOM信息功能是否可实现-新增BOM-基础信息操作2
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 单击左键选择一条信息，点击新增BOM按钮
 * 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。
 * 测试步骤->2. 单击选择一条树形图节点，点击右上角的导出按钮
 * 测试预期->2. 左侧树形图关闭，相应的节点信息成功下载本地，页面无其他相应
 * 测试步骤->3. 单击选择一条树形图节点，点击右上角的返回按钮
 * 测试预期->3. 查看BOM窗口关闭
 * 
 */

public class 验证零部件BOM信息功能是否可实现_新增BOM_基础信息操作2_3690 extends Selenium_Test_Base {
	
	public 验证零部件BOM信息功能是否可实现_新增BOM_基础信息操作2_3690(){
		super();
	}
	
	public 验证零部件BOM信息功能是否可实现_新增BOM_基础信息操作2_3690(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_零部件BOM信息_339.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_零部件BOM信息_339.rightFrame);
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
		getElement(ElementEnum_零部件BOM信息_339.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件BOM信息_339.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		waitingForLoading();
		getElement(ElementEnum_零部件BOM信息_339.新增BOM键).click();
		for (int i = 0; i < 3; i++){
			WebDriverConfiguration.operationInterval();
		}
		
		downloadOperation(getElement(ElementEnum_零部件BOM信息_339.导出键));
		getElement(ElementEnum_零部件BOM信息_339.返回键).click();
		WebDriverConfiguration.operationInterval();
	}
	
	private boolean downloadOperation(WebElement button){
		File folder = new File("d:\\zddFiles\\downdir");
		for (String file : folder.list()){
			new File("d:\\zddFiles\\downdir\\" + file).delete();
		}
		button.click();
		WebDriverConfiguration.operationInterval();
		return folder.list().length == 1 && (folder.list()[0].endsWith(".xlsx"));
	}
	
	private void waitingForLoading(){
		
		do{
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e){
				
			}
		} while((!getElement(ElementEnum_零部件BOM信息_339.Loading框).getCssValue("display").equals("none")));
	}

	
	public String getDescription(){
		return "测试用例id: 3690\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件BOM信息(#339)\n"
				+" 用例名称: 验证零部件BOM信息功能是否可实现-新增BOM-基础信息操作2\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 单击左键选择一条信息，点击新增BOM按钮\n"
				+" 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。\n"
				+" 测试步骤->2. 单击选择一条树形图节点，点击右上角的导出按钮\n"
				+" 测试预期->2. 左侧树形图关闭，相应的节点信息成功下载本地，页面无其他相应\n"
				+" 测试步骤->3. 单击选择一条树形图节点，点击右上角的返回按钮\n"
				+" 测试预期->3. 查看BOM窗口关闭\n"
;
	}

}

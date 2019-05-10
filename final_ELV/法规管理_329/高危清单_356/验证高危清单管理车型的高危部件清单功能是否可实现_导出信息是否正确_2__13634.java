package cn.edu.tju.scs.seql.final_ELV.法规管理_329.高危清单_356;

import static org.testng.Assert.assertEquals;

import java.io.File;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 13634
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 高危清单(#356)
 * 用例名称:  验证高危清单管理车型的高危部件清单功能是否可实现-导出信息是否正确（2）
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 单击左键选择一条车型信息，点击管理车型的高危部件清单按钮
 * 测试预期->1. 跳转至新页面，管理车型的高危部件清单页面包含车型的各项信息和汽车高风险零部件有害物质备案参数表
 * 测试步骤->2. 点击基本信息界面右上角的高危清单导出按钮
 * 测试预期->2. 清单内容被成功下载到本地，文件格式为.doc
 * 测试步骤->3. 点击查看文件
 * 测试预期->3. 导出该节点的名称（节点为接收总成件，显示供货名称，否则节点本身名称），若节点名称为外文，需在备注后将外文名称重新显示一次。[有变化]
 * 
 */

public class 验证高危清单管理车型的高危部件清单功能是否可实现_导出信息是否正确_2__13634 extends Selenium_Test_Base {
	
	public 验证高危清单管理车型的高危部件清单功能是否可实现_导出信息是否正确_2__13634(){
		super();
	}
	
	public 验证高危清单管理车型的高危部件清单功能是否可实现_导出信息是否正确_2__13634(WebDriver driver){
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
		a.searchMyRecord();
		getElement(ElementEnum_高危清单_356.检索结果第一行品牌中文名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.管理车型的高危部件清单按钮).click();
		WebDriverConfiguration.operationInterval();
		downloadOperation(ElementEnum_高危清单_356.第二页高危清单导出按钮);
	}
	
	private boolean downloadOperation(ElementEnum ele){
		File folder = new File("d:\\zddFiles\\downdir");
		folder.mkdirs();
		for (String file : folder.list()){
			new File("d:\\zddFiles\\downdir\\" + file).delete();
		}
		getElement(ele).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		assertEquals(folder.list().length, 1);
		assertEquals(folder.list()[0].endsWith(".doc"), ".doc");
		return folder.list().length == 1 && folder.list()[0].endsWith(".xlsx");
	}

	
	public String getDescription(){
		return "测试用例id: 13634\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 高危清单(#356)\n"
				+" 用例名称:  验证高危清单管理车型的高危部件清单功能是否可实现-导出信息是否正确（2）\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 单击左键选择一条车型信息，点击管理车型的高危部件清单按钮\n"
				+" 测试预期->1. 跳转至新页面，管理车型的高危部件清单页面包含车型的各项信息和汽车高风险零部件有害物质备案参数表\n"
				+" 测试步骤->2. 点击基本信息界面右上角的高危清单导出按钮\n"
				+" 测试预期->2. 清单内容被成功下载到本地，文件格式为.doc\n"
				+" 测试步骤->3. 点击查看文件\n"
				+" 测试预期->3. 导出该节点的名称（节点为接收总成件，显示供货名称，否则节点本身名称），若节点名称为外文，需在备注后将外文名称重新显示一次。[有变化]\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型BOM信息_337;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;

/**
 * 测试用例id: 6658
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型BOM信息(#337)
 * 用例名称: 验证车型BOM信息功能是否可实现-查看BOM--匹配结果操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 单击左键选择一条是否存在BOM一栏为是的信息，点击查看BOM按钮
 * 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。
 * 测试步骤->2. 单击选择一条树形图节点，点击右上角的整体匹配按钮
 * 测试预期->2. 显示“匹配成功”或者“匹配失败”的对话框，只要有一个节点未匹配上即提示匹配失败
 * 测试步骤->3. 点击左侧的打开树按钮
 * 测试预期->3. 如果匹配成功，树节点为黑色，如果匹配失败，某些树节点可能为红色，黄色和绿色
 * 测试步骤->4. 点击右上角的匹配结果按钮
 * 测试预期->4. 跳出新页面：匹配失败的树节点在此页面显示请求状态 如果BOM树形树节点为红色，则请求状态为该MDS不存在 如果BOM树形树节点为黄色，则请求状态为该MDS审核未完成初审 如果BOM树形树节点为绿色，则请求状态为该MDS处于编辑状态
 * 测试步骤->5. 在匹配结果页面点击下载数据
 * 测试预期->5. 匹配结果下载至本地，文件格式为.xlsx
 * 测试步骤->6. 在匹配结果页面点击发送
 * 测试预期->6. 弹出提示信息：请至少选择一条MDS记录
 * 测试步骤->7. 选择请求状态为“该MDS不存在”的一条MDS，点击右上角的发送按钮
 * 测试预期->7. 弹出创建请求的新页面
 * 测试步骤->8. 选择请求状态为“该MDS未完成初审”的一条MDS，点击右上角的发送按钮
 * 测试预期->8. 弹出新建/编辑信息的新页面
 * 测试步骤->9. 单击右上角的返回按钮
 * 测试预期->9. 匹配结果页面关闭
 * 
 */

public class 验证车型BOM信息功能是否可实现_查看BOM__匹配结果操作_6658 extends Selenium_Test_Base {
	
	public 验证车型BOM信息功能是否可实现_查看BOM__匹配结果操作_6658(){
		super();
	}
	
	public 验证车型BOM信息功能是否可实现_查看BOM__匹配结果操作_6658(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_车型BOM信息_337.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_车型BOM信息_337.rightFrame);
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
		getElement(ElementEnum_车型BOM信息_337.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	// 检测载入界面是否完成
	public void judgeMaskLoad(){
		CommonOperationsAll a = new CommonOperationsAll(driver);
		a.judgeElementDisplayNone(ElementEnum_车型BOM信息_337.载入界面);
	}
	public void detailedOperation(){
		getElement(ElementEnum_车型BOM信息_337.车型商标输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.车型商标输入框).sendKeys("test杨杨");
		getElement(ElementEnum_车型BOM信息_337.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		//BOM为是的一栏
		getElement(ElementEnum_车型BOM信息_337.检索BOM为是的行).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.查看BOM按钮).click();
		WebDriverConfiguration.operationInterval();
		judgeMaskLoad();
		//匹配成功或失败的判断条件不明
		/*
		getElement(ElementEnum_车型BOM信息_337.BOM树形图节点).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.整体匹配按钮).click();
		WebDriverConfiguration.operationInterval();
		*/
		getElement(ElementEnum_车型BOM信息_337.BOM树形打开按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_车型BOM信息_337.匹配结果按钮).click();
		WebDriverConfiguration.operationInterval();
		//页面切换
		/*
		getElement(ElementEnum_车型BOM信息_337.匹配结果页面下载按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_车型BOM信息_337.匹配结果页面发送按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(driver.getPageSource().contains("请至少选择一条MDS记录"));
		getElement(ElementEnum_车型BOM信息_337.匹配提示信息确定按钮).click();
		
		getElement(ElementEnum_车型BOM信息_337.匹配结果页面关闭按钮).click();
		WebDriverConfiguration.operationInterval();
		*/
		
	}

	
	public String getDescription(){
		return "测试用例id: 6658\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型BOM信息(#337)\n"
				+" 用例名称: 验证车型BOM信息功能是否可实现-查看BOM--匹配结果操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 单击左键选择一条是否存在BOM一栏为是的信息，点击查看BOM按钮\n"
				+" 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。\n"
				+" 测试步骤->2. 单击选择一条树形图节点，点击右上角的整体匹配按钮\n"
				+" 测试预期->2. 显示“匹配成功”或者“匹配失败”的对话框，只要有一个节点未匹配上即提示匹配失败\n"
				+" 测试步骤->3. 点击左侧的打开树按钮\n"
				+" 测试预期->3. 如果匹配成功，树节点为黑色，如果匹配失败，某些树节点可能为红色，黄色和绿色\n"
				+" 测试步骤->4. 点击右上角的匹配结果按钮\n"
				+" 测试预期->4. 跳出新页面：匹配失败的树节点在此页面显示请求状态 如果BOM树形树节点为红色，则请求状态为该MDS不存在 如果BOM树形树节点为黄色，则请求状态为该MDS审核未完成初审 如果BOM树形树节点为绿色，则请求状态为该MDS处于编辑状态\n"
				+" 测试步骤->5. 在匹配结果页面点击下载数据\n"
				+" 测试预期->5. 匹配结果下载至本地，文件格式为.xlsx\n"
				+" 测试步骤->6. 在匹配结果页面点击发送\n"
				+" 测试预期->6. 弹出提示信息：请至少选择一条MDS记录\n"
				+" 测试步骤->7. 选择请求状态为“该MDS不存在”的一条MDS，点击右上角的发送按钮\n"
				+" 测试预期->7. 弹出创建请求的新页面\n"
				+" 测试步骤->8. 选择请求状态为“该MDS未完成初审”的一条MDS，点击右上角的发送按钮\n"
				+" 测试预期->8. 弹出新建/编辑信息的新页面\n"
				+" 测试步骤->9. 单击右上角的返回按钮\n"
				+" 测试预期->9. 匹配结果页面关闭\n"
;
	}

}

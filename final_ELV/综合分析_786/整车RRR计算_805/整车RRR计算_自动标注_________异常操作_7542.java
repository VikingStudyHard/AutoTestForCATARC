package cn.edu.tju.scs.seql.final_ELV.综合分析_786.整车RRR计算_805;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.有害物质分析_342.ElementEnum_有害物质分析_342;

/**
 * 测试用例id: 7542
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 整车RRR计算(#805)
 * 用例名称: 整车RRR计算，自动标注---------异常操作
 * 前置条件: 1、该车型至少已匹配或挂接一个零部件
 *         2、该零部件已在零部件RRR计算中进行标注并标注锁定
 * 测试步骤->1. 进入综合分析模块，点击整车RRR值计算，选择一条车型信息，点击确定。
 * 测试预期->1. 跳转至新页面，页面左侧一栏为车型BOM树形，右侧一栏为基础信息。
 * 测试步骤->2. 2  点击自动标注
 * 测试预期->2. 弹出系统提示对话框：“确定要自动标注吗？”
 * 测试步骤->3. 点击“是”
 * 测试预期->3. 弹出提示对话框：“RRR自动标注中...”，然后出现提示对话框：“自动标注成功！”
 * 测试步骤->4. 点击确定按钮，展开车型BOM树形
 * 测试预期->4. 看到标注成功的材料节点或零部件节点上面出现对号标志
 * 测试步骤->5. 选中在零部件RRR计算中标注锁定的零部件，点击自动标注
 * 测试预期->5.  页面提示信息：“该节点已经被标注锁定，不允许操作 ”
 * 测试步骤->6. 选中被标注的零部件，点击取消标注
 * 测试预期->6.  页面提示信息：“该节点已经被标注锁定，不允许操作 ”
 * 测试步骤->7. 选中根节点，点击清空标注
 * 测试预期->7. BOM树形中除了标注锁定的节点，其他节点的标注全部被清空。
 * 
 */

public class 整车RRR计算_自动标注_________异常操作_7542 extends Selenium_Test_Base {
	
	public 整车RRR计算_自动标注_________异常操作_7542(){
		super();
	}
	
	public 整车RRR计算_自动标注_________异常操作_7542(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_整车RRR计算_805.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_整车RRR计算_805.rightFrame);
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
		getElement(ElementEnum_整车RRR计算_805.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_整车RRR计算_805.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_有害物质分析_342.品牌名称输入框).clear();
		getElement(ElementEnum_有害物质分析_342.品牌名称输入框).sendKeys("testbiaosheng");
		getElement(ElementEnum_有害物质分析_342.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_整车RRR计算_805.检索结果第一行品牌中文名称).click();
		getElement(ElementEnum_整车RRR计算_805.第一页确定按钮).click();
		
		getElement(ElementEnum_整车RRR计算_805.树形图第一个根节点).click();
		judgeMaskLoad();
		getElement(ElementEnum_整车RRR计算_805.第二页自动标注按钮).click();
		getElement(ElementEnum_整车RRR计算_805.第二页双选弹窗是按钮).click();
		WebDriverConfiguration.operationInterval();
		int times = 20;
		while(getElement(ElementEnum_整车RRR计算_805.第二页弹窗提示信息).getText().contains("RRR自动标注中") && times > 0){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			times--;
		}
		assertTrue(getElement(ElementEnum_整车RRR计算_805.第二页弹窗提示信息).getText().contains("自动标注成功！"));
		getElement(ElementEnum_整车RRR计算_805.第二页单选弹窗确认按钮).click();
		
		getElement(ElementEnum_整车RRR计算_805.BOM树形前方加号按钮).click();
		getElement(ElementEnum_整车RRR计算_805.BOM树中标注锁定选项).click();
		judgeMaskLoad();
		getElement(ElementEnum_整车RRR计算_805.第二页自动标注按钮).click();
		assertTrue(getElement(ElementEnum_整车RRR计算_805.第二页弹窗提示信息).getText().contains("该节点已经被标注锁定，不允许操作"));
		getElement(ElementEnum_整车RRR计算_805.第二页单选弹窗确认按钮).click();
		
		getElement(ElementEnum_整车RRR计算_805.树形图第一个根节点).click();
		judgeMaskLoad();
		getElement(ElementEnum_整车RRR计算_805.第二页清空标注按钮).click();
		getElement(ElementEnum_整车RRR计算_805.第二页双选弹窗是按钮).click();
		
		times = 20;
		while(!getElement(ElementEnum_整车RRR计算_805.第二页弹窗提示信息).getText().contains("标注已清空") && times > 0){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			times--;
		}
		assertTrue(times > 0);
		
	}
	
	// 检测载入界面是否完成
	public void judgeMaskLoad(){
		CommonOperationsAll a = new CommonOperationsAll(driver);
		a.judgeElementDisplayNone(ElementEnum_有害物质分析_342.载入界面);
	}

	
	public String getDescription(){
		return "测试用例id: 7542\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 整车RRR计算(#805)\n"
				+" 用例名称: 整车RRR计算，自动标注---------异常操作\n"
				+" 前置条件: 1、该车型至少已匹配或挂接一个零部件 2、该零部件已在零部件RRR计算中进行标注并标注锁定\n"
				+" 测试步骤->1. 进入综合分析模块，点击整车RRR值计算，选择一条车型信息，点击确定。\n"
				+" 测试预期->1. 跳转至新页面，页面左侧一栏为车型BOM树形，右侧一栏为基础信息。\n"
				+" 测试步骤->2. 2  点击自动标注\n"
				+" 测试预期->2. 弹出系统提示对话框：“确定要自动标注吗？”\n"
				+" 测试步骤->3. 点击“是”\n"
				+" 测试预期->3. 弹出提示对话框：“RRR自动标注中...”，然后出现提示对话框：“自动标注成功！”\n"
				+" 测试步骤->4. 点击确定按钮，展开车型BOM树形\n"
				+" 测试预期->4. 看到标注成功的材料节点或零部件节点上面出现对号标志\n"
				+" 测试步骤->5. 选中在零部件RRR计算中标注锁定的零部件，点击自动标注\n"
				+" 测试预期->5.  页面提示信息：“该节点已经被标注锁定，不允许操作 ”\n"
				+" 测试步骤->6. 选中被标注的零部件，点击取消标注\n"
				+" 测试预期->6.  页面提示信息：“该节点已经被标注锁定，不允许操作 ”\n"
				+" 测试步骤->7. 选中根节点，点击清空标注\n"
				+" 测试预期->7. BOM树形中除了标注锁定的节点，其他节点的标注全部被清空。\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.综合分析_327.整车RRR计算_346;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4199
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 整车RRR计算(#346)
 * 用例名称: 验证整车RRR计算中确定功能是否可实现-基本信息操作-回收利用率信息标注
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮
 * 测试预期->1. 跳转至新页面，页面包含整车RRR计算基础信息表格
 * 测试步骤->2. 点击基本信息界面右上角的回收利用率信息标注按钮
 * 测试预期->2. 出现提示信息：不能标注根节点！
 * 测试步骤->3. 单击左键选择任意一个已标注非根节点，点击基本信息界面右上角的回收利用率信息标注按钮
 * 测试预期->3. 出现提示信息：该节点已经标注！
 * 测试步骤->4. 单击左键选择任意一个叶子节点，点击基本信息界面右上角的回收利用率信息标注按钮
 * 测试预期->4. 出现提示信息：无法为物质节点标注回收利用信息
 * 测试步骤->5. 单击左键选择任意一个未标注非根节点，点击基本信息界面右上角的回收利用率信息标注按钮
 * 测试预期->5. 跳转至新页面，页面为回收利用率信息标注，其中含有不可更改的基本信息，和可填写的回收利用率信息标注信息
 * 测试步骤->6. 点击新页面的标注按钮
 * 测试预期->6. 出现提示信息：请选择标注名称！
 * 测试步骤->7. 点击选择回收利用率信息标注信息为md(拆解)，点击新页面的标注按钮
 * 测试预期->7. 页面正常关闭，回收利用率信息标注成功
 * 
 */

public class 验证整车RRR计算中确定功能是否可实现_基本信息操作_回收利用率信息标注_4199 extends Selenium_Test_Base {
	
	public 验证整车RRR计算中确定功能是否可实现_基本信息操作_回收利用率信息标注_4199(){
		super();
	}
	
	public 验证整车RRR计算中确定功能是否可实现_基本信息操作_回收利用率信息标注_4199(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_整车RRR计算_346.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_整车RRR计算_346.rightFrame);
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
		getElement(ElementEnum_整车RRR计算_346.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_整车RRR计算_346.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_整车RRR计算_346 a = new CommonOperations_整车RRR计算_346(driver);
		a.getIntoSecondPage();
		
		getElement(ElementEnum_整车RRR计算_346.第二页回收利用率信息标注按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(getElement(ElementEnum_整车RRR计算_346.第二页弹窗提示信息).getText().contains("不允许标注车型根节点"));
		getElement(ElementEnum_整车RRR计算_346.第二页单选弹窗确认按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_整车RRR计算_346.BOM树已标注子节点).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_整车RRR计算_346.第二页回收利用率信息标注按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(getElement(ElementEnum_整车RRR计算_346.第二页弹窗提示信息).getText().contains("该节点已经标注"));
		getElement(ElementEnum_整车RRR计算_346.第二页单选弹窗确认按钮).click();
		WebDriverConfiguration.operationInterval();
		
//		getElement(ElementEnum_整车RRR计算_346.BOM树已标注子节点前加号).click();
//		a.judgeMaskLoadSecond();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_整车RRR计算_346.BOM树中物质节点).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_整车RRR计算_346.第二页回收利用率信息标注按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(getElement(ElementEnum_整车RRR计算_346.第二页弹窗提示信息).getText().contains("无法为物质节点标注回收利用信息"));
		getElement(ElementEnum_整车RRR计算_346.第二页单选弹窗确认按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_整车RRR计算_346.BOM树未标注子节点).click();
		a.judgeMaskLoadSecond();
		
		{// 保证未标注子节点未被标注
			getElement(ElementEnum_整车RRR计算_346.第二页取消标注按钮).click();
			WebDriverConfiguration.operationInterval();
			if(getElement(ElementEnum_整车RRR计算_346.第二页弹窗提示信息).getText().contains("该节点未进行标注")){
				getElement(ElementEnum_整车RRR计算_346.第二页单选弹窗确认按钮).click();
				WebDriverConfiguration.operationInterval();
			}else if(getElement(ElementEnum_整车RRR计算_346.第二页弹窗提示信息).getText().contains("确定要取消该节点标注吗")){
				getElement(ElementEnum_整车RRR计算_346.第二页双选弹窗是按钮).click();
				WebDriverConfiguration.operationInterval();
			}
		}
		
		
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_整车RRR计算_346.第二页回收利用率信息标注按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_整车RRR计算_346.回收利用率信息标注弹窗标注按钮).click();
		assertTrue(getElement(ElementEnum_整车RRR计算_346.第二页弹窗提示信息).getText().contains("请您选择回收利用阶段"));
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_整车RRR计算_346.第二页单选弹窗确认按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_整车RRR计算_346.回收利用率信息标注弹窗输入框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_整车RRR计算_346.回收利用率信息标注弹窗选项_拆解).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_整车RRR计算_346.回收利用率信息标注弹窗标注按钮).click();
		WebDriverConfiguration.operationInterval();
		
		{// 保证未标注子节点未被标注
			getElement(ElementEnum_整车RRR计算_346.第二页取消标注按钮).click();
			WebDriverConfiguration.operationInterval();
			if(getElement(ElementEnum_整车RRR计算_346.第二页弹窗提示信息).getText().contains("该节点未进行标注")){
				getElement(ElementEnum_整车RRR计算_346.第二页单选弹窗确认按钮).click();
				WebDriverConfiguration.operationInterval();
			}else if(getElement(ElementEnum_整车RRR计算_346.第二页弹窗提示信息).getText().contains("确定要取消该节点标注吗")){
				getElement(ElementEnum_整车RRR计算_346.第二页双选弹窗是按钮).click();
				WebDriverConfiguration.operationInterval();
			}
		}
		
	}

	
	public String getDescription(){
		return "测试用例id: 4199\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 整车RRR计算(#346)\n"
				+" 用例名称: 验证整车RRR计算中确定功能是否可实现-基本信息操作-回收利用率信息标注\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮\n"
				+" 测试预期->1. 跳转至新页面，页面包含整车RRR计算基础信息表格\n"
				+" 测试步骤->2. 点击基本信息界面右上角的回收利用率信息标注按钮\n"
				+" 测试预期->2. 出现提示信息：不能标注根节点！\n"
				+" 测试步骤->3. 单击左键选择任意一个已标注非根节点，点击基本信息界面右上角的回收利用率信息标注按钮\n"
				+" 测试预期->3. 出现提示信息：该节点已经标注！\n"
				+" 测试步骤->4. 单击左键选择任意一个叶子节点，点击基本信息界面右上角的回收利用率信息标注按钮\n"
				+" 测试预期->4. 出现提示信息：无法为物质节点标注回收利用信息\n"
				+" 测试步骤->5. 单击左键选择任意一个未标注非根节点，点击基本信息界面右上角的回收利用率信息标注按钮\n"
				+" 测试预期->5. 跳转至新页面，页面为回收利用率信息标注，其中含有不可更改的基本信息，和可填写的回收利用率信息标注信息\n"
				+" 测试步骤->6. 点击新页面的标注按钮\n"
				+" 测试预期->6. 出现提示信息：请选择标注名称！\n"
				+" 测试步骤->7. 点击选择回收利用率信息标注信息为md(拆解)，点击新页面的标注按钮\n"
				+" 测试预期->7. 页面正常关闭，回收利用率信息标注成功\n"
;
	}

}

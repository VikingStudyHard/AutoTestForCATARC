package cn.edu.tju.scs.seql.final_ELV.综合分析_327.整车RRR计算_346;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4206
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 整车RRR计算(#346)
 * 用例名称: 验证整车RRR计算中确定功能是否可实现-基本信息操作-其他
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮
 * 测试预期->1. 跳转至新页面，页面包含整车RRR计算基础信息表格
 * 测试步骤->2. 点击基本信息界面右上角的返回按钮
 * 测试预期->2. 页面被正常关闭，返回至整车RRR计算界面
 * 测试步骤->3. 单击左键选择一条车型信息，点击确定按钮
 * 测试预期->3. 跳转至新页面，页面包含整车RRR计算基础信息表格
 * 测试步骤->4. 点击基本信息界面右上角的校验按钮
 * 测试预期->4. 跳转至新页面，含有所有校验信息
 * 测试步骤->5. 点击校验信息界面的查看按钮
 * 测试预期->5. 出现提示信息：请选择一条信息！
 * 测试步骤->6. 选择一条校验信息，点击查看按钮
 * 测试预期->6. 页面跳转回整车RRR计算基础信息表格，所选择的校验信息详细显示在节点信息模块中
 * 
 */

public class 验证整车RRR计算中确定功能是否可实现_基本信息操作_其他_4206 extends Selenium_Test_Base {
	
	public 验证整车RRR计算中确定功能是否可实现_基本信息操作_其他_4206(){
		super();
	}
	
	public 验证整车RRR计算中确定功能是否可实现_基本信息操作_其他_4206(WebDriver driver){
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
		
		getElement(ElementEnum_整车RRR计算_346.第二页返回按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.getIntoSecondPage();
		
		
		
	}

	
	public String getDescription(){
		return "测试用例id: 4206\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 整车RRR计算(#346)\n"
				+" 用例名称: 验证整车RRR计算中确定功能是否可实现-基本信息操作-其他\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮\n"
				+" 测试预期->1. 跳转至新页面，页面包含整车RRR计算基础信息表格\n"
				+" 测试步骤->2. 点击基本信息界面右上角的返回按钮\n"
				+" 测试预期->2. 页面被正常关闭，返回至整车RRR计算界面\n"
				+" 测试步骤->3. 单击左键选择一条车型信息，点击确定按钮\n"
				+" 测试预期->3. 跳转至新页面，页面包含整车RRR计算基础信息表格\n"
				+" 测试步骤->4. 点击基本信息界面右上角的校验按钮\n"
				+" 测试预期->4. 跳转至新页面，含有所有校验信息\n"
				+" 测试步骤->5. 点击校验信息界面的查看按钮\n"
				+" 测试预期->5. 出现提示信息：请选择一条信息！\n"
				+" 测试步骤->6. 选择一条校验信息，点击查看按钮\n"
				+" 测试预期->6. 页面跳转回整车RRR计算基础信息表格，所选择的校验信息详细显示在节点信息模块中\n"
;
	}

}

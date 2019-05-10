package cn.edu.tju.scs.seql.final_ELV.综合分析_327.整车RRR计算_346;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4221
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 整车RRR计算(#346)
 * 用例名称: 验证整车RRR计算的确定功能是否可以实现-回收利用率报告-查询类型
 * 前置条件: 能正确进入综合分析模块
 * 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮
 * 测试预期->1. 跳转至新页面，页面包含整车RRR计算基础信息表格
 * 测试步骤->2. 点击基本信息界面右上角的回收利用率报告按钮
 * 测试预期->2. 跳转至查找MDS信息页面，含有可以填写参数来查找的功能
 * 测试步骤->3. 点击选择查询类型中的全部，点击查询按钮
 * 测试预期->3. 查询出所有类型的MDS信息
 * 测试步骤->4. 点击选择查询类型中的零部件，点击查询按钮
 * 测试预期->4. 查询出所有零部件的MDS信息
 * 测试步骤->5. 点击选择查询类型中的半成品，点击查询按钮
 * 测试预期->5. 查询出所有半成品的MDS信息
 * 测试步骤->6. 点击选择查询类型中的材料，点击查询按钮
 * 测试预期->6. 查询出所有材料的MDS信息
 * 
 */

public class 验证整车RRR计算的确定功能是否可以实现_回收利用率报告_查询类型_4221 extends Selenium_Test_Base {
	
	public 验证整车RRR计算的确定功能是否可以实现_回收利用率报告_查询类型_4221(){
		super();
	}
	
	public 验证整车RRR计算的确定功能是否可以实现_回收利用率报告_查询类型_4221(WebDriver driver){
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
		a.getIntoThirdPage();
		
		getElement(ElementEnum_整车RRR计算_346.第三页查询类型输入框).click();
	    WebDriverConfiguration.operationInterval();
	    getElement(ElementEnum_整车RRR计算_346.第三页查询类型选项_全部).click();
	    WebDriverConfiguration.operationInterval();
	    getElement(ElementEnum_整车RRR计算_346.第三页报告查询按钮).click();
	    WebDriverConfiguration.operationInterval();
	    a.judgeMaskLoadPageThird();
	    
	    getElement(ElementEnum_整车RRR计算_346.第三页查询类型输入框).click();
	    WebDriverConfiguration.operationInterval();
	    getElement(ElementEnum_整车RRR计算_346.第三页查询类型选项_零部件).click();
	    WebDriverConfiguration.operationInterval();
	    getElement(ElementEnum_整车RRR计算_346.第三页报告查询按钮).click();
	    WebDriverConfiguration.operationInterval();
	    a.judgeMaskLoadPageThird();
	    
	    getElement(ElementEnum_整车RRR计算_346.第三页查询类型输入框).click();
	    WebDriverConfiguration.operationInterval();
	    getElement(ElementEnum_整车RRR计算_346.第三页查询类型选项_半成品).click();
	    WebDriverConfiguration.operationInterval();
	    getElement(ElementEnum_整车RRR计算_346.第三页报告查询按钮).click();
	    WebDriverConfiguration.operationInterval();
	    a.judgeMaskLoadPageThird();
	    
	    getElement(ElementEnum_整车RRR计算_346.第三页查询类型输入框).click();
	    WebDriverConfiguration.operationInterval();
	    getElement(ElementEnum_整车RRR计算_346.第三页查询类型选项_材料).click();
	    WebDriverConfiguration.operationInterval();
	    getElement(ElementEnum_整车RRR计算_346.第三页报告查询按钮).click();
	    WebDriverConfiguration.operationInterval();
	    a.judgeMaskLoadPageThird();
	
	}
	
	public String getDescription(){
		return "测试用例id: 4221\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 整车RRR计算(#346)\n"
				+" 用例名称: 验证整车RRR计算的确定功能是否可以实现-回收利用率报告-查询类型\n"
				+" 前置条件: 能正确进入综合分析模块\n"
				+" 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮\n"
				+" 测试预期->1. 跳转至新页面，页面包含整车RRR计算基础信息表格\n"
				+" 测试步骤->2. 点击基本信息界面右上角的回收利用率报告按钮\n"
				+" 测试预期->2. 跳转至查找MDS信息页面，含有可以填写参数来查找的功能\n"
				+" 测试步骤->3. 点击选择查询类型中的全部，点击查询按钮\n"
				+" 测试预期->3. 查询出所有类型的MDS信息\n"
				+" 测试步骤->4. 点击选择查询类型中的零部件，点击查询按钮\n"
				+" 测试预期->4. 查询出所有零部件的MDS信息\n"
				+" 测试步骤->5. 点击选择查询类型中的半成品，点击查询按钮\n"
				+" 测试预期->5. 查询出所有半成品的MDS信息\n"
				+" 测试步骤->6. 点击选择查询类型中的材料，点击查询按钮\n"
				+" 测试预期->6. 查询出所有材料的MDS信息\n"
;
	}

}

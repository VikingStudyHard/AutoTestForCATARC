package cn.edu.tju.scs.seql.final_ELV.综合分析_327.零部件RRR计算_345;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4255
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件RRR计算(#345)
 * 用例名称: 验证零部件RRR计算的筛选标注功能是否可以实现
 * 前置条件: 能正确进入综合分析模块
 * 测试步骤->1. 点击零部件RRR计算页面中的条件筛选按钮
 * 测试预期->1. 跳转至条件筛选页面
 * 测试步骤->2. 点击页面中的导出按钮
 * 测试预期->2. 页面出现提示信息：请选择回收处理阶段!
 * 测试步骤->3. 选择回收处理阶段为：mte
 * 测试预期->3. 页面出现两项新的选择内容，为材料分类和材料范围，其中材料分类被标记为必填项
 * 测试步骤->4. 点击页面中的导出按钮
 * 测试预期->4. 页面出现提示信息：材料分类不能为空!
 * 测试步骤->5. 选择材料分类为：1.1.1 : 非合金钢（碳钢），低合金钢，点击页面中的导出按钮
 * 测试预期->5. 页面出现提示信息：没有查询到数据,请重新选择! 
 * 测试步骤->6. 选择材料分类为：1.2 : 铸铁，点击页面中的导出按钮
 * 测试预期->6. 页面出现提示信息：操作成功！信息被导出至本地
 * 
 */

public class 验证零部件RRR计算的筛选标注功能是否可以实现_4255 extends Selenium_Test_Base {
	
	public 验证零部件RRR计算的筛选标注功能是否可以实现_4255(){
		super();
	}
	
	public 验证零部件RRR计算的筛选标注功能是否可以实现_4255(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_零部件RRR计算_345.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_零部件RRR计算_345.rightFrame);
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
		getElement(ElementEnum_零部件RRR计算_345.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_零部件RRR计算_345.筛选标注按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.筛选标注页面导出按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(getElement(ElementEnum_零部件RRR计算_345.错误信息).getText().contains("请选择回收处理阶段!"),"没有提示请选择回收处理阶段!");
		getElement(ElementEnum_零部件RRR计算_345.错误信息确定按钮).click();
		
		getElement(ElementEnum_零部件RRR计算_345.回收处理阶段).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.回收处理阶段选择1).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.筛选标注页面导出按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(getElement(ElementEnum_零部件RRR计算_345.错误信息).getText().contains("材料分类不能为空!"),"没有提示材料分类不能为空!");
		getElement(ElementEnum_零部件RRR计算_345.错误信息确定按钮).click();
		
		getElement(ElementEnum_零部件RRR计算_345.材料分类).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.材料分类选择1).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.筛选标注页面导出按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(getElement(ElementEnum_零部件RRR计算_345.错误信息).getText().contains("没有查询到数据,请重新选择!"),"没有提示没有查询到数据,请重新选择!");
		getElement(ElementEnum_零部件RRR计算_345.错误信息确定按钮).click();
		
		
		/*
		assertEquals(driver.findElement(By.xpath("//td")).getText(), "企业名称:");
	    assertEquals(driver.findElement(By.xpath("//td[3]")).getText(), "企业ID:");
	    assertEquals(driver.findElement(By.xpath("//td[5]")).getText(), "计划员:");
	    assertEquals(driver.findElement(By.xpath("//td[7]")).getText(), "区域");
	    assertEquals(driver.findElement(By.xpath("//td[9]")).getText(), "新增信息来源");
	    assertEquals(driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td/div/input")).getText(), "");
		*/
	
	}

	
	public String getDescription(){
		return "测试用例id: 4255\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件RRR计算(#345)\n"
				+" 用例名称: 验证零部件RRR计算的筛选标注功能是否可以实现\n"
				+" 前置条件: 能正确进入综合分析模块\n"
				+" 测试步骤->1. 点击零部件RRR计算页面中的条件筛选按钮\n"
				+" 测试预期->1. 跳转至条件筛选页面\n"
				+" 测试步骤->2. 点击页面中的导出按钮\n"
				+" 测试预期->2. 页面出现提示信息：请选择回收处理阶段!\n"
				+" 测试步骤->3. 选择回收处理阶段为：mte\n"
				+" 测试预期->3. 页面出现两项新的选择内容，为材料分类和材料范围，其中材料分类被标记为必填项\n"
				+" 测试步骤->4. 点击页面中的导出按钮\n"
				+" 测试预期->4. 页面出现提示信息：材料分类不能为空!\n"
				+" 测试步骤->5. 选择材料分类为：1.1.1 : 非合金钢（碳钢），低合金钢，点击页面中的导出按钮\n"
				+" 测试预期->5. 页面出现提示信息：没有查询到数据,请重新选择! \n"
				+" 测试步骤->6. 选择材料分类为：1.2 : 铸铁，点击页面中的导出按钮\n"
				+" 测试预期->6. 页面出现提示信息：操作成功！信息被导出至本地\n"
;
	}

}

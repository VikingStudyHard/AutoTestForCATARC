package cn.edu.tju.scs.seql.final_ELV.数据管理_325.审核信息_334;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3446
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 审核信息(#334)
 * 用例名称: 验证输入具体参数，是否能够查询MDS审核信息-异常操作
 * 前置条件: 拥有MDS审核信息的权限
 * 测试步骤->1. 选择查询类型为全部，表单来源为全部，名称为t，供货编号为SPCC，点击查询按钮
 * 测试预期->1. 获得部分MDS审核信息。所有数据的产品名称中含有字段t，供货编号为SPCC。
 * 测试步骤->2. 选择查询类型为全部，表单来源为全部，名称为t，供货编号为FTRD，点击查询按钮
 * 测试预期->2. 无符合条件信息显示
 * 测试步骤->3. 选择查询类型为全部，表单来源为全部，名称为t，供货编号为空，ID为	 CA_5_13182570，点击查询按钮
 * 测试预期->3. 获得部分MDS审核信息。所有数据的产品名称中含有字段t，ID为	 CA_5_13182570。
 * 测试步骤->4. 选择查询类型为全部，表单来源为全部，名称为C，供货编号为空，ID为	 CA_5_13182570，点击查询按钮
 * 测试预期->4. 无符合条件信息显示
 * 测试步骤->5. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为创建时间，开始时间16年03月29日 13:12:35大于结束时间16年03月22日 13:12:35，点击查询。
 * 测试预期->5. 页面出现提示：开始时间早于结束时间！
 * 测试步骤->6. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为创建时间，开始时间16年03月29日 13:12:35等于结束时间16年03月29日 13:12:35，点击查询。
 * 测试预期->6. 无符合条件信息显示
 * 测试步骤->7. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为创建时间，开始时间16年03月29日 13:12:35，结束时间在未来16年08月30日 13:12:35，点击查询。
 * 测试预期->7. 获得部分MDS审核信息。所有数据的时间在所选区间内。
 * 测试步骤->8. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为创建时间，开始时间开始时间13年10月06日 13:12:35，结束时间在未来16年08月30日 13:12:35，点击查询。
 * 测试预期->8. 无符合条件信息显示
 * 
 */

public class 验证输入具体参数_是否能够查询MDS审核信息_异常操作_3446 extends Selenium_Test_Base {
	
	public 验证输入具体参数_是否能够查询MDS审核信息_异常操作_3446(){
		super();
	}
	
	public 验证输入具体参数_是否能够查询MDS审核信息_异常操作_3446(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_审核信息_334.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_审核信息_334.rightFrame);
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
		//getElement(ElementEnum_审核信息_334.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_审核信息_334.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_审核信息_334.查询按钮).click();
		Assert.fail("该模块表单类型没有在检索表单里出现，无法进一步进行测试");
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
		return "测试用例id: 3446\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 审核信息(#334)\n"
				+" 用例名称: 验证输入具体参数，是否能够查询MDS审核信息-异常操作\n"
				+" 前置条件: 拥有MDS审核信息的权限\n"
				+" 测试步骤->1. 选择查询类型为全部，表单来源为全部，名称为t，供货编号为SPCC，点击查询按钮\n"
				+" 测试预期->1. 获得部分MDS审核信息。所有数据的产品名称中含有字段t，供货编号为SPCC。\n"
				+" 测试步骤->2. 选择查询类型为全部，表单来源为全部，名称为t，供货编号为FTRD，点击查询按钮\n"
				+" 测试预期->2. 无符合条件信息显示\n"
				+" 测试步骤->3. 选择查询类型为全部，表单来源为全部，名称为t，供货编号为空，ID为	 CA_5_13182570，点击查询按钮\n"
				+" 测试预期->3. 获得部分MDS审核信息。所有数据的产品名称中含有字段t，ID为	 CA_5_13182570。\n"
				+" 测试步骤->4. 选择查询类型为全部，表单来源为全部，名称为C，供货编号为空，ID为	 CA_5_13182570，点击查询按钮\n"
				+" 测试预期->4. 无符合条件信息显示\n"
				+" 测试步骤->5. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为创建时间，开始时间16年03月29日 13:12:35大于结束时间16年03月22日 13:12:35，点击查询。\n"
				+" 测试预期->5. 页面出现提示：开始时间早于结束时间！\n"
				+" 测试步骤->6. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为创建时间，开始时间16年03月29日 13:12:35等于结束时间16年03月29日 13:12:35，点击查询。\n"
				+" 测试预期->6. 无符合条件信息显示\n"
				+" 测试步骤->7. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为创建时间，开始时间16年03月29日 13:12:35，结束时间在未来16年08月30日 13:12:35，点击查询。\n"
				+" 测试预期->7. 获得部分MDS审核信息。所有数据的时间在所选区间内。\n"
				+" 测试步骤->8. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为创建时间，开始时间开始时间13年10月06日 13:12:35，结束时间在未来16年08月30日 13:12:35，点击查询。\n"
				+" 测试预期->8. 无符合条件信息显示\n"
;
	}

}

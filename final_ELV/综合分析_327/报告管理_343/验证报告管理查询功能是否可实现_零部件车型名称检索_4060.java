package cn.edu.tju.scs.seql.final_ELV.综合分析_327.报告管理_343;

import static cn.edu.tju.scs.seql.final_ELV.commonOperations.OperationUnit.tuplesOperation;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.零部件RRR计算_345.ElementEnum_零部件RRR计算_345;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4060
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 报告管理(#343)
 * 用例名称: 验证报告管理查询功能是否可实现-零部件车型名称检索 
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 点击选择零部件，在报告管理的查询条件：车型名称中填写1，点击检索按钮
 * 测试预期->1. 无符合条件的信息被检索出
 * 测试步骤->2. 点击选择零部件，在报告管理的查询条件：车型名称中填写ELVT，点击检索按钮
 * 测试预期->2. 无符合条件的信息被检索出
 * 测试步骤->3. 点击选择零部件，在报告管理的查询条件：车型名称中填写ELVTEST，点击检索按钮
 * 测试预期->3. 车型名称（中文或英文）名称中为ELVTEST的所有报告管理信息被检索出来
 * 
 */

public class 验证报告管理查询功能是否可实现_零部件车型名称检索_4060 extends Selenium_Test_Base {
	
	public 验证报告管理查询功能是否可实现_零部件车型名称检索_4060(){
		super();
	}
	
	public 验证报告管理查询功能是否可实现_零部件车型名称检索_4060(WebDriver driver){
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
	public void detailedOperation() throws IOException {
		String str=getDescription();
		String name= Han.getTestCaseName(str);
		//读取三元组文件
		tuplesOperation(driver,name);
//		testQueryName("1");
//		testQueryName("ELVT");
//		testQueryName("ELVTEST");
	}
	
	public void testQueryName(String name){
		getElement(ElementEnum_零部件RRR计算_345.选择查询类型).click();
		getElement(ElementEnum_零部件RRR计算_345.选择查询类型_零部件).click();
		getElement(ElementEnum_零部件RRR计算_345.名称输入框).clear();
		getElement(ElementEnum_零部件RRR计算_345.名称输入框).sendKeys(name);
		getElement(ElementEnum_零部件RRR计算_345.查询按钮).click();
		WebDriverConfiguration.operationInterval();
		
		List<WebElement> eles = getElements(ElementEnum_零部件RRR计算_345.查询结果表格所有行);
		// 检查查询结果中是否包含所查关键字
		for(int i = 1;i < eles.size();i++){
			String chXpath = ElementEnum_零部件RRR计算_345.查询结果表格所有行.getName()+"["+(i+1)+"]/td[6]/div";
			String chProduceName = driver.findElement(By.xpath(chXpath)).getText();
			String enXpath = ElementEnum_零部件RRR计算_345.查询结果表格所有行.getName()+"["+(i+1)+"]/td[6]/div";
			String enProduceName = driver.findElement(By.xpath(enXpath)).getText();
			assertTrue(chProduceName.contains(name)||enProduceName.contains(name),"查询结果不符合要求");
		}
		WebDriverConfiguration.operationInterval();
	}
	
	public String getDescription(){
		return "测试用例id: 4060\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 报告管理(#343)\n"
				+" 用例名称: 验证报告管理查询功能是否可实现-零部件车型名称检索 \n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 点击选择零部件，在报告管理的查询条件：车型名称中填写1，点击检索按钮\n"
				+" 测试预期->1. 无符合条件的信息被检索出\n"
				+" 测试步骤->2. 点击选择零部件，在报告管理的查询条件：车型名称中填写ELVT，点击检索按钮\n"
				+" 测试预期->2. 无符合条件的信息被检索出\n"
				+" 测试步骤->3. 点击选择零部件，在报告管理的查询条件：车型名称中填写ELVTEST，点击检索按钮\n"
				+" 测试预期->3. 车型名称（中文或英文）名称中为ELVTEST的所有报告管理信息被检索出来\n"
;
	}


}

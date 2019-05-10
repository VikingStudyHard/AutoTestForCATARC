package cn.edu.tju.scs.seql.final_ELV.综合分析_327.报告管理_343;

import static cn.edu.tju.scs.seql.final_ELV.commonOperations.OperationUnit.tuplesOperation;
import static org.testng.Assert.*;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.零部件RRR计算_345.ElementEnum_零部件RRR计算_345;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4067
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 报告管理(#343)
 * 用例名称: 验证报告管理查询功能是否可实现-零部件供车编号检索 
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 点击选择零部件，在报告管理的查询条件：供货编号中填写7511，点击检索按钮
 * 测试预期->1. 未检索出符合条件的信息
 * 测试步骤->2. 点击选择零部件，在报告管理的查询条件：供货编号中填写75111LA220，点击检索按钮
 * 测试预期->2. 检索出供货编号为75111LA220的信息
 * 
 */

public class 验证报告管理查询功能是否可实现_零部件供车编号检索_4067 extends Selenium_Test_Base {
	
	public 验证报告管理查询功能是否可实现_零部件供车编号检索_4067(){
		super();
	}
	
	public 验证报告管理查询功能是否可实现_零部件供车编号检索_4067(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_报告管理_343.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_报告管理_343.rightFrame);
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
//		testQueryGongHuoHao("7511");
//		testQueryGongHuoHao("75111LA220");
//		testQueryGongHuoHao("tianyang112233");
		
	}
	
	public void testQueryGongHuoHao(String GongHuoHao){
		getElement(ElementEnum_零部件RRR计算_345.选择查询类型).click();
		getElement(ElementEnum_零部件RRR计算_345.选择查询类型_零部件).click();
		getElement(ElementEnum_零部件RRR计算_345.供货编号输入框).clear();
		getElement(ElementEnum_零部件RRR计算_345.供货编号输入框).sendKeys(GongHuoHao);
		getElement(ElementEnum_零部件RRR计算_345.查询按钮).click();
		WebDriverConfiguration.operationInterval();
		
		List<WebElement> eles = getElements(ElementEnum_零部件RRR计算_345.查询结果表格所有行);
		// 检查查询结果中是否包含所查关键字
		for(int i = 1;i < eles.size();i++){
			String Xpath = ElementEnum_零部件RRR计算_345.查询结果表格所有行.getName()+"["+(i+1)+"]/td[10]/div";
			String result = driver.findElement(By.xpath(Xpath)).getText();
			assertTrue(result.contains(GongHuoHao),"根据供货号查询结果不符合要求");
		}
		WebDriverConfiguration.operationInterval();
	}
	
	public String getDescription(){
		return "测试用例id: 4067\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 报告管理(#343)\n"
				+" 用例名称: 验证报告管理查询功能是否可实现-零部件供车编号检索 \n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 点击选择零部件，在报告管理的查询条件：供货编号中填写7511，点击检索按钮\n"
				+" 测试预期->1. 未检索出符合条件的信息\n"
				+" 测试步骤->2. 点击选择零部件，在报告管理的查询条件：供货编号中填写75111LA220，点击检索按钮\n"
				+" 测试预期->2. 检索出供货编号为75111LA220的信息\n"
;
	}


}

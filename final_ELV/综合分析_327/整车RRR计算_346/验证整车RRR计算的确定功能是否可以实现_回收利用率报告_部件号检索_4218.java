package cn.edu.tju.scs.seql.final_ELV.综合分析_327.整车RRR计算_346;

import static org.testng.Assert.assertEquals;

import java.util.List;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4218
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 整车RRR计算(#346)
 * 用例名称: 验证整车RRR计算的确定功能是否可以实现-回收利用率报告-部件号检索
 * 前置条件: 能正确进入综合分析模块
 * 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮
 * 测试预期->1. 跳转至新页面，页面包含整车RRR计算基础信息表格 
 * 测试步骤->2. 点击基本信息界面右上角的回收利用率报告按钮
 * 测试预期->2. 跳转至查找MDS信息页面，含有可以填写参数来查找的功能
 * 测试步骤->3. 在整车RRR计算的查询条件：部件号中填写1，点击检索按钮
 * 测试预期->3. 无符合条件的信息被检索出来
 * 测试步骤->4. 在整车RRR计算的查询条件：部件号中填写E000，点击检索按钮
 * 测试预期->4. 无符合条件的信息被检索出来
 * 测试步骤->5. 在整车RRR计算的查询条件：部件号中填写E00092444，点击检索按钮
 * 测试预期->5. 部件号为E00092444的所有车型信息被检索出来
 * 
 */

public class 验证整车RRR计算的确定功能是否可以实现_回收利用率报告_部件号检索_4218 extends Selenium_Test_Base {
	
	public 验证整车RRR计算的确定功能是否可以实现_回收利用率报告_部件号检索_4218(){
		super();
	}
	
	public 验证整车RRR计算的确定功能是否可以实现_回收利用率报告_部件号检索_4218(WebDriver driver){
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
		
		testQueryBuJianHao("1",a);
		testQueryBuJianHao("E000",a);
		testQueryBuJianHao("E00092444",a);
	}
	
	public void testQueryBuJianHao(String input, CommonOperations_整车RRR计算_346 a){
		getElement(ElementEnum_整车RRR计算_346.第三页供货编号输入框).clear();
		getElement(ElementEnum_整车RRR计算_346.第三页供货编号输入框).sendKeys(input);
		WebDriverConfiguration.operationInterval();
	    getElement(ElementEnum_整车RRR计算_346.第三页报告查询按钮).click();
	    WebDriverConfiguration.operationInterval();
	    a.judgeMaskLoadPageThird();
	    
	    List<WebElement> eles = getElements(ElementEnum_整车RRR计算_346.第三页查询结果所有行);
	 // 检查查询结果中是否包含所查关键字
 		for(int i = 1;i < eles.size();i++){
 			String chXpath = ElementEnum_整车RRR计算_346.第三页查询结果第一行供货编号.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
 			String chProduceName = driver.findElement(By.xpath(chXpath)).getText();
 			assertTrue(chProduceName.contains(input),"查询结果不符合要求");
 		}
	}
	
	public String getDescription(){
		return "测试用例id: 4218\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 整车RRR计算(#346)\n"
				+" 用例名称: 验证整车RRR计算的确定功能是否可以实现-回收利用率报告-部件号检索\n"
				+" 前置条件: 能正确进入综合分析模块\n"
				+" 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮\n"
				+" 测试预期->1. 跳转至新页面，页面包含整车RRR计算基础信息表格 \n"
				+" 测试步骤->2. 点击基本信息界面右上角的回收利用率报告按钮\n"
				+" 测试预期->2. 跳转至查找MDS信息页面，含有可以填写参数来查找的功能\n"
				+" 测试步骤->3. 在整车RRR计算的查询条件：部件号中填写1，点击检索按钮\n"
				+" 测试预期->3. 无符合条件的信息被检索出来\n"
				+" 测试步骤->4. 在整车RRR计算的查询条件：部件号中填写E000，点击检索按钮\n"
				+" 测试预期->4. 无符合条件的信息被检索出来\n"
				+" 测试步骤->5. 在整车RRR计算的查询条件：部件号中填写E00092444，点击检索按钮\n"
				+" 测试预期->5. 部件号为E00092444的所有车型信息被检索出来\n"
;
	}

}

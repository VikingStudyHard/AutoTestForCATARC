package cn.edu.tju.scs.seql.final_ELV.综合分析_327.禁限用物质豁免分析_347;

import static cn.edu.tju.scs.seql.final_ELV.commonOperations.OperationUnit.tuplesOperation;
import static org.testng.Assert.*;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;

/**
 * 测试用例id: 4177
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 禁限用物质豁免分析(#347)
 * 用例名称: 验证禁限用物质豁免分析中确定功能是否可实现-树形图查找操作
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮
 * 测试预期->1. 跳转至新页面，页面包含禁限用物质豁免分析表格
 * 测试步骤->2. 点击BOM树形图界面右上角的查找按钮
 * 测试预期->2. 跳出新页面以定位树形图节点
 * 测试步骤->3. 不填写任何内容点击定位页面中的搜索按钮
 * 测试预期->3. 页面无响应
 * 测试步骤->4. 填写定位页面信息中的节点名称为CA，点击搜索按钮
 * 测试预期->4. 页面出现请稍等进度条，进度条消失出现提示信息：没有结果！
 * 测试步骤->5. 填写定位页面信息中的节点名称为CA_5_13175222，点击搜索按钮
 * 测试预期->5. 页面出现请稍等进度条，搜索到名称为CA_5_13175222的节点信息
 * 测试步骤->6. 填写定位页面信息中的供货编号为test5.4-5.5，点击搜索按钮
 * 测试预期->6. 页面出现请稍等进度条，搜索到供货编号为test5.4-5.5的节点信息
 * 测试步骤->7. 点击定位页面的取消按钮
 * 测试预期->7. 定位查找页面正常关闭
 * 
 */

public class 验证禁限用物质豁免分析中确定功能是否可实现_树形图查找操作_4177 extends Selenium_Test_Base {
	
	public 验证禁限用物质豁免分析中确定功能是否可实现_树形图查找操作_4177(){
		super();
	}
	
	public 验证禁限用物质豁免分析中确定功能是否可实现_树形图查找操作_4177(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_禁限用物质豁免分析_347.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_禁限用物质豁免分析_347.rightFrame);
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
		getElement(ElementEnum_禁限用物质豁免分析_347.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_禁限用物质豁免分析_347.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	// 检测载入界面是否完成
	public void judgeMaskLoad(){
		CommonOperationsAll a = new CommonOperationsAll(driver);
		a.judgeElementDisplayNone(ElementEnum_禁限用物质豁免分析_347.载入界面);
	}
	//等待进度条
	public void progressLoad(){
		CommonOperationsAll a = new CommonOperationsAll(driver);
		a.judgeElementDisplayNone(ElementEnum_禁限用物质豁免分析_347.进度条加载界面);
	}
	//定位页面信息中的节点名称
	public void testNodeName(String name){
		getElement(ElementEnum_禁限用物质豁免分析_347.定位页面中的节点名称输入框).clear();
		getElement(ElementEnum_禁限用物质豁免分析_347.定位页面中的节点名称输入框).sendKeys(name);
		getElement(ElementEnum_禁限用物质豁免分析_347.定位页面中的搜索按钮).click();
		WebDriverConfiguration.operationInterval();
		progressLoad();

		// 检查查询结果中是否包含所查关键字

		WebDriverConfiguration.operationInterval();
		
	}
	//定位页面信息中的供货编号
	public void testSupplyNumber(String name){
		getElement(ElementEnum_禁限用物质豁免分析_347.定位页面中的供货编号输入框).clear();
		getElement(ElementEnum_禁限用物质豁免分析_347.定位页面中的供货编号输入框).sendKeys(name);
		getElement(ElementEnum_禁限用物质豁免分析_347.定位页面中的搜索按钮).click();
		WebDriverConfiguration.operationInterval();
		progressLoad();
		
		// 检查查询结果中是否包含所查关键字
		List<WebElement> eles = getElements(ElementEnum_禁限用物质豁免分析_347.检索树形图所有行);
		// 检查查询结果中是否包含所查关键字
		/*
		for(int i = 1;i < eles.size();i++){
			String chXpath = ElementEnum_禁限用物质豁免分析_347.检索结果第一行车型中文名称.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String chProduceName = driver.findElement(By.xpath(chXpath)).getText();
			String enXpath = ElementEnum_禁限用物质豁免分析_347.检索结果第一行车型英文名称.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String enProduceName = driver.findElement(By.xpath(enXpath)).getText();
			assertTrue(chProduceName.contains(name)||enProduceName.contains(name),"查询结果不符合要求");
		}
		
		*/
		WebDriverConfiguration.operationInterval();
		
	}
	
	public void detailedOperation() throws IOException {
//		getElement(ElementEnum_禁限用物质豁免分析_347.检索结果第一行品牌中文名称).click();
//		WebDriverConfiguration.operationInterval();
//		getElement(ElementEnum_禁限用物质豁免分析_347.第一页确定按钮).click();
//		WebDriverConfiguration.operationInterval();
//		judgeMaskLoad();
//
//		getElement(ElementEnum_禁限用物质豁免分析_347.BOM树形查找按钮).click();
//		WebDriverConfiguration.operationInterval();
//
//		//不填写任何内容点击定位页面中的搜索按钮
//		getElement(ElementEnum_禁限用物质豁免分析_347.定位页面中的搜索按钮).click();
//
		String str=getDescription();
		String name= Han.getTestCaseName(str);
		//读取三元组文件
		tuplesOperation(driver,name);
	}

	
	public String getDescription(){
		return "测试用例id: 4177\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 禁限用物质豁免分析(#347)\n"
				+" 用例名称: 验证禁限用物质豁免分析中确定功能是否可实现-树形图查找操作\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 单击左键选择一条车型信息，点击确定按钮\n"
				+" 测试预期->1. 跳转至新页面，页面包含禁限用物质豁免分析表格\n"
				+" 测试步骤->2. 点击BOM树形图界面右上角的查找按钮\n"
				+" 测试预期->2. 跳出新页面以定位树形图节点\n"
				+" 测试步骤->3. 不填写任何内容点击定位页面中的搜索按钮\n"
				+" 测试预期->3. 页面无响应\n"
				+" 测试步骤->4. 填写定位页面信息中的节点名称为CA，点击搜索按钮\n"
				+" 测试预期->4. 页面出现请稍等进度条，进度条消失出现提示信息：没有结果！\n"
				+" 测试步骤->5. 填写定位页面信息中的节点名称为CA_5_13175222，点击搜索按钮\n"
				+" 测试预期->5. 页面出现请稍等进度条，搜索到名称为CA_5_13175222的节点信息\n"
				+" 测试步骤->6. 填写定位页面信息中的供货编号为test5.4-5.5，点击搜索按钮\n"
				+" 测试预期->6. 页面出现请稍等进度条，搜索到供货编号为test5.4-5.5的节点信息\n"
				+" 测试步骤->7. 点击定位页面的取消按钮\n"
				+" 测试预期->7. 定位查找页面正常关闭\n"
;
	}

}

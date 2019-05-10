package cn.edu.tju.scs.seql.final_ELV.消息管理_328.新建消息_348;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 2723
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 新建消息(#348)
 * 用例名称: 消息管理-新建消息-BOM节点版本组号查找框-ID栏异常测试
 * 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息
 *         点击第一行BOM节点版本组号右侧的查找按钮
 * 测试步骤->1. ID一栏输入”CA“，点击查询
 * 测试预期->1. 显示ID中带有“CA”的节点版本组号信息
 * 测试步骤->2. ID一栏输入”ＣＡ“，点击查询
 * 测试预期->2. 无相关查询结果
 * 测试步骤->3. ID一栏输入“ca_8_6089096”，点击查询
 * 测试预期->3. 无相关查询
 * 测试步骤->4. ID一栏输入“096”，点击查询
 * 测试预期->4. 显示ID中带有“096”的信息
 * 测试步骤->5. ID一栏输入“０９６”，点击查询
 * 测试预期->5. 无相关查询结果
 * 测试步骤->6. 名称、供货编号、ID栏均输入“ ”空格，点击查询
 * 测试预期->6. 分页显示所有信息
 * 测试步骤->7. 名称、供货编号、ID栏均输入“<script>alert("test");</script>”，点击查询
 * 测试预期->7. 无相关查询结果
 * 测试步骤->8. 名称、供货编号、ID栏均输入“&nbsp;”，点击查询
 * 测试预期->8. 无相关查询结果
 * 
 */

public class 消息管理_新建消息_BOM节点版本组号查找框_ID栏异常测试_2723 extends Selenium_Test_Base {
	
	public 消息管理_新建消息_BOM节点版本组号查找框_ID栏异常测试_2723(){
		super();
	}
	
	public 消息管理_新建消息_BOM节点版本组号查找框_ID栏异常测试_2723(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_新建消息_348.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_新建消息_348.rightFrame);
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
		getElement(ElementEnum_新建消息_348.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_新建消息_348.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		// TODO BOM节点版本组号查找框使用showModalDialog实现，无法进行测试
	}

	
	public String getDescription(){
		return "测试用例id: 2723\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 新建消息(#348)\n"
				+" 用例名称: 消息管理-新建消息-BOM节点版本组号查找框-ID栏异常测试\n"
				+" 前置条件: 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息 点击第一行BOM节点版本组号右侧的查找按钮\n"
				+" 测试步骤->1. ID一栏输入”CA“，点击查询\n"
				+" 测试预期->1. 显示ID中带有“CA”的节点版本组号信息\n"
				+" 测试步骤->2. ID一栏输入”ＣＡ“，点击查询\n"
				+" 测试预期->2. 无相关查询结果\n"
				+" 测试步骤->3. ID一栏输入“ca_8_6089096”，点击查询\n"
				+" 测试预期->3. 无相关查询\n"
				+" 测试步骤->4. ID一栏输入“096”，点击查询\n"
				+" 测试预期->4. 显示ID中带有“096”的信息\n"
				+" 测试步骤->5. ID一栏输入“０９６”，点击查询\n"
				+" 测试预期->5. 无相关查询结果\n"
				+" 测试步骤->6. 名称、供货编号、ID栏均输入“ ”空格，点击查询\n"
				+" 测试预期->6. 分页显示所有信息\n"
				+" 测试步骤->7. 名称、供货编号、ID栏均输入“<script>alert(“test“);</script>”，点击查询\n"
				+" 测试预期->7. 无相关查询结果\n"
				+" 测试步骤->8. 名称、供货编号、ID栏均输入“&nbsp;”，点击查询\n"
				+" 测试预期->8. 无相关查询结果\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.消息管理_328.新建消息_348;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1000
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 新建消息(#348)
 * 用例名称: 消息管理-新建消息-BOM节点版本组号查找框的查询功能测试
 * 前置条件: 
 * 测试步骤->1. 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息
 * 测试预期->1. 进入新建消息界面，所有内容正常显示（包括 BOM节点版本组号（查找按钮），标题，接收人（查找按钮）以及新建/编辑内容的填写，返回、保存、保存并发送按钮的显示）
 * 测试步骤->2. 点击第一行BOM节点版本组号右侧的查找按钮
 * 测试预期->2. 弹出BOM节点版本组号查询窗口，显示有查询类型、表单来源、名称、供货编号、ID、查询时间类型、开始时间和结束时间，还有查询按钮、确定按钮以及空表格。
 * 测试步骤->3. 查询类型选择”零部件“，点击查询
 * 测试预期->3. 分页显示出类别为”零部件“的版本组号信息
 * 测试步骤->4. 查询类型重置为”全部“，表单来源选择”camds系统”，点击查询
 * 测试预期->4. 分页显示出表单来源为“camds系统”的版本组号信息
 * 测试步骤->5. 表单来源重置为“全部”，名称一栏填写“POM”，点击查询
 * 测试预期->5. 分页显示出名称为“POM”的版本组号信息
 * 测试步骤->6. 名称一栏重置为空，供货编号一栏填写“M25-34 CF2001”，点击查询
 * 测试预期->6. 显示供货编号为“M25-34 CF2001”的版本组号信息
 * 测试步骤->7. 供货编号一栏重置为空，ID一栏填写“CA_8_6089096”，点击查询
 * 测试预期->7. 显示出ID为“CA_8_6089096"的版本组号信息
 * 测试步骤->8. ID一栏重置为空，查询时间类型一栏选择创建时间，选择某一开始时间和比开始时间晚的结束时间，点击查询
 * 测试预期->8. 开始时间和结束时间两栏由灰色不可选择变为可以选择，分页显示出该时间内所创建的版本组号信息
 * 测试步骤->9. 查询类型选择”材料“，表单来源选择”camds系统“，名称填写”POM“，供货编号填写”M25-34 CF2001“，ID填写”CA_8_6089096“，查询时间类型选择”创建时间“，选择某一开始时间和比开始时间晚的结束时间，点击查询
 * 测试预期->9. 显示符合以上所有条件的版本组号信息
 * 
 */

public class 消息管理_新建消息_BOM节点版本组号查找框的查询功能测试_1000 extends Selenium_Test_Base {
	
	public 消息管理_新建消息_BOM节点版本组号查找框的查询功能测试_1000(){
		super();
	}
	
	public 消息管理_新建消息_BOM节点版本组号查找框的查询功能测试_1000(WebDriver driver){
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
		return "测试用例id: 1000\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 新建消息(#348)\n"
				+" 用例名称: 消息管理-新建消息-BOM节点版本组号查找框的查询功能测试\n"
				+" 前置条件: \n"
				+" 测试步骤->1. 登录ELV环境合规系统，左侧树形结构选择 消息管理-新建消息\n"
				+" 测试预期->1. 进入新建消息界面，所有内容正常显示（包括 BOM节点版本组号（查找按钮），标题，接收人（查找按钮）以及新建/编辑内容的填写，返回、保存、保存并发送按钮的显示）\n"
				+" 测试步骤->2. 点击第一行BOM节点版本组号右侧的查找按钮\n"
				+" 测试预期->2. 弹出BOM节点版本组号查询窗口，显示有查询类型、表单来源、名称、供货编号、ID、查询时间类型、开始时间和结束时间，还有查询按钮、确定按钮以及空表格。\n"
				+" 测试步骤->3. 查询类型选择”零部件“，点击查询\n"
				+" 测试预期->3. 分页显示出类别为”零部件“的版本组号信息\n"
				+" 测试步骤->4. 查询类型重置为”全部“，表单来源选择”camds系统”，点击查询\n"
				+" 测试预期->4. 分页显示出表单来源为“camds系统”的版本组号信息\n"
				+" 测试步骤->5. 表单来源重置为“全部”，名称一栏填写“POM”，点击查询\n"
				+" 测试预期->5. 分页显示出名称为“POM”的版本组号信息\n"
				+" 测试步骤->6. 名称一栏重置为空，供货编号一栏填写“M25-34 CF2001”，点击查询\n"
				+" 测试预期->6. 显示供货编号为“M25-34 CF2001”的版本组号信息\n"
				+" 测试步骤->7. 供货编号一栏重置为空，ID一栏填写“CA_8_6089096”，点击查询\n"
				+" 测试预期->7. 显示出ID为“CA_8_6089096“的版本组号信息\n"
				+" 测试步骤->8. ID一栏重置为空，查询时间类型一栏选择创建时间，选择某一开始时间和比开始时间晚的结束时间，点击查询\n"
				+" 测试预期->8. 开始时间和结束时间两栏由灰色不可选择变为可以选择，分页显示出该时间内所创建的版本组号信息\n"
				+" 测试步骤->9. 查询类型选择”材料“，表单来源选择”camds系统“，名称填写”POM“，供货编号填写”M25-34 CF2001“，ID填写”CA_8_6089096“，查询时间类型选择”创建时间“，选择某一开始时间和比开始时间晚的结束时间，点击查询\n"
				+" 测试预期->9. 显示符合以上所有条件的版本组号信息\n"
;
	}

}

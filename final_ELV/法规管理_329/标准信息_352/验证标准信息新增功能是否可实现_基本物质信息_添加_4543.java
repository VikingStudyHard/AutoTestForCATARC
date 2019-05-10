package cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352;

import static org.testng.Assert.assertEquals;

import java.util.List;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4543
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 标准信息(#352)
 * 用例名称: 验证标准信息新增功能是否可实现-基本物质信息-添加
 * 前置条件: 能正常进入法规信息模块
 * 测试步骤->1. 点击页面中的新增按钮
 * 测试预期->1. 跳转至新页面，页面为新增标准信息的详细内容界面，可填写法规名称，选择法规类型，选择基本物质信息。
 * 测试步骤->2. 填写法规名称为test，选择法规类型为国家标准，点击基本物质信息中的添加物质按钮。
 * 测试预期->2. 跳转至新页面，页面为添加物质的详细内容界面，可填参数查找所需物质。
 * 测试步骤->3. 点击查询按钮
 * 测试预期->3. 页面刷新，显示所有物质信息
 * 测试步骤->4. 点击确定按钮
 * 测试预期->4. 页面出现提示信息：请至少选择一种物质！
 * 测试步骤->5. 点击选择一条或多条基本物质，点击确定按钮
 * 测试预期->5. 页面出现提示信息：法规比例为大于0的数字!
 * 测试步骤->6. 填写法规比例为10%，点击确定按钮
 * 测试预期->6. 页面出现提示信息：下列物质成功添加到新增列表中，创建人处应显示当前登录ELV环境合规系统的用户  氧化铝、氧化钙、氧化镁、硅石合成纤维(Synthetic fibres, aluminum oxide-calcium oxide-magnesium oxide-silica) 2,2-双(羟甲基)丁酸与2,4-二异氰酸基-1-甲基苯-2-羟基乙基-丙烯酸,Polylite OD-X 2155和α,αα-1,2,3-丙烷三基三[ω-[(1-氧-2-丙烯基)氧]聚[氧(甲基-1,2-乙烷二基)]]的聚合物(Butanoic acid, 2,2-bis(hydroxymethyl)polymer with 2,4-diisocyanato1methylbenzene2-hydroxyethyl2-propenoate,PolyliteOD-X 2155and.alpha.,alpha.alpha.-1,2,3-propanetriyltris[omega.-[(1-oxo-2-propenyl)oxy]poly[oxy(methyl-1,2-ethanediyl)]](9CI))
 * 
 */

public class 验证标准信息新增功能是否可实现_基本物质信息_添加_4543 extends Selenium_Test_Base {
	
	public 验证标准信息新增功能是否可实现_基本物质信息_添加_4543(){
		super();
	}
	
	public 验证标准信息新增功能是否可实现_基本物质信息_添加_4543(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_标准信息_352.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_标准信息_352.rightFrame);
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
		getElement(ElementEnum_标准信息_352.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_标准信息_352.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_标准信息_352 a = new CommonOperations_标准信息_352(driver);
		a.testQueryByGeneralName("testBy樊向宇", ElementEnum_标准信息_352.法规名称输入框, 
				ElementEnum_标准信息_352.检索按钮, 
				ElementEnum_标准信息_352.检索结果所有行, 
				ElementEnum_标准信息_352.检索结果第一行法规名称, 
				ElementEnum_标准信息_352.检索结果第一行法规名称);
		int original_record_size = getElements(ElementEnum_标准信息_352.检索结果所有行).size();
		
		a.addOneMyRecord();
		
		a.testQueryByGeneralName("testBy樊向宇", ElementEnum_标准信息_352.法规名称输入框, 
				ElementEnum_标准信息_352.检索按钮, 
				ElementEnum_标准信息_352.检索结果所有行, 
				ElementEnum_标准信息_352.检索结果第一行法规名称, 
				ElementEnum_标准信息_352.检索结果第一行法规名称);
		List<WebElement> eles = getElements(ElementEnum_标准信息_352.检索结果所有行);
		assertEquals(eles.size(), original_record_size+1);
		
	}
	
	public String getDescription(){
		return "测试用例id: 4543\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 标准信息(#352)\n"
				+" 用例名称: 验证标准信息新增功能是否可实现-基本物质信息-添加\n"
				+" 前置条件: 能正常进入法规信息模块\n"
				+" 测试步骤->1. 点击页面中的新增按钮\n"
				+" 测试预期->1. 跳转至新页面，页面为新增标准信息的详细内容界面，可填写法规名称，选择法规类型，选择基本物质信息。\n"
				+" 测试步骤->2. 填写法规名称为test，选择法规类型为国家标准，点击基本物质信息中的添加物质按钮。\n"
				+" 测试预期->2. 跳转至新页面，页面为添加物质的详细内容界面，可填参数查找所需物质。\n"
				+" 测试步骤->3. 点击查询按钮\n"
				+" 测试预期->3. 页面刷新，显示所有物质信息\n"
				+" 测试步骤->4. 点击确定按钮\n"
				+" 测试预期->4. 页面出现提示信息：请至少选择一种物质！\n"
				+" 测试步骤->5. 点击选择一条或多条基本物质，点击确定按钮\n"
				+" 测试预期->5. 页面出现提示信息：法规比例为大于0的数字!\n"
				+" 测试步骤->6. 填写法规比例为10%，点击确定按钮\n"
				+" 测试预期->6. 页面出现提示信息：下列物质成功添加到新增列表中，创建人处应显示当前登录ELV环境合规系统的用户  氧化铝、氧化钙、氧化镁、硅石合成纤维(Synthetic fibres, aluminum oxide-calcium oxide-magnesium oxide-silica) 2,2-双(羟甲基)丁酸与2,4-二异氰酸基-1-甲基苯-2-羟基乙基-丙烯酸,Polylite OD-X 2155和α,αα-1,2,3-丙烷三基三[ω-[(1-氧-2-丙烯基)氧]聚[氧(甲基-1,2-乙烷二基)]]的聚合物(Butanoic acid, 2,2-bis(hydroxymethyl)polymer with 2,4-diisocyanato1methylbenzene2-hydroxyethyl2-propenoate,PolyliteOD-X 2155and.alpha.,alpha.alpha.-1,2,3-propanetriyltris[omega.-[(1-oxo-2-propenyl)oxy]poly[oxy(methyl-1,2-ethanediyl)]](9CI))\n"
;
	}

}

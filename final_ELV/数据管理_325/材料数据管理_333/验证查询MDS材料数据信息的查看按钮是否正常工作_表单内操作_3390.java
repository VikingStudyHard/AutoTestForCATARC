package cn.edu.tju.scs.seql.final_ELV.数据管理_325.材料数据管理_333;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3390
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 材料数据管理(#333)
 * 用例名称: 验证查询MDS材料数据信息的查看按钮是否正常工作-表单内操作
 * 前置条件: 拥有MDS材料数据信息的权限
 * 测试步骤->1. 勾选一项MDS信息，点击查看按钮
 * 测试预期->1. 跳出新页面，页面标题为查看的材料数据表，表单中含有相关数据的参数信息。
 * 测试步骤->2. 点击表单左上角的打开树按钮
 * 测试预期->2. 表单左侧的树形图打开，页面无其他变化
 * 测试步骤->3. 点击表单左上角的关闭树按钮
 * 测试预期->3. 表单左侧的树形图关闭，页面无其他变化
 * 测试步骤->4. 点击左侧树形图母树的加号标志
 * 测试预期->4. 表单左侧的树形图打开，页面无其他变化
 * 测试步骤->5. 点击左侧树形图母树的减号标志
 * 测试预期->5. 表单左侧的树形图关闭，页面无其他变化
 * 测试步骤->6. 双击左侧树形图母树的文字信息
 * 测试预期->6. 表单左侧的树形图打开，页面无其他变化
 * 测试步骤->7. 单击左侧树形图子树的文字信息
 * 测试预期->7. 表单右侧的详细信息变更为相应子树的详细数据信息，页面无其他变化
 * 测试步骤->8. 单击左侧树形图母树的文字信息
 * 测试预期->8. 表单右侧的详细信息变更为母树的详细数据信息，页面无其他变化
 * 测试步骤->9. 点击表单右侧下方的下一步按钮
 * 测试预期->9. 表单翻动至下一页，显示相关数据的本企业信息。
 * 测试步骤->10. 点击表单左侧下方的上一步按钮
 * 测试预期->10. 表单翻动至上一页，显示最初始表单内容，页面无其他变化。
 * 测试步骤->11. 查看表单左侧，表单左侧的内容均不可以修改，点击表单右侧下方的下一步按钮
 * 测试预期->11. 表单翻动至下一页，显示相关数据的本企业信息。
 * 测试步骤->12. 任意更改表单可修改内容，点击表单左侧下方的上一步按钮
 * 测试预期->12. 最初始表单内容，信息为修改前状态，任何信息未被修改，页面无其他变化。
 * 测试步骤->13. 点击表单右侧下方的下一步按钮
 * 测试预期->13. 表单翻动至下一页，显示相关数据的本企业信息，信息为修改前内容，任何信息未被修改。
 * 测试步骤->14. 点击表单右侧下方的返回按钮
 * 测试预期->14. 表单被关闭，页面跳转至材料数据管理的首页面。
 * 
 */

public class 验证查询MDS材料数据信息的查看按钮是否正常工作_表单内操作_3390 extends Selenium_Test_Base {
	
	public 验证查询MDS材料数据信息的查看按钮是否正常工作_表单内操作_3390(){
		super();
	}
	
	public 验证查询MDS材料数据信息的查看按钮是否正常工作_表单内操作_3390(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_材料数据管理_333.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_材料数据管理_333.rightFrame);
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
		// 数据管理不需要选一级目录
//		WebDriverConfiguration.operationInterval();
//		getElement(ElementEnum_材料数据管理_333.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_材料数据管理_333.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_材料数据管理_333 a = new CommonOperations_材料数据管理_333(driver);
		getElement(ElementEnum_材料数据管理_333.查找按钮).click();
		WebDriverConfiguration.operationInterval();
		a.waitLoading();
		
		getElement(ElementEnum_材料数据管理_333.检索结果第一行勾选框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_材料数据管理_333.查看按钮).click();
		WebDriverConfiguration.operationInterval();
		WebElement ele = getElement(ElementEnum_材料数据管理_333.材料数据明细标题);
		assertTrue(ele != null);
		
		// 后续验证复杂，不适合使用自动化测试实现
		
	}

	
	public String getDescription(){
		return "测试用例id: 3390\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 材料数据管理(#333)\n"
				+" 用例名称: 验证查询MDS材料数据信息的查看按钮是否正常工作-表单内操作\n"
				+" 前置条件: 拥有MDS材料数据信息的权限\n"
				+" 测试步骤->1. 勾选一项MDS信息，点击查看按钮\n"
				+" 测试预期->1. 跳出新页面，页面标题为查看的材料数据表，表单中含有相关数据的参数信息。\n"
				+" 测试步骤->2. 点击表单左上角的打开树按钮\n"
				+" 测试预期->2. 表单左侧的树形图打开，页面无其他变化\n"
				+" 测试步骤->3. 点击表单左上角的关闭树按钮\n"
				+" 测试预期->3. 表单左侧的树形图关闭，页面无其他变化\n"
				+" 测试步骤->4. 点击左侧树形图母树的加号标志\n"
				+" 测试预期->4. 表单左侧的树形图打开，页面无其他变化\n"
				+" 测试步骤->5. 点击左侧树形图母树的减号标志\n"
				+" 测试预期->5. 表单左侧的树形图关闭，页面无其他变化\n"
				+" 测试步骤->6. 双击左侧树形图母树的文字信息\n"
				+" 测试预期->6. 表单左侧的树形图打开，页面无其他变化\n"
				+" 测试步骤->7. 单击左侧树形图子树的文字信息\n"
				+" 测试预期->7. 表单右侧的详细信息变更为相应子树的详细数据信息，页面无其他变化\n"
				+" 测试步骤->8. 单击左侧树形图母树的文字信息\n"
				+" 测试预期->8. 表单右侧的详细信息变更为母树的详细数据信息，页面无其他变化\n"
				+" 测试步骤->9. 点击表单右侧下方的下一步按钮\n"
				+" 测试预期->9. 表单翻动至下一页，显示相关数据的本企业信息。\n"
				+" 测试步骤->10. 点击表单左侧下方的上一步按钮\n"
				+" 测试预期->10. 表单翻动至上一页，显示最初始表单内容，页面无其他变化。\n"
				+" 测试步骤->11. 查看表单左侧，表单左侧的内容均不可以修改，点击表单右侧下方的下一步按钮\n"
				+" 测试预期->11. 表单翻动至下一页，显示相关数据的本企业信息。\n"
				+" 测试步骤->12. 任意更改表单可修改内容，点击表单左侧下方的上一步按钮\n"
				+" 测试预期->12. 最初始表单内容，信息为修改前状态，任何信息未被修改，页面无其他变化。\n"
				+" 测试步骤->13. 点击表单右侧下方的下一步按钮\n"
				+" 测试预期->13. 表单翻动至下一页，显示相关数据的本企业信息，信息为修改前内容，任何信息未被修改。\n"
				+" 测试步骤->14. 点击表单右侧下方的返回按钮\n"
				+" 测试预期->14. 表单被关闭，页面跳转至材料数据管理的首页面。\n"
;
	}

}

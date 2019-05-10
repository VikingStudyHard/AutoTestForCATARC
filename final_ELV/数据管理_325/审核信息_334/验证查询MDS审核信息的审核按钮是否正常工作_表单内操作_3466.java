package cn.edu.tju.scs.seql.final_ELV.数据管理_325.审核信息_334;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3466
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 审核信息(#334)
 * 用例名称: 验证查询MDS审核信息的审核按钮是否正常工作-表单内操作
 * 前置条件: 拥有MDS审核信息的权限
 * 测试步骤->1. 勾选一项MDS状态为内部发布，审核状态为未审批的MDS信息，点击审核按钮
 * 测试预期->1. 跳出新页面，页面标题为校验结果，页面包含待审核的各项信息。
 * 测试步骤->2. 点击表单右上角的查看明细
 * 测试预期->2. 出现提示信息：请选择一个MDS！
 * 测试步骤->3. 点击表单右上角的审批
 * 测试预期->3. 出现提示信息：请选择一个MDS！
 * 测试步骤->4. 点击表单右上角的拒绝
 * 测试预期->4. 出现提示信息：请选择一个MDS！
 * 测试步骤->5. 勾选一则MDS信息，点击表单右上角的查看明细
 * 测试预期->5. 跳出新页面，页面标题为校验结果，页面包含待审核的各项信息。
 * 测试步骤->6. 勾选一则MDS信息，点击表单右上角的审批
 * 测试预期->6. 出现提示信息：批准的内容无法恢复 确定操作吗
 * 测试步骤->7. 点击确定按钮
 * 测试预期->7. 出现提示信息：审核成功
 * 测试步骤->8. 点击提示信息的确定按钮
 * 测试预期->8. 页面跳转至审核信息首页，勾选的数据信息中的审核状态变为已批准
 * 测试步骤->9. 勾选一项MDS状态为内部发布，审核状态为未审批的MDS信息，点击审核按钮
 * 测试预期->9. 跳出新页面，页面标题为校验结果，页面包含待审核的各项信息。
 * 测试步骤->10. 勾选一则MDS信息，点击表单右上角的拒绝
 * 测试预期->10. 出现新页面要求填写拒绝原因
 * 测试步骤->11. 在填写拒绝原因的填写框中填写：test，点击提交按钮
 * 测试预期->11. 出现提示信息：拒绝成功
 * 测试步骤->12. 点击提示信息的确定按钮
 * 测试预期->12. 页面跳转至审核信息首页，勾选的数据信息中的审核状态变为已拒绝，下一栏备注为拒绝原因：test
 * 测试步骤->13. 同时勾选多项MDS状态为内部发布，审核状态为未审批的MDS信息，点击审核按钮
 * 测试预期->13. 跳出新页面，页面标题为校验结果，页面包含待审核的多项信息。
 * 测试步骤->14. 同时勾选多则MDS信息，点击表单右上角的审核
 * 测试预期->14. 出现提示信息：批准的内容无法恢复 确定操作吗
 * 测试步骤->15. 点击确定按钮
 * 测试预期->15. 出现提示信息：审核成功
 * 测试步骤->16. 点击提示信息的确定按钮
 * 测试预期->16. 页面跳转至审核信息首页，勾选的多项数据信息中的审核状态变均为已批准
 * 测试步骤->17. 同时勾选多项MDS状态为内部发布，审核状态为未审批的MDS信息，点击审核按钮
 * 测试预期->17. 跳出新页面，页面标题为校验结果，页面包含待审核的多项信息。
 * 测试步骤->18. 同时勾选多则MDS信息，点击表单右上角的拒绝
 * 测试预期->18. 出现新页面要求填写拒绝原因
 * 测试步骤->19. 不填写拒绝原因，点击提交按钮
 * 测试预期->19. 出现提示信息：拒绝成功
 * 测试步骤->20. 点击提示信息的确定按钮
 * 测试预期->20. 页面跳转至审核信息首页，勾选的所有数据信息中的审核状态均变为已拒绝，下一栏备注为空
 * 
 */

public class 验证查询MDS审核信息的审核按钮是否正常工作_表单内操作_3466 extends Selenium_Test_Base {
	
	public 验证查询MDS审核信息的审核按钮是否正常工作_表单内操作_3466(){
		super();
	}
	
	public 验证查询MDS审核信息的审核按钮是否正常工作_表单内操作_3466(WebDriver driver){
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
				//choose no message
				getElement(ElementEnum_审核信息_334.审核按钮).click();
				WebDriverConfiguration.operationInterval();
				assertTrue(driver.getPageSource().contains("请选择一个MDS"));
				getElement(ElementEnum_审核信息_334.错误信息确定按钮).click();
				
				//choose two message 按钮消失
				WebDriverConfiguration.operationInterval();
				getElement(ElementEnum_审核信息_334.MSD信息选择按钮1).click();
				getElement(ElementEnum_审核信息_334.MSD信息选择按钮2).click();
				
				WebDriverConfiguration.operationInterval();
				assertFalse(getElement(ElementEnum_审核信息_334.查看按钮).isDisplayed()&&getElement(ElementEnum_审核信息_334.查看审核信息按钮).isDisplayed(),"按钮没有消失");
				assertTrue(getElement(ElementEnum_审核信息_334.审核按钮).isDisplayed(),"按钮没有消失");
				//choose one message
				getElement(ElementEnum_审核信息_334.MSD信息选择按钮1).click();
//				getElement(ElementEnum_审核信息_334.审核按钮).click();
				// TODO 该模块使用了showModalDialog，无法进一步进行测试
				
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
		return "测试用例id: 3466\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 审核信息(#334)\n"
				+" 用例名称: 验证查询MDS审核信息的审核按钮是否正常工作-表单内操作\n"
				+" 前置条件: 拥有MDS审核信息的权限\n"
				+" 测试步骤->1. 勾选一项MDS状态为内部发布，审核状态为未审批的MDS信息，点击审核按钮\n"
				+" 测试预期->1. 跳出新页面，页面标题为校验结果，页面包含待审核的各项信息。\n"
				+" 测试步骤->2. 点击表单右上角的查看明细\n"
				+" 测试预期->2. 出现提示信息：请选择一个MDS！\n"
				+" 测试步骤->3. 点击表单右上角的审批\n"
				+" 测试预期->3. 出现提示信息：请选择一个MDS！\n"
				+" 测试步骤->4. 点击表单右上角的拒绝\n"
				+" 测试预期->4. 出现提示信息：请选择一个MDS！\n"
				+" 测试步骤->5. 勾选一则MDS信息，点击表单右上角的查看明细\n"
				+" 测试预期->5. 跳出新页面，页面标题为校验结果，页面包含待审核的各项信息。\n"
				+" 测试步骤->6. 勾选一则MDS信息，点击表单右上角的审批\n"
				+" 测试预期->6. 出现提示信息：批准的内容无法恢复 确定操作吗\n"
				+" 测试步骤->7. 点击确定按钮\n"
				+" 测试预期->7. 出现提示信息：审核成功\n"
				+" 测试步骤->8. 点击提示信息的确定按钮\n"
				+" 测试预期->8. 页面跳转至审核信息首页，勾选的数据信息中的审核状态变为已批准\n"
				+" 测试步骤->9. 勾选一项MDS状态为内部发布，审核状态为未审批的MDS信息，点击审核按钮\n"
				+" 测试预期->9. 跳出新页面，页面标题为校验结果，页面包含待审核的各项信息。\n"
				+" 测试步骤->10. 勾选一则MDS信息，点击表单右上角的拒绝\n"
				+" 测试预期->10. 出现新页面要求填写拒绝原因\n"
				+" 测试步骤->11. 在填写拒绝原因的填写框中填写：test，点击提交按钮\n"
				+" 测试预期->11. 出现提示信息：拒绝成功\n"
				+" 测试步骤->12. 点击提示信息的确定按钮\n"
				+" 测试预期->12. 页面跳转至审核信息首页，勾选的数据信息中的审核状态变为已拒绝，下一栏备注为拒绝原因：test\n"
				+" 测试步骤->13. 同时勾选多项MDS状态为内部发布，审核状态为未审批的MDS信息，点击审核按钮\n"
				+" 测试预期->13. 跳出新页面，页面标题为校验结果，页面包含待审核的多项信息。\n"
				+" 测试步骤->14. 同时勾选多则MDS信息，点击表单右上角的审核\n"
				+" 测试预期->14. 出现提示信息：批准的内容无法恢复 确定操作吗\n"
				+" 测试步骤->15. 点击确定按钮\n"
				+" 测试预期->15. 出现提示信息：审核成功\n"
				+" 测试步骤->16. 点击提示信息的确定按钮\n"
				+" 测试预期->16. 页面跳转至审核信息首页，勾选的多项数据信息中的审核状态变均为已批准\n"
				+" 测试步骤->17. 同时勾选多项MDS状态为内部发布，审核状态为未审批的MDS信息，点击审核按钮\n"
				+" 测试预期->17. 跳出新页面，页面标题为校验结果，页面包含待审核的多项信息。\n"
				+" 测试步骤->18. 同时勾选多则MDS信息，点击表单右上角的拒绝\n"
				+" 测试预期->18. 出现新页面要求填写拒绝原因\n"
				+" 测试步骤->19. 不填写拒绝原因，点击提交按钮\n"
				+" 测试预期->19. 出现提示信息：拒绝成功\n"
				+" 测试步骤->20. 点击提示信息的确定按钮\n"
				+" 测试预期->20. 页面跳转至审核信息首页，勾选的所有数据信息中的审核状态均变为已拒绝，下一栏备注为空\n"
;
	}

}

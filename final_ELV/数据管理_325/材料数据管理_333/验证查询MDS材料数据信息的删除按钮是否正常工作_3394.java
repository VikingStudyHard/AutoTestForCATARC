package cn.edu.tju.scs.seql.final_ELV.数据管理_325.材料数据管理_333;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3394
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 材料数据管理(#333)
 * 用例名称: 验证查询MDS材料数据信息的删除按钮是否正常工作
 * 前置条件: 拥有MDS材料数据信息的权限
 * 测试步骤->1. 点击删除按钮
 * 测试预期->1. 出现提示信息：请选择一个MDS！
 * 测试步骤->2. 勾选任意两项MDS信息
 * 测试预期->2. 无法任意勾选两项，只能在同一时间选定某一项。
 * 测试步骤->3. 勾选一项MDS状态为内部发布，审核状态为未审批的MDS信息，点击删除按钮
 * 测试预期->3. 出现提示信息：不可以删除该零部件，该零部件内部发布或着审核通过！
 * 测试步骤->4. 勾选一项MDS状态为内部发布，审核状态为已审批的MDS信息，点击删除按钮
 * 测试预期->4. 出现提示信息：不可以删除该零部件，该零部件内部发布或着审核通过！
 * 测试步骤->5. 勾选一项MDS状态为已发布，审核状态为审批中的MDS信息，点击删除按钮
 * 测试预期->5. 出现提示信息：不可以删除该零部件，该零部件已进入审核流程！
 * 测试步骤->6. 勾选一项MDS状态为已提交，审核状态为未审批的MDS信息，点击删除按钮
 * 测试预期->6. 出现新页面信息，页面标题为详情，页面包含所选信息详细可删除信息。
 * 
 */

public class 验证查询MDS材料数据信息的删除按钮是否正常工作_3394 extends Selenium_Test_Base {
	
	public 验证查询MDS材料数据信息的删除按钮是否正常工作_3394(){
		super();
	}
	
	public 验证查询MDS材料数据信息的删除按钮是否正常工作_3394(WebDriver driver){
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
		return "测试用例id: 3394\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 材料数据管理(#333)\n"
				+" 用例名称: 验证查询MDS材料数据信息的删除按钮是否正常工作\n"
				+" 前置条件: 拥有MDS材料数据信息的权限\n"
				+" 测试步骤->1. 点击删除按钮\n"
				+" 测试预期->1. 出现提示信息：请选择一个MDS！\n"
				+" 测试步骤->2. 勾选任意两项MDS信息\n"
				+" 测试预期->2. 无法任意勾选两项，只能在同一时间选定某一项。\n"
				+" 测试步骤->3. 勾选一项MDS状态为内部发布，审核状态为未审批的MDS信息，点击删除按钮\n"
				+" 测试预期->3. 出现提示信息：不可以删除该零部件，该零部件内部发布或着审核通过！\n"
				+" 测试步骤->4. 勾选一项MDS状态为内部发布，审核状态为已审批的MDS信息，点击删除按钮\n"
				+" 测试预期->4. 出现提示信息：不可以删除该零部件，该零部件内部发布或着审核通过！\n"
				+" 测试步骤->5. 勾选一项MDS状态为已发布，审核状态为审批中的MDS信息，点击删除按钮\n"
				+" 测试预期->5. 出现提示信息：不可以删除该零部件，该零部件已进入审核流程！\n"
				+" 测试步骤->6. 勾选一项MDS状态为已提交，审核状态为未审批的MDS信息，点击删除按钮\n"
				+" 测试预期->6. 出现新页面信息，页面标题为详情，页面包含所选信息详细可删除信息。\n"
;
	}

}

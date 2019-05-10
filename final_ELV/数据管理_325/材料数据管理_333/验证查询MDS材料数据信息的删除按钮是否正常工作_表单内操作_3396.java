package cn.edu.tju.scs.seql.final_ELV.数据管理_325.材料数据管理_333;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3396
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 材料数据管理(#333)
 * 用例名称: 验证查询MDS材料数据信息的删除按钮是否正常工作-表单内操作
 * 前置条件: 拥有MDS材料数据信息的权限
 * 测试步骤->1. 勾选一项MDS状态为已发布，审核状态为未审批的MDS信息，点击删除按钮
 * 测试预期->1. 出现新页面信息，页面标题为详情，页面包含所选信息详细可删除信息。
 * 测试步骤->2. 点击页面右上角的关闭按钮
 * 测试预期->2. 页面被关闭，所选信息未被删除。
 * 测试步骤->3. 点击页面左侧的删除按钮
 * 测试预期->3. 出现提示信息：删除成功！
 * 测试步骤->4. 勾选一项MDS状态为已提交，审核状态为未审批的MDS信息，点击删除按钮
 * 测试预期->4. 出现新页面信息，页面标题为详情，页面包含所选信息详细可删除信息。
 * 测试步骤->5. 点击页面左侧的删除全部按钮
 * 测试预期->5. 出现提示信息：删除成功！
 * 测试步骤->6. 勾选一项MDS状态为已提交，审核状态为未审批的MDS信息，点击删除按钮
 * 测试预期->6. 出现新页面信息，页面标题为详情，页面包含所选信息详细可删除信息。
 * 测试步骤->7. 修改新页面上的填写框中的内容，点击关闭按钮
 * 测试预期->7. 页面被关闭，重新打开该页面信息未被修改。
 * 测试步骤->8. 勾选一项MDS状态为已提交，审核状态为未审批的MDS信息，点击删除按钮
 * 测试预期->8. 出现新页面信息，页面标题为详情，页面包含所选信息详细可删除信息。
 * 测试步骤->9. 勾选一条或多条新页面下半部分的信息，点击删除按钮
 * 测试预期->9. 出现提示信息：删除成功！整条信息在材料数据信息中被删除。
 * 
 */

public class 验证查询MDS材料数据信息的删除按钮是否正常工作_表单内操作_3396 extends Selenium_Test_Base {
	
	public 验证查询MDS材料数据信息的删除按钮是否正常工作_表单内操作_3396(){
		super();
	}
	
	public 验证查询MDS材料数据信息的删除按钮是否正常工作_表单内操作_3396(WebDriver driver){
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
		return "测试用例id: 3396\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 材料数据管理(#333)\n"
				+" 用例名称: 验证查询MDS材料数据信息的删除按钮是否正常工作-表单内操作\n"
				+" 前置条件: 拥有MDS材料数据信息的权限\n"
				+" 测试步骤->1. 勾选一项MDS状态为已发布，审核状态为未审批的MDS信息，点击删除按钮\n"
				+" 测试预期->1. 出现新页面信息，页面标题为详情，页面包含所选信息详细可删除信息。\n"
				+" 测试步骤->2. 点击页面右上角的关闭按钮\n"
				+" 测试预期->2. 页面被关闭，所选信息未被删除。\n"
				+" 测试步骤->3. 点击页面左侧的删除按钮\n"
				+" 测试预期->3. 出现提示信息：删除成功！\n"
				+" 测试步骤->4. 勾选一项MDS状态为已提交，审核状态为未审批的MDS信息，点击删除按钮\n"
				+" 测试预期->4. 出现新页面信息，页面标题为详情，页面包含所选信息详细可删除信息。\n"
				+" 测试步骤->5. 点击页面左侧的删除全部按钮\n"
				+" 测试预期->5. 出现提示信息：删除成功！\n"
				+" 测试步骤->6. 勾选一项MDS状态为已提交，审核状态为未审批的MDS信息，点击删除按钮\n"
				+" 测试预期->6. 出现新页面信息，页面标题为详情，页面包含所选信息详细可删除信息。\n"
				+" 测试步骤->7. 修改新页面上的填写框中的内容，点击关闭按钮\n"
				+" 测试预期->7. 页面被关闭，重新打开该页面信息未被修改。\n"
				+" 测试步骤->8. 勾选一项MDS状态为已提交，审核状态为未审批的MDS信息，点击删除按钮\n"
				+" 测试预期->8. 出现新页面信息，页面标题为详情，页面包含所选信息详细可删除信息。\n"
				+" 测试步骤->9. 勾选一条或多条新页面下半部分的信息，点击删除按钮\n"
				+" 测试预期->9. 出现提示信息：删除成功！整条信息在材料数据信息中被删除。\n"
;
	}

}

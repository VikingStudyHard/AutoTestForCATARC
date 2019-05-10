package cn.edu.tju.scs.seql.final_ELV.数据管理_325.审核信息_334;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.零部件RRR计算_345.ElementEnum_零部件RRR计算_345;

/**
 * 测试用例id: 3469
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 审核信息(#334)
 * 用例名称: 验证查询MDS审核信息的查看审核按钮是否正常工作
 * 前置条件: 拥有MDS审核信息的权限
 * 测试步骤->1. 点击查看审核信息
 * 测试预期->1. 出现提示信息：请选择一个MDS！
 * 测试步骤->2. 勾选任意两项MDS信息
 * 测试预期->2. 功能栏按钮部分消失，仅剩下审核按钮。
 * 测试步骤->3. 勾选一项MDS状态为内部发布，审核状态为未审批的MDS信息，点击查看审核信息按钮
 * 测试预期->3. 跳出新页面，页面标题为审核信息，页面包含审核的各项信息。同时出现提示信息：没有经过审核，或者已于CAMDS审核！
 * 测试步骤->4. 勾选一项MDS状态为内部发布，审核状态为已审批的MDS信息，点击审核按钮
 * 测试预期->4. 跳出新页面，页面标题为测试5.4审核信息，页面包含审核的各项信息。
 * 测试步骤->5. 勾选一项MDS状态为已发布，审核状态为审批中的MDS信息，点击审核按钮
 * 测试预期->5. 跳出新页面，页面标题为测试5.4审核信息，页面包含审核的各项信息。
 * 测试步骤->6. 勾选一项MDS状态为已提交，审核状态为未审批的MDS信息，点击审核按钮
 * 测试预期->6. 跳出新页面，页面标题为审核信息，页面包含审核的各项信息。同时出现提示信息：没有经过审核，或者已于CAMDS审核！
 * 测试步骤->7. 勾选一项MDS状态为内部发布，审核状态为审批中的MDS信息，点击审核按钮
 * 测试预期->7. 跳出新页面，页面标题为测试5.4审核信息，页面包含审核的各项信息。
 * 
 */

public class 验证查询MDS审核信息的查看审核按钮是否正常工作_3469 extends Selenium_Test_Base {
	
	public 验证查询MDS审核信息的查看审核按钮是否正常工作_3469(){
		super();
	}
	
	public 验证查询MDS审核信息的查看审核按钮是否正常工作_3469(WebDriver driver){
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
		
	
//		WebDriverConfiguration.operationInterval();
//		getElement(ElementEnum_审核信息_334.一级目录名称).click();
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
		return "测试用例id: 3469\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 审核信息(#334)\n"
				+" 用例名称: 验证查询MDS审核信息的查看审核按钮是否正常工作\n"
				+" 前置条件: 拥有MDS审核信息的权限\n"
				+" 测试步骤->1. 点击查看审核信息\n"
				+" 测试预期->1. 出现提示信息：请选择一个MDS！\n"
				+" 测试步骤->2. 勾选任意两项MDS信息\n"
				+" 测试预期->2. 功能栏按钮部分消失，仅剩下审核按钮。\n"
				+" 测试步骤->3. 勾选一项MDS状态为内部发布，审核状态为未审批的MDS信息，点击查看审核信息按钮\n"
				+" 测试预期->3. 跳出新页面，页面标题为审核信息，页面包含审核的各项信息。同时出现提示信息：没有经过审核，或者已于CAMDS审核！\n"
				+" 测试步骤->4. 勾选一项MDS状态为内部发布，审核状态为已审批的MDS信息，点击审核按钮\n"
				+" 测试预期->4. 跳出新页面，页面标题为测试5.4审核信息，页面包含审核的各项信息。\n"
				+" 测试步骤->5. 勾选一项MDS状态为已发布，审核状态为审批中的MDS信息，点击审核按钮\n"
				+" 测试预期->5. 跳出新页面，页面标题为测试5.4审核信息，页面包含审核的各项信息。\n"
				+" 测试步骤->6. 勾选一项MDS状态为已提交，审核状态为未审批的MDS信息，点击审核按钮\n"
				+" 测试预期->6. 跳出新页面，页面标题为审核信息，页面包含审核的各项信息。同时出现提示信息：没有经过审核，或者已于CAMDS审核！\n"
				+" 测试步骤->7. 勾选一项MDS状态为内部发布，审核状态为审批中的MDS信息，点击审核按钮\n"
				+" 测试预期->7. 跳出新页面，页面标题为测试5.4审核信息，页面包含审核的各项信息。\n"
;
	}

}

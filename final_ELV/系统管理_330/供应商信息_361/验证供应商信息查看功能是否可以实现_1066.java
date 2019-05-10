package cn.edu.tju.scs.seql.final_ELV.系统管理_330.供应商信息_361;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.final_ELV.法规管理_329.公告信息_353.ElementEnum_公告信息_353;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 1066
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 供应商信息(#361)
 * 用例名称: 验证供应商信息查看功能是否可以实现
 * 前置条件: 能正确进入ELV环境合规系统（标准版）供应商信息界面
 * 测试步骤->1. 任意选取一条供应商信息，点击查看按钮。
 * 测试预期->1. 出现新页面，显示该供应商的各项信息。
 * 测试步骤->2. 任意选取两条供应商信息
 * 测试预期->2. 查看按钮和修改按钮消失，仅剩下新增和删除按钮。
 * 测试步骤->3. 点击关闭供应商信息页面
 * 测试预期->3. 回到最初页面。
 * 
 */

public class 验证供应商信息查看功能是否可以实现_1066 extends Selenium_Test_Base {
	
	public 验证供应商信息查看功能是否可以实现_1066(){
		super();
	}
	
	public 验证供应商信息查看功能是否可以实现_1066(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_供应商信息_361.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_供应商信息_361.rightFrame);
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
		getElement(ElementEnum_供应商信息_361.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_供应商信息_361.检索结果第一行勾选框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.查看按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_供应商信息_361.查看界面关闭按钮).click();
		WebDriverConfiguration.operationInterval();
		driver.findElement(By.xpath(ElementEnum_供应商信息_361.检索结果第一行勾选框.getName().replaceAll("tr\\[2\\]", "tr[3]"))).click();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_供应商信息_361.查看按钮).getCssValue("display"), "none");
		assertEquals(getElement(ElementEnum_供应商信息_361.修改按钮).getCssValue("display"), "none");
	}

	
	public String getDescription(){
		return "测试用例id: 1066\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 供应商信息(#361)\n"
				+" 用例名称: 验证供应商信息查看功能是否可以实现\n"
				+" 前置条件: 能正确进入ELV环境合规系统（标准版）供应商信息界面\n"
				+" 测试步骤->1. 任意选取一条供应商信息，点击查看按钮。\n"
				+" 测试预期->1. 出现新页面，显示该供应商的各项信息。\n"
				+" 测试步骤->2. 任意选取两条供应商信息\n"
				+" 测试预期->2. 查看按钮和修改按钮消失，仅剩下新增和删除按钮。\n"
				+" 测试步骤->3. 点击关闭供应商信息页面\n"
				+" 测试预期->3. 回到最初页面。\n"
;
	}

}

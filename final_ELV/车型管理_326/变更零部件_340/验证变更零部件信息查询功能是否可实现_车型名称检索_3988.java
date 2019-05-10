package cn.edu.tju.scs.seql.final_ELV.车型管理_326.变更零部件_340;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.进展报表统计_344.ElementEnum_进展报表统计_344;

/**
 * 测试用例id: 3988
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 变更零部件(#340)
 * 用例名称: 验证变更零部件信息查询功能是否可实现-车型名称检索
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 在变更零部件信息的查询条件：车型名称中填写1，点击检索按钮
 * 测试预期->1. 无符合条件的信息被检索出
 * 测试步骤->2. 在变更零部件信息的查询条件：车型名称中填写ELVT，点击检索按钮
 * 测试预期->2. 无符合条件的信息被检索出
 * 测试步骤->3. 在变更零部件信息的查询条件：车型名称中填写ELVTEST，点击检索按钮
 * 测试预期->3. 车型名称（中文或英文）名称中为ELVTEST的所有变更零部件信息被检索出来
 * 
 */

public class 验证变更零部件信息查询功能是否可实现_车型名称检索_3988 extends Selenium_Test_Base {
	
	public 验证变更零部件信息查询功能是否可实现_车型名称检索_3988(){
		super();
	}
	
	public 验证变更零部件信息查询功能是否可实现_车型名称检索_3988(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_变更零部件_340.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_变更零部件_340.rightFrame);
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
		getElement(ElementEnum_变更零部件_340.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_变更零部件_340.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		query("1");
		query("ELVT");
		query("ELVTEST");
	}
	
	private void query(String word){
		getElement(ElementEnum_变更零部件_340.车型名称查询).clear();
		getElement(ElementEnum_变更零部件_340.车型名称查询).sendKeys(word);
		getElement(ElementEnum_变更零部件_340.检索按钮).click();
		waitingForLoading();
		
		List<WebElement> eles = getElements(ElementEnum_变更零部件_340.表格所有项);
		if (eles.size() == 0)
			return;
		for (int i = 1; i < eles.size(); i++){
			String cname = driver.findElement(By.xpath(ElementEnum_变更零部件_340.表格第一行车型中文名称.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			String ename = driver.findElement(By.xpath(ElementEnum_变更零部件_340.表格第一行车型英文名称.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			assertTrue(cname.equals(word) || ename.equals(word));
			//assertTrue(cname.contains(word) || ename.contains(word));
		}
	}
	
	private void waitingForLoading(){
		
		do{
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e){
				
			}
		} while((!getElement(ElementEnum_变更零部件_340.Loading框).getCssValue("display").equals("none")));
	}

	
	public String getDescription(){
		return "测试用例id: 3988\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 变更零部件(#340)\n"
				+" 用例名称: 验证变更零部件信息查询功能是否可实现-车型名称检索\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 在变更零部件信息的查询条件：车型名称中填写1，点击检索按钮\n"
				+" 测试预期->1. 无符合条件的信息被检索出\n"
				+" 测试步骤->2. 在变更零部件信息的查询条件：车型名称中填写ELVT，点击检索按钮\n"
				+" 测试预期->2. 无符合条件的信息被检索出\n"
				+" 测试步骤->3. 在变更零部件信息的查询条件：车型名称中填写ELVTEST，点击检索按钮\n"
				+" 测试预期->3. 车型名称（中文或英文）名称中为ELVTEST的所有变更零部件信息被检索出来\n"
;
	}

}

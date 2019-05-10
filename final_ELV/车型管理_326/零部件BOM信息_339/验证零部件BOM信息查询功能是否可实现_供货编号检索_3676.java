package cn.edu.tju.scs.seql.final_ELV.车型管理_326.零部件BOM信息_339;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3676
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件BOM信息(#339)
 * 用例名称: 验证零部件BOM信息查询功能是否可实现-供货编号检索
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 在BOM信息的查询条件：供货编号中填写1，点击检索按钮
 * 测试预期->1. 无符合条件的信息检索出来
 * 测试步骤->2. 在BOM信息的查询条件：供货编号中填写20150309，点击检索按钮
 * 测试预期->2. 供货编号为20150309的BOM信息被检索出来
 * 
 */

public class 验证零部件BOM信息查询功能是否可实现_供货编号检索_3676 extends Selenium_Test_Base {
	
	public 验证零部件BOM信息查询功能是否可实现_供货编号检索_3676(){
		super();
	}
	
	public 验证零部件BOM信息查询功能是否可实现_供货编号检索_3676(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_零部件BOM信息_339.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_零部件BOM信息_339.rightFrame);
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
		getElement(ElementEnum_零部件BOM信息_339.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件BOM信息_339.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		query("1");
		query("20150309");
	}
	
	private void query(String word){
		getElement(ElementEnum_零部件BOM信息_339.供货编号输入框).clear();
		getElement(ElementEnum_零部件BOM信息_339.供货编号输入框).sendKeys(word);
		getElement(ElementEnum_零部件BOM信息_339.检索键).click();
		waitingForLoading();
		
		List<WebElement> eles = getElements(ElementEnum_零部件BOM信息_339.检索结果所有行);
		if (eles.size() == 0)
			return;
		for (int i = 1; i < eles.size(); i++){
			String number = driver.findElement(By.xpath(ElementEnum_零部件BOM信息_339.检索结果第一行供货编号.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			assertTrue(number.equals(word) || number.equals(word));
		}
	}
	
	private void waitingForLoading(){
		
		do{
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e){
				
			}
		} while((!getElement(ElementEnum_零部件BOM信息_339.Loading框).getCssValue("display").equals("none")));
	}

	
	public String getDescription(){
		return "测试用例id: 3676\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件BOM信息(#339)\n"
				+" 用例名称: 验证零部件BOM信息查询功能是否可实现-供货编号检索\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 在BOM信息的查询条件：供货编号中填写1，点击检索按钮\n"
				+" 测试预期->1. 无符合条件的信息检索出来\n"
				+" 测试步骤->2. 在BOM信息的查询条件：供货编号中填写20150309，点击检索按钮\n"
				+" 测试预期->2. 供货编号为20150309的BOM信息被检索出来\n"
;
	}

}

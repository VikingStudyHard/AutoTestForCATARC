package cn.edu.tju.scs.seql.final_ELV.综合分析_327.零部件RRR计算_345;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.有害物质分析_342.ElementEnum_有害物质分析_342;

/**
 * 测试用例id: 4228
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件RRR计算(#345)
 * 用例名称: 验证零部件RRR计算查看功能是否可实现-表单内操作
 * 前置条件: 能正确进入综合分析模块
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
 * 测试预期->7. 表单右侧的详细信息变更为子树的详细数据信息，页面无其他变化
 * 测试步骤->8. 单击左侧树形图母树的文字信息
 * 测试预期->8. 表单右侧的详细信息变更为母树的详细数据信息，页面无其他变化
 * 
 */

public class 验证零部件RRR计算查看功能是否可实现_表单内操作_4228 extends Selenium_Test_Base {
	
	public 验证零部件RRR计算查看功能是否可实现_表单内操作_4228(){
		super();
	}
	
	public 验证零部件RRR计算查看功能是否可实现_表单内操作_4228(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_零部件RRR计算_345.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_零部件RRR计算_345.rightFrame);
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
		getElement(ElementEnum_零部件RRR计算_345.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_零部件RRR计算_345.MSD信息选择按钮1).click();
		getElement(ElementEnum_零部件RRR计算_345.MSD信息查看按钮).click();
		
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_零部件RRR计算_345.查看信息页标题).getText(),"查看的材料数据表");
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		//打开图片
		getElement(ElementEnum_零部件RRR计算_345.查看打开树按钮).click();
		WebDriverConfiguration.operationInterval();
		List<WebElement> pictureopenlist = getElements(ElementEnum_零部件RRR计算_345.查看页树所有行);
		assertTrue( pictureopenlist.size()>1,"没有打开");
		//关闭图片
		getElement(ElementEnum_零部件RRR计算_345.查看关闭树按钮).click();
		WebDriverConfiguration.operationInterval();
		List<WebElement>  picturecloselist = getElements(ElementEnum_零部件RRR计算_345.查看页树所有行);
		assertTrue( picturecloselist.size()==1,"没有关闭");
		//加号标志
		getElement(ElementEnum_零部件RRR计算_345.符号树操作按钮).click();
		WebDriverConfiguration.operationInterval();
		List<WebElement> openlist = getElements(ElementEnum_零部件RRR计算_345.查看页树所有行);
		assertTrue( openlist.size()>1,"没有打开");
		
		//减号标志
		getElement(ElementEnum_零部件RRR计算_345.符号树操作按钮).click();
		WebDriverConfiguration.operationInterval();
		List<WebElement> closelist = getElements(ElementEnum_零部件RRR计算_345.查看页树所有行);
		assertTrue(closelist.size()==1,"没有关闭");
		//双击文字
		(new Actions( driver)).doubleClick( getElement(ElementEnum_零部件RRR计算_345.母树文字 )).perform();
		WebDriverConfiguration.operationInterval();
		List<WebElement> wordopenlist = getElements(ElementEnum_零部件RRR计算_345.查看页树所有行);
		assertTrue(wordopenlist.size()>1,"没有打开");
		//子树文字打开明细
		/*getElement(ElementEnum_零部件RRR计算_345.子树文字).click();
		assertEquals(getElement(ElementEnum_零部件RRR计算_345.子树明细文字).getTagName(),getElement(ElementEnum_零部件RRR计算_345.子树文字).getText());*/
		//母树文字打开明细
		/*getElement(ElementEnum_零部件RRR计算_345.母树文字).click();
		assertEquals(getElement(ElementEnum_零部件RRR计算_345.母树明细文字).getText(),getElement(ElementEnum_零部件RRR计算_345.母树文字).getText());*/
		/*getElement(ElementEnum_零部件RRR计算_345.子树文字).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(getElement(ElementEnum_零部件RRR计算_345.明细).isDisplayed(),"没有显示");
		getElement(ElementEnum_零部件RRR计算_345.母树文字).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(getElement(ElementEnum_零部件RRR计算_345.明细).isDisplayed(),"没有显示");

		
		assertEquals(driver.findElement(By.xpath("//td")).getText(), "企业名称:");
	    assertEquals(driver.findElement(By.xpath("//td[3]")).getText(), "企业ID:");
	    assertEquals(driver.findElement(By.xpath("//td[5]")).getText(), "计划员:");
	    assertEquals(driver.findElement(By.xpath("//td[7]")).getText(), "区域");
	    assertEquals(driver.findElement(By.xpath("//td[9]")).getText(), "新增信息来源");
	    assertEquals(driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td/div/input")).getText(), "");
		*/
	
	}

	
	public String getDescription(){
		return "测试用例id: 4228\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件RRR计算(#345)\n"
				+" 用例名称: 验证零部件RRR计算查看功能是否可实现-表单内操作\n"
				+" 前置条件: 能正确进入综合分析模块\n"
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
				+" 测试预期->7. 表单右侧的详细信息变更为子树的详细数据信息，页面无其他变化\n"
				+" 测试步骤->8. 单击左侧树形图母树的文字信息\n"
				+" 测试预期->8. 表单右侧的详细信息变更为母树的详细数据信息，页面无其他变化\n"
;
	}

}

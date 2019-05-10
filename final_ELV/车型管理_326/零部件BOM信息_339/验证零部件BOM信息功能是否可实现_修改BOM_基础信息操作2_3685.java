package cn.edu.tju.scs.seql.final_ELV.车型管理_326.零部件BOM信息_339;

import static org.testng.Assert.*;

import java.io.File;
import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3685
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件BOM信息(#339)
 * 用例名称: 验证零部件BOM信息功能是否可实现-修改BOM-基础信息操作2
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 单击左键选择一条零部件信息，点击修改BOM按钮
 * 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。
 * 测试步骤->2. 单击选择一条树形图节点，点击右上角的导出按钮
 * 测试预期->2. 左侧树形图关闭，相应的节点信息成功下载本地，页面无其他相应
 * 测试步骤->3. 点击匹配信息右上角的导出按钮
 * 测试预期->3. 相应的匹配信息成功下载本地，页面无其他相应
 * 测试步骤->4. 点击基础信息右上角的返回按钮
 * 测试预期->4. 页面被正常关闭，恢复到零部件BOM信息页面
 * 测试步骤->5. 点击基础信息右上角的保存按钮
 * 测试预期->5. 弹出提示信息：该BOM没有修改的内容，无需重复保存
 * 
 */

public class 验证零部件BOM信息功能是否可实现_修改BOM_基础信息操作2_3685 extends Selenium_Test_Base {
	
	public 验证零部件BOM信息功能是否可实现_修改BOM_基础信息操作2_3685(){
		super();
	}
	
	public 验证零部件BOM信息功能是否可实现_修改BOM_基础信息操作2_3685(WebDriver driver){
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
		waitingForLoading();
		List<WebElement> eles = getElements(ElementEnum_零部件BOM信息_339.检索结果所有行);
		boolean find = false;
		String eleXpath = null;
		for (int i = 1; i < eles.size(); i++){
			String mds = driver.findElement(By.xpath(ElementEnum_零部件BOM信息_339.检索结果第一行MDS状态.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			if (mds.equals("编辑中")){
				find = true;
				driver.findElement(By.xpath(ElementEnum_零部件BOM信息_339.检索结果第一行.getName()
						.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).click();
				eleXpath = ElementEnum_零部件BOM信息_339.检索结果第一行.getName().replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]");
				break;
			}
		}
		
		if (!find){
			Assert.fail("页面中没有mds状态为编辑中的记录");
		}
		else {
			getElement(ElementEnum_零部件BOM信息_339.修改BOM键).click();
			WebDriverConfiguration.operationInterval();
			WebDriverConfiguration.operationInterval();
			WebDriverConfiguration.operationInterval();
			WebDriverConfiguration.operationInterval();
			WebDriverConfiguration.operationInterval();
			
			assertNotNull(getElement(ElementEnum_零部件BOM信息_339.BOM树形标签));
			
			downloadOperation(getElement(ElementEnum_零部件BOM信息_339.导出键));
			getElement(ElementEnum_零部件BOM信息_339.返回键).click();
			WebDriverConfiguration.operationInterval();
			
			driver.findElement(By.xpath(eleXpath)).click();
			getElement(ElementEnum_零部件BOM信息_339.修改BOM键).click();
			WebDriverConfiguration.operationInterval();
			WebDriverConfiguration.operationInterval();
			WebDriverConfiguration.operationInterval();
			WebDriverConfiguration.operationInterval();
			WebDriverConfiguration.operationInterval();
			
			
			getElement(ElementEnum_零部件BOM信息_339.保存键).click();
			WebDriverConfiguration.operationInterval();
			
			try{
				Alert alert = driver.switchTo().alert();
				alert.accept();
			} catch (Exception e){
				Assert.fail("未出现相应的提示框");
			}
		}
	}
	
	private boolean downloadOperation(WebElement button){
		File folder = new File("d:\\zddFiles\\downdir");
		for (String file : folder.list()){
			new File("d:\\zddFiles\\downdir\\" + file).delete();
		}
		button.click();
		WebDriverConfiguration.operationInterval();
		return folder.list().length == 1 && (folder.list()[0].endsWith(".xlsx"));
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
		return "测试用例id: 3685\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件BOM信息(#339)\n"
				+" 用例名称: 验证零部件BOM信息功能是否可实现-修改BOM-基础信息操作2\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 单击左键选择一条零部件信息，点击修改BOM按钮\n"
				+" 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。\n"
				+" 测试步骤->2. 单击选择一条树形图节点，点击右上角的导出按钮\n"
				+" 测试预期->2. 左侧树形图关闭，相应的节点信息成功下载本地，页面无其他相应\n"
				+" 测试步骤->3. 点击匹配信息右上角的导出按钮\n"
				+" 测试预期->3. 相应的匹配信息成功下载本地，页面无其他相应\n"
				+" 测试步骤->4. 点击基础信息右上角的返回按钮\n"
				+" 测试预期->4. 页面被正常关闭，恢复到零部件BOM信息页面\n"
				+" 测试步骤->5. 点击基础信息右上角的保存按钮\n"
				+" 测试预期->5. 弹出提示信息：该BOM没有修改的内容，无需重复保存\n"
;
	}

}

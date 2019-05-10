package cn.edu.tju.scs.seql.final_ELV.车型管理_326.零部件BOM信息_339;

import static org.testng.Assert.*;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 6677
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件BOM信息(#339)
 * 用例名称: 验证零部件BOM信息功能是否可实现-修改BOM--匹配结果操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 单击左键选择一条零部件信息，点击查看修改BOM按钮
 * 测试预期->1. 出现修改BOM窗口，含有各项零部件BOM信息。
 * 测试步骤->2. 单击选择一条树形图节点，点击右上角的整体匹配按钮
 * 测试预期->2. 显示“匹配成功”或者“匹配失败”的对话框，只要有一个节点未匹配上即提示匹配失败
 * 测试步骤->3. 点击左侧的打开树按钮
 * 测试预期->3. 如果匹配成功，树节点为黑色，如果匹配失败，某些树节点可能为红色，黄色和绿色
 * 测试步骤->4. 点击右上角的匹配结果按钮
 * 测试预期->4. 跳出新页面：匹配失败的树节点在此页面显示请求状态 如果BOM树形树节点为红色，则请求状态为该MDS不存在 如果BOM树形树节点为黄色，则请求状态为该MDS审核未完成初审 如果BOM树形树节点为绿色，则请求状态为该MDS处于编辑状态
 * 测试步骤->5. 在匹配结果页面点击下载数据
 * 测试预期->5. 匹配结果下载至本地，文件格式为.xlsx
 * 测试步骤->6. 在匹配结果页面点击发送
 * 测试预期->6. 弹出提示信息：请至少选择一条MDS记录
 * 测试步骤->7. 选择请求状态为“该MDS不存在”的一条MDS，点击右上角的发送按钮
 * 测试预期->7. 弹出创建请求的新页面
 * 测试步骤->8. 选择请求状态为“该MDS未完成初审”的一条MDS，点击右上角的发送按钮
 * 测试预期->8. 弹出新建/编辑信息的新页面
 * 测试步骤->9. 单击右上角的返回按钮
 * 测试预期->9. 匹配结果页面关闭
 * 
 */

public class 验证零部件BOM信息功能是否可实现_修改BOM__匹配结果操作_6677 extends Selenium_Test_Base {
	
	public 验证零部件BOM信息功能是否可实现_修改BOM__匹配结果操作_6677(){
		super();
	}
	
	public 验证零部件BOM信息功能是否可实现_修改BOM__匹配结果操作_6677(WebDriver driver){
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
	
	private boolean downloadOperation(WebElement button){
		File folder = new File("d:\\zddFiles\\downdir");
		for (String file : folder.list()){
			new File("d:\\zddFiles\\downdir\\" + file).delete();
		}
		button.click();
		WebDriverConfiguration.operationInterval();
		return folder.list().length == 1 && (folder.list()[0].endsWith(".xlsx"));
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		waitingForLoading();
		List<WebElement> eles = getElements(ElementEnum_零部件BOM信息_339.检索结果所有行);
		if (eles.size() == 0)
			return;
		for (int i = 1; i < eles.size(); i++){
			String s = driver.findElement(By.xpath(ElementEnum_零部件BOM信息_339.检索结果第一行MDS状态.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
			if (s.equals("已转换")){
				continue;
			}
			driver.findElement(By.xpath(ElementEnum_零部件BOM信息_339.检索结果第一行.getName()
					.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).click();
			getElement(ElementEnum_零部件BOM信息_339.修改BOM键).click();
			WebDriverConfiguration.operationInterval();
			
			String attClass = getElement(ElementEnum_零部件BOM信息_339.树形图根节点左侧加号).getAttribute("class");
			String[] atts = attClass.split(" ");
			boolean canExpand = false;
			for (String att : atts){
				if (att.equals("x-tree-expander")){
					canExpand = true;
					break;
				}
			}
			
			if (canExpand){
				getElement(ElementEnum_零部件BOM信息_339.树形图根节点).click();
				getElement(ElementEnum_零部件BOM信息_339.整体匹配键).click();
				WebDriverConfiguration.operationInterval();
				Alert alert = driver.switchTo().alert();
				boolean result = alert.getText().contains("失败") ? false : true;
				alert.accept();
				getElement(ElementEnum_零部件BOM信息_339.查看BOM子页面打开树键).click();
				for (int j = 0; j < 5; j++){
					WebDriverConfiguration.operationInterval();
				}
				
				List<WebElement> rows = getElements(ElementEnum_零部件BOM信息_339.树形图所有行);
				if (rows.size() == 0)
					return;
				boolean allBlack = true;
				for (int j = 1; j < rows.size(); j++){
					String xpath = ElementEnum_零部件BOM信息_339.树形图根节点.getName()
							.replaceAll("tr\\[2\\]", "tr[" + (j + 1) + "]");
					xpath += "/td";
					WebElement row = driver.findElement(By.xpath(xpath));
					if (!row.getCssValue("color").equals("rgba(0, 0, 0, 1)")){
						allBlack = false;
						break;
					}
				}
				assertEquals(result, allBlack);
				
				if (result){
					return;
				}
				
				getElement(ElementEnum_零部件BOM信息_339.匹配结果键).click();
				WebDriverConfiguration.operationInterval();
				Set<String> handlers = driver.getWindowHandles();
				String parent = driver.getWindowHandle();
				handlers.remove(parent);
				String child = handlers.iterator().next();
				driver.switchTo().window(child);
				
				downloadOperation(getElement(ElementEnum_零部件BOM信息_339.匹配结果子页面下载数据键));
				
				getElement(ElementEnum_零部件BOM信息_339.匹配结果子页面发送键).click();
				WebDriverConfiguration.operationInterval();
				assertNotNull(getElement(ElementEnum_零部件BOM信息_339.匹配结果子页面未选择提示框));
				getElement(ElementEnum_零部件BOM信息_339.匹配结果子页面未选择提示框确定键).click();
				WebDriverConfiguration.operationInterval();
				
				String state = getElement(ElementEnum_零部件BOM信息_339.匹配结果子页面表格第一行状态).getText();
				getElement(ElementEnum_零部件BOM信息_339.匹配结果子页面表格第一行).click();
				getElement(ElementEnum_零部件BOM信息_339.匹配结果子页面发送键).click();
				WebDriverConfiguration.operationInterval();
				String headName = driver.getTitle();
				if (state.equals("此mds不存在")){
					assertEquals(headName, "创建请求");
				}
				else if (state.equals("MDS未完成初审")){
					assertEquals(headName, "编辑信息");
				}
				//else{
					//Assert.fail("未知的状态");
				//}
				
				getElement(ElementEnum_零部件BOM信息_339.匹配结果子页面返回键).click();
				WebDriverConfiguration.operationInterval();
				
				break;
			}
			
			getElement(ElementEnum_零部件BOM信息_339.返回键).click();
			//waitingForLoading();
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
		return "测试用例id: 6677\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件BOM信息(#339)\n"
				+" 用例名称: 验证零部件BOM信息功能是否可实现-修改BOM--匹配结果操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 单击左键选择一条零部件信息，点击查看修改BOM按钮\n"
				+" 测试预期->1. 出现修改BOM窗口，含有各项零部件BOM信息。\n"
				+" 测试步骤->2. 单击选择一条树形图节点，点击右上角的整体匹配按钮\n"
				+" 测试预期->2. 显示“匹配成功”或者“匹配失败”的对话框，只要有一个节点未匹配上即提示匹配失败\n"
				+" 测试步骤->3. 点击左侧的打开树按钮\n"
				+" 测试预期->3. 如果匹配成功，树节点为黑色，如果匹配失败，某些树节点可能为红色，黄色和绿色\n"
				+" 测试步骤->4. 点击右上角的匹配结果按钮\n"
				+" 测试预期->4. 跳出新页面：匹配失败的树节点在此页面显示请求状态 如果BOM树形树节点为红色，则请求状态为该MDS不存在 如果BOM树形树节点为黄色，则请求状态为该MDS审核未完成初审 如果BOM树形树节点为绿色，则请求状态为该MDS处于编辑状态\n"
				+" 测试步骤->5. 在匹配结果页面点击下载数据\n"
				+" 测试预期->5. 匹配结果下载至本地，文件格式为.xlsx\n"
				+" 测试步骤->6. 在匹配结果页面点击发送\n"
				+" 测试预期->6. 弹出提示信息：请至少选择一条MDS记录\n"
				+" 测试步骤->7. 选择请求状态为“该MDS不存在”的一条MDS，点击右上角的发送按钮\n"
				+" 测试预期->7. 弹出创建请求的新页面\n"
				+" 测试步骤->8. 选择请求状态为“该MDS未完成初审”的一条MDS，点击右上角的发送按钮\n"
				+" 测试预期->8. 弹出新建/编辑信息的新页面\n"
				+" 测试步骤->9. 单击右上角的返回按钮\n"
				+" 测试预期->9. 匹配结果页面关闭\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.车型管理_326.BOM分发结果_338;

import static org.testng.Assert.*;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3669
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: BOM分发结果(#338)
 * 用例名称: 验证BOM分发结果信息查询功能是否可实现-零部件bom名称检索
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 点击查找零部件bom按钮
 * 测试预期->1. 出现新页面，页面含有检索信息可检索出车型商标名称等BOM信息
 * 测试步骤->2. 选择查询类型为零部件，点击查询按钮
 * 测试预期->2. 查询出所有类型为零部件的MDS 信息
 * 测试步骤->3. 选择表单来源为camds下载，点击查询按钮
 * 测试预期->3. 查询出所有表单来源为camds下载的MDS 信息
 * 测试步骤->4. 填写名称为test，点击查询按钮
 * 测试预期->4. 查询出所有名称含有字段test的MDS 信息
 * 测试步骤->5. 填写部件号为tyj，点击查询按钮
 * 测试预期->5. 查询出所有名称为tyj的MDS 信息
 * 测试步骤->6. 填写版本组ID为1516532，点击查询按钮
 * 测试预期->6. 查询出所有版本组ID为1516532的MDS 信息
 * 测试步骤->7. 选择一条BOM信息，点击确定按钮
 * 测试预期->7. 页面关闭，零部件bom名称的检索框中为所选择BOM信息的零部件bom名称
 * 
 */

public class 验证BOM分发结果信息查询功能是否可实现_零部件bom名称检索_3669 extends Selenium_Test_Base {
	
	public 验证BOM分发结果信息查询功能是否可实现_零部件bom名称检索_3669(){
		super();
	}
	
	public 验证BOM分发结果信息查询功能是否可实现_零部件bom名称检索_3669(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_BOM分发结果_338.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_BOM分发结果_338.rightFrame);
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
		getElement(ElementEnum_BOM分发结果_338.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_BOM分发结果_338.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_BOM分发结果_338.零部件BOM名称输入框).click();
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM键).click();
		WebDriverConfiguration.operationInterval();
		Set<String> handlers = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		handlers.remove(parent);
		String child = handlers.iterator().next();
		driver.switchTo().window(child);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('readonly')", 
				getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面查询类型输入框));
		((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('readonly')", 
				getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面表单来源输入框));
		clearAll();
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面查询类型输入框).clear();
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面查询类型输入框).sendKeys("零部件");
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面查询键).click();
		WebDriverConfiguration.operationInterval();
		
		clearAll();
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面表单来源输入框).clear();
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面表单来源输入框).sendKeys("camds下载");
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面查询键).click();
		WebDriverConfiguration.operationInterval();
		
		clearAll();
		String name = "test";
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面名称输入框).sendKeys(name);
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面查询键).click();
		WebDriverConfiguration.operationInterval();
		check(name, null, null);
		
		clearAll();
		String number = "tyj";
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面部件号输入框).sendKeys(number);
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面查询键).click();
		WebDriverConfiguration.operationInterval();
		check(null, number, null);
		
		clearAll();
		String id = "1516532";
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面版本组ID输入框).sendKeys(id);
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面查询键).click();
		WebDriverConfiguration.operationInterval();
		check(null, null, id);
	}
	
	private void clearAll(){
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面查询类型输入框).clear();
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面查询类型输入框).sendKeys("全部");
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面表单来源输入框).clear();
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面表单来源输入框).sendKeys("全部");
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面名称输入框).clear();
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面部件号输入框).clear();
		getElement(ElementEnum_BOM分发结果_338.查找零部件BOM子页面版本组ID输入框).clear();
	}
	
	public void check(String name, String number, String id){
		List<WebElement> eles = getElements(ElementEnum_BOM分发结果_338.查找零部件BOM子页面表格所有行);
		if (eles.size() == 0)
			return;
		for (int i = 1; i < eles.size(); i++){
			if (name != null){
				String n = driver.findElement(By.xpath(ElementEnum_BOM分发结果_338.查找零部件BOM子页面表格第一行名称.getName()
						.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
				assertTrue(n.contains(name));
			}
			if (number != null){
				String n = driver.findElement(By.xpath(ElementEnum_BOM分发结果_338.查找零部件BOM子页面表格第一行部件号.getName()
						.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
				assertTrue(n.contains(number));
			}
			if (id != null){
				String n = driver.findElement(By.xpath(ElementEnum_BOM分发结果_338.查找零部件BOM子页面表格第一行版本组ID.getName()
						.replaceAll("tr\\[2\\]", "tr[" + (i + 1) + "]"))).getText();
				assertTrue(n.contains(id));
			}
		}
	}

	
	public String getDescription(){
		return "测试用例id: 3669\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: BOM分发结果(#338)\n"
				+" 用例名称: 验证BOM分发结果信息查询功能是否可实现-零部件bom名称检索\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 点击查找零部件bom按钮\n"
				+" 测试预期->1. 出现新页面，页面含有检索信息可检索出车型商标名称等BOM信息\n"
				+" 测试步骤->2. 选择查询类型为零部件，点击查询按钮\n"
				+" 测试预期->2. 查询出所有类型为零部件的MDS 信息\n"
				+" 测试步骤->3. 选择表单来源为camds下载，点击查询按钮\n"
				+" 测试预期->3. 查询出所有表单来源为camds下载的MDS 信息\n"
				+" 测试步骤->4. 填写名称为test，点击查询按钮\n"
				+" 测试预期->4. 查询出所有名称含有字段test的MDS 信息\n"
				+" 测试步骤->5. 填写部件号为tyj，点击查询按钮\n"
				+" 测试预期->5. 查询出所有名称为tyj的MDS 信息\n"
				+" 测试步骤->6. 填写版本组ID为1516532，点击查询按钮\n"
				+" 测试预期->6. 查询出所有版本组ID为1516532的MDS 信息\n"
				+" 测试步骤->7. 选择一条BOM信息，点击确定按钮\n"
				+" 测试预期->7. 页面关闭，零部件bom名称的检索框中为所选择BOM信息的零部件bom名称\n"
;
	}

}

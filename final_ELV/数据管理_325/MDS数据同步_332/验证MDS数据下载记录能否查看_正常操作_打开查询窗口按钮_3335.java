package cn.edu.tju.scs.seql.final_ELV.数据管理_325.MDS数据同步_332;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3335
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: MDS数据同步(#332)
 * 用例名称: 验证MDS数据下载记录能否查看-正常操作-打开查询窗口按钮
 * 前置条件: 1.有CAMDS帐号，拥有MDS数据同步的菜单权限。
 *         2.能够正确进入MDS数据同步界面
 * 测试步骤->1. 点击下载记录按钮
 * 测试预期->1. 跳出新页面，含有MDS数据下载记录信息和各个功能按钮。
 * 测试步骤->2. 点击右上角的打开查询窗口
 * 测试预期->2. 跳出新页面，含有需要填写的各项查找参数信息。
 * 测试步骤->3. 填写操作员为admin4，点击查询按钮
 * 测试预期->3. 页面查询到所有数据中，操作员为admin4的数据。
 * 测试步骤->4. 填写操作员为admin，点击查询按钮
 * 测试预期->4. 页面查询到所有数据中，操作员字段中含有admin的数据。
 * 测试步骤->5. 填写操作员为空，ID为CA，点击查询按钮
 * 测试预期->5. 页面出现提示信息：未查询到相关信息。
 * 测试步骤->6. 填写操作员为空，ID为CA_5_13182570，点击查询按钮
 * 测试预期->6. 页面查询到所有数据中，ID为CA_5_13182570的数据。
 * 测试步骤->7. 填写操作员为空，ID为空，供货编号为123，点击查询按钮
 * 测试预期->7. 页面查询到所有数据中，供货编号含有123字段的数据。
 * 测试步骤->8. 填写操作员为空，ID为空，供货编号为空，名称为c，点击查询按钮
 * 测试预期->8. 页面查询到所有数据中，名称含有c或C字段的数据。
 * 测试步骤->9. 填写操作员为空，ID为空，供货编号为空，名称为空，执行结果为下载成功，点击查询按钮
 * 测试预期->9. 页面查询到所有数据中，执行结果为下载成功的数据。
 * 测试步骤->10. 填写操作员为空，ID为空，供货编号为空，名称为空，执行结果为下载失败，点击查询按钮
 * 测试预期->10. 页面查询到所有数据中，执行结果为下载失败的数据。（数据信息显示为红色）
 * 测试步骤->11. 填写操作员为空，ID为空，供货编号为空，名称为空，执行结果为下载警告，点击查询按钮
 * 测试预期->11. 页面查询到所有数据中，执行结果为下载成功的数据。
 * 测试步骤->12. 填写操作员为空，ID为空，供货编号为空，名称为空，执行结果为全部，开始时间为16年03月09日 16:01:42，点击查询按钮
 * 测试预期->12. 页面查询到所有数据中，同步时间为选择时间之后的数据。
 * 测试步骤->13. 填写操作员为空，ID为空，供货编号为空，名称为空，执行结果为全部，开始时间为空，结束时间为16年04月12日 16:02:58，点击查询按钮
 * 测试预期->13. 页面查询到所有数据中，同步时间为选择时间之前的数据。
 * 测试步骤->14. 填写操作员为admin，ID为CA_5_13182570，供货编号为1，名称为c，执行结果为下载成功，开始时间为16年03月09日 16:01:42，结束时间为16年04月12日 16:02:58，点击查询按钮
 * 测试预期->14. 页面查询到所有数据中，操作员字段含有admin，ID为CA_5_13182570，供货编号含有字段1，名称含有字段c或C，执行结果为下载成功，同步时间为选择时间之间的数据。
 * 测试步骤->15. 填写操作员为admin，ID为CA_5_13182570，供货编号为1，名称为c，执行结果为下载成功，开始时间为16年03月09日 16:01:42，结束时间为16年04月12日 16:02:58，点击重置按钮
 * 测试预期->15. 所填入的参数均变为空
 * 测试步骤->16. 填写操作员为admin，ID为CA_5_13182570，供货编号为1，名称为c，执行结果为下载成功，开始时间为16年03月09日 16:01:42，结束时间为16年04月12日 16:02:58，点击关闭按钮
 * 测试预期->16. 页面被关闭，跳转回最初页面。
 * 
 */

public class 验证MDS数据下载记录能否查看_正常操作_打开查询窗口按钮_3335 extends Selenium_Test_Base {
	
	public 验证MDS数据下载记录能否查看_正常操作_打开查询窗口按钮_3335(){
		super();
	}
	
	public 验证MDS数据下载记录能否查看_正常操作_打开查询窗口按钮_3335(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_MDS数据同步_332.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_MDS数据同步_332.rightFrame);
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
//		getElement(ElementEnum_MDS数据同步_332.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_MDS数据同步_332.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_MDS数据同步_332 a = new CommonOperations_MDS数据同步_332(driver);
		getElement(ElementEnum_MDS数据同步_332.下载记录按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_MDS数据同步_332.MDS数据下载记录窗口打开查询窗口按钮).click();
		WebDriverConfiguration.operationInterval();
		a.fillSearchInfo("admin", "", "", "", "全部", "", "");
		getElement(ElementEnum_MDS数据同步_332.查找参数查询按钮).click();
		WebDriverConfiguration.operationInterval();
		WebElement tip = getElement(ElementEnum_MDS数据同步_332.第一页提示框最外层);
		assertTrue(tip == null || !tip.isDisplayed());
		
		getElement(ElementEnum_MDS数据同步_332.MDS数据下载记录窗口打开查询窗口按钮).click();
		WebDriverConfiguration.operationInterval();
		a.fillSearchInfo("", "CA", "", "", "全部", "", "");
		getElement(ElementEnum_MDS数据同步_332.查找参数查询按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("没有查询到相关数据");
		
		getElement(ElementEnum_MDS数据同步_332.MDS数据下载记录窗口打开查询窗口按钮).click();
		WebDriverConfiguration.operationInterval();
		a.fillSearchInfo("", "CA_8_12022090", "", "", "全部", "", "");
		getElement(ElementEnum_MDS数据同步_332.查找参数查询按钮).click();
		WebDriverConfiguration.operationInterval();
		tip = getElement(ElementEnum_MDS数据同步_332.第一页提示框最外层);
		assertTrue(tip == null || !tip.isDisplayed());
		
		getElement(ElementEnum_MDS数据同步_332.MDS数据下载记录窗口打开查询窗口按钮).click();
		WebDriverConfiguration.operationInterval();
		a.fillSearchInfo("", "", "123", "", "全部", "", "");
		getElement(ElementEnum_MDS数据同步_332.查找参数查询按钮).click();
		WebDriverConfiguration.operationInterval();
		tip = getElement(ElementEnum_MDS数据同步_332.第一页提示框最外层);
		assertTrue(tip == null || !tip.isDisplayed());
		
		getElement(ElementEnum_MDS数据同步_332.MDS数据下载记录窗口打开查询窗口按钮).click();
		WebDriverConfiguration.operationInterval();
		a.fillSearchInfo("", "", "", "c", "全部", "", "");
		getElement(ElementEnum_MDS数据同步_332.查找参数查询按钮).click();
		WebDriverConfiguration.operationInterval();
		tip = getElement(ElementEnum_MDS数据同步_332.第一页提示框最外层);
		assertTrue(tip == null || !tip.isDisplayed());
		
		getElement(ElementEnum_MDS数据同步_332.MDS数据下载记录窗口打开查询窗口按钮).click();
		WebDriverConfiguration.operationInterval();
		a.fillSearchInfo("", "", "", "", "下载成功", "", "");
		getElement(ElementEnum_MDS数据同步_332.查找参数查询按钮).click();
		WebDriverConfiguration.operationInterval();
		tip = getElement(ElementEnum_MDS数据同步_332.第一页提示框最外层);
		assertTrue(tip == null || !tip.isDisplayed());
		
		getElement(ElementEnum_MDS数据同步_332.MDS数据下载记录窗口打开查询窗口按钮).click();
		WebDriverConfiguration.operationInterval();
		a.fillSearchInfo("", "", "", "", "下载失败", "", "");
		getElement(ElementEnum_MDS数据同步_332.查找参数查询按钮).click();
		WebDriverConfiguration.operationInterval();
		tip = getElement(ElementEnum_MDS数据同步_332.第一页提示框最外层);
		assertTrue(tip == null || !tip.isDisplayed());
		
		getElement(ElementEnum_MDS数据同步_332.MDS数据下载记录窗口打开查询窗口按钮).click();
		WebDriverConfiguration.operationInterval();
		a.fillSearchInfo("", "", "", "", "下载警告", "", "");
		getElement(ElementEnum_MDS数据同步_332.查找参数查询按钮).click();
		WebDriverConfiguration.operationInterval();
		tip = getElement(ElementEnum_MDS数据同步_332.第一页提示框最外层);
		assertTrue(tip == null || !tip.isDisplayed());
		
		getElement(ElementEnum_MDS数据同步_332.MDS数据下载记录窗口打开查询窗口按钮).click();
		WebDriverConfiguration.operationInterval();
		a.fillSearchInfo("", "", "", "c", "全部", "16年03月09日 16:01:42", "");
		getElement(ElementEnum_MDS数据同步_332.查找参数查询按钮).click();
		WebDriverConfiguration.operationInterval();
		tip = getElement(ElementEnum_MDS数据同步_332.第一页提示框最外层);
		assertTrue(tip == null || !tip.isDisplayed());
		
		getElement(ElementEnum_MDS数据同步_332.MDS数据下载记录窗口打开查询窗口按钮).click();
		WebDriverConfiguration.operationInterval();
		a.fillSearchInfo("", "", "", "c", "全部", "", "16年04月12日 16:02:58");
		getElement(ElementEnum_MDS数据同步_332.查找参数查询按钮).click();
		WebDriverConfiguration.operationInterval();
		tip = getElement(ElementEnum_MDS数据同步_332.第一页提示框最外层);
		assertTrue(tip == null || !tip.isDisplayed());
		
		getElement(ElementEnum_MDS数据同步_332.MDS数据下载记录窗口打开查询窗口按钮).click();
		WebDriverConfiguration.operationInterval();
		a.fillSearchInfo("admin", "CA_5_13182570", "1", "c", "下载成功", "16年03月09日 16:01:42", "16年04月12日 16:02:58");
		getElement(ElementEnum_MDS数据同步_332.查找参数重置按钮).click();
		WebDriverConfiguration.operationInterval();
		assertEquals(getElement(ElementEnum_MDS数据同步_332.查找参数名称输入框).getText(), "");
		
		WebDriverConfiguration.operationInterval();
		a.fillSearchInfo("admin", "CA_5_13182570", "1", "c", "下载成功", "16年03月09日 16:01:42", "16年04月12日 16:02:58");
		getElement(ElementEnum_MDS数据同步_332.查找参数关闭按钮).click();
		WebDriverConfiguration.operationInterval();
		// 再次打开以确认是否正常关闭
		getElement(ElementEnum_MDS数据同步_332.下载记录按钮).click();
		WebDriverConfiguration.operationInterval();
		
	}

	
	public String getDescription(){
		return "测试用例id: 3335\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: MDS数据同步(#332)\n"
				+" 用例名称: 验证MDS数据下载记录能否查看-正常操作-打开查询窗口按钮\n"
				+" 前置条件: 1.有CAMDS帐号，拥有MDS数据同步的菜单权限。 2.能够正确进入MDS数据同步界面\n"
				+" 测试步骤->1. 点击下载记录按钮\n"
				+" 测试预期->1. 跳出新页面，含有MDS数据下载记录信息和各个功能按钮。\n"
				+" 测试步骤->2. 点击右上角的打开查询窗口\n"
				+" 测试预期->2. 跳出新页面，含有需要填写的各项查找参数信息。\n"
				+" 测试步骤->3. 填写操作员为admin4，点击查询按钮\n"
				+" 测试预期->3. 页面查询到所有数据中，操作员为admin4的数据。\n"
				+" 测试步骤->4. 填写操作员为admin，点击查询按钮\n"
				+" 测试预期->4. 页面查询到所有数据中，操作员字段中含有admin的数据。\n"
				+" 测试步骤->5. 填写操作员为空，ID为CA，点击查询按钮\n"
				+" 测试预期->5. 页面出现提示信息：未查询到相关信息。\n"
				+" 测试步骤->6. 填写操作员为空，ID为CA_5_13182570，点击查询按钮\n"
				+" 测试预期->6. 页面查询到所有数据中，ID为CA_5_13182570的数据。\n"
				+" 测试步骤->7. 填写操作员为空，ID为空，供货编号为123，点击查询按钮\n"
				+" 测试预期->7. 页面查询到所有数据中，供货编号含有123字段的数据。\n"
				+" 测试步骤->8. 填写操作员为空，ID为空，供货编号为空，名称为c，点击查询按钮\n"
				+" 测试预期->8. 页面查询到所有数据中，名称含有c或C字段的数据。\n"
				+" 测试步骤->9. 填写操作员为空，ID为空，供货编号为空，名称为空，执行结果为下载成功，点击查询按钮\n"
				+" 测试预期->9. 页面查询到所有数据中，执行结果为下载成功的数据。\n"
				+" 测试步骤->10. 填写操作员为空，ID为空，供货编号为空，名称为空，执行结果为下载失败，点击查询按钮\n"
				+" 测试预期->10. 页面查询到所有数据中，执行结果为下载失败的数据。（数据信息显示为红色）\n"
				+" 测试步骤->11. 填写操作员为空，ID为空，供货编号为空，名称为空，执行结果为下载警告，点击查询按钮\n"
				+" 测试预期->11. 页面查询到所有数据中，执行结果为下载成功的数据。\n"
				+" 测试步骤->12. 填写操作员为空，ID为空，供货编号为空，名称为空，执行结果为全部，开始时间为16年03月09日 16:01:42，点击查询按钮\n"
				+" 测试预期->12. 页面查询到所有数据中，同步时间为选择时间之后的数据。\n"
				+" 测试步骤->13. 填写操作员为空，ID为空，供货编号为空，名称为空，执行结果为全部，开始时间为空，结束时间为16年04月12日 16:02:58，点击查询按钮\n"
				+" 测试预期->13. 页面查询到所有数据中，同步时间为选择时间之前的数据。\n"
				+" 测试步骤->14. 填写操作员为admin，ID为CA_5_13182570，供货编号为1，名称为c，执行结果为下载成功，开始时间为16年03月09日 16:01:42，结束时间为16年04月12日 16:02:58，点击查询按钮\n"
				+" 测试预期->14. 页面查询到所有数据中，操作员字段含有admin，ID为CA_5_13182570，供货编号含有字段1，名称含有字段c或C，执行结果为下载成功，同步时间为选择时间之间的数据。\n"
				+" 测试步骤->15. 填写操作员为admin，ID为CA_5_13182570，供货编号为1，名称为c，执行结果为下载成功，开始时间为16年03月09日 16:01:42，结束时间为16年04月12日 16:02:58，点击重置按钮\n"
				+" 测试预期->15. 所填入的参数均变为空\n"
				+" 测试步骤->16. 填写操作员为admin，ID为CA_5_13182570，供货编号为1，名称为c，执行结果为下载成功，开始时间为16年03月09日 16:01:42，结束时间为16年04月12日 16:02:58，点击关闭按钮\n"
				+" 测试预期->16. 页面被关闭，跳转回最初页面。\n"
;
	}

}

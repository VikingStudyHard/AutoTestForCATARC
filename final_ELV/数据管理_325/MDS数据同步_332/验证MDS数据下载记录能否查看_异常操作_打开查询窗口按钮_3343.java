package cn.edu.tju.scs.seql.final_ELV.数据管理_325.MDS数据同步_332;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3343
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: MDS数据同步(#332)
 * 用例名称: 验证MDS数据下载记录能否查看-异常操作-打开查询窗口按钮
 * 前置条件: 1.有CAMDS帐号，拥有MDS数据同步的菜单权限。
 *         2.能够正确进入MDS数据同步界面
 * 测试步骤->1. 点击下载记录按钮
 * 测试预期->1. 跳出新页面，含有MDS数据下载记录信息和各个功能按钮。
 * 测试步骤->2. 点击右上角的打开查询窗口
 * 测试预期->2. 跳出新页面，含有需要填写的各项查找参数信息。
 * 测试步骤->3. 填写操作员为管理员1，ID为CA_5_13182570，点击查询按钮
 * 测试预期->3. 页面出现提示信息：未查询到相关信息。
 * 测试步骤->4. 填写操作员为管理员1，ID为空，供货编号为111111，点击查询按钮
 * 测试预期->4. 页面出现提示信息：未查询到相关信息。
 * 测试步骤->5. 填写操作员为管理员1，ID为CA_5_13182570，供货编号为空，执行结果为下载成功，点击查询按钮
 * 测试预期->5. 页面出现提示信息：未查询到相关信息。
 * 测试步骤->6. 填写操作员为空，ID为空，供货编号为空，名称为空，执行结果为全部，开始时间为16年06月02日 16:11:16，结束时间为16年04月12日 16:02:58，点击查询按钮
 * 测试预期->6. 页面出现提示信息：开始时间早于结束时间。
 * 测试步骤->7. 填写操作员为空，ID为空，供货编号为空，名称为空，执行结果为全部，开始时间为16年06月02日 16:11:16，结束时间为16年06月02日 16:11:16，点击查询按钮
 * 测试预期->7. 页面出现提示信息：未查询到相关信息。
 * 测试步骤->8. 填写操作员为空，ID为空，供货编号为空，名称为空，执行结果为全部，开始时间为12年09月05日 16:12:17，结束时间为17年06月28日 16:12:20，点击查询按钮
 * 测试预期->8. 页面查询到所有数据中，同步时间为选择时间之间的数据。
 * 
 */

public class 验证MDS数据下载记录能否查看_异常操作_打开查询窗口按钮_3343 extends Selenium_Test_Base {
	
	public 验证MDS数据下载记录能否查看_异常操作_打开查询窗口按钮_3343(){
		super();
	}
	
	public 验证MDS数据下载记录能否查看_异常操作_打开查询窗口按钮_3343(WebDriver driver){
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
		a.fillSearchInfo("管理员1", "CA_5_13182570", "", "", "全部", "", "");
		getElement(ElementEnum_MDS数据同步_332.查找参数查询按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("没有查询到相关数据");
		
		getElement(ElementEnum_MDS数据同步_332.MDS数据下载记录窗口打开查询窗口按钮).click();
		WebDriverConfiguration.operationInterval();
		a.fillSearchInfo("管理员1", "", "111111", "", "全部", "", "");
		getElement(ElementEnum_MDS数据同步_332.查找参数查询按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("没有查询到相关数据");
		
		getElement(ElementEnum_MDS数据同步_332.MDS数据下载记录窗口打开查询窗口按钮).click();
		WebDriverConfiguration.operationInterval();
		a.fillSearchInfo("管理员1", "CA_5_13182570", "", "", "下载成功", "", "");
		getElement(ElementEnum_MDS数据同步_332.查找参数查询按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("没有查询到相关数据");
		
		
		getElement(ElementEnum_MDS数据同步_332.MDS数据下载记录窗口打开查询窗口按钮).click();
		WebDriverConfiguration.operationInterval();
		a.fillSearchInfo("", "", "", "", "全部", "16年06月02日 16:11:16", "16年04月12日 16:02:58");
		getElement(ElementEnum_MDS数据同步_332.查找参数查询按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("开始时间早于结束时间");
		
		
		WebDriverConfiguration.operationInterval();
		a.fillSearchInfo("", "", "", "", "全部", "16年06月02日 16:11:16", "16年06月02日 16:11:16");
		getElement(ElementEnum_MDS数据同步_332.查找参数查询按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("没有查询到相关数据");
		
		getElement(ElementEnum_MDS数据同步_332.MDS数据下载记录窗口打开查询窗口按钮).click();
		WebDriverConfiguration.operationInterval();
		a.fillSearchInfo("", "", "", "", "全部", "12年09月05日 16:12:17", "17年06月28日 16:12:20");
		getElement(ElementEnum_MDS数据同步_332.查找参数查询按钮).click();
		WebDriverConfiguration.operationInterval();
		
	}

	
	public String getDescription(){
		return "测试用例id: 3343\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: MDS数据同步(#332)\n"
				+" 用例名称: 验证MDS数据下载记录能否查看-异常操作-打开查询窗口按钮\n"
				+" 前置条件: 1.有CAMDS帐号，拥有MDS数据同步的菜单权限。 2.能够正确进入MDS数据同步界面\n"
				+" 测试步骤->1. 点击下载记录按钮\n"
				+" 测试预期->1. 跳出新页面，含有MDS数据下载记录信息和各个功能按钮。\n"
				+" 测试步骤->2. 点击右上角的打开查询窗口\n"
				+" 测试预期->2. 跳出新页面，含有需要填写的各项查找参数信息。\n"
				+" 测试步骤->3. 填写操作员为管理员1，ID为CA_5_13182570，点击查询按钮\n"
				+" 测试预期->3. 页面出现提示信息：未查询到相关信息。\n"
				+" 测试步骤->4. 填写操作员为管理员1，ID为空，供货编号为111111，点击查询按钮\n"
				+" 测试预期->4. 页面出现提示信息：未查询到相关信息。\n"
				+" 测试步骤->5. 填写操作员为管理员1，ID为CA_5_13182570，供货编号为空，执行结果为下载成功，点击查询按钮\n"
				+" 测试预期->5. 页面出现提示信息：未查询到相关信息。\n"
				+" 测试步骤->6. 填写操作员为空，ID为空，供货编号为空，名称为空，执行结果为全部，开始时间为16年06月02日 16:11:16，结束时间为16年04月12日 16:02:58，点击查询按钮\n"
				+" 测试预期->6. 页面出现提示信息：开始时间早于结束时间。\n"
				+" 测试步骤->7. 填写操作员为空，ID为空，供货编号为空，名称为空，执行结果为全部，开始时间为16年06月02日 16:11:16，结束时间为16年06月02日 16:11:16，点击查询按钮\n"
				+" 测试预期->7. 页面出现提示信息：未查询到相关信息。\n"
				+" 测试步骤->8. 填写操作员为空，ID为空，供货编号为空，名称为空，执行结果为全部，开始时间为12年09月05日 16:12:17，结束时间为17年06月28日 16:12:20，点击查询按钮\n"
				+" 测试预期->8. 页面查询到所有数据中，同步时间为选择时间之间的数据。\n"
;
	}

}

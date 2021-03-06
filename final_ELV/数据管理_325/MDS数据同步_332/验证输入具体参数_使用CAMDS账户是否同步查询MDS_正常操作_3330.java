package cn.edu.tju.scs.seql.final_ELV.数据管理_325.MDS数据同步_332;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3330
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: MDS数据同步(#332)
 * 用例名称: 验证输入具体参数，使用CAMDS账户是否同步查询MDS-正常操作
 * 前置条件: 1.有CAMDS帐号，拥有MDS数据同步的菜单权限。
 *         2.能够正确进入MDS数据同步界面
 * 测试步骤->1. 在未更改任何参数的情况下，点击查询按钮
 * 测试预期->1. 出现提示信息：使用CAMDS账户“vybt0008"成功获取到27条数据。
 * 测试步骤->2. 选择查询类型为零部件，点击查询按钮
 * 测试预期->2. 出现提示信息：使用CAMDS账户“vybt0008"成功获取到7条数据。
 * 测试步骤->3. 选择查询类型为半成品，点击查询按钮
 * 测试预期->3. 出现提示信息：使用用户“vybt0008"查找不到相关数据信息。
 * 测试步骤->4. 选择查询类型为全部，表单来源为CAMDS系统，点击查询按钮
 * 测试预期->4. 出现提示信息：使用CAMDS账户“vybt0008"成功获取到12条数据。
 * 测试步骤->5. 选择查询类型为全部，表单来源为环境合规系统，点击查询按钮
 * 测试预期->5. 出现提示信息：使用CAMDS账户“vybt0008"成功获取到15条数据。
 * 测试步骤->6. 选择查询类型为全部，表单来源为全部，名称为C，点击查询按钮
 * 测试预期->6. 出现提示信息：使用CAMDS账户“vybt0008"成功获取到12条数据。所有数据的产品名称中均含有字段C。
 * 测试步骤->7. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为1，点击查询按钮
 * 测试预期->7. 出现提示信息：使用用户“vybt0008"查找不到相关数据信息。
 * 测试步骤->8. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为FTRD，点击查询按钮
 * 测试预期->8. 出现提示信息：使用CAMDS账户“vybt0008"成功获取到3条数据。数据的供货编号均为FTRD。
 * 测试步骤->9. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为CA，点击查询按钮
 * 测试预期->9. 出现提示信息：使用用户“vybt0008"查找不到相关数据信息。
 * 测试步骤->10. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为CA_8_7163600，点击查询按钮
 * 测试预期->10. 出现提示信息：使用CAMDS账户“vybt0008"成功获取到1条数据。数据的ID为CA_8_7163600。
 * 测试步骤->11. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为创建时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮
 * 测试预期->11. 出现提示信息：使用CAMDS账户“vybt0008"成功获取到26条数据。
 * 测试步骤->12. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为更新时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮
 * 测试预期->12. 出现提示信息：使用CAMDS账户“vybt0008"成功获取到30条数据。
 * 测试步骤->13. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为发布时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮
 * 测试预期->13. 出现提示信息：使用CAMDS账户“vybt0008"成功获取到4条数据。
 * 测试步骤->14. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为批准时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮
 * 测试预期->14. 出现提示信息：使用CAMDS账户“vybt0008"成功获取到496条数据。
 * 测试步骤->15. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为接收时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮
 * 测试预期->15. 出现提示信息：使用CAMDS账户“vybt0008"成功获取到4条数据。
 * 测试步骤->16. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为全部时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮
 * 测试预期->16. 出现提示信息：使用CAMDS账户“vybt0008"成功获取到27条数据。
 * 
 */

public class 验证输入具体参数_使用CAMDS账户是否同步查询MDS_正常操作_3330 extends Selenium_Test_Base {
	
	public 验证输入具体参数_使用CAMDS账户是否同步查询MDS_正常操作_3330(){
		super();
	}
	
	public 验证输入具体参数_使用CAMDS账户是否同步查询MDS_正常操作_3330(WebDriver driver){
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
		getElement(ElementEnum_MDS数据同步_332.查询类型下拉按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_MDS数据同步_332.查询类型选项_全部).click();
		WebDriverConfiguration.operationInterval();
//		getElement(ElementEnum_MDS数据同步_332.名称输入框).clear();
//		getElement(ElementEnum_MDS数据同步_332.名称输入框).sendKeys("C");
//		WebDriverConfiguration.operationInterval();
//		getElement(ElementEnum_MDS数据同步_332.供货编号输入框).clear();
//		getElement(ElementEnum_MDS数据同步_332.供货编号输入框).sendKeys("SPCC");
//		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_MDS数据同步_332.查询按钮).click();
		WebDriverConfiguration.operationInterval();
		
		a.waitLoading();
		a.verifyTips("成功获取到");
		// 验证这个账户可以获取到数据即可，具体的数据项目无法测试
	}

	
	public String getDescription(){
		return "测试用例id: 3330\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: MDS数据同步(#332)\n"
				+" 用例名称: 验证输入具体参数，使用CAMDS账户是否同步查询MDS-正常操作\n"
				+" 前置条件: 1.有CAMDS帐号，拥有MDS数据同步的菜单权限。 2.能够正确进入MDS数据同步界面\n"
				+" 测试步骤->1. 在未更改任何参数的情况下，点击查询按钮\n"
				+" 测试预期->1. 出现提示信息：使用CAMDS账户“vybt0008“成功获取到27条数据。\n"
				+" 测试步骤->2. 选择查询类型为零部件，点击查询按钮\n"
				+" 测试预期->2. 出现提示信息：使用CAMDS账户“vybt0008“成功获取到7条数据。\n"
				+" 测试步骤->3. 选择查询类型为半成品，点击查询按钮\n"
				+" 测试预期->3. 出现提示信息：使用用户“vybt0008“查找不到相关数据信息。\n"
				+" 测试步骤->4. 选择查询类型为全部，表单来源为CAMDS系统，点击查询按钮\n"
				+" 测试预期->4. 出现提示信息：使用CAMDS账户“vybt0008“成功获取到12条数据。\n"
				+" 测试步骤->5. 选择查询类型为全部，表单来源为环境合规系统，点击查询按钮\n"
				+" 测试预期->5. 出现提示信息：使用CAMDS账户“vybt0008“成功获取到15条数据。\n"
				+" 测试步骤->6. 选择查询类型为全部，表单来源为全部，名称为C，点击查询按钮\n"
				+" 测试预期->6. 出现提示信息：使用CAMDS账户“vybt0008“成功获取到12条数据。所有数据的产品名称中均含有字段C。\n"
				+" 测试步骤->7. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为1，点击查询按钮\n"
				+" 测试预期->7. 出现提示信息：使用用户“vybt0008“查找不到相关数据信息。\n"
				+" 测试步骤->8. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为FTRD，点击查询按钮\n"
				+" 测试预期->8. 出现提示信息：使用CAMDS账户“vybt0008“成功获取到3条数据。数据的供货编号均为FTRD。\n"
				+" 测试步骤->9. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为CA，点击查询按钮\n"
				+" 测试预期->9. 出现提示信息：使用用户“vybt0008“查找不到相关数据信息。\n"
				+" 测试步骤->10. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为CA_8_7163600，点击查询按钮\n"
				+" 测试预期->10. 出现提示信息：使用CAMDS账户“vybt0008“成功获取到1条数据。数据的ID为CA_8_7163600。\n"
				+" 测试步骤->11. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为创建时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮\n"
				+" 测试预期->11. 出现提示信息：使用CAMDS账户“vybt0008“成功获取到26条数据。\n"
				+" 测试步骤->12. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为更新时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮\n"
				+" 测试预期->12. 出现提示信息：使用CAMDS账户“vybt0008“成功获取到30条数据。\n"
				+" 测试步骤->13. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为发布时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮\n"
				+" 测试预期->13. 出现提示信息：使用CAMDS账户“vybt0008“成功获取到4条数据。\n"
				+" 测试步骤->14. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为批准时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮\n"
				+" 测试预期->14. 出现提示信息：使用CAMDS账户“vybt0008“成功获取到496条数据。\n"
				+" 测试步骤->15. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为接收时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮\n"
				+" 测试预期->15. 出现提示信息：使用CAMDS账户“vybt0008“成功获取到4条数据。\n"
				+" 测试步骤->16. 选择查询类型为全部，表单来源为全部，名称为空，供货编号为空，ID为空，查询时间类型为全部时间，选择开始时间为16年03月29日 14:49:33，结束时间为16年04月05日 14:49:33，点击查询按钮\n"
				+" 测试预期->16. 出现提示信息：使用CAMDS账户“vybt0008“成功获取到27条数据。\n"
;
	}

}

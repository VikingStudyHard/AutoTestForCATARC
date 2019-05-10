package cn.edu.tju.scs.seql.final_ELV.数据管理_325.材料数据管理_333;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3398
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 材料数据管理(#333)
 * 用例名称: 验证查询MDS材料数据信息的导入按钮是否正常工作
 * 前置条件: 拥有MDS材料数据信息的权限
 * 测试步骤->1. 点击导入按钮
 * 测试预期->1. 跳出新页面，新页面标题为上传MDS
 * 测试步骤->2. 点击新页面中的提交按钮
 * 测试预期->2. 出现提示信息：未指定文件！
 * 测试步骤->3. 点击新页面中的取消按钮
 * 测试预期->3. 页面被关闭，回到材料数据管理首页面。
 * 测试步骤->4. 点击导入按钮
 * 测试预期->4. 跳出新页面，新页面标题为上传MDS
 * 测试步骤->5. 点击页面右上角的关闭按钮
 * 测试预期->5. 页面被关闭，回到材料数据管理首页面。
 * 测试步骤->6. 点击导入按钮
 * 测试预期->6. 跳出新页面，新页面标题为上传MDS
 * 测试步骤->7. 点击浏览按钮
 * 测试预期->7. 跳出新页面，新页面为电脑本地可选上传文件
 * 测试步骤->8. 选择某一.doc文件，点击确定
 * 测试预期->8. .doc文件路径被复制到上传页面的选择框中，同时框被标记为红色
 * 测试步骤->9. 点击页面中的提交按钮
 * 测试预期->9. 出现提示信息：上传文件类型错误！
 * 测试步骤->10. 选择某一.pdf文件，点击确定
 * 测试预期->10. .pdf文件路径被复制到上传页面的选择框中，同时框被标记为红色
 * 测试步骤->11. 点击页面中的提交按钮
 * 测试预期->11. 出现提示信息：上传文件类型错误！
 * 测试步骤->12. 选择某一.txt文件，点击确定
 * 测试预期->12. .txt文件路径被复制到上传页面的选择框中，同时框被标记为红色
 * 测试步骤->13. 点击页面中的提交按钮
 * 测试预期->13. 出现提示信息：上传文件类型错误！
 * 测试步骤->14. 选择某一.csv文件，点击确定
 * 测试预期->14. .csv文件路径被复制到上传页面的选择框中
 * 测试步骤->15. 点击页面中的提交按钮
 * 测试预期->15. 出现提示信息：上传成功！
 * 测试步骤->16. 点击提示信息的确定按钮
 * 测试预期->16. 材料数据页面新增一条上传的数据信息，信息MDS状态为已提交，审核状态为待审核
 * 
 */

public class 验证查询MDS材料数据信息的导入按钮是否正常工作_3398 extends Selenium_Test_Base {
	
	public 验证查询MDS材料数据信息的导入按钮是否正常工作_3398(){
		super();
	}
	
	public 验证查询MDS材料数据信息的导入按钮是否正常工作_3398(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_材料数据管理_333.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_材料数据管理_333.rightFrame);
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
//		getElement(ElementEnum_材料数据管理_333.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_材料数据管理_333.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		CommonOperations_材料数据管理_333 a = new CommonOperations_材料数据管理_333(driver);
		getElement(ElementEnum_材料数据管理_333.导入按钮).click();
		WebDriverConfiguration.operationInterval();
		String title = getElement(ElementEnum_材料数据管理_333.上传MDS窗口窗口标题).getText();
		assertTrue(title.contains("上传MDS"));
		
		getElement(ElementEnum_材料数据管理_333.上传MDS窗口提交按钮).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("未指定文件");
		
		getElement(ElementEnum_材料数据管理_333.上传MDS窗口取消按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_材料数据管理_333.导入按钮).click();
		WebDriverConfiguration.operationInterval();
		assertTrue(title.contains("上传MDS"));
		
		// 后续操作涉及上传操作，无法继续进行测试
	}

	
	public String getDescription(){
		return "测试用例id: 3398\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 材料数据管理(#333)\n"
				+" 用例名称: 验证查询MDS材料数据信息的导入按钮是否正常工作\n"
				+" 前置条件: 拥有MDS材料数据信息的权限\n"
				+" 测试步骤->1. 点击导入按钮\n"
				+" 测试预期->1. 跳出新页面，新页面标题为上传MDS\n"
				+" 测试步骤->2. 点击新页面中的提交按钮\n"
				+" 测试预期->2. 出现提示信息：未指定文件！\n"
				+" 测试步骤->3. 点击新页面中的取消按钮\n"
				+" 测试预期->3. 页面被关闭，回到材料数据管理首页面。\n"
				+" 测试步骤->4. 点击导入按钮\n"
				+" 测试预期->4. 跳出新页面，新页面标题为上传MDS\n"
				+" 测试步骤->5. 点击页面右上角的关闭按钮\n"
				+" 测试预期->5. 页面被关闭，回到材料数据管理首页面。\n"
				+" 测试步骤->6. 点击导入按钮\n"
				+" 测试预期->6. 跳出新页面，新页面标题为上传MDS\n"
				+" 测试步骤->7. 点击浏览按钮\n"
				+" 测试预期->7. 跳出新页面，新页面为电脑本地可选上传文件\n"
				+" 测试步骤->8. 选择某一.doc文件，点击确定\n"
				+" 测试预期->8. .doc文件路径被复制到上传页面的选择框中，同时框被标记为红色\n"
				+" 测试步骤->9. 点击页面中的提交按钮\n"
				+" 测试预期->9. 出现提示信息：上传文件类型错误！\n"
				+" 测试步骤->10. 选择某一.pdf文件，点击确定\n"
				+" 测试预期->10. .pdf文件路径被复制到上传页面的选择框中，同时框被标记为红色\n"
				+" 测试步骤->11. 点击页面中的提交按钮\n"
				+" 测试预期->11. 出现提示信息：上传文件类型错误！\n"
				+" 测试步骤->12. 选择某一.txt文件，点击确定\n"
				+" 测试预期->12. .txt文件路径被复制到上传页面的选择框中，同时框被标记为红色\n"
				+" 测试步骤->13. 点击页面中的提交按钮\n"
				+" 测试预期->13. 出现提示信息：上传文件类型错误！\n"
				+" 测试步骤->14. 选择某一.csv文件，点击确定\n"
				+" 测试预期->14. .csv文件路径被复制到上传页面的选择框中\n"
				+" 测试步骤->15. 点击页面中的提交按钮\n"
				+" 测试预期->15. 出现提示信息：上传成功！\n"
				+" 测试步骤->16. 点击提示信息的确定按钮\n"
				+" 测试预期->16. 材料数据页面新增一条上传的数据信息，信息MDS状态为已提交，审核状态为待审核\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.数据管理_325.材料数据创建_335;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3516
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 材料数据创建(#335)
 * 用例名称: 验证材料数据创建中的材料创建是否可以实现-表单内操作
 * 前置条件: 拥有MDS材料数据创建的权限
 * 测试步骤->1. 点击页面右侧对应序号3中的创建动作按钮
 * 测试预期->1. 跳出新页面，页面标题为材料分类表单，页面包含材料数据的各项信息内容。
 * 测试步骤->2. 勾选任意一条数据，点击页面左下方的下一步按钮
 * 测试预期->2. 跳出新页面，页面标题为编辑的材料数据表，页面包含需要填写的材料数据的各项信息。
 * 测试步骤->3. 修改页面右侧的材料名称为：材料_test，点击页面右下角的保存按钮
 * 测试预期->3. 出现提示信息：保存成功
 * 测试步骤->4. 点击右下角下一步按钮
 * 测试预期->4. 出现提示信息：请先通过数据校验！
 * 测试步骤->5. 点击左下角的校验按钮
 * 测试预期->5. 跳出新页面，页面标题为校验结果，页面包含校验结果的各项信息。
 * 测试步骤->6. 点击新出页面右上角的查看明细按钮
 * 测试预期->6. 出现提示信息：请选择一个MDS！
 * 测试步骤->7. 勾选一项内容，点击查看明细按钮
 * 测试预期->7. 跳出新页面，包含可产看的各项内容。
 * 测试步骤->8. 点击新出页面右上角的查看明细按钮
 * 测试预期->8. 出现提示信息：请选择一个MDS！
 * 测试步骤->9. 勾选一项可查看内容，点击新出页面右上角的产看明细按钮
 * 测试预期->9. 新出的两个页面被关闭，跳转至编辑的材料数据表页面，请稍等字样的进度条持续旋转，然后跳转至编辑的材料数据表页面。
 * 
 */

public class 验证材料数据创建中的材料创建是否可以实现_表单内操作_3516 extends Selenium_Test_Base {
	
	public 验证材料数据创建中的材料创建是否可以实现_表单内操作_3516(){
		super();
	}
	
	public 验证材料数据创建中的材料创建是否可以实现_表单内操作_3516(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_材料数据创建_335.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_材料数据创建_335.rightFrame);
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
//		getElement(ElementEnum_基础数据同步_331.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_材料数据创建_335.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_材料数据创建_335.材料创建按钮).click();
		WebDriverConfiguration.operationInterval();
		// 该功能操作复杂，不适合使用自动化测试
		
	}

	
	public String getDescription(){
		return "测试用例id: 3516\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 材料数据创建(#335)\n"
				+" 用例名称: 验证材料数据创建中的材料创建是否可以实现-表单内操作\n"
				+" 前置条件: 拥有MDS材料数据创建的权限\n"
				+" 测试步骤->1. 点击页面右侧对应序号3中的创建动作按钮\n"
				+" 测试预期->1. 跳出新页面，页面标题为材料分类表单，页面包含材料数据的各项信息内容。\n"
				+" 测试步骤->2. 勾选任意一条数据，点击页面左下方的下一步按钮\n"
				+" 测试预期->2. 跳出新页面，页面标题为编辑的材料数据表，页面包含需要填写的材料数据的各项信息。\n"
				+" 测试步骤->3. 修改页面右侧的材料名称为：材料_test，点击页面右下角的保存按钮\n"
				+" 测试预期->3. 出现提示信息：保存成功\n"
				+" 测试步骤->4. 点击右下角下一步按钮\n"
				+" 测试预期->4. 出现提示信息：请先通过数据校验！\n"
				+" 测试步骤->5. 点击左下角的校验按钮\n"
				+" 测试预期->5. 跳出新页面，页面标题为校验结果，页面包含校验结果的各项信息。\n"
				+" 测试步骤->6. 点击新出页面右上角的查看明细按钮\n"
				+" 测试预期->6. 出现提示信息：请选择一个MDS！\n"
				+" 测试步骤->7. 勾选一项内容，点击查看明细按钮\n"
				+" 测试预期->7. 跳出新页面，包含可产看的各项内容。\n"
				+" 测试步骤->8. 点击新出页面右上角的查看明细按钮\n"
				+" 测试预期->8. 出现提示信息：请选择一个MDS！\n"
				+" 测试步骤->9. 勾选一项可查看内容，点击新出页面右上角的产看明细按钮\n"
				+" 测试预期->9. 新出的两个页面被关闭，跳转至编辑的材料数据表页面，请稍等字样的进度条持续旋转，然后跳转至编辑的材料数据表页面。\n"
;
	}

}

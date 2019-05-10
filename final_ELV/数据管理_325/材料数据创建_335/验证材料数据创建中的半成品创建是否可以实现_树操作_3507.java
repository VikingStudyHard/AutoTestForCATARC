package cn.edu.tju.scs.seql.final_ELV.数据管理_325.材料数据创建_335;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 3507
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 材料数据创建(#335)
 * 用例名称: 验证材料数据创建中的半成品创建是否可以实现-树操作
 * 前置条件: 拥有MDS材料数据创建的权限
 * 测试步骤->1. 点击页面左下方的查找树按钮
 * 测试预期->1. 跳出新页面，页面标题为查找树，包含查找所需要填写的各项内容
 * 测试步骤->2. 点击新页面右上方的关闭按钮
 * 测试预期->2. 新页面被关闭，页面无其他反应
 * 测试步骤->3. 点击页面左下方的查找树按钮
 * 测试预期->3. 跳出新页面，页面标题为查找树，包含查找所需要填写的各项内容
 * 测试步骤->4. 点击新页面的取消按钮
 * 测试预期->4. 新页面被关闭，页面无其他反应
 * 测试步骤->5. 点击新页面的查找按钮
 * 测试预期->5. 页面无反应
 * 测试步骤->6. 在树操作的新页面的名称填写框填写test，点击查找按钮
 * 测试预期->6. 树操作页面关闭，原页面左侧树形图中名称含有test字段的部件或材料被标识
 * 测试步骤->7. 在树操作的新页面的部件号填写框填写123，点击查找按钮
 * 测试预期->7. 新页面被关闭，页面无其他反应
 * 测试步骤->8. 在树操作的新页面的部件号填写框填写639，点击查找按钮
 * 测试预期->8. 树操作页面关闭，原页面左侧树形图中部件号为639的部件或材料被标识
 * 测试步骤->9. 在树操作的新页面的ID填写框填写EM_5_1857609，点击查找按钮
 * 测试预期->9. 树操作页面关闭，原页面左侧树形图中ID号为EM_5_1857609的部件或材料被标识
 * 测试步骤->10. 在树操作的新页面的ID填写框填写EM，点击查找按钮
 * 测试预期->10. 新页面被关闭，页面无其他反应
 * 测试步骤->11. 在树操作的新页面的名称填写框填写t，ID填写框填写EM_5_1857609，点击查找按钮
 * 测试预期->11. 左侧树形图中名称中含有t字段，ID号为EM_5_1857609的部件或材料被标识
 * 
 */

public class 验证材料数据创建中的半成品创建是否可以实现_树操作_3507 extends Selenium_Test_Base {
	
	public 验证材料数据创建中的半成品创建是否可以实现_树操作_3507(){
		super();
	}
	
	public 验证材料数据创建中的半成品创建是否可以实现_树操作_3507(WebDriver driver){
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
		getElement(ElementEnum_材料数据创建_335.半成品创建按钮).click();
		WebDriverConfiguration.operationInterval();
		// 该功能操作复杂，不适合使用自动化测试
		
	}

	
	public String getDescription(){
		return "测试用例id: 3507\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 材料数据创建(#335)\n"
				+" 用例名称: 验证材料数据创建中的半成品创建是否可以实现-树操作\n"
				+" 前置条件: 拥有MDS材料数据创建的权限\n"
				+" 测试步骤->1. 点击页面左下方的查找树按钮\n"
				+" 测试预期->1. 跳出新页面，页面标题为查找树，包含查找所需要填写的各项内容\n"
				+" 测试步骤->2. 点击新页面右上方的关闭按钮\n"
				+" 测试预期->2. 新页面被关闭，页面无其他反应\n"
				+" 测试步骤->3. 点击页面左下方的查找树按钮\n"
				+" 测试预期->3. 跳出新页面，页面标题为查找树，包含查找所需要填写的各项内容\n"
				+" 测试步骤->4. 点击新页面的取消按钮\n"
				+" 测试预期->4. 新页面被关闭，页面无其他反应\n"
				+" 测试步骤->5. 点击新页面的查找按钮\n"
				+" 测试预期->5. 页面无反应\n"
				+" 测试步骤->6. 在树操作的新页面的名称填写框填写test，点击查找按钮\n"
				+" 测试预期->6. 树操作页面关闭，原页面左侧树形图中名称含有test字段的部件或材料被标识\n"
				+" 测试步骤->7. 在树操作的新页面的部件号填写框填写123，点击查找按钮\n"
				+" 测试预期->7. 新页面被关闭，页面无其他反应\n"
				+" 测试步骤->8. 在树操作的新页面的部件号填写框填写639，点击查找按钮\n"
				+" 测试预期->8. 树操作页面关闭，原页面左侧树形图中部件号为639的部件或材料被标识\n"
				+" 测试步骤->9. 在树操作的新页面的ID填写框填写EM_5_1857609，点击查找按钮\n"
				+" 测试预期->9. 树操作页面关闭，原页面左侧树形图中ID号为EM_5_1857609的部件或材料被标识\n"
				+" 测试步骤->10. 在树操作的新页面的ID填写框填写EM，点击查找按钮\n"
				+" 测试预期->10. 新页面被关闭，页面无其他反应\n"
				+" 测试步骤->11. 在树操作的新页面的名称填写框填写t，ID填写框填写EM_5_1857609，点击查找按钮\n"
				+" 测试预期->11. 左侧树形图中名称中含有t字段，ID号为EM_5_1857609的部件或材料被标识\n"
;
	}

}

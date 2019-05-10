package cn.edu.tju.scs.seql.final_ELV.数据管理_325.材料数据创建_335;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 13077
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 材料数据创建(#335)
 * 用例名称: 验证材料数据创建中的零部件创建添加部件功能
 * 前置条件: 能正确进入材料数据管理界面
 * 测试步骤->1. 点击序号为1的零部件右侧的创建按钮
 * 测试预期->1. 跳转至创建零部件页面
 * 测试步骤->2. 点击页面左上方的添加零部件按钮
 * 测试预期->2. 成功在零部件下方添加一零部件
 * 测试步骤->3. 再次点击左上方添加材料按钮
 * 测试预期->3. 跳转至选择材料按钮
 * 测试步骤->4. 点击检索按钮，任意选择一个材料，点击添加按钮
 * 测试预期->4. 页面提示添加失败：“同级节点类型必须保持一致”
 * 测试步骤->5. 再次点击左上方添加半成品按钮
 * 测试预期->5. 页面提示添加失败：“同级节点类型必须保持一致”
 * 
 */

public class 验证材料数据创建中的零部件创建添加部件功能_13077 extends Selenium_Test_Base {
	
	public 验证材料数据创建中的零部件创建添加部件功能_13077(){
		super();
	}
	
	public 验证材料数据创建中的零部件创建添加部件功能_13077(WebDriver driver){
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
		getElement(ElementEnum_材料数据创建_335.零部件创建按钮).click();
		WebDriverConfiguration.operationInterval();
		// 该功能操作复杂，不适合使用自动化测试
		
	}

	
	public String getDescription(){
		return "测试用例id: 13077\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 材料数据创建(#335)\n"
				+" 用例名称: 验证材料数据创建中的零部件创建添加部件功能\n"
				+" 前置条件: 能正确进入材料数据管理界面\n"
				+" 测试步骤->1. 点击序号为1的零部件右侧的创建按钮\n"
				+" 测试预期->1. 跳转至创建零部件页面\n"
				+" 测试步骤->2. 点击页面左上方的添加零部件按钮\n"
				+" 测试预期->2. 成功在零部件下方添加一零部件\n"
				+" 测试步骤->3. 再次点击左上方添加材料按钮\n"
				+" 测试预期->3. 跳转至选择材料按钮\n"
				+" 测试步骤->4. 点击检索按钮，任意选择一个材料，点击添加按钮\n"
				+" 测试预期->4. 页面提示添加失败：“同级节点类型必须保持一致”\n"
				+" 测试步骤->5. 再次点击左上方添加半成品按钮\n"
				+" 测试预期->5. 页面提示添加失败：“同级节点类型必须保持一致”\n"
;
	}

}

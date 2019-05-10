package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型BOM信息_337;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;

/**
 * 测试用例id: 3654
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型BOM信息(#337)
 * 用例名称: 验证车型BOM信息功能是否可实现-新增BOM-BOM树形查找操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 单击左键选择一条是否存在BOM一栏为否的信息，点击新增BOM按钮
 * 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。
 * 测试步骤->2. 点击树形右上角的更多操作按钮，点击出现的查找树按钮
 * 测试预期->2. 出现新页面，页面为树操作的查找定位，含有可填写的参数信息
 * 测试步骤->3. 点击页面中的查找按钮
 * 测试预期->3. 出现提示信息：必须输入一项查询条件
 * 测试步骤->4. 填写查找参数中的名称为ABS，点击查找
 * 测试预期->4. 页面正常关闭，查找到名称为ABS的节点信息
 * 测试步骤->5. 填写查找参数中的部件号为5.5.1_test，点击查找
 * 测试预期->5. 页面正常关闭，查找到部件号为5.5.1_test的节点信息
 * 测试步骤->6. 填写查找参数中的ID为EM_8_1855506，点击查找
 * 测试预期->6. 页面正常关闭，查找到ID为EM_8_1855506的节点信息
 * 测试步骤->7. 填写查找参数中的名称为ABS，部件号为5.5.1_test，ID为EM_8_1855506，点击查找
 * 测试预期->7. 页面正常关闭，查找到名称为ABS，部件号为5.5.1_test，ID为EM_8_1855506的节点信息
 * 
 */

public class 验证车型BOM信息功能是否可实现_新增BOM_BOM树形查找操作_3654 extends Selenium_Test_Base {
	
	public 验证车型BOM信息功能是否可实现_新增BOM_BOM树形查找操作_3654(){
		super();
	}
	
	public 验证车型BOM信息功能是否可实现_新增BOM_BOM树形查找操作_3654(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_车型BOM信息_337.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_车型BOM信息_337.rightFrame);
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
		getElement(ElementEnum_车型BOM信息_337.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
		
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	// 检测载入界面是否完成
	public void judgeMaskLoad(){
		CommonOperationsAll a = new CommonOperationsAll(driver);
		a.judgeElementDisplayNone(ElementEnum_车型BOM信息_337.载入界面);
	}
	public void detailedOperation(){
		getElement(ElementEnum_车型BOM信息_337.车型商标输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.车型商标输入框).sendKeys("杨杨1");
		getElement(ElementEnum_车型BOM信息_337.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		//是否存在BOM一栏为否的信息???
		getElement(ElementEnum_车型BOM信息_337.检索BOM为否的行).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.新增BOM按钮).click();
		WebDriverConfiguration.operationInterval();
		judgeMaskLoad();
		
		getElement(ElementEnum_车型BOM信息_337.BOM树形更多按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.查找树按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.树操作查找按钮).click();
		WebDriverConfiguration.operationInterval();	
		Alert alert = driver.switchTo().alert();  
	    String text = alert.getText();  
	    System.out.println(text);  
	    alert.dismiss();
		//查找的数据源
		/* 测试步骤->3. 点击页面中的查找按钮
		 * 测试预期->3. 出现提示信息：必须输入一项查询条件
		 * 测试步骤->4. 填写查找参数中的名称为ABS，点击查找
		 * 测试预期->4. 页面正常关闭，查找到名称为ABS的节点信息
		 * 测试步骤->5. 填写查找参数中的部件号为5.5.1_test，点击查找
		 * 测试预期->5. 页面正常关闭，查找到部件号为5.5.1_test的节点信息
		 * 测试步骤->6. 填写查找参数中的ID为EM_8_1855506，点击查找
		 * 测试预期->6. 页面正常关闭，查找到ID为EM_8_1855506的节点信息
		 * 测试步骤->7. 填写查找参数中的名称为ABS，部件号为5.5.1_test，ID为EM_8_1855506，点击查找
		 * 测试预期->7. 页面正常关闭，查找到名称为ABS，部件号为5.5.1_test，ID为EM_8_1855506的节点信息
		 * 
		 */
		
	}

	
	public String getDescription(){
		return "测试用例id: 3654\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型BOM信息(#337)\n"
				+" 用例名称: 验证车型BOM信息功能是否可实现-新增BOM-BOM树形查找操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 单击左键选择一条是否存在BOM一栏为否的信息，点击新增BOM按钮\n"
				+" 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。\n"
				+" 测试步骤->2. 点击树形右上角的更多操作按钮，点击出现的查找树按钮\n"
				+" 测试预期->2. 出现新页面，页面为树操作的查找定位，含有可填写的参数信息\n"
				+" 测试步骤->3. 点击页面中的查找按钮\n"
				+" 测试预期->3. 出现提示信息：必须输入一项查询条件\n"
				+" 测试步骤->4. 填写查找参数中的名称为ABS，点击查找\n"
				+" 测试预期->4. 页面正常关闭，查找到名称为ABS的节点信息\n"
				+" 测试步骤->5. 填写查找参数中的部件号为5.5.1_test，点击查找\n"
				+" 测试预期->5. 页面正常关闭，查找到部件号为5.5.1_test的节点信息\n"
				+" 测试步骤->6. 填写查找参数中的ID为EM_8_1855506，点击查找\n"
				+" 测试预期->6. 页面正常关闭，查找到ID为EM_8_1855506的节点信息\n"
				+" 测试步骤->7. 填写查找参数中的名称为ABS，部件号为5.5.1_test，ID为EM_8_1855506，点击查找\n"
				+" 测试预期->7. 页面正常关闭，查找到名称为ABS，部件号为5.5.1_test，ID为EM_8_1855506的节点信息\n"
;
	}

}

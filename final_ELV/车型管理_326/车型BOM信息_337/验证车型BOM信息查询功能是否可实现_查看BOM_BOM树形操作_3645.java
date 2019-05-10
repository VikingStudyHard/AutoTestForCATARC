package cn.edu.tju.scs.seql.final_ELV.车型管理_326.车型BOM信息_337;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.禁限用物质豁免分析_347.ElementEnum_禁限用物质豁免分析_347;

/**
 * 测试用例id: 3645
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型BOM信息(#337)
 * 用例名称: 验证车型BOM信息查询功能是否可实现-查看BOM-BOM树形操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 单击左键选择一条信息，点击查看BOM按钮
 * 测试预期->1. 出现查看车型窗口，含有各项车型BOM信息。
 * 测试步骤->2. 点击BOM树形中的打开树按钮
 * 测试预期->2. BOM树形中的树形图被打开
 * 测试步骤->3. 点击BOM树形中的关闭树按钮
 * 测试预期->3. BOM树形中的树形图被关闭
 * 测试步骤->4. 点击BOM树形中的查找树按钮
 * 测试预期->4. 出现查找树界面
 * 测试步骤->5. 在树操作界面中的名称填写AEPDS5.4.2，点击查找
 * 测试预期->5. 查找到树中中文名称为AEPDS5.4.2的节点信息
 * 测试步骤->6. 在树操作界面中的ID填写CA_8_6820622，点击查找
 * 测试预期->6. 查找到树中ID为CA_8_6820622的节点信息
 * 测试步骤->7. 在树操作界面中的部件号填写AS5.4.3，点击查找
 * 测试预期->7. 查找到树中部件号为AS5.4.3的节点信息
 * 测试步骤->8. 在树操作界面中的名称填写AEPDS5.4.2，点击取消
 * 测试预期->8. 查找页面被正常关闭，其余正常显示
 * 
 */

public class 验证车型BOM信息查询功能是否可实现_查看BOM_BOM树形操作_3645 extends Selenium_Test_Base {
	
	public 验证车型BOM信息查询功能是否可实现_查看BOM_BOM树形操作_3645(){
		super();
	}
	
	public 验证车型BOM信息查询功能是否可实现_查看BOM_BOM树形操作_3645(WebDriver driver){
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
		getElement(ElementEnum_车型BOM信息_337.车型商标输入框).sendKeys("test杨杨");
		getElement(ElementEnum_车型BOM信息_337.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		//BOM为是的一栏
		getElement(ElementEnum_车型BOM信息_337.检索BOM为是的行).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.查看BOM按钮).click();
		WebDriverConfiguration.operationInterval();
		judgeMaskLoad();	
		
		getElement(ElementEnum_车型BOM信息_337.BOM树形打开按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.BOM树形关闭按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.BOM树形查找按钮).click();
		WebDriverConfiguration.operationInterval();
		//没有查找的数据源
		/*
		getElement(ElementEnum_车型BOM信息_337.树操作名称输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.树操作名称输入框).sendKeys("AEPDS5.4.2");
		getElement(ElementEnum_车型BOM信息_337.树操作查找按钮).click();
		
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_车型BOM信息_337.BOM树形查找按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.树操作ID编号输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.树操作ID编号输入框).sendKeys("CA_8_6820622");
		getElement(ElementEnum_车型BOM信息_337.树操作查找按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_车型BOM信息_337.BOM树形查找按钮).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.树操作部件号输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.树操作部件号输入框).sendKeys("AS5.4.3");
		getElement(ElementEnum_车型BOM信息_337.树操作查找按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_车型BOM信息_337.BOM树形查找按钮).click();
		WebDriverConfiguration.operationInterval();
		*/
		
		getElement(ElementEnum_车型BOM信息_337.树操作名称输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.树操作名称输入框).sendKeys("AEPDS5.4.2");
		getElement(ElementEnum_车型BOM信息_337.树操作取消按钮).click();
		WebDriverConfiguration.operationInterval();
		
		
	}

	
	public String getDescription(){
		return "测试用例id: 3645\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型BOM信息(#337)\n"
				+" 用例名称: 验证车型BOM信息查询功能是否可实现-查看BOM-BOM树形操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 单击左键选择一条信息，点击查看BOM按钮\n"
				+" 测试预期->1. 出现查看车型窗口，含有各项车型BOM信息。\n"
				+" 测试步骤->2. 点击BOM树形中的打开树按钮\n"
				+" 测试预期->2. BOM树形中的树形图被打开\n"
				+" 测试步骤->3. 点击BOM树形中的关闭树按钮\n"
				+" 测试预期->3. BOM树形中的树形图被关闭\n"
				+" 测试步骤->4. 点击BOM树形中的查找树按钮\n"
				+" 测试预期->4. 出现查找树界面\n"
				+" 测试步骤->5. 在树操作界面中的名称填写AEPDS5.4.2，点击查找\n"
				+" 测试预期->5. 查找到树中中文名称为AEPDS5.4.2的节点信息\n"
				+" 测试步骤->6. 在树操作界面中的ID填写CA_8_6820622，点击查找\n"
				+" 测试预期->6. 查找到树中ID为CA_8_6820622的节点信息\n"
				+" 测试步骤->7. 在树操作界面中的部件号填写AS5.4.3，点击查找\n"
				+" 测试预期->7. 查找到树中部件号为AS5.4.3的节点信息\n"
				+" 测试步骤->8. 在树操作界面中的名称填写AEPDS5.4.2，点击取消\n"
				+" 测试预期->8. 查找页面被正常关闭，其余正常显示\n"
;
	}

}

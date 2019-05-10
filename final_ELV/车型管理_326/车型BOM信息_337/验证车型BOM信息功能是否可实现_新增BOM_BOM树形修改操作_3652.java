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
 * 测试用例id: 3652
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型BOM信息(#337)
 * 用例名称: 验证车型BOM信息功能是否可实现-新增BOM-BOM树形修改操作
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 单击左键选择一条是否存在BOM一栏为否的信息，点击新增BOM按钮
 * 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。
 * 测试步骤->2. 在根节点条件下点击增加按钮
 * 测试预期->2. 出现新增界面，在新增界面上可填写各项信息
 * 测试步骤->3. 直接点击确定按钮
 * 测试预期->3. 弹出提示信息，供货编号不能为空
 * 测试步骤->4. 供货编号填为11，其他各项为默认值，点击确定按钮
 * 测试预期->4. 新增节点(11)增加为根节点下的第一子节点
 * 测试步骤->5. 在叶子节点条件下点击挂接按钮
 * 测试预期->5. 跳出新页面，页面可修改各项整体匹配的信息。
 * 测试步骤->6. 修改名称和供货编号为空
 * 测试预期->6. 名称和供货编号不可修改
 * 测试步骤->7. 修改质量为20，修改数量为10，责任人为test，点击确定按钮
 * 测试预期->7. 页面被正常关闭，所更改内容更新为修改后信息。
 * 
 */

public class 验证车型BOM信息功能是否可实现_新增BOM_BOM树形修改操作_3652 extends Selenium_Test_Base {
	
	public 验证车型BOM信息功能是否可实现_新增BOM_BOM树形修改操作_3652(){
		super();
	}
	
	public 验证车型BOM信息功能是否可实现_新增BOM_BOM树形修改操作_3652(WebDriver driver){
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
		//是否存在BOM一栏为否的信息
		getElement(ElementEnum_车型BOM信息_337.检索BOM为否的行).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.新增BOM按钮).click();
		WebDriverConfiguration.operationInterval();
		judgeMaskLoad();
		
		getElement(ElementEnum_车型BOM信息_337.BOM树形增加按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_车型BOM信息_337.供货编号输入框).clear();
		getElement(ElementEnum_车型BOM信息_337.供货编号输入框).sendKeys("11");
		WebDriverConfiguration.operationInterval();
		//跳转到新页面
		//操作不同按钮ID会改变
		/*
		getElement(ElementEnum_车型BOM信息_337.新增确定按钮).click();
		WebDriverConfiguration.operationInterval();
		*/
	}

	
	public String getDescription(){
		return "测试用例id: 3652\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型BOM信息(#337)\n"
				+" 用例名称: 验证车型BOM信息功能是否可实现-新增BOM-BOM树形修改操作\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 单击左键选择一条是否存在BOM一栏为否的信息，点击新增BOM按钮\n"
				+" 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。\n"
				+" 测试步骤->2. 在根节点条件下点击增加按钮\n"
				+" 测试预期->2. 出现新增界面，在新增界面上可填写各项信息\n"
				+" 测试步骤->3. 直接点击确定按钮\n"
				+" 测试预期->3. 弹出提示信息，供货编号不能为空\n"
				+" 测试步骤->4. 供货编号填为11，其他各项为默认值，点击确定按钮\n"
				+" 测试预期->4. 新增节点(11)增加为根节点下的第一子节点\n"
				+" 测试步骤->5. 在叶子节点条件下点击挂接按钮\n"
				+" 测试预期->5. 跳出新页面，页面可修改各项整体匹配的信息。\n"
				+" 测试步骤->6. 修改名称和供货编号为空\n"
				+" 测试预期->6. 名称和供货编号不可修改\n"
				+" 测试步骤->7. 修改质量为20，修改数量为10，责任人为test，点击确定按钮\n"
				+" 测试预期->7. 页面被正常关闭，所更改内容更新为修改后信息。\n"
;
	}

}

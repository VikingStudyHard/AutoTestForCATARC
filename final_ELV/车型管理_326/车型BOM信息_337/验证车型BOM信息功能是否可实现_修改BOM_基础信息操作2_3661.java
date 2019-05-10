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
 * 测试用例id: 3661
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 车型BOM信息(#337)
 * 用例名称: 验证车型BOM信息功能是否可实现-修改BOM-基础信息操作2
 * 前置条件: 能正常进入车型管理模块
 * 测试步骤->1. 单击左键选择一条是否存在BOM一栏为是的信息，点击修改BOM按钮
 * 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。
 * 测试步骤->2. 单击选择一条树形图节点，点击右上角的导出按钮
 * 测试预期->2. 左侧树形图关闭，相应的节点信息成功下载本地，页面无其他相应
 * 测试步骤->3. 点击匹配信息右上角的下载按钮
 * 测试预期->3. 相应的匹配信息成功下载本地，页面无其他相应
 * 测试步骤->4. 点击匹配信息右上角的关闭按钮
 * 测试预期->4. 页面被正常关闭，无其他响应
 * 测试步骤->5. 点击基础信息右上角的返回按钮
 * 测试预期->5. 页面被正常关闭，恢复到车型BOM信息页面
 * 
 */

public class 验证车型BOM信息功能是否可实现_修改BOM_基础信息操作2_3661 extends Selenium_Test_Base {
	
	public 验证车型BOM信息功能是否可实现_修改BOM_基础信息操作2_3661(){
		super();
	}
	
	public 验证车型BOM信息功能是否可实现_修改BOM_基础信息操作2_3661(WebDriver driver){
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
		getElement(ElementEnum_车型BOM信息_337.修改BOM按钮).click();
		WebDriverConfiguration.operationInterval();
		judgeMaskLoad();
		
		getElement(ElementEnum_车型BOM信息_337.BOM树形图节点).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_车型BOM信息_337.导出按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_车型BOM信息_337.匹配结果按钮).click();
		WebDriverConfiguration.operationInterval();
		/*测试步骤->3. 点击匹配信息右上角的下载按钮
		 * 测试预期->3. 相应的匹配信息成功下载本地，页面无其他相应
		 * 测试步骤->4. 点击匹配信息右上角的关闭按钮
		 * 测试预期->4. 页面被正常关闭，无其他响应
		 * */
		getElement(ElementEnum_车型BOM信息_337.返回按钮).click();
		WebDriverConfiguration.operationInterval();
		
	}

	
	public String getDescription(){
		return "测试用例id: 3661\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 车型BOM信息(#337)\n"
				+" 用例名称: 验证车型BOM信息功能是否可实现-修改BOM-基础信息操作2\n"
				+" 前置条件: 能正常进入车型管理模块\n"
				+" 测试步骤->1. 单击左键选择一条是否存在BOM一栏为是的信息，点击修改BOM按钮\n"
				+" 测试预期->1. 出现查看BOM窗口，含有各项车型BOM信息。\n"
				+" 测试步骤->2. 单击选择一条树形图节点，点击右上角的导出按钮\n"
				+" 测试预期->2. 左侧树形图关闭，相应的节点信息成功下载本地，页面无其他相应\n"
				+" 测试步骤->3. 点击匹配信息右上角的下载按钮\n"
				+" 测试预期->3. 相应的匹配信息成功下载本地，页面无其他相应\n"
				+" 测试步骤->4. 点击匹配信息右上角的关闭按钮\n"
				+" 测试预期->4. 页面被正常关闭，无其他响应\n"
				+" 测试步骤->5. 点击基础信息右上角的返回按钮\n"
				+" 测试预期->5. 页面被正常关闭，恢复到车型BOM信息页面\n"
;
	}

}

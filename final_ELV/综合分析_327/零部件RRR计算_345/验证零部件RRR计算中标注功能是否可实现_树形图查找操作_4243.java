package cn.edu.tju.scs.seql.final_ELV.综合分析_327.零部件RRR计算_345;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 4243
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件RRR计算(#345)
 * 用例名称:  验证零部件RRR计算中标注功能是否可实现-树形图查找操作
 * 前置条件: 能正常进入综合分析模块
 * 测试步骤->1. 单击左键选择一条MDS信息，点击标注按钮
 * 测试预期->1. 跳转至新页面，页面包含零部件RRR计算基础信息表格
 * 测试步骤->2. 点击BOM树形图界面右上角的查找按钮
 * 测试预期->2. 跳出新页面以定位树形图节点
 * 测试步骤->3. 不填写任何内容点击定位页面中的搜索按钮
 * 测试预期->3. 页面无响应
 * 测试步骤->4. 填写定位页面信息中的节点名称为CA，点击搜索按钮
 * 测试预期->4. 页面出现请稍等进度条，进度条消失出现提示信息：没有结果！
 * 测试步骤->5. 填写定位页面信息中的节点名称为CA_5_13175222，点击搜索按钮
 * 测试预期->5. 页面出现请稍等进度条，搜索到名称为CA_5_13175222的节点信息
 * 测试步骤->6. 填写定位页面信息中的供货编号为test5.4-5.5，点击搜索按钮
 * 测试预期->6. 页面出现请稍等进度条，搜索到供货编号为test5.4-5.5的节点信息
 * 测试步骤->7. 点击定位页面的取消按钮
 * 测试预期->7. 定位查找页面正常关闭
 * 
 */

public class 验证零部件RRR计算中标注功能是否可实现_树形图查找操作_4243 extends Selenium_Test_Base {
	
	public 验证零部件RRR计算中标注功能是否可实现_树形图查找操作_4243(){
		super();
	}
	
	public 验证零部件RRR计算中标注功能是否可实现_树形图查找操作_4243(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_零部件RRR计算_345.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_零部件RRR计算_345.rightFrame);
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
		Assert.fail("该用例与系统不符，请检查");
	/*
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	*/
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		/*
		assertEquals(driver.findElement(By.xpath("//td")).getText(), "企业名称:");
	    assertEquals(driver.findElement(By.xpath("//td[3]")).getText(), "企业ID:");
	    assertEquals(driver.findElement(By.xpath("//td[5]")).getText(), "计划员:");
	    assertEquals(driver.findElement(By.xpath("//td[7]")).getText(), "区域");
	    assertEquals(driver.findElement(By.xpath("//td[9]")).getText(), "新增信息来源");
	    assertEquals(driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td/div/input")).getText(), "");
		*/
	
	}

	
	public String getDescription(){
		return "测试用例id: 4243\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件RRR计算(#345)\n"
				+" 用例名称:  验证零部件RRR计算中标注功能是否可实现-树形图查找操作\n"
				+" 前置条件: 能正常进入综合分析模块\n"
				+" 测试步骤->1. 单击左键选择一条MDS信息，点击标注按钮\n"
				+" 测试预期->1. 跳转至新页面，页面包含零部件RRR计算基础信息表格\n"
				+" 测试步骤->2. 点击BOM树形图界面右上角的查找按钮\n"
				+" 测试预期->2. 跳出新页面以定位树形图节点\n"
				+" 测试步骤->3. 不填写任何内容点击定位页面中的搜索按钮\n"
				+" 测试预期->3. 页面无响应\n"
				+" 测试步骤->4. 填写定位页面信息中的节点名称为CA，点击搜索按钮\n"
				+" 测试预期->4. 页面出现请稍等进度条，进度条消失出现提示信息：没有结果！\n"
				+" 测试步骤->5. 填写定位页面信息中的节点名称为CA_5_13175222，点击搜索按钮\n"
				+" 测试预期->5. 页面出现请稍等进度条，搜索到名称为CA_5_13175222的节点信息\n"
				+" 测试步骤->6. 填写定位页面信息中的供货编号为test5.4-5.5，点击搜索按钮\n"
				+" 测试预期->6. 页面出现请稍等进度条，搜索到供货编号为test5.4-5.5的节点信息\n"
				+" 测试步骤->7. 点击定位页面的取消按钮\n"
				+" 测试预期->7. 定位查找页面正常关闭\n"
;
	}

}

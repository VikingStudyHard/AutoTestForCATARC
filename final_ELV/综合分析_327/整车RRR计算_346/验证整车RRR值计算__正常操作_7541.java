package cn.edu.tju.scs.seql.final_ELV.综合分析_327.整车RRR计算_346;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;

/**
 * 测试用例id: 7541
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 整车RRR计算(#346)
 * 用例名称: 验证整车RRR值计算——正常操作
 * 前置条件: 1、该车型至少已匹配或挂接一个来自于CAMDS系统的零部件
 *         2、车型BOM的每一个零部件节点或材料节点在车型管理模块都匹配成功
 * 测试步骤->1. 进入综合分析模块，点击整车RRR值计算，选择一条车型信息，点击确定。
 * 测试预期->1. 跳转至新页面，页面左侧一栏为车型BOM树形，右侧一栏为基础信息。
 * 测试步骤->2. 点击自动标注
 * 测试预期->2. 弹出系统提示对话框：“确定要自动标注吗？”
 * 测试步骤->3. 点击“是”
 * 测试预期->3. 弹出提示对话框：“RRR自动标注中...”，然后出现提示对话框：“自动标注成功！”
 * 测试步骤->4. 点击确定按钮，展开车型BOM树形
 * 测试预期->4. 看到标注成功的材料节点或零部件节点上面出现对号标志
 * 测试步骤->5. 点击校验按钮
 * 测试预期->5. 弹出整车校验标注信息对话框，显示没有数据，说明全部标注成功。
 * 测试步骤->6. 点击回收利用率报告按钮
 * 测试预期->6. 弹出MDS信息查找页面
 * 测试步骤->7. 在检索框中输入CAMDS系统的零部件的某一项检索条件，例如：ID为CA_5_14662137，点击查询按钮
 * 测试预期->7. 页面中出现所查询的零部件的MDS信息。
 * 测试步骤->8. 选中这条信息，点击确定
 * 测试预期->8. 弹出对话框：“RRR值计算中...”然后基础信息页面出现回收利用率的计算结果，并弹出迅雷下载页面。
 * 测试步骤->9. 点击下载按钮
 * 测试预期->9. 得到excel表格。表格有6个sheet,分别是：RRR合规报表、mD拆解零部件清单、mM阶段材料清单、mTr阶段材料清单、mTe阶段材料清单、零部件材料可回收利用属性说明。
 * 
 */

public class 验证整车RRR值计算__正常操作_7541 extends Selenium_Test_Base {
	
	public 验证整车RRR值计算__正常操作_7541(){
		super();
	}
	
	public 验证整车RRR值计算__正常操作_7541(WebDriver driver){
		super(driver);
	}
	
	@Test
	public void testNg() throws Exception {
		LoginAction.loginAction(driver,baseUrl);
		WebElement leftFrame=getElement(ElementEnum_整车RRR计算_346.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_整车RRR计算_346.rightFrame);
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
		// TODO 该用例尚未实现，请检查
	/*
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_整车RRR计算_346.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_整车RRR计算_346.二级目录名称).click();
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
		return "测试用例id: 7541\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 整车RRR计算(#346)\n"
				+" 用例名称: 验证整车RRR值计算——正常操作\n"
				+" 前置条件: 1、该车型至少已匹配或挂接一个来自于CAMDS系统的零部件 2、车型BOM的每一个零部件节点或材料节点在车型管理模块都匹配成功\n"
				+" 测试步骤->1. 进入综合分析模块，点击整车RRR值计算，选择一条车型信息，点击确定。\n"
				+" 测试预期->1. 跳转至新页面，页面左侧一栏为车型BOM树形，右侧一栏为基础信息。\n"
				+" 测试步骤->2. 点击自动标注\n"
				+" 测试预期->2. 弹出系统提示对话框：“确定要自动标注吗？”\n"
				+" 测试步骤->3. 点击“是”\n"
				+" 测试预期->3. 弹出提示对话框：“RRR自动标注中...”，然后出现提示对话框：“自动标注成功！”\n"
				+" 测试步骤->4. 点击确定按钮，展开车型BOM树形\n"
				+" 测试预期->4. 看到标注成功的材料节点或零部件节点上面出现对号标志\n"
				+" 测试步骤->5. 点击校验按钮\n"
				+" 测试预期->5. 弹出整车校验标注信息对话框，显示没有数据，说明全部标注成功。\n"
				+" 测试步骤->6. 点击回收利用率报告按钮\n"
				+" 测试预期->6. 弹出MDS信息查找页面\n"
				+" 测试步骤->7. 在检索框中输入CAMDS系统的零部件的某一项检索条件，例如：ID为CA_5_14662137，点击查询按钮\n"
				+" 测试预期->7. 页面中出现所查询的零部件的MDS信息。\n"
				+" 测试步骤->8. 选中这条信息，点击确定\n"
				+" 测试预期->8. 弹出对话框：“RRR值计算中...”然后基础信息页面出现回收利用率的计算结果，并弹出迅雷下载页面。\n"
				+" 测试步骤->9. 点击下载按钮\n"
				+" 测试预期->9. 得到excel表格。表格有6个sheet,分别是：RRR合规报表、mD拆解零部件清单、mM阶段材料清单、mTr阶段材料清单、mTe阶段材料清单、零部件材料可回收利用属性说明。\n"
;
	}

}

package cn.edu.tju.scs.seql.final_ELV.综合分析_327.零部件RRR计算_345;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.*;
import cn.edu.tju.scs.seql.element.*;
import cn.edu.tju.scs.seql.final_ELV.综合分析_327.有害物质分析_342.ElementEnum_有害物质分析_342;

/**
 * 测试用例id: 4248
 * 所属产品: ELV环境合规系统（标准版）(#17)
 * 所属模块: 零部件RRR计算(#345)
 * 用例名称: 验证零部件RRR计算的查看标注记录功能是否可以实现-打开查询窗口-部件号检索
 * 前置条件: 能正确进入综合分析模块
 * 测试步骤->1. 勾选一项MDS信息，点击零部件RRR计算页面中的查看标注记录按钮
 * 测试预期->1. 跳转至新页面，页面为查看的数据标注记录，可查看所选信息的数据标注记录
 * 测试步骤->2. 点击新页面右上角的查询窗口按钮
 * 测试预期->2. 出现查询窗口
 * 测试步骤->3. 在查询条件：部件号中填写1，点击检索按钮
 * 测试预期->3. 出现提示信息：请输入开始时间
 * 测试步骤->4. 选择开始时间为2016年3月18日，点击检索按钮
 * 测试预期->4. 出现提示信息：请输入结束时间
 * 测试步骤->5. 选择结束时间为2016年5月28日，点击检索按钮
 * 测试预期->5. 无符合条件的信息被检索出来
 * 测试步骤->6. 在查询条件：部件号中填写E000，点击检索按钮
 * 测试预期->6. 无符合条件的信息被检索出来
 * 测试步骤->7. 在查询条件：部件号中填写E00092444，点击检索按钮
 * 测试预期->7. 部件号为E00092444的信息被检索出来
 * 
 */

public class 验证零部件RRR计算的查看标注记录功能是否可以实现_打开查询窗口_部件号检索_4248 extends Selenium_Test_Base {
	
	public 验证零部件RRR计算的查看标注记录功能是否可以实现_打开查询窗口_部件号检索_4248(){
		super();
	}
	
	public 验证零部件RRR计算的查看标注记录功能是否可以实现_打开查询窗口_部件号检索_4248(WebDriver driver){
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
	
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.一级目录名称).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_零部件RRR计算_345.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	
	}
	
	/**
	 * 具体的测试操作，在右边的mianFrame中进行
	 */
	public void detailedOperation(){
		getElement(ElementEnum_零部件RRR计算_345.MSD信息选择按钮1).click();
		getElement(ElementEnum_零部件RRR计算_345.查看标注记录).click();
		WebDriverConfiguration.operationInterval();
		
		testPartNumber("1","", "");
		testPartNumber("1","2016-03-18", "2016-05-28");
		testPartNumber("E000","2016-03-18", "2016-05-28");
		testPartNumber("E00092444","2016-03-18", "2016-05-28");
		
		/*
		assertEquals(driver.findElement(By.xpath("//td")).getText(), "企业名称:");
	    assertEquals(driver.findElement(By.xpath("//td[3]")).getText(), "企业ID:");
	    assertEquals(driver.findElement(By.xpath("//td[5]")).getText(), "计划员:");
	    assertEquals(driver.findElement(By.xpath("//td[7]")).getText(), "区域");
	    assertEquals(driver.findElement(By.xpath("//td[9]")).getText(), "新增信息来源");
	    assertEquals(driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td/div/input")).getText(), "");
		*/
	
	}
	public void testPartNumber(String partNumber,String startTime, String endTime){
		getElement(ElementEnum_零部件RRR计算_345.打开查询窗口).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_零部件RRR计算_345.开始时间输入框);
		getElement(ElementEnum_零部件RRR计算_345.结束时间输入框);
		// 去掉输入框的readonly属性，直接输入起点时间和终点时间
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_零部件RRR计算_345.开始时间输入框.getName()+"\");setDate.removeAttribute('readonly');");
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_零部件RRR计算_345.结束时间输入框.getName()+"\");setDate.removeAttribute('readonly');");
		
		getElement(ElementEnum_零部件RRR计算_345.开始时间输入框).clear();
		getElement(ElementEnum_零部件RRR计算_345.开始时间输入框).sendKeys(startTime);
		getElement(ElementEnum_零部件RRR计算_345.结束时间输入框).clear();
		getElement(ElementEnum_零部件RRR计算_345.结束时间输入框).sendKeys(endTime);
		getElement(ElementEnum_零部件RRR计算_345.部件号).clear();
		getElement(ElementEnum_零部件RRR计算_345.部件号).sendKeys(partNumber);
		getElement(ElementEnum_零部件RRR计算_345.查看标注记录检索).click();
		WebDriverConfiguration.operationInterval();
		
		if(startTime.equals("")||startTime==null||endTime.equals("")||endTime==null){
			assertTrue(getElement(ElementEnum_零部件RRR计算_345.错误信息).getText().contains("请输入开始时间")||getElement(ElementEnum_零部件RRR计算_345.错误信息).getText().contains("请输入结束时间"),"没有提示 输入时间");
			getElement(ElementEnum_零部件RRR计算_345.错误信息确定按钮).click();
			getElement(ElementEnum_零部件RRR计算_345.关闭查询窗口按钮).click();
		}else{
			if(startTime.compareTo(endTime) > 0){
				dealWithError();
				return;
			}
			else{
				List<WebElement> eles = getElements(ElementEnum_零部件RRR计算_345.检索结果所有行);
				if(eles.size()==1){
					assertTrue(getElement(ElementEnum_零部件RRR计算_345.错误信息).getText().contains("没有查询到相关数据"),"没有提示 ");
					getElement(ElementEnum_零部件RRR计算_345.错误信息确定按钮).click();
				}
				else{
				// 检查查询结果中是否包含所查关键字
					for(int i = 1;i < eles.size();i++){
						String xpath = ElementEnum_零部件RRR计算_345.检索结果第一行生产年份.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
						String createTime = driver.findElement(By.xpath(xpath)).getText();
						//assertTrue(createTime.compareTo(startTime) > 0,"搜索结果小于起点时间");
						//assertTrue(createTime.compareTo(endTime) < 0,"搜索结果大于终点时间");
					
						String chXpath = ElementEnum_零部件RRR计算_345.检索结果第一行部件名称.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
						String chProduceName = driver.findElement(By.xpath(chXpath)).getText();
						assertTrue(chProduceName.contains(partNumber)||createTime.compareTo(startTime) > 0||createTime.compareTo(endTime) < 0,"查询结果不符合要求");
					}
				}
			}
		}
		
		
		
	}
	
	public void dealWithError(){
		String displayValue = getElement(ElementEnum_零部件RRR计算_345.错误信息).getCssValue("display");
		assertTrue(!displayValue.equals("none"),"时间错误,信息未显示");
	}
	
	public String getDescription(){
		return "测试用例id: 4248\n"
				+" 所属产品: ELV环境合规系统（标准版）(#17)\n"
				+" 所属模块: 零部件RRR计算(#345)\n"
				+" 用例名称: 验证零部件RRR计算的查看标注记录功能是否可以实现-打开查询窗口-部件号检索\n"
				+" 前置条件: 能正确进入综合分析模块\n"
				+" 测试步骤->1. 勾选一项MDS信息，点击零部件RRR计算页面中的查看标注记录按钮\n"
				+" 测试预期->1. 跳转至新页面，页面为查看的数据标注记录，可查看所选信息的数据标注记录\n"
				+" 测试步骤->2. 点击新页面右上角的查询窗口按钮\n"
				+" 测试预期->2. 出现查询窗口\n"
				+" 测试步骤->3. 在查询条件：部件号中填写1，点击检索按钮\n"
				+" 测试预期->3. 出现提示信息：请输入开始时间\n"
				+" 测试步骤->4. 选择开始时间为2016年3月18日，点击检索按钮\n"
				+" 测试预期->4. 出现提示信息：请输入结束时间\n"
				+" 测试步骤->5. 选择结束时间为2016年5月28日，点击检索按钮\n"
				+" 测试预期->5. 无符合条件的信息被检索出来\n"
				+" 测试步骤->6. 在查询条件：部件号中填写E000，点击检索按钮\n"
				+" 测试预期->6. 无符合条件的信息被检索出来\n"
				+" 测试步骤->7. 在查询条件：部件号中填写E00092444，点击检索按钮\n"
				+" 测试预期->7. 部件号为E00092444的信息被检索出来\n"
;
	}

}

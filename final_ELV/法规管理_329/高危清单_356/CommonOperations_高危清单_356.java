package cn.edu.tju.scs.seql.final_ELV.法规管理_329.高危清单_356;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cn.edu.tju.scs.seql.ELV.common.WebDriverConfiguration;
import cn.edu.tju.scs.seql.element.ElementEnum;
import cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352.CommonOperations_标准信息_352;
import cn.edu.tju.scs.seql.final_ELV.法规管理_329.标准信息_352.ElementEnum_标准信息_352;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;

public class CommonOperations_高危清单_356 extends CommonOperationsAll {
	
	public CommonOperations_高危清单_356(){
		super();
	}
	
	public CommonOperations_高危清单_356(WebDriver driver){
		super(driver);
	}
	
	public void searchMyRecordWithBOM(){
		getElement(ElementEnum_高危清单_356.品牌名称输入框).clear();
		getElement(ElementEnum_高危清单_356.品牌名称输入框).sendKeys("testBy樊向宇");
		ElementEnum inputStart = ElementEnum_高危清单_356.起始时间输入框;
		ElementEnum inputEnd = ElementEnum_高危清单_356.终止时间输入框;
		getElement(inputStart);
		getElement(inputEnd);
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+inputStart.getName()+"\");setDate.removeAttribute('readonly');");
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+inputEnd.getName()+"\");setDate.removeAttribute('readonly');");
		
		getElement(inputStart).clear();
		getElement(inputStart).sendKeys("2016-10-16");
		getElement(inputEnd).clear();
		getElement(inputEnd).sendKeys("2016-10-17");
		getElement(ElementEnum_高危清单_356.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
	}
	
	
	/**
	 * 检索出测试时要操作的数据
	 */
	public void searchMyRecord(){
		testQueryByGeneralName("testBy樊向宇", ElementEnum_高危清单_356.品牌名称输入框, 
				ElementEnum_高危清单_356.检索按钮, 
				ElementEnum_高危清单_356.检索结果所有行, 
				ElementEnum_高危清单_356.检索结果第一行品牌中文名称, 
				ElementEnum_高危清单_356.检索结果第一行品牌英文名称);
		judgeMaskLoadFirst();
		
	}
	
	public void verifyTips(String expectTips){
		verifyTipsAndThenOperateButton(expectTips, 
				ElementEnum_标准信息_352.第一页提示信息, 
				ElementEnum_标准信息_352.第一页提示框确认按钮);
	}
	
	/**
	 * 删除第二层零部件节点的填报信息
	 */
	public void deleteTianBaoForNode(){
		getElement(ElementEnum_高危清单_356.BOM树第二层节点_零部件).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.第二页取消填报按钮).click();
		WebDriverConfiguration.operationInterval();
		if(getElement(ElementEnum_标准信息_352.第一页提示信息).getText().contains("该节点未进行标注")){
			verifyTips("该节点未进行标注");
		}else{
			verifyTipsAndThenOperateButton("确定要取消该节点标注吗", ElementEnum_标准信息_352.第一页提示信息, ElementEnum_标准信息_352.第一页提示框是按钮);
		}
	}
	
	/**
	 * 填报第二层零部件节点
	 */
	public void addTianBaoForNode() {
		int originalNum = getElements(ElementEnum_高危清单_356.下方备案参数表所有行).size();
		getElement(ElementEnum_高危清单_356.BOM树第二层节点_零部件).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.第二页填报按钮).click();
		WebDriverConfiguration.operationInterval();
		
		getElement(ElementEnum_高危清单_356.弹出窗口填报按钮).click();
		WebDriverConfiguration.operationInterval();
		verifyTips("请您选择回收利用阶段");
		
		getElement(ElementEnum_高危清单_356.弹出窗口零部件通用名称输入框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.弹出窗口零部件通用名称选项一).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_高危清单_356.弹出窗口填报按钮).click();
		WebDriverConfiguration.operationInterval();
		
		int newNum = getElements(ElementEnum_高危清单_356.下方备案参数表所有行).size();
		assertEquals(newNum, originalNum+1);
	}
	
	/**
	 * 检测第一页载入界面是否完成
	 */
	public void judgeMaskLoadFirst(){
		judgeElementDisplayNone(ElementEnum_高危清单_356.换页载入界面);
	}
	
	public void judgeMaskLoadSecondPage(){
		judgeElementDisplayNone(ElementEnum_高危清单_356.第二页载入页面);
	}

}

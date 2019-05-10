package cn.edu.tju.scs.seql.final_ELV.法规管理_329.最新法规_354;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cn.edu.tju.scs.seql.ELV.common.WebDriverConfiguration;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;

public class CommonOperations_最新法规_354 extends CommonOperationsAll {
	
	public CommonOperations_最新法规_354(){
		super();
	}
	
	public CommonOperations_最新法规_354(WebDriver driver){
		super(driver);
	}
	
	/**
	 * 检索出测试时要操作的数据
	 */
	public void searchMyRecord(){
		String title = "樊向宇用来测试的最新法规";
		getElement(ElementEnum_最新法规_354.标题输入框).clear();
		getElement(ElementEnum_最新法规_354.标题输入框).sendKeys(title);
		getElement(ElementEnum_最新法规_354.检索按钮).click();
		WebDriverConfiguration.operationInterval();
		
		WebElement tip = null;
		tip = getElement(ElementEnum_最新法规_354.第一页提示信息);
		if(tip != null && tip.isDisplayed()){
			verifyTips("您查找的数据不存在");
		}else{
			verifyAllSearchResult(title, 
					ElementEnum_最新法规_354.检索结果所有行,
					ElementEnum_最新法规_354.检索结果第一行标题,
					ElementEnum_最新法规_354.检索结果第一行标题);
		}
	}
	
	public void verifyTips(String expectTips){
		verifyTipsAndThenOperateButton(expectTips, 
				ElementEnum_最新法规_354.第一页提示信息,
				ElementEnum_最新法规_354.第一页提示框确认按钮);
	}
	

}

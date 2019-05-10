package cn.edu.tju.scs.seql.final_ELV.法规管理_329.行业动态_355;

import org.openqa.selenium.WebDriver;

import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;

public class CommonOperations_行业动态_355 extends CommonOperationsAll{
	
	public CommonOperations_行业动态_355(){
		super();
	}
	
	public CommonOperations_行业动态_355(WebDriver driver){
		super(driver);
	}
	
	/**
	 * 检索出测试时要操作的数据
	 */
	public void searchMyRecord(){
		testQueryByGeneralName("樊向宇用来测试的行业动态", ElementEnum_行业动态_355.标题输入框,
				ElementEnum_行业动态_355.检索按钮, 
				ElementEnum_行业动态_355.检索结果所有行, 
				ElementEnum_行业动态_355.检索结果第一行标题, 
				ElementEnum_行业动态_355.检索结果第一行标题);
	}
	
	public void verifyTips(String expectTips){
		verifyTipsAndThenOperateButton(expectTips, 
				ElementEnum_行业动态_355.第一页提示信息, 
				ElementEnum_行业动态_355.第一页提示框确认按钮);
	}

}

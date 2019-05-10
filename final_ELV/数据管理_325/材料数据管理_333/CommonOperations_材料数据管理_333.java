package cn.edu.tju.scs.seql.final_ELV.数据管理_325.材料数据管理_333;

import org.openqa.selenium.WebDriver;

import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;

public class CommonOperations_材料数据管理_333  extends CommonOperationsAll {

	public CommonOperations_材料数据管理_333(){
		super();
	}
	
	public CommonOperations_材料数据管理_333(WebDriver driver){
		super(driver);
	}
	
	public void verifyTips(String expectTips){
		verifyTipsAndThenOperateButton(expectTips, 
				ElementEnum_材料数据管理_333.第一页提示信息,
				ElementEnum_材料数据管理_333.第一页提示框确认按钮);
	}
	
	public void waitLoading(){
		int times = 30;
		while(times-- > 0){
			if(!getElement(ElementEnum_材料数据管理_333.换页载入界面).isDisplayed()){
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

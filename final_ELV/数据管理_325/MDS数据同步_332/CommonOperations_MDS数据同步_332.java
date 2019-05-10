package cn.edu.tju.scs.seql.final_ELV.数据管理_325.MDS数据同步_332;

import org.openqa.selenium.WebDriver;

import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;

public class CommonOperations_MDS数据同步_332 extends CommonOperationsAll {

	public CommonOperations_MDS数据同步_332(){
		super();
	}
	
	public CommonOperations_MDS数据同步_332(WebDriver driver){
		super(driver);
	}
	
	public void verifyTips(String expectTips){
		verifyTipsAndThenOperateButton(expectTips, 
				ElementEnum_MDS数据同步_332.第一页提示信息,
				ElementEnum_MDS数据同步_332.第一页提示框确认按钮);
	}
	
	public void waitLoading(){
		int times = 30;
		while(times-- > 0){
			if(!getElement(ElementEnum_MDS数据同步_332.换页载入界面).isDisplayed()){
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fillSearchInfo(String people, String id, String number, String name, String result,String startTime, String endTime){
		CommonOperations_MDS数据同步_332 a = new CommonOperations_MDS数据同步_332(driver);
		getElement(ElementEnum_MDS数据同步_332.查找参数操作员输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.查找参数操作员输入框).sendKeys(people);
		getElement(ElementEnum_MDS数据同步_332.查找参数ID输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.查找参数ID输入框).sendKeys(id);
		getElement(ElementEnum_MDS数据同步_332.查找参数供货编号输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.查找参数供货编号输入框).sendKeys(number);
		getElement(ElementEnum_MDS数据同步_332.查找参数名称输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.查找参数名称输入框).sendKeys(name);
		getElement(ElementEnum_MDS数据同步_332.查找参数执行结果下拉按钮).click();
		if(result.equals("全部")){
			getElement(ElementEnum_MDS数据同步_332.查找参数执行结果下拉选项_全部).click();
		}else if(result.equals("下载成功")){
			getElement(ElementEnum_MDS数据同步_332.查找参数执行结果下拉选项_下载成功).click();
		}else if(result.equals("下载失败")){
			getElement(ElementEnum_MDS数据同步_332.查找参数执行结果下拉选项_下载失败).click();
		}else if(result.equals("下载警告")){
			getElement(ElementEnum_MDS数据同步_332.查找参数执行结果下拉选项_下载警告).click();
		}
		a.deleteReadOnly(ElementEnum_MDS数据同步_332.查找参数同步查询开始时间输入框);
		a.deleteReadOnly(ElementEnum_MDS数据同步_332.查找参数同步查询结束时间输入框);
		getElement(ElementEnum_MDS数据同步_332.查找参数同步查询开始时间输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.查找参数同步查询开始时间输入框).sendKeys(startTime);
		getElement(ElementEnum_MDS数据同步_332.查找参数同步查询结束时间输入框).clear();
		getElement(ElementEnum_MDS数据同步_332.查找参数同步查询结束时间输入框).sendKeys(endTime);
	}
}

package cn.edu.tju.scs.seql.final_ELV.数据管理_325.基础数据同步_331;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cn.edu.tju.scs.seql.ELV.common.WebDriverConfiguration;
import cn.edu.tju.scs.seql.element.ElementEnum;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;

public class CommonOperations_基础数据同步_331 extends CommonOperationsAll {
	
	public CommonOperations_基础数据同步_331(){
		super();
	}
	
	public CommonOperations_基础数据同步_331(WebDriver driver){
		super(driver);
	}
	
	public void verifyNormal(String startTimeStr, String endTimeStr, ElementEnum operationButton){
		CommonOperations_基础数据同步_331 a = new CommonOperations_基础数据同步_331(driver);
		a.deleteReadOnly();
		getElement(ElementEnum_基础数据同步_331.开始时间输入框).clear();
		getElement(ElementEnum_基础数据同步_331.开始时间输入框).sendKeys(startTimeStr);
		getElement(ElementEnum_基础数据同步_331.结束时间输入框).clear();
		getElement(ElementEnum_基础数据同步_331.结束时间输入框).sendKeys(endTimeStr);
		
		
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		SimpleDateFormat inputFormat = new SimpleDateFormat("yy年MM月dd日 HH:mm:ss");
		String startTime = getElement(ElementEnum_基础数据同步_331.开始时间输入框).getAttribute("value");
		String endTime = getElement(ElementEnum_基础数据同步_331.结束时间输入框).getAttribute("value");
		try {
			startTime = df.format(inputFormat.parse(startTime));
			endTime = df.format(inputFormat.parse(endTime));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		String time = df.format(new Date());
		getElement(operationButton).click();
		WebDriverConfiguration.operationInterval();
		a.waitProcess();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("同步成功");
		String firstLineTime = getElement(ElementEnum_基础数据同步_331.结果表格第一行同步时间).getText();
		long dis = 99999;
		try {
			dis = Math.abs(df.parse(firstLineTime).getTime()-df.parse(time).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// 操作的间隔小于100秒
		assertTrue(dis < 100000);
		String[] param = getElement(ElementEnum_基础数据同步_331.结果表格第一行参数).getText().split("--");
//		assertEquals(startTime, param[0]);
//		assertEquals(endTime, param[1]);
	}
	
	public void verifyException(ElementEnum operationButton){
		CommonOperations_基础数据同步_331 a = new CommonOperations_基础数据同步_331(driver);
		a.deleteReadOnly();
		getElement(ElementEnum_基础数据同步_331.开始时间输入框).clear();
		getElement(ElementEnum_基础数据同步_331.开始时间输入框).sendKeys("16年03月29日 13:12:35");
		getElement(ElementEnum_基础数据同步_331.结束时间输入框).clear();
		getElement(ElementEnum_基础数据同步_331.结束时间输入框).sendKeys("16年03月22日 13:12:35");
		getElement(operationButton).click();
		WebDriverConfiguration.operationInterval();
		a.verifyTips("开始时间早于结束时间!");
	}
	
	public void deleteReadOnly(){
		getElement(ElementEnum_基础数据同步_331.开始时间输入框);
		getElement(ElementEnum_基础数据同步_331.结束时间输入框);
		deleteReadOnly(ElementEnum_基础数据同步_331.开始时间输入框);
		deleteReadOnly(ElementEnum_基础数据同步_331.结束时间输入框);
	}
	
	public void verifyTips(String expectTips){
		verifyTipsAndThenOperateButton(expectTips, 
				ElementEnum_基础数据同步_331.第一页提示信息,
				ElementEnum_基础数据同步_331.第一页提示框确认按钮);
	}
	
	public void waitProcess(){
		int times = 90;
		while(times-- > 0){
			if(!getElement(ElementEnum_基础数据同步_331.第一页提示信息).getText().contains("正在处理，请稍等...")){
				return;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(times);
		}
		Assert.fail("同步时间过长，请检查系统或者网络状况");
	}

}
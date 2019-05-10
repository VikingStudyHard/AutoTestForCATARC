package cn.edu.tju.scs.seql.final_ELV.消息管理_328.信息查询_349;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cn.edu.tju.scs.seql.ELV.common.WebDriverConfiguration;
import cn.edu.tju.scs.seql.final_ELV.消息管理_328.新建消息_348.CommonOperations_新建消息_348;
import cn.edu.tju.scs.seql.final_ELV.消息管理_328.新建消息_348.ElementEnum_新建消息_348;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;

public class CommonOperations_信息查询_349 extends CommonOperationsAll {
	
	public CommonOperations_信息查询_349(){
		super();
	}
	
	public CommonOperations_信息查询_349(WebDriver driver){
		super(driver);
	}
	
	/**
	 * 删除检索结果中的第一条记录
	 */
	public void deleteFirstRecord(){
		getElement(ElementEnum_信息查询_349.检索结果第一行前方勾选框).click();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_信息查询_349.删除按钮).click();
		WebDriverConfiguration.operationInterval();
		verifyTipsAndThenOperateButton("是否要删除数据", ElementEnum_信息查询_349.第一页提示信息, 
										ElementEnum_信息查询_349.第一页提示框是按钮);
		verifyTips("删除消息信息成功");
	}
	
	/**
	 * 保证第一条的信息是“樊向宇试试怎么发消息”，并且未发送，且包含接收人
	 */
	public void verifyFirstOneMyRecordWithReceiver(){
		String state = getElement(ElementEnum_信息查询_349.检索结果第一行状态).getText();
		String str = getElement(ElementEnum_信息查询_349.检索结果第一行消息标题).getText();
		String receiver = getElement(ElementEnum_信息查询_349.检索结果第一行接收人).getText();
		if(str.equals("樊向宇试试怎么发消息") && state.equals("未发送") && !receiver.equals("")){
			
		}else{
			changeToAddMsg();
			CommonOperations_新建消息_348 a = new CommonOperations_新建消息_348(driver);
			a.createMyMsgWithReceiver();
			changeBackToQueryMsg();
		}
	}
	
	
	/**
	 * 保证前n条数据为“樊向宇试试怎么发消息”，并且未被发送
	 * @param n
	 */
	public void verifyFirstNMyRecord(int n){
		int total = n;
		for(int i = 0;i < n;i++){
			String state = driver.findElement(By.xpath(ElementEnum_信息查询_349.检索结果第一行状态.getName().replaceAll("tr\\[2\\]", "tr["+(i+2)+"]"))).getText();
			String str = driver.findElement(By.xpath(ElementEnum_信息查询_349.检索结果第一行消息标题.getName().replaceAll("tr\\[2\\]", "tr["+(i+2)+"]"))).getText();
			if(str.equals("樊向宇试试怎么发消息") && state.equals("未发送")){
				total--;
			}else{
				break;
			}
		}
		for(int i = 0;i < total;i++){
			changeToAddMsg();
			CommonOperations_新建消息_348 a = new CommonOperations_新建消息_348(driver);
			a.createMyMsgWithoutReceiver();
			changeBackToQueryMsg();
		}
	}
	
	/**
	 * 保证前三条数据为“樊向宇试试怎么发消息”，并且未被发送
	 */
	public void verifyFirstThreeMyRecord(){
		verifyFirstNMyRecord(3);
		
	}
	
	public void changeToAddMsg(){
		driver.switchTo().defaultContent();
		WebElement leftFrame = getElement(ElementEnum_信息查询_349.leftFrame);
		WebElement mainFrame = getElement(ElementEnum_信息查询_349.rightFrame);
		driver.switchTo().frame(leftFrame);
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_新建消息_348.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(mainFrame);
	}
	
	public void changeBackToQueryMsg(){
		driver.switchTo().defaultContent();
		WebElement leftFrame = getElement(ElementEnum_信息查询_349.leftFrame);
		WebElement mainFrame = getElement(ElementEnum_信息查询_349.rightFrame);
		driver.switchTo().frame(leftFrame);
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_信息查询_349.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(mainFrame);
	}
	
	
	public void verifyTips(String expectTips){
		verifyTipsAndThenOperateButton(expectTips, 
				ElementEnum_信息查询_349.第一页提示信息, 
				ElementEnum_信息查询_349.第一页提示框确认按钮);
	}
	
	

}

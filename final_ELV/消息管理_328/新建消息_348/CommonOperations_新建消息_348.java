package cn.edu.tju.scs.seql.final_ELV.消息管理_328.新建消息_348;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cn.edu.tju.scs.seql.ELV.common.WebDriverConfiguration;
import cn.edu.tju.scs.seql.final_ELV.消息管理_328.信息查询_349.ElementEnum_信息查询_349;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;

public class CommonOperations_新建消息_348 extends CommonOperationsAll {
	
	public CommonOperations_新建消息_348(){
		super();
	}
	
	public CommonOperations_新建消息_348(WebDriver driver){
		super(driver);
	}
	
	/**
	 * 去除掉版本组号和接收人的readonly限制
	 */
	public void deleteReadOnly() {
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框);
		getElement(ElementEnum_新建消息_348.接收人输入框);
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ ElementEnum_新建消息_348.BOM节点版本组号输入框.getName()+"\");setDate.removeAttribute('readonly');");
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ ElementEnum_新建消息_348.接收人输入框.getName()+"\");setDate.removeAttribute('readonly');");
	}
	
	/**
	 * 切换到消息查询目录
	 */
	public void changeToQueryMsg(){
		driver.switchTo().defaultContent();
		WebElement leftFrame=getElement(ElementEnum_新建消息_348.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_新建消息_348.rightFrame);
		driver.switchTo().frame(leftFrame);
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_信息查询_349.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	    driver.switchTo().defaultContent();
		
		driver.switchTo().frame(mainFrame);
	}
	
	/**
	 * 切换回新建消息目录
	 */
	public void changeBackToAddNew(){
		driver.switchTo().defaultContent();
		WebElement leftFrame=getElement(ElementEnum_新建消息_348.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_新建消息_348.rightFrame);
		driver.switchTo().frame(leftFrame);
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_新建消息_348.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	    driver.switchTo().defaultContent();
		
		driver.switchTo().frame(mainFrame);
	}
	
	/**
	 * 创建一条属于我控制的消息记录
	 * @param hasReceiver	是否包含接收人
	 * @param content		消息内容
	 */
	public void createMyRecord(boolean hasReceiver,String title, String content){
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框);
		getElement(ElementEnum_新建消息_348.接收人输入框);
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ ElementEnum_新建消息_348.BOM节点版本组号输入框.getName()+"\");setDate.removeAttribute('readonly');");
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ ElementEnum_新建消息_348.接收人输入框.getName()+"\");setDate.removeAttribute('readonly');");
		
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).clear();
		getElement(ElementEnum_新建消息_348.BOM节点版本组号输入框).sendKeys("EM_5_2238840");
		getElement(ElementEnum_新建消息_348.标题输入框).clear();
		getElement(ElementEnum_新建消息_348.标题输入框).sendKeys(title);
		
		if(hasReceiver){
			String addMsgScript = "addRecipientEntOrg('樊向宇的selenium再奔跑', '779493');";
			((JavascriptExecutor)driver).executeScript(addMsgScript);
		}
		
		inputContent(content);
		
		getElement(ElementEnum_新建消息_348.保存信息按钮).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		dealWithAlert("数据已保存");
		
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
	}
	
	public void inputContent(String content){
		WebElement inputFrame=getElement(ElementEnum_新建消息_348.内容输入frame);
		driver.switchTo().frame(inputFrame);
		String s = driver.findElement(By.xpath("html/body")).getText();
		String addMsgContentScript = "var body = document.getElementsByTagName('body');body[0].innerHTML = '" + content + "';";
		((JavascriptExecutor)driver).executeScript(addMsgContentScript);
		driver.switchTo().parentFrame();
	}
	
	/**
	 * 处理alert信息
	 * @param msg
	 */
	public void dealWithAlert(String msg){
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Assert.assertTrue(alert.getText().contains(msg));
		alert.accept();
	}
	
	/**
	 * 创建一条不包含接收人的消息记录
	 */
	public void createMyMsgWithoutReceiver(){
		createMyRecord(false,"樊向宇试试怎么发消息","樊向宇试试怎么发消息的具体内容");
	}
	
	/**
	 * 创建一条包含接收人的消息记录
	 */
	public void createMyMsgWithReceiver(){
		createMyRecord(true,"樊向宇试试怎么发消息","樊向宇试试怎么发消息的具体内容");
	}
	
}

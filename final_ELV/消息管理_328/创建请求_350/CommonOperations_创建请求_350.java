package cn.edu.tju.scs.seql.final_ELV.消息管理_328.创建请求_350;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cn.edu.tju.scs.seql.ELV.common.WebDriverConfiguration;
import cn.edu.tju.scs.seql.final_ELV.commonOperations.CommonOperationsAll;

public class CommonOperations_创建请求_350 extends CommonOperationsAll {
	
	public CommonOperations_创建请求_350(){
		super();
	}
	
	public CommonOperations_创建请求_350(WebDriver driver){
		super(driver);
	}
	
	private String default_name = "ncfxy_camds";
	private String default_pwd = "000000";
	private String default_companyId = "123";
	
	/**
	 * 添加一条给定的CAMDS账户记录
	 */
	public void addOneCAMDSAccount(){
		getElement(ElementEnum_创建请求_350.添加CAMDS账号按钮).click();
		WebDriverConfiguration.operationInterval();
		String name = default_name;
		String pwd = default_pwd;
		String companyId = default_companyId;
		
		if(hasCAMDSRecord(name)){
			getElement(ElementEnum_创建请求_350.添加CAMDS窗口添加按钮).click();
		}else{
			getElement(ElementEnum_创建请求_350.添加CAMDS窗口用户名输入框).clear();
			getElement(ElementEnum_创建请求_350.添加CAMDS窗口用户名输入框).sendKeys(name);
			getElement(ElementEnum_创建请求_350.添加CAMDS窗口密码输入框).clear();
			getElement(ElementEnum_创建请求_350.添加CAMDS窗口密码输入框).sendKeys(pwd);	
			getElement(ElementEnum_创建请求_350.添加CAMDS窗口企业部门ID输入框).clear();
			getElement(ElementEnum_创建请求_350.添加CAMDS窗口企业部门ID输入框).sendKeys(companyId);
			getElement(ElementEnum_创建请求_350.添加CAMDS窗口添加按钮).click();
		}
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_创建请求_350.CAMDS账户输入框下拉按钮).click();
		WebDriverConfiguration.operationInterval();
		WebElement ncfxy_camds_tmp = getElement(ElementEnum_创建请求_350.CAMDS账户_ncfxy_camds选项);
		assertTrue(ncfxy_camds_tmp != null);
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 检查表格中是否有名字为name的CAMDS记录
	 * @param name
	 * @return
	 */
	public boolean hasCAMDSRecord(String name){
		List<WebElement> eles = getElements(ElementEnum_创建请求_350.添加CAMDS窗口使用记录所有行);
		for(int i = 1;i < eles.size();i++){
			WebElement line = driver.findElement(By.xpath(ElementEnum_创建请求_350.添加CAMDS窗口使用记录第一行用户名.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]")));
			String lineName = line.getText();
			if(lineName.equals(name)){
				line.click();
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 删除表格中是否有名字为name的CAMDS记录
	 * @param name
	 * @return
	 */
	public void deleteRecord(String name){
		List<WebElement> eles = getElements(ElementEnum_创建请求_350.添加CAMDS窗口使用记录所有行);
		for(int i = 1;i < eles.size();i++){
			WebElement line = driver.findElement(By.xpath(ElementEnum_创建请求_350.添加CAMDS窗口使用记录第一行用户名.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]")));
			String lineName = line.getText();
			if(lineName.equals(name)){
				line.click();
				getElement(ElementEnum_创建请求_350.添加CAMDS窗口删除按钮).click();
			}
		}
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 切换回新建消息目录
	 */
	public void changeBackToCreateQuest(){
		driver.switchTo().defaultContent();
		WebElement leftFrame=getElement(ElementEnum_创建请求_350.leftFrame);
		WebElement mainFrame=getElement(ElementEnum_创建请求_350.rightFrame);
		driver.switchTo().frame(leftFrame);
		WebDriverConfiguration.operationInterval();
		getElement(ElementEnum_创建请求_350.二级目录名称).click();
		WebDriverConfiguration.operationInterval();
	    driver.switchTo().defaultContent();
		
		driver.switchTo().frame(mainFrame);
	}
	
	/**
	 * 去除掉三个日期输入框的readonly限制
	 */
	public void deleteReadOnly() {
		getElement(ElementEnum_创建请求_350.截止日期输入框);
		getElement(ElementEnum_创建请求_350.报表日期输入框);
		getElement(ElementEnum_创建请求_350.制图日期输入框);
		
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_创建请求_350.截止日期输入框.getName()+"\");setDate.removeAttribute('readonly');");
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_创建请求_350.报表日期输入框.getName()+"\");setDate.removeAttribute('readonly');");
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+ElementEnum_创建请求_350.制图日期输入框.getName()+"\");setDate.removeAttribute('readonly');");
		
	}
	
	
	
	public void verifyTips(String expectTips){
		verifyTipsAndThenOperateButton(expectTips, 
				ElementEnum_创建请求_350.第一页提示信息, 
				ElementEnum_创建请求_350.第一页提示框确认按钮);
	}

	public String getDefault_name() {
		return default_name;
	}
	
	
	
}

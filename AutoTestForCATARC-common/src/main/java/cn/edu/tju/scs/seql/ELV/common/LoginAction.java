package cn.edu.tju.scs.seql.ELV.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginAction {
	
	private WebDriver driver;
	
	public LoginAction(WebDriver driver){
		this.driver = driver;
	}
	
	public static void loginAction(WebDriver driver, String baseUrl){
//		driver.get(ReadProperties.getSystemProperties().getProperty("browserType"));
//		driver.manage().window().maximize();
//		driver.findElement(By.id("loginName")).clear();
//		driver.findElement(By.id("loginName")).sendKeys("xtqx");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("654321");
//		driver.findElement(By.cssSelector("input.button_blue")).click();
		String defaultUserName = ReadProperties.getSystemProperties().getProperty("defaultUserName");
		String defaultPwd = ReadProperties.getSystemProperties().getProperty("defaultPwd");
		loginAction(driver, baseUrl, defaultUserName, defaultPwd);
	}
	
	public static void loginAction(WebDriver driver, String baseUrl, String username, String pwd){
		driver.get(ReadProperties.getSystemProperties().getProperty("loginURL"));
		driver.manage().window().maximize();
		if(ReadProperties.getSystemProperties().getProperty("testSystemName").equals("LIMS")){
			driver.findElement(By.id("loginName")).clear();
			driver.findElement(By.id("loginName")).sendKeys(username);
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys(pwd);
			driver.findElement(By.cssSelector("input.button_blue")).click();
		}else if(ReadProperties.getSystemProperties().getProperty("testSystemName").equals("ELV")){
			driver.findElement(By.id("userName")).clear();
		    driver.findElement(By.id("userName")).sendKeys(username);
		    driver.findElement(By.id("password")).clear();
		    driver.findElement(By.id("password")).sendKeys(pwd);
		    driver.findElement(By.cssSelector("div.loginOut")).click();
		}
	}
	
}

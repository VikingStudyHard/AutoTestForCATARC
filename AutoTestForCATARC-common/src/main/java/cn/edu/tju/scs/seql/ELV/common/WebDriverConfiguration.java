package cn.edu.tju.scs.seql.ELV.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WebDriverConfiguration {
	
	private static String driverType = ReadProperties.getSystemProperties().getProperty("browserType");
	
	public static Integer testCaseIndex = 0;
	
	/*
	下载文件的文件夹
	每一次下载前会先清空文件夹
	*/
	private static String downloadPath = " /Users/viking/Desktop/downdir";
	
	private static Object setDriverProfile(String browser){
		Object profile = null;
		if (browser.equals("firefox")){
			profile = new FirefoxProfile();
			((FirefoxProfile)profile).setPreference("browser.download.dir", downloadPath);
			((FirefoxProfile)profile).setPreference("browser.download.folderList", 2);
			((FirefoxProfile)profile).setPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream, application/msexcel, text/csv, application/zip");
		}
		else if (browser.equals("chrome")){
			//not finished
		}
		else if (browser.equals("ie")){
			profile = DesiredCapabilities.internetExplorer();
			((DesiredCapabilities) profile).setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			((DesiredCapabilities) profile).setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			((DesiredCapabilities) profile).setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING,false);
			((DesiredCapabilities) profile).setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
			((DesiredCapabilities) profile).setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, true);
			((DesiredCapabilities) profile).setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			((DesiredCapabilities) profile).setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true); 
			((DesiredCapabilities) profile).setJavascriptEnabled(true); 
		}
		else{
			profile = new FirefoxProfile();
			((FirefoxProfile)profile).setPreference("browser.download.dir", downloadPath);
			((FirefoxProfile)profile).setPreference("browser.download.folderList", 2);
			((FirefoxProfile)profile).setPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream, application/msexcel, text/csv, application/zip");
		}
		
		return profile;
	}
	
	public static void closeWebDriver(){
		try{
			if(driverType.toLowerCase().equals("firefox")){
				
			}else if(driverType.toLowerCase().equals("chrome")){
				Runtime runTime = Runtime.getRuntime();
				//chrome浏览器和driver
					runTime.exec("tskill chrome");
			    runTime.exec("tskill chromedriver");
			}else if(driverType.toLowerCase().equals("ie")){
				Runtime runTime = Runtime.getRuntime();
	
			    //如果使用了ie浏览器和driver     
			    runTime.exec("tskill iexplore");
			    //runTime.exec("tskill IEDriverServer");
			}else{
				
			}
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
		
		
	}
	
	public static WebDriver initWebDriver(){
		WebDriver driver = null;
		Object profile = setDriverProfile(driverType.toLowerCase());
		
		if(driverType.toLowerCase().equals("firefox")){
			System.setProperty("webdriver.firefox.bin", ReadProperties.getSystemProperties().getProperty("FirefoxPath"));
			driver = new FirefoxDriver((FirefoxProfile)profile);
		}else if(driverType.toLowerCase().equals("chrome")){
			System.setProperty("webdriver.chrome.driver",ReadProperties.getSystemProperties().getProperty("ChromeDriverPath"));
			driver = new ChromeDriver();
		}else if(driverType.toLowerCase().equals("ie")){
			System.setProperty("webdriver.ie.driver", ReadProperties.getSystemProperties().getProperty("IEDriverPath"));
//			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
//	        ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			driver = new InternetExplorerDriver((DesiredCapabilities)profile);
		}else{
			// 默认使用firefox浏览器测试
			System.setProperty("webdriver.firefox.driver", ReadProperties.getSystemProperties().getProperty("FirefoxPath"));
			driver = new FirefoxDriver((FirefoxProfile)profile);
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public static String getBaseURL(){
		return ReadProperties.getSystemProperties().getProperty("baseURL");
	}
	
	public static void operationInterval(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

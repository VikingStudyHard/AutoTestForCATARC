package cn.edu.tju.scs.seql.final_ELV.系统管理_330.部门信息_357;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cn.edu.tju.scs.seql.ELV.common.WebDriverConfiguration;

public class CommonFunction {
	public static boolean isLoading(WebElement body){
		return body.getAttribute("class").contains("x-masked");
	}
	
	public static void waitingForLoading(WebElement body){
		long startTime = System.currentTimeMillis();
		long currentTime = startTime;
		long duration = 15000;
		while (currentTime - startTime < duration){
			if (!isLoading(body)){
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			currentTime = System.currentTimeMillis();
		}
		if (currentTime - startTime >= duration){
			Assert.fail("系统等待超时");
		}
		WebDriverConfiguration.operationInterval();
	}
}

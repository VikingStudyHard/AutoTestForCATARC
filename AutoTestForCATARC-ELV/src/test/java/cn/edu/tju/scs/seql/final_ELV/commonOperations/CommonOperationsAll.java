package cn.edu.tju.scs.seql.final_ELV.commonOperations;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cn.edu.tju.scs.seql.ELV.common.ICallback;
import cn.edu.tju.scs.seql.ELV.common.Selenium_Test_Base;
import cn.edu.tju.scs.seql.ELV.common.WebDriverConfiguration;
import cn.edu.tju.scs.seql.element.ElementEnum;

/**
 * 该类保存跟具体的操作元素无关的操作
 *
 */
public class CommonOperationsAll  extends Selenium_Test_Base{
	
	public CommonOperationsAll(){
		super();
	}
	
	public CommonOperationsAll(WebDriver driver){
		super(driver);
	}
	
	/**
	 * 循环检测一个元素是否已经消失,即检测它的display属性是否为none
	 * 检查20次，每次的检查的等待时间是1秒
	 */
	public void judgeElementDisplayNone(ElementEnum ele){
		int times = 20;
		while(times > 0){
			if(getElement(ele) == null)return;
			if(!getElement(ele).isDisplayed()){
				return;
			}else{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			times--;
		}
		Assert.fail(ele.getName()+"载入时间过久，请检查");
	}
	
	
	
	/**
	 * 验证通过开始时间和终止时间搜索到的字符串是否满足结果
	 * @param startTime  	开始时间字符串
	 * @param endTime		结束时间字符串
	 * @param inputStart	开始时间输入框
	 * @param inputEnd		结束时间输入框
	 * @param searchButton	检索按钮
	 * @param allResult		得到的所有结果
	 * @param firstLineResult	对应的第一行结果
	 * @param tips				提示信息枚举
	 * @param judgeLoad			回调检查载入界面的函数
	 */
	public void testQueryByTime(String startTime, String endTime,
			ElementEnum inputStart, ElementEnum inputEnd, 
			ElementEnum searchButton, ElementEnum allResult, 
			ElementEnum firstLineResult, ElementEnum tips, ICallback judgeLoad){
		// 去掉输入框的readonly属性，直接输入起点时间和终点时间
		judgeLoad.callback();
		getElement(inputStart);
		getElement(inputEnd);
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+inputStart.getName()+"\");setDate.removeAttribute('readonly');");
		((JavascriptExecutor) driver).executeScript("var setDate=document.getElementById(\""+inputEnd.getName()+"\");setDate.removeAttribute('readonly');");
		
		getElement(inputStart).clear();
		getElement(inputStart).sendKeys(startTime);
		getElement(inputEnd).clear();
		getElement(inputEnd).sendKeys(endTime);
		getElement(searchButton).click();
		WebDriverConfiguration.operationInterval();
		judgeLoad.callback();
		
		verifyResultTimeSatisfy(startTime, endTime, allResult, firstLineResult, tips);
	}

	/**
	 * 验证结果中的时间是否在startTime和endTime之间
	 * @param startTime			起始时间
	 * @param endTime			终止时间
	 * @param allResult			得到的所有结果
	 * @param firstLineResult	对应的第一行结果
	 * @param tips				提示信息枚举
	 */
	public void verifyResultTimeSatisfy(String startTime, String endTime, ElementEnum allResult,
			ElementEnum firstLineResult, ElementEnum tips) {
		if(startTime.equals("")||startTime==null||endTime.equals("")||endTime==null){
			
		}else{
			if(startTime.compareTo(endTime) > 0){
				String displayValue = getElement(tips).getCssValue("display");
				assertTrue(!displayValue.equals("none"),"开始时间早于结束时间错误信息未显示");
				return;
			}
		}
		
		
		List<WebElement> eles = getElements(allResult);
		// 检查查询结果中是否包含所查关键字
		for(int i = 1;i < eles.size();i++){
			String xpath = firstLineResult.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String createTime = driver.findElement(By.xpath(xpath)).getText();
			assertTrue(startTime.equals("")||startTime==null?true:createTime.compareTo(startTime) > 0,"搜索结果小于起点时间");
			assertTrue(endTime.equals("")||endTime==null?true:createTime.compareTo(endTime) < 0,"搜索结果大于终点时间");
		}
	}
	
	
	/**
	 * 通过名字查询并验证中英文结果是否正确
	 * @param name				要查询的名字
	 * @param input				输入框
	 * @param searchButton		检索按钮
	 * @param allResult			检索得到的所有结果
	 * @param firstLineCH		第一行的中文结果
	 * @param firstLineEN		第一行的英文结果
	 */
	public void testQueryByGeneralName(String name, ElementEnum input, 
									ElementEnum searchButton, ElementEnum allResult, 
									ElementEnum firstLineCH, ElementEnum firstLineEN){
		getElement(input).clear();
		getElement(input).sendKeys(name);
		getElement(searchButton).click();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		WebDriverConfiguration.operationInterval();
		
		verifyAllSearchResult(name, allResult, firstLineCH, firstLineEN);
	}

	/**
	 * 验证搜索结果中是否都包含name
	 * @param name			要查询的名字
	 * @param allResult		检索得到的所有结果
	 * @param firstLineCH	第一行的中文结果
	 * @param firstLineEN	第一行的英文结果
	 */
	public void verifyAllSearchResult(String name, ElementEnum allResult, ElementEnum firstLineCH,
			ElementEnum firstLineEN) {
		List<WebElement> eles = getElements(allResult);
		// 检查查询结果中是否包含所查关键字
		for(int i = 1;i < eles.size();i++){
			String chXpath = firstLineCH.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String chName = driver.findElement(By.xpath(chXpath)).getText();
			String enXpath = firstLineEN.getName().replaceAll("tr\\[2\\]", "tr["+(i+1)+"]");
			String enName = driver.findElement(By.xpath(enXpath)).getText();
			assertTrue(chName.contains(name) || enName.contains(name),
					chName + " or " + enName + "\n not contains "+ name);
		}
		WebDriverConfiguration.operationInterval();
	}
	
	
	/**
	 * 验证是否显示了预期的提示信息，并点击给定的按钮
	 * @param expectTip			预期提示信息
	 * @param tipEle			提示信息的页面枚举元素
	 * @param operateButton		要操作的Button
	 */
	public void verifyTipsAndThenOperateButton(String expectTip, ElementEnum tipEle, ElementEnum operateButton){
		assertTrue(getElement(tipEle).getText().contains(expectTip),
				"expected:"+expectTip+"\n but the real is:" + getElement(tipEle).getText());
		getElement(operateButton).click();
		WebDriverConfiguration.operationInterval();
	}
	
	/**
	 * 切换到下一个窗口
	 */
	public void switchToNextWindow(){
		//得到当前窗口的句柄 
	     String currentWindow = driver.getWindowHandle();
	    //得到所有窗口的句柄
	    Set<String> handles = driver.getWindowHandles();
	    //不包括当前窗口
	    handles.remove(currentWindow);
	   //判断是否存在窗口
	    System.out.println(handles.size());
	      if (handles.size() > 0) {
	                try{
	          //定位窗口
	          driver.switchTo().window(handles.iterator().next());
	          }catch(Exception e){
	                         System.out.println(e.getMessage());
	               }
	          }
	}
	
	/**
	 * 删除ele元素的readonly属性
	 * @param ele
	 */
	public void deleteReadOnly(ElementEnum ele){
		String script = "var setDate=document.getElementById(\""+ele.getName()+"\");setDate.removeAttribute('readonly');";
		((JavascriptExecutor) driver).executeScript(script);
	}
	
	
	public boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  public boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  public String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	
	

	@Override
	public void testNg() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDescription() {
		return "封装该项目下所有测试用例的共有操作";
	}

}

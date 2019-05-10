package cn.edu.tju.scs.seql.ELV.common;

import cn.edu.tju.scs.seql.element.ByEnum;
import cn.edu.tju.scs.seql.element.ElementEnum;
import cn.edu.tju.scs.seql.element.WebElementManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import javax.swing.*;
import java.awt.*;
import java.util.List;

import static org.testng.Assert.fail;

/**
 * 这里添加一些注释
 *
 */
public abstract class Selenium_Test_Base {
	
	protected WebDriver driver;
	protected String baseUrl;
	protected boolean acceptNextAlert = true;
	protected StringBuffer verificationErrors = new StringBuffer();
	protected JFrame frame;
	protected boolean showFrame = false;
	
	public Selenium_Test_Base(WebDriver driver) {
		this.driver= driver;
	}
	
	public Selenium_Test_Base() {
		super();
	}
	
	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		System.out.println("执行到第"+(++WebDriverConfiguration.testCaseIndex)+"个测试用例");
		if(showFrame)openFrame();
		driver = WebDriverConfiguration.initWebDriver();
		baseUrl = WebDriverConfiguration.getBaseURL();
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		if(showFrame)closeFrame();
		driver.quit();
		WebDriverConfiguration.closeWebDriver();
	    
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
	
	/**
	 * 打开一个frame来显示当前在测试哪一个测试用例
	 */
	public void openFrame(){
		frame = new JFrame();
        JPanel panel = new JPanel();
        JTextArea textArea = new JTextArea();
        
        panel.setLayout(new GridLayout());
        
        Class c = this.getClass();
        
        String display = "正在测试："+c.getSimpleName()+"\n";
        try {
			display = display + ((Selenium_Test_Base)c.newInstance()).getDescription();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
        
        textArea.setText(display);  
        
        //当TextArea里的内容过长时生成滚动条  
        panel.add(new JScrollPane(textArea));
        frame.add(panel);  
          
        frame.setSize(800,600);  
        frame.setVisible(true); 
	}
	
	/**
	 * 关闭显示测试用例信息的frame
	 */
	public void closeFrame(){
		frame.dispose();
	}
	
	/**
	 * 根据枚举类获取一个元素
	 * @param enumEle
	 * @return
	 */
	public WebElement getElement(ElementEnum enumEle){
		return WebElementManager.getWebElement(driver, enumEle);
	}
	
	/**
	 * 根据枚举类获取一系列元素
	 * @param enumEle
	 * @return
	 */
	public List<WebElement> getElements(ElementEnum enumEle){
		return WebElementManager.getWebElements(driver, enumEle);
	}
	
	/**
	 * 获取table中的第lineNumber行的元素。</br>
	 * 使用该函数需要满足以下条件：</br>
	 * （1）元素使用xpath定位</br>
	 * （2）第一行元素中是tr[2]，以后行依次是tr[lineNumber+1]
	 * @param firstLineEnumEle	该列第一行的元素
	 * @param lineNumber		行号
	 * @return
	 */
	public WebElement getTableElement(ElementEnum firstLineEnumEle, int lineNumber){
		if(!firstLineEnumEle.getByWhat().equals(ByEnum.ByXPath)){
			return null;
		}
		WebElement result = null;
		try{
		result = driver.findElement(By.xpath(firstLineEnumEle.getName().replaceAll("tr\\[2\\]", "tr["+(lineNumber+1)+"]")));
		}catch(NoSuchElementException ex){
			result = null;
		}
		return result;
	}
	
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public abstract void testNg() throws Exception;
	
	public abstract String getDescription();

}

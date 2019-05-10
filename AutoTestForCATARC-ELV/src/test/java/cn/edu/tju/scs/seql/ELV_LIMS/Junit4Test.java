package cn.edu.tju.scs.seql.ELV_LIMS;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Junit4Test {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver();
        baseUrl = "http://60.30.69.61:8290/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testJunit4Second() throws Exception {
        driver.get(baseUrl + "/CESEMDMSV3/login/loginAction.action");
        driver.manage().window().maximize();
        driver.findElement(By.id("userName")).clear();
        driver.findElement(By.id("userName")).sendKeys("admin4");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("000000");
        driver.findElement(By.cssSelector("div.loginOut")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | leftFrame | ]]
        WebElement leftFrame=driver.findElement(By.name("leftFrame"));
        driver.switchTo().frame(leftFrame);
        driver.findElement(By.id("tool-1037-toolEl")).click();
        driver.findElement(By.linkText("整车RRR计算")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=mainFrame | ]]
        driver.switchTo().parentFrame();
        WebElement mainFrame=driver.findElement(By.name("mainFrame"));
        driver.switchTo().frame(mainFrame);
        driver.findElement(By.id("bname-inputEl")).clear();
        driver.findElement(By.id("bname-inputEl")).sendKeys("qweq");
        driver.findElement(By.id("button-1011-btnEl")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("tr.x-grid-row:nth-child(2)")).click();;
        driver.findElement(By.id("gotoBomPage-btnEl")).click();
        ((JavascriptExecutor) driver).executeScript("window.showModalDialog = window.open;");
        driver.findElement(By.id("recycling-btnEl")).click();

        Thread.sleep(1000);
        System.out.println(driver.getWindowHandles().size());
        String[] handles=new String[driver.getWindowHandles().size()];
        driver.getWindowHandles().toArray(handles);
        driver.switchTo().window(handles[1]);

        assertEquals("请选择需要提交回收利用判定信息的零部件：", driver.getTitle());
        driver.findElement(By.id("button-1014-btnEl")).click();
        try {
            assertEquals("CA_5_17327869", driver.findElement(By.xpath("//div[@id='gridview-1025']/table/tbody/tr[2]/td[6]/div")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
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
}

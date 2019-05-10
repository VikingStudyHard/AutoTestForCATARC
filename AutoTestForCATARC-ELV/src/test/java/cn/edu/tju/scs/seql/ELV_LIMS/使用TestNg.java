package cn.edu.tju.scs.seql.ELV_LIMS;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import cn.edu.tju.scs.seql.ELV.common.LoginAction;
import cn.edu.tju.scs.seql.ELV.common.WebDriverConfiguration;

public class 使用TestNg {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = WebDriverConfiguration.initWebDriver();
        baseUrl = WebDriverConfiguration.getBaseURL();
    }

    String leftId = "tool-1037-toolEl";
    String itemName = "整车RRR计算";

    @Test
    public void testNg() throws Exception {
        LoginAction.loginAction(driver,baseUrl);

        WebElement leftFrame=driver.findElement(By.name("leftFrame"));
        driver.switchTo().frame(leftFrame);

        driver.findElement(By.id("tool-1037-toolEl")).click();
        driver.findElement(By.linkText("整车RRR计算")).click();

        //driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();


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

    @AfterClass(alwaysRun = true)
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

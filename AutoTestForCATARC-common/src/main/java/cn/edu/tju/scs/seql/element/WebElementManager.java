package cn.edu.tju.scs.seql.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * 对该package下的页面建模，供测试用例调用
 */
public class WebElementManager {

	WebDriver driver;

	public WebElementManager(WebDriver driver) {
		super();
		this.driver = driver;
	}

	/**
	 * 通过ElementEnum中记录的信息获取Web页面元素
	 */
	public static WebElement getWebElement(WebDriver driver, ElementEnum enumEle) {
		WebElement web = null;
		try {
			switch (enumEle.getByWhat()) {
			case ById:
				web = driver.findElement(By.id(enumEle.getName()));
				break;
			case ByName:
				web = driver.findElement(By.name(enumEle.getName()));
				break;
			case ByClassName:
				web = driver.findElement(By.className(enumEle.getName()));
				break;
			case ByCssSelector:
				web = driver.findElement(By.cssSelector(enumEle.getName()));
				break;
			case ByLinkText:
				web = driver.findElement(By.linkText(enumEle.getName()));
				break;
			case ByPartialLinkText:
				web = driver.findElement(By.partialLinkText(enumEle.getName()));
				break;
			case ByTagName:
				web = driver.findElement(By.tagName(enumEle.getName()));
				break;
			case ByXPath:
				web = driver.findElement(By.xpath(enumEle.getName()));
				break;
			default:
				web = null;
				break;
			}
		} catch (org.openqa.selenium.NoSuchElementException ex) {
			web = null;
		}
		return web;
	}

	/**
	 * 通过ElementEnum中记录的信息获取Web页面元素
	 */
	public static List<WebElement> getWebElements(WebDriver driver, ElementEnum enumEle) {
		List<WebElement> web = null;
		try {
			switch (enumEle.getByWhat()) {
			case ById:
				web = driver.findElements(By.id(enumEle.getName()));
				break;
			case ByName:
				web = driver.findElements(By.name(enumEle.getName()));
				break;
			case ByClassName:
				web = driver.findElements(By.className(enumEle.getName()));
				break;
			case ByCssSelector:
				web = driver.findElements(By.cssSelector(enumEle.getName()));
				break;
			case ByLinkText:
				web = driver.findElements(By.linkText(enumEle.getName()));
				break;
			case ByPartialLinkText:
				web = driver.findElements(By.partialLinkText(enumEle.getName()));
				break;
			case ByTagName:
				web = driver.findElements(By.tagName(enumEle.getName()));
				break;
			case ByXPath:
				web = driver.findElements(By.xpath(enumEle.getName()));
				break;
			default:
				web = null;
				break;
			}
		} catch (org.openqa.selenium.NoSuchElementException ex) {
			web = null;
		}
		return web;
	}

}

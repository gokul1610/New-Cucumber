package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void LaunchChromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Gokul\\Java\\Chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	public static void LoadUrl(String url) {
		driver.get(url);
		
	}
	
	public static void fill(WebElement element, String value) {
		element.sendKeys(value);
		
	}
	
	public static void BtnClick(WebElement element) {
		element.click();
		
	}

}

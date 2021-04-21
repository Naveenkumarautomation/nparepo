package com.npa.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.npa.util.TimeUtil;

public class NpaTestBase {
	
	public static WebDriver driver;
	static String driverPath = "C:\\SeleniumWebDrivers\\chromedriver.exe";
	
	public static void Home_Page_Launch() throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TimeUtil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TimeUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("http://sams-ttipl.ddns.net/login");
		Thread.sleep(2000);
		String expectedTitle = "SPORTS & ACTIVITY MANAGEMENT SOFTWARE";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

}
	public static void main(String[] args) throws IOException, InterruptedException 
    { 
		Home_Page_Launch();
    } 

}

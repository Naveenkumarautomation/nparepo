package com.npa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.npa.util.TimeUtil;


public class NpaLoginPage extends NpaTestBase {
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginBtn;
	
	public NpaLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String un, String pwd) throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(TimeUtil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TimeUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		username.sendKeys(un);
		Thread.sleep(2000);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		loginBtn.click();
		Thread.sleep(2000);
		
	}

}

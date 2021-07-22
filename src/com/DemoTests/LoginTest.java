package com.DemoTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qmetry.qaf.automation.step.WsStep;
import com.wordPress.LoginPage;

import BrowserLauncher.BrowserClass;

public class LoginTest {
  
	
	
	@Test
	public void verifyLogin() {
		WebDriver driver = BrowserClass.launchBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");

		LoginPage log = PageFactory.initElements(driver, LoginPage.class);
		
		log.login("admin", "demo123");	
		
		driver.quit();
		}
	
	@AfterMethod
	public void quitBroser() {
		
	}
}

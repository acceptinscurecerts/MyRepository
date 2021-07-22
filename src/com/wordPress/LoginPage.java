package com.wordPress;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	 public LoginPage(WebDriver ldriver){
		ldriver = this.driver;
		
	}
	
	 
	
	@FindBy(id = "user_login") 
	WebElement username;
	
	@FindBy(id = "user_pass")
	WebElement Password;
	
	@FindBy(id = "wp-submit")
	WebElement loginBtn;
	
	@FindBy(xpath="//*[@id=\'nav\']/a")
	WebElement forgotPasswdLink;
	
	public void login(String uid, String passwd) {
		username.sendKeys(uid);
		Password.sendKeys(passwd);
		loginBtn.click();
	}

}

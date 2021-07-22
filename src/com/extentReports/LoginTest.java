package com.extentReports;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.lang.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LoginTest {
	  public String reportPath = ".\\Reports\\ExtentReports.html";
	  String driverPath = "C:\\Users\\91973\\Downloads\\chromedriver.exe";
	  String screenCapture = ".\\Screenprints\\test.png";
	  ExtentHtmlReporter reporter  = new ExtentHtmlReporter(reportPath);
	  ExtentReports extent  = new ExtentReports();
	  ExtentTest logger;
	  WebDriver driver;
	  @BeforeClass
	  public void preConditions() {
		  System.setProperty("webdriver.chrome.driver", driverPath);
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		  driver.get("http://demosite.center/wordpress/wp-login.php");
		  
	  }
	
	  @Test(priority = 1)
	  public void loginTest() {
		extent.attachReporter(reporter);
		
		logger = extent.createTest("Login Test");
		
		
		
		
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("demo123");
		driver.findElement(By.id("wp-submit")).click();
		logger.log(Status.PASS, "login is successful");
		String title = driver.getTitle();
	
		if(title.contains("Wordpresser")) {
			System.out.println("Test Passed");
			logger.log(Status.PASS, "Test case Passed");
		}
		else {
			logger.log(Status.FAIL, "Test Case Failed");
			try {
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(screenCapture));
			logger.addScreenCaptureFromPath(screenCapture);	
			} 
			catch (IOException e) {
					e.getMessage();
			}
		}
	  }
	  
	  @Test(description = "Test extent Report", priority = 2)
	  public void dummyTest() {
		  System.out.println("Second Test");
		  
			extent.attachReporter(reporter);
			logger = extent.createTest("Dummy Test");
			logger.log(Status.INFO, "This is dummy test");
			logger.log(Status.PASS, "Passed");
	  }
	  
	  @AfterClass
	  public void postConditions() {
		  extent.flush();

		  driver.quit();
	  }
	  
}

package BrowserLauncher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserClass {
	static WebDriver driver;
	public static WebDriver launchBrowser(String browserName, String url) {
		
		if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91973\\Downloads\\chromedriver.exe");
			DesiredCapabilities ds = new DesiredCapabilities();
			ds.setCapability(CapabilityType.BROWSER_NAME, "Chrome Browser");
			ds.acceptInsecureCerts();
			driver = new ChromeDriver(ds);
			
		}
		else if(browserName.equals("IE")) {
			driver = new InternetExplorerDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		
		
	return driver;	
	}
	
}

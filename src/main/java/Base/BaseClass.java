package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import automation.project.utilities.Utilities;

public class BaseClass {
	protected WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		Utilities.initGlobalConfiguration();
		String browserName = Utilities.getBrowserName();
		if(browserName.equals("Chrome")) {
			
			driver = new ChromeDriver();
		}
		
		else {
			Reporter.log("Incorrect browser selection");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
		driver.get(Utilities.getBaseUrl());
	}
	
	@AfterMethod
	public void closeBrowserSession() {
		
		driver.quit();
	}

}

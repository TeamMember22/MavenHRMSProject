package HRMS.BasePage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import HRMS.Utils.CommonUtils;

public class BasePage {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {		
		CommonUtils.readPropertiesFile();
		CommonUtils.launchBrowserAndNavigateToApp();
		
	}
	
	@AfterTest
	public void close() {
		driver.quit();
		
	}

}

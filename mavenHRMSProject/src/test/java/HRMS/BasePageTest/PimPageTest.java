package HRMS.BasePageTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import HRMS.BasePage.BasePage;
import HRMS.Pages.LoginPage;
import HRMS.Pages.PimPage;

public class PimPageTest extends BasePage {
	
	WebDriver driver;
	
	LoginPage loginPage = new LoginPage();
	PimPage pimPage = new PimPage();
	
	@Test(description="Verify that an employee can be added successfully", priority=0)
	public void addEmployee() {
		
		loginPage.login();
		
	}
	
	

}

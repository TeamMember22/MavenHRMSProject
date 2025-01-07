package HRMS.BasePageTest;

import org.testng.annotations.Test;

import HRMS.BasePage.BasePage;
import HRMS.Pages.LoginPage;

public class LoginPageTest extends BasePage{
	LoginPage login = new LoginPage();
	
	
	
	@Test
	void verifyLogin() {
		login.login();
		
	}

}

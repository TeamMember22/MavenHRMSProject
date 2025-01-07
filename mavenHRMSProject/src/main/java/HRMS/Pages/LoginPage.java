package HRMS.Pages;

import java.util.Properties;

import org.openqa.selenium.By;

import HRMS.Utils.CommonUtils;

public class LoginPage {
	
	public static Properties properties;
	//Web locators
	private final By by_username = By.xpath("//input[@name=\"txtUserName\"]");
	private final By by_password = By.xpath("//input[@name=\"txtPassword\"]");
	private final By by_signin = By.xpath("//input[@name=\"Submit\"]");
	
	public void login() {
		try {
			CommonUtils.enterValue(getUsername(), "Vamshi", true);
			CommonUtils.enterValue(getPassword(), "Vamshi", true);
			CommonUtils.clickElement(getSignin());
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private By getUsername() {
		// TODO Auto-generated method stub
		return by_username;
	}
	
	private By getPassword() {
		// TODO Auto-generated method stub
		return by_password;
	}
	
	private By getSignin() {
		// TODO Auto-generated method stub
		return by_signin;
	}

}

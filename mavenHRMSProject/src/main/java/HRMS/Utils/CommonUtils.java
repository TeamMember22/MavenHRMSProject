package HRMS.Utils;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {
	//In this class i will be keeping all the reusable functions with respective entire project
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties config;
	public static FileInputStream fis;
	//public static final String configFilePath = "D:\\Java files\\Selenium projects\\mavenHRMSProject\\src\\test\\resource\\config.properties"
	
	//This method loads the application's configuration settings from a properties
	public static void readPropertiesFile() {
		try {
			//fis = new FileInputStream(System.getProperty("user.dir") + configFilePath);
			fis = new FileInputStream("D:\\Java files\\Selenium projects\\mavenHRMSProject\\src\\test\\resource\\config.properties");
			config = new Properties();
			config.load(fis);			
		}
		catch (Exception e) {
			//TestNGUtils.assertFail(e.getMessage());
			System.out.println(e.getMessage());	
		}
	}
	
	public static void launchBrowserAndNavigateToApp() {
		WebDriver driver = null;
		try {
			String browserName = config.getProperty("browser");
			
			if(browserName.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.get(config.getProperty("WebPageUrl"));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login() {
		try {
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void enterValue(By by, String value, boolean isClear) {
		// TODO Auto-generated method stub
		try {
			if(isClear) {
				clearWholeText(by);
			}
			findElement(by).sendKeys(value);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());	
		}
	}

	private static void clearWholeText(By by) {
		// TODO Auto-generated method stub
		try {
			findElement(by).sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static WebElement findElement(By by) {
		// TODO Auto-generated method stub
		WebElement element = null;
		try {
			element = driver.findElement(by);
			return element;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return element;
	}

	public static void clickElement(By by) {
		// TODO Auto-generated method stub
		try {
			findElement(by).click();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}

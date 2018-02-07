package lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.ContactUsPage;

/* Navigating to a URL.
@author Srini*/

public class BrowserFunctions {	 
	private static WebDriver driver;
	// setting up chrome browser and navigating to the url.
	public static void navigateUrl(String url){
		System.setProperty("webdriver.chrome.driver", "/home/ajay/Srini/libraryFIlesSelenium/Srini/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		PageFactory.initElements(driver, ContactUsPage.class);
	}
	// method to close the browser
	public static void closeBrowser(){
		driver.close();
	}
	
	// method to refresh the browser
	public static void refreshBrowser(){
		System.out.println("Refresing the browser...");
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
	}
}

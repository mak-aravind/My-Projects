package CommonMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import PageObjects.QaWorks;

/* Navigating to a URL.
@author Srini*/

public class BrowserFunctions {	 
	private static WebDriver driver;
	public static void navigateUrl(String url){
		// Setting up chrome driver.
		System.setProperty("webdriver.chrome.driver", "/home/ajay/Srini/libraryFIlesSelenium/Srini/ChromeDriver/chromedriver");
		//invoking chrome and navigating to the URL.
		driver = new ChromeDriver();
		// Navigating to qaworks website.
		driver.get(url);
		// Waiting for all the WebElements to be displayed.
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		//Initializing web objects.
		PageFactory.initElements(driver, QaWorks.class);
	}
	// method to close the browser
	public static void closeBrowser(){
		driver.close();
	}
	
	// method to refresh the browser
	public static void refreshBrowser(){
		System.out.println("Refresing the browser...");
		driver.navigate().refresh();
		// Waiting for all the WebElements to be displayed.
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
	}
}

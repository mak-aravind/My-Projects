package PageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/* Page Objects for COntact us webpage.
@author Srini*/

public class QaWorks {
	@FindBy (xpath = "//li[@role='menuitem']")
	private static WebElement menuItemList;
	
	@FindBy (css = "input[type=\"text\"][name=\"your-name\"]")
	private static WebElement nameTextBox;
	
	@FindBy (css = "input[type=\"email\"][name=\"your-email\"]")
	private static WebElement emailTextBox;
	
	@FindBy (css = "input[type=\"text\"][name=\"your-company\"]")
	private static WebElement subjectTextBox;
	
	@FindBy (css = "textarea[name=\"your-message\"]")
	private static WebElement messageTextBox;
	
	@FindBy(xpath = "//*[@class = 'wpcf7-form-control-wrap your-name']")
	private static WebElement nameAlert;
	
	@FindBy (xpath = "//*[@class = 'wpcf7-form-control-wrap your-email']")
	private static WebElement emailAlert;
	
	@FindBy(xpath = "//*[@class = 'wpcf7-form-control-wrap your-message']")
	private static WebElement messageAlert;
	
	@FindBy (xpath = "//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-mail-sent-ok fusion-alert'][@role='alert']")
	private static WebElement messageSent;
	
	@FindBy (xpath = "//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-validation-errors fusion-alert'][@role='alert']")
	private static WebElement resubmitValidate;
	
	@FindBy (id = "contact-us-send")
	private static WebElement sendButton;
	
	// to click the menu item in qaworks.com
	public static void clickMenuItem(String menuItem){
		menuItemList.findElement(By.xpath("//span[text()='" + menuItem + "']")).click();
	}
	
	// to set the name in contact us page.
	public static void setName(String name){
		nameTextBox.clear();
		nameTextBox.sendKeys(name);
	}
	
	// to set the email in contact us page.
	public static void setEmail(String email){
		emailTextBox.clear();
		emailTextBox.sendKeys(email);
	}
	
	// to set the subject in contact us page.
	public static void setSubject(String subject){
		subjectTextBox.clear();
		subjectTextBox.sendKeys(subject);
	}
	
	// to set the message in contact us page.
	public static void setMessage(String message){
		messageTextBox.clear();
		messageTextBox.sendKeys(message);
	}
	
	// to click the send button.
	public static void clickSendButton(){
		sendButton.click();
	}
	
	// to verify if the correct message is displayed after clicking saved button.
		public static boolean isSentSuccessfullyMessagePresent(){
			String expectedMessage = "THANK YOU FOR YOUR MESSAGE.";
			String actualMessage;
			try{
				actualMessage = (messageSent.getText().substring(2));
			}catch (Exception e){
				return false;
			}
			if (actualMessage.equals(expectedMessage)){
				return true;
			}
			return false;
		}
	
	//Validate the resubmit message in Contact Us page.	
	public static void validateResubmitMessage(){
		try{
				TimeUnit.SECONDS.sleep(1);
				if (resubmitValidate.isDisplayed()){
					System.out.println("Resubmit alert message is dispalyed, Pass.");
				}
		}catch (Exception e){
			System.out.println("Resubmit alert message is not dispalyed for the given input, Fail.");
		}
	}
	
	//Validate the name field in Contact Us page.	
		public static void validateNameField(){
			try{
					TimeUnit.SECONDS.sleep(1);
					if (nameAlert.findElement(By.cssSelector("span[role=\"alert\"][class=\"wpcf7-not-valid-tip\"]")).isDisplayed()){
						System.out.println("Name field is validated, Pass.");
					}
			}catch (Exception e){
				System.out.println("Name field is not validated, Fail.");
			}
		}
		
		//Validate the Email field in Contact Us page.	
				public static void validateEmailField(){
					try{
							TimeUnit.SECONDS.sleep(1);
							if (emailAlert.findElement(By.cssSelector("span[role=\"alert\"][class=\"wpcf7-not-valid-tip\"]")).isDisplayed()){
								System.out.println("Email field is validated, Pass.");
							}
					}catch (Exception e){
						System.out.println("Email field is not validated, Fail");
					}
				}
				
		//Validate the Message field in Contact Us page.	
		public static void validateMessageField(){
			try{
					TimeUnit.SECONDS.sleep(1);
					if (messageAlert.findElement(By.cssSelector("span[role=\"alert\"][class=\"wpcf7-not-valid-tip\"]")).isDisplayed()){
						System.out.println("Message field is validated, Pass.");
					}
			}catch (Exception e){
				System.out.println("Message field is not validated, Fail.");
			}
		}
}
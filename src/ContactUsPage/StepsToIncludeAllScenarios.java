package ContactUsPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import CommonMethods.*;
import PageObjects.*;

/* Step Definition for Vaid Submission scenario.
@author Srini*/

public class StepsToIncludeAllScenarios{				
    
	// Navigate to CONTACT US page in qaworks.com
    @Given("^I am on the QAWorks Site$")				
    public void I_am_on_the_QAWorks_Site() throws Throwable							
    {		
        System.out.println("This Step opens the chrome and launches the application.");
        BrowserFunctions.navigateUrl("http://www.qaworks.com/");
        NavigateToMenu.navigateMenu();
        System.out.println("Navigated to contact us page");
    }		
    
    // set the name, email, subject & message in Get in Touch section.Send the details and verify the success message and close the browser.					
    @When("^I should be able to enter the below in Contact US page and Send the message$")
    public void I_should_be_able_to_enter_the_below_in_Contact_US_page_and_Send_the_message(DataTable contactUsDetails) throws Throwable 							
    {
    	//List<Map<String,String>> data = contactUsDetails.asMaps(String.class,String.class);
    	for (Map<String, String> data : contactUsDetails.asMaps(String.class, String.class)) {
    		String name = (data.get("name"));
    		String email = (data.get("email"));
    		String subject = (data.get("subject"));
    		String message = (data.get("message"));
    		String expectedResultFlag = (data.get("expected results flag"));
    		System.out.println("Testing for inputs: " + name + ", " + email + ", " + subject + ", " + message);
    		QaWorks.setName(name);
            QaWorks.setEmail(email);
            QaWorks.setSubject(subject);
            QaWorks.setMessage(message);
    		QaWorks.clickSendButton();
    	    System.out.println("clicked on the send button.");
    	 // Forcing to wait for the message to appear.
			TimeUnit.SECONDS.sleep(5);
    	    ValidateFields.validateTextFields(expectedResultFlag);  
    	    BrowserFunctions.refreshBrowser();
    	}
    }		
    
    // close the browser.
    @Then("^close the browser$")					
    public void I_Send_the_message() throws Throwable 							
    {    		
    	System.out.println("closing the browser");
        BrowserFunctions.closeBrowser();
    }	
    
}
package test;

import java.util.List;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;	
import lib.*;
import pageObjects.*;

/* Step Definition for Vaid Submission scenario.
@author Srini*/

public class ECSRequirement{				
    
	// Navigate to CONTACT US page in qaworks.com
    @Given("^Given I am on the QAWorks Site$")				
    public void Given_I_am_on_the_QAWorks_Site() throws Throwable							
    {		
        System.out.println("This Step opens the chrome and launches the application.");
        BrowserFunctions.navigateUrl("http://www.qaworks.com/");
        NavigateToMenu.navigateMenu();
        System.out.println("Navigated to contact us page");
    }		
    
    // set the name, email, subject & message in Get in Touch section.
    @When("^I should be able to contact QAWorks with the following information$")					
    public void I_should_be_able_to_contact_QAWorks_with_the_following_information(DataTable contactUsDetails) throws Throwable 							
    {		
    	List<List<String>> data = contactUsDetails.raw();
    	ContactUsPage.setName(data.get(0).get(1));
    	ContactUsPage.setEmail(data.get(1).get(1));
    	ContactUsPage.setSubject(data.get(2).get(1));
    	ContactUsPage.setMessage(data.get(3).get(1));
        System.out.println("name,email,subject&message entered.");
    }		
    
    // Send the details and verify the success message and close the browser.
    @Then("^Send the message$")					
    public void Send_the_message() throws Throwable 							
    {    		
    	ContactUsPage.clickSendButton();
        System.out.println("clicked on the send button.");
        boolean isSentCorrectly = ContactUsPage.isSentSuccessfullyMessagePresent();
        if (isSentCorrectly) System.out.println("Message detail is sent successfully");
        else { System.out.println("Message detail is not sent successfully");}
        System.out.println("Closing the browser.");
        BrowserFunctions.closeBrowser();
    }		
}
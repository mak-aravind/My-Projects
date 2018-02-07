package lib;

import pageObjects.ContactUsPage;

public class ValidateFields {
	// method to validate different fields within contact us page.
	public static void validateTextFields(String expectedResult) throws Exception{
		switch (expectedResult) {
		case "Valid": 
			boolean isSentCorrectly = ContactUsPage.isSentSuccessfullyMessagePresent();
            if (isSentCorrectly) System.out.println("Message detail is sent successfully, Pass.");
            else { System.out.println("Message detail is not sent successfully, Fail.");}
            break;
		case "Invalid Name":
			ContactUsPage.validateResubmitMessage();
			ContactUsPage.validateNameField();
			break;
		case "Invalid Email":
			ContactUsPage.validateResubmitMessage();
			ContactUsPage.validateEmailField();
			break;
		case "Invalid Message":
			ContactUsPage.validateResubmitMessage();
			ContactUsPage.validateMessageField();
			break;
		case "Invalid Name and message":
			ContactUsPage.validateResubmitMessage();
			ContactUsPage.validateNameAndMessageField();
			break;
		case "Invalid Name and email and message":
			ContactUsPage.validateResubmitMessage();
			ContactUsPage.validateNameAndMessageAnEmailField();
			break;
		case "Invalid Name and email":
			ContactUsPage.validateResubmitMessage();
			ContactUsPage.validateNameAndEmailField();
			break;
		case "Invalid email and message":
			ContactUsPage.validateResubmitMessage();
			ContactUsPage.validateEmailAndMessageField();
			break;
		}
	}
}
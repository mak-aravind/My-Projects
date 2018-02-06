package ContactUsPage;

import PageObjects.QaWorks;

public class ValidateFields {
	
	public static void validateTextFields(String expectedResult){
		switch (expectedResult) {
		case "Valid": 
			boolean isSentCorrectly = QaWorks.isSentSuccessfullyMessagePresent();
            if (isSentCorrectly) System.out.println("Message detail is sent successfully, Pass.");
            else { System.out.println("Message detail is not sent successfully, Fail.");}
            break;
		case "Invalid Name":
			QaWorks.validateResubmitMessage();
			QaWorks.validateNameField();
			break;
		case "Invalid Email":
			QaWorks.validateResubmitMessage();
			QaWorks.validateEmailField();
			break;
		case "Invalid Message":
			QaWorks.validateResubmitMessage();
			QaWorks.validateMessageField();
			break;
		}
	}
}
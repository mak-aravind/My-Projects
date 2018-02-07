package lib;

import pageObjects.ContactUsPage;

/* Navigating to Menu in qaworks webpage.
@author Srini*/

public class NavigateToMenu {
	//invoking method to navigate to CONTACT US menu in qaworks website.
	public static void navigateMenu(){
		ContactUsPage.clickMenuItem("CONTACT US");
	}
}

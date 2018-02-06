package CommonMethods;

import PageObjects.QaWorks;

/* Navigating to Menu in qaworks webpage.
@author Srini*/

public class NavigateToMenu {
	public static void navigateMenu(){
		//invoking method to navigate to CONTACT US menu in qaworks website.
		QaWorks.clickMenuItem("CONTACT US");
	}
}

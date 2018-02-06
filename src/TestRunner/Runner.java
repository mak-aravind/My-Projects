package TestRunner;		

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

/*Test runner class
@author Srini*/

@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",glue={"ContactUsPage"})						
public class Runner 				
{		

}

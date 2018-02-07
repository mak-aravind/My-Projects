package core;		

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

/*Test runner class
@author Srini*/

@RunWith(Cucumber.class)				
@CucumberOptions(features="features",glue={"test"})						
public class TestRunner 				
{		

}
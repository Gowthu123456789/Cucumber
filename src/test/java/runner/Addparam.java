package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//if we want to run all features give path till feature
@CucumberOptions(features = "src\\test\\resources\\features\\addparam.feature",glue = "stepDefinations")
public class Addparam extends AbstractTestNGCucumberTests
{
	
	
}

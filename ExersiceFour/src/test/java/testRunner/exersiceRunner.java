package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/feature/featureFiles/automation.feature", glue = "stepsDefinitions"

)
public class exersiceRunner extends AbstractTestNGCucumberTests {

}

package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:/Eclips/FreeCRMBDDFramework/src/test/java/Features/Contact.feature", //Path of feature file
		glue={"stepDefinition"}, // Path of step definition file
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml "},
       monochrome = true, //Display the console output in a proper format
       strict = false, // It will fail execution if there are any undefined or  pending steps are there
		dryRun = false // check mapping between feature file and step definition file
)

public class TestRunner {

}

package FbTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "D:\\Eclips\\FacebookBDDFramework\\src\\test\\java\\Features\\ArtofTesting.feature",
		glue= {"FbStepDefinition"},
		format= {"pretty", "html:test_output"},
		dryRun=false,
		strict=false,
		monochrome=true
		
		)

public class FbTestRunner {

}

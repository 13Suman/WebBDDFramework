package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/suman/eclipse-workspace/WebBDDFramework/src/main/java/Features/homeitems.feature", 
		glue={"stepDefinition"}, 
		format= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome= true, //display console output in readable format
		strict=true,     //when steps are pending/ not defined
		dryRun= false   //to check mapping b/w feature and step definition file
		)

public class TestRunner {

	
	
}

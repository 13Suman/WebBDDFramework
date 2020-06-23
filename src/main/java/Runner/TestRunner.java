package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/suman/eclipse-workspace/WebBDDFramework/src/main/java/Features/tagging.feature", 
		glue={"stepDefinition"}, 
		format= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome= true, //display console output in readable format
		strict=true,     //when steps are pending/ not defined
		dryRun= false,   //to check mapping b/w feature and step definition file
		tags= {"@SmokeTest", "@RegressionTest"}
		//tags= {"~@SmokeTest", "~@RegressionTest", "~@End2End"} //for ignoring particular tag
		)

public class TestRunner {

	
	
} 

//OR - tags= {"@SmokeTest, @RegressionTest"}
//AND - tags= {"@SmokeTest", "@RegressionTest"}

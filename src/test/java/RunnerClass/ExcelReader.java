package RunnerClass;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features/ExcelReader.feature", 
				glue="StepDefinitions",
				dryRun = false,
				monochrome= true)
public class ExcelReader {
	


}

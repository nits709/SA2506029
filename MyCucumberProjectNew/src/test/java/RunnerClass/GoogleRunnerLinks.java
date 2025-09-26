package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/features/GoogleLinks.feature"},
				glue= {"stepsDefinition"},
				tags="@ALLGmail")
public class GoogleRunnerLinks {
	
	/*Single Scenario = @Gmail
	 * 
	 * Multiple Scenario = @Images or @Gmail
	 * 
	 * Skip Scenario = not @Gmail
	 * 
	 * Skip Multiple Scenario = not @Images or not @Gmail
	 * 
	 * */

}

package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"/Volumes/Renuka/Professional Stuff (Restricted)/Session_material/Session_WorkSpaces/Automation_SA2506029/SA250629_WebDriver/MyHybridFrameworkPOMBDD/src/test/resources/features/loginPage.feature"},
				glue= {"stepsDefinition"})
public class defaultRunner {

}

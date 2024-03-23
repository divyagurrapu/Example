package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
				features="Features",
                 glue= "StepDefinitions",
                 tags="@SmokeTest",
                 plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
dryRun=false,
monochrome=true)

public class Login {
	
}
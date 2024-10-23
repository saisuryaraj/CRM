package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src//test//java//Features/NewRegistration.feature","src//test//java//Features/Login.feature"},
		tags = "@Test",
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:test-output.html"}
		)

public class TestRun {
	
}
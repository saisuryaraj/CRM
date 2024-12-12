package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src//test//java//Features/Login.feature"},
		tags = "@Test",
		glue="stepDefinitions",
		publish = true,
		monochrome=true,
		dryRun = false,
		plugin = { "pretty", "html:target/cucumber-pretty-report/PrettyReport.html",
					"json:target/cucumber.json",
					"junit:target/Junit-reports/JunitTestReport.xml",
					"rerun:target/rerun.txt"})

public class TestRun {
	
}
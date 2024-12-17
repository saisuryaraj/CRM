package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
<<<<<<< HEAD
		features={"src//test//java//Features/NewRegistration.feature","src//test//java//Features/Login.feature"},
		tags = "@Test",
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:test-output.html"}
		)
=======
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
>>>>>>> aeacb7c549ad5639b7317f5d8d098fd0654b23c4

public class TestRun {
	
}
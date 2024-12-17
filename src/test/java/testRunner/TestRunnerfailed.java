package testRunner;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features="@target/rerun.txt",
	glue={"stepDefinitions"},
	tags=("@Test"),
	publish = true,
	monochrome=true,
	dryRun = false,
	plugin = { "pretty", "html:target1/cucumber-pretty-report/RerunPrettyReport.html",
		"json:target1/reruncucumber.json",
		"junit:target1/Junit-reports/rerunJunitTestReport.xml"})
public class TestRunnerfailed {
	
}


package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "C:\\Users\\Arpita\\eclipse-workspace\\NewTours\\src\\test\\java\\Features\\Contacts.feature",
	glue = {"step_definitions"}	,
	dryRun = false,
	format = {"pretty","html:test-output","json:json-output/cucumber.json","junit:junit-output/cucumber.xml"},
	monochrome = true,
	strict = true
	//tags = {"smoketest"}
)

public class MyRunner {

}

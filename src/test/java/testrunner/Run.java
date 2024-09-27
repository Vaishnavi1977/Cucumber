package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/LoginPage.feature",
		glue="step_defination",
		dryRun=true,
		monochrome=false,
		plugin="html:target/cucumber-report/report1.html"
		)

public class Run {

}

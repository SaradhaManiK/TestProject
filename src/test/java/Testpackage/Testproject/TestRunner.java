package Testpackage.Testproject;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\firstpage.feature",
		glue= {"stepdefinition"},
	    plugin = { "pretty","html:target/destination", "junit:target/cucumber-reports/Cucumber.xml", "json: cucumber-html-reports/cucumber.json" },
		dryRun= false,
		//tags="@regression",
		monochrome= true)


public class TestRunner {
	

}

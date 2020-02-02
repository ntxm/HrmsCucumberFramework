package com.hrms.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/" //where feature files located
		, glue = "com.hrms.steps" //implementation code for feature
		, dryRun = false  //which steps are not implementation
		, plugin = {"pretty", "html:target/html-reports"}
		, monochrome = true
		, tags = {"@inProgress"}
		//, name = "reports"
		)

public class InProgressRunner {

}

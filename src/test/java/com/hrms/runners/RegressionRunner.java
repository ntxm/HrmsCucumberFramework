package com.hrms.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/"
		, glue = "com.hrms.steps"
		, dryRun = false
		, plugin = {"pretty", "html:target/html-reports"}
		, monochrome = true
		, tags = {"@regression"}
		)

public class RegressionRunner {
	
}

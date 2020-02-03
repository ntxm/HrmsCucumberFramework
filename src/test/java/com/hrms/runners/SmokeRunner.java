package com.hrms.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/"
		, glue = "com.hrms.steps"
		, dryRun = false
		, plugin = {"pretty", "html:target/html-reports", "json:target/cucumber.json", "rerun:target/failed.txt"}
		, monochrome = true
		, tags = {"@smoke"}
		)

public class SmokeRunner {

}

package com.hrms.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="@target/failed.txt"
		, dryRun = false
		, glue = "com/hrms/steps"
		, plugin = {"pretty", "html:target/html-reports", "json:target/cucumber.json", "rerun:target/failed.txt"}
		, monochrome = true
		)


public class FailedRunner {

}

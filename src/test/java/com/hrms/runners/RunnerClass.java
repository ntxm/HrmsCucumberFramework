package com.hrms.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/" //where feature file located
		, glue = "com/hrms/steps" //implementation code for feature
		, dryRun = false //which steps are not implementation
		, plugin = "pretty"
		, monochrome = true
		//, tags = {"@regression"}
		)

public class RunnerClass {

}

package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

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

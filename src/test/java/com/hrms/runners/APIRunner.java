package com.hrms.runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/test/resources/features/"
			,glue = {"com.hrms.API.steps.practice"}
			,dryRun = false
			,tags = "@SyntaxHRMSAPIEndToEnd"
		 //   ,tags = "@inProgressAPI"
			,plugin = {"pretty"}
			,monochrome = true
		)
public class APIRunner {
	
	

}

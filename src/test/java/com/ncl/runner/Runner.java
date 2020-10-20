package com.ncl.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/ncl.feature"
		,glue="com/ncl/steps",
		dryRun=true
		,plugin= {"pretty","html:target/cucumber-default-reports","json:target/cucumber.json"}
		,monochrome=true
		,tags= {"@tag1"}
		)







public class Runner {

}

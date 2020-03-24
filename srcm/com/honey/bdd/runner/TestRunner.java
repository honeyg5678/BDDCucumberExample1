package com.honey.bdd.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = "com.honey.bdd.steps", plugin = { "pretty",
		"json:target/cucumber-jvm-report/cucumber.json", "html:target/report"}, monochrome = true)
public class TestRunner {

}

package org.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", glue="org.Stepdefinition",
tags= {"@Sanity,@Regression"}, plugin= {"html:target","json:target//output.json"}, strict=false, dryRun=false	)
public class TestRunnerClass {

}


package com.automation.runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/LetsTalkTea_Features", 
     glue = {"com.automation.stepDefinitions"},
     plugin = {"pretty","html:target/test-output"},// to generate different type of report
     monochrome = true,//display the readable format
    // strict = true, // stop the execution for when it finds the undefined steps
    // dryRun = false, // finds the undefined steps only {not executes the other steps}
    tags = {"@LetsTalkTea_Example"})
public class TestRunner {

}



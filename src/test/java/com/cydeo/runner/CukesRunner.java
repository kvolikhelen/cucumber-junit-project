package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
                "rerun:target/rerun.txt", // second rerun can be changed but not the first rerun - that has to be the same name
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"},
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false, //make true to get snippet then return to false to run
        tags = "@smoke",// "" -runs everything otherwise use annotations "@tags"
        publish = false // if true will give 24 hour report link
)
public class CukesRunner {

}
//First it runs the Hooks class before Scenario
//then it goes to log in feature runs background
//then runs the scenario.

// then repeats each scenario the same way

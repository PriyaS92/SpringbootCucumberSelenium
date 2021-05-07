package com.automation.springtest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
        plugin = {"pretty", "html:target/cucumber/testreports"},
        glue = "com/automation/springtest/stepdefinitions")
public class CucumberIntegrationTest extends AbstractTestNGCucumberTests{

}

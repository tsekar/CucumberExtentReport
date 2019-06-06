package com.cucumber.runner;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = {"src/test/resources/features/Google.feature","src/test/resources/features/Facebook.feature","src/test/resources/features/Flipkart.feature"},
        glue = {"com.cucumber.stepdefinitionsa"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
)
public class MyTestNGCukesRunner extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void teardown() {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows");
        Reporter.setTestRunnerOutput("Test Runner - Part 1");
        Reporter.assignAuthor("Ashwanth");
       
    }
}

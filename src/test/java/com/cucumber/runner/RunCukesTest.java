package com.cucumber.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * A sample test to demonstrate
 */
@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/features"},
    glue = {"com.cucumber.stepdefinitions"},
    plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"}
)
public class RunCukesTest extends AbstractTestNGCucumberTests{
   /* @BeforeClass
    public static void setup() {
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setExtentXServerUrl("http://localhost:1337");
        extentProperties.setProjectName("MyProject");
       extentProperties.setReportPath("output/myreport.html");
       
    }*/

    @AfterClass
    public static void teardown() {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Mac OSX");
        Reporter.setTestRunnerOutput("Test Runner - Part 3");
        Reporter.assignAuthor("Ashwanth");
    }

}

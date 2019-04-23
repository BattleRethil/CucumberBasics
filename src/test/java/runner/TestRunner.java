package runner;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//JUnit
//@RunWith(Cucumber.class)
//@CucumberOptions(features = {"src/test/java/feature"}, plugin = {"json:target/cucumber-report-html/cucumber.json", "html:target/site/cucumber-pretty"}, glue = "steps")
//public class TestRunner {}

//TestNG
@CucumberOptions(features = {"src/test/java/feature"}, plugin = {"json:target/cucumber-report-html/cucumber.json", "html:target/site/cucumber-pretty"}, glue = "steps")
public class TestRunner extends AbstractTestNGCucumberTests{}

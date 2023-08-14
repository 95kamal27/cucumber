package org.ebuy;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//facebook.feature",
glue = "org.ebuy",plugin = "html:target/report.html"
,dryRun = false,tags =  "@smoke")
public class Testrunner {

}

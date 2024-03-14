package bdd.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/java/bdd/features/first_login.feature"}, glue = {"bdd.StepDefinition"},
plugin = {})
public class Runner extends AbstractTestNGCucumberTests{

}

package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features="src/test/java/resources",glue= {"StepDefinition"},tags=("@Regression"),monochrome=true,
plugin= {"pretty","html:target/htmlReport/index.html"})

public class TestRunner {

}

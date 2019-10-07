package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(
		features="src/test/java/features",
		plugin= {"pretty","html:target/cucumber","json:target/cucumber.json"},
		glue="steps")
@RunWith(Cucumber.class)
public class Principal {

}

package bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
        glue={"bdd/stepDefinitions", "bdd/hooks"},
        publish=true,
        plugin={"pretty","html:target/CucumberReports/CucumberReport.html"})
public class JunitTestRunner {


}

package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/main/resources/features",
        glue = "stepDefination",
        tags = "@regression"
)

public class Runner extends AbstractTestNGCucumberTests {


}

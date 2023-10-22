package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "saucedemo.cucumber.stepDef",
        features = "src/test/java/saucedemo/cucumber/features",
        plugin = {"html:target/cucumber/report.html"}
)
public final class runnerTest {

    //RUN HERE BUT STILL ERROR//

}
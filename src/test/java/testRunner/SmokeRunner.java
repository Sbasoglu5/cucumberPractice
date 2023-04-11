package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resorces\\features",
        glue = "stepDefinitions",
        dryRun = false,
        tags = "@empTitle",
        plugin = {"pretty"})
public class SmokeRunner {
}

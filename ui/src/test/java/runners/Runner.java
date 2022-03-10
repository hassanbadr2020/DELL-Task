package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        strict = true,
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:testOutput"},
        features = {"src/test/resources/featureFiles"},
        glue = {"stepDefinitions"},
        tags = {"@login or @logout or @checkoutCart"}
)

public class Runner {
}

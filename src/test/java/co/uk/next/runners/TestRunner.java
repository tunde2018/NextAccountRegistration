package co.uk.next.runners;

// THIS IS THE ONLY TIME YOU RUN OUTSIDE OF A CLASS

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // THIS IS THE FEATURE FLIES IS STORED
        features = {"src/test/java/co/uk/next/features/CustomerCanRegisterNewAccountNow.feature"},

        // HOOK ALLOW ME TO OPEN AND CLOSE BROWSERS AND OPEN AND CLOSE STEP DEFINITIONS, AND
        // ALLOW ME TO SPECIFY WHERE STEP DEFINITIONS
        glue = {"co/uk/next/hooks", "co/uk/next/StepDefinitions"},

        // PLUGIN ALLOW ME TO WRITE REPORT IN READABLE FORMAT
        plugin = {"pretty", "json.target/report.json",
                "de.monochromata.cucumber.PrettyReports:target/pretty-cucumber"}
)
public class TestRunner {
}

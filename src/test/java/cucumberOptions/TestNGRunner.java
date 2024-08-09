package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = "src/test/java/features", // Path to feature files
        dryRun = true,
        glue = "stepDefinition", // Path to step definitions
        monochrome = true,
        tags = "@GreenCart"// Clean console output
        //plugin = {
             //  "pretty", // Pretty console output
             //  "html:target/cucumber-reports.html",
           //    "json:target/cucumber.json"} // HTML report
         )

public class TestNGRunner extends AbstractTestNGCucumberTests {
}
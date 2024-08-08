package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = "src/test/java/features", // Path to feature files
        glue = "stepDefinition", // Path to step definitions
        monochrome = true,
        tags = "@SmokeTest"// Clean console output
       // plugin = {
        //        "pretty", // Pretty console output
         //       "html:target/cucumber-reports"} // HTML report
         )

public class TestNGRunner extends AbstractTestNGCucumberTests {
}
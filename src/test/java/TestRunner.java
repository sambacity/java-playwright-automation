
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/landingPage.feature",    // ✅ Path to your .feature files
        glue = {"Steps"},                             // ✅ Package where your step defs exist
        plugin = {"pretty", "html:target/report.html"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
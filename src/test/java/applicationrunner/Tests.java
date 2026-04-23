package applicationrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(plugin = {
        "pretty",
        "json:target/cucumber-report/cucumber.json",
        "html:target/cucumber-report/index.html",
        "rerun:target/rerun.txt",
        "junit:target/cucumber-report/cucumber.xml"
},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@Login"
)
public class Tests extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}

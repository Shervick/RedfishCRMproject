package cucumber.Options;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/java/features/RedfishCRMWorkflow.feature"
,plugin="json:target/jsonReports/cucumber-report.json"
,glue= "stepDefinations"
,tags = "@RedfishCRMContactSearch"
)
public class RedFishCRMWorkflowTestRunner {

}

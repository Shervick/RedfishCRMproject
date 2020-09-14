package cucumber.Options;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.RetryAcceptance;
import com.github.mkolisnyk.cucumber.runner.ExtendedTestNGRunner;


@RunWith(ExtendedCucumber.class)

@ExtendedCucumberOptions(
		jsonReport = "json:target/jsonReports/cucumber-report.json",
		retryCount=3,
		detailedReport=true,
		detailedAggregatedReport=true,
		overviewReport=true,
		coverageReport=true,
		featureOverviewChart=true,
		jsonUsageReport="target/cucumber-usage.json",
		usageReport=true,
		toPDF=true,
		includeCoverageTags="@RedfishCRMContactSearch",
		outputFolder="target")
		//screenShotLocation="target")
@CucumberOptions(
		plugin = { "html:target/cucumber-html-report",
		        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
		        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"}
,features="src/test/java/features/RedfishCRMWorkflow.feature"
,glue= "stepDefinations"
,tags = "@RedfishCRMContactSearch"
)
public class RedFishCRMWorkflowReportTestRunner {

}

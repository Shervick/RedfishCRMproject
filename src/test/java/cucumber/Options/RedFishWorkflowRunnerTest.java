package cucumber.Options;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.runner.RunWith;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/java/features_1"
,plugin="json:target/jsonReports/cucumber-report.json"
,glue= "stepDefinations"
,tags = ("@Bug-2591")
)
public class RedFishWorkflowRunnerTest {
	
	

}

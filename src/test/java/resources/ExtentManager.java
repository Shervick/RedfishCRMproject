package resources;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentManager {



private static ExtentReports extent;



public static ExtentReports getInstance() {

if (extent == null)

createInstance(".//test-output//ReportHTML.html");



return extent;

}



public static ExtentReports createInstance(String fileName) {

ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);


htmlReporter.config().setTheme(Theme.STANDARD);

htmlReporter.config().setDocumentTitle(fileName);

htmlReporter.config().setEncoding("utf-8");

htmlReporter.config().setReportName(fileName);



extent = new ExtentReports();

extent.attachReporter(htmlReporter);



return extent;

}

}

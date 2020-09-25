package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Utils {
	public static Properties prop =new Properties();
	public WebDriver driver;
	public static String getGlobalValue(String application) throws IOException
	{
		FileInputStream fis =new FileInputStream("./src/test/java/resources\\global.properties");
		prop.load(fis);
		return prop.getProperty(application);
	}
	
	public static String getProperty(String browserProperty) throws IOException {
		FileInputStream fis =new FileInputStream("./src/test/java/resources\\global.properties");
		prop.load(fis);
		return prop.getProperty(browserProperty);
	}
	
	public WebDriver initializerDriver(String Browser) throws IOException{
		FileInputStream fis =new FileInputStream("./src/test/java/resources\\global.properties");
		prop.load(fis);
		String browsername=prop.getProperty("Browser");
		
		if(browsername.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			
		}
		else if (browsername.equalsIgnoreCase("IE")) {
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public File fullpagescreenshot(String path) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(path));
		return src;
	}
	public void partpagescreenshot(String path,WebElement pageSection) throws IOException {
		File src=pageSection.getScreenshotAs(OutputType.FILE);
		File trg=new File(path);
		FileUtils.copyFile(src, trg);
		
	}
	public ExtentReports extent;
	public void configrep() {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String reportpath=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(reportpath);
		report.config().setReportName("RedfishAutomation");
		report.config().setReportName("TestResult "+timeStamp);
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("TesterName", "Shervick Samson");
	}
	public void clickelement(WebElement locator) {
		locator.click();
	}
    public void typekey(WebElement keys,String value) {
    	keys.sendKeys(value);
	}
    public void clearinputfield(WebElement field) {
    	field.click();
    	
    }
    public void keyboardenter(WebElement actionkeysenter) {
    	actionkeysenter.sendKeys(Keys.ENTER);
    }
    public void keyboardtab(WebElement actionkeystab) {
    	actionkeystab.sendKeys(Keys.TAB);
    }

}

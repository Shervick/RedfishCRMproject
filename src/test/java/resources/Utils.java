package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


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

}

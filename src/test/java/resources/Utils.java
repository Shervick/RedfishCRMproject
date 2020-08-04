package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.redfishCRM.pageObjects.redfishLoginpage;

public class Utils {
	public static Properties prop =new Properties();
	public WebDriver driver;
	public static String getGlobalValue(String application) throws IOException
	{
		FileInputStream fis =new FileInputStream("C:\\Users\\E001291\\Desktop\\BH\\Red Fish\\RedFish Automation\\Script\\RedfishCRMproject\\src\\test\\java\\resources\\global.properties");
		prop.load(fis);
		return prop.getProperty(application);
	}
	
	public static String getProperty(String browserProperty) throws IOException {
		FileInputStream fis =new FileInputStream("C:\\Users\\E001291\\Desktop\\BH\\Red Fish\\RedFish Automation\\Script\\RedfishCRMproject\\src\\test\\java\\resources\\global.properties");
		prop.load(fis);
		return prop.getProperty(browserProperty);
	}
	
	public WebDriver initializerDriver(String Browser) throws IOException{
		FileInputStream fis =new FileInputStream("C:\\Users\\E001291\\Desktop\\BH\\Red Fish\\RedFish Automation\\Script\\RedfishCRMproject\\src\\test\\java\\resources\\global.properties");
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
	

}

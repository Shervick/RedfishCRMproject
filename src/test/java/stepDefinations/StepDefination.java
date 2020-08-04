package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.TestDataBuild;
import resources.Utils;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.redfishCRM.pageObjects.crmloginpage;
import com.redfishCRM.pageObjects.redfishLoginpage;
public class StepDefination extends Utils {	
	
	
	TestDataBuild data = new TestDataBuild();
	
	@Given("Initialize the browser with chrome")
    public void initialize_the_browser_with_chrome() throws Throwable {
		driver=initializerDriver("chrome");
		
    }
	@Given("Open Web Application {string}")
	public void open_web_application(String application) throws Throwable {
		System.out.println(application);
		driver.get(getGlobalValue(application));
	}
	
	@When("User enters User Name {string} and Password {string}")
	public void user_enters_user_name_and_password(String username, String password) throws Throwable {	 
		redfishLoginpage loginredfish=new redfishLoginpage(driver);
		loginredfish.Username().click();
		loginredfish.Username().sendKeys(username);
		loginredfish.Password().click();
		loginredfish.Password().sendKeys(password);
		loginredfish.Login().click();
	
	    }
     @Then("Verify if the web page title actual {string}")
     public void Verify_if_the_web_page_title_actual(String expectedtitle) {
    	 String actualtitle=driver.getTitle();
    	 System.out.println(expectedtitle);
    	 System.out.println(actualtitle);
    	 driver.close();
    	 driver.quit();
    	 assertEquals(actualtitle,expectedtitle);
     }

}

package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.TestDataBuild;
import resources.Utils;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.redfishCRM.pageObjects.crmloginpage;
import com.redfishCRM.pageObjects.redfishHomepage;
import com.redfishCRM.pageObjects.redfishLoginpage;
public class StepDefination extends Utils {	
	
	
	TestDataBuild data = new TestDataBuild();
	
	@Given("Initialize the browser with chrome")
    public void initialize_the_browser_with_chrome() throws Throwable {
		driver=initializerDriver("chrome");
		
    }
	@Given("Open Web Application {string}")
	public void open_web_application(String application) throws Throwable {
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
    	 assertEquals(actualtitle,expectedtitle);
     }
     @And("In home page verify if Enquiries and Enquiry in the main menu")
     public void In_home_page_verify_if_Enquiries_and_Enquiry_in_the_main_menu() {
    	 redfishHomepage hp=new redfishHomepage(driver);
    	 Assert.assertTrue(hp.Enquiriesmainmenulink().isDisplayed());
    	 Assert.assertTrue(hp.Enquiriesubmenulink().isDisplayed());
    	 
     }
     @When("Clicked on menu item {string} and submenu {string}")
     public void clicked_on_menu_item_and_submenu(String MainMenuItem, String SubMenuItem) {
    	 redfishHomepage hpaction =new redfishHomepage(driver);
    	 
    	 if (MainMenuItem.equalsIgnoreCase("Enquiries")) {
    		 hpaction.Enquiriesmainmenulink().click();
    	 }
    	 if (SubMenuItem.equalsIgnoreCase("Enquiry")){
    	 hpaction.Enquiriesubmenulink().click();
    	 }
     }
     @Then("Verify if the web page submenu title is {string}")
     public void verify_if_the_web_page_submenu_title_is(String expectedenqtitle) {
    	 String actualenqtitle=driver.getTitle();
    	 assertEquals(actualenqtitle,expectedenqtitle);
    	 
     }

}

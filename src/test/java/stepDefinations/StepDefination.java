package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.TestDataBuild;
import resources.Utils;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.redfishCRM.pageObjects.crmloginpage;
import com.redfishCRM.pageObjects.redfishHomepage;
import com.redfishCRM.pageObjects.redfishLoginpage;
import com.redfishCRM.pageObjects.redfishNewEnquirypage;
import com.redfishCRM.pageObjects.redfishNewRegisterpage;
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
     @When("Parent First Name {string} Parent Second Name {string} Address {string} Postcode {string} MobileNumber {string} Email id {string}")
     public void parent_first_name_parent_second_name_address_postcode_mobile_number_email_id(String FirstName , String SecondName, String Address, String Postcode, String MobileNumber, String Emailid) {
    	 redfishNewEnquirypage parentinfo = new redfishNewEnquirypage(driver);
    	 parentinfo.forename().click();
    	 parentinfo.forename().sendKeys(FirstName);
    	 parentinfo.surname().click();
    	 parentinfo.surname().sendKeys(SecondName);
    	 parentinfo.addressline1().click();
    	 parentinfo.addressline1().sendKeys(Address);
    	 parentinfo.postcode().click();
    	 parentinfo.postcode().sendKeys(Postcode);
    	 parentinfo.mobilenumber().click();
    	 parentinfo.mobilenumber().sendKeys(MobileNumber);
    	 parentinfo.emailid().click();
    	 parentinfo.emailid().sendKeys(Emailid);    	 
    	 
     }
     @When("The source is selected as {string}")
     public void the_source_is_selected_as(String source) {
    	 redfishNewEnquirypage sourceselection = new redfishNewEnquirypage(driver);
    	 Select sourceselet=new Select(sourceselection.source());
    	 sourceselet.selectByValue(source);
     }
     @When("The First Child First Name {string} First Child Second Name {string} First Child DOB {string} Gender {string} Enrolment Start Date {string}")
     public void the_first_child_first_name_first_child_second_name_first_child_dob_gender_enrolment_start_date(String FirstChildFirstName, String FirstChildSecondName, String FirstChildDOB, String FirstChildGender, String FirstEnrolmentStartDate) {
    	 redfishNewEnquirypage childinfo = new redfishNewEnquirypage(driver);
    	 childinfo.childfistname().click();
    	 childinfo.childfistname().sendKeys(FirstChildFirstName);
    	 childinfo.childsecondname().click();
    	 childinfo.childsecondname().sendKeys(FirstChildSecondName);
    	 childinfo.childDOB().sendKeys(FirstChildDOB);
    	 childinfo.childDOB().sendKeys(Keys.ENTER);
 		if (FirstChildGender.equalsIgnoreCase("M")) {
 			childinfo.Genderm().click();
 			
 		}else {
 			childinfo.Genderf().click();
 		}
 		childinfo.startdate().sendKeys(FirstEnrolmentStartDate);
 		childinfo.startdate().sendKeys(Keys.ENTER);
     }
     @When("Booking Patten is {string} and Click on Add Enquiry")
     public void booking_patten_is_and_click_on_add_enquiry(String BookingPatten) {
    	 
    	 redfishNewEnquirypage bookingaddenq = new redfishNewEnquirypage(driver);
    	 if(BookingPatten.equalsIgnoreCase("All Days")) {
    		bookingaddenq.AMmonday().click();
    		bookingaddenq.PMmonday().click();
    		bookingaddenq.AMtuesday().click();
    		bookingaddenq.PMtuesday().click();
    		bookingaddenq.AMwednesday().click();
    		bookingaddenq.PMwednesday().click();
    		bookingaddenq.AMthusday().click();
 			bookingaddenq.PMthusday().click();
 			bookingaddenq.AMfriday().click();
 			bookingaddenq.PMfriday().click();
 			
 		}else if(BookingPatten.equalsIgnoreCase("AMM PMT AMW PMTH PMF")) {
 			bookingaddenq.AMmonday().click();
 			bookingaddenq.PMtuesday().click();
 			bookingaddenq.AMwednesday().click();
 			bookingaddenq.PMthusday().click();
 			bookingaddenq.PMfriday().click();
 			
 		}else if(BookingPatten.equalsIgnoreCase("All AM")) {
 			bookingaddenq.AMmonday().click();
 			bookingaddenq.AMtuesday().click();
 			bookingaddenq.AMwednesday().click();
 			bookingaddenq.AMthusday().click();
 			bookingaddenq.AMfriday().click();
 		}else if(BookingPatten.equalsIgnoreCase("All PM")) {
 			bookingaddenq.PMmonday().click();
 			bookingaddenq.PMtuesday().click();
 			bookingaddenq.PMwednesday().click();
 			bookingaddenq.PMthusday().click();
 			bookingaddenq.PMfriday().click();
 			
 		}else if(BookingPatten.equalsIgnoreCase("FM WM FRM")) {
 			bookingaddenq.mondayampm().click();
 			bookingaddenq.wednesdayampm().click();
 			bookingaddenq.fridayampm().click();
 			
 		}else if(BookingPatten.equalsIgnoreCase("FT FTH")) {
 			bookingaddenq.tuesdayampm().click();
 			bookingaddenq.thusdayampm().click();
 			
 		}else if(BookingPatten.equalsIgnoreCase("All")) {
 			bookingaddenq.Alldaybooking().click();
 			
 		}
    	 bookingaddenq.addenquiry().click();
     }
     @Then("Verify if the Enquiry is created and Enquiry Details {string} is displayed on the Parent Name Click on")
     public void verify_if_the_enquiry_is_created_and_enquiry_details_is_displayed_on_the_parent_name_click_on(String exptenqdet) {
    	 String actualenqdet=driver.getTitle();
    	 assertEquals(actualenqdet,exptenqdet);
    	 //driver.close();
    	 //driver.quit();
     }
     @When("Clicked on register first child with sibling {string}")
     public void clicked_on_register_first_child_with_sibling(String Sibling) {
    	 redfishNewRegisterpage sibling=new redfishNewRegisterpage(driver);
    	 sibling.registerchild().click();
    	 if (Sibling.equalsIgnoreCase("Yes")) {
    		 sibling.siblingyes().click();
 			
 		}else {
 			sibling.siblingno().click();
 		}
    	 sibling.nextfromsibling().click();
     }
     @When("Selecting the Relationship status as {string} and Parental Parental Responsibility as {string}")
     public void selecting_the_relationship_status_as_and_parental_parental_responsibility_as(String Relationship,String ParentalResponsibility) {
    	//Select Relationship
    	redfishNewRegisterpage repprrep=new redfishNewRegisterpage(driver);
    	Select relation=new Select(repprrep.relationship());
    	relation.selectByVisibleText(Relationship);
 		//relation.selectByValue(Relationship);
 		if (ParentalResponsibility.equalsIgnoreCase("Yes")) {
 			repprrep.parentalresponsibility().click();
			String parentWindowHandler = driver.getWindowHandle();// Store your parent window
			String subWindowHandler = null;
			Set<String> handles = driver.getWindowHandles();// get all window handles
			Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()){
			    subWindowHandler = iterator.next();
			}
			driver.switchTo().window(subWindowHandler);// switch to popup window`
			driver.switchTo().window(subWindowHandler).switchTo().alert().accept();
			driver.switchTo().window(parentWindowHandler); // switch back to parent window
		} else {
			 System.out.println(driver.getTitle());
		}
 		repprrep.nextparent().click();
     }
     @When("Selecting the PhotoPreference as {string}")
     public void selecting_the_photo_preference_as(String PhotoPreference) {
    	 redfishNewRegisterpage phptopref=new redfishNewRegisterpage(driver);
    	 if (PhotoPreference.equalsIgnoreCase("0")) {
    		 phptopref.PhotoPreferenceall().click();
			}else if(PhotoPreference.equalsIgnoreCase("1")){
				phptopref.PhotoPreferenceIndividual().click();
			}else if(PhotoPreference.equalsIgnoreCase("2")){
				phptopref.PhotoPreferenceNA().click();
			}
    	
     }
     @When("The TFC Reference {string} and LEAFEETReference {string} and hrFundingCode {string}")
     //The TFC Reference "<TFCReference>" and LEAFEETReference "<LEAFEETReference>" and hrFundingCode "<hrFundingCode>"
     public void the_tfc_reference_and_leafeet_reference_and_hr_funding_code(String TFCReference,String LEAFEETReference,String hrFundingCode) {
    	 redfishNewRegisterpage phptopref=new redfishNewRegisterpage(driver);
    	 phptopref.tfcreference().click();
    	 phptopref.tfcreference().sendKeys(TFCReference);
    	 phptopref.LEAFEETReference().click();
    	 phptopref.LEAFEETReference().sendKeys(LEAFEETReference);
    	 phptopref.hrFundingCode().click();
    	 phptopref.hrFundingCode().sendKeys(hrFundingCode);
    	 phptopref.nextchild().click();
    	 phptopref.nextHealthcare().click();
    	 phptopref.nextDietary().click();
    	 phptopref.Donotaddanotherparent().click();
    	 phptopref.nextenrolment().click();
    	 phptopref.nextfunding().click();
    	 phptopref.nextvouchers().click();
     }
     @Then("Verify if the child is registered {string}")
    
     public void verify_if_the_child_is_registered(String ChildProfileTitle) {
    	 redfishNewRegisterpage finishverify=new redfishNewRegisterpage(driver);
    	 finishverify.finish().click();
    	 String actualfinishtitle=driver.getTitle();
    	 assertEquals(actualfinishtitle,ChildProfileTitle);
    	 finishverify.logout().click();
    	 driver.close();
 		 driver.quit();
     }

}

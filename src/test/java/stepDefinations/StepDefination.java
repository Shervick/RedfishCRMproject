package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.TestDataBuild;
import resources.Utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.assertj.core.api.Assertions.*;

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
import org.openqa.selenium.support.ui.WebDriverWait;

import com.redfishCRM.pageObjects.crmloginpage;
import com.redfishCRM.pageObjects.crmHomepage;
import com.redfishCRM.pageObjects.redfishEnquiryManagementpage;
import com.redfishCRM.pageObjects.redfishHomepage;
import com.redfishCRM.pageObjects.redfishLoginpage;
import com.redfishCRM.pageObjects.redfishNewEnquirypage;
import com.redfishCRM.pageObjects.redfishNewRegisterpage;
import com.redfishCRM.pageObjects.redfishsearchpage;
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
     @When("First child Booking Patten is {string}")
     public void first_child_booking_patten_is(String BookingPatten) {
    	 
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
    	
     }
     @Then("Logout from redfish and close browser")
     public void Logout_from_redfish_and_close_browser() throws InterruptedException {
    	 redfishNewRegisterpage redfishlogout=new redfishNewRegisterpage(driver);
    	 redfishlogout.logout().click();
 		 Thread.sleep(2000);
 		 driver.close();
 		 driver.quit();
     }
     @Then("Verify search functionality with Child Name {string} and Parent Name {string}")
     public void verify_search_functionality_with_child_name_and_parent_name(String expectedChildName, String expectedParentName) {
    	 redfishsearchpage redfishsearch=new redfishsearchpage(driver);
    	 redfishsearch.searchbox().click();
    	 redfishsearch.searchbox().clear();
    	 redfishsearch.searchbox().sendKeys(expectedChildName);
    	 redfishsearch.clickonsearch().click();
    	 String actualChildName=redfishsearch.clickonsearchresult().getText();
    	 assertEquals(actualChildName,expectedChildName);
    	 redfishsearch.searchbox().click();
    	 redfishsearch.searchbox().clear();
    	 redfishsearch.searchbox().sendKeys(expectedParentName);
    	 redfishsearch.clickonsearch().click();
    	 String actualParentName=redfishsearch.clickonsearchresult().getText();
    	 assertEquals(actualParentName,expectedParentName);
     }
     @Then("Verify search functionality with Invalid Child Name {string} and Invalid Parent Name {string}")
     public void verify_search_functionality_with_invalid_child_name_and_invalid_parent_name(String InvalidChildName, String InvalidParentName) {
    	 redfishsearchpage redfishsearchpg=new redfishsearchpage(driver);
    	 redfishsearchpg.searchboxinform().click();
    	 redfishsearchpg.searchboxinform().clear();
    	 redfishsearchpg.searchboxinform().sendKeys(InvalidChildName);
    	 redfishsearchpg.clickonsearchlink().click();
    	 String expectedchresult=redfishsearchpg.searchtext().getText();
    	 String actualresult="with 0 result";
    	 assertTrue(expectedchresult.contains(actualresult)); 
    	 redfishsearchpg.searchboxinform().click();
    	 redfishsearchpg.searchboxinform().clear();
    	 redfishsearchpg.searchboxinform().sendKeys(InvalidParentName);
    	 redfishsearchpg.clickonsearchlink().click();
    	 String expectedprresult=redfishsearchpg.searchtext().getText();
    	 assertTrue(expectedprresult.contains(actualresult));  
    	 
     }
     @When("Verify if user can add a visit with visit date {string} and visit time {string} with main comment {string}")
     public void verify_if_user_can_add_a_visit_with_visit_date_and_visit_time_with_main_comment(String VisitDate, String VisitTime, String ParentSecondName) {
    	 redfishEnquiryManagementpage enqvisitadd= new redfishEnquiryManagementpage(driver);
    	 
    	 enqvisitadd.addvisit().click();
    	 enqvisitadd.visitdate().click();
    	 enqvisitadd.visitdate().sendKeys(VisitDate);
    	 enqvisitadd.visitdate().sendKeys(Keys.TAB);
    	 enqvisitadd.visittime().click();
    	 System.out.println(VisitTime);
    	 enqvisitadd.visittime().sendKeys(VisitTime);
    	 
    	 String actualtime=enqvisitadd.visittime().getText();
    	 System.out.println(actualtime);
    	 enqvisitadd.maincomment().click();
    	 enqvisitadd.maincomment().sendKeys(ParentSecondName);
    	 enqvisitadd.addvisitbutton().click();
    	 //assertEquals(actualtime,VisitTime);
    	
     }
     @Then("Verify search functionality with only Parent Name {string} in search page")
     public void verify_search_functionality_with_only_parent_name_in_search_page(String ParentName) {
    	 redfishsearchpage redfishsearchenq=new redfishsearchpage(driver); 
    	 redfishsearchenq.searchbox().click();
    	 redfishsearchenq.searchbox().sendKeys(ParentName);
    	 redfishsearchenq.searchbox().sendKeys(Keys.ENTER);
    	 
    	 
    	 
    	 
     }
     @Then("Verify Enquiry search functionality with only Parent Name {string} in search page")
     public void verify_enquiry_search_functionality_with_only_parent_name_in_search_page(String ParentName) {
    	 redfishsearchpage redfishsearchenq1=new redfishsearchpage(driver);
    	 redfishsearchenq1.clickonchildcheckbox().click();
    	 redfishsearchenq1.clickonparentcheckbox().click();
    	 redfishsearchenq1.clickenquirycheckbox().click();
    	 redfishsearchenq1.searchboxinform().clear();
    	 redfishsearchenq1.searchboxinform().sendKeys(ParentName);
    	 redfishsearchenq1.searchboxinform().sendKeys(Keys.ENTER);
    	
    	 
    	
     }
     @Then("Verify Enquiry can be closed with reason code {string} Enquiry Management")
     public void verify_enquiry_can_be_closed_with_reason_code_enquiry_management(String ClosedReason) {
    	 redfishEnquiryManagementpage redfishsearchenqmg = new redfishEnquiryManagementpage(driver);
    	 redfishsearchenqmg.closeenquirybutton().click();
    	 
     }
     @Then("Verify closed Enquiry search functionality with only Parent Name {string} in search page")
     public void verify_closed_enquiry_search_functionality_with_only_parent_name_in_search_page(String EnquiryParentName) {
    	 
     }
     @Then("Verify Enquiry can be repoened in Enquiry Management")
     public void verify_enquiry_can_be_repoened_in_enquiry_management() {
    	 
     }
     @Then("Verify Enquiry General note can be updated as {string} in Enquiry")
     public void verify_enquiry_general_note_can_be_updated_as_in_enquiry(String Generalnotes) {
    	 
     }
     @Then("Verify Enquiry move to waiting list {string} Enquiry Management")
     public void verify_enquiry_move_to_waiting_list_enquiry_management(String string) {
    	 
     }
     @Then("Verify Enquiry can be moved to waiting list in Enquiry Management")
     public void verify_enquiry_can_be_moved_to_waiting_list_in_enquiry_management() {
    	 
     }
     @Then("Verify Enquiry can be removed from waiting list in Enquiry Management")
     public void verify_enquiry_can_be_removed_from_waiting_list_in_enquiry_management() {
    	 
     }
     @When("The Second Child First Name {string} Second Child Second Name {string} First Child DOB {string} Gender {string} Enrolment Start Date {string}")
     public void the_second_child_first_name_second_child_second_name_first_child_dob_gender_enrolment_start_date(String SecondChildFirstName, String SecondChildSecondName, String SecondChildDOB, String SecondChildGender, String SecondEnrolmentStartDate) {
    	 redfishNewEnquirypage secondchildinfo = new redfishNewEnquirypage(driver);
    	 secondchildinfo.addsecondchild().click();
    	 secondchildinfo.secondchildfirstname().click();
    	 secondchildinfo.secondchildfirstname().sendKeys(SecondChildFirstName);
    	 secondchildinfo.secondchildsecondname().click();
    	 secondchildinfo.secondchildsecondname().sendKeys(SecondChildSecondName);
    	 secondchildinfo.secondDOB().sendKeys(SecondChildDOB);
    	 secondchildinfo.secondDOB().sendKeys(Keys.ENTER);
 		if (SecondChildGender.equalsIgnoreCase("M")) {
 			secondchildinfo.secondGenderm().click();
 			
 		}else {
 			secondchildinfo.Genderf().click();
 		}
 		secondchildinfo.secondstartdate().sendKeys(SecondEnrolmentStartDate);
 		secondchildinfo.startdate().sendKeys(Keys.ENTER);
     }
     @When("Second Child Booking Patten is {string}")
     public void second_child_booking_patten_is(String SecondBookingPatten) {
    	 redfishNewEnquirypage secondbookingaddenq = new redfishNewEnquirypage(driver);
    	 if(SecondBookingPatten.equalsIgnoreCase("All Days")) {
    		 secondbookingaddenq.secondAMmonday().click();
    		 secondbookingaddenq.secondPMmonday().click();
    		 secondbookingaddenq.secondAMtuesday().click();
    		 secondbookingaddenq.secondPMtuesday().click();
    		 secondbookingaddenq.secondAMwednesday().click();
    		 secondbookingaddenq.secondPMwednesday().click();
    		 secondbookingaddenq.secondAMthusday().click();
    		 secondbookingaddenq.secondPMthusday().click();
    		 secondbookingaddenq.secondAMfriday().click();
    		 secondbookingaddenq.secondPMfriday().click();
 			
 		}else if(SecondBookingPatten.equalsIgnoreCase("AMM PMT AMW PMTH PMF")) {
 			secondbookingaddenq.secondAMmonday().click();
 			secondbookingaddenq.secondPMtuesday().click();
 			secondbookingaddenq.secondAMwednesday().click();
 			secondbookingaddenq.secondPMthusday().click();
 			secondbookingaddenq.secondPMfriday().click();
 			
 		}else if(SecondBookingPatten.equalsIgnoreCase("All AM")) {
 			secondbookingaddenq.secondAMmonday().click();
 			secondbookingaddenq.secondAMtuesday().click();
 			secondbookingaddenq.secondAMwednesday().click();
 			secondbookingaddenq.secondAMthusday().click();
 			secondbookingaddenq.secondAMfriday().click();
 		}else if(SecondBookingPatten.equalsIgnoreCase("All PM")) {
 			secondbookingaddenq.secondPMmonday().click();
 			secondbookingaddenq.secondPMtuesday().click();
 			secondbookingaddenq.secondPMwednesday().click();
 			secondbookingaddenq.secondPMthusday().click();
 			secondbookingaddenq.secondPMfriday().click();
 			
 		}else if(SecondBookingPatten.equalsIgnoreCase("FM WM FRM")) {
 			secondbookingaddenq.secondmondayampm().click();
 			secondbookingaddenq.secondwednesdayampm().click();
 			secondbookingaddenq.secondfridayampm().click();
 			
 		}else if(SecondBookingPatten.equalsIgnoreCase("FT FTH")) {
 			secondbookingaddenq.secondtuesdayampm().click();
 			secondbookingaddenq.secondthusdayampm().click();
 			
 		}else if(SecondBookingPatten.equalsIgnoreCase("All")) {
 			secondbookingaddenq.secondAlldaybooking().click();
 			
 		}
     }
     @Then("Click on Add Enquiry")
     public void click_on_add_enquiry() {
    	 redfishNewEnquirypage addenquiry = new redfishNewEnquirypage(driver);
    	 addenquiry.addenquiry().click();
     }
     @When("Clicked on register Second child with sibling {string}")
     public void clicked_on_register_second_child_with_sibling(String Sibling) {
    	 redfishNewRegisterpage secondchildsibling=new redfishNewRegisterpage(driver);
    	 redfishNewEnquirypage secondchildreg = new redfishNewEnquirypage(driver);
    	 secondchildreg.secondchildreg().click();
    	 secondchildsibling.register2nchild().click();
    	 if (Sibling.equalsIgnoreCase("Yes")) {
    		 secondchildsibling.siblingyes().click();
 			
 		}else {
 			secondchildsibling.siblingno().click();
 		}
    	 secondchildsibling.nextfromsibling().click();
     }
     @When("User enters RedfishCRM User Name {string} and Password {string}")
     public void user_enters_redfish_crm_user_name_and_password(String UserName, String Password) {
    	 crmloginpage loginredfishCRM=new crmloginpage(driver);
    	 loginredfishCRM.crmUsername().click();
    	 loginredfishCRM.crmUsername().sendKeys(UserName);
    	 loginredfishCRM.crmPassword().click();
    	 loginredfishCRM.crmPassword().sendKeys(Password);
    	 loginredfishCRM.crmsignin().click();
 		
     }
     @Then("Verify if the RedfishCRM web page title actual {string}")
     public void verify_if_the_redfish_crm_web_page_title_actual(String expectedtitle) throws InterruptedException {
    	 WebDriverWait wait = new WebDriverWait(driver, 15);
    	 wait.until(ExpectedConditions.titleContains(expectedtitle));
    	 String actualCRMtitle=driver.getTitle();
    	 assertThat(actualCRMtitle).contains(expectedtitle);
    	 assertEquals(actualCRMtitle,expectedtitle);
    	 
     }
     @Then("Logout from redfishCRM and close browser")
     public void logout_from_redfish_crm_and_close_browser() throws InterruptedException {
    	 crmHomepage redfishCRMlogout=new crmHomepage(driver);
    	 WebDriverWait wait = new WebDriverWait(driver, 15);
    	 redfishCRMlogout.crmprofile().click();
    	 redfishCRMlogout.crmsignout().click();
    	 Thread.sleep(10000);
    	 redfishCRMlogout.crmsignout().sendKeys(Keys.ENTER);
    	 wait.until(ExpectedConditions.titleContains("Sign out"));
 		 driver.close();
 		 driver.quit();
     }

}

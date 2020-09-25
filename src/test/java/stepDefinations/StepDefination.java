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

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import com.redfishCRM.pageObjects.crmloginpage;
import com.redfishCRM.pageObjects.crmContactpage;
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
		clickelement(loginredfish.Username());
		typekey(loginredfish.Username(),username);
		clickelement(loginredfish.Password());
		typekey(loginredfish.Password(),password);
		clickelement(loginredfish.Login());
	
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
    		 clickelement(hpaction.Enquiriesmainmenulink());
    	 }
    	 if (SubMenuItem.equalsIgnoreCase("Enquiry")){
    		 clickelement(hpaction.Enquiriesubmenulink());
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
    	 clickelement(parentinfo.forename());
    	 typekey(parentinfo.forename(),FirstName);
    	 clickelement(parentinfo.surname());
    	 typekey(parentinfo.surname(),SecondName);
    	 clickelement(parentinfo.addressline1());
    	 typekey(parentinfo.addressline1(),Address);
    	 clickelement(parentinfo.postcode());
    	 typekey(parentinfo.postcode(),Postcode);
    	 clickelement(parentinfo.mobilenumber());
    	 typekey(parentinfo.mobilenumber(),MobileNumber);
    	 clickelement(parentinfo.emailid());
    	 typekey(parentinfo.emailid(),Emailid);    	 
    	 
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
    	 clickelement(childinfo.childfistname());
    	 typekey(childinfo.childfistname(),FirstChildFirstName);
    	 clickelement(childinfo.childsecondname());
    	 typekey(childinfo.childsecondname(),FirstChildSecondName);
    	 typekey(childinfo.childDOB(),FirstChildDOB);
    	 keyboardenter(childinfo.childDOB());
 		if (FirstChildGender.equalsIgnoreCase("M")) {
 			clickelement(childinfo.Genderm());
 			
 		}else {
 			clickelement(childinfo.Genderf());
 		}
 		typekey(childinfo.startdate(),FirstEnrolmentStartDate);
 		keyboardenter(childinfo.startdate());
     }
     @When("First child Booking Patten is {string}")
     public void first_child_booking_patten_is(String BookingPatten) {
    	 
    	 redfishNewEnquirypage bookingaddenq = new redfishNewEnquirypage(driver);
    	 if(BookingPatten.equalsIgnoreCase("All Days")) {
    		clickelement(bookingaddenq.AMmonday());
    		clickelement(bookingaddenq.PMmonday());
    		clickelement(bookingaddenq.AMtuesday());
    		clickelement(bookingaddenq.PMtuesday());
    		clickelement(bookingaddenq.AMwednesday());
    		clickelement(bookingaddenq.PMwednesday());
    		clickelement(bookingaddenq.AMthusday());
    		clickelement(bookingaddenq.PMthusday());
    		clickelement(bookingaddenq.AMfriday());
    		clickelement(bookingaddenq.PMfriday());
 			
 		}else if(BookingPatten.equalsIgnoreCase("AMM PMT AMW PMTH PMF")) {
 			clickelement(bookingaddenq.AMmonday());
 			clickelement(bookingaddenq.PMtuesday());
 			clickelement(bookingaddenq.AMwednesday());
 			clickelement(bookingaddenq.PMthusday());
 			clickelement(bookingaddenq.PMfriday());
 			
 		}else if(BookingPatten.equalsIgnoreCase("All AM")) {
 			clickelement(bookingaddenq.AMmonday());
 			clickelement(bookingaddenq.AMtuesday());
 			clickelement(bookingaddenq.AMwednesday());
 			clickelement(bookingaddenq.AMthusday());
 			clickelement(bookingaddenq.AMfriday());
 		}else if(BookingPatten.equalsIgnoreCase("All PM")) {
 			clickelement(bookingaddenq.PMmonday());
 			clickelement(bookingaddenq.PMtuesday());
 			clickelement(bookingaddenq.PMwednesday());
 			clickelement(bookingaddenq.PMthusday());
 			clickelement(bookingaddenq.PMfriday());
 			
 		}else if(BookingPatten.equalsIgnoreCase("FM WM FRM")) {
 			clickelement(bookingaddenq.mondayampm());
 			clickelement(bookingaddenq.wednesdayampm());
 			clickelement(bookingaddenq.fridayampm());
 			
 		}else if(BookingPatten.equalsIgnoreCase("FT FTH")) {
 			clickelement(bookingaddenq.tuesdayampm());
 			clickelement(bookingaddenq.thusdayampm());
 			
 		}else if(BookingPatten.equalsIgnoreCase("All")) {
 			clickelement(bookingaddenq.Alldaybooking());
 			
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
    	 clickelement(sibling.registerchild());
    	 if (Sibling.equalsIgnoreCase("Yes")) {
    		 clickelement(sibling.siblingyes());
 			
 		}else {
 			clickelement(sibling.siblingno());
 		}
    	 clickelement(sibling.nextfromsibling());
     }
     @When("Selecting the Relationship status as {string} and Parental Parental Responsibility as {string}")
     public void selecting_the_relationship_status_as_and_parental_parental_responsibility_as(String Relationship,String ParentalResponsibility) {
    	//Select Relationship
    	redfishNewRegisterpage repprrep=new redfishNewRegisterpage(driver);
    	Select relation=new Select(repprrep.relationship());
    	relation.selectByVisibleText(Relationship);
 		//relation.selectByValue(Relationship);
 		if (ParentalResponsibility.equalsIgnoreCase("Yes")) {
 			clickelement(repprrep.parentalresponsibility());
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
 		clickelement(repprrep.nextparent());
     }
     @When("Selecting the PhotoPreference as {string}")
     public void selecting_the_photo_preference_as(String PhotoPreference) {
    	 redfishNewRegisterpage phptopref=new redfishNewRegisterpage(driver);
    	 if (PhotoPreference.equalsIgnoreCase("0")) {
    		 clickelement(phptopref.PhotoPreferenceall());
			}else if(PhotoPreference.equalsIgnoreCase("1")){
				clickelement(phptopref.PhotoPreferenceIndividual());
			}else if(PhotoPreference.equalsIgnoreCase("2")){
				clickelement(phptopref.PhotoPreferenceNA());
			}
    	
     }
     @When("The TFC Reference {string} and LEAFEETReference {string} and hrFundingCode {string}")
     //The TFC Reference "<TFCReference>" and LEAFEETReference "<LEAFEETReference>" and hrFundingCode "<hrFundingCode>"
     public void the_tfc_reference_and_leafeet_reference_and_hr_funding_code(String TFCReference,String LEAFEETReference,String hrFundingCode) {
    	 redfishNewRegisterpage phptopref=new redfishNewRegisterpage(driver);
    	 clickelement(phptopref.tfcreference());
    	 typekey(phptopref.tfcreference(),TFCReference);
    	 clickelement(phptopref.LEAFEETReference());
    	 typekey(phptopref.LEAFEETReference(),LEAFEETReference);
    	 clickelement(phptopref.hrFundingCode());
    	 typekey(phptopref.hrFundingCode(),hrFundingCode);
    	 clickelement(phptopref.nextchild());
    	 clickelement(phptopref.nextHealthcare());
    	 clickelement(phptopref.nextDietary());
    	 clickelement(phptopref.Donotaddanotherparent());   	 
    	 
     }
     @When("The Enrolment Leave date is {string}")
     public void the_enrolment_leave_date_is(String FirstEnrolmentEndDate) {
    	 redfishNewRegisterpage enorl=new redfishNewRegisterpage(driver);
    	 
    	 clickelement(enorl.enrolmentenddate());
    	 clearinputfield(enorl.enrolmentenddate());
    	 typekey(enorl.enrolmentenddate(),FirstEnrolmentEndDate);
    	 keyboardenter(enorl.enrolmentenddate());
    	 clickelement(enorl.nextenrolment());
    	 clickelement(enorl.nextfunding());
    	 clickelement(enorl.nextvouchers());
     }
     @Then("Verify if the child is registered {string}")
     public void verify_if_the_child_is_registered(String ChildProfileTitle) {
    	 redfishNewRegisterpage finishverify=new redfishNewRegisterpage(driver);
    	 clickelement(finishverify.finish());
    	 String actualfinishtitle=driver.getTitle();
    	 assertEquals(actualfinishtitle,ChildProfileTitle);
    	
     }
     @Then("Logout from redfish and close browser")
     public void Logout_from_redfish_and_close_browser() throws InterruptedException {
    	 redfishNewRegisterpage redfishlogout=new redfishNewRegisterpage(driver);
    	 clickelement(redfishlogout.logout());
 		 Thread.sleep(2000);
 		 driver.close();
 		 driver.quit();
     }
     @Then("Verify search functionality with Child Name {string} and Parent Name {string}")
     public void verify_search_functionality_with_child_name_and_parent_name(String expectedChildName, String expectedParentName) {
    	 redfishsearchpage redfishsearch=new redfishsearchpage(driver);
    	 clickelement(redfishsearch.searchbox());
    	 clearinputfield(redfishsearch.searchbox());
    	 typekey(redfishsearch.searchbox(),expectedChildName);
    	 clickelement(redfishsearch.clickonsearch());
    	 String actualChildName=redfishsearch.clickonsearchresult().getText();
    	 assertEquals(actualChildName,expectedChildName);
    	 clickelement(redfishsearch.searchbox());
    	 clearinputfield(redfishsearch.searchbox());
    	 typekey(redfishsearch.searchbox(),expectedParentName);
    	 clickelement(redfishsearch.clickonsearch());
    	 String actualParentName=redfishsearch.clickonsearchresult().getText();
    	 assertEquals(actualParentName,expectedParentName);
     }
     @Then("Verify search functionality with Invalid Child Name {string} and Invalid Parent Name {string}")
     public void verify_search_functionality_with_invalid_child_name_and_invalid_parent_name(String InvalidChildName, String InvalidParentName) {
    	 redfishsearchpage redfishsearchpg=new redfishsearchpage(driver);
    	 clickelement(redfishsearchpg.searchboxinform());
    	 clearinputfield(redfishsearchpg.searchboxinform());
    	 typekey(redfishsearchpg.searchboxinform(),InvalidChildName);
    	 clickelement(redfishsearchpg.clickonsearchlink());
    	 String expectedchresult=redfishsearchpg.searchtext().getText();
    	 String actualresult="with 0 result";
    	 assertTrue(expectedchresult.contains(actualresult)); 
    	 clickelement(redfishsearchpg.searchboxinform());
    	 clearinputfield(redfishsearchpg.searchboxinform());
    	 typekey(redfishsearchpg.searchboxinform(),InvalidParentName);
    	 clickelement(redfishsearchpg.clickonsearchlink());
    	 String expectedprresult=redfishsearchpg.searchtext().getText();
    	 assertTrue(expectedprresult.contains(actualresult));  
    	 
     }
     @When("Verify if user can add a visit with visit date {string} and visit time {string} with main comment {string}")
     public void verify_if_user_can_add_a_visit_with_visit_date_and_visit_time_with_main_comment(String VisitDate, String VisitTime, String ParentSecondName) {
    	 redfishEnquiryManagementpage enqvisitadd= new redfishEnquiryManagementpage(driver);
    	 
    	 clickelement(enqvisitadd.addvisit());
    	 clickelement(enqvisitadd.visitdate());
    	 typekey(enqvisitadd.visitdate(),VisitDate);
    	 keyboardtab(enqvisitadd.visitdate());
    	 clickelement(enqvisitadd.visittime());
    	 typekey(enqvisitadd.visittime(),VisitTime);
    	 clickelement(enqvisitadd.maincomment());
    	 typekey(enqvisitadd.maincomment(),ParentSecondName);
    	 clickelement(enqvisitadd.addvisitbutton());
    	
    	
     }
     @Then("Verify search functionality with only Parent Name {string} in search page")
     public void verify_search_functionality_with_only_parent_name_in_search_page(String ParentName) throws InterruptedException {
    	 redfishsearchpage redfishsearchenq=new redfishsearchpage(driver); 
    	 Thread.sleep(2000);
    	 clickelement(redfishsearchenq.searchbox());
    	 typekey(redfishsearchenq.searchbox(),ParentName);
    	 keyboardenter(redfishsearchenq.searchbox());
    	 
    	 
    	 
    	 
     }
     @Then("Verify Enquiry search functionality with only Parent Name {string} in search page")
     public void verify_enquiry_search_functionality_with_only_parent_name_in_search_page(String ParentName) {
    	 redfishsearchpage redfishsearchenq1=new redfishsearchpage(driver);
    	 clickelement(redfishsearchenq1.clickonchildcheckbox());
    	 clickelement(redfishsearchenq1.clickonparentcheckbox());
    	 clickelement(redfishsearchenq1.clickenquirycheckbox());
    	 clearinputfield(redfishsearchenq1.searchboxinform());
    	 typekey(redfishsearchenq1.searchboxinform(),ParentName);
    	 keyboardenter(redfishsearchenq1.searchboxinform());
    	
    	 
    	
     }
     @Then("Verify Enquiry can be closed with reason code {string} Enquiry Management")
     public void verify_enquiry_can_be_closed_with_reason_code_enquiry_management(String ClosedReason) {
    	 redfishEnquiryManagementpage redfishsearchenqmg = new redfishEnquiryManagementpage(driver);
    	 clickelement(redfishsearchenqmg.closeenquirybutton());
    	 
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
    	 clickelement(secondchildinfo.addsecondchild());
    	 clickelement(secondchildinfo.secondchildfirstname());
    	 typekey(secondchildinfo.secondchildfirstname(),SecondChildFirstName);
    	 clickelement(secondchildinfo.secondchildsecondname());
    	 typekey(secondchildinfo.secondchildsecondname(),SecondChildSecondName);
    	 typekey(secondchildinfo.secondDOB(),SecondChildDOB);
    	 keyboardenter(secondchildinfo.secondDOB());
 		if (SecondChildGender.equalsIgnoreCase("M")) {
 			clickelement(secondchildinfo.secondGenderm());
 			
 		}else {
 			clickelement(secondchildinfo.secondGenderf());
 		}
 		typekey(secondchildinfo.secondstartdate(),SecondEnrolmentStartDate);
 		keyboardenter(secondchildinfo.startdate());
     }
     @When("Second Child Booking Patten is {string}")
     public void second_child_booking_patten_is(String SecondBookingPatten) {
    	 redfishNewEnquirypage secondbookingaddenq = new redfishNewEnquirypage(driver);
    	 if(SecondBookingPatten.equalsIgnoreCase("All Days")) {
    		 clickelement(secondbookingaddenq.secondAMmonday());
    		 clickelement(secondbookingaddenq.secondPMmonday());
    		 clickelement(secondbookingaddenq.secondAMtuesday());
    		 clickelement(secondbookingaddenq.secondPMtuesday());
    		 clickelement(secondbookingaddenq.secondAMwednesday());
    		 clickelement(secondbookingaddenq.secondPMwednesday());
    		 clickelement(secondbookingaddenq.secondAMthusday());
    		 clickelement(secondbookingaddenq.secondPMthusday());
    		 clickelement(secondbookingaddenq.secondAMfriday());
    		 clickelement(secondbookingaddenq.secondPMfriday());
 			
 		}else if(SecondBookingPatten.equalsIgnoreCase("AMM PMT AMW PMTH PMF")) {
 			clickelement(secondbookingaddenq.secondAMmonday());
 			clickelement(secondbookingaddenq.secondPMtuesday());
 			clickelement(secondbookingaddenq.secondAMwednesday());
 			clickelement(secondbookingaddenq.secondPMthusday());
 			clickelement(secondbookingaddenq.secondPMfriday());
 			
 		}else if(SecondBookingPatten.equalsIgnoreCase("All AM")) {
 			clickelement(secondbookingaddenq.secondAMmonday());
 			clickelement(secondbookingaddenq.secondAMtuesday());
 			clickelement(secondbookingaddenq.secondAMwednesday());
 			clickelement(secondbookingaddenq.secondAMthusday());
 			clickelement(secondbookingaddenq.secondAMfriday());
 		}else if(SecondBookingPatten.equalsIgnoreCase("All PM")) {
 			clickelement(secondbookingaddenq.secondPMmonday());
 			clickelement(secondbookingaddenq.secondPMtuesday());
 			clickelement(secondbookingaddenq.secondPMwednesday());
 			clickelement(secondbookingaddenq.secondPMthusday());
 			clickelement(secondbookingaddenq.secondPMfriday());
 			
 		}else if(SecondBookingPatten.equalsIgnoreCase("FM WM FRM")) {
 			clickelement(secondbookingaddenq.secondmondayampm());
 			clickelement(secondbookingaddenq.secondwednesdayampm());
 			clickelement(secondbookingaddenq.secondfridayampm());
 			
 		}else if(SecondBookingPatten.equalsIgnoreCase("FT FTH")) {
 			clickelement(secondbookingaddenq.secondtuesdayampm());
 			clickelement(secondbookingaddenq.secondthusdayampm());
 			
 		}else if(SecondBookingPatten.equalsIgnoreCase("All")) {
 			clickelement(secondbookingaddenq.secondAlldaybooking());
 			
 		}
     }
     @Then("Click on Add Enquiry")
     public void click_on_add_enquiry() {
    	 redfishNewEnquirypage addenquiry = new redfishNewEnquirypage(driver);
    	 clickelement(addenquiry.addenquiry());
     }
     @When("Clicked on register Second child with sibling {string}")
     public void clicked_on_register_second_child_with_sibling(String Sibling) {
    	 redfishNewRegisterpage secondchildsibling=new redfishNewRegisterpage(driver);
    	 redfishNewEnquirypage secondchildreg = new redfishNewEnquirypage(driver);
    	 clickelement(secondchildreg.secondchildreg());
    	 clickelement(secondchildsibling.register2nchild());
    	 if (Sibling.equalsIgnoreCase("Yes")) {
    		 clickelement(secondchildsibling.siblingyes());
 			
 		}else {
 			clickelement(secondchildsibling.siblingno());
 		}
    	 clickelement(secondchildsibling.nextfromsibling());
     }
     @When("User enters RedfishCRM User Name {string} and Password {string}")
     public void user_enters_redfish_crm_user_name_and_password(String UserName, String Password) throws IOException, InterruptedException {
    	 crmloginpage loginredfishCRM=new crmloginpage(driver);
    	 fullpagescreenshot("./target/cucumber-html-reports/Screenshots/loginscreenshot.png");
    	 clickelement(loginredfishCRM.crmUsername());
    	 typekey(loginredfishCRM.crmUsername(),UserName);
    	 clickelement(loginredfishCRM.crmPassword());
    	 typekey(loginredfishCRM.crmPassword(),Password);
    	 clickelement(loginredfishCRM.crmsignin());
    	 Thread.sleep(15000);
 		
     }
     @Then("Verify if the RedfishCRM web page title actual {string}")
     public void verify_if_the_redfish_crm_web_page_title_actual(String expectedtitle) throws InterruptedException, IOException {
    	 Thread.sleep(15000);
    	 String actualCRMtitle=driver.getTitle();
    	 assertThat(actualCRMtitle).contains(expectedtitle);
    	 assertEquals(actualCRMtitle,expectedtitle);
    	 fullpagescreenshot("./target/cucumber-html-reports/Screenshots/homescreenshot.png");
     }
     @Then("Verify if user able to open the enquiry and verify the title as {string} screenshot in {string}")
     public void verify_if_user_able_to_open_the_enquiry_and_verify_the_title_as_screenshot_in(String expectedEnquiryTitle, String Enquiryfilename) throws InterruptedException, IOException {
    	 crmContactpage enqclick=new crmContactpage(driver);
    	 Thread.sleep(15000);
    	 driver.switchTo().frame("contentIFrame1");
    	 clickelement(enqclick.crmcontactenq());
    	 Thread.sleep(15000);
    	 String actualCRMtitle=driver.getTitle();
    	 assertThat(actualCRMtitle).contains(expectedEnquiryTitle);
    	 //assertEquals(actualCRMtitle,expectedEnquiryTitle);
    	 Dimension d = new Dimension(1920,1080);
    	 driver.manage().window().setSize(d);
    	 fullpagescreenshot("./target/cucumber-html-reports/Screenshots/"+Enquiryfilename+".png");
     }
     @Then("Verify if the CRMcontact screen has the expected first name {string}")
     public void verify_if_the_cr_mcontact_screen_has_the_expected_first_name(String ParentFirstName) {
    	 crmContactpage crmfirstnamelb=new crmContactpage(driver);
    	 
    	 driver.switchTo().frame("contentIFrame0");
    	
    	 String actualParentFirstName=crmfirstnamelb.crmforenamelabel().getText();
    	 assertThat(actualParentFirstName).contains(ParentFirstName);
     }
     @Then("Logout from redfishCRM and close browser {string}")
     public void logout_from_redfish_crm_and_close_browser(String CRMlogoutfilename) throws InterruptedException, IOException {
    	 crmHomepage redfishCRMlogout=new crmHomepage(driver);
    	 WebDriverWait wait = new WebDriverWait(driver, 15);
    	 driver.switchTo().parentFrame();
    	 clickelement(redfishCRMlogout.crmprofile());
    	 clickelement(redfishCRMlogout.crmsignout());
    	 Thread.sleep(10000);
    	 keyboardenter(redfishCRMlogout.crmsignout());
    	 wait.until(ExpectedConditions.titleContains("Sign out"));
    	 fullpagescreenshot("./target/cucumber-html-reports/Screenshots/"+CRMlogoutfilename+".png");
 		 driver.close();
 		 driver.quit();
     }
     @SuppressWarnings("deprecation")
	@Then("Verify if user able to search with parent email id {string} {string}")
     public void verify_if_user_able_to_search_with_parent_email_id(String EmailId, String contactfilename) throws IOException, InterruptedException {
    	 crmHomepage redfishCRMsearch=new crmHomepage(driver);
    	 WebDriverWait wait = new WebDriverWait(driver, 15);
    	 Thread.sleep(15000);
    	 driver.switchTo().frame("contentIFrame0");
    	 wait.until(ExpectedConditions.elementToBeClickable(redfishCRMsearch.crmsearchbox()));
    	 clickelement(redfishCRMsearch.crmsearchbox());
    	 clearinputfield(redfishCRMsearch.crmsearchbox());
    	 typekey(redfishCRMsearch.crmsearchbox(),EmailId);
    	 keyboardenter(redfishCRMsearch.crmsearchbox());
    	 clickelement(redfishCRMsearch.crmclickonsearchresult());
    	 wait.until(ExpectedConditions.titleContains("Contact:"));
    	 Thread.sleep(10000);
    	 fullpagescreenshot("./target/cucumber-html-reports/Screenshots/"+contactfilename+".png");
    	 driver.switchTo().parentFrame();
    	 
    	 
     }
     @Then("Verify if user able to see the parent first name in the contact screen {string} {string}")
     public void verify_if_user_able_to_see_the_parent_first_name_in_the_contact_screen(String ParentFirstName, String filename) throws InterruptedException, IOException {
    	 crmContactpage redfishCRMcolntact=new crmContactpage(driver);
    	 driver.switchTo().frame("contentIFrame1");
    	 Thread.sleep(15000);
    	 
    	 File actualfirstname=redfishCRMcolntact.crmForename().getScreenshotAs(OutputType.FILE);
    	 FileUtils.copyFile(actualfirstname,new File("./target/cucumber-html-reports/Screenshots/"+filename+".png"));
    	 
     }
     @Then("Verify if user able to see the parent Surname in the contact screen {string}")
     public void verify_if_user_able_to_see_the_parent_surname_in_the_contact_screen(String ParentSecondName) throws IOException, InterruptedException {
    	 crmContactpage redfishCRMcolntactsurname=new crmContactpage(driver);
    	 Thread.sleep(15000);
    	 
    	 File actuallastname=redfishCRMcolntactsurname.crmlastname().getScreenshotAs(OutputType.FILE);
    	 FileUtils.copyFile(actuallastname,new File("./target/cucumber-html-reports/Screenshots/lastname.png"));
    	 
     }
     @Then("Verify if user able to see the parent email id in the contact screen {string}")
     public void verify_if_user_able_to_see_the_parent_email_id_in_the_contact_screen(String ParentEmailID) throws IOException, InterruptedException {
    	 crmContactpage redfishCRMcolntactemail=new crmContactpage(driver);
    	 Thread.sleep(15000);
    	 File actualemaiid=redfishCRMcolntactemail.crmemailaddress1().getScreenshotAs(OutputType.FILE);
    	 FileUtils.copyFile(actualemaiid,new File("./target/cucumber-html-reports/Screenshots/emailaddress1.png"));
    	 
     }
     @Then("Verify if user able to see the Enquiry Type in the contact screen {string}")
     public void verify_if_user_able_to_see_the_enquiry_type_in_the_contact_screen(String EnquiryType) throws IOException, InterruptedException {
    	 crmContactpage redfishCRMcolntactenq=new crmContactpage(driver);
    	 Thread.sleep(15000);
    	 File actualenquiry=redfishCRMcolntactenq.crmemailaddress1().getScreenshotAs(OutputType.FILE);
    	 FileUtils.copyFile(actualenquiry,new File("./target/cucumber-html-reports/Screenshots/emailaddress1.png"));
    	 
     }
     @Then("Verify if Enquiry is created by taking the screen shot of the enquiry table {string}")
     public void verify_if_enquiry_is_created_by_taking_the_screen_shot_of_the_enquiry_table(String contactwithenqfilename) throws InterruptedException, IOException {
    	 //crmContactpage crmcntenq = new crmContactpage(driver);
    	 Thread.sleep(15000);
    	 //driver.switchTo().frame("contentIFrame1");
    	 Dimension d = new Dimension(1920,1080);
    	 driver.manage().window().setSize(d);
    	 //((JavascriptExecutor)driver).executeScript("scroll(0,400)");
    	 
    	 fullpagescreenshot("./target/cucumber-html-reports/Screenshots/"+contactwithenqfilename+".png");
    	 //driver.switchTo().parentFrame();
     }

}

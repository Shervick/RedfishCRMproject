package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.TestDataBuild;
import resources.Utils;
import com.Redfish.Hooks.GeneralHooks;
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
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import com.redfishCRM.pageObjects.crmloginpage;
import com.redfishCRM.pageObjects.redfishAbsencepage;
import com.redfishCRM.pageObjects.redfishDiscountspage;
import com.redfishCRM.pageObjects.crmContactpage;
import com.redfishCRM.pageObjects.crmEnquirypage;
import com.redfishCRM.pageObjects.crmHomepage;
import com.redfishCRM.pageObjects.crmNurseryPreference;
import com.redfishCRM.pageObjects.redfishEnquiryManagementpage;
import com.redfishCRM.pageObjects.redfishExtraSessionspage;
import com.redfishCRM.pageObjects.redfishHomepage;
import com.redfishCRM.pageObjects.redfishLoginpage;
import com.redfishCRM.pageObjects.redfishManagementpage;
import com.redfishCRM.pageObjects.redfishNewEnquirypage;
import com.redfishCRM.pageObjects.redfishNewRegisterpage;
import com.redfishCRM.pageObjects.redfishsearchpage;

import cucumber.api.Scenario;
public class StepDefination extends Utils {	
	
	
	TestDataBuild data = new TestDataBuild();
	
	@Given("Initialize the browser with chrome")
    public void initialize_the_browser_with_chrome() throws Throwable {
		try {
			driver=initializerDriver("chrome");
		} catch (InvalidArgumentException e1) {
			driver.close();
			
	 		driver.quit();
		}
		
		
    }
	@Given("Open Web Application {string}")
	public void open_web_application(String application) throws Throwable {
		try {
			driver.get(getGlobalValue(application));
			
		}catch (InvalidArgumentException e1) {
			driver.close();
	 		driver.quit();
		}
		
		
	}
	@When("User enters User Name {string} and Password {string}")
	public void user_enters_user_name_and_password(String username, String password) throws Throwable {	 
		redfishLoginpage loginredfish=new redfishLoginpage(driver);
		try {
		clickelement(loginredfish.Username());
		typekey(loginredfish.Username(),username);
		clickelement(loginredfish.Password());
		typekey(loginredfish.Password(),password);
		clickelement(loginredfish.Login());
		}catch (NoSuchElementException e2) {
			driver.close();
	 		driver.quit();
		}
	
	    }
     @Then("Verify if the web page title actual {string}")
     public void Verify_if_the_web_page_title_actual(String expectedtitle) {
    	 try {
    	 String actualtitle=driver.getTitle();
    	 assertEquals(actualtitle,expectedtitle);
    	 }catch(Exception e3) {
    		 driver.close();
 	 		 driver.quit();
    	 }
     }
     @And("In home page verify if Enquiries and Enquiry in the main menu")
     public void In_home_page_verify_if_Enquiries_and_Enquiry_in_the_main_menu() {
    	 redfishHomepage hp=new redfishHomepage(driver);
    	 try {
    		 Assert.assertTrue(hp.Enquiriesmainmenulink().isDisplayed());
        	 Assert.assertTrue(hp.Enquiriesubmenulink().isDisplayed());
    	 }catch(Exception e3) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @When("Clicked on menu item {string} and submenu {string}")
     public void clicked_on_menu_item_and_submenu(String MainMenuItem, String SubMenuItem) {
    	 redfishHomepage hpaction =new redfishHomepage(driver);
    	 try {
    		 if (MainMenuItem.equalsIgnoreCase("Enquiries")) {
        		 clickelement(hpaction.Enquiriesmainmenulink());
        	 }
        	 if (SubMenuItem.equalsIgnoreCase("Enquiry")){
        		 clickelement(hpaction.Enquiriesubmenulink());
        	 }
    		 
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
    	 
     }
     @Then("Verify if the web page submenu title is {string}")
     public void verify_if_the_web_page_submenu_title_is(String expectedenqtitle) {
    	 try {
    		 String actualenqtitle=driver.getTitle();
        	 assertEquals(actualenqtitle,expectedenqtitle);
    	 }catch(Exception e3) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @When("Parent First Name {string} Parent Second Name {string} Address {string} Postcode {string} MobileNumber {string} Email id {string}")
     public void parent_first_name_parent_second_name_address_postcode_mobile_number_email_id(String FirstName , String SecondName, String Address, String Postcode, String MobileNumber, String Emailid) {
    	 redfishNewEnquirypage parentinfo = new redfishNewEnquirypage(driver);
    	 try {
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
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @When("The source is selected as {string}")
     public void the_source_is_selected_as(String source) {
    	 redfishNewEnquirypage sourceselection = new redfishNewEnquirypage(driver);
    	 try {
    		 Select sourceselet=new Select(sourceselection.source());
        	 sourceselet.selectByValue(source);    		 
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }    	 
     }
     @When("The First Child First Name {string} First Child Second Name {string} First Child DOB {string} Gender {string} Enrolment Start Date {string}")
     public void the_first_child_first_name_first_child_second_name_first_child_dob_gender_enrolment_start_date(String FirstChildFirstName, String FirstChildSecondName, String FirstChildDOB, String FirstChildGender, String FirstEnrolmentStartDate) {
    	 redfishNewEnquirypage childinfo = new redfishNewEnquirypage(driver);
    	 try {
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
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }    	 
    	 
     }
     @When("First child Booking Patten is {string}")
     public void first_child_booking_patten_is(String BookingPatten) {
    	 
    	 redfishNewEnquirypage bookingaddenq = new redfishNewEnquirypage(driver);
    	 try {
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
    	 			
    	 		}else if(BookingPatten.equalsIgnoreCase("AMM AMT PMT AMW PMW THAM THPM")) {
    	 			clickelement(bookingaddenq.AMmonday());
    	 			clickelement(bookingaddenq.AMtuesday());
    	 			clickelement(bookingaddenq.PMtuesday());
    	 			clickelement(bookingaddenq.AMwednesday());
    	 			clickelement(bookingaddenq.PMwednesday());
    	 			clickelement(bookingaddenq.AMthusday());
    	 			clickelement(bookingaddenq.AMthusday());
    	 			
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
    	 			
    	 		}else if(BookingPatten.equalsIgnoreCase("AMM PMM AMT PMT FAM FPM")) {
    	 			clickelement(bookingaddenq.AMmonday());
    	 			clickelement(bookingaddenq.PMmonday());
    	 			clickelement(bookingaddenq.AMtuesday());
    	 			clickelement(bookingaddenq.PMtuesday());
    	 			clickelement(bookingaddenq.AMfriday());
    	 			clickelement(bookingaddenq.PMfriday());
    	 			
    	 		}else if(BookingPatten.equalsIgnoreCase("AMM AMT AMW AMTH AMF PMM")) {
    	 			clickelement(bookingaddenq.tuesdayampm());
    	 			clickelement(bookingaddenq.thusdayampm());
    	 			clickelement(bookingaddenq.AMwednesday());
    	 			clickelement(bookingaddenq.AMthusday());
    	 			clickelement(bookingaddenq.AMfriday());
    	 			
    	 			
    	 			
    	 		}else if(BookingPatten.equalsIgnoreCase("All")) {
    	 			clickelement(bookingaddenq.Alldaybooking());
    	 			
    	 		}
    	 		else if(BookingPatten.equalsIgnoreCase("AMM PMM AMT PMT AMW PMW FAM FPM")) {
    	 			clickelement(bookingaddenq.AMmonday());
    	 			clickelement(bookingaddenq.PMmonday());
    	 			clickelement(bookingaddenq.AMtuesday());
    	 			clickelement(bookingaddenq.PMtuesday());
    	 			clickelement(bookingaddenq.AMwednesday());
    	 			clickelement(bookingaddenq.PMwednesday());
    	 			clickelement(bookingaddenq.AMfriday());
    	 			clickelement(bookingaddenq.PMfriday());
    	 						
    	 		}
    	 		else if(BookingPatten.equalsIgnoreCase("AMM PMM AMT PMT AMW PMW")) {
    	 			clickelement(bookingaddenq.AMmonday());
    	 			clickelement(bookingaddenq.PMmonday());
    	 			clickelement(bookingaddenq.AMtuesday());
    	 			clickelement(bookingaddenq.PMtuesday());
    	 			clickelement(bookingaddenq.AMwednesday());
    	 			clickelement(bookingaddenq.PMwednesday());
    	 			
    	 		}
    	 		else if(BookingPatten.equalsIgnoreCase("AMT AMW PMW THAM THPM")) {
    	 			clickelement(bookingaddenq.AMtuesday());
    	 			clickelement(bookingaddenq.AMwednesday());
    	 			clickelement(bookingaddenq.PMwednesday());
    	 			clickelement(bookingaddenq.AMthusday());
    	 			clickelement(bookingaddenq.PMthusday());
    	 			
    	 		}
    	 		else if(BookingPatten.equalsIgnoreCase("AMT PMT AMW")) {
    	 			clickelement(bookingaddenq.AMtuesday());
    	 			clickelement(bookingaddenq.AMwednesday());
    	 			clickelement(bookingaddenq.PMwednesday());
    	 			clickelement(bookingaddenq.AMthusday());
    	 			clickelement(bookingaddenq.PMthusday());
    	 			
    	 		}
    	 		else if(BookingPatten.equalsIgnoreCase("AMT THAM")) {
    	 			clickelement(bookingaddenq.AMtuesday());
    	 			clickelement(bookingaddenq.AMthusday());
    	 			
    	 		}
    	 		else if(BookingPatten.equalsIgnoreCase("AMT PMT THAM THPM")) {
    	 			 clickelement(bookingaddenq.AMtuesday());
    	    		 clickelement(bookingaddenq.PMtuesday());
    	    		 clickelement(bookingaddenq.AMthusday());
    	  			 clickelement(bookingaddenq.PMthusday());
    	 			
    	 		}
    	 		else if(BookingPatten.equalsIgnoreCase("AMM PMM TAM TPM FAM FPM")) {
    	 			clickelement(bookingaddenq.AMmonday());
    	   		    clickelement(bookingaddenq.PMmonday());
    	   		    clickelement(bookingaddenq.AMtuesday());
    	   		    clickelement(bookingaddenq.PMtuesday());
    	   		    clickelement(bookingaddenq.AMfriday());
    				clickelement(bookingaddenq.PMfriday());
    				
    			}
    	 		else if(BookingPatten.equalsIgnoreCase("AMM PMM THAM")) {
    	 			clickelement(bookingaddenq.AMmonday());
    	   		    clickelement(bookingaddenq.PMmonday());
    	   		    clickelement(bookingaddenq.AMthusday());			
    			}
    	 		else if(BookingPatten.equalsIgnoreCase("AMM PMM AMT PMT AMW PMW AMTH PMTH")) {
    	 			clickelement(bookingaddenq.AMmonday());
    	   		    clickelement(bookingaddenq.PMmonday());
    	   		    clickelement(bookingaddenq.AMtuesday());
    			    clickelement(bookingaddenq.PMtuesday());
    			    clickelement(bookingaddenq.AMwednesday());
    	 			clickelement(bookingaddenq.PMwednesday());
    	 			clickelement(bookingaddenq.AMthusday());
    	 			clickelement(bookingaddenq.PMthusday());
    			}
    	 		else if(BookingPatten.equalsIgnoreCase("AMM PMM AMTH PMTH")) {
    	 			clickelement(bookingaddenq.AMmonday());
    	   		    clickelement(bookingaddenq.PMmonday());
    	 			clickelement(bookingaddenq.AMthusday());
    	 			clickelement(bookingaddenq.PMthusday());
    			}
    	 		else if(BookingPatten.equalsIgnoreCase("AMM PMM AMT PMT")) {
    	 			clickelement(bookingaddenq.AMmonday());
    	   		    clickelement(bookingaddenq.PMmonday());
    	   		    clickelement(bookingaddenq.AMtuesday());
    			    clickelement(bookingaddenq.PMtuesday());			
    			}
    	 		else if(BookingPatten.equalsIgnoreCase("AMT PMT AMTH PMTH")) {
    	   		    clickelement(bookingaddenq.AMtuesday());
    			    clickelement(bookingaddenq.PMtuesday());
    			    clickelement(bookingaddenq.AMthusday());
    	 			clickelement(bookingaddenq.PMthusday());
    			}
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }   
    	 
    	 
     }
     @Then("Verify if the Enquiry is created and Enquiry Details {string} is displayed on the Parent Name Click on")
     public void verify_if_the_enquiry_is_created_and_enquiry_details_is_displayed_on_the_parent_name_click_on(String exptenqdet) {
    	 try {
    		 String actualenqdet=driver.getTitle();
        	 assertEquals(actualenqdet,exptenqdet);
    	 }catch(Exception e3) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @When("Clicked on register first child with sibling {string}")
     public void clicked_on_register_first_child_with_sibling(String Sibling) {
    	 redfishNewRegisterpage sibling=new redfishNewRegisterpage(driver);
    	 try {
    		 clickelement(sibling.registerchild());
        	 if (Sibling.equalsIgnoreCase("Yes")) {
        		 clickelement(sibling.siblingyes());
     			
     		}else {
     			clickelement(sibling.siblingno());
     		}
        	 clickelement(sibling.nextfromsibling());
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }   
     }
     @When("Selecting the Relationship status as {string} and Parental Parental Responsibility as {string}")
     public void selecting_the_relationship_status_as_and_parental_parental_responsibility_as(String Relationship,String ParentalResponsibility) {
    	//Select Relationship
    	redfishNewRegisterpage repprrep=new redfishNewRegisterpage(driver);
    	try {
    		Select relation=new Select(repprrep.relationship());
        	relation.selectByVisibleText(Relationship);
     		//relation.selectByValue(Relationship);
     		if (ParentalResponsibility.equalsIgnoreCase("Yes")) {
     			clickelement(repprrep.parentalresponsibility());
     			popupwindowhandleAccept();
    		} else {
    			 System.out.println(driver.getTitle());
    		}
     		clickelement(repprrep.nextparent());
    	}catch(NoSuchElementException e2) {
   		 driver.close();
   		 driver.quit(); 
   	 }  
     }
     @When("Selecting the PhotoPreference as {string}")
     public void selecting_the_photo_preference_as(String PhotoPreference) {
    	 redfishNewRegisterpage phptopref=new redfishNewRegisterpage(driver);
    	 try {
    		 if (PhotoPreference.equalsIgnoreCase("0")) {
        		 clickelement(phptopref.PhotoPreferenceall());
    			}else if(PhotoPreference.equalsIgnoreCase("1")){
    				clickelement(phptopref.PhotoPreferenceIndividual());
    			}else if(PhotoPreference.equalsIgnoreCase("2")){
    				clickelement(phptopref.PhotoPreferenceNA());
    			}
    	 }catch(NoSuchElementException e2) {
       		 driver.close();
       		 driver.quit(); 
       	 }
     }
     @When("The TFC Reference {string} and LEAFEETReference {string} and hrFundingCode {string}")
     //The TFC Reference "<TFCReference>" and LEAFEETReference "<LEAFEETReference>" and hrFundingCode "<hrFundingCode>"
     public void the_tfc_reference_and_leafeet_reference_and_hr_funding_code(String TFCReference,String LEAFEETReference,String hrFundingCode) {
    	 redfishNewRegisterpage phptopref=new redfishNewRegisterpage(driver);
    	 try {
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
    	 }catch(NoSuchElementException e2) {
       		 driver.close();
       		 driver.quit(); 
       	 }
     }
     @When("The Enrolment Leave date is {string}")
     public void the_enrolment_leave_date_is(String FirstEnrolmentEndDate) {
    	 redfishNewRegisterpage enorl=new redfishNewRegisterpage(driver);
    	 try {
    		 clickelement(enorl.enrolmentenddate());
        	 clearinputfield(enorl.enrolmentenddate());
        	 typekey(enorl.enrolmentenddate(),FirstEnrolmentEndDate);
        	 keyboardenter(enorl.enrolmentenddate());
        	 clickelement(enorl.nextenrolment());
        	 clickelement(enorl.nextfunding());
        	 clickelement(enorl.nextvouchers());
    	 }catch(NoSuchElementException e2) {
       		 driver.close();
       		 driver.quit(); 
       	 }
     }
     @Then("Verify if the child is registered {string}")
     public void verify_if_the_child_is_registered(String ChildProfileTitle) {
    	 redfishNewRegisterpage finishverify=new redfishNewRegisterpage(driver);
    	 try {
    		 clickelement(finishverify.finish());
        	 String actualfinishtitle=driver.getTitle();
        	 assertEquals(actualfinishtitle,ChildProfileTitle);
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }catch(Exception e3) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @Then("Logout from redfish and close browser")
     public void Logout_from_redfish_and_close_browser() throws InterruptedException {
    	 redfishNewRegisterpage redfishlogout=new redfishNewRegisterpage(driver);
    	 try {
    		 clickelement(redfishlogout.logout());
    		 Thread.sleep(2000);
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
 		 driver.close();
 		 driver.quit();
     }
     @Then("Verify search functionality with Child Name {string} and Parent Name {string}")
     public void verify_search_functionality_with_child_name_and_parent_name(String expectedChildName, String expectedParentName) {
    	 redfishsearchpage redfishsearch=new redfishsearchpage(driver);
    	 try {
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
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }catch(Exception e3) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @Then("Verify search functionality with Invalid Child Name {string} and Invalid Parent Name {string}")
     public void verify_search_functionality_with_invalid_child_name_and_invalid_parent_name(String InvalidChildName, String InvalidParentName) {
    	 redfishsearchpage redfishsearchpg=new redfishsearchpage(driver);
    	 try {
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
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }catch(Exception e3) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @When("Verify if user can add a visit with visit date {string} and visit time {string} with main comment {string}")
     public void verify_if_user_can_add_a_visit_with_visit_date_and_visit_time_with_main_comment(String VisitDate, String VisitTime, String ParentSecondName) {
    	 redfishEnquiryManagementpage enqvisitadd= new redfishEnquiryManagementpage(driver);
    	 try {
    		 clickelement(enqvisitadd.addvisit());
        	 clickelement(enqvisitadd.visitdate());
        	 typekey(enqvisitadd.visitdate(),VisitDate);
        	 keyboardtab(enqvisitadd.visitdate());
        	 clickelement(enqvisitadd.visittime());
        	 typekey(enqvisitadd.visittime(),VisitTime);
        	 clickelement(enqvisitadd.maincomment());
        	 typekey(enqvisitadd.maincomment(),ParentSecondName);
        	 clickelement(enqvisitadd.addvisitbutton());
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @Then("Verify search functionality with only Parent Name {string} in search page")
     public void verify_search_functionality_with_only_parent_name_in_search_page(String ParentName) throws InterruptedException {
    	 redfishsearchpage redfishsearchenq=new redfishsearchpage(driver); 
    	 try {
    		 Thread.sleep(2000);
        	 clickelement(redfishsearchenq.searchbox());
        	 typekey(redfishsearchenq.searchbox(),ParentName);
        	 keyboardenter(redfishsearchenq.searchbox()); 
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @Then("Verify Enquiry search functionality with only Parent Name {string} in search page")
     public void verify_enquiry_search_functionality_with_only_parent_name_in_search_page(String ParentName) {
    	 redfishsearchpage redfishsearchenq1=new redfishsearchpage(driver);
    	 try {
    		 clickelement(redfishsearchenq1.clickonchildcheckbox());
        	 clickelement(redfishsearchenq1.clickonparentcheckbox());
        	 clickelement(redfishsearchenq1.clickenquirycheckbox());
        	 clearinputfield(redfishsearchenq1.searchboxinform());
        	 typekey(redfishsearchenq1.searchboxinform(),ParentName);
        	 keyboardenter(redfishsearchenq1.searchboxinform()); 
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }	
     }
     @Then("Verify if parent search functionality in redfish with parent name {string} is working")
     public void verify_if_parent_search_functionality_in_redfish_with_parent_name_is_working(String ParentName) {
    	 redfishsearchpage redfishsearchparent=new redfishsearchpage(driver);
    	 try {
    		 clickelement(redfishsearchparent.clickonchildcheckbox());
        	 clearinputfield(redfishsearchparent.searchboxinform());
        	 typekey(redfishsearchparent.searchboxinform(),ParentName);
        	 String actualsearchtest=readwebelementtext(redfishsearchparent.searchtext());
        	 assertTrue(actualsearchtest.contains(ParentName));
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }catch(Exception e3) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @Then("Verify Enquiry can be closed with reason code {string} Enquiry Management")
     public void verify_enquiry_can_be_closed_with_reason_code_enquiry_management(String ClosedReason) {
    	 redfishEnquiryManagementpage redfishsearchenqmg = new redfishEnquiryManagementpage(driver);
    	 try {
    		 clickelement(redfishsearchenqmg.closeenquirybutton());
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
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
    	 try {
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
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
    	 
     }
     @When("Second Child Booking Patten is {string}")
     public void second_child_booking_patten_is(String SecondBookingPatten) {
    	 redfishNewEnquirypage secondbookingaddenq = new redfishNewEnquirypage(driver);
    	 try {
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
     			
     		}else if(SecondBookingPatten.equalsIgnoreCase("AMM AMT PMT AMW PMW THAM THPM")) {
     			clickelement(secondbookingaddenq.secondAMmonday());
     			clickelement(secondbookingaddenq.secondAMtuesday());
     			clickelement(secondbookingaddenq.secondPMtuesday());
     			clickelement(secondbookingaddenq.secondAMwednesday());
     			clickelement(secondbookingaddenq.secondPMwednesday());
     			clickelement(secondbookingaddenq.secondAMthusday());
     			clickelement(secondbookingaddenq.secondPMthusday());
     			
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
     			
     		}else if(SecondBookingPatten.equalsIgnoreCase("AMM PMM AMT PMT FAM FPM")) {
     			clickelement(secondbookingaddenq.secondAMmonday());
     			clickelement(secondbookingaddenq.secondPMmonday());
     			clickelement(secondbookingaddenq.secondAMtuesday());
     			clickelement(secondbookingaddenq.secondPMtuesday());
     			clickelement(secondbookingaddenq.secondAMfriday());
     			clickelement(secondbookingaddenq.secondPMfriday());
     			
     		}else if(SecondBookingPatten.equalsIgnoreCase("AMM AMT AMW AMTH AMF PMM")) {
     			clickelement(secondbookingaddenq.secondtuesdayampm());
     			clickelement(secondbookingaddenq.secondthusdayampm());
     			clickelement(secondbookingaddenq.secondAMwednesday());
     			clickelement(secondbookingaddenq.secondAMthusday());
     			clickelement(secondbookingaddenq.secondAMfriday());
     			
     			
     			
     		}else if(SecondBookingPatten.equalsIgnoreCase("All")) {
     			clickelement(secondbookingaddenq.secondAlldaybooking());
     			
     		}
     		else if(SecondBookingPatten.equalsIgnoreCase("AMM PMM AMT PMT AMW PMW FAM FPM")) {
     			clickelement(secondbookingaddenq.secondAMmonday());
     			clickelement(secondbookingaddenq.secondPMmonday());
     			clickelement(secondbookingaddenq.secondAMtuesday());
     			clickelement(secondbookingaddenq.secondPMtuesday());
     			clickelement(secondbookingaddenq.secondAMwednesday());
     			clickelement(secondbookingaddenq.secondPMwednesday());
     			clickelement(secondbookingaddenq.secondAMfriday());
     			clickelement(secondbookingaddenq.secondPMfriday());
     						
     		}
     		else if(SecondBookingPatten.equalsIgnoreCase("AMM PMM AMT PMT AMW PMW")) {
     			clickelement(secondbookingaddenq.secondAMmonday());
     			clickelement(secondbookingaddenq.secondPMmonday());
     			clickelement(secondbookingaddenq.secondAMtuesday());
     			clickelement(secondbookingaddenq.secondPMtuesday());
     			clickelement(secondbookingaddenq.secondAMwednesday());
     			clickelement(secondbookingaddenq.secondPMwednesday());
     			
     		}
     		else if(SecondBookingPatten.equalsIgnoreCase("AMT AMW PMW THAM THPM")) {
     			clickelement(secondbookingaddenq.secondAMtuesday());
     			clickelement(secondbookingaddenq.secondAMwednesday());
     			clickelement(secondbookingaddenq.secondPMwednesday());
     			clickelement(secondbookingaddenq.secondAMthusday());
     			clickelement(secondbookingaddenq.secondPMthusday());
     			
     		}
     		else if(SecondBookingPatten.equalsIgnoreCase("AMT PMT AMW")) {
     			clickelement(secondbookingaddenq.secondAMtuesday());
     			clickelement(secondbookingaddenq.secondAMwednesday());
     			clickelement(secondbookingaddenq.secondPMwednesday());
     			clickelement(secondbookingaddenq.secondAMthusday());
     			clickelement(secondbookingaddenq.secondPMthusday());
     			
     		}
     		else if(SecondBookingPatten.equalsIgnoreCase("AMT THAM")) {
     			clickelement(secondbookingaddenq.secondAMtuesday());
     			clickelement(secondbookingaddenq.secondAMthusday());
     			
     		}
     		else if(SecondBookingPatten.equalsIgnoreCase("AMT PMT THAM THPM")) {
     			 clickelement(secondbookingaddenq.secondAMtuesday());
        		 clickelement(secondbookingaddenq.secondPMtuesday());
        		 clickelement(secondbookingaddenq.secondAMthusday());
      			 clickelement(secondbookingaddenq.secondPMthusday());
     			
     		}
     		else if(SecondBookingPatten.equalsIgnoreCase("AMM PMM TAM TPM FAM FPM")) {
     			clickelement(secondbookingaddenq.secondAMmonday());
       		    clickelement(secondbookingaddenq.secondPMmonday());
       		    clickelement(secondbookingaddenq.secondAMtuesday());
       		    clickelement(secondbookingaddenq.secondPMtuesday());
       		    clickelement(secondbookingaddenq.secondAMfriday());
    			clickelement(secondbookingaddenq.secondPMfriday());
    			
    		}
     		else if(SecondBookingPatten.equalsIgnoreCase("AMM PMM THAM")) {
     			clickelement(secondbookingaddenq.secondAMmonday());
       		    clickelement(secondbookingaddenq.secondPMmonday());
       		    clickelement(secondbookingaddenq.secondAMthusday());			
    		}
     		else if(SecondBookingPatten.equalsIgnoreCase("AMM PMM AMT PMT AMW PMW AMTH PMTH")) {
     			clickelement(secondbookingaddenq.secondAMmonday());
       		    clickelement(secondbookingaddenq.secondPMmonday());
       		    clickelement(secondbookingaddenq.secondAMtuesday());
    		    clickelement(secondbookingaddenq.secondPMtuesday());
    		    clickelement(secondbookingaddenq.secondAMwednesday());
     			clickelement(secondbookingaddenq.secondPMwednesday());
     			clickelement(secondbookingaddenq.secondAMthusday());
     			clickelement(secondbookingaddenq.secondPMthusday());
    		}
     		else if(SecondBookingPatten.equalsIgnoreCase("AMM PMM AMTH PMTH")) {
     			clickelement(secondbookingaddenq.secondAMmonday());
       		    clickelement(secondbookingaddenq.secondPMmonday());
     			clickelement(secondbookingaddenq.secondAMthusday());
     			clickelement(secondbookingaddenq.secondPMthusday());
    		}
     		else if(SecondBookingPatten.equalsIgnoreCase("AMM PMM AMT PMT")) {
     			clickelement(secondbookingaddenq.secondAMmonday());
       		    clickelement(secondbookingaddenq.secondPMmonday());
       		    clickelement(secondbookingaddenq.secondAMtuesday());
    		    clickelement(secondbookingaddenq.secondPMtuesday());			
    		}
     		else if(SecondBookingPatten.equalsIgnoreCase("AMT PMT AMTH PMTH")) {
       		    clickelement(secondbookingaddenq.secondAMtuesday());
    		    clickelement(secondbookingaddenq.secondPMtuesday());
    		    clickelement(secondbookingaddenq.secondAMthusday());
     			clickelement(secondbookingaddenq.secondPMthusday());
    		}
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
    
     @Then("Click on Add Enquiry")
     public void click_on_add_enquiry() {
    	 redfishNewEnquirypage addenquiry = new redfishNewEnquirypage(driver);
    	 try {
    		 clickelement(addenquiry.addenquiry());
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @Then("Submit General Notes {string}")
     public void submit_general_notes(String ParentName) {
    	 redfishEnquiryManagementpage enqgeneralnotes = new redfishEnquiryManagementpage(driver);
    	 try {
    		 clickelement(enqgeneralnotes.generalnotes());
        	 typekey(enqgeneralnotes.generalnotes(),ParentName);
        	 clickelement(enqgeneralnotes.generalnotessubmit());
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @When("Clicked on register Second child with sibling {string}")
     public void clicked_on_register_second_child_with_sibling(String Sibling) {
    	 redfishNewRegisterpage secondchildsibling=new redfishNewRegisterpage(driver);
    	 redfishNewEnquirypage secondchildreg = new redfishNewEnquirypage(driver);
    	 try {
    		 clickelement(secondchildreg.secondchildreg());
        	 clickelement(secondchildsibling.register2nchild());
        	 if (Sibling.equalsIgnoreCase("Yes")) {
        		 clickelement(secondchildsibling.siblingyes());
     			
     		}else {
     			clickelement(secondchildsibling.siblingno());
     		}
        	 clickelement(secondchildsibling.nextfromsibling());
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @When("User enters RedfishCRM User Name {string} and Password {string}")
     public void user_enters_redfish_crm_user_name_and_password(String UserName, String Password) throws IOException, InterruptedException {
    	 crmloginpage loginredfishCRM=new crmloginpage(driver);
    	 try {
    		 fullpagescreenshot("./target/cucumber-html-reports/Screenshots/loginscreenshot.png");
        	 clickelement(loginredfishCRM.crmUsername());
        	 typekey(loginredfishCRM.crmUsername(),UserName);
        	 clickelement(loginredfishCRM.crmPassword());
        	 typekey(loginredfishCRM.crmPassword(),Password);
        	 clickelement(loginredfishCRM.crmsignin());
        	 ExplicitWaittotitle("Contacts Active Parents");
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @Then("Verify if the RedfishCRM web page title actual {string}")
     public void verify_if_the_redfish_crm_web_page_title_actual(String expectedtitle) throws InterruptedException, IOException {
    	 try {
    		 ExplicitWaittotitle("Contacts Active Parents");
        	 String actualCRMtitle=driver.getTitle();
        	 assertThat(actualCRMtitle).contains(expectedtitle);
        	 assertEquals(actualCRMtitle,expectedtitle);
        	 fullpagescreenshot("./target/cucumber-html-reports/Screenshots/homescreenshot.png"); 
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @Then("Verify if user able to open the enquiry and verify the title as {string} screenshot in {string}")
     public void verify_if_user_able_to_open_the_enquiry_and_verify_the_title_as_screenshot_in(String expectedEnquiryTitle, String Enquiryfilename) throws InterruptedException, IOException {
    	 crmContactpage enqclick=new crmContactpage(driver);
    	 try {
    		 Thread.sleep(12000);
        	 driver.switchTo().frame("contentIFrame1");
        	 ExplicitWaittoclick(enqclick.crmcontactfirstenq());
        	 clickelement(enqclick.crmcontactfirstenq());
        	 ExplicitWaittotitle(expectedEnquiryTitle);
        	 String actualCRMtitle=driver.getTitle();
        	 assertThat(actualCRMtitle).contains(expectedEnquiryTitle);
        	 //assertEquals(actualCRMtitle,expectedEnquiryTitle);
        	 windowmaxdim(1920,1080);
        	 fullpagescreenshot("./target/cucumber-html-reports/Screenshots/"+Enquiryfilename+".png");
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }catch(Exception e3) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
    	 
     }
     @Then("Verify if user able to open the visit and verify the title as {string} screenshot in {string}")
     public void verify_if_user_able_to_open_the_visit_and_verify_the_title_as_screenshot_in(String CRMVisitTitle, String Visitfilename) throws InterruptedException, IOException {
    	 crmEnquirypage visitclick=new crmEnquirypage(driver); 
    	 try {
    		 driver.switchTo().parentFrame();
        	 driver.switchTo().frame("contentIFrame1");
        	 ExplicitWaittoclick(visitclick.crmEnqnavig());
        	 clickelement(visitclick.crmEnqnavig());
        	 clickelement(visitclick.crmnavalue());
        	 clickelement(visitclick.crmfirstvisit());
        	 ExplicitWaittotitle("Visit");
        	 String actualCRMvisittitle=driver.getTitle();
        	 assertThat(actualCRMvisittitle).contains(CRMVisitTitle);
        	 windowmaxdim(1920,1080);
        	 fullpagescreenshot("./target/cucumber-html-reports/Screenshots/"+Visitfilename+".png");
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }catch(Exception e3) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @Then("Verify if the CRMcontact screen has the expected first name {string}")
     public void verify_if_the_cr_mcontact_screen_has_the_expected_first_name(String ParentFirstName) {
    	 crmContactpage crmfirstnamelb=new crmContactpage(driver);
    	 try {
    		 driver.switchTo().frame("contentIFrame0");
    	    	
        	 String actualParentFirstName=crmfirstnamelb.crmforenamelabel().getText();
        	 assertThat(actualParentFirstName).contains(ParentFirstName);
    	 }catch(Exception e3) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @Then("Logout from redfishCRM and close browser {string}")
     public void logout_from_redfish_crm_and_close_browser(String CRMlogoutfilename) throws InterruptedException, IOException {
    	 crmHomepage redfishCRMlogout=new crmHomepage(driver);
    	 try {
    		 driver.switchTo().parentFrame();
        	 ExplicitWaittoclick(redfishCRMlogout.crmprofile());
        	 clickelement(redfishCRMlogout.crmprofile());
        	 ExplicitWaittoclick(redfishCRMlogout.crmsignout());
        	 clickelement(redfishCRMlogout.crmsignout());
        	 keyboardenter(redfishCRMlogout.crmsignout());
        	 keyboardenter(redfishCRMlogout.crmsignout());
        	 //ExplicitWaittotitle("Sign out");
        	 fullpagescreenshot("./target/cucumber-html-reports/Screenshots/"+CRMlogoutfilename+".png");
     		 driver.close();
     		 driver.quit();
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
    	
     }
	@Then("Verify if user able to search with parent email id {string} {string} {string}")
     public void verify_if_user_able_to_search_with_parent_email_id(String EmailId, String contactfilename, String ParentName) throws IOException, InterruptedException {
    	 crmHomepage redfishCRMsearch=new crmHomepage(driver);
    	 try {
    		 driver.switchTo().frame("contentIFrame0");
        	 ExplicitWaittoclick(redfishCRMsearch.crmsearchbox());
        	 clickelement(redfishCRMsearch.crmsearchbox());
        	 clearinputfield(redfishCRMsearch.crmsearchbox());
        	 typekey(redfishCRMsearch.crmsearchbox(),EmailId);
        	 keyboardenter(redfishCRMsearch.crmsearchbox());
        	 ExplicitWaittoclick(redfishCRMsearch.crmclickonsearchresult(ParentName));
        	 clickelement(redfishCRMsearch.crmclickonsearchresult(ParentName));
        	 ExplicitWaittotitle("Contact:");
        	 fullpagescreenshot("./target/cucumber-html-reports/Screenshots/"+contactfilename+".png");
        	 driver.switchTo().parentFrame();
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
  
     @Then("Verify if Enquiry is created by taking the screen shot of the enquiry table {string}")
     public void verify_if_enquiry_is_created_by_taking_the_screen_shot_of_the_enquiry_table(String contactwithenqfilename) throws InterruptedException, IOException {
    	 try {
    		//crmContactpage crmcntenq = new crmContactpage(driver);
        	 
        	 //driver.switchTo().frame("contentIFrame1");
        	 windowmaxdim(1920,1080);
        	 //((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        	 
        	 fullpagescreenshot("./target/cucumber-html-reports/Screenshots/"+contactwithenqfilename+".png");
        	 //driver.switchTo().parentFrame();
    	 }catch(Exception e3) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @Then("Verify if the Contacts Associated View is displayed take screenshot in {string}")
     public void verify_if_the_contacts_associated_view_is_displayed_take_screenshot_in(String contactviewfilename) throws IOException, InterruptedException {
    	 try {
    		 windowmaxdim(1920,1080);
        	 fullpagescreenshot("./target/cucumber-html-reports/Screenshots/"+contactviewfilename+".png");
    	 }catch(Exception e3) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @When("Verify if user able to search with parent Full Name {string} screenshot in {string}")
     public void verify_if_user_able_to_search_with_parent_full_name_screenshot_in(String ParentName, String FullNameFileName) throws IOException, InterruptedException {
    	 crmHomepage redfishCRMParentName=new crmHomepage(driver);
    	 try {
    		 driver.switchTo().frame("contentIFrame0");
        	 ExplicitWaittoclick(redfishCRMParentName.crmsearchbox());
        	 clickelement(redfishCRMParentName.crmsearchbox());
        	 clearinputfield(redfishCRMParentName.crmsearchbox());
        	 typekey(redfishCRMParentName.crmsearchbox(),ParentName);
        	 keyboardenter(redfishCRMParentName.crmsearchbox());
        	 windowmaxdim(1920,1080);
        	 fullpagescreenshot("./target/cucumber-html-reports/Screenshots/"+FullNameFileName+".png");
        	 driver.switchTo().parentFrame();
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @When("Verify if user able to search with parent email id {string} screenshot in {string}")
     public void verify_if_user_able_to_search_with_parent_email_id_screenshot_in(String ParentEmailID, String ParentEmailIDFileName) throws IOException, InterruptedException {
    	 crmHomepage redfishCRMEmailID=new crmHomepage(driver);
    	 try {
    		 driver.switchTo().frame("contentIFrame0");
        	 ExplicitWaittoclick(redfishCRMEmailID.crmsearchbox());
        	 clickelement(redfishCRMEmailID.crmsearchbox());
        	 clearinputfield(redfishCRMEmailID.crmsearchbox());
        	 typekey(redfishCRMEmailID.crmsearchbox(),ParentEmailID);
        	 keyboardenter(redfishCRMEmailID.crmsearchbox());
        	 windowmaxdim(1920,1080);
        	 fullpagescreenshot("./target/cucumber-html-reports/Screenshots/"+ParentEmailIDFileName+".png");
        	 driver.switchTo().parentFrame();
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @When("Verify if user able to search with Post Code {string} screenshot in {string}")
     public void verify_if_user_able_to_search_with_post_code_screenshot_in(String Postcode, String Postcodefilename) throws IOException, InterruptedException {
    	 crmHomepage redfishCRMpostcode=new crmHomepage(driver);
    	 try {
    		 driver.switchTo().frame("contentIFrame0");
        	 ExplicitWaittoclick(redfishCRMpostcode.crmsearchbox());
        	 clickelement(redfishCRMpostcode.crmsearchbox());
        	 clearinputfield(redfishCRMpostcode.crmsearchbox());
        	 typekey(redfishCRMpostcode.crmsearchbox(),Postcode);
        	 keyboardenter(redfishCRMpostcode.crmsearchbox());
        	 Thread.sleep(10000);
        	 Dimension d = new Dimension(1920,1080);
        	 driver.manage().window().setSize(d);
        	 fullpagescreenshot("./target/cucumber-html-reports/Screenshots/"+Postcodefilename+".png");
        	 driver.switchTo().parentFrame(); 
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @When("Verify if user able to search with invalid search key {string} screenshot in {string}")
     public void verify_if_user_able_to_search_with_invalid_search_key_screenshot_in(String InvalidSearch, String InvalidSearchFilename) throws IOException, InterruptedException {
    	 crmHomepage redfishCRMinvalid=new crmHomepage(driver);
    	 try {
    		 driver.switchTo().frame("contentIFrame0");
        	 clickelement(redfishCRMinvalid.crmsearchbox());
        	 clearinputfield(redfishCRMinvalid.crmsearchbox());
        	 typekey(redfishCRMinvalid.crmsearchbox(),InvalidSearch);
        	 keyboardenter(redfishCRMinvalid.crmsearchbox());
        	 windowmaxdim(1920,1080);
        	 fullpagescreenshot("./target/cucumber-html-reports/Screenshots/"+InvalidSearchFilename+".png");
        	 driver.switchTo().parentFrame();
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @When("Clicked on register First child with sibling with {string}")
     public void clicked_on_register_first_child_with_sibling_with(String Sibling) {
    	 redfishNewRegisterpage siblings=new redfishNewRegisterpage(driver);
    	 redfishNewEnquirypage secondchildreg = new redfishNewEnquirypage(driver);
    	 try {
    		 clickelement(secondchildreg.secondchildreg());
        	 clickelement(siblings.registerchild());
        	     	 if (Sibling.equalsIgnoreCase("Yes")) {
        	     		 clickelement(siblings.siblingyes());
        	  			
        	  		}else {
        	  			clickelement(siblings.siblingno());
        	  		}
        	     	 clickelement(siblings.nextfromsibling());
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @Then("Verify if user is able to click on new contact and get the actual title {string}")
     public void verify_if_user_is_able_to_click_on_new_contact_and_get_the_actual_title(String expnewcontacttitle) {
    	 crmHomepage redfishCRMnewcont=new crmHomepage(driver);
    	 try {
    		 ExplicitWaittoclick(redfishCRMnewcont.crmclickonnew());
        	 clickelement(redfishCRMnewcont.crmclickonnew());
        	 ExplicitWaittotitle("New Contact");
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @Then("Type Parent First Name {string} Parent Second Name {string} Address {string} Postcode {string} MobileNumber {string} Email id {string} Relationship Type {string}")
     public void type_parent_first_name_parent_second_name_address_postcode_mobile_number_email_id(String ParentFirstName, String ParentSecondName, String Address, String Postcode, String MobileNumber, String ParentEmailID, String relationshipType) throws InterruptedException {
    	 crmContactpage CRMcreatenewcont=new crmContactpage(driver);
    	 try {
    		 driver.switchTo().frame("contentIFrame1");
        	 Thread.sleep(12000);
        	 clickelement(CRMcreatenewcont.crmrelationshipTypep());
        	 clickelement(CRMcreatenewcont.crmforename());
        	 typekey(CRMcreatenewcont.crmforename(),ParentFirstName);
        	 submitelement(CRMcreatenewcont.crmforename());
        	 clickelement(CRMcreatenewcont.crmlastname());
        	 typekey(CRMcreatenewcont.crmlastname(),ParentSecondName);
        	 //submitelement(CRMcreatenewcont.crmlastname());
        	 clickelement(CRMcreatenewcont.crmaddress1());
        	 typekey(CRMcreatenewcont.crmaddress1(),Address);
        	 //submitelement(CRMcreatenewcont.crmaddress1());
        	 clickelement(CRMcreatenewcont.crmpostelcode());
        	 typekey(CRMcreatenewcont.crmpostelcode(),Postcode);
        	 //submitelement(CRMcreatenewcont.crmpostelcode());
        	 clickelement(CRMcreatenewcont.crmmobilephone());
        	 typekey(CRMcreatenewcont.crmmobilephone(),MobileNumber);
        	 //submitelement(CRMcreatenewcont.crmmobilephone());
        	 clickelement(CRMcreatenewcont.crmemailaddress1());
        	 typekey(CRMcreatenewcont.crmemailaddress1(),ParentEmailID);
        	 //submitelement(CRMcreatenewcont.crmemailaddress1());
        	 driver.switchTo().parentFrame();
        	 ExplicitWaittoclick(CRMcreatenewcont.crmsavecintact());
        	 clickelement(CRMcreatenewcont.crmsavecintact());  
    		 
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @Then("Take screen shot in file name {string}")
     public void take_screen_shot_in_file_name(String NewContactfilename) throws IOException {
    	 try {
    		 windowmaxdim(1920,1080);
        	 fullpagescreenshot("./target/cucumber-html-reports/Screenshots/"+NewContactfilename+".png"); 
    	 }catch(Exception e3) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @Then("Verify if user is able to click on add nursery preferred")
     public void verify_if_user_is_able_to_click_on_add_nursery_preferred() {
    	 try {
    		 crmEnquirypage CRMaddNP=new crmEnquirypage(driver);
        	 clickelement(CRMaddNP.crmaddnurserypreference()); 
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 } 	 
     }
     @Then("Verify if your able to click on Absence link and key in the Start Date {string} and End Date {string}")
     public void verify_if_your_able_to_click_on_absence_link_and_key_in_the_start_date_and_end_date(String AbsenceStartDate, String AbsenceEndDate) {
    	 redfishAbsencepage redfishAbsenceselect = new redfishAbsencepage(driver);
    	 try {
    		 clickelement(redfishAbsenceselect.Absencelink());
        	 typekey(redfishAbsenceselect.AbsenceStartDate(),AbsenceStartDate);
        	 keyboardenter(redfishAbsenceselect.AbsenceStartDate());
        	 typekey(redfishAbsenceselect.AbsenceEndDate(),AbsenceEndDate);
        	 keyboardenter(redfishAbsenceselect.AbsenceEndDate());
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 } 	 
     }
     @When("Verify if the Absence Reason is selected as {string} and Add absence")
     public void verify_if_the_absence_reason_is_selected_as_and_add_absence(String AbsenceReason) {
    	 redfishAbsencepage redfishAbsencereason = new redfishAbsencepage(driver);
    	 try {
    		 Select AbsenceReasonSelect=new Select(redfishAbsencereason.SelectAbsenceReason());
        	 clickelement(redfishAbsencereason.SelectAbsenceReason());
        	 AbsenceReasonSelect.selectByVisibleText(AbsenceReason);
        	 clickelement(redfishAbsencereason.AbsenceAdd());
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 } 
     }
     @Then("Verify Child search functionality with only Parent Email id {string} in search page")
     public void verify_child_search_functionality_with_only_parent_email_id_in_search_page(String EmailId) {
    	 redfishsearchpage redfishsearchenq2=new redfishsearchpage(driver);
    	 try {
    		 clearinputfield(redfishsearchenq2.searchboxinform());
        	 typekey(redfishsearchenq2.searchboxinform(),EmailId);
        	 keyboardenter(redfishsearchenq2.searchboxinform()); 
        	 clickelement(redfishsearchenq2.clickonsearchresult());
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 } 
     }
     @Then("Verify if user is able to click on management link in the main menu")
     public void verify_if_user_is_able_to_click_on_management_link_in_the_main_menu() {
    	 redfishManagementpage redfishmanagementlinkclick=new redfishManagementpage(driver);
    	 try{
    		 clickelement(redfishmanagementlinkclick.Managementmenulink());
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 } 
     }
     @Then("Verify if is able to click on Automatic Tasks link in management page")
     public void verify_if_is_able_to_click_on_automatic_tasks_link_in_management_page() {
    	 redfishManagementpage redfishmanagementlAutomaticTask=new redfishManagementpage(driver);
    	 try {
    		 clickelement(redfishmanagementlAutomaticTask.ManagementAutomaticTaskslink());
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 } 
     }
     @Then("Verify if user is able to select the invoice month {string} year {string} and Launch Invoicing")
     public void verify_if_user_is_able_to_select_the_invoice_month_year_and_launch_invoicing(String InvoiceMonth, String InvoiceYear) {
    	 redfishManagementpage redfishInvoicePeriod = new redfishManagementpage(driver);
    	 try {
    		 Select InvoiceMonthSelect=new Select(redfishInvoicePeriod.ManagementInvoiceMonth());
        	 clickelement(redfishInvoicePeriod.ManagementInvoiceMonth());
        	 InvoiceMonthSelect.selectByVisibleText(InvoiceMonth);
        	 Select InvoiceYearSelect=new Select(redfishInvoicePeriod.ManagementInvoiceYear());
        	 clickelement(redfishInvoicePeriod.ManagementInvoiceYear());
        	 InvoiceYearSelect.selectByVisibleText(InvoiceYear);
        	 clickelement(redfishInvoicePeriod.ManagementLaunchInvoiceing());
        	 popupwindowhandleAccept();
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 } 
     }
     @Then("Verify if user is able click on Absence Credit Note Task")
     public void verify_if_user_is_able_click_on_absence_credit_note_task() {
    	 redfishManagementpage redfishAbsenceLink = new redfishManagementpage(driver);
    	 try {
    		 clickelement(redfishAbsenceLink.ManagementLaunchAbsenceCreditNote());
        	 popupwindowhandleAccept();
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 } 
     }
     @Then("Verify if user is able to click on Extra Sesssion link")
     public void verify_if_user_is_able_to_click_on_extra_sesssion_link() {
    	 redfishExtraSessionspage redfishExtraSessionclick=new redfishExtraSessionspage(driver);
    	 try {
    		 clickelement(redfishExtraSessionclick.ExtraSessionslink());
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @Then("Verify if user is able to type the Extra Sessions Date {string} Booking Pattern {string} and click on Add")
     public void verify_if_user_is_able_to_type_the_extra_sessions_date_booking_pattern_and_click_on_add(String ExtraSessionsDate, String ExtraSessionsBookingPattern) {
    	 redfishExtraSessionspage redfishExtraSessionAdd=new redfishExtraSessionspage(driver);
    	 try {
        	 clickelement(redfishExtraSessionAdd.AddExtraSessionslink());
        	 clearinputfield(redfishExtraSessionAdd.ExtraSessionsDate());
        	 typekey(redfishExtraSessionAdd.ExtraSessionsDate(),ExtraSessionsDate);
        	 keyboardenter(redfishExtraSessionAdd.ExtraSessionsDate()); 
        	 Select ExtraBookingPattern=new Select(redfishExtraSessionAdd.ExtraSessionsBookingPattern());
        	 clickelement(redfishExtraSessionAdd.ExtraSessionsBookingPattern());
        	 ExtraBookingPattern.selectByVisibleText(ExtraSessionsBookingPattern);
        	 clickelement(redfishExtraSessionAdd.ExtraSessionsAddSession()); 
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
    	 
     }
     @Then("Verify if user is able to click on Discount link")
     public void verify_if_user_is_able_to_click_on_discount_link() {
    	 redfishDiscountspage redfishDiscountlinkclick=new redfishDiscountspage(driver);
    	 try {
    		 clickelement(redfishDiscountlinkclick.Discountslink());
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @Then("Verify if user is able to add a discount with Start Date {string} End Date {string} NameRate {string} and Order {string}")
     public void verify_if_user_is_able_to_add_a_discount_with_start_date_end_date_name_rate_and_order(String DiscountStartDate, String DiscountEndDate, String NameRate, String Order) {
    	 redfishDiscountspage redfishAddDiscount=new redfishDiscountspage(driver);
    	 try {
    		 clearinputfield(redfishAddDiscount.DiscountsStartDate());
        	 typekey(redfishAddDiscount.DiscountsStartDate(),DiscountStartDate);
        	 keyboardenter(redfishAddDiscount.DiscountsStartDate()); 
        	 clearinputfield(redfishAddDiscount.DiscountsEndDate());
        	 typekey(redfishAddDiscount.DiscountsEndDate(),DiscountEndDate);
        	 keyboardenter(redfishAddDiscount.DiscountsEndDate());
        	 Select DiscountNameRate=new Select(redfishAddDiscount.DiscountsNameRate());
        	 clickelement(redfishAddDiscount.DiscountsNameRate());
        	 DiscountNameRate.selectByVisibleText(NameRate);
        	 clickelement(redfishAddDiscount.DiscountsNameRate()); 
        	 clearinputfield(redfishAddDiscount.DiscountsOrder());
        	 typekey(redfishAddDiscount.DiscountsOrder(),Order);
        	 clickelement(redfishAddDiscount.DiscountsAdd());
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
     @Then("Verify if user is able to add {string} in nursery preferred")
     public void verify_if_user_is_able_to_add_in_nursery_preferred(String Nursery) {
    	 crmNurseryPreference crmaddnursery=new crmNurseryPreference(driver);
    	 try {
    		 crmEnquirypage CRMaddNP=new crmEnquirypage(driver);
        	 clickelement(CRMaddNP.crmaddnurserypreference());
        	 String parentWindowHandler = driver.getWindowHandle();
        	 String subWindowHandler = null;
        	 Set<String> handles = driver.getWindowHandles();
        	 Iterator<String> iterator = handles.iterator();
        	 while (iterator.hasNext()){
     		    subWindowHandler = iterator.next();
     		}
        	 driver.switchTo().window(subWindowHandler);
        	 ExplicitWaittotitle("Nursery Preference");
        	 driver.switchTo().frame("contentIFrame0");
        	 clickelement(crmaddnursery.crmNPnursery());
        	 clearinputfield(crmaddnursery.crmNPnursery());
        	 typekey(crmaddnursery.crmNPnursery(),Nursery);
        	 keyboardenter(crmaddnursery.crmNPnursery());
        	 clickelement(crmaddnursery.crmNPsearchtext(Nursery));
        	 driver.switchTo().parentFrame();
        	 clickelement(crmaddnursery.crmNPSaveAndClose());
        	 driver.switchTo().window(parentWindowHandler); 
        	 
    	 }catch(NoSuchElementException e2) {
    		 driver.close();
 	 		 driver.quit(); 
    	 }
     }
}

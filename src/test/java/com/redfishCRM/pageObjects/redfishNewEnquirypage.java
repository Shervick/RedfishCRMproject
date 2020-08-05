package com.redfishCRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class redfishNewEnquirypage {
	
	
WebDriver driver;

	public redfishNewEnquirypage(WebDriver driver) {
		this.driver=driver;
}
	By forename= By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_fvEnquiry_CONTACT_FORENAME");
	By surname= By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_fvEnquiry_CONTACT_SURNAME");
	By addressline1= By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_fvEnquiry_ADDRESS1_tbHouseNumName");
	By postcode=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_fvEnquiry_POSTCODE");
	By emailid=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_fvEnquiry_EMAIL");
	By mobilenumber=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_fvEnquiry_MOBILE");
	By source=By.cssSelector("select#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_fvEnquiry_ddlHEARD_FROM_LIST");
	By childfistname=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_tbForename");
	By secondchildfirstname=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_tbForename");
	By childsecondname=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_tbSurname");
	By secondchildsecondname=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_tbSurname");
	By childDOB=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_tbDOB");
	By secondDOB=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_tbDOB");
	By clickgender=By.cssSelector("label#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_lGender");
	By secondclickgender=By.cssSelector("label#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_lGender");
	By Genderm=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_rbMale");
	By secondGenderm=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_rbMale");
	By Genderf=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_rbFemale");
	By secondGenderf=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_rbFemale");
	By Ethnicorigin=By.cssSelector("select#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_ddlEthnicOriginId");
	By secondEthnicorigin=By.cssSelector("select#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_ddlEthnicOriginId");
	By clickethnicorigin=By.cssSelector("label#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_lEthnicOrigin");
	By secondclickethnicorigin=By.cssSelector("label#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_lEthnicOrigin");
	By startdate=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_tbExpectedStartDate");
	By secondstartdate=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_tbExpectedStartDate");
	By Alldaybooking=By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_WeekCalendar_hlAll");
	By mondayampm=By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_WeekCalendar_hlMon");
	By tuesdayampm=By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_WeekCalendar_hlTue");
	By wednesdayampm=By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_WeekCalendar_hlWed");
	By thusdayampm=By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_WeekCalendar_hlThu");
	By fridayampm=By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_WeekCalendar_hlFri");
	By AMmonday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_WeekCalendar_cbAMMon");
	By AMtuesday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_WeekCalendar_cbAMTue");
	By AMwednesday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_WeekCalendar_cbAMWed");
	By AMthusday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_WeekCalendar_cbAMThu");
	By AMfriday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_WeekCalendar_cbAMFri");
	By PMmonday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_WeekCalendar_cbPMMon");
	By PMtuesday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_WeekCalendar_cbPMTue");
	By PMwednesday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_WeekCalendar_cbPMWed");
	By PMthusday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_WeekCalendar_cbPMThu");
	By PMfriday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl0_WeekCalendar_cbPMFri");
	By secondAlldaybooking=By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_WeekCalendar_hlAll");
	By secondmondayampm=By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_WeekCalendar_hlMon");
	By secondtuesdayampm=By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_WeekCalendar_hlTue");
	By secondwednesdayampm=By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_WeekCalendar_hlWed");
	By secondthusdayampm=By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_WeekCalendar_hlThu");
	By secondfridayampm=By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_WeekCalendar_hlFri");
	By secondAMmonday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_WeekCalendar_cbAMMon");
	By secondAMtuesday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_WeekCalendar_cbAMTue");
	By secondAMwednesday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_WeekCalendar_cbAMWed");
	By secondAMthusday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_WeekCalendar_cbAMThu");
	By secondAMfriday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_WeekCalendar_cbAMFri");
	By secondPMmonday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_WeekCalendar_cbPMMon");
	By secondPMtuesday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_WeekCalendar_cbPMTue");
	By secondPMwednesday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_WeekCalendar_cbPMWed");
	By secondPMthusday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_WeekCalendar_cbPMThu");
	By secondPMfriday=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lvEnquiryChildren_ctrl2_WeekCalendar_cbPMFri");
	By addsecondchild=By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lbAddEnquiryChild");
	By addenquiry=By.id("ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_bAdd_lText");
	By enquirydetails=By.cssSelector("#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lbPageTitle");
	
	public WebElement forename() {return driver.findElement(forename);}
	public WebElement surname() {return driver.findElement(surname);}
	public WebElement addressline1() {return driver.findElement(addressline1);}
	public WebElement postcode() {return driver.findElement(postcode);}
	public WebElement emailid() {return driver.findElement(emailid);}
	public WebElement mobilenumber() {return driver.findElement(mobilenumber);}
	public WebElement source() {return driver.findElement(source);}
	public WebElement childfistname() {return driver.findElement(childfistname);}
	public WebElement childsecondname() {return driver.findElement(childsecondname);}
	public WebElement secondchildfirstname() {return driver.findElement(secondchildfirstname);}
	public WebElement secondchildsecondname() {return driver.findElement(secondchildsecondname);}
	public WebElement childDOB() {return driver.findElement(childDOB);}
	public WebElement secondDOB() {return driver.findElement(secondDOB);}
	public WebElement clickgender() {return driver.findElement(clickgender);}
	public WebElement secondclickgender() {return driver.findElement(secondclickgender);}
	public WebElement Genderm() {return driver.findElement(Genderm);}
	public WebElement secondGenderm() {return driver.findElement(secondGenderm);}
	public WebElement Genderf() {return driver.findElement(Genderf);}
	public WebElement secondGenderf() {return driver.findElement(secondGenderf);}
	public WebElement startdate() {return driver.findElement(startdate);}
	public WebElement secondstartdate() {return driver.findElement(secondstartdate);}
	public WebElement Ethnicorigin() {return driver.findElement(Ethnicorigin);}
	public WebElement secondEthnicorigin() {return driver.findElement(secondEthnicorigin);}
	public WebElement clickethnicorigin() {return driver.findElement(clickethnicorigin);}
	public WebElement secondclickethnicorigin() {return driver.findElement(secondclickethnicorigin);}
	public WebElement Alldaybooking() {return driver.findElement(Alldaybooking);}
	public WebElement secondAlldaybooking() {return driver.findElement(secondAlldaybooking);}
	public WebElement mondayampm() {return driver.findElement(mondayampm);}
	public WebElement secondmondayampm() {return driver.findElement(secondmondayampm);}
	public WebElement tuesdayampm() {return driver.findElement(tuesdayampm);}
	public WebElement secondtuesdayampm() {return driver.findElement(secondtuesdayampm);}
	public WebElement wednesdayampm() {return driver.findElement(wednesdayampm);}
	public WebElement secondwednesdayampm() {return driver.findElement(secondwednesdayampm);}
	public WebElement thusdayampm() {return driver.findElement(thusdayampm);}
	public WebElement secondthusdayampm() {return driver.findElement(secondthusdayampm);}
	public WebElement fridayampm() {return driver.findElement(fridayampm);}
	public WebElement secondfridayampm() {return driver.findElement(secondfridayampm);}
	public WebElement AMmonday() {return driver.findElement(AMmonday);}
	public WebElement secondAMmonday() {return driver.findElement(secondAMmonday);}
	public WebElement AMtuesday() {return driver.findElement(AMtuesday);}
	public WebElement secondAMtuesday() {return driver.findElement(secondAMtuesday);}
	public WebElement AMwednesday() {return driver.findElement(AMwednesday);}
	public WebElement secondAMwednesday() {return driver.findElement(secondAMwednesday);}
	public WebElement AMthusday() {return driver.findElement(AMthusday);}
	public WebElement AMfriday() {return driver.findElement(AMfriday);}
	public WebElement PMmonday() {return driver.findElement(PMmonday);}
	public WebElement PMtuesday() {return driver.findElement(PMtuesday);}
	public WebElement PMwednesday() {return driver.findElement(PMwednesday);}
	public WebElement PMthusday() {return driver.findElement(PMthusday);}
	public WebElement PMfriday() {return driver.findElement(PMfriday);}
	public WebElement secondAMthusday() {return driver.findElement(secondAMthusday);}
	public WebElement secondAMfriday() {return driver.findElement(secondAMfriday);}
	public WebElement secondPMmonday() {return driver.findElement(secondPMmonday);}
	public WebElement secondPMtuesday() {return driver.findElement(secondPMtuesday);}
	public WebElement secondPMwednesday() {return driver.findElement(secondPMwednesday);}
	public WebElement secondPMthusday() {return driver.findElement(secondPMthusday);}
	public WebElement secondPMfriday() {return driver.findElement(secondPMfriday);}
	public WebElement addenquiry() {return driver.findElement(addenquiry);}
	public WebElement enquirydetails() {return driver.findElement(enquirydetails);}

}

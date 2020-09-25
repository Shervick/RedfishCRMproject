package com.redfishCRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;




public class crmContactpage {
protected static WebDriver driver;
	
	public crmContactpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By crmprofile= By.cssSelector("span#navTabButtonChangeProfileImageLink>img.navTabButtonUserInfoProfileImage");
	By crmsignout=By.linkText("Sign out");
	By crmsingoutsmenu=By.cssSelector("span#navTabButtonUserInfoDropDownId");
	By crmcontactframe1=By.cssSelector("iframe#contentIFrame1");
	By crmcontactframe=By.cssSelector("iframe#contentIFrame0");
	By crmforename=By.cssSelector("input#firstname_i");
	By crmforenamelabel=By.cssSelector("label#Forename_label>div.ms-crm-div-NotVisible");
	By crmlastname=By.cssSelector("input#lastname_i");
	By crmemailaddress1=By.cssSelector("input#emailaddress1_i");
	By crmmobilephone=By.cssSelector("input#mobilephone_i");
	By crmenquirytab=By.cssSelector("table[name='SUMMARY_TAB_ENQUIRY']");
	By crmForename=By.cssSelector("#firstname");
	By crmenquerytable=By.cssSelector("div#contactopportunitiesgrid");
	By crmcontactfram=By.cssSelector("div.crmContentPanel");
	By crmcontactenqlable=By.cssSelector("table#gridBodyTable tr:nth-child(5) > td:nth-child(2) > nobr > a > span");
	By crmcontactenq=By.cssSelector("a[class=ms-crm-List-Link][title*='Enquiry'][id^='gridBodyTable_primaryField'][tabindex='1810']");
	
	public WebElement crmprofile() {return driver.findElement(crmprofile);}
	public WebElement crmsignout() {return driver.findElement(crmsignout);}
	public WebElement crmsingoutsmenu() {return driver.findElement(crmsingoutsmenu);}
	public WebElement crmcontactframe() {return driver.findElement(crmcontactframe);}
	public WebElement crmcontactframe1() {return driver.findElement(crmcontactframe1);}
	public WebElement crmforename() {return driver.findElement(crmforename);}
	public WebElement crmforenamelabel() {return driver.findElement(crmforenamelabel);}
	public WebElement crmlastname() {return driver.findElement(crmlastname);}
	public WebElement crmemailaddress1() {return driver.findElement(crmemailaddress1);}
	public WebElement crmcontactenqlable() {return driver.findElement(crmcontactenqlable);}
	public WebElement crmmobilephone() {return driver.findElement(crmemailaddress1);}
	public WebElement crmenquirytab() {return driver.findElement(crmenquirytab);}
	public WebElement crmForename() {return driver.findElement(crmForename);}
	public WebElement crmenquerytable() {return driver.findElement(crmenquerytable);}
	public WebElement crmcontactfram() {return driver.findElement(crmcontactfram);}
	public WebElement crmcontactenq() {return driver.findElement(crmcontactenq);}
	

}

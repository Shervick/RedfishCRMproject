package com.redfishCRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;




public class crmNurseryPreference {
protected static WebDriver driver;
	
	public crmNurseryPreference(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By crmNPSaveAndClose=By.cssSelector("span[command*='Mscrm.SaveAndClosePrimary']");
	By crmNPnursery=By.cssSelector("table#ems_nurseryid_lookupTable input#ems_nurseryid_ledit");
	
	
	
	public WebElement crmNPsearchtext(String npsearchText) {
		By crmNPsearchtext=By.cssSelector("span[title='" + npsearchText + "']");
		return driver.findElement(crmNPsearchtext);}
	public WebElement crmNPSaveAndClose() {return driver.findElement(crmNPSaveAndClose);}
	public WebElement crmNPnursery() {return driver.findElement(crmNPnursery);}
	
	
	

}

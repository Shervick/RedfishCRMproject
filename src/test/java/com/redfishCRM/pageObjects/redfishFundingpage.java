package com.redfishCRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class redfishFundingpage {
	
	
WebDriver driver;

	public redfishFundingpage(WebDriver driver) {
		this.driver=driver;
}
	By Fundinglink= By.linkText("Funding");
	By AddNewFundinglink= By.linkText("Add New Funding Model");
	By FundingStartDate= By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_FundingModel_Add_StartDate");
	By FundingEndDate= By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_FundingModel_Add_EndDate");
	By FundingType= By.cssSelector("select#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_FundingModel_Add_FundingModelId");
	By FundingEligible = By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_FundingModel_Add_IsEligible");
	By FundingElseWhere=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_FundingModel_Add_HoursElsewhere");
	By FundingSave=By.linkText("Save");
	By FundingCancel=By.linkText("Save");
	By FirstFundingModelEligible=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_FundingModel_lvAvailableFundingModels_ctrl0_ELIGIBLE");
	By FirstFundingModelAdd=By.cssSelector("table#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister tr:nth-child(1) > td:nth-child(6) > a");
	
	public WebElement Fundinglink() {return driver.findElement(Fundinglink);}
	public WebElement AddNewFundinglink() {return driver.findElement(AddNewFundinglink);}
	public WebElement FundingStartDate() {return driver.findElement(FundingStartDate);}
	public WebElement FundingEndDate() {return driver.findElement(FundingEndDate);}
	public WebElement FundingType() {return driver.findElement(FundingType);}
	public WebElement FundingEligible() {return driver.findElement(FundingEligible);}
	public WebElement FundingElseWhere() {return driver.findElement(FundingElseWhere);}
	public WebElement FundingSave() {return driver.findElement(FundingSave);}
	public WebElement FundingCancel() {return driver.findElement(FundingCancel);}
	public WebElement FirstFundingModelEligible() {return driver.findElement(FirstFundingModelEligible);}
	public WebElement FirstFundingModelAdd() {return driver.findElement(FirstFundingModelAdd);}

}

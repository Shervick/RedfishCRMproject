package com.redfishCRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class redfishExtraSessionspage {
	
	
WebDriver driver;

	public redfishExtraSessionspage(WebDriver driver) {
		this.driver=driver;
}
	By ExtraSessionslink= By.linkText("Extra sessions");
	By AddExtraSessionslink= By.linkText("Add an extra session");
	By ExtraSessionsDate= By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_ExtraSessions_fvExtraSession_SESSION_DATE");
	By ExtraSessionsBookingPattern= By.cssSelector("select#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_ExtraSessions_fvExtraSession_ddlValidBookingPatterns");
	By ExtraSessionsReason=By.cssSelector("select#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_ExtraSessions_fvExtraSession_ddlSessionReason");
	By ExtraSessionsAddSession=By.linkText("Add session");
	
	public WebElement ExtraSessionslink() {return driver.findElement(ExtraSessionslink);}
	public WebElement AddExtraSessionslink() {return driver.findElement(AddExtraSessionslink);}
	public WebElement ExtraSessionsDate() {return driver.findElement(ExtraSessionsDate);}
	public WebElement ExtraSessionsBookingPattern() {return driver.findElement(ExtraSessionsBookingPattern);}
	public WebElement ExtraSessionsReason() {return driver.findElement(ExtraSessionsReason);}
	public WebElement ExtraSessionsAddSession() {return driver.findElement(ExtraSessionsAddSession);}

}

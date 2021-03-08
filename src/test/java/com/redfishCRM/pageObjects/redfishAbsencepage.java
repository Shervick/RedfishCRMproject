package com.redfishCRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class redfishAbsencepage {
	
	
WebDriver driver;

	public redfishAbsencepage(WebDriver driver) {
		this.driver=driver;
}
	By Absencelink= By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_MainContent_ContentMainLeft_lbAbsences");
	By AbsenceStartDate= By.cssSelector("input[id$='StartDate']");
	By AbsenceEndDate= By.cssSelector("input[id$='EndDate']");
	By SelectAbsenceReason= By.cssSelector("select[id$='AbsenceType']");
	By AbsenceAdd=By.cssSelector("input[title='Add']");
	
	public WebElement Absencelink() {return driver.findElement(Absencelink);}
	public WebElement AbsenceStartDate() {return driver.findElement(AbsenceStartDate);}
	public WebElement AbsenceEndDate() {return driver.findElement(AbsenceEndDate);}
	public WebElement SelectAbsenceReason() {return driver.findElement(SelectAbsenceReason);}
	public WebElement AbsenceAdd() {return driver.findElement(AbsenceAdd);}

}

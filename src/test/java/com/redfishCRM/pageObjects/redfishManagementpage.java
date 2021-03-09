package com.redfishCRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class redfishManagementpage {
	
	
WebDriver driver;

	public redfishManagementpage(WebDriver driver) {
		this.driver=driver;
}
	By Managementmenulink= By.linkText("Management");
	By ManagementAutomaticTaskslink= By.cssSelector("h3#ctl00_ctl00_MainContent_MainContent_dlMenu_ctl03_cMenuItem_hTitle");
	By ManagementInvoiceMonth= By.cssSelector("select#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_ddlInvoiceMonth");
	By ManagementInvoiceYear= By.cssSelector("select#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_ddlInvoiceYear");
	By ManagementLaunchInvoiceing=By.cssSelector("span#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_ctl30_lText");
	By ManagementLaunchAbsenceCreditNote=By.cssSelector("span#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_ctl21_lText");
	
	public WebElement Managementmenulink() {return driver.findElement(Managementmenulink);}
	public WebElement ManagementAutomaticTaskslink() {return driver.findElement(ManagementAutomaticTaskslink);}
	public WebElement ManagementInvoiceMonth() {return driver.findElement(ManagementInvoiceMonth);}
	public WebElement ManagementInvoiceYear() {return driver.findElement(ManagementInvoiceYear);}
	public WebElement ManagementLaunchInvoiceing() {return driver.findElement(ManagementLaunchInvoiceing);}
	public WebElement ManagementLaunchAbsenceCreditNote() {return driver.findElement(ManagementLaunchAbsenceCreditNote);}

}

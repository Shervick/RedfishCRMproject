package com.redfishCRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;




public class crmHomepage {
protected static WebDriver driver;
	
	public crmHomepage(WebDriver driver)
	{
		this.driver=driver;
	}
	By crmsearchbox=By.cssSelector("input#crmGrid_findCriteria");
	By crmaddcontact=By.cssSelector("span[command*=NewRecordFromGrid]");
	
	By crmeditbutton=By.cssSelector("span[command=\"contact|NoRelationship|HomePageGrid|Mscrm.EditSelectedRecord\"]");
	By crmsearchbutton=By.cssSelector("td.AppQuickFind_Render_td > a.ms-crm-FindButton");
	By crmclickenquiry= By.cssSelector("a[class='ms-crm-List-Link'][title*='Enquiry']");
	By crmclickonnew=By.cssSelector("span.ms-crm-CommandBar-Menu");
	By crmcustomScriptsFrame=By.cssSelector("iframe#customScriptsFrame");
	By crmprofile= By.cssSelector("span#navTabButtonChangeProfileImageLink>img.navTabButtonUserInfoProfileImage");
	By crmsignout=By.cssSelector("div.navUserInfoDropDownMenuContainer>span#navTabButtonUserInfoDropDownId>a#navTabButtonUserInfoSignOutId");
	By crmsingoutsmenu=By.cssSelector("span#navTabButtonUserInfoDropDownId");
	
	public WebElement crmsearchbox() {return driver.findElement(crmsearchbox);}
	public WebElement crmaddcontact() {return driver.findElement(crmaddcontact);}
	public WebElement crmclickonsearchresult(String ParentName) {
		By crmclickonsearchresult=By.linkText(ParentName);
		return driver.findElement(crmclickonsearchresult);}
	public WebElement crmeditbutton() {return driver.findElement(crmeditbutton);}
	public WebElement crmsearchbutton() {return driver.findElement(crmsearchbutton);}
	public WebElement crmclickenquiry() {return driver.findElement(crmclickenquiry);}
	public WebElement crmclickonnew() {return driver.findElement(crmclickonnew);}
	public WebElement crmcustomScriptsFrame() {return driver.findElement(crmcustomScriptsFrame);}
	public WebElement crmprofile() {return driver.findElement(crmprofile);}
	public WebElement crmsignout() {return driver.findElement(crmsignout);}
	public WebElement crmsingoutsmenu() {return driver.findElement(crmsingoutsmenu);}
	
	

}

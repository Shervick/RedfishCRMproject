package com.redfishCRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class redfishEnquiryManagementpage {
	
	
WebDriver driver;

	public redfishEnquiryManagementpage(WebDriver driver) {
		this.driver=driver;
}
	
	By clickonthismonth=By.cssSelector("input#CurrentEnquiries_DateRange1_lbSubmit");
	By submitdaterange=By.cssSelector("a#CurrentEnquiries_DateRange1_rLinks_ctl02_hlLink");
	By repoenenquiry=By.cssSelector("span#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_repEnquiry_ctl00_bReOpenEnquiry_lText");
	By generalnotes=By.cssSelector("textarea#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_repEnquiry_ctl00_newGeneralNote");
	By generalnotessubmit=By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_repEnquiry_ctl00_submitGeneralNote");
	By addvisit=By.cssSelector("div#contactVisits h2 > a");
	By visitdate=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_repEnquiry_ctl00_tbVisitDate");
	By visitdateid=By.id("ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_repEnquiry_ctl00_tbVisitDate");
	By visittime=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_repEnquiry_ctl00_tbVisitTime");
	By clickvisitdate=By.cssSelector("div#contactVisits span:nth-child(6)");
	By maincomment=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_repEnquiry_ctl00_tbVisitComment");
	By maincommentlabelclick=By.cssSelector("div#contactVisits span:nth-child(12)");
	By addvisitbutton=By.cssSelector("span#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_repEnquiry_ctl00_btnAddVisit_lText");
	By closeenquirybutton=By.cssSelector("span#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_repEnquiry_ctl00_btDelete_lText");
	By closereasondropdown=By.cssSelector("select#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_repEnquiry_ctl00_ddlCloseReasons");
	By closeenqbutton=By.cssSelector("span#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_repEnquiry_ctl00_bCloseEnquiry2_lText");
	By towaitinglist=By.cssSelector("span#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_repEnquiry_ctl00_repChild_ctl01_bWaiting_lText");
	By removewaiting=By.cssSelector("span#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_repEnquiry_ctl00_repChild_ctl01_bWaiting_lText");
	By watingText=By.cssSelector("div#childDetails tr.childBottomTR > td:nth-child(1) > span");
	
	
	public WebElement clickonthismonth() {return driver.findElement(clickonthismonth);}
	public WebElement submitdaterange() {return driver.findElement(submitdaterange);}
	public WebElement repoenenquiry() {return driver.findElement(repoenenquiry);}
	public WebElement generalnotes() {return driver.findElement(generalnotes);}
	public WebElement generalnotessubmit() {return driver.findElement(generalnotessubmit);}
	public WebElement addvisit() {return driver.findElement(addvisit);}
	public WebElement visitdate() {return driver.findElement(visitdate);}
	public WebElement visittime() {return driver.findElement(visittime);}
	public WebElement clickvisitdate() {return driver.findElement(clickvisitdate);}
	public WebElement maincomment() {return driver.findElement(maincomment);}
	public WebElement maincommentlabelclick() {return driver.findElement(maincommentlabelclick);}
	public WebElement addvisitbutton() {return driver.findElement(addvisitbutton);}
	public WebElement closeenquirybutton() {return driver.findElement(closeenquirybutton);}
	public WebElement closereasondropdown() {return driver.findElement(closereasondropdown);}
	public WebElement closeenqbutton() {return driver.findElement(closeenqbutton);}
	public WebElement towaitinglist() {return driver.findElement(towaitinglist);}
	public WebElement removewaiting() {return driver.findElement(removewaiting);}
	public WebElement watingText() {return driver.findElement(watingText);}
	
	
}

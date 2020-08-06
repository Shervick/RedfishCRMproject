package com.redfishCRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class redfishsearchpage {
	
	
WebDriver driver;

	public redfishsearchpage(WebDriver driver) {
		this.driver=driver;
}
	
	By searchbox=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_tSearch");
	By clickonsearch=By.cssSelector("#ctl00_ctl00_ctl00_MainContent_imgSearch");
	By searchboxinform=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_SEARCH");
	By clickonchildcheckbox=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_search_child");
	By clickonparentcheckbox=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_search_parent");
	By clickclosedenquirycheckbox=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_search_closed_enquiry");
	By clickonnurserycheckbox=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_search_nursery");
	By clickonroomscheckbox=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_search_room");
	By clickenquirycheckbox=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_search_enquiry");
	By clickoneaitinglistcheckbox=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_search_waiting");
	By clickoncloseenquiry=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_search_closed_enquiry");
	By clickonsearchlink=By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lbSearch");
	By clickonsearchresult=By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_rSearch_ctl00_hlItem");
	By searchtext=By.cssSelector("span#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_lSearch");
	
	public WebElement searchbox() {return driver.findElement(searchbox);}
	public WebElement clickonsearch() {return driver.findElement(clickonsearch);}
	public WebElement searchboxinform() {return driver.findElement(searchboxinform);}
	public WebElement clickonchildcheckbox() {return driver.findElement(clickonchildcheckbox);}
	public WebElement clickonparentcheckbox() {return driver.findElement(clickonparentcheckbox);}
	public WebElement clickonnurserycheckbox() {return driver.findElement(clickonnurserycheckbox);}
	public WebElement clickonroomscheckbox() {return driver.findElement(clickonroomscheckbox);}
	public WebElement clickenquirycheckbox() {return driver.findElement(clickenquirycheckbox);}
	public WebElement clickoneaitinglistcheckbox() {return driver.findElement(clickoneaitinglistcheckbox);}
	public WebElement clickclosedenquirycheckbox() {return driver.findElement(clickclosedenquirycheckbox);}
	public WebElement clickonsearchresult() {return driver.findElement(clickonsearchresult);}
	public WebElement clickonsearchlink() {return driver.findElement(clickonsearchlink);}
	public WebElement searchtext() {return driver.findElement(searchtext);}

}

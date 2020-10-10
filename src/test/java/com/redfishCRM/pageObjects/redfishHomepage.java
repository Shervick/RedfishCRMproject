package com.redfishCRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class redfishHomepage {
	
	
WebDriver driver;

	public redfishHomepage(WebDriver driver) {
		this.driver=driver;
}
	By Enquiriesmainmenulink=By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_MenuContent_rMainMenu_ctl01_hlMenu");
	By Enquiriesubmenulink= By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_SubMenuContent_rSubMenuItems_ctl02_hlMenu");
	By searchbox=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_tSearch");
	
	public WebElement Enquiriesmainmenulink() {return driver.findElement(Enquiriesmainmenulink);}
	public WebElement Enquiriesubmenulink() {return driver.findElement(Enquiriesubmenulink);}
	public WebElement searchbox() {return driver.findElement(searchbox);}

}

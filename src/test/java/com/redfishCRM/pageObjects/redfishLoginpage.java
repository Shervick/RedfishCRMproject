package com.redfishCRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class redfishLoginpage {
	
	
WebDriver driver;

	public redfishLoginpage(WebDriver driver) {
		this.driver=driver;
}
	By Username= By.cssSelector("input#ctl00_MainContent_lLogin_UserName");
	By Password= By.cssSelector("input#ctl00_MainContent_lLogin_Password");
	By Login= By.cssSelector("input#ctl00_MainContent_lLogin_Login");
	
	public WebElement Username() {return driver.findElement(Username);}
	public WebElement Password() {return driver.findElement(Password);}
	public WebElement Login() {return driver.findElement(Login);}

}

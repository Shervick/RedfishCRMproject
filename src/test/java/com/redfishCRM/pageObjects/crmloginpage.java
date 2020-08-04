package com.redfishCRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;




public class crmloginpage {
protected static WebDriver driver;
	
	public crmloginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	By crmUsername= By.cssSelector("input#userNameInput");
	By crmPassword= By.cssSelector("input#passwordInput");
	By crmsignin= By.cssSelector("span#submitButton");
	
	public WebElement crmUsername() {return driver.findElement(crmUsername);}
	public WebElement crmPassword() {return driver.findElement(crmPassword);}
	public WebElement crmsignin() {return driver.findElement(crmsignin);}

}

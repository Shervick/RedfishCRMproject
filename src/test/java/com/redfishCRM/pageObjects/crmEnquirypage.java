package com.redfishCRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;




public class crmEnquirypage {
protected static WebDriver driver;
	
	public crmEnquirypage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By crmEnqnavig=By.cssSelector("a#FormSecNavigationControl-Icon");
	By crmnavalue=By.cssSelector("td[id='flyoutFormSection_Cell'][title='Visits']");
	By crmfirstvisit= By.cssSelector("a[title*='Visit'][id$='_0']");
	By crmlatestvisit= By.cssSelector("a[title*='Visit'][id$='_1']");
	
	public WebElement crmnavalue() {return driver.findElement(crmnavalue);}
	public WebElement crmEnqnavig() {return driver.findElement(crmEnqnavig);}
	public WebElement crmfirstvisit() {return driver.findElement(crmfirstvisit);}
	public WebElement crmlatestvisit() {return driver.findElement(crmlatestvisit);}
	
	

}

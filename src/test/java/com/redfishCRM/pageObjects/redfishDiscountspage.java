package com.redfishCRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class redfishDiscountspage {
	
	
WebDriver driver;

	public redfishDiscountspage(WebDriver driver) {
		this.driver=driver;
}
	By Discountslink= By.linkText("Discounts");
	By DiscountsStartDate= By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_Discount_lvDiscount_ctrl0_dbStartDate_tbDate");
	By DiscountsEndDate= By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_Discount_lvDiscount_ctrl0_dbEndDate_tbDate");
	By DiscountsNameRate= By.cssSelector("select#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_Discount_lvDiscount_ctrl0_ddlDiscountId");
	By DiscountsOrder=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_Discount_lvDiscount_ctrl0_tbOrderIndex");
	By DiscountsAdd=By.cssSelector("input[title='Add']");
	
	public WebElement Discountslink() {return driver.findElement(Discountslink);}
	public WebElement DiscountsStartDate() {return driver.findElement(DiscountsStartDate);}
	public WebElement DiscountsEndDate() {return driver.findElement(DiscountsEndDate);}
	public WebElement DiscountsNameRate() {return driver.findElement(DiscountsNameRate);}
	public WebElement DiscountsOrder() {return driver.findElement(DiscountsOrder);}
	public WebElement DiscountsAdd() {return driver.findElement(DiscountsAdd);}

}

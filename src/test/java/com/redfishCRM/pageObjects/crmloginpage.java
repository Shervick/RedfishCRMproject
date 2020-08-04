package com.redfishCRM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;




public class crmloginpage {
	WebDriver localdriver;
	public crmloginpage(WebDriver publicdriver)
	{
		localdriver=publicdriver;
		PageFactory.initElements(publicdriver, this);
	}
	@FindBy(name="UserName")
	@CacheLookup
	WebElement crmUsername;
	
	@FindBy(name="Password")
	@CacheLookup
	WebElement crmPassword;
	
	@FindBy(how = How.CLASS_NAME, using = "submit")
	@CacheLookup
	WebElement crmsubmit;
	
	@FindBy(className="navTabButtonUserInfoProfileImage")
	@CacheLookup
	WebElement crmprofile;
	
	//navTabButtonUserInfoSignOutId
	@FindBy(css="a#navTabButtonUserInfoSignOutId")
	@CacheLookup
	WebElement crmsignout;
	
	public void setUserName(String crmuname){crmUsername.sendKeys(crmuname);}
	public void setPassword(String crmuPassword){crmPassword.sendKeys(crmuPassword);}
	public void clicksubmit(){crmsubmit.click();}
	public void crmprofile(){crmprofile.click();}
	public void crmsignout(){crmsignout.click();}

}

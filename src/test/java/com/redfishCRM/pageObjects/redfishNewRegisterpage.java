package com.redfishCRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class redfishNewRegisterpage {
	
	
WebDriver driver;

	public redfishNewRegisterpage(WebDriver driver) {
		this.driver=driver;
}
	
	By registerchild=By.cssSelector("span#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_repEnquiry_ctl00_repChild_ctl01_bRegister_lText");
	By register2nchild=By.cssSelector("span#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_repEnquiry_ctl00_repChild_ctl02_bRegister_lText");
	By siblingyes=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_rbYes");
	By siblingno=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_rbNo");
	By nextfromsibling=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_StartNavigationTemplateContainerID_bNext");
	By relationship=By.cssSelector("select#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_MainParent_PARENT_TYPE_ID");
	By parentalresponsibility=By.cssSelector("div#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_MainParent_pParent span:nth-child(1) > label");
	By tfcreference=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_Child_TFCREFERENCE");
	By LEAFEETReference=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_Child_LEAFEETREFERENCE");
	By hrFundingCode=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_Child_FUNDING30CODE");
	By regmobilenumber=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_MainParent_MOBILE");
	By regemailid=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_MainParent_EMAIL");
	By regdob=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_Child_DOB");
	By nextparent=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_StepNavigationTemplateContainerID_bNext");
	By enrolmentenddate=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_Enrolment_LEAVE_DATE");
	By nextchild=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_StepNavigationTemplateContainerID_bNext");
	By PhotoPreferenceall=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_Child_rblPhoto_0");
	By PhotoPreferenceIndividual=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_Child_rblPhoto_1");
	By PhotoPreferenceNA=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_Child_rblPhoto_2");
	By nextHealthcare=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_StepNavigationTemplateContainerID_bNext");
	By nextDietary=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_StepNavigationTemplateContainerID_bNext");
	By Donotaddanotherparent=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_cbOtherParent");
	By nextenrolment=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_StepNavigationTemplateContainerID_bNext");
	By nextfunding=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_StepNavigationTemplateContainerID_bNext");
	By nextvouchers=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_StepNavigationTemplateContainerID_bNext");
	By finish=By.cssSelector("input#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_wRegister_FinishNavigationTemplateContainerID_FinishButton");
	By logout=By.cssSelector("a#ctl00_ctl00_ctl00_MainContent_MainLoginView");
	
	public WebElement registerchild() {return driver.findElement(registerchild);}
	public WebElement register2nchild() {return driver.findElement(register2nchild);}
	public WebElement siblingyes() {return driver.findElement(siblingyes);}
	public WebElement siblingno() {return driver.findElement(siblingno);}
	public WebElement nextfromsibling() {return driver.findElement(nextfromsibling);}
	public WebElement relationship() {return driver.findElement(relationship);}
	public WebElement PhotoPreferenceall() {return driver.findElement(PhotoPreferenceall);}
	public WebElement PhotoPreferenceIndividual() {return driver.findElement(PhotoPreferenceIndividual);}
	public WebElement PhotoPreferenceNA() {return driver.findElement(PhotoPreferenceNA);}
	public WebElement parentalresponsibility() {return driver.findElement(parentalresponsibility);}
	public WebElement regmobilenumber() {return driver.findElement(regmobilenumber);}
	public WebElement regemailid() {return driver.findElement(regemailid);}
	public WebElement regdob() {return driver.findElement(regdob);}
	public WebElement tfcreference() {return driver.findElement(tfcreference);}
	public WebElement LEAFEETReference() {return driver.findElement(LEAFEETReference);}
	public WebElement hrFundingCode() {return driver.findElement(hrFundingCode);}
	public WebElement nextparent() {return driver.findElement(nextparent);}
	public WebElement nextchild() {return driver.findElement(nextchild);}
	public WebElement nextHealthcare() {return driver.findElement(nextHealthcare);}
	public WebElement nextDietary() {return driver.findElement(nextDietary);}
	public WebElement enrolmentenddate() {return driver.findElement(enrolmentenddate);}
	public WebElement Donotaddanotherparent() {return driver.findElement(Donotaddanotherparent);}
	public WebElement nextenrolment() {return driver.findElement(nextenrolment);}
	public WebElement nextfunding() {return driver.findElement(nextfunding);}
	public WebElement nextvouchers() {return driver.findElement(nextvouchers);}
	public WebElement finish() {return driver.findElement(finish);}
	public WebElement logout() {return driver.findElement(logout);}

}

Feature: Validate RedfishCRM Workflows
@RedfishCRMContactSearch @Regression 
Scenario Outline: Verify if user is able to create an enquiry and register the child
Given Initialize the browser with chrome
And Open Web Application "<application>" 
When User enters RedfishCRM User Name "<UserName>" and Password "<Password>"
Then Verify if the RedfishCRM web page title actual "<expectedtitle>"
Then Verify if user able to search with parent email id "<ParentEmailID>"
Then Verify if Enquiry is created by taking the screen shot of the enquiry table
Then Logout from redfishCRM and close browser

Examples:
	|UserName|Password|application|expectedtitle|ParentEmailID|ParentFirstName|ParentSecondName|EnquiryType|MobileNumber|
    |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|scfwittringtonok@geocities.com|SC Sharline|SC Wittrington|Web|07154264962|

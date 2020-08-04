Feature: Validate Redfish Workflows  Page
@RedfishLoginPage @Regression
Scenario Outline: Varify if user is able to login Successfully
Given Initialize the browser with chrome
And Open Web Application "<application>" 
When User enters User Name "<UserName>" and Password "<Password>"
Then Verify if the web page title actual "<expectedtitle>"
And In home page verify if Enquiries and Enquiry in the main menu 
When Clicked on menu item "<MainMenuItem>" and submenu "<SubMenuItem>"
Then Verify if the web page submenu title is "<expectedenqtitle>"
		
Examples:
	|UserName                    |Password  |application |expectedtitle |MainMenuItem |SubMenuItem |expectedenqtitle |										   |
	|99160101NM                  |Password1 |redfishUrl  |Home 			|Enquiries    |Enquiry     |New enquiry      |									   |
	
	
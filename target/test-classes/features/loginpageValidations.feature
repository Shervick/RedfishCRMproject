Feature: Validate Redfish Login  Page

Scenario Outline: Varify if user is able to login Successfully
Given Initialize the browser with chrome
And Open Web Application "<application>" 
When User enters User Name "<UserName>" and Password "<Password>"
Then Verify if the web page title actual "<expectedtitle>"
		
Examples:
	|UserName                    |Password  |application |expectedtitle 										   |
	|99160101NM                  |Password1 |redfishUrl  |Home          										   |
	
	
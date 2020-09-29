#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: 03.2 Contact Management
@SmokeRegressionTC1_3
Scenario Outline: Search a Contact
Given Initialize the browser with chrome
And Open Web Application "<application>" 
When User enters RedfishCRM User Name "<UserName>" and Password "<Password>"
Then Verify if the RedfishCRM web page title actual "<expectedtitle>"
Then Verify if the Contacts Associated View is displayed take screenshot in "<contactviewfilename>"
When Verify if user able to search with parent Full Name "<ParentName>" screenshot in "<FullNameFileName>"
When Verify if user able to search with parent email id "<ParentEmailID>" screenshot in "<ParentEmailIDFileName>"
When Verify if user able to search with Post Code "<Postcode>" screenshot in "<Postcodefilename>"
When Verify if user able to search with invalid search key "<InvalidSearch>" screenshot in "<InvalidSearchFilename>"
Then Logout from redfishCRM and close browser "<CRMlogoutfilename>"

Examples:
   |UserName|Password|application|expectedtitle|ParentEmailID|Postcode|ParentFirstName|ParentSecondName|ParentName|EnquiryType|InvalidSearch|MobileNumber|contactfilename|contactwithenqfilename|CRMlogoutfilename|CRMEnquiryTitle|Enquiryfilename|CRMVisitTitle|Visitfilename|FullNameFileName|ParentEmailIDFileName|Postcodefilename|InvalidSearchFilename|contactviewfilename|
   |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|tbonusj7@msn.com|SO17 0LG|Thomas|Bonus|Thomas Bonus|RedFish|@#$|07519079058|contactThomasBonus|contactenqThomasBonus|contactlogoutThomasBonus|Enquiry: RedFish Enquiry|EnquiryThomasBonus|Appointment: Visit|VisitThomasBonus|FullNameThomas Bonus|ParentEmailIDtbonusj7@msn.com|PostcodefileSO17 0LG|InvalidsearchThomas|contactviewThomas|
   |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|awatmoughj8@abc.com|SO18 0LG|Asia|Watmough|Asia Watmough|RedFish|14/10/2020|07754100342|contactAsiaWatmough|contactenqAsiaWatmough|contactlogoutAsiaWatmough|Enquiry: RedFish Enquiry|EnquiryAsiaWatmough|Appointment: Visit|VisitAsiaWatmough|FullNameAsia Watmough|ParentEmailIDawatmoughj8@abc.com|PostcodefileSO18 0LG|InvalidsearchAsia|contactviewAsia|
   |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|adebiasij9@pbs.com|SO19 0LG|Arch|De Biasi|Arch De Biasi|RedFish|901Arch|07534038719|contactArchDe Biasi|contactenqArchDe Biasi|contactlogoutArchDe Biasi|Enquiry: RedFish Enquiry|EnquiryArchDe Biasi|Appointment: Visit|VisitArchDe Biasi|FullNameArch De Biasi|ParentEmailIDadebiasij9@pbs.com|PostcodefileSO19 0LG|InvalidsearchArch|contactviewArch|

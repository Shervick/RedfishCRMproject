Feature: Validate Redfish Workflows  Page
@RedfishEnquirySingleChild @Regression
Scenario Outline: Varify if user is able to login Successfully
Given Initialize the browser with chrome
And Open Web Application "<application>" 
When User enters User Name "<UserName>" and Password "<Password>"
Then Verify if the web page title actual "<expectedtitle>"
And In home page verify if Enquiries and Enquiry in the main menu 
When Clicked on menu item "<MainMenuItem>" and submenu "<SubMenuItem>"
Then Verify if the web page submenu title is "<expectedenqtitle>"
When Parent First Name "<ParentFirstName>" Parent Second Name "<ParentSecondName>" Address "<Address>" Postcode "<Postcode>" MobileNumber "<MobileNumber>" Email id "<EmailId>"
When The source is selected as "<Source>"
When The First Child First Name "<FirstChildFirstName>" First Child Second Name "<SecondChildSecondName>" First Child DOB "<DOB>" Gender "<FirstChildGender>" Enrolment Start Date "<FirstEnrolmentStartDate>"   
When Booking Patten is "<BookingPatten>" and Click on Add Enquiry
Then Verify if the Enquiry is created and Enquiry Details "<EnquiryDetails>" is displayed on the Parent Name Click on
When Clicked on register first child with sibling "<Sibling>"
When Selecting the Relationship status as "<Relationship>" and Parental Parental Responsibility as "<ParentalResponsibility>"	
When Selecting the PhotoPreference as "<PhotoPreference>"
When The TFC Reference "<TFCReference>" and LEAFEETReference "<LEAFEETReference>" and hrFundingCode "<hrFundingCode>"
Then Verify if the child is registered "<ChildProfileTitle>" 

Examples:
	|UserName                    |Password  |application |expectedtitle |MainMenuItem |SubMenuItem |expectedenqtitle |ParentFirstName |ParentSecondName |Address 				|Postcode |MobileNumber |EmailId 			     |Source     |FirstChildFirstName |SecondChildSecondName |DOB        |FirstChildGender |FirstEnrolmentStartDate |BookingPatten |EnquiryDetails  |Sibling |Relationship |ParentalResponsibility |PhotoPreference |TFCReference |LEAFEETReference |hrFundingCode |ChildProfileTitle |							  
	|99160101NM                  |Password1 |redfishUrl  |Home 			|Enquiries    |Enquiry     |New enquiry      |Toinette 	      |Sueter           |99-2041 St. Marys Road |SO18 0LG |07497526694  |tsueterbq@unblog.com    |BH Website |Rube                |Zimmermanns           |10/07/2019 |F                |04/08/2020              |All Days      |Enquiry Details |No      |Mother       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000027   |Child             |
	
	
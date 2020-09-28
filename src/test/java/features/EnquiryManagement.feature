Feature: 03.1 Enquiry Management
@SmokeRegressionTC1_1 @Test
Scenario Outline: DataCreationInRedfish_Verify if redfish Enquiry Booking, Child, Notes, Nursery and Visit are created in redfish is automatically created in CRM
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
When First child Booking Patten is "<BookingPatten>"
When The Second Child First Name "<SecondChildFirstName>" Second Child Second Name "<SecondChildSecondName>" First Child DOB "<SecondChildDOB>" Gender "<SecondChildGender>" Enrolment Start Date "<SecondEnrolmentStartDate>"
When Second Child Booking Patten is "<SecondBookingPatten>" 
Then Click on Add Enquiry
Then Submit General Notes "<ParentName>"
When Verify if user can add a visit with visit date "<VisitDate>" and visit time "<VisitTime>" with main comment "<ParentSecondName>"
Then Logout from redfish and close browser


Examples:
	|UserName|Password|application|expectedtitle|MainMenuItem|SubMenuItem|expectedenqtitle|ParentFirstName|ParentSecondName|ParentName|Address|Postcode|MobileNumber|EmailId|Source|FirstChildFirstName|SecondChildSecondName|DOB|FirstChildGender|FirstEnrolmentStartDate|FirstEnrolmentEndDate|BookingPatten|SecondChildFirstName|SecondChildSecondName|SecondChildDOB|SecondChildGender|SecondEnrolmentStartDate|SecondBookingPatten|EnquiryDetails|Sibling|Relationship|ParentalResponsibility|PhotoPreference|TFCReference|LEAFEETReference|hrFundingCode|ChildProfileTitle|VisitDate|VisitTime|
  |99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Thomas|Bonus|Thomas Bonus|99-2118 St. Marys Road|SO17 0LG|07519079058|tbonusj7@msn.com|BH Website|Philbert|Bonus|28/09/2017|M|28/09/2020|27/09/2021|All Days|Otha|Bonus|28/09/2018|F|28/09/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000155|Child|30/09/2020|0930|
  |99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Asia|Watmough|Asia Watmough|99-2119 St. Marys Road|SO18 0LG|07754100342|awatmoughj8@abc.com|BH Website|Mar|Watmough|28/09/2017|M|28/09/2020|27/09/2021|All Days|Fonsie|Watmough|28/09/2018|M|28/09/2020|All Days|Enquiry Details|No|Mother|Yes|All|DAST25417TFC|MIOS62392TFC|50700000156|Child|30/09/2020|0930|
  |99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Arch|De Biasi|Arch De Biasi|99-2120 St. Marys Road|SO19 0LG|07534038719|adebiasij9@pbs.com|BH Website|Tansy|De Biasi|28/09/2017|F|28/09/2020|27/09/2021|All Days|Rory|De Biasi|28/09/2018|F|28/09/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000157|Child|30/09/2020|0930|

@SmokeRegressionTC1_2 @Test
Scenario Outline: DataVerificationInCRM_Verify if redfish Enquiry Booking, Child, Notes, Nursery and Visit are created in redfish is automatically created in CRM
Given Initialize the browser with chrome
And Open Web Application "<application>" 
When User enters RedfishCRM User Name "<UserName>" and Password "<Password>"
Then Verify if the RedfishCRM web page title actual "<expectedtitle>"
Then Verify if user able to search with parent email id "<ParentEmailID>" "<contactfilename>"
Then Verify if Enquiry is created by taking the screen shot of the enquiry table "<contactwithenqfilename>"
Then Verify if user able to open the enquiry and verify the title as "<CRMEnquiryTitle>" screenshot in "<Enquiryfilename>"
Then Verify if user able to open the visit and verify the title as "<CRMVisitTitle>" screenshot in "<Visitfilename>"
Then Logout from redfishCRM and close browser "<CRMlogoutfilename>"

Examples:
	|UserName|Password|application|expectedtitle|ParentEmailID|ParentFirstName|ParentSecondName|EnquiryType|MobileNumber|contactfilename|contactwithenqfilename|CRMlogoutfilename|CRMEnquiryTitle|Enquiryfilename|CRMVisitTitle|Visitfilename|
  |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|tbonusj7@msn.com|Thomas|Bonus|RedFish|07519079058|contactThomasBonus|contactenqThomasBonus|contactlogoutThomasBonus|Enquiry: RedFish Enquiry|EnquiryThomasBonus|Appointment: Visit|VisitThomasBonus|
  |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|awatmoughj8@abc.com|Asia|Watmough|RedFish|07754100342|contactAsiaWatmough|contactenqAsiaWatmough|contactlogoutAsiaWatmough|Enquiry: RedFish Enquiry|EnquiryAsiaWatmough|Appointment: Visit|VisitAsiaWatmough|
  |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|adebiasij9@pbs.com|Arch|De Biasi|RedFish|07534038719|contactArchDe Biasi|contactenqArchDe Biasi|contactlogoutArchDe Biasi|Enquiry: RedFish Enquiry|EnquiryArchDe Biasi|Appointment: Visit|VisitArchDe Biasi|

  
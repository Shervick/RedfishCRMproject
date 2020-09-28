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
  |99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Jermaine|Shirer|Jermaine Shirer|99-2103 St. Marys Road|SO93 0LG|07600146121|jshirerkg@youku.com|BH Website|Faith|Shirer|27/09/2017|F|27/09/2020|27/09/2021|All Days|Jessalin|Shirer|27/09/2018|F|27/09/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000140|Child|29/09/2020|0930|
  |99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Ysabel|Benini|Ysabel Benini|99-2104 St. Marys Road|SO94 0LG|07889808237|ybeninikh@diigo.com|BH Website|Tisha|Benini|27/09/2017|F|27/09/2020|27/09/2021|All Days|Shani|Benini|27/09/2018|F|27/09/2020|All Days|Enquiry Details|No|Mother|Yes|All|DAST25417TFC|MIOS62392TFC|50700000141|Child|29/09/2020|0930|
  |99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Freddie|Lowless|Freddie Lowless|99-2105 St. Marys Road|SO95 0LG|07987340868|flowlesski@technorati.com|BH Website|Cynthy|Lowless|27/09/2017|F|27/09/2020|27/09/2021|All Days|Cad|Lowless|27/09/2018|M|27/09/2020|All Days|Enquiry Details|No|Mother|Yes|All|DAST25417TFC|MIOS62392TFC|50700000142|Child|29/09/2020|0930|

@SmokeRegressionTC1_2 @Test
Scenario Outline: DataVerificationInCRM_Verify if redfish Enquiry Booking, Child, Notes, Nursery and Visit are created in redfish is automatically created in CRM
Given Initialize the browser with chrome
And Open Web Application "<application>" 
When User enters RedfishCRM User Name "<UserName>" and Password "<Password>"
Then Verify if the RedfishCRM web page title actual "<expectedtitle>"
Then Verify if user able to search with parent email id "<ParentEmailID>" "<contactfilename>"
Then Verify if Enquiry is created by taking the screen shot of the enquiry table "<contactwithenqfilename>"
Then Verify if the CRMcontact screen has the expected first name "<ParentFirstName>"
Then Verify if user able to open the enquiry and verify the title as "<CRMEnquiryTitle>" screenshot in "<Enquiryfilename>"
Then Verify if user able to open the visit and verify the title as "<CRMVisitTitle>" screenshot in "<Visitfilename>"
Then Logout from redfishCRM and close browser "<CRMlogoutfilename>"

Examples:
	|UserName|Password|application|expectedtitle|ParentEmailID|ParentFirstName|ParentSecondName|EnquiryType|MobileNumber|contactfilename|contactwithenqfilename|CRMlogoutfilename|CRMEnquiryTitle|Enquiryfilename|CRMVisitTitle|Visitfilename|
  |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|jshirerkg@youku.com|Jermaine|Shirer|RedFish|07600146121|contactJermaineShirer|contactenqJermaineShirer|contactlogoutJermaineShirer|Enquiry: RedFish Enquiry|EnquiryJermaineShirer|Appointment: Visit|VisitJermaineShirer|
  |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|ybeninikh@diigo.com|Ysabel|Benini|RedFish|07889808237|contactYsabelBenini|contactenqYsabelBenini|contactlogoutYsabelBenini|Enquiry: RedFish Enquiry|EnquiryYsabelBenini|Appointment: Visit|VisitYsabelBenini|
  |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|flowlesski@technorati.com|Freddie|Lowless|RedFish|07987340868|contactFreddieLowless|contactenqFreddieLowless|contactlogoutFreddieLowless|Enquiry: RedFish Enquiry|EnquiryFreddieLowless|Appointment: Visit|VisitFreddieLowless|

  
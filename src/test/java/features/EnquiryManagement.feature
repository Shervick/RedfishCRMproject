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
  |99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Joya|St Clair|Joya St Clair|99-2138 St. Marys Road|SO38 0LG|07334330307|jstclairgu@eepurl.com|BH Website|Olav|St Clair|09/10/2017|M|09/10/2020|27/09/2021|All Days|Arnoldo|St Clair|09/10/2018|M|14/10/2020|All Days|Enquiry Details|No|Mother|Yes|All|DAST25417TFC|MIOS62392TFC|50700000179|Child|14/10/2020|0930|
  |99160101NM2|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Der|Fawdrey|Der Fawdrey|99-2139 St. Marys Road|SO39 0LG|07958076043|dfawdreygv@networksolutions.com|BH Website|Beale|Fawdrey|09/10/2017|M|09/10/2020|27/09/2021|All Days|Adelle|Fawdrey|09/10/2018|F|14/10/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000180|Child|14/10/2020|0930|
  |99160101NM3|Password01|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Cass|Antoszczyk|Cass Antoszczyk|99-2140 St. Marys Road|SO40 0LG|07947431833|cantoszczykgw@tamu.com|BH Website|Tiena|Antoszczyk|09/10/2017|F|09/10/2020|27/09/2021|All Days|Rufus|Antoszczyk|09/10/2018|M|14/10/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000181|Child|14/10/2020|0930|

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
   |UserName|Password|application|expectedtitle|ParentEmailID|Postcode|ParentFirstName|ParentSecondName|ParentName|EnquiryType|InvalidSearch|MobileNumber|contactfilename|contactwithenqfilename|CRMlogoutfilename|CRMEnquiryTitle|Enquiryfilename|CRMVisitTitle|Visitfilename|FullNameFileName|ParentEmailIDFileName|Postcodefilename|InvalidSearchFilename|contactviewfilename|
   |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|jstclairgu@eepurl.com|SO38 0LG|Joya|Tythacott|Joya Tythacott|RedFish|@#$|07334330307|contactJoyaTythacott|contactenqJoyaTythacott|contactlogoutJoyaTythacott|Enquiry: RedFish Enquiry|EnquiryJoyaTythacott|Appointment: Visit|VisitJoyaTythacott|FullNameJoya Tythacott|ParentEmailIDjstclairgu@eepurl.com|PostcodefileSO38 0LG|InvalidsearchJoya|contactviewJoya|
   |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|dfawdreygv@networksolutions.com|SO39 0LG|Der|Blouet|Der Blouet|RedFish|14/10/2020|07958076043|contactDerBlouet|contactenqDerBlouet|contactlogoutDerBlouet|Enquiry: RedFish Enquiry|EnquiryDerBlouet|Appointment: Visit|VisitDerBlouet|FullNameDer Blouet|ParentEmailIDdfawdreygv@networksolutions.com|PostcodefileSO39 0LG|InvalidsearchDer|contactviewDer|
   |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|cantoszczykgw@tamu.com|SO40 0LG|Cass|Langfield|Cass Langfield|RedFish|901Cass|07947431833|contactCassLangfield|contactenqCassLangfield|contactlogoutCassLangfield|Enquiry: RedFish Enquiry|EnquiryCassLangfield|Appointment: Visit|VisitCassLangfield|FullNameCass Langfield|ParentEmailIDcantoszczykgw@tamu.com|PostcodefileSO40 0LG|InvalidsearchCass|contactviewCass|

@SmokeRegressionTC1_3 @Register2Children
Scenario Outline: Verify if user is able to register the two children
Given Initialize the browser with chrome
And Open Web Application "<application>" 
When User enters User Name "<UserName>" and Password "<Password>"
Then Verify if the web page title actual "<expectedtitle>"
Then Verify search functionality with only Parent Name "<EmailId>" in search page
Then Verify Enquiry search functionality with only Parent Name "<EmailId>" in search page
When Clicked on register First child with sibling with "<Sibling>"
When Selecting the Relationship status as "<Relationship>" and Parental Parental Responsibility as "<ParentalResponsibility>"	
When Selecting the PhotoPreference as "<PhotoPreference>"
When The TFC Reference "<TFCReference>" and LEAFEETReference "<LEAFEETReference>" and hrFundingCode "<hrFundingCode>"
When The Enrolment Leave date is "<FirstEnrolmentEndDate>"
Then Verify if the child is registered "<ChildProfileTitle>" 
Then Verify search functionality with only Parent Name "<ParentName>" in search page
Then Verify Enquiry search functionality with only Parent Name "<EmailId>" in search page
When Clicked on register Second child with sibling "<Sibling>"
When Selecting the Relationship status as "<Relationship>" and Parental Parental Responsibility as "<ParentalResponsibility>"	
When Selecting the PhotoPreference as "<PhotoPreference>"
When The TFC Reference "<TFCReference>" and LEAFEETReference "<LEAFEETReference>" and hrFundingCode "<hrFundingCode>"
When The Enrolment Leave date is "<FirstEnrolmentEndDate>"
Then Verify if the child is registered "<ChildProfileTitle>" 
Then Logout from redfish and close browser

Examples:
	|UserName|Password|application|expectedtitle|MainMenuItem|SubMenuItem|expectedenqtitle|ParentFirstName|ParentSecondName|ParentName|Address|Postcode|MobileNumber|EmailId|Source|FirstChildFirstName|SecondChildSecondName|DOB|FirstChildGender|FirstEnrolmentStartDate|FirstEnrolmentEndDate|BookingPatten|SecondChildFirstName|SecondChildSecondName|SecondChildDOB|SecondChildGender|SecondEnrolmentStartDate|SecondBookingPatten|EnquiryDetails|Sibling|Relationship|ParentalResponsibility|PhotoPreference|TFCReference|LEAFEETReference|hrFundingCode|ChildProfileTitle|VisitDate|VisitTime|
  |99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Consolata|Matten|Consolata Matten|99-2132 St. Marys Road|SO32 0LG|07506289422|cmattenhl@yahoo.com|BH Website|Hatti|Matten|09/10/2017|F|09/10/2020|27/09/2021|All Days|Auroora|Matten|09/10/2018|F|09/10/2020|All Days|Enquiry Details|No|Mother|Yes|All|DAST25417TFC|MIOS62392TFC|50700000170|Child|12/10/2020|0930|
  |99160101NM2|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Mylo|Bradneck|Mylo Bradneck|99-2133 St. Marys Road|SO33 0LG|07615390391|mbradneckhm@addthis.com|BH Website|Claresta|Bradneck|09/10/2017|F|09/10/2020|27/09/2021|All Days|Samaria|Bradneck|09/10/2018|F|09/10/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000171|Child|12/10/2020|0930|
  |99160101NM3|Password01|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Rodrigo|Knowler|Rodrigo Knowler|99-2134 St. Marys Road|SO34 0LG|07088295980|rknowlerhn@pagesperso.com|BH Website|Millicent|Knowler|09/10/2017|F|09/10/2020|27/09/2021|All Days|Rubia|Knowler|09/10/2018|F|09/10/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000172|Child|12/10/2020|0930|

@Register2Children
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
  |UserName|Password|application|expectedtitle|ParentEmailID|Postcode|ParentFirstName|ParentSecondName|ParentName|EnquiryType|InvalidSearch|MobileNumber|contactfilename|contactwithenqfilename|CRMlogoutfilename|CRMEnquiryTitle|Enquiryfilename|CRMVisitTitle|Visitfilename|FullNameFileName|ParentEmailIDFileName|Postcodefilename|InvalidSearchFilename|contactviewfilename|
  |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|cmattenhl@yahoo.com|SO32 0LG|Merissa|Tythacott|Merissa Tythacott|RedFish|@#$|07506289422|contactMerissaTythacott|contactenqMerissaTythacott|contactlogoutMerissaTythacott|Enquiry: RedFish Enquiry|EnquiryMerissaTythacott|Appointment: Visit|VisitMerissaTythacott|FullNameMerissa Tythacott|ParentEmailIDcmattenhl@yahoo.com|PostcodefileSO32 0LG|InvalidsearchMerissa|contactviewMerissa|
  |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|mbradneckhm@addthis.com|SO33 0LG|Rosemarie|Blouet|Rosemarie Blouet|RedFish|14/10/2020|07615390391|contactRosemarieBlouet|contactenqRosemarieBlouet|contactlogoutRosemarieBlouet|Enquiry: RedFish Enquiry|EnquiryRosemarieBlouet|Appointment: Visit|VisitRosemarieBlouet|FullNameRosemarie Blouet|ParentEmailIDmbradneckhm@addthis.com|PostcodefileSO33 0LG|InvalidsearchRosemarie|contactviewRosemarie|
  |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|rknowlerhn@pagesperso.com|SO34 0LG|Raff|Langfield|Raff Langfield|RedFish|901Raff|07088295980|contactRaffLangfield|contactenqRaffLangfield|contactlogoutRaffLangfield|Enquiry: RedFish Enquiry|EnquiryRaffLangfield|Appointment: Visit|VisitRaffLangfield|FullNameRaff Langfield|ParentEmailIDrknowlerhn@pagesperso.com|PostcodefileSO34 0LG|InvalidsearchRaff|contactviewRaff|


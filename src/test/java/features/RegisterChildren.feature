Feature: 04.1 Register Children
#@SmokeRegressionTC1_4 @Register2ChildrenMultinursery
#Scenario Outline: Verify if user is able to register the one children
#Given Initialize the browser with chrome
#And Open Web Application "<application>" 
#When User enters User Name "<UserName>" and Password "<Password>"
#Then Verify if the web page title actual "<expectedtitle>"
#Then Verify search functionality with only Parent Name "<EmailId>" in search page
#Then Verify Enquiry search functionality with only Parent Name "<EmailId>" in search page
#When Clicked on register First child with sibling with "<Sibling>"
#When Selecting the Relationship status as "<Relationship>" and Parental Parental Responsibility as "<ParentalResponsibility>"	
#When Selecting the PhotoPreference as "<PhotoPreference>"
#When The TFC Reference "<TFCReference>" and LEAFEETReference "<LEAFEETReference>" and hrFundingCode "<hrFundingCode>"
#When The Enrolment Leave date is "<FirstEnrolmentEndDate>"
#Then Verify if the child is registered "<ChildProfileTitle>"
#Then Logout from redfish and close browser

#Examples:
#	|UserName|Password|application|expectedtitle|MainMenuItem|SubMenuItem|expectedenqtitle|ParentFirstName|ParentSecondName|ParentName|Address|Postcode|MobileNumber|EmailId|Source|FirstChildFirstName|SecondChildSecondName|DOB|FirstChildGender|FirstEnrolmentStartDate|FirstEnrolmentEndDate|BookingPatten|SecondChildFirstName|SecondChildSecondName|SecondChildDOB|SecondChildGender|SecondEnrolmentStartDate|SecondBookingPatten|EnquiryDetails|Sibling|Relationship|ParentalResponsibility|PhotoPreference|TFCReference|LEAFEETReference|hrFundingCode|ChildProfileTitle|VisitDate|VisitTime|
  #|99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Joya|St Clair|Joya St Clair|99-2138 St. Marys Road|SO38 0LG|07334330307|jstclairgu@eepurl.com|BH Website|Olav|St Clair|09/10/2017|M|09/10/2020|27/09/2021|All Days|Arnoldo|St Clair|09/10/2018|M|14/10/2020|All Days|Enquiry Details|No|Mother|Yes|All|DAST25417TFC|MIOS62392TFC|50700000179|Child|14/10/2020|0930|
#  |99160101NM2|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Der|Fawdrey|Der Fawdrey|99-2139 St. Marys Road|SO39 0LG|07958076043|dfawdreygv@networksolutions.com|BH Website|Beale|Fawdrey|09/10/2017|M|09/10/2020|27/09/2021|All Days|Adelle|Fawdrey|09/10/2018|F|14/10/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000180|Child|14/10/2020|0930|
# |99160101NM3|Password01|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Cass|Antoszczyk|Cass Antoszczyk|99-2140 St. Marys Road|SO40 0LG|07947431833|cantoszczykgw@tamu.com|BH Website|Tiena|Antoszczyk|09/10/2017|F|09/10/2020|27/09/2021|All Days|Rufus|Antoszczyk|09/10/2018|M|14/10/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000181|Child|14/10/2020|0930|


#@SmokeRegressionTC1_5 @Register2ChildrenMultinursery
#Scenario Outline: Verify if user is able to register the second children
#Given Initialize the browser with chrome
#And Open Web Application "<application>" 
#When User enters User Name "<UserName>" and Password "<Password>"
#Then Verify if the web page title actual "<expectedtitle>"
#Then Verify search functionality with only Parent Name "<EmailId>" in search page
#Then Verify Enquiry search functionality with only Parent Name "<EmailId>" in search page
#When Clicked on register Second child with sibling "<Sibling>"
#When Selecting the Relationship status as "<Relationship>" and Parental Parental Responsibility as "<ParentalResponsibility>"	
#When Selecting the PhotoPreference as "<PhotoPreference>"
#When The TFC Reference "<TFCReference>" and LEAFEETReference "<LEAFEETReference>" and hrFundingCode "<hrFundingCode>"
#When The Enrolment Leave date is "<FirstEnrolmentEndDate>"
#Then Verify if the child is registered "<ChildProfileTitle>" 
#Then Logout from redfish and close browser

#Examples:
#	|UserName|Password|application|expectedtitle|MainMenuItem|SubMenuItem|expectedenqtitle|ParentFirstName|ParentSecondName|ParentName|Address|Postcode|MobileNumber|EmailId|Source|FirstChildFirstName|SecondChildSecondName|DOB|FirstChildGender|FirstEnrolmentStartDate|FirstEnrolmentEndDate|BookingPatten|SecondChildFirstName|SecondChildSecondName|SecondChildDOB|SecondChildGender|SecondEnrolmentStartDate|SecondBookingPatten|EnquiryDetails|Sibling|Relationship|ParentalResponsibility|PhotoPreference|TFCReference|LEAFEETReference|hrFundingCode|ChildProfileTitle|VisitDate|VisitTime|
#  |99160101NM2|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Joya|St Clair|Joya St Clair|99-2138 St. Marys Road|SO38 0LG|07334330307|jstclairgu@eepurl.com|BH Website|Olav|St Clair|09/10/2017|M|09/10/2020|27/09/2021|All Days|Arnoldo|St Clair|09/10/2018|M|14/10/2020|All Days|Enquiry Details|No|Mother|Yes|All|DAST25417TFC|MIOS62392TFC|50700000179|Child|14/10/2020|0930|
#  |99160101NM3|Password01|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Der|Fawdrey|Der Fawdrey|99-2139 St. Marys Road|SO39 0LG|07958076043|dfawdreygv@networksolutions.com|BH Website|Beale|Fawdrey|09/10/2017|M|09/10/2020|27/09/2021|All Days|Adelle|Fawdrey|09/10/2018|F|14/10/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000180|Child|14/10/2020|0930|
#  |99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Cass|Antoszczyk|Cass Antoszczyk|99-2140 St. Marys Road|SO40 0LG|07947431833|cantoszczykgw@tamu.com|BH Website|Tiena|Antoszczyk|09/10/2017|F|09/10/2020|27/09/2021|All Days|Rufus|Antoszczyk|09/10/2018|M|14/10/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000181|Child|14/10/2020|0930|

@RedfishEnquirytwoChildRegister @Test 
Scenario Outline: Verify if user is able to create an enquiry with two children and register the two children
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
Then Verify if the Enquiry is created and Enquiry Details "<EnquiryDetails>" is displayed on the Parent Name Click on
When Clicked on register first child with sibling "<Sibling>"
When Selecting the Relationship status as "<Relationship>" and Parental Parental Responsibility as "<ParentalResponsibility>"	
When Selecting the PhotoPreference as "<PhotoPreference>"
When The TFC Reference "<TFCReference>" and LEAFEETReference "<LEAFEETReference>" and hrFundingCode "<hrFundingCode>"
When The Enrolment Leave date is "<FirstEnrolmentEndDate>"
Then Verify if the child is registered "<ChildProfileTitle>" 
Then Verify search functionality with only Parent Name "<ParentName>" in search page
Then Verify Enquiry search functionality with only Parent Name "<ParentName>" in search page
When Clicked on register Second child with sibling "<Sibling>"
When Selecting the Relationship status as "<Relationship>" and Parental Parental Responsibility as "<ParentalResponsibility>"	
When Selecting the PhotoPreference as "<PhotoPreference>"
When The TFC Reference "<TFCReference>" and LEAFEETReference "<LEAFEETReference>" and hrFundingCode "<hrFundingCode>"
When The Enrolment Leave date is "<FirstEnrolmentEndDate>"
Then Verify if the child is registered "<ChildProfileTitle>" 
Then Logout from redfish and close browser

Examples:
	|UserName|Password|application|expectedtitle|MainMenuItem|SubMenuItem|expectedenqtitle|ParentFirstName|ParentSecondName|ParentName|Address|Postcode|MobileNumber|EmailId|Source|FirstChildFirstName|SecondChildSecondName|DOB|FirstChildGender|FirstEnrolmentStartDate|FirstEnrolmentEndDate|BookingPatten|SecondChildFirstName|SecondChildSecondName|SecondChildDOB|SecondChildGender|SecondEnrolmentStartDate|SecondBookingPatten|EnquiryDetails|Sibling|Relationship|ParentalResponsibility|PhotoPreference|TFCReference|LEAFEETReference|hrFundingCode|ChildProfileTitle|VisitDate|VisitTime|
  |99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Percy|Pachta|Percy Pachta|99-2144 St. Marys Road|SO44 0LG|07905033762|ppachtag3@phoca.com|BH Website|Zacharia|Pachta|13/10/2017|M|13/10/2020|27/09/2021|All Days|Chucho|Pachta|13/10/2018|M|14/10/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000188|Child|16/10/2020|0930|
  |99160101NM2|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Haskel|Ebben|Haskel Ebben|99-2145 St. Marys Road|SO46 0LG|07595477225|hebbeng4@cloudflare.com|BH Website|Eldon|Ebben|13/10/2017|M|13/10/2020|27/09/2021|All Days|Perl|Ebben|13/10/2018|F|14/10/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000189|Child|16/10/2020|0930|
  |99160101NM3|Password01|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Arturo|Ligoe|Arturo Ligoe|99-2146 St. Marys Road|SO45 0LG|07841085211|aligoeg5@goo.com|BH Website|Melinde|Ligoe|13/10/2017|F|13/10/2020|27/09/2021|All Days|Caz|Ligoe|13/10/2018|M|14/10/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000190|Child|16/10/2020|0930|


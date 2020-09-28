Feature: 03.1 Enquiry Management Create an Enquiry through Redfish interface
@RedfishEnquirySingleChildRegister 
Scenario Outline: Verify if user is able to create an enquiry and register the child
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
Then Click on Add Enquiry
Then Verify if the Enquiry is created and Enquiry Details "<EnquiryDetails>" is displayed on the Parent Name Click on
When Clicked on register first child with sibling "<Sibling>"
When Selecting the Relationship status as "<Relationship>" and Parental Parental Responsibility as "<ParentalResponsibility>"	
When Selecting the PhotoPreference as "<PhotoPreference>"
When The TFC Reference "<TFCReference>" and LEAFEETReference "<LEAFEETReference>" and hrFundingCode "<hrFundingCode>"
Then Verify if the child is registered "<ChildProfileTitle>" 
Then Logout from redfish and close browser

Examples:
	  |UserName   |Password  |application |expectedtitle |MainMenuItem |SubMenuItem |expectedenqtitle |ParentFirstName |ParentSecondName |Address 			   |Postcode |MobileNumber |EmailId 			        |Source                    |FirstChildFirstName |SecondChildSecondName |DOB        |FirstChildGender |FirstEnrolmentStartDate |BookingPatten |SecondChildFirstName |SecondChildSecondName |SecondChildDOB |SecondChildGender |SecondEnrolmentStartDate |SecondBookingPatten |EnquiryDetails  |Sibling |Relationship |ParentalResponsibility |PhotoPreference |TFCReference |LEAFEETReference |hrFundingCode |ChildProfileTitle |							  
    |99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Bastian         |Meace            |99-2062 St. Marys Road |SO51 0LG |07864440377  |bmeacenv@google.com         |BH Website                |Sibley              |Meace                 |01/02/2017 |M                |07/09/2020              |All Days      |                     |                      |               |                  |                         |                    |Enquiry Details |No      |Mother       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000044   |Child             |
    |99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Stanton         |Birmingham       |99-2063 St. Marys Road |SO52 0LG |07041596398  |sbirminghamo7@infoseek.com  |BH Website                |Steffen             |Birmingham            |01/09/2016 |M                |04/09/2020              |All Days      |                     |                      |               |                  |                         |                    |Enquiry Details |No      |Father       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000045   |Child             |
	  |99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Sunny           |Pringuer         |99-2064 St. Marys Road |SO53 0LG |07565695332  |springuero6@gizmodo.com     |BH Website                |Quintin             |Pringuer              |07/09/2016 |M                |04/09/2020              |All Days      |                     |                      |               |                  |                         |                    |Enquiry Details |No      |Father       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000043   |Child             |

@RedfishEnquirytwoChildRegister @SmokeTest 
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
	|UserName|Password|application|expectedtitle|MainMenuItem|SubMenuItem|expectedenqtitle|ParentFirstName|ParentSecondName|ParentName|Address|Postcode|MobileNumber|EmailId|Source|FirstChildFirstName|SecondChildSecondName|DOB|FirstChildGender|FirstEnrolmentStartDate|FirstEnrolmentEndDate|BookingPatten|SecondChildFirstName|SecondChildSecondName|SecondChildDOB|SecondChildGender|SecondEnrolmentStartDate|SecondBookingPatten|EnquiryDetails|Sibling|Relationship|ParentalResponsibility|PhotoPreference|TFCReference|LEAFEETReference|hrFundingCode|ChildProfileTitle|
  |99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Horatius|Quinton|Horatius Quinton|99-2094 St. Marys Road|SO84 0LG|07537695686|hquintonlg@parallels.com|BH Website|Terrance|Quinton|18/10/2017|M|18/09/2020|07/09/2021|All Days|Jenna|Quinton|18/09/2018|F|18/09/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000131|Child|
  #|99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Lars|Bangley|Lars Bangley|99-2095 St. Marys Road|SO85 0LG|07999426974|lbangleylh@businesswire.com|BH Website|Marven|Bangley|18/10/2017|M|18/09/2020|07/09/2021|All Days|Valle|Bangley|18/09/2018|M|18/09/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000132|Child|
  #|99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Sue|Elcoate|Sue Elcoate|99-2096 St. Marys Road|SO86 0LG|07162057452|selcoateli@woothemes.com|BH Website|Clarinda|Elcoate|18/10/2017|F|18/09/2020|07/09/2021|All Days|Stoddard|Elcoate|18/09/2018|F|18/09/2020|All Days|Enquiry Details|No|Mother|Yes|All|DAST25417TFC|MIOS62392TFC|50700000133|Child|

@RedfishCRMEnquiryManagement @SmokeTest 
Scenario Outline: Verify if enquiry created in redfish is added in CRM
Given Initialize the browser with chrome
And Open Web Application "<application>" 
When User enters RedfishCRM User Name "<UserName>" and Password "<Password>"
Then Verify if the RedfishCRM web page title actual "<expectedtitle>"
Then Verify if user able to search with parent email id "<ParentEmailID>" "<contactfilename>"
Then Verify if Enquiry is created by taking the screen shot of the enquiry table "<contactwithenqfilename>"
Then Verify if the CRMcontact screen has the expected first name "<ParentFirstName>"
Then Verify if user able to open the enquiry and verify the title as "<CRMEnquiryTitle>" screenshot in "<Enquiryfilename>"
Then Logout from redfishCRM and close browser "<CRMlogoutfilename>"

Examples:
	|UserName|Password|application|expectedtitle|ParentEmailID|ParentFirstName|ParentSecondName|EnquiryType|MobileNumber|contactfilename|contactwithenqfilename|CRMlogoutfilename|CRMEnquiryTitle|Enquiryfilename|
  |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|hquintonlg@parallels.com|Horatius|Quinton|RedFish|07537695686|contactHoratiusQuinton|contactenqHoratiusQuinton|contactlogoutHoratiusQuinton|Enquiry: RedFish Enquiry|EnquiryHoratiusQuinton|
  #|99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|lbangleylh@businesswire.com|Lars|Bangley|RedFish|07999426974|contactLarsBangley|contactenqLarsBangley|contactlogoutLarsBangley|Enquiry: RedFish Enquiry|EnquiryLarsBangley|
  #|99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|selcoateli@woothemes.com|Sue|Elcoate|RedFish|07162057452|contactSueElcoate|contactenqSueElcoate|contactlogoutSueElcoate|Enquiry: RedFish Enquiry|EnquirySueElcoate|
  #|99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|scbgounell9@yelp.com|Beryle|Gounel|Web|07989155859|contactBeryleGounel|contactenqBeryleGounel|contactlogoutBeryleGounel|Web Enquiry|EnquiryBeryleGounel|
  #|99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|scgmccrannl7@1688.com|Ginevra|McCrann|Web|07164198897|contactGinevraMcCrann|contactenqGinevraMcCrann|contactlogoutGinevraMcCrann|Enquiry: Web Enquiry|EnquiryGinevraMcCrann|
  #|99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|scmclutterhaml6@dyndns.com|Martyn|Clutterham|Web|07552586392|contactMartynClutterham|contactenqMartynClutterham|contactlogoutMartynClutterham|Enquiry: Web Enquiry|EnquiryMartynClutterham|


@RedfishCRMContactSearch  
Scenario Outline: Verify if user is able to see the contact in CRM
Given Initialize the browser with chrome
And Open Web Application "<application>" 
When User enters RedfishCRM User Name "<UserName>" and Password "<Password>"
Then Verify if the RedfishCRM web page title actual "<expectedtitle>"
Then Verify if user able to search with parent email id "<ParentEmailID>" "<contactfilename>"
Then Verify if Enquiry is created by taking the screen shot of the enquiry table "<contactwithenqfilename>"
Then Verify if user able to open the enquiry and verify the title as "<CRMEnquiryTitle>" screenshot in "<Enquiryfilename>"
Then Logout from redfishCRM and close browser "<CRMlogoutfilename>"

Examples:
	|UserName|Password|application|expectedtitle|ParentEmailID|ParentFirstName|ParentSecondName|EnquiryType|MobileNumber|contactfilename|contactwithenqfilename|CRMlogoutfilename|CRMEnquiryTitle|Enquiryfilename|
  #|99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|hquintonlg@parallels.com|Horatius|Quinton|RedFish|07537695686|contactHoratiusQuinton|contactenqHoratiusQuinton|contactlogoutHoratiusQuinton|Enquiry: RedFish Enquiry|EnquiryHoratiusQuinton|
  #|99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|lbangleylh@businesswire.com|Lars|Bangley|RedFish|07999426974|contactLarsBangley|contactenqLarsBangley|contactlogoutLarsBangley|Enquiry: RedFish Enquiry|EnquiryLarsBangley|
  #|99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|selcoateli@woothemes.com|Sue|Elcoate|RedFish|07162057452|contactSueElcoate|contactenqSueElcoate|contactlogoutSueElcoate|Enquiry: RedFish Enquiry|EnquirySueElcoate|
  |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|scbgounell9@yelp.com|Beryle|Gounel|Web|07989155859|contactBeryleGounel|contactenqBeryleGounel|contactlogoutBeryleGounel|Web Enquiry|EnquiryBeryleGounel|
  #|99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|scgmccrannl7@1688.com|Ginevra|McCrann|Web|07164198897|contactGinevraMcCrann|contactenqGinevraMcCrann|contactlogoutGinevraMcCrann|Enquiry: Web Enquiry|EnquiryGinevraMcCrann|
  #|99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|scmclutterhaml6@dyndns.com|Martyn|Clutterham|Web|07552586392|contactMartynClutterham|contactenqMartynClutterham|contactlogoutMartynClutterham|Enquiry: Web Enquiry|EnquiryMartynClutterham|


@RedfishSingleChildEnquiry  
Scenario Outline: Verify if user is able to create an enquiry for a single child
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
Then Click on Add Enquiry
Then Logout from redfish and close browser

Examples:
	|UserName   |Password  |application |expectedtitle |MainMenuItem |SubMenuItem |expectedenqtitle |ParentFirstName |ParentSecondName |Address 			   |Postcode |MobileNumber |EmailId 			          |Source     |FirstChildFirstName |SecondChildSecondName |DOB        |FirstChildGender |FirstEnrolmentStartDate |BookingPatten |EnquiryDetails  |Sibling |Relationship |ParentalResponsibility |PhotoPreference |TFCReference |LEAFEETReference |hrFundingCode |ChildProfileTitle |							  
	|99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Harrie 	     |Seefus           |99-2052 St. Marys Road |SO42 0LG |07351682848  |cseefusqm@techcrunch.com      |BH Website |Billie              |Seefus                |10/03/2019 |F                |03/08/2020              |All Days      |Enquiry Details |No      |Mother       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000042   |Child             |
	|99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Cordy  	     |Mannagh          |99-2053 St. Marys Road |SO43 0LG |07905841357  |hmannaghqn@huffingtonpost.com |BH Website |Findley             |Mannagh               |09/04/2019 |M                |04/08/2020              |All Days      |Enquiry Details |No      |Mother       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000043   |Child             |
	


@RedfishSingleChildEnquiryVisit 
Scenario Outline: Verify if user is able to create an enquiry for a single child
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
When Verify if user can add a visit with visit date "<VisitDate>" and visit time "<VisitTime>" with main comment "<ParentSecondName>"
Then Logout from redfish and close browser

Examples:
	|UserName|Password|application|expectedtitle|MainMenuItem|SubMenuItem|expectedenqtitle|ParentFirstName|ParentSecondName|ParentName|Address|Postcode|MobileNumber|EmailId|Source|FirstChildFirstName|SecondChildSecondName|DOB|FirstChildGender|FirstEnrolmentStartDate|FirstEnrolmentEndDate|BookingPatten|SecondChildFirstName|SecondChildSecondName|SecondChildDOB|SecondChildGender|SecondEnrolmentStartDate|SecondBookingPatten|EnquiryDetails|Sibling|Relationship|ParentalResponsibility|PhotoPreference|TFCReference|LEAFEETReference|hrFundingCode|ChildProfileTitle|VisitDate|VisitTime|
  |99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Loretta|Mannock|Loretta Mannock|99-2097 St. Marys Road|SO87 0LG|07434024146|lmannockky@indiegogo.com|BH Website|Buiron|Mannock|18/10/2017|M|24/09/2020|07/09/2021|All Days|Tory|Mannock|18/09/2018|F|18/09/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000134|Child|24/09/2020|0930|
  |99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Brigg|Youle|Brigg Youle|99-2098 St. Marys Road|SO88 0LG|07599586704|byoulekz@google.com|BH Website|Weidar|Youle|18/10/2017|M|24/09/2020|07/09/2021|All Days|Glenn|Youle|18/09/2018|F|18/09/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000135|Child|24/09/2020|0930|
  |99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Inglis|MacComiskey|Inglis MacComiskey|99-2099 St. Marys Road|SO89 0LG|07122549608|imaccomiskeyl0@java.com|BH Website|Warner|MacComiskey|18/10/2017|M|24/09/2020|07/09/2021|All Days|Shelia|MacComiskey|18/09/2018|F|18/09/2020|All Days|Enquiry Details|No|Mother|Yes|All|DAST25417TFC|MIOS62392TFC|50700000136|Child|24/09/2020|0930|

@RedfishEnquiryManagement 
Scenario Outline: Verify if user is able to Management Enquiry by closing and adding to waithing list

Given Initialize the browser with chrome
And Open Web Application "<application>" 
When User enters User Name "<UserName>" and Password "<Password>"
Then Verify if the web page title actual "<expectedtitle>"
Then Verify search functionality with only Parent Name "<EnquiryParentName>" in search page
Then Verify Enquiry search functionality with only Parent Name "<EnquiryParentName>" in search page
Then Verify Enquiry can be closed with reason code "<ClosedReason>" Enquiry Management 
Then Verify search functionality with only Parent Name "<EnquiryParentName>" in search page
Then Verify closed Enquiry search functionality with only Parent Name "<EnquiryParentName>" in search page
Then Verify Enquiry can be repoened in Enquiry Management 
Then Verify Enquiry General note can be updated as "<Generalnotes>" in Enquiry 
Then Verify Enquiry can be moved to waiting list in Enquiry Management 
Then Verify Enquiry can be removed from waiting list in Enquiry Management 
Then Logout from redfish and close browser

Examples:
|UserName   |Password  |application |expectedtitle |MainMenuItem |SubMenuItem |expectedenqtitle |ParentFirstName |ParentSecondName |EnquiryParentName |WaitingText |ClosedReason  |Generalnotes      |Source     |FirstChildFirstName |SecondChildSecondName |DOB        |FirstChildGender |FirstEnrolmentStartDate |BookingPatten |EnquiryDetails  |Sibling |Relationship |ParentalResponsibility |PhotoPreference |TFCReference |LEAFEETReference |hrFundingCode |ChildProfileTitle |							  
|99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Samantha 	     |Belfrage         |Samantha Belfrage |Waiting     |Too expensive |Samantha Belfrage |BH Website |Matelda             |Belfrage              |10/05/2019 |F                |03/08/2020              |All Days      |Enquiry Details |No      |Mother       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000034   |Child             |
|99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Elonore 	     |Cantua           |Elonore Cantua    |Waiting     |Too expensive |Elonore Cantua    |BH Website |Dru                 |Cantua                |09/06/2019 |F                |04/08/2020              |All Days      |Enquiry Details |No      |Father       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000035   |Child             |

@RedfishSearchhomepage  
Scenario Outline: Verify if user is able to use search function in redfish homepage
Given Initialize the browser with chrome
And Open Web Application "<application>" 
When User enters User Name "<UserName>" and Password "<Password>"
Then Verify if the web page title actual "<expectedtitle>"
Then Verify search functionality with Child Name "<ChildName>" and Parent Name "<ParentName>"
Then Verify Enquiry search functionality with only Parent Name "<EnquiryParentName>" in search page
Then Verify closed Enquiry search functionality with only Parent Name "<EnquiryParentName>" in search page
Then Verify if user can reopen a closed enquiry
Then Logout from redfish and close browser

Examples:
	|UserName   |Password  |application |expectedtitle |ChildName      |ParentName       |expectedenqtitle |ParentFirstName |ParentSecondName |Address 				  |Postcode |MobileNumber |EmailId 			   |Source     |FirstChildFirstName |SecondChildSecondName |DOB        |FirstChildGender |FirstEnrolmentStartDate |BookingPatten |EnquiryDetails  |Sibling |Relationship |ParentalResponsibility |PhotoPreference |TFCReference |LEAFEETReference |hrFundingCode |ChildProfileTitle |							  
	|99160101NM |Password1 |redfishUAT  |Home 		   |Javier Glawsop |Carolyne Glawsop |New enquiry      |Denni 	        |Tunney           |99-2042 St. Marys Road |SO19 0LG |07316826342  |dtunneyb4@mysql.com |BH Website |Delinda             |Tunney                |10/08/2019 |F                |04/08/2020              |All Days      |Enquiry Details |No      |Mother       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000028   |Child             |

@RedfishSearchpage 
Scenario Outline: Verify if user is able to use search function in redfish search page
Given Initialize the browser with chrome
And Open Web Application "<application>" 
When User enters User Name "<UserName>" and Password "<Password>"
Then Verify if the web page title actual "<expectedtitle>"
Then Verify search functionality with Child Name "<ChildName>" and Parent Name "<ParentName>"
Then Verify search functionality with Invalid Child Name "<InvalidChildName>" and Invalid Parent Name "<InvalidParentName>"
Then Verify search functionality with only Parent Name "<ParentName>" in search page
Then Verify search functionality with only Child Name "<ChildName>" in search page
Then Verify Enquiry search functionality with only Parent Name "<EnquiryParentName>" in search page
Then Verify Enquiry search functionality with only Child Name "<EnquiryChildName>" in search page
Then Verify Enquiry search functionality with only Nursery Name "<Nursery>" in search page
Then Logout from redfish and close browser

Examples:
	|UserName   |Password  |application |expectedtitle |ChildName      |ParentName       |InvalidChildName |InvalidParentName |EnquiryParentName |EnquiryChildName |Nursery   |					  
	|99160101NM |Password1 |redfishUAT  |Home 		   |Javier Glawsop |Carolyne Glawsop |@#$              |@#$ 	          |Samantha Belfrage |Matelda Belfrage |Abbeymore | 

@RedfishtwoChildEnquiry  
Scenario Outline: Verify if user is able to create an enquiry for a two children with a nursery visit
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
When Verify if user can add a visit with visit date "<VisitDate>" and visit time "<VisitTime>" with main comment "<ParentSecondName>"
Then Logout from redfish and close browser

Examples:
	|UserName|Password|application|expectedtitle|MainMenuItem|SubMenuItem|expectedenqtitle|ParentFirstName|ParentSecondName|ParentName|Address|Postcode|MobileNumber|EmailId|Source|FirstChildFirstName|SecondChildSecondName|DOB|FirstChildGender|FirstEnrolmentStartDate|FirstEnrolmentEndDate|BookingPatten|SecondChildFirstName|SecondChildSecondName|SecondChildDOB|SecondChildGender|SecondEnrolmentStartDate|SecondBookingPatten|EnquiryDetails|Sibling|Relationship|ParentalResponsibility|PhotoPreference|TFCReference|LEAFEETReference|hrFundingCode|ChildProfileTitle|VisitDate|VisitTime|
  |99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Cassie|Willshaw|Cassie Willshaw|99-2100 St. Marys Road|SO90 0LG|07377701886|cwillshawkp@free.com|BH Website|Demott|Willshaw|18/10/2017|M|24/09/2020|07/09/2021|All Days|Brady|Willshaw|18/09/2018|M|24/09/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000137|Child|25/09/2020|0930|
  |99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Marysa|McGrale|Marysa McGrale|99-2101 St. Marys Road|SO91 0LG|07030804660|mmcgralekq@indiatimes.com|BH Website|Farah|McGrale|18/10/2017|F|24/09/2020|07/09/2021|All Days|Elisha|McGrale|18/09/2018|F|24/09/2020|All Days|Enquiry Details|No|Mother|Yes|All|DAST25417TFC|MIOS62392TFC|50700000138|Child|25/09/2020|0930|
  |99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Mariann|Bertelsen|Mariann Bertelsen|99-2102 St. Marys Road|SO92 0LG|07802281837|mbertelsenkr@google.com|BH Website|Gus|Bertelsen|18/10/2017|F|24/09/2020|07/09/2021|All Days|Lenore|Bertelsen|18/09/2018|F|24/09/2020|All Days|Enquiry Details|No|Mother|Yes|All|DAST25417TFC|MIOS62392TFC|50700000139|Child|25/09/2020|0930|

@RedfishCRMEnquiryVisit
Scenario Outline: Verify if user is able to see the enquiry and visit in CRM
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
  |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|cwillshawkp@free.com|Cassie|Willshaw|RedFish|07377701886|contactCassieWillshaw|contactenqCassieWillshaw|contactlogoutCassieWillshaw|Enquiry: RedFish Enquiry|EnquiryCassieWillshaw|Appointment: Visit|VisitCassieWillshaw|
 #|99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|mmcgralekq@indiatimes.com|Marysa|McGrale|RedFish|07030804660|contactMarysaMcGrale|contactenqMarysaMcGrale|contactlogoutMarysaMcGrale|Enquiry: RedFish Enquiry|EnquiryMarysaMcGrale|Appointment: Visit|VisitMarysaMcGrale|
 #|99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|mbertelsenkr@google.com|Mariann|Bertelsen|RedFish|07802281837|contactMariannBertelsen|contactenqMariannBertelsen|contactlogoutMariannBertelsen|Enquiry: RedFish Enquiry|EnquiryMariannBertelsen|Appointment: Visit|VisitMariannBertelsen|
 #|99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|scbgounell9@yelp.com|Beryle|Gounel|Web|07989155859|contactBeryleGounel|contactenqBeryleGounel|contactlogoutBeryleGounel|Enquiry: Web Enquiry|EnquiryBeryleGounel|Appointment: Visit|VisitBeryleGounel|
 #|99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|scgmccrannl7@1688.com|Ginevra|McCrann|Web|07164198897|contactGinevraMcCrann|contactenqGinevraMcCrann|contactlogoutGinevraMcCrann|Enquiry: Web Enquiry|EnquiryGinevraMcCrann|Appointment: Visit|VisitGinevraMcCrann|
 #|99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|scmclutterhaml6@dyndns.com|Martyn|Clutterham|Web|07552586392|contactMartynClutterham|contactenqMartynClutterham|contactlogoutMartynClutterham|Enquiry: Web Enquiry|EnquiryMartynClutterham|Appointment: Visit|VisitMartynClutterham|

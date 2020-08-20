Feature: Validate Redfish Workflows Page
@RedfishEnquirySingleChildRegister @Regression 
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
    |99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Madella         |Bricknell        |99-2057 St. Marys Road |SO46 0LG |07154264962  |mbricknellq7@indiatimes.com |Company Referral (Client) |Trumaine            |Bricknell             |07/01/2019 |M                |04/08/2020              |All Days      |                     |                      |               |                  |                         |                    |Enquiry Details |No      |Mother       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000044   |Child             |
    |99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Dodi 	         |Carabine         |99-2058 St. Marys Road |SO47 0LG |07964491646  |dcarabineq6@tmall.com       |BH Website                |Ingmar              |Lett                  |03/02/2019 |M                |04/09/2020              |All Days      |                     |                      |               |                  |                         |                    |Enquiry Details |No      |Father       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000045   |Child             |
	|99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Krispin         |Lett             |99-2056 St. Marys Road |SO45 0LG |07413262177  |klettq8@pen.com             |BH Website                |Ced                 |Carabine              |03/12/2018 |M                |04/08/2020              |All Days      |                     |                      |               |                  |                         |                    |Enquiry Details |No      |Father       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000043   |Child             |

@RedfishEnquirytwoChildRegister @Regression 
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
Then Verify if the child is registered "<ChildProfileTitle>" 
Then Verify search functionality with only Parent Name "<ParentName>" in search page
Then Verify Enquiry search functionality with only Parent Name "<ParentName>" in search page
When Clicked on register Second child with sibling "<Sibling>"
When Selecting the Relationship status as "<Relationship>" and Parental Parental Responsibility as "<ParentalResponsibility>"	
When Selecting the PhotoPreference as "<PhotoPreference>"
When The TFC Reference "<TFCReference>" and LEAFEETReference "<LEAFEETReference>" and hrFundingCode "<hrFundingCode>"
Then Verify if the child is registered "<ChildProfileTitle>" 
Then Logout from redfish and close browser

Examples:
	|UserName   |Password  |application |expectedtitle |MainMenuItem |SubMenuItem |expectedenqtitle |ParentFirstName |ParentSecondName |ParentName       |Address 			     |Postcode |MobileNumber |EmailId 			               |Source     |FirstChildFirstName |SecondChildSecondName |DOB        |FirstChildGender |FirstEnrolmentStartDate |BookingPatten |SecondChildFirstName |SecondChildSecondName |SecondChildDOB |SecondChildGender |SecondEnrolmentStartDate |SecondBookingPatten |EnquiryDetails  |Sibling |Relationship |ParentalResponsibility |PhotoPreference |TFCReference |LEAFEETReference |hrFundingCode |ChildProfileTitle |							  
    |99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Loy             |Ring             |Loy Ring         |99-2063 St. Marys Road |SO53 0LG |07617625476  |lringpd@woothemes.com            |BH Website |Georgeanne          |Ring                  |21/08/2018 |F                |07/08/2020              |All Days      |Ermin                |Ring                  |21/08/2017     |M                 |07/08/2020               |All Days            |Enquiry Details |No      |Father       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000051   |Child             |
    |99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Dru             |Antoniewicz      |Dru Antoniewicz  |99-2064 St. Marys Road |SO54 0LG |07262553311  |dantoniewiczpc@odnoklassniki.com |BH Website |Sabina              |Antoniewicz           |17/02/2019 |F                |07/09/2020              |All Days      |Farrell              |Antoniewicz           |17/08/2018     |M                 |07/08/2020               |All Days            |Enquiry Details |No      |Mother       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000052   |Child             |
	|99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Calypso         |Hughson          |Calypso Hughson  |99-2065 St. Marys Road |SO55 0LG |07012146441  |chughsonpb@fastcompany.com       |BH Website |Galvin              |Hughson               |18/12/2018 |M                |07/08/2020              |All Days      |Fania                |Hughson               |18/08/2017     |F                 |07/08/2020               |All Days            |Enquiry Details |No      |Mother       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000053   |Child             |


@RedfishSingleChildEnquiry  @Regression
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
	


@RedfishSingleChildEnquiryVisit  @Regression
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
	|UserName   |Password  |application |expectedtitle |MainMenuItem |SubMenuItem |expectedenqtitle |ParentFirstName |ParentSecondName |Address 			   |Postcode |MobileNumber |EmailId      	           |Source     |FirstChildFirstName |SecondChildSecondName |DOB        |FirstChildGender |FirstEnrolmentStartDate |BookingPatten |EnquiryDetails  |Sibling |Relationship |ParentalResponsibility |PhotoPreference |TFCReference |LEAFEETReference |hrFundingCode |ChildProfileTitle |VisitDate  |VisitTime |							  
	|99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Tove            |McLenaghan       |99-2068 St. Marys Road |SO44 0LG |07164236026  |smcculloghqi@bloglovin.com |BH Website |Leonardo            |McLenaghan            |12/05/2019 |M                |03/08/2020              |All Days      |Enquiry Details |No      |Mother       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000044   |Child             |08/08/2020 |0930      |
	|99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Svend      	 |McCullogh  	   |99-2069 St. Marys Road |SO45 0LG |07794674721  |korredqh@blogspot.com      |BH Website |Kimbra              |McCullogh             |15/06/2019 |F                |04/08/2020              |All Days      |Enquiry Details |No      |Father       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000045   |Child             |10/08/2020 |0930      |


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

@RedfishtwoChildEnquiry  @Regression
Scenario Outline: Verify if user is able to create an enquiry for a two children
Given Initialize the browser with chrome
And Open Web Application "<application>" 
When User enters User Name "<UserName>" and Password "<Password>"
Then Verify if the web page title actual "<expectedtitle>"
And In home page verify if Enquiries and Enquiry in the main menu 
When Clicked on menu item "<MainMenuItem>" and submenu "<SubMenuItem>"
Then Verify if the web page submenu title is "<expectedenqtitle>"
When Parent First Name "<ParentFirstName>" Parent Second Name "<ParentSecondName>" Address "<Address>" Postcode "<Postcode>" MobileNumber "<MobileNumber>" Email id "<EmailId>"
When The source is selected as "<Source>"
When The First Child First Name "<FirstChildFirstName>" First Child Second Name "<FirstChildSecondName>" First Child DOB "<DOB>" Gender "<FirstChildGender>" Enrolment Start Date "<FirstEnrolmentStartDate>"   
When First child Booking Patten is "<BookingPatten>"
When The Second Child First Name "<SecondChildFirstName>" Second Child Second Name "<SecondChildSecondName>" First Child DOB "<SecondChildDOB>" Gender "<SecondChildGender>" Enrolment Start Date "<SecondEnrolmentStartDate>"
When Second Child Booking Patten is "<SecondBookingPatten>" 
Then Click on Add Enquiry
Then Logout from redfish and close browser

Examples:
	|UserName   |Password  |application |expectedtitle |MainMenuItem |SubMenuItem |expectedenqtitle |ParentFirstName |ParentSecondName |Address 			   |Postcode |MobileNumber |EmailId 			        |Source     |FirstChildFirstName |SecondChildSecondName |DOB        |FirstChildGender |FirstEnrolmentStartDate |BookingPatten |SecondChildFirstName |SecondChildSecondName |SecondChildDOB |SecondChildGender |SecondEnrolmentStartDate |SecondBookingPatten |EnquiryDetails  |Sibling |Relationship |ParentalResponsibility |PhotoPreference |TFCReference |LEAFEETReference |hrFundingCode |ChildProfileTitle |							  
    |99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Quint           |Halling          |99-2059 St. Marys Road |SO48 0LG |07587350665  |qhallingps@indiatimes.com   |BH Website |Fredra              |Halling               |07/01/2019 |F                |04/08/2020              |All Days      |Connie               |Halling               |04/08/2018     |F                 |04/08/2020               |All Days            |Enquiry Details |No      |Father       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000047   |Child             |
    |99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Kendra          |Grosvener        |99-2060 St. Marys Road |SO49 0LG |07418037412  |kgrosvenerpr@altervista.com |BH Website |Camala              |Grosvener             |03/02/2019 |F                |04/09/2020              |All Days      |Anson                |Grosvener             |03/02/2018     |F                 |04/08/2020               |All Days            |Enquiry Details |No      |Mother       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000048   |Child             |
	|99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Eudora          |Pulsford         |99-2061 St. Marys Road |SO50 0LG |07140006403  |epulsfordpq@yolasite.com    |BH Website |Conny               |Pulsford              |03/12/2018 |M                |04/08/2020              |All Days      |Aube                 |Pulsford              |03/12/2017     |M                 |04/08/2020               |All Days            |Enquiry Details |No      |Mother       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000049   |Child             |

	
	
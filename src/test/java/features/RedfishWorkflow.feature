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
When Booking Patten is "<BookingPatten>" and Click on Add Enquiry
Then Verify if the Enquiry is created and Enquiry Details "<EnquiryDetails>" is displayed on the Parent Name Click on
When Clicked on register first child with sibling "<Sibling>"
When Selecting the Relationship status as "<Relationship>" and Parental Parental Responsibility as "<ParentalResponsibility>"	
When Selecting the PhotoPreference as "<PhotoPreference>"
When The TFC Reference "<TFCReference>" and LEAFEETReference "<LEAFEETReference>" and hrFundingCode "<hrFundingCode>"
Then Verify if the child is registered "<ChildProfileTitle>" 
Then Logout from redfish and close browser

Examples:
	|UserName                    |Password  |application |expectedtitle |MainMenuItem |SubMenuItem |expectedenqtitle |ParentFirstName |ParentSecondName |Address 				|Postcode |MobileNumber |EmailId 			   |Source     |FirstChildFirstName |SecondChildSecondName |DOB        |FirstChildGender |FirstEnrolmentStartDate |BookingPatten |EnquiryDetails  |Sibling |Relationship |ParentalResponsibility |PhotoPreference |TFCReference |LEAFEETReference |hrFundingCode |ChildProfileTitle |							  
	|99160101NM                  |Password1 |redfishUrl  |Home 			|Enquiries    |Enquiry     |New enquiry      |Carolyne 	      |Glawsop          |99-2046 St. Marys Road |SO21 0LG |07296972527  |bboyesb9@engadget.com |BH Website |Javier              |Glawsop               |03/08/2019 |M                |04/08/2020              |All Days      |Enquiry Details |No      |Mother       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000030   |Child             |
	|99160101NM                  |Password1 |redfishUrl  |Home 			|Enquiries    |Enquiry     |New enquiry      |Beltran 	      |Boyes            |99-2047 St. Marys Road |SO22 0LG |07516571597  |jmcneelyba@google.com |BH Website |Heidie              |Boyes                 |07/08/2019 |F                |04/08/2020              |All Days      |Enquiry Details |No      |Father       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000031   |Child             |

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
When Booking Patten is "<BookingPatten>" and Click on Add Enquiry
Then Logout from redfish and close browser

Examples:
	|UserName   |Password  |application |expectedtitle |MainMenuItem |SubMenuItem |expectedenqtitle |ParentFirstName |ParentSecondName |Address 			   |Postcode |MobileNumber |EmailId 			      |Source     |FirstChildFirstName |SecondChildSecondName |DOB        |FirstChildGender |FirstEnrolmentStartDate |BookingPatten |EnquiryDetails  |Sibling |Relationship |ParentalResponsibility |PhotoPreference |TFCReference |LEAFEETReference |hrFundingCode |ChildProfileTitle |							  
	|99160101NM |Password1 |redfishUrl  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Samantha 	     |Belfrage         |99-2050 St. Marys Road |SO25 0LG |07864416259  |sbelfragerq@indiegogo.com |BH Website |Matelda             |Belfrage              |10/05/2019 |F                |03/08/2020              |All Days      |Enquiry Details |No      |Mother       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000034   |Child             |
	|99160101NM |Password1 |redfishUrl  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Elonore 	     |Cantua           |99-2051 St. Marys Road |SO26 0LG |07864416259  |pcantuarr@upenn.com       |BH Website |Dru                 |Cantua                |09/06/2019 |F                |04/08/2020              |All Days      |Enquiry Details |No      |Father       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000035   |Child             |


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
	|UserName   |Password  |application |expectedtitle |MainMenuItem |SubMenuItem |expectedenqtitle |ParentFirstName |ParentSecondName |Address 			   |Postcode |MobileNumber |EmailId      	        |Source     |FirstChildFirstName |SecondChildSecondName |DOB        |FirstChildGender |FirstEnrolmentStartDate |BookingPatten |EnquiryDetails  |Sibling |Relationship |ParentalResponsibility |PhotoPreference |TFCReference |LEAFEETReference |hrFundingCode |ChildProfileTitle |VisitDate  |VisitTime |							  
	|99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Churchman       |Brigham          |99-2066 St. Marys Road |SO41 0LG |07211202066  |aratequ@ucoz.com        |BH Website |Giustino            |Brigham               |12/01/2019 |M                |03/08/2020              |All Days      |Enquiry Details |No      |Mother       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000034   |Child             |08/08/2020 |0930      |
	|99160101NM |Password1 |redfishUAT  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Ruste      	 |Rate  	       |99-2067 St. Marys Road |SO42 0LG |07905093429  |gbrighamqv@thetimes.com |BH Website |Auguste             |Rate                  |15/02/2019 |F                |04/08/2020              |All Days      |Enquiry Details |No      |Father       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000035   |Child             |10/08/2020 |0930      |


@RedfishEnquiryManagement @Regression
Scenario Outline: Verify if user is able to Management Enquiry by closing, adding to waithing list and adding Visits
Given Initialize the browser with chrome
And Open Web Application "<application>" 
When User enters User Name "<UserName>" and Password "<Password>"
Then Verify if the web page title actual "<expectedtitle>"
Then Verify Enquiry search functionality with only Parent Name "<EnquiryParentName>" in search page
Then Verify Enquiry move to waiting list "<WaitingText>" Enquiry Management 
Then Verify Enquiry can be closed with reason code "<ClosedReason>" Enquiry Management 
Then Verify Enquiry can be repoened with reason code "<ClosedReason>" Enquiry Management 
Then Logout from redfish and close browser

Examples:
|UserName   |Password  |application |expectedtitle |MainMenuItem |SubMenuItem |expectedenqtitle |ParentFirstName |ParentSecondName |EnquiryParentName |WaitingText |ClosedReason  |EmailId 			      |Source     |FirstChildFirstName |SecondChildSecondName |DOB        |FirstChildGender |FirstEnrolmentStartDate |BookingPatten |EnquiryDetails  |Sibling |Relationship |ParentalResponsibility |PhotoPreference |TFCReference |LEAFEETReference |hrFundingCode |ChildProfileTitle |							  
|99160101NM |Password1 |redfishUrl  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Samantha 	     |Belfrage         |Samantha Belfrage |Waiting     |Too expensive |sbelfragerq@indiegogo.com |BH Website |Matelda             |Belfrage              |10/05/2019 |F                |03/08/2020              |All Days      |Enquiry Details |No      |Mother       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000034   |Child             |
|99160101NM |Password1 |redfishUrl  |Home 		   |Enquiries    |Enquiry     |New enquiry      |Elonore 	     |Cantua           |Elonore Cantua    |SO26 0LG    |Too expensive |pcantuarr@upenn.com       |BH Website |Dru                 |Cantua                |09/06/2019 |F                |04/08/2020              |All Days      |Enquiry Details |No      |Father       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000035   |Child             |

@RedfishSearchhomepage @Regression 
Scenario Outline: Verify if user is able to use search function in redfish homepage
Given Initialize the browser with chrome
And Open Web Application "<application>" 
When User enters User Name "<UserName>" and Password "<Password>"
Then Verify if the web page title actual "<expectedtitle>"
Then Verify search functionality with Child Name "<ChildName>" and Parent Name "<ParentName>"
Then Logout from redfish and close browser

Examples:
	|UserName   |Password  |application |expectedtitle |ChildName      |ParentName       |expectedenqtitle |ParentFirstName |ParentSecondName |Address 				  |Postcode |MobileNumber |EmailId 			   |Source     |FirstChildFirstName |SecondChildSecondName |DOB        |FirstChildGender |FirstEnrolmentStartDate |BookingPatten |EnquiryDetails  |Sibling |Relationship |ParentalResponsibility |PhotoPreference |TFCReference |LEAFEETReference |hrFundingCode |ChildProfileTitle |							  
	|99160101NM |Password1 |redfishUrl  |Home 		   |Javier Glawsop |Carolyne Glawsop |New enquiry      |Denni 	        |Tunney           |99-2042 St. Marys Road |SO19 0LG |07316826342  |dtunneyb4@mysql.com |BH Website |Delinda             |Tunney                |10/08/2019 |F                |04/08/2020              |All Days      |Enquiry Details |No      |Mother       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000028   |Child             |

@RedfishSearchpage @Regression 
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
	|99160101NM |Password1 |redfishUrl  |Home 		   |Javier Glawsop |Carolyne Glawsop |@#$              |@#$ 	          |Samantha Belfrage |Matelda Belfrage |Abbeymore | 
	
	
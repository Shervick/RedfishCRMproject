Feature: Validate RedfishCRM Workflows
@RedfishCRMContactSearch @Regression 
Scenario Outline: Verify if user is able to create an enquiry and register the child
Given Initialize the browser with chrome
And Open Web Application "<application>" 
When User enters RedfishCRM User Name "<UserName>" and Password "<Password>"
Then Verify if the RedfishCRM web page title actual "<expectedtitle>"
Then Logout from redfishCRM and close browser

Examples:
	|UserName                    |Password |application |expectedtitle                                             |MainMenuItem |SubMenuItem |expectedenqtitle |ParentFirstName |ParentSecondName |Address 			   |Postcode |MobileNumber |EmailId 			        |Source                    |FirstChildFirstName |SecondChildSecondName |DOB        |FirstChildGender |FirstEnrolmentStartDate |BookingPatten |SecondChildFirstName |SecondChildSecondName |SecondChildDOB |SecondChildGender |SecondEnrolmentStartDate |SecondBookingPatten |EnquiryDetails  |Sibling |Relationship |ParentalResponsibility |PhotoPreference |TFCReference |LEAFEETReference |hrFundingCode |ChildProfileTitle |							  
    |99160101@brighthorizons.com |Sam17You |UATCRMUrl   |Contacts Active Parents/Guardian - Microsoft Dynamics 365 |Enquiries    |Enquiry     |New enquiry      |Madella         |Bricknell        |99-2057 St. Marys Road |SO46 0LG |07154264962  |mbricknellq7@indiatimes.com |Company Referral (Client) |Trumaine            |Bricknell             |07/01/2019 |M                |04/08/2020              |All Days      |                     |                      |               |                  |                         |                    |Enquiry Details |No      |Mother       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000044   |Child             |
    |99160101@brighthorizons.com |Sam17You |UATCRMUrl   |Contacts Active Parents/Guardian - Microsoft Dynamics 365 |Enquiries    |Enquiry     |New enquiry      |Dodi 	         |Carabine         |99-2058 St. Marys Road |SO47 0LG |07964491646  |dcarabineq6@tmall.com       |BH Website                |Ingmar              |Lett                  |03/02/2019 |M                |04/09/2020              |All Days      |                     |                      |               |                  |                         |                    |Enquiry Details |No      |Father       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000045   |Child             |
	|99160101@brighthorizons.com |Sam17You |UATCRMUrl   |Contacts Active Parents/Guardian - Microsoft Dynamics 365 |Enquiries    |Enquiry     |New enquiry      |Krispin         |Lett             |99-2056 St. Marys Road |SO45 0LG |07413262177  |klettq8@pen.com             |BH Website                |Ced                 |Carabine              |03/12/2018 |M                |04/08/2020              |All Days      |                     |                      |               |                  |                         |                    |Enquiry Details |No      |Father       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000043   |Child             |


	
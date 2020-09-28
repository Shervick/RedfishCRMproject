Feature: Validate Search Function Page
@RedfishSearch @Regression 
Scenario Outline: Verify if user is able to use search function
Given Initialize the browser with chrome
And Open Web Application "<application>" 
When User enters User Name "<UserName>" and Password "<Password>"
Then Verify if the web page title actual "<expectedtitle>"
Then Verify search functionality with "<ChildName>" and "<ParentName>"


Examples:
	|UserName                    |Password  |application |expectedtitle |ChildName      |ParentName       |expectedenqtitle |ParentFirstName |ParentSecondName |Address 				|Postcode |MobileNumber |EmailId 			   |Source     |FirstChildFirstName |SecondChildSecondName |DOB        |FirstChildGender |FirstEnrolmentStartDate |BookingPatten |EnquiryDetails  |Sibling |Relationship |ParentalResponsibility |PhotoPreference |TFCReference |LEAFEETReference |hrFundingCode |ChildProfileTitle |							  
	|99160101NM                  |Password1 |redfishUrl  |Home 			|Javier Glawsop |Carolyne Glawsop |New enquiry      |Denni 	      |Tunney           |99-2042 St. Marys Road |SO19 0LG |07316826342  |dtunneyb4@mysql.com   |BH Website |Delinda             |Tunney                |10/08/2019 |F                |04/08/2020              |All Days      |Enquiry Details |No      |Mother       |Yes                    |All             |DAST25416TFC |MIOS62391TFC     |50700000028   |Child             |
	
	

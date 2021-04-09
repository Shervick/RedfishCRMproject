Feature: 03.1 Register Children

  @RegisterOneChild
  Scenario Outline: Verify if user is able to register first child
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
    Then Logout from redfish and close browser

    Examples: 
      | UserName    | Password  | application | expectedtitle | MainMenuItem | SubMenuItem | expectedenqtitle | ParentFirstName | ParentSecondName | ParentName      | Address               | Postcode | MobileNumber | EmailId                          | Source     | FirstChildFirstName | SecondChildSecondName | DOB        | FirstChildGender | FirstEnrolmentStartDate | FirstEnrolmentEndDate | BookingPatten                 | SecondChildFirstName | SecondChildSecondName | SecondChildDOB | SecondChildGender | SecondEnrolmentStartDate | SecondBookingPatten | EnquiryDetails  | Sibling | Relationship | ParentalResponsibility | PhotoPreference | TFCReference | LEAFEETReference | hrFundingCode | ChildProfileTitle | VisitDate  | VisitTime |
      | 99160101NM  | Password1 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Hersh           | Vitall           | Hersh Vitall    | 64 Atwood Pass        | SO52 0LG |  07760295675 | hvitall93@bing.com               | BH Website | Georgi              | Vitall                | 28/10/2017 | M                | 08/03/2021              | 12/12/2022            | AMM AMT PMT AMW PMW THAM THPM | Codi                 | Vitall                | 15/01/2018     | M                 | 12/12/2022               | All Days            | Enquiry Details | No      | Father       | Yes                    | All             | DAST25417TFC | MIOS62392TFC     |   50700000015 | Child             | 21/01/2020 |      0930 |
      | 99160101NM2 | Password1 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Dewitt          | Lanphere         | Dewitt Lanphere | 64778 Fulton Junction | SO53 0LG |  07174461518 | dlanphere94@networksolutions.com | BH Website | Vitoria             | Lanphere              | 15/01/2019 | F                | 01/03/2021              | 12/12/2022            | AMM PMM AMT PMT FAM FPM       | Marlene              | Lanphere              | 15/01/2018     | F                 | 12/12/2022               | All Days            | Enquiry Details | No      | Mother       | Yes                    | All             | DAST25417TFC | MIOS62392TFC     |   50700000016 | Child             | 21/01/2020 |      0930 |

  @Register @2ndRegister @Register
  Scenario Outline: Verify if user is able to register the 2nd Child
    Given Initialize the browser with chrome
    And Open Web Application "<application>"
    When User enters User Name "<UserName>" and Password "<Password>"
    Then Verify if the web page title actual "<expectedtitle>"
    Then Verify search functionality with only Parent Name "<EmailId>" in search page
    Then Verify Enquiry search functionality with only Parent Name "<EmailId>" in search page
    When Clicked on register Second child with sibling "<Sibling>"
    When Selecting the Relationship status as "<Relationship>" and Parental Parental Responsibility as "<ParentalResponsibility>"
    When Selecting the PhotoPreference as "<PhotoPreference>"
    When The TFC Reference "<TFCReference>" and LEAFEETReference "<LEAFEETReference>" and hrFundingCode "<hrFundingCode>"
    When The Enrolment Leave date is "<FirstEnrolmentEndDate>"
    Then Verify if the child is registered "<ChildProfileTitle>"
    Then Logout from redfish and close browser

    Examples: 
      | UserName    | Password  | application | expectedtitle | MainMenuItem | SubMenuItem | expectedenqtitle | ParentFirstName | ParentSecondName | ParentName      | Address               | Postcode | MobileNumber | EmailId                          | Source     | FirstChildFirstName | SecondChildSecondName | DOB        | FirstChildGender | FirstEnrolmentStartDate | FirstEnrolmentEndDate | BookingPatten           | SecondChildFirstName | SecondChildSecondName | SecondChildDOB | SecondChildGender | SecondEnrolmentStartDate | SecondBookingPatten | EnquiryDetails  | Sibling | Relationship | ParentalResponsibility | PhotoPreference | TFCReference | LEAFEETReference | hrFundingCode | ChildProfileTitle | VisitDate  | VisitTime |
      | 99160101NM2 | Password1 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Dewitt          | Lanphere         | Dewitt Lanphere | 64778 Fulton Junction | SO53 0LG |  07174461518 | dlanphere94@networksolutions.com | BH Website | Vitoria             | Lanphere              | 15/01/2019 | F                | 01/03/2021              | 12/12/2022            | AMM PMM AMT PMT FAM FPM | Marlene              | Lanphere              | 15/01/2018     | F                 | 12/12/2022               | All Days            | Enquiry Details | No      | Mother       | Yes                    | All             | DAST25417TFC | MIOS62392TFC     |   50700000016 | Child             | 21/01/2020 |      0930 |

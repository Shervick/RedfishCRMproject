Feature: 03.1 Enquiry Management

  @SingleChildEnquiry
  Scenario Outline: DataSingleChidlCreationInRedfish_Verify if redfish Enquiry Booking, Child, Notes, Nursery and Visit are created in redfish is automatically created in CRM
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
    Then Submit General Notes "<ParentName>"
    Then Logout from redfish and close browser

    Examples: 
      | UserName   | Password  | application | expectedtitle | MainMenuItem | SubMenuItem | expectedenqtitle | ParentFirstName | ParentSecondName | ParentName     | Address           | Postcode | MobileNumber | EmailId             | Source     | FirstChildFirstName | SecondChildSecondName | DOB        | FirstChildGender | FirstEnrolmentStartDate | FirstEnrolmentEndDate | BookingPatten                   | SecondChildFirstName | SecondChildSecondName | SecondChildDOB | SecondChildGender | SecondEnrolmentStartDate | SecondBookingPatten | EnquiryDetails  | Sibling | Relationship | ParentalResponsibility | PhotoPreference | TFCReference | LEAFEETReference | hrFundingCode | ChildProfileTitle | VisitDate  | VisitTime |
      | 99160101NM | Password1 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Scotty          | Borrott          | Scotty Borrott | 3 Namekagon Plaza | SO50 0LG |  07095106768 | sborrott91@ehow.com | BH Website | Skyler              | Borrott               | 15/01/2019 | M                | 03/01/2021              | 12/12/2022            | AMM PMM AMT PMT AMW PMW FAM FPM | Deonne               | Borrott               | 15/01/2018     | F                 | 12/12/2022               | All Days            | Enquiry Details | No      | Father       | Yes                    | All             | DAST25417TFC | MIOS62392TFC     |   50700000013 | Child             | 21/01/2020 |      0930 |

  @TwoChildrenEnquiry
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
      | UserName    | Password  | application | expectedtitle | MainMenuItem | SubMenuItem | expectedenqtitle | ParentFirstName | ParentSecondName | ParentName      | Address               | Postcode | MobileNumber | EmailId                          | Source     | FirstChildFirstName | SecondChildSecondName | DOB        | FirstChildGender | FirstEnrolmentStartDate | FirstEnrolmentEndDate | BookingPatten                 | SecondChildFirstName | SecondChildSecondName | SecondChildDOB | SecondChildGender | SecondEnrolmentStartDate | SecondBookingPatten | EnquiryDetails  | Sibling | Relationship | ParentalResponsibility | PhotoPreference | TFCReference | LEAFEETReference | hrFundingCode | ChildProfileTitle | VisitDate  | VisitTime |
      | 99160101NM2 | Password1 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Carolan         | Lyness           | Carolan Lyness  | 28 Sullivan Plaza     | SO51 0LG |  07556941268 | clyness92@jigsy.com              | BH Website | Kacie               | Lyness                | 15/01/2019 | F                | 08/03/2021              | 12/12/2022            | All Days                      | Aubert               | Lyness                | 15/01/2018     | M                 | 12/12/2022               | All Days            | Enquiry Details | No      | Father       | Yes                    | All             | DAST25417TFC | MIOS62392TFC     |   50700000014 | Child             | 21/01/2020 |      0930 |
      | 99160101NM  | Password1 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Hersh           | Vitall           | Hersh Vitall    | 64 Atwood Pass        | SO52 0LG |  07760295675 | hvitall93@bing.com               | BH Website | Georgi              | Vitall                | 28/10/2017 | M                | 08/03/2021              | 12/12/2022            | AMM AMT PMT AMW PMW THAM THPM | Codi                 | Vitall                | 15/01/2018     | M                 | 12/12/2022               | All Days            | Enquiry Details | No      | Father       | Yes                    | All             | DAST25417TFC | MIOS62392TFC     |   50700000015 | Child             | 21/01/2020 |      0930 |
      | 99160101NM2 | Password1 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Dewitt          | Lanphere         | Dewitt Lanphere | 64778 Fulton Junction | SO53 0LG |  07174461518 | dlanphere94@networksolutions.com | BH Website | Vitoria             | Lanphere              | 15/01/2019 | F                | 01/03/2021              | 12/12/2022            | AMM PMM AMT PMT FAM FPM       | Marlene              | Lanphere              | 15/01/2018     | F                 | 12/12/2022               | All Days            | Enquiry Details | No      | Mother       | Yes                    | All             | DAST25417TFC | MIOS62392TFC     |   50700000016 | Child             | 21/01/2020 |      0930 |

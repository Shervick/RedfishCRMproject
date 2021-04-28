Feature: 03.3 Extra Session for a child

  @AddExtraSessions @AbsenceCN @reg22/04/2021
  Scenario Outline: Verify if user is able to add Extra Session for a child
    Given Initialize the browser with chrome
    And Open Web Application "<application>"
    When User enters User Name "<UserName>" and Password "<Password>"
    Then Verify search functionality with only Parent Name "<EmailId>" in search page
    Then Verify Child search functionality with only Parent Email id "<EmailId>" in search page
    Then Verify if user is able to click on Extra Sesssion link
    Then Verify if user is able to type the Extra Sessions Date "<ExtraSessionsDate>" Booking Pattern "<ExtraSessionsBookingPattern>" and click on Add
    Then Logout from redfish and close browser

    Examples: 
      | UserName | Password   | application | expectedtitle | MainMenuItem | SubMenuItem | expectedenqtitle | ParentFirstName | ParentSecondName | ParentName        | EmailId                   | ExtraSessionsDate | ExtraSessionsBookingPattern |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Aleksandr       | Gerauld          | Aleksandr Gerauld | agerauldb2@jugem.com      | 29/04/2021        | Full day                    |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Anatol          | Entwistle        | Anatol Entwistle  | aentwistleb3@un.com       | 30/04/2021        | AM                          |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Bridgette       | Cothey           | Bridgette Cothey  | bcotheyb4@hao123.com      | 28/04/2021        | PM                          |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Rees            | Slade            | Rees Slade        | rsladeb5@ehow.com         | 29/04/2021        | Full day                    |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Chelsae         | Hourston         | Chelsae Hourston  | chourstonb6@woothemes.com | 29/04/2021        | Full day                    |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Doralynn        | Oswal            | Doralynn Oswal    | doswalb7@qq.com           | 30/04/2021        | AM                          |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Elbert          | Calwell          | Elbert Calwell    | ecalwellb8@goodreads.com  | 28/04/2021        | PM                          |

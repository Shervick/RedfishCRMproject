Feature: 03.4 Child Absence

  @AddAbsenceSingleChild @reg22/04/2021
  Scenario Outline: Verify if user is able to add Absence for a child
    Given Initialize the browser with chrome
    And Open Web Application "<application>"
    When User enters User Name "<UserName>" and Password "<Password>"
    Then Verify search functionality with only Parent Name "<EmailId>" in search page
    Then Verify Child search functionality with only Parent Email id "<EmailId>" in search page
    Then Verify if your able to click on Absence link and key in the Start Date "<AbsenceStartDate>" and End Date "<AbsenceEndDate>"
    When Verify if the Absence Reason is selected as "<AbsenceReason>" and Add absence
    Then Logout from redfish and close browser

    Examples: 
      | UserName | Password   | application | expectedtitle | MainMenuItem | SubMenuItem | expectedenqtitle | ParentFirstName | ParentSecondName | ParentName        | EmailId                   | AbsenceStartDate | AbsenceEndDate | AbsenceReason                         |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Aleksandr       | Gerauld          | Aleksandr Gerauld | agerauldb2@jugem.com      | 26/04/2021       | 28/04/2021     | COVID-19 Family Choice Non-Chargeable |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Anatol          | Entwistle        | Anatol Entwistle  | aentwistleb3@un.com       | 26/04/2021       | 29/04/2021     | COVID-19 Family Choice Non-Chargeable |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Bridgette       | Cothey           | Bridgette Cothey  | bcotheyb4@hao123.com      | 26/04/2021       | 30/04/2021     | COVID-19 Family Choice Non-Chargeable |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Rees            | Slade            | Rees Slade        | rsladeb5@ehow.com         | 26/04/2021       | 27/04/2021     | COVID-19 Family Choice Non-Chargeable |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Chelsae         | Hourston         | Chelsae Hourston  | chourstonb6@woothemes.com | 26/04/2021       | 28/04/2021     | COVID-19 Family Choice Non-Chargeable |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Doralynn        | Oswal            | Doralynn Oswal    | doswalb7@qq.com           | 26/04/2021       | 29/04/2021     | COVID-19 Family Choice Non-Chargeable |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Elbert          | Calwell          | Elbert Calwell    | ecalwellb8@goodreads.com  | 26/04/2021       | 30/04/2021     | COVID-19 Family Choice Non-Chargeable |

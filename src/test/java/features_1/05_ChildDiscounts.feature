Feature: 03.5 Add Discounts for a child

  @AddDiscounts @AbsenceCN @reg22/04/2021
  Scenario Outline: Verify if user is able to add Add Discounts for a child
    Given Initialize the browser with chrome
    And Open Web Application "<application>"
    When User enters User Name "<UserName>" and Password "<Password>"
    Then Verify search functionality with only Parent Name "<EmailId>" in search page
    Then Verify Child search functionality with only Parent Email id "<EmailId>" in search page
    Then Verify if user is able to click on Discount link
    Then Verify if user is able to add a discount with Start Date "<DiscountStartDate>" End Date "<DiscountEndDate>" NameRate "<NameRate>" and Order "<Order>"
    Then Logout from redfish and close browser

    Examples: 
      | UserName | Password   | application | expectedtitle | MainMenuItem | SubMenuItem | expectedenqtitle | ParentFirstName | ParentSecondName | ParentName        | EmailId                    | DiscountStartDate | DiscountEndDate | NameRate                 | Order |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Aleksandr       | Gerauld          | Aleksandr Gerauld | agerauldb2@jugem.com       | 01/04/2021        | 30/04/2021      | 40% Staff Discount / 40% |    99 |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Anatol          | Entwistle        | Anatol Entwistle  | aentwistleb3@un.com        | 01/04/2021        | 30/04/2021      | 40% Staff Discount / 40% |     1 |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Bridgette       | Cothey           | Bridgette Cothey  | bcotheyb4@hao123.com       | 01/04/2021        | 30/04/2021      | 40% Staff Discount / 40% |    99 |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Rees            | Slade            | Rees Slade        | rsladeb5@ehow.com          | 01/04/2021        | 30/04/2021      | 40% Staff Discount / 40% |     1 |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Chelsae         | Hourston         | Chelsae Hourston  | chourstonb6@woothemes.com  | 01/04/2021        | 30/04/2021      | 40% Staff Discount / 40% |    99 |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Doralynn        | Oswal            | Doralynn Oswal    | doswalb7@qq.com            | 01/04/2021        | 30/04/2021      | 40% Staff Discount / 40% |     1 |
      | 99160101 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Elbert          | Calwell          | Elbert Calwell    | ecalwellb8@goodreads.com   | 01/04/2021        | 30/04/2021      | 40% Staff Discount / 40% |    99 |

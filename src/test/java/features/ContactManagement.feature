#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: 03.2 Contact Management

  @SmokeRegressionTC1_3
  Scenario Outline: Search a Contact
    Given Initialize the browser with chrome
    And Open Web Application "<application>"
    When User enters RedfishCRM User Name "<UserName>" and Password "<Password>"
    Then Verify if the RedfishCRM web page title actual "<expectedtitle>"
    Then Verify if the Contacts Associated View is displayed take screenshot in "<contactviewfilename>"
    When Verify if user able to search with parent Full Name "<ParentName>" screenshot in "<FullNameFileName>"
    When Verify if user able to search with parent email id "<ParentEmailID>" screenshot in "<ParentEmailIDFileName>"
    When Verify if user able to search with Post Code "<Postcode>" screenshot in "<Postcodefilename>"
    When Verify if user able to search with invalid search key "<InvalidSearch>" screenshot in "<InvalidSearchFilename>"
    Then Logout from redfishCRM and close browser "<CRMlogoutfilename>"

    Examples: 
      | UserName                    | Password | application | expectedtitle                                             | ParentEmailID            | Postcode | ParentFirstName | ParentSecondName | ParentName       | EnquiryType | InvalidSearch | MobileNumber | contactfilename        | contactwithenqfilename    | CRMlogoutfilename            | CRMEnquiryTitle          | Enquiryfilename        | CRMVisitTitle      | Visitfilename        | FullNameFileName         | ParentEmailIDFileName                 | Postcodefilename     | InvalidSearchFilename | contactviewfilename |
      | 99160101@brighthorizons.com | Sam18You | UATCRMUrl   | Contacts Active Parents/Guardian - Microsoft Dynamics 365 | lashfoldgl@netscape.com  | SO38 0LG | Lezlie          | Tythacott        | Lezlie Tythacott | RedFish     | @#$           |  07214596965 | contactLezlieTythacott | contactenqLezlieTythacott | contactlogoutLezlieTythacott | Enquiry: RedFish Enquiry | EnquiryLezlieTythacott | Appointment: Visit | VisitLezlieTythacott | FullNameLezlie Tythacott | ParentEmailIDlashfoldgl@netscape.com  | PostcodefileSO38 0LG | InvalidsearchLezlie   | contactviewLezlie   |
      | 99160101@brighthorizons.com | Sam18You | UATCRMUrl   | Contacts Active Parents/Guardian - Microsoft Dynamics 365 | parentgm@theatlantic.com | SO39 0LG | Patin           | Blouet           | Patin Blouet     | RedFish     | 14/10/2020    |  07374096556 | contactPatinBlouet     | contactenqPatinBlouet     | contactlogoutPatinBlouet     | Enquiry: RedFish Enquiry | EnquiryPatinBlouet     | Appointment: Visit | VisitPatinBlouet     | FullNamePatin Blouet     | ParentEmailIDparentgm@theatlantic.com | PostcodefileSO39 0LG | InvalidsearchPatin    | contactviewPatin    |
      | 99160101@brighthorizons.com | Sam18You | UATCRMUrl   | Contacts Active Parents/Guardian - Microsoft Dynamics 365 | lgwylltgn@ebay.com       | SO40 0LG | Laural          | Langfield        | Laural Langfield | RedFish     | 901Laural     |  07727152892 | contactLauralLangfield | contactenqLauralLangfield | contactlogoutLauralLangfield | Enquiry: RedFish Enquiry | EnquiryLauralLangfield | Appointment: Visit | VisitLauralLangfield | FullNameLaural Langfield | ParentEmailIDlgwylltgn@ebay.com       | PostcodefileSO40 0LG | InvalidsearchLaural   | contactviewLaural   |

  @SmokeRegressionTC1_4
  Scenario Outline: Create a Contact in CRM when enquiry is created in CRM through Redfish interface
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
      | UserName                    | Password | application | expectedtitle                                             | ParentEmailID            | Postcode | ParentFirstName | ParentSecondName | ParentName       | EnquiryType | InvalidSearch | MobileNumber | contactfilename        | contactwithenqfilename    | CRMlogoutfilename            | CRMEnquiryTitle          | Enquiryfilename        | CRMVisitTitle      | Visitfilename        | FullNameFileName         | ParentEmailIDFileName                 | Postcodefilename     | InvalidSearchFilename | contactviewfilename |
      | 99160101@brighthorizons.com | Sam18You | UATCRMUrl   | Contacts Active Parents/Guardian - Microsoft Dynamics 365 | lashfoldgl@netscape.com  | SO38 0LG | Lezlie          | Tythacott        | Lezlie Tythacott | RedFish     | @#$           |  07214596965 | contactLezlieTythacott | contactenqLezlieTythacott | contactlogoutLezlieTythacott | Enquiry: RedFish Enquiry | EnquiryLezlieTythacott | Appointment: Visit | VisitLezlieTythacott | FullNameLezlie Tythacott | ParentEmailIDlashfoldgl@netscape.com  | PostcodefileSO38 0LG | InvalidsearchLezlie   | contactviewLezlie   |
      | 99160101@brighthorizons.com | Sam18You | UATCRMUrl   | Contacts Active Parents/Guardian - Microsoft Dynamics 365 | parentgm@theatlantic.com | SO39 0LG | Patin           | Blouet           | Patin Blouet     | RedFish     | 14/10/2020    |  07374096556 | contactPatinBlouet     | contactenqPatinBlouet     | contactlogoutPatinBlouet     | Enquiry: RedFish Enquiry | EnquiryPatinBlouet     | Appointment: Visit | VisitPatinBlouet     | FullNamePatin Blouet     | ParentEmailIDparentgm@theatlantic.com | PostcodefileSO39 0LG | InvalidsearchPatin    | contactviewPatin    |
      | 99160101@brighthorizons.com | Sam18You | UATCRMUrl   | Contacts Active Parents/Guardian - Microsoft Dynamics 365 | lgwylltgn@ebay.com       | SO40 0LG | Laural          | Langfield        | Laural Langfield | RedFish     | 901Laural     |  07727152892 | contactLauralLangfield | contactenqLauralLangfield | contactlogoutLauralLangfield | Enquiry: RedFish Enquiry | EnquiryLauralLangfield | Appointment: Visit | VisitLauralLangfield | FullNameLaural Langfield | ParentEmailIDlgwylltgn@ebay.com       | PostcodefileSO40 0LG | InvalidsearchLaural   | contactviewLaural   |

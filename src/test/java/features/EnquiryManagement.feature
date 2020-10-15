Feature: 03.1 Enquiry Management

  @SmokeRegressionTC1_1 @Test
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
      | UserName    | Password   | application | expectedtitle | MainMenuItem | SubMenuItem | expectedenqtitle | ParentFirstName | ParentSecondName | ParentName          | Address                | Postcode | MobileNumber | EmailId                  | Source     | FirstChildFirstName | SecondChildSecondName | DOB        | FirstChildGender | FirstEnrolmentStartDate | FirstEnrolmentEndDate | BookingPatten | SecondChildFirstName | SecondChildSecondName | SecondChildDOB | SecondChildGender | SecondEnrolmentStartDate | SecondBookingPatten | EnquiryDetails  | Sibling | Relationship | ParentalResponsibility | PhotoPreference | TFCReference | LEAFEETReference | hrFundingCode | ChildProfileTitle | VisitDate  | VisitTime |
      | 99160101NM  | Password1  | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Federico        | McWilliams       | Federico McWilliams | 99-2147 St. Marys Road | SO47 0LG |  07194124937 | fmcwilliamsez@joomla.com | BH Website | Abram               | McWilliams            | 15/10/2017 | M                | 14/10/2020              | 27/09/2021            | All Days      | Christabella         | McWilliams            | 14/10/2018     | F                 | 15/10/2020               | All Days            | Enquiry Details | No      | Mother       | Yes                    | All             | DAST25417TFC | MIOS62392TFC     |   50700000191 | Child             | 19/10/2020 |      0930 |
      | 99160101NM2 | Password1  | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Malanie         | Fordyce          | Malanie Fordyce     | 99-2148 St. Marys Road | SO48 0LG |  07041458233 | mfordycef0@nature.com    | BH Website | Berti               | Fordyce               | 15/10/2017 | F                | 14/10/2020              | 27/09/2021            | All Days      | Christin             | Fordyce               | 14/10/2018     | F                 | 15/10/2020               | All Days            | Enquiry Details | No      | Father       | Yes                    | All             | DAST25417TFC | MIOS62392TFC     |   50700000192 | Child             | 19/10/2020 |      0930 |
      | 99160101NM3 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Jilleen         | Brougham         | Jilleen Brougham    | 99-2149 St. Marys Road | SO49 0LG |  07622870426 | jbroughamf1@goo.com      | BH Website | Fina                | Brougham              | 15/10/2017 | F                | 14/10/2020              | 27/09/2021            | All Days      | Rolph                | Brougham              | 14/10/2018     | M                 | 15/10/2020               | All Days            | Enquiry Details | No      | Mother       | Yes                    | All             | DAST25417TFC | MIOS62392TFC     |   50700000193 | Child             | 19/10/2020 |      0930 |
      | 99160101NM  | Password1  | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Rhona           | Thurston         | Rhona Thurston      | 99-2150 St. Marys Road | SO50 0LG |  07121785051 | rthurstonf2@gravatar.com | BH Website | Felisha             | Thurston              | 15/10/2017 | F                | 14/10/2020              | 27/09/2021            | All Days      | Tilda                | Thurston              | 14/10/2018     | F                 | 15/10/2020               | All Days            | Enquiry Details | No      | Mother       | Yes                    | All             | DAST25417TFC | MIOS62392TFC     |   50700000194 | Child             | 19/10/2020 |      0930 |
      | 99160101NM2 | Password1  | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Anny            | Merrigan         | Anny Merrigan       | 99-2151 St. Marys Road | SO51 0LG |  07555183309 | amerriganf3@infoseek.com | BH Website | Steward             | Merrigan              | 15/10/2017 | M                | 14/10/2020              | 27/09/2021            | All Days      | Catlee               | Merrigan              | 14/10/2018     | F                 | 15/10/2020               | All Days            | Enquiry Details | No      | Father       | Yes                    | All             | DAST25417TFC | MIOS62392TFC     |   50700000195 | Child             | 19/10/2020 |      0930 |
      | 99160101NM3 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Greta           | Wistance         | Greta Wistance      | 99-2152 St. Marys Road | SO52 0LG |  07468768392 | gwistancef4@sbwire.com   | BH Website | Marina              | Wistance              | 15/10/2017 | F                | 14/10/2020              | 27/09/2021            | All Days      | Darb                 | Wistance              | 14/10/2018     | F                 | 15/10/2020               | All Days            | Enquiry Details | No      | Mother       | Yes                    | All             | DAST25417TFC | MIOS62392TFC     |   50700000196 | Child             | 19/10/2020 |      0930 |

  @SmokeRegressionTC1_2
  Scenario Outline: DataVerificationInCRM_Verify if redfish Enquiry Booking, Child, Notes, Nursery and Visit are created in redfish is automatically created in CRM
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

  @SmokeRegressionTC1_3
  Scenario Outline: Verify if user is able to register the two children
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
    Then Verify search functionality with only Parent Name "<ParentName>" in search page
    Then Verify Enquiry search functionality with only Parent Name "<EmailId>" in search page
    When Clicked on register Second child with sibling "<Sibling>"
    When Selecting the Relationship status as "<Relationship>" and Parental Parental Responsibility as "<ParentalResponsibility>"
    When Selecting the PhotoPreference as "<PhotoPreference>"
    When The TFC Reference "<TFCReference>" and LEAFEETReference "<LEAFEETReference>" and hrFundingCode "<hrFundingCode>"
    When The Enrolment Leave date is "<FirstEnrolmentEndDate>"
    Then Verify if the child is registered "<ChildProfileTitle>"
    Then Logout from redfish and close browser

    Examples: 
      | UserName    | Password   | application | expectedtitle | MainMenuItem | SubMenuItem | expectedenqtitle | ParentFirstName | ParentSecondName | ParentName        | Address                | Postcode | MobileNumber | EmailId                      | Source     | FirstChildFirstName | SecondChildSecondName | DOB        | FirstChildGender | FirstEnrolmentStartDate | FirstEnrolmentEndDate | BookingPatten | SecondChildFirstName | SecondChildSecondName | SecondChildDOB | SecondChildGender | SecondEnrolmentStartDate | SecondBookingPatten | EnquiryDetails  | Sibling | Relationship | ParentalResponsibility | PhotoPreference | TFCReference | LEAFEETReference | hrFundingCode | ChildProfileTitle | VisitDate  | VisitTime |
      | 99160101NM  | Password1  | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Samuel          | Yukhnevich       | Samuel Yukhnevich | 99-2141 St. Marys Road | SO41 0LG |  07690204518 | syukhnevichgc@craigslist.com | BH Website | Alvin               | Yukhnevich            | 13/10/2017 | F                | 13/10/2020              | 27/09/2021            | All Days      | Keely                | Yukhnevich            | 13/10/2018     | M                 | 14/10/2020               | All Days            | Enquiry Details | No      | Mother       | Yes                    | All             | DAST25417TFC | MIOS62392TFC     |   50700000185 | Child             | 16/10/2020 |      0930 |
      | 99160101NM2 | Password1  | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Rachel          | Innocent         | Rachel Innocent   | 99-2142 St. Marys Road | SO42 0LG |  07684414876 | rinnocentgd@opera.com        | BH Website | Marrilee            | Innocent              | 13/10/2017 | M                | 13/10/2020              | 27/09/2021            | All Days      | Daniel               | Innocent              | 13/10/2018     | F                 | 14/10/2020               | All Days            | Enquiry Details | No      | Father       | Yes                    | All             | DAST25417TFC | MIOS62392TFC     |   50700000186 | Child             | 16/10/2020 |      0930 |
      | 99160101NM3 | Password01 | redfishUAT  | Home          | Enquiries    | Enquiry     | New enquiry      | Lemmy           | Lettson          | Lemmy Lettson     | 99-2143 St. Marys Road | SO43 0LG |  07765893286 | llettsonge@mail.com          | BH Website | Bessie              | Lettson               | 13/10/2017 | M                | 13/10/2020              | 27/09/2021            | All Days      | Stuart               | Lettson               | 13/10/2018     | M                 | 14/10/2020               | All Days            | Enquiry Details | No      | Mother       | Yes                    | All             | DAST25417TFC | MIOS62392TFC     |   50700000187 | Child             | 16/10/2020 |      0930 |

  @Register2Children
  Scenario Outline: DataVerificationInCRM_Verify if redfish Enquiry Booking, Child, Notes, Nursery and Visit are created in redfish is automatically created in CRM
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

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
      |UserName|Password|application|expectedtitle|MainMenuItem|SubMenuItem|expectedenqtitle|ParentFirstName|ParentSecondName|ParentName|Address|Postcode|MobileNumber|EmailId|Source|FirstChildFirstName|SecondChildSecondName|DOB|FirstChildGender|FirstEnrolmentStartDate|FirstEnrolmentEndDate|BookingPatten|SecondChildFirstName|SecondChildSecondName|SecondChildDOB|SecondChildGender|SecondEnrolmentStartDate|SecondBookingPatten|EnquiryDetails|Sibling|Relationship|ParentalResponsibility|PhotoPreference|TFCReference|LEAFEETReference|hrFundingCode|ChildProfileTitle|VisitDate|VisitTime|
      |99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Neddy|Gairdner|Neddy Gairdner|99-2154 St. Marys Road|SO54 0LG|07749636857|ngairdnerea@telegraph.com|BH Website|Tersina|Gairdner|21/10/2017|F|21/10/2020|27/09/2021|All Days|Carmelita|Gairdner|21/10/2018|F|21/10/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000197|Child|23/10/2020|0930|
      |99160101NM2|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Elsworth|Nias|Elsworth Nias|99-2155 St. Marys Road|SO55 0LG|07975285568|eniaseb@hexun.com|BH Website|Silvanus|Nias|21/10/2017|M|21/10/2020|27/09/2021|All Days|Laurianne|Nias|21/10/2018|F|21/10/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000198|Child|23/10/2020|0930|
      |99160101NM3|Password01|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Fulvia|Edmonston|Fulvia Edmonston|99-2156 St. Marys Road|SO56 0LG|07256642122|fedmonstonec@soundcloud.com|BH Website|Kristina|Edmonston|21/10/2017|F|21/10/2020|27/09/2021|All Days|Mara|Edmonston|21/10/2018|F|21/10/2020|All Days|Enquiry Details|No|Mother|Yes|All|DAST25417TFC|MIOS62392TFC|50700000199|Child|23/10/2020|0930|

  @SmokeRegressionTC1_2
  Scenario Outline: DataVerificationInCRM_Verify if redfish Enquiry Booking, Child, Notes, Nursery and Visit are created in redfish is automatically created in CRM
    Given Initialize the browser with chrome
    And Open Web Application "<application>"
    When User enters RedfishCRM User Name "<UserName>" and Password "<Password>"
    Then Verify if the RedfishCRM web page title actual "<expectedtitle>"
    Then Verify if user able to search with parent email id "<ParentEmailID>" "<contactfilename>" "<ParentName>"
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
      |UserName|Password|application|expectedtitle|MainMenuItem|SubMenuItem|expectedenqtitle|ParentFirstName|ParentSecondName|ParentName|Address|Postcode|MobileNumber|EmailId|Source|FirstChildFirstName|SecondChildSecondName|DOB|FirstChildGender|FirstEnrolmentStartDate|FirstEnrolmentEndDate|BookingPatten|SecondChildFirstName|SecondChildSecondName|SecondChildDOB|SecondChildGender|SecondEnrolmentStartDate|SecondBookingPatten|EnquiryDetails|Sibling|Relationship|ParentalResponsibility|PhotoPreference|TFCReference|LEAFEETReference|hrFundingCode|ChildProfileTitle|VisitDate|VisitTime|
      |99160101NM|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Olympe|Heiden|Olympe Heiden|99-2151 St. Marys Road|SO51 0LG|07678976577|oheidenej@cargocollective.com|BH Website|Nial|Heiden|20/10/2017|M|20/10/2020|27/09/2021|All Days|Genevra|Heiden|20/10/2018|F|20/10/2020|All Days|Enquiry Details|No|Mother|Yes|All|DAST25417TFC|MIOS62392TFC|50700000194|Child|23/10/2020|0930|
      |99160101NM2|Password1|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Biron|Yapp|Biron Yapp|99-2152 St. Marys Road|SO52 0LG|07592812763|byappek@jimdo.com|BH Website|Ruperto|Yapp|20/10/2017|M|20/10/2020|27/09/2021|All Days|Del|Yapp|20/10/2018|F|20/10/2020|All Days|Enquiry Details|No|Father|Yes|All|DAST25417TFC|MIOS62392TFC|50700000195|Child|23/10/2020|0930|
      |99160101NM3|Password01|redfishUAT|Home|Enquiries|Enquiry|New enquiry|Krista|Moffett|Krista Moffett|99-2153 St. Marys Road|SO53 0LG|07803935159|kmoffettel@independent.com|BH Website|Anders|Moffett|20/10/2017|M|20/10/2020|27/09/2021|All Days|Loria|Moffett|20/10/2018|F|20/10/2020|All Days|Enquiry Details|No|Mother|Yes|All|DAST25417TFC|MIOS62392TFC|50700000196|Child|23/10/2020|0930|
  
  @Register2Children
  Scenario Outline: DataVerificationInCRM_Verify if redfish Enquiry Booking, Child, Notes, Nursery and Visit are created in redfish is automatically created in CRM
    Given Initialize the browser with chrome
    And Open Web Application "<application>"
    When User enters RedfishCRM User Name "<UserName>" and Password "<Password>"
    Then Verify if the RedfishCRM web page title actual "<expectedtitle>"
    Then Verify if user able to search with parent email id "<ParentEmailID>" "<contactfilename>" "<ParentName>"
    Then Verify if Enquiry is created by taking the screen shot of the enquiry table "<contactwithenqfilename>"
    Then Verify if user able to open the enquiry and verify the title as "<CRMEnquiryTitle>" screenshot in "<Enquiryfilename>"
    Then Verify if user able to open the visit and verify the title as "<CRMVisitTitle>" screenshot in "<Visitfilename>"
    Then Logout from redfishCRM and close browser "<CRMlogoutfilename>"

    Examples: 
      | UserName                    | Password | application | expectedtitle                                             | ParentEmailID            | Postcode | ParentFirstName | ParentSecondName | ParentName       | EnquiryType | InvalidSearch | MobileNumber | contactfilename        | contactwithenqfilename    | CRMlogoutfilename            | CRMEnquiryTitle          | Enquiryfilename        | CRMVisitTitle      | Visitfilename        | FullNameFileName         | ParentEmailIDFileName                 | Postcodefilename     | InvalidSearchFilename | contactviewfilename |
      | 99160101@brighthorizons.com | Sam18You | UATCRMUrl   | Contacts Active Parents/Guardian - Microsoft Dynamics 365 | lashfoldgl@netscape.com  | SO38 0LG | Lezlie          | Tythacott        | Lezlie Tythacott | RedFish     | @#$           |  07214596965 | contactLezlieTythacott | contactenqLezlieTythacott | contactlogoutLezlieTythacott | Enquiry: RedFish Enquiry | EnquiryLezlieTythacott | Appointment: Visit | VisitLezlieTythacott | FullNameLezlie Tythacott | ParentEmailIDlashfoldgl@netscape.com  | PostcodefileSO38 0LG | InvalidsearchLezlie   | contactviewLezlie   |
      | 99160101@brighthorizons.com | Sam18You | UATCRMUrl   | Contacts Active Parents/Guardian - Microsoft Dynamics 365 | parentgm@theatlantic.com | SO39 0LG | Patin           | Blouet           | Patin Blouet     | RedFish     | 14/10/2020    |  07374096556 | contactPatinBlouet     | contactenqPatinBlouet     | contactlogoutPatinBlouet     | Enquiry: RedFish Enquiry | EnquiryPatinBlouet     | Appointment: Visit | VisitPatinBlouet     | FullNamePatin Blouet     | ParentEmailIDparentgm@theatlantic.com | PostcodefileSO39 0LG | InvalidsearchPatin    | contactviewPatin    |
      | 99160101@brighthorizons.com | Sam18You | UATCRMUrl   | Contacts Active Parents/Guardian - Microsoft Dynamics 365 | lgwylltgn@ebay.com       | SO40 0LG | Laural          | Langfield        | Laural Langfield | RedFish     | 901Laural     |  07727152892 | contactLauralLangfield | contactenqLauralLangfield | contactlogoutLauralLangfield | Enquiry: RedFish Enquiry | EnquiryLauralLangfield | Appointment: Visit | VisitLauralLangfield | FullNameLaural Langfield | ParentEmailIDlgwylltgn@ebay.com       | PostcodefileSO40 0LG | InvalidsearchLaural   | contactviewLaural   |
			
			@CRMPhoneEnquiry
      Scenario Outline: DataCreationInCRM_Verify if user is able to create a phone enquiry from CRM
      Given Initialize the browser with chrome
      And Open Web Application "<application>"
      When User enters RedfishCRM User Name "<UserName>" and Password "<Password>"
      Then Verify if the RedfishCRM web page title actual "<expectedtitle>"
      Then Verify if user is able to click on new contact and get the actual title "<expnewcontacttitle>"
      Then Type Parent First Name "<ParentFirstName>" Parent Second Name "<ParentSecondName>" Address "<Address>" Postcode "<Postcode>" MobileNumber "<MobileNumber>" Email id "<ParentEmailID>" Relationship Type "<relationshipType>"
      Then Take screen shot in file name "<NewContactfilename>"
      Then Logout from redfishCRM and close browser "<CRMlogoutfilename>" 
    
     Examples:
    |UserName|Password|application|expectedtitle|expnewcontacttitle|ParentFirstName|ParentSecondName|ParentName|CRMlogoutfilename|ParentEmailID|Postcode|MobileNumber|NewContactfilename|relationshipType|
    |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|Contact: New Contact|Krista|Moffett|Krista Moffett|contactlogoutKristaMoffett|kmoffettel@independent.com|SO45 0LG|07803935159|NewContactKristaMoffett|Parent|

    @CRMAddNP
    Scenario Outline: DataCreationInCRM_Verify if user is able to add a new Nursery Preference for an enquiry in CRM
     Given Initialize the browser with chrome
     And Open Web Application "<application>"
     When User enters RedfishCRM User Name "<UserName>" and Password "<Password>"
     Then Verify if the RedfishCRM web page title actual "<expectedtitle>"
     Then Verify if user able to search with parent email id "<ParentEmailID>" "<contactfilename>" "<ParentName>"
     Then Verify if user able to open the enquiry and verify the title as "<CRMEnquiryTitle>" screenshot in "<Enquiryfilename>"
     Then Verify if user is able to add "<Nursery>" in nursery preferred
     Then Logout from redfishCRM and close browser "<CRMlogoutfilename>" 
      
      Examples:
      |UserName|Password|application|expectedtitle|expnewcontacttitle|ParentFirstName|ParentSecondName|ParentName|CRMlogoutfilename|ParentEmailID|Postcode|MobileNumber|NewContactfilename|Address|relationshipType|CRMEnquiryTitle|Enquiryfilename|Nursery|contactfilename|
      |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|Contact: New Contact|Neddy|Gairdner|Neddy Gairdner|contactlogoutNeddyGairdner|ngairdnerea@telegraph.com|SO54 0LG|07749636857|NewContactNeddyGairdner|99-2154 St. Marys Road|Parent|Enquiry: RedFish Enquiry|EnquiryNeddyGairdner|Northwick Park Day Nursery and Preschool|contactNeddyGairdner|
      |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|Contact: New Contact|Elsworth|Nias|Elsworth Nias|contactlogoutElsworthNias|eniaseb@hexun.com|SO55 0LG|07975285568|NewContactElsworthNias|99-2155 St. Marys Road|Parent|Enquiry: RedFish Enquiry|EnquiryElsworthNias|Yellow Dot Ampfield|contactElsworthNias|
      |99160101@brighthorizons.com|Sam18You|UATCRMUrl|Contacts Active Parents/Guardian - Microsoft Dynamics 365|Contact: New Contact|Fulvia|Edmonston|Fulvia Edmonston|Edmonston Fulvia Edmonston|fedmonstonec@soundcloud.com|SO56 0LG|07256642122|NewContactFulviaEdmonston|99-2156 St. Marys Road|Parent|Enquiry: RedFish Enquiry|EnquiryFulviaEdmonston|Abbeymore Day Nursery and Preschool|contactFulviaEdmonston|

      
      
      
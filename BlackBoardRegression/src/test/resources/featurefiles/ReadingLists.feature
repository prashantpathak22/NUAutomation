Feature: University Reading Lists

  @BlackboardRegression @Readingliststaff @ReadinglistComplete
  Scenario: Access University Reading List as staff
    Given login as staff
    Then select ultra view module
    Then click on view reading lists and institution tools
    Then validate reading list is displayed
    Then click x icon books and tools
    Then click plusicon
    Then select content market
    Then validate reading list icon is displayed
    
    #Then click on view reading lists and institution tools
    #Then click plusicon
    #Then select content market
    #Then validate reading list icon is displayed
    #Then click reading list icon
    Then click + icon on reading list  on Teaching tools
    And library reading list should be added to content area
    Then click reading list icon from course content area
    Then authenticate button is displayed
    Then click on authenticate button
    Then library login screen is displayed
    Then login to library with staff logon details
    Then user should be logged in and university reading list screen should be displayed
    Then click x icon on lti window from teaching tool
    #And click x icon on teaching tools
    Then update the visibility to visibile to students
    Then click x icon on module window
    And close browser

  @BlackboardRegression @Readingliststudent @ReadinglistComplete
  Scenario: Access University Reading List as student
    Given login as student
    Then select ultra view module
    Then click on view reading lists and institution tools
    Then validate reading list is displayed
    Then click x icon books and tools
    Then library reading list should be added to content area
    Then click on reading list as student
    Then university reading list screen should be displayed to students
    #Then authenticate button is displayed
    #Then click on authenticate button
    #Then login to library with student logon details
    #Then login with student logon details
    #Then user should be able to login
    Then click x icon on LTI window
    Then click x icon on module window
    And close browser

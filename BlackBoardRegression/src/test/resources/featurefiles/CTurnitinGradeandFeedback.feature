Feature: Turnitin grade and feedback
 

  @BlackboardRegression @Turnitingradestaff @UltraTIIComplete
  Scenario: Turnitin assignment grade and feedback - staff
    Given login as staff
    Then select ultra view module
    Then click on Turnitin assignment to submit
    Then launch turnitin assignment inbox
    Then turnitin LTI screen is launched with assignment inbox
    Then search for individual student and grade submission 
    Then click x icon on lti window from teaching tool
    Then click on gradebook icon on content screen
    Then gradebook is launched
    Then click grid icon on gradebook
    Then gradebook grid view is loaded
    And search for assignment to grade
    Then select assingment from search result
    Then select individual student to verify grades from turnitin
    Then click x icon on module window
    And close browser


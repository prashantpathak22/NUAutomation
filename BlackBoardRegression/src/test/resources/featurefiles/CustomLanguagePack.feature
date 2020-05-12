
Feature: Custom Language Pack and field validations
  

 @Customlanguagestaff
  Scenario: Language pack field validation- Staff
   Given login as staff
   And module and programmes is displayed
   Then ultra view loads
    And content page is loaded
    Then teaching tools screen is displayed
   
    Then create is displayed
    And copy content is displayed
    And upload is displayed
    And teaching tools is displayed
    And cloud storage is displayed
    And content collection is displayed

  @Customlanguagestudent
  Scenario: Language pack field validation- Student
  Given login as student
  And 
  

    

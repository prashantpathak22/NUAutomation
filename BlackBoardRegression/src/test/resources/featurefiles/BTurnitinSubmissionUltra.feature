
Feature: Turnitin Assingment submission 
  

@BlackboardRegression @UltraTIIsubmissionFile @UltraTIIComplete
  Scenario: Turnitin Student Submission - File Upload
    Given login as student
    Then select ultra view module
    Then turnitin assignment is added to content area
    And  turnitin assignment insruction is displayed
    Then click on Turnitin assignment to submit
    And click on launch button
    And verify assignment title on turnitin
    Then click information icon
    Then information pane is opened
    And click summary tab
    Then summary pane is opended
    And verify assignment title on summary screen
    And verify staff entered instructions are displayed
    Then click assignment dashboard
    Then assignment dashboard is displayed
    Then click upload submission button
    Then enter file upload assignment title
    And select a file to upload
    And file name is displayed
    Then upload and review button is enabled
    And click upload and review file upload
    Then compare file upload submission title
    Then launch preview
    Then upload preview is displayed
    And click close preview
    Then click submit to turnitin
    And successful submission message is displayed
    Then validate assignment title after submission- file upload
    Then click x icon on lti window from teaching tool
    Then content page is displayed
    Then click x icon on module window
    And close browser

  @BlackboardRegression @UltraTIIsubmissiondropbox @UltraTIIComplete
  Scenario: Turnitin Student Submission - Dropbox
    Given login as student2
    Then select ultra view module
    Then click on Turnitin assignment to submit
    And click on launch button
    And verify assignment title on turnitin
    Then click information icon
    Then information pane is opened
    And click summary tab
    Then summary pane is opended
    And verify assignment title on summary screen
    And verify staff entered instructions are displayed
    Then click assignment dashboard
    Then assignment dashboard is displayed
    Then click upload submission button
    Then click cloud submission
    Then select dropbox option
    Then dropbox screen is launched
    Then enter dropbox login email
    And enter dropbox login password
    And uncheck remember me checkbox
    Then click dropbox signin button
    Then dropbox login successful
    Then search for file to upload
    And select file to upload
    Then click choose button on dropbox
    Then verify dropbox submission title
    Then launch preview
    Then upload preview is displayed
    And click close preview
    Then click submit to turnitin
    And successful submission message is displayed
    Then verify dropbox submission title after submission
    Then click x icon on lti window from teaching tool
    Then content page is displayed
    Then click x icon on module window
    And close browser
    
     @!BlackboardRegression @UltraTIIsubmissionText @UltraTIIComplete
  Scenario: Turnitin Student Submission - Text
    Given login as student3
    Then select ultra view module
    Then click on Turnitin assignment to submit
    And click on launch button
    And verify assignment title on turnitin
    Then click information icon
    Then information pane is opened
    And click summary tab
    Then summary pane is opended
    And verify assignment title on summary screen
    And verify staff entered instructions are displayed
    Then click assignment dashboard
    Then assignment dashboard is displayed
    Then click upload submission button
    And select text input tab
    Then enter text submission title
    And enter the text for submission
    And click upload and review
    Then compare submission title
    Then launch preview
    Then upload preview is displayed
    And click close preview
    Then click submit to turnitin
    And successful submission message is displayed
    Then validate assignment title after submission
    Then click x icon on lti window from teaching tool
    Then content page is displayed
    Then click x icon on module window
    And close browser
    

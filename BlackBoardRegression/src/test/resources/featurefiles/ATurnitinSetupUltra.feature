Feature: A Turnitin Assignment Setup Ultra
  
  Narrative: Setting up Turnitin Assignement
  
  In order to Test Turitin assignment setup using LTI in Ultra course view
  
  As an Instructor/Tutor
  
  I want to setup the Turnitin assignment

  @BlackboardRegression @UltraTIIsetup @UltraTIIComplete
  Scenario Outline: Turnitin Assingment Setup -Ultra
    Given login as staff
    Then select ultra view module
    Then click plusicon
    Then select content market
    And select turnitin LTI
    Then turnitin assignment setup screen is displayed
    Then enter ultra assignement title
    And enter ultra assignment instruction
    And enter ultra maxpoints "<points>"
    And enter current date and time in feedback release date
    And click Optional settings Ultra
    Then optional settings are displayed
    And select "<submitto>" from submit paper to dropdown
    And select "<filetype>" for Allow submission of any file type
    And select "<latesubmission>" for Allow late submission
    Then select "<anonymous>" enable anonymous marking
    Then select "<studentrepository>" for Student paper repository
    Then select "<institutionrepository>" for Institution paper repository
    Then select "<websitecontent>" for Current and archived internet
    Then select "<journals>" for Periodicals, journals, & publications
    And select "<similarityreport>" generate similarlity report for submission
    Then select "<studentviewreport>" allow student to see Similarity Reports
    And select "<bibliographic>" to exclude bibliographic
    And select "<quotedmaterial>"  exclude quoted materials
    And select "<smallsources>" for exclude small sources "<source>" and "<count>"
    And verify save settings checkbox is displayed
    Then click submit ultra
    Then content page is displayed
    And turnitin assignment is added to content area
    And turnitin assignment insruction is displayed
    Then click x icon on module window
    And close browser

    Examples: 
      | points | submitto | filetype | latesubmission | anonymous | studentrepository | institutionrepository | websitecontent | journal | similarityreport | studentviewreport | bibliographic | quotedmaterial | smallsources | source | count |
      |    100 |        0 | any      | check          | uncheck   | uncheck           | check                 | check          | check   |                1 | check             | check         | check          | check        | words  |    10 |

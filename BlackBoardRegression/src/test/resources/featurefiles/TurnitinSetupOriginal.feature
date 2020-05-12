Feature: TurinitinAssignmentOriginal

  @OriginalTIIsetup @OriginalTIIComplete @FullblownRegression
  Scenario Outline: TurnitinAssingmentSetup-Original
    Given login as staff
    Then select origial view module
    Then click turnitin link
    Then select assessments
    And select turnitin assignment
    Then select paper assignment radio button
    And select next step button
    Then enter assignment "<title>" title
    Then provide points "<value>"
    And select optional settings
    And select Allow only file types that Turnitin can check for similarity radio button
    Then enter "<instruction>"
    And select "<afterduedate>" for allow submission after due date
    And select "<similarity>" for generate similarlity report for submission
    And select "<when>" for when to generate similarlity report for submission
    And select "<bibliographic>" for exclude bibliographic materials
    And select "<exclude>" for exclude quoted materials from Similarity Index for all papers in the assignment
    And select "<smallsource>" exclude small sources and select "<threshold>" plus "<thresholdvalue>"
    Then select "<visibility>" for allow student to see Similarity Reports
    Then select "<reveal>" for reveal grades to students only on post date
    Then select "<anonymous>" for enable anonymous marking
    Then select "<sumittodropdown>" repository for submit papers to
    Then select "<studentpaper>" search option checkbox Student paper repository
    Then select "<instpaper>" search option checkbox Institution paper repository
    Then select "<currentarchived>" search option checkbox Current and archived internet
    Then select "<periodicalsjournalspublication>" search option checkbox Periodicals, journals, & publications
    Then select "<rubrics>" from rubric
    And select "<savedefault>" checkbox would you like to save these options as your defaults for future assignments
    Then click submit button
    Then click ok

    Examples: 
      | title          | value | instruction               | afterduedate | similarity | when | bibliographic | exclude | smallsource | threshold | thresholdvalue | visibility | reveal | anonymous | sumittodropdown | studentpaper | instpaper | Currentarchived | periodicalsjournalspublications | rubrics            | savedefault |
      | automationtest |   100 | TestAutomation Assignment | no           | no         |    0 | yes           | no      | yes         | words     |            100 | yes        | yes    | no        |               0 | check        | check     | check           | uncheck                         | TELtestGradingform | uncheck     |

@OriginalTIIComplete @FullblownRegression
  Scenario Outline: TurnitinAssignmentStudentSubmission-Original
  Given login as student
  Then select origial view module
  And click turnitin link
  Then click Turnitinassignment to launch
  Then select <fileortext> from dropddown
  
  Examples:
  |fileortext|
  |file|
  

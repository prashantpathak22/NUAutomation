Feature: Panopto LTI
#Upload Video file to Panopto folder to add video link to Blackboard course content.

@BlackboardRegression @PanoptoComplete @PanoptoStaff @Panoptoplacements
Scenario: Instructor - verify Panopto placements
Given login as staff
 Then select ultra view module
 Then click on view reading lists and institution tools
 And plus icon with Panopto link is displayed
 And Panopto - add yourself to panopto link is displayed
 Then click x icon books and tools
 Then click plusicon
 Then select content market
 Then Panopto insert video link is displayed
 And Panopto- add yourself to Panopto link is displayed
 And plus icon with Panopto add yourself to panopto is displayed
 And click x icon on teaching tools
 Then click plusicon
 And select create from the + icon list on Blackboard content page
 Then blackboard create item pane is displayed
 Then select document from blackboard create item pane
 Then blackboard create document pane is launched
 Then click on add content button
 Then textbox to add content is displayed
 Then select + icon on add content for document
 And select insert/ edit LTI item
 Then teaching tools screen is launched
 Then Panopto insert video link is displayed on teaching tools deep linking
 And Panopto- add yourself to panopto should not be displayed
 Then click x icon on teaching tools
 And click x icon on create document screen
 Then click x icon on module window
 And close browser 
 
 @BlackboardRegression @PanoptoComplete  @Panoptoplacements
Scenario: Student - verify Panopto placements
 Given login as student 
 Then select ultra view module
 Then click on view reading lists and institution tools
 And plus icon with panopto link is not displayed
 And Panopto - add yourself to panopto link is displayed
 Then click x icon books and tools
 Then click x icon on module window
 And close browser

@BlackboardRegression @PanoptoComplete @PanoptoStaff 
Scenario: Instructor - add Panopto video link to content area
Given login as staff
 Then select ultra view module
 Then click plusicon
 Then select content market
 Then select add Panopto video link
 Then verify Panopto LTI screen is displayed with module folder selected
 And click upload tab
 Then file selection or drag and drop location is displayed
 And click record tab
 Then enter recording name field is displayed
 Then click choose tab
 Then select a video to insert 
 And click insert button
 Then content page is displayed
 Then verify panopto video link is added to blackboard
 Then click x icon on module window
 And close browser 
 
 
 
@BlackboardRegression @PanoptoComplete 
Scenario: Student - access Panopto video link
Given login as student
Then select ultra view module
Then verify panopto video link is added to student course content
Then click panpto video link
Then panopto video is launched verify video title on panopto
Then verify play icon is displayed and enabled
And click play icon on panopto video
Then click x icon on LTI screen
Then click x icon on module window
 And close browser







@BlackboardRegression @PanoptoComplete @PanoptoStaff
Scenario: Instructor - add Panopto folder to content area
Given login as staff
 Then select ultra view module
 Then click plusicon
 Then select content market
 And Panopto- add yourself to Panopto link is displayed
 Then select + icon on add yourself to Panopto
 Then verify Panopto folder link is added to content area
 Then click on ellipses button
 And select edit to edit added panopto link
 Then edit pane is displayed
 Then enter updated title for panopto folder
 And make panopto folder link visible to students
 Then save the changes
 And verify updated panopto folder name is displayed on content area
 And verify panopto folder visibility is visible to students
 Then click on modified panopto folder link
 Then verify panopto lti screen is launched
 And verify correct module name is displayed and selected on Panopto
 Then click create button on Panopto
 And select upload media option
 Then upload media screen is displayed
 And verify correct module is selected in dropdown
 And click x icon on upload media screen
 Then click x icon on lti window from teaching tool
 Then click x icon on module window
 And close browser
 
 
 
@BlackboardRegression @PanoptoComplete 
Scenario: Student - access Panopto folder
Given login as student
Then select ultra view module
And verify updated panopto folder name is displayed on content area
 Then click on modified panopto folder link
 Then verify panopto lti screen is launched
 And verify correct module name is displayed and selected on Panopto
 Then click x icon on lti window from teaching tool
 Then click x icon on module window
 And close browser



@BlackboardRegression @PanoptoComplete @PanoptoStaff
Scenario: Instructor - add in-line Panopto video link to document
 Given login as staff
 Then select ultra view module
 Then click plusicon
 And select create from the + icon list on Blackboard content page
 Then blackboard create item pane is displayed
 Then select document from blackboard create item pane
 Then blackboard create document pane is launched
 Then enter blackboard document name
 Then click on add content button
 Then textbox to add content is displayed
 Then select + icon on add content for document
 And select insert/ edit LTI item
 Then teaching tools screen is launched
 Then Panopto insert video link is displayed on teaching tools deep linking
 Then select add Panopto video link
 Then verify Panopto LTI screen is displayed with module folder selected
 Then click choose tab
 Then select a video to insert 
 And click insert button
 Then verify video title on insert lti item display name
 Then click insert button on blackboard
 Then select save button on blackboard document
 Then verify panopto video link title on blackboard document and click play icon
 And update visibility on blackboard document
 And click x icon on create document screen
 Then content page is displayed
 Then verify document added to course content area
 And verify document is visible to students
 Then click x icon on module window
 And close browser

@BlackboardRegression @PanoptoComplete 
Scenario: Student - access in-line Panopto video link on document
Given login as student
Then select ultra view module
 Then verify document added to course content area
 And click on blackboard document
 Then verify panopto video link title on blackboard document and click play icon
  And click x icon on create document screen
  Then click x icon on module window
 And close browser

@!PanoptoComplete  @Panoptoassignment
Scenario: Student - Upload submission to assignment folder





@!PanoptoComplete @!PanoptoStaff @Panoptoassignment
Scenario: Instructor - create assignment folder



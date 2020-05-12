package stepdefinition;

import java.awt.AWTException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.BaseClass;
import pages.PanoptoStaff;

public class PanoptoStaffSteps extends BaseClass{
	
	
	PanoptoStaff panoptostaff= new PanoptoStaff();
	
// Panopto Placements - Staff
	@And ("Panopto - add yourself to panopto link is displayed")
	public void panoptoaddyourselflinkbooksandtools() {
		panoptostaff.verifypanoptolinkbooksandtools();
	}
	@And ("plus icon with Panopto link is displayed")
	public void panoptoaddyourselfplusiconbooksandtools() {
		panoptostaff.verifypanoptolinkplusiconbooksandtools();
	}
	@Then ("Panopto insert video link is displayed")
	public void panoptoinsertvideocontentmarket() {
		panoptostaff.verifypanoptoaddvideolinkteachingtools();
	}
	@And ("Panopto- add yourself to Panopto link is displayed")
	public void panoptoaddyourselfcontentmarket() {
		panoptostaff.verifypanoptoaddyourselftopanoptoltilinkteachingtools();
	}
	@And ("plus icon with Panopto add yourself to panopto is displayed")
	public void panoptoaddyourselfplusiconcontentmarket() {
		panoptostaff.verifypanoptoaddyourselftopanoptoplusiconteachingtools();
	}
	@And("select create from the + icon list on Blackboard content page")
	public void createoptionfromplusiconlist() {
		panoptostaff.bbclickcreate();
	}
	@Then ("blackboard create item pane is displayed")
	public void createbbitempane() {
		panoptostaff.bbcreateitempane();
	}
	@Then ("select document from blackboard create item pane")
	public void bbdocumentselect() {
		panoptostaff.bbcreateitemdocumentlink();
	}
	@Then ("blackboard create document pane is launched")
	public void bbcreatedocumentscreen() {
		panoptostaff.bbcreatenewdocumentpage();
	}
	@Then ("click on add content button")
	public void bbdocumentaddconentbutton() {
		panoptostaff.bbcreatedocumentaddcontentbutton();
	}
	@Then("textbox to add content is displayed")
	public void bbdocumentaddcontenttextbox() {
		panoptostaff.bbcreatedocumentaddcontenttextbox();
	}
	@Then ("select + icon on add content for document")
	public void bbdocumentplusicon() {
		panoptostaff.bbcreatedocumentinsertcontentbutton();
	}
		@And ("select insert/ edit LTI item")
	public void bbdocumentinsertLTIitem() {
		panoptostaff.bbcreatedocumentinsertltiitem();
	}
	@Then ("teaching tools screen is launched")
	public void bbdocumentcontentmarket() {
		panoptostaff.teachingtoolslaunch();
	}
	@Then ("Panopto insert video link is displayed on teaching tools deep linking")
	public void bbdocumentpanoptoinsertvideolink() {
		panoptostaff.bbdeeplinkingteachingtoolspanoptoinsertvideolink();
	}
	@And ("Panopto- add yourself to panopto should not be displayed")
	public void bbdocumentpanoptoaddyourselfnotdisplayed() {
		panoptostaff.bbdeeplinkingteachingtoolsaddyourselfnotdisplayed();
	}
	@And ("click x icon on create document screen")
	public void bbdocumentxicon() {
		panoptostaff.bbclosecreatedocumentscreen();
	}
	
//Panopto - Add yourself to panopto or add panopto folder to content area
	
	@Then("select + icon on add yourself to Panopto")
	public void panoptoplusiconcontentmarket() {
		panoptostaff.panoptoplusiconaddyourselfpanoptoteachingtools();
	}
	@Then ("verify Panopto folder link is added to content area")
	public void verifypanoptofolderlinkaddedtocontentarea() {
		panoptostaff.verifypanoptofolderoncontentarea();
	}
	@Then ("click on ellipses button")
	public void bbcontentareaellipsesbutton() {
		panoptostaff.panoptofolderclickellipsescontentarea();
	}
	@And ("select edit to edit added panopto link")
	public void bbcontentareaedititem() {
		panoptostaff.panoptofoldereditcontentarea();
	}
	@Then ("edit pane is displayed")
	public void bbcontentareaitemeditpane() {
		panoptostaff.verifypanoptofoldereditpane();
	}
	@Then ("enter updated title for panopto folder")
	public void bbupdatepanoptofolderlinktitle() {
		panoptostaff.editpanoptofoldertitleoncontentarea();
	}
	@And ("make panopto folder link visible to students")
	public void bbpanoptofoldervisibletostudents() {
		panoptostaff.panoptofoldermakevisibiletostudents();
	}
	@Then ("save the changes")
	public void bbsaveedit() {
		panoptostaff.panoptofoldereditsavebutton();
	}
	@And ("verify updated panopto folder name is displayed on content area")
	public void verifyupdatednameoncontentarea() {
		panoptostaff.panoptoverifyupdatedtitleoncontentarea();
	}
	@And ("verify panopto folder visibility is visible to students")
	public void panoptovisibilitypostedit() {
		panoptostaff.panoptovisiblitypostedit();
	}
	@Then("click on modified panopto folder link")
	public void clickpanoptofolderlink() {
		panoptostaff.panoptofoldercontentareaclick();
	}
	
	@Then ("verify panopto lti screen is launched")
	public void panoptoltilaunch() {
		panoptostaff.panoptoltilaunch();
		
	}
	
	@And ("verify correct module name is displayed and selected on Panopto")
	public void panoptohomemodulename() {
		panoptostaff.modulenameonpanoptolti();
	}
	
	@Then ("click create button on Panopto")
	public void panoptohomecreate() {
		panoptostaff.clickcreatepanopto();
	}
	
	@And ("select upload media option")
	public void panoptouploadmediaoption() {
		panoptostaff.clickuploadmediapanopto();
	}
	
	@Then ("upload media screen is displayed")
	public void panoptouploadmediascreen() {
		panoptostaff.uploadcontentareapanopto();
	}
	
	@And ("verify correct module is selected in dropdown")
	public void panoptoverifymodule() {
		panoptostaff.clickfolderlistuploadmedia();
		panoptostaff.modulefoldernameonpanopto();
	}
	
	@And ("click x icon on upload media screen")
	public void panoptoxiconuploadmedia() {
		panoptostaff.closeuploadmediascreen();
	}


// Panopto - Insert video
	@Then ("select add Panopto video link")
	public void clickpanptoinsertvideolink() {
		panoptostaff.clickpanoptoinsertvideo();
	}
	
	@Then ("verify Panopto LTI screen is displayed with module folder selected")
	public void verifypanoptoltiscreen() {
		panoptostaff.modulefolderonpanoptoinsertvideolink();
	}
	
	@And ("click upload tab")
	public void clickuploadtabonpanopto() {
		panoptostaff.clickuploadtab();
	}
	
	@Then ("file selection or drag and drop location is displayed")
	public void uploadtabdragndrop() {
		panoptostaff.uploadtabdragdrop();
	}
	 
	@And ("click record tab")
	public void clickrecordtabonpanopto() {
		panoptostaff.clickrecordtab();
	}
	
	@Then ("enter recording name field is displayed")
	public void recordingnamefield() {
		panoptostaff.recordentername();
	}
	
	@Then ("click choose tab")
	public void clickchoosetab() {
		panoptostaff.clickchoosetab();
	}
		
	@Then ("select a video to insert")
	public void addpanoptovideolinkandverify() {
		panoptostaff.verifyvideoavailabilitytoadd();
		
		
	}
	
	@And ("click insert button")
	public void clickinsertbuttononpanopto() {
		panoptostaff.panoptoclickinsertbutton();
	}
	
	@And("verify panopto video link is added to blackboard")
	public void verifyvideolinkonbb() throws Exception {
		Thread.sleep(5000);
		panoptostaff.verifyvideolinkonBlackboard();
	}
	
/*
 * 
 * Panopto- Add in-line video to Blackboard document	
 */

//Add panopto inline video to blackboard document
	@Then ("enter blackboard document name")
	public void panoptobbdocumenttitle() {
		panoptostaff.bbdocumenttitle();
	}
	
	@Then ("select save button on blackboard document")
	public void savebuttonbbdocument() throws Exception {
		Thread.sleep(5000);
		panoptostaff.savebuttonbbdocument();
	}
	
	 @Then ("verify video title on insert lti item display name")
	 public void verifytitleasdisplayname() {
		 panoptostaff.verifyvideotitleoninsertltipopup();
	 }
	 @Then ("click insert button on blackboard")
	 public void clickinsertonpopup() {
		 panoptostaff.clickinsertltiitembb();
	 }
	
	@Then ("verify panopto video link title on blackboard document and click play icon")
	public void panoptovideolinkbbdocument() throws Exception {
		Thread.sleep(5000);
		panoptostaff.verifyvideotitleondocument();
	}
	@And ("update visibility on blackboard document")
	public void bbdocumentvisibility() {
		panoptostaff.bbdocumentvisibility();
	}
	
	@Then ("verify document added to course content area")
	public void bbdocumentaddedcoursecontent() {
		panoptostaff.verifybbdocumentaddedtocoursecontent();
	}
	
	 @And ("verify document is visible to students")
	 public void documentvisibilitycoursecontent() {
		 panoptostaff.verifydocumentvisibility();
	 }
	
	
	
	

}

	
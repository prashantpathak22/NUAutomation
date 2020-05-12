package stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.BaseClass;
import pages.TurnitinSubmissionUltra;



public class TurnitinSubmissionUltraSteps extends BaseClass{

	public TurnitinSubmissionUltra ultrasubmission = new TurnitinSubmissionUltra();
	
	//Step definition

	
	@Then("click on Turnitin assignment to submit")
	public void selectassignment() {
		ultrasubmission.clickassignment();
	}
	
	@Then("click on launch button")
	public void click_on_launch_button() {
		ultrasubmission.clicklaunch();
	    
	}
	
	@Then("verify assignment title on turnitin")
	public void verifyassignmentitleontii() {
		ultrasubmission.verifyassignmenttitleontii();
		
	}
	
	@Then ("click information icon")
	public void infoicon() {
		ultrasubmission.clickassignmentinfo();
		
	}
	
	@Then("information pane is opened")
	public void verifyassignmentinfomaxpoints() {
		ultrasubmission.verifyassignmentinfolaunch();
	}
	
   	@And ("click summary tab")
   	public void summarytab() {
   		ultrasubmission.clicksummary();
   	}
   	
   	@Then("summary pane is opended")
   	public void verifysummarypanelaunch() {
   		ultrasubmission.summarypanelaunch();
   		
   		
   	}
   	
   	@And ("verify assignment title on summary screen")
   	public void verifyassignmenttileonsummarypane() {
   		ultrasubmission.verifyassignmenttitleonsummarypane();
   		
   	}
   	
   	@And ("verify staff entered instructions are displayed")
   	public void verifyinstructionsonturnitinstudent() {
   		ultrasubmission.verifyassignmentinstructiononsummarypane();
   		
   	}
   	
   	@Then ("click assignment dashboard")
   	public void assignmentdashboard() {
   		ultrasubmission.clickassignmentdashboard();
   		
   	}
   	
   	@Then("assignment dashboard is displayed")
   	public void assingmnetdashboardlaunch() {
   		ultrasubmission.verifyassignmentdashboard();
   		
   	}
   	
	@Then("click upload submission button")
	public void click_upload_submission_button() {
		ultrasubmission.uploadcheck();
	    
	}
/*
 * 
 * Turnitin assignment submission- Text
 */
	
	@Then("select text input tab")
	public void select_upload_submission_tab() {
		ultrasubmission.textinput();
	   
	}

	@Then("enter text submission title")
	public void enter_submission_title() {
	   ultrasubmission.textinputtitle();
	    
	}

	@Then("enter the text for submission")
	public void click_on_choose_file() {
	    ultrasubmission.textarea();
	   
	}

	@Then("click upload and review")
	public void select_the_file_to_upload() {
		ultrasubmission.textupload();
	}

	@Then("compare submission title")
	public void comparesubmissiontitle() {
	  ultrasubmission.comparetitle();
	   
	}
	
	@Then("launch preview")
	public void launchpreview() {
		ultrasubmission.launchpreview();
	}
	
	@Then ("upload preview is displayed")
	public void uploadpreview() {
		ultrasubmission.submissionpreview();
		
	}

	@Then("click close preview")
	public void click_close_preview() {
	   ultrasubmission.closepreview();
	   
	}

	@Then("click submit to turnitin")
	public void click_submit_to_turnitin() {
		ultrasubmission.textsubmittoTII();
		
	}
	
	@Then("successful submission message is displayed")
	public void submissionsuccess() {
		ultrasubmission.successfulsubmissionmessage();
		
	}
	
	@Then("validate assignment title after submission")
	public void verifysubmissiontitleaftersubmission() {
		ultrasubmission.verifyassingmnettitleaftersubmission();
		
	}
	 
	
/*
 * 
 * Turnitin assignment submission - File Upload
 */
	
	
	
	
	@Then("enter file upload assignment title")
	public void fileuploadtitle() {
		ultrasubmission.enterfilesubmissiontitle();
		
	}

	@And("click choose button")
	public void browsebutton() throws Exception {
		ultrasubmission.selectchoosebutton();
		
	}
	
	@Then("enter file location")
	public void filelocation() {
		ultrasubmission.copyfilelocationclipboard();
		
	}
	
	@And("select a file to upload")
	public void selectfiletoupload() throws AWTException, Exception {
		//ultrasubmission.enterfileuploadfilelocation();
		ultrasubmission.selectafiletopupload();
		
	}
	
	@Then("select open button")
	public void selectopenbutton() {
		//BaseClass.screenshot("TII-Student Submission-File Upload- Select file");
	}
	
	@And ("file name is displayed")
	public void filename() {
		ultrasubmission.filenameisdisplayed();
		
	}
	
	@Then("upload and review button is enabled")
	public void uploadandreviewbuttonenabled() {
		ultrasubmission.filesubmituploadandreviewbutton();
		
	}
	
	@And("click upload and review file upload")
	public void clickuploadandreviewfileupload() {
		ultrasubmission.clickuploadandreviewbuttonfileupload();
		
	}
		
	@And("compare file upload submission title")
	public void verifyfileuploadsubmissiontitle() {
		ultrasubmission.comparefileuploadsubmissiontitle();
		
	}
	
	@Then("validate assignment title after submission- file upload")
	public void fileuploadverifytitleaftersubmission() {
		ultrasubmission.fileuploadverifytitleaftersubmission();
		
	}
	
	
/*
 * 
 *  Turnitin Assignment submission - Dropbox 
 */
	
	@Then("click cloud submission")
	public void clickcloudsubmission() {
		ultrasubmission.clickcloudsubmission();
		
	}
	
	@Then("select dropbox option")
	public void selectdropbox() {
		ultrasubmission.selectdropbox();
		
	}
	
	@Then("dropbox screen is launched")
	public void validatedropboxlaunch() {
		ultrasubmission.verifydropboxlaunch();
	
	}
	
	@Then("enter dropbox login email")
	public void enterdropboxemail() {
		ultrasubmission.enterdropboxloginemail();
	
	}
	
	@And("enter dropbox login password")
	public void enterdropboxpassword() {
		ultrasubmission.enterdropboxpassword();
	
	}
	
	@And ("uncheck remember me checkbox")
	public void uncheckrememberme() {
		ultrasubmission.dropboxremembermecheckbox();
	
	}
	
	@Then ("click dropbox signin button")
	public void dropboxsigninbutton() {
		ultrasubmission.dropboxsigninbutton();
	
	}
	
	@Then ("dropbox login successful")
	public void verifydropboxlogin() {
		ultrasubmission.verifydropboxlogin();
	
	}
	
	@Then ("search for file to upload")
	public void dropboxsearchfiletoupload() {
		ultrasubmission.dropboxsearchfiletoupload();
	
	}
	
	@And("select file to upload")
	public void dropboxselectfiletoupload() throws Exception {
		ultrasubmission.dropboxselectfiletoupload();
	
	}
	
	@Then ("click choose button on dropbox")
	public void dropboxchoosebutton() throws Exception {
		ultrasubmission.dropboxchoosebutton();
	
	}
	
	@Then ("verify dropbox submission title")
	public void dropboxsubmissiontitle() {
		//driver.switchTo().frame("upload-modal-iframe");
		ultrasubmission.dropboxverifytitle();
	
	}
	
	@Then ("verify dropbox submission title after submission")
	public void verifydropboxsubmissiontitleaftersubmission() {
		ultrasubmission.dropboxverifytitleaftersubmission();
	}
	
	
	
}

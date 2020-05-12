package stepdefinition;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.By;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pages.BaseClass;
import pages.TurnitinSetupOriginal;




public class TurnitinSetupOriginalSteps extends BaseClass {
	
	
	public Exception e;


	
	public TurnitinSetupOriginal tiisetuporg = new TurnitinSetupOriginal();



	
	
/*
 * Scenario TurnitinAssignmentSetup
 * Created by: Prashant Pathak
 * Date - 08/04/2019
 */
	
	
//	@Given("^login as staff$")
//	public void loginasstaff() throws Exception  
//	{
//		BaseClass.initialisation();
//		BaseClass.stafflogin();
//	}
//	
//	@Given("^login as student$")
//	public void loginasstudent() throws Exception {
//		BaseClass.initialisation();
//		BaseClass.studentlogin();
//	}
//	@Given("login as student2")
//	public void loginasstudent2() throws Exception {
//		BaseClass.initialisation();
//		BaseClass.studentlogin2();
//		
//	}
//	@Given("login as student3")
//	public void loginasstudent3() throws Exception {
//		BaseClass.initialisation();
//		BaseClass.studentlogin3();
//		
//	}
	
	@Then("^select origial view module$")
	public void click_orgmodule() throws IOException, AWTException 
	{
		tiisetuporg= new TurnitinSetupOriginal();
		
		tiisetuporg.coursesearch(BaseClass.prop.getProperty("coursenameoriginal"));
		highlighter(tiisetuporg.originalmodule);
		screenshot("Originalmodule");
		tiisetuporg.launchOriginalModule();
	}
	@Then("^click turnitin link$")
	public void clickturnitin() 
	{
			
		driver.switchTo().frame("classic-learn-iframe");
		tiisetuporg.clickTurnitinlink();
	}
	
	@Then("^select assessments$")
	public void SelectAssessments(){
		BaseClass.highlighter(tiisetuporg.assessmentslink);
		tiisetuporg.clickAssessments();
		
	}
	@Then("^select turnitin assignment$")
	public void SelectTurnitinAssignment(){
		BaseClass.highlighter(tiisetuporg.clickTurnitinAssignment);
		BaseClass.screenshot("TIIlink");
		tiisetuporg.clickTurnitinAssignment();
		
	}
	@Then("^select paper assignment radio button$")
	public void SelectPaperAssignmentRadioButton(){
		driver.switchTo().frame("basic_iframe");
		tiisetuporg.selectPaperassignment();
		
	}
	@And("^select next step button$")
	public void SelectNextStepButton() throws AWTException{
		BaseClass.scrolltobottom();
		tiisetuporg.clicknext();
		BaseClass.screenshot("TIILaunch");
	}
	@Then ("^enter assignment \"(.*)\" title$")
	public void EnterAssignementtitle(String x){
	
		tiisetuporg.enterassignmenttitle(x);
	}
	@Then("^provide points \"(.*)\"$")
	public void EnterpointValue(int x){
		tiisetuporg.entermaxpoints(x);
	}
	@Then("select Allow only file types that Turnitin can check for similarity radio button")
	public void SelectAllowOnlyFileTypes(){
		tiisetuporg.onlyallowedfiletype();
		BaseClass.screenshot("AssignmentTitlescreen");
	}
	@Then("select optional settings")
	public void SelectOptionalSettings(){
		tiisetuporg.cickOptionalsettings();
	}
	@Then("enter \"(.*)\"")
	public void Enterinstruction(String instr){
		tiisetuporg.enterinstruction(instr);
	}
	@Then("select \"(.*)\" for allow submission after due date")
	public void SelectionForAllowSubmissionAfterDueDate(String x){
		 
		if (x.equalsIgnoreCase("yes"))
		{
			tiisetuporg.yeslatesubmission();
		}
		else if( x.equalsIgnoreCase("no")) {
			
			tiisetuporg.nolatesubmission();
		}
	}
	@Then("select \"(.*)\" for generate similarlity report for submission")
	public void SelectionforSimilarityReports(String x){
		if (x.equalsIgnoreCase("yes"))
		{
			tiisetuporg.yessimilarityreport();
		}
		else if( x.equalsIgnoreCase("no")) {
			
			tiisetuporg.nosimilarityreport();
		}
		else {
			System.out.println("Incorrect value in feature file examples ");
		}
	}
		@Then("select \"(.*)\" for when to generate similarlity report for submission")
		public void WhentoGenerateSimilarlityReport(int x){
			tiisetuporg.similarityreportdropdown(x);
			BaseClass.screenshot("optionalsettings1");
		}
		
		@Then("select \"(.*)\" for exclude bibliographic materials")
		public void ExcludeBibliographicMaterials(String y){
			if( y.equalsIgnoreCase("yes")) {
				tiisetuporg.yesbibliographic();
			}
			else if(y.equalsIgnoreCase("no")) {
				tiisetuporg.nobibliographic();
			}
			else{
				System.out.println("Incorrect value in feature file examples ");
			}
		}
			@Then("select \"(.*)\" for exclude quoted materials from Similarity Index for all papers in the assignment")
			public void SelectionforExcludeQuotedMaterials(String x) {
				
			if(x.equalsIgnoreCase("yes")) {
					tiisetuporg.yesexclude();
				}
				else if(x.equalsIgnoreCase("no")) {
					tiisetuporg.noexclude();
				}
				else {
					System.out.println("Incorrect value in feature file examples");
				}
			}		
			@And("select \"(.*)\" exclude small sources and select \"(.*)\" plus \"(.*)\"")
			public void ExcludeSmallSources(String x ,String y, int z) {
				 if(x.equalsIgnoreCase("yes")) {
					 tiisetuporg.yessmallsource();
					 
					 if (y.equalsIgnoreCase("words")) {
						 tiisetuporg.selectwords();
						 
						 tiisetuporg.enterwordsvalue(z);
					 }
					 else if (y.equalsIgnoreCase("percentage")){
						 tiisetuporg.selectpercentage();
						 
						 tiisetuporg.enterpercentagevalue(z);
					 }
					 else {
						 System.out.println("Incorrect value in feature file");;
						 
					 }
					 
					}
				 else if (x.equalsIgnoreCase("no")) {
					 tiisetuporg.nosmallsource();
				 }
				 else {
					 System.out.println("Incorrect value in feature file examples");
				 }
			}
			@Then ("select \"(.*)\" for allow student to see Similarity Reports")
			public void studentsimilarityreportvisibility(String x) {
				if (x.equalsIgnoreCase("yes")) {
					tiisetuporg.yesseesimilarityreports();
				}
				else if (x.equalsIgnoreCase("no")) {
					tiisetuporg.noseesimilarityreports();
				}
				
			}
			@Then("select \"(.*)\" for reveal grades to students only on post date")
			public void RevealGradesToStudentsOnlyOnPostDate(String x){
				BaseClass.screenshot("optionalsettings2");
				if (x.equalsIgnoreCase("yes")) {
					tiisetuporg.yesrevealgrades();
				}
				else if (x.equalsIgnoreCase("no")) {
					tiisetuporg.norevealgrades();
				}
				
				
			}
			@Then("select \"(.*)\" for enable anonymous marking")
			public void EnableAnonymousMarking(String x){
				  if (x.equalsIgnoreCase("yes")) {
					  tiisetuporg.yesanonymousmarkig();
				  }
				  else if (x.equalsIgnoreCase("no")) {
					  tiisetuporg.noanonymousmarkig();
				  }
				 
			}
			@Then("select \"(.*)\" repository for submit papers to")
			public void SubmitPapersToRepository(int x){
				 tiisetuporg.submitpaperstodropdown(x);
			}
	//Search option checkboxes		
			@Then("select \"(.*)\" search option checkbox Student paper repository")
			public void CheckboxStudentPaperRepository(String x){
				tiisetuporg.studentpaperchbx(x);				
			}
			@Then("select \"(.*)\" search option checkbox Institution paper repository")
			public void CheckboxInstitutionPaperRepository(String x){
				 tiisetuporg.instpaperchbx(x);
			}
			@Then("select \"(.*)\" search option checkbox Current and archived internet")
			public void CheckboxCurrentAndArchivedInternet(String x){
				tiisetuporg.currentarchivedchbx(x);
			}
			@Then("select \"(.*)\" search option checkbox Periodicals, journals, & publications")
			public void CheckboxPeriodicalsJournalsPublications(String x){
				 tiisetuporg.publicationschbx(x);
				 BaseClass.screenshot("optionalsettings3");
			}
	//Rubrics
			@Then("select \"(.*)\" from rubric")
			public void selectRubric(String x){
				 tiisetuporg.rubricsdropdown(x);
				 
			}
			
			@Then("select \"(.*)\" checkbox would you like to save these options as your defaults for future assignments")
			public void saevdefaultsettingcheckbox(String x){
				tiisetuporg.savedefaultchbx(x);
				BaseClass.screenshot("optionalsettings4");
			}
			
			@Then("click submit button")
			public void thenClickSubmitButton(){
			tiisetuporg.submitbuttonclick();
			
			}@Then("click ok")
			public void thenClickOk() throws Exception{
				
				Thread.sleep(5000);
				BaseClass.screenshot("AssignmentSuccess");
				String x = tiisetuporg.successmessage.getText();
				if(x.contains("Turnitin Assignment successfully added")) {
				//Assert.assertTrue("Turnitin Assignment creation successful", true);
				
				tiisetuporg.okbutton.click();
				
			}

			
			}
			
			
}







	





	

	
	
	


	


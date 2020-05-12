package stepdefinition;

import java.awt.AWTException;

import org.junit.Assert;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.java.en.Then;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import pages.BaseClass;
import pages.TurnitinSetupUltra;


public class TurnitinSetupUltraSteps extends BaseClass {

	
	public TurnitinSetupUltra ultrasetup =new TurnitinSetupUltra();
	
	
	
	





	
//Step Definitions
	
	@Then("select ultra view module")
	public void ultramodule() throws InterruptedException {
		ultrasetup.clickmodulesandprogrammes();
		ultrasetup.coursesearch(BaseClass.prop.getProperty("coursenameultra"));
		ultrasetup.launchultramodule();
		
	}
	
	@Then ("click plusicon")
	public void clickplus() {
		
		ultrasetup.clickplus();
	}
	
	@Then ("select content market")
	public void selectcontentmarker() {
		ultrasetup.clickcontentmarket();
	}
	
	@ And ("select turnitin LTI")
	public void turnitinlti() {
		ultrasetup.clickturnitinlti();
	}
	
	@Then("turnitin assignment setup screen is displayed")
	public void turnitinsetupscreen() {
		//Switch to Turnitin LTI frame
		
		ultrasetup.verifytiilaunch();
	}
	
	@Then ("enter ultra assignement title")
	public void ultraassignmenttitle() {
		ultrasetup.enterassignmenttitle();
	}
	
	@And("enter ultra assignment instruction")
	public void ultraassignmentinstructions() {
		ultrasetup.enterinstructions();
	}
	
	@And ("enter ultra maxpoints \"(.*)\"")
	public void ultramaxpoints(int x) {
	   ultrasetup.entermaxpoints(x);
	}
		
	@And("enter current date and time in feedback release date")
	public void updatefeedbackreleasedate() throws AWTException {
		ultrasetup.updatefeedbackreleasedatetocurrent();
	}
	
	@And ("click Optional settings Ultra")
	public void optionalsetingsultra(){
		ultrasetup.clickoptionalsettings();
	}
	
	@Then("optional settings are displayed")
	public void optionalsettingsview() {
		ultrasetup.verifyoptionalsettingspanelaunch();
		
	}
	
	@And("select \"(.*)\" from submit paper to dropdown")
	public void submitpaperto(int x) {
		ultrasetup.submitpaperto(x);
			
	}
	
	@And ("select \"(.*)\" for Allow submission of any file type")
	public void submissionfiletype(String x) {
		ultrasetup.anyfiletype(x);
	}
	@And("select \"(.*)\" for Allow late submission")
	public void latesubmission(String x) {
		ultrasetup.latesubmission(x);
		
	}
	@Then ("select \"(.*)\" enable anonymous marking")
	public void anonymousmarking(String x) {
		ultrasetup.anonumousmarking(x);
	}
	@Then ("select \"(.*)\" for Student paper repository")
	public void studentpaperrepository(String x) {
		ultrasetup.studentpaperrepository(x);
	}
	@Then("select \"(.*)\" for Institution paper repository")
	public void institutionrepository(String x) {
		
		ultrasetup.instpaperrepository(x);
	}
	@ Then ("select \"(.*)\" for Current and archived internet")
	public void archivedinternet(String x) {
		ultrasetup.websitecontent(x);
		
		
	}
	@Then("select \"(.*)\" for Periodicals, journals, & publications")
	public void journals(String x) {
		ultrasetup.journals(x);
	}
	@And ("select \"(.*)\" generate similarlity report for submission")
	public void similarityreport(int x){
		ultrasetup.similarityreportdrpdwn(x);
	}
	@Then("select \"(.*)\" allow student to see Similarity Reports")
	public void allowstudenttoviewsimilarityreport(String x) {
		ultrasetup.allowtoviewsimilarityreport(x);
	}
	@And("select \"(.*)\" to exclude bibliographic")
	public void bibliographicultra(String x) {
		ultrasetup.excludebibliographicultra(x);
	}
	@And ("select \"(.*)\"  exclude quoted materials")
	public void excludequotedultra(String x) {
		ultrasetup.excludequoted(x);
	}
	@And ("select \"(.*)\" for exclude small sources \"(.*)\" and \"(.*)\"")
	public void smallsourcesultra(String x, String y, int z) {
		ultrasetup.excludesmallsource(x, y, z);
		
	}
	@And ("verify save settings checkbox is displayed")
	public void savesettingscheckbox() {
		
	}
	@And("click submit ultra")
	public void submitultra() {
		ultrasetup.submit();
	}
	
	@Then ("content page is displayed")
	public void contentpage() {
		driver.switchTo().defaultContent();		
		ultrasetup.contentheader();
	}
	
	@And("turnitin assignment is added to content area")
	public void turnitinassignmentincontentarea() throws Exception  {
		ultrasetup.tiititlecomparefromcontentarea();
		
	}
	@And("turnitin assignment insruction is displayed")
	public void verifyinstructiononblackboardccoursecontent() {
		ultrasetup.verifyinstructiononblackboardcoursecontent();
	}
	@And("click x icon on module window")
	public void closemodulewindow() throws Exception {
		Thread.sleep(5000);
		ultrasetup.xicononmodule();
	}
	
}

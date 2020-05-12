package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.BaseClass;
import pages.PanoptoStudent;

public class PanoptoStudentSteps extends BaseClass {

	
	PanoptoStudent panoptostudent= new PanoptoStudent();
	
	
	
	@And ("plus icon with panopto link is not displayed")
	public void noplusiconpanoptolinkstudent() {
		panoptostudent.noplusiconpanoptostudentsbooksandtools();
		
		
	}
	
	
/*
 * 
 * Panopto Video link
 */
	
//Verify Panopto video link is added to course content area
	@And ("verify panopto video link is added to student course content")
	public void verifypanoptovideolinkstudent() {
		panoptostudent.verifyvideolinkcontentareastudent();
	}
	
	@Then ("click panpto video link")
	public void clickpanoptovideolinkstudent() {
		panoptostudent.clickpanoptovideolinkstudent();
	}
	
	@Then ("panopto video is launched verify video title on panopto")
	public void verifyvideotitle() {
		panoptostudent.videotitleonpanoptostudent();
	}
	
	@Then ("verify play icon is displayed and enabled")
	public void verifyplayicon() {
		panoptostudent.playiconstudent();
	}
	
	@And ("click play icon on panopto video")
	public void clickplayicon() {
		panoptostudent.clickplayicon();
	}
	
	@Then ("click x icon on LTI screen")
	public void xiconltiscreen() {
		panoptostudent.clickxiconltiscreen();
	}
	
/*
 * Panopto - Student accessing inline panopto video on Blackboard document
 * 
 * 
 */
	
//Click on blackboard document on course content area
	@And ("click on blackboard document")
	public void clickbbdocument() {
		panoptostudent.clickbbdocumentoncoursecontent();
	}
	
}

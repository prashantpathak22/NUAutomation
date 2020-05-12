package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.BaseClass;
import pages.TurnitinGradesandFeedback;

public class TurnitinGradesandFeedbackSteps extends BaseClass{
	

	public TurnitinGradesandFeedback tiigrades=new TurnitinGradesandFeedback();
	
	 @Then ("launch turnitin assignment inbox")
	 public void tiiassignmentinbox() {
		// tiigrades.selecttiiassignment();
	 }
	 @Then ("turnitin LTI screen is launched with assignment inbox")
	 public void verifyassignmentinbox() {
		 BaseClass.switchtoframe("lti-launch-iframe");
		// driver.switchTo().frame("lti-launch-iframe");
		 tiigrades.verifyassignmentinbox();
	 }
	  @Then ("search for individual student and grade submission")
	  public void searcforstudent() throws Exception {
		  tiigrades.searchstudentandgrade();
	  }
	    
	  @Then ("click on gradebook icon on content screen")
	  public void gradebookiconcontentscreen() {
		  tiigrades.clickgradebookicon();
	  }
	   @Then ("gradebook is launched")
	   public void verifygradebooklaunch() {
		   tiigrades.verifygradebooklaunch();
	   }
	   @Then ("click grid icon on gradebook")
	   public void gridicongradebook() {
		   tiigrades.clickgridicon();
	   }
	   @Then("gradebook grid view is loaded")
	   public void verifygridviewloading() {
		   tiigrades.verifygridviewloading();
		   
		   
	   }
	   @And ("search for assignment to grade")
	   public void searchforassignmenttograde() throws Exception {
		   tiigrades.searchassignment();
		   Thread.sleep(5000);
	   }
	   @Then ("select assingment from search result")
	   public void selectassignmentfromsearchresult() {
		   tiigrades.selectassignmentfromresult();
		   
	   }

	   @Then ("select individual student to verify grades from turnitin")
	   public void verifystudentgradesfromtii() {
		   tiigrades.searchandclickongrades();
		   
	   }
}

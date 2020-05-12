package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.BaseClass;
import pages.UniversityReadingListsStaff;
import org.junit.Assert;

public class UniversityReadingListsStaffSteps extends BaseClass {
	
	UniversityReadingListsStaff rlstaff = new UniversityReadingListsStaff();
	
	@Then("click on view reading lists and institution tools")
	public void click_on_view_reading_lists_and_institution_tools() {
		rlstaff.clickbooksandtoolslink();
	}

	
	@Then("validate reading list is displayed")
	public void validate_reading_list_is_displayed() {
		rlstaff.verifyreadinglistlink();
	}

	@Then("click x icon books and tools")
	public void click_x_icon_booksandtools() {
	    rlstaff.closebookandtools();
	}

	@Then("validate reading list icon is displayed")
	public void validate_reading_list_icon_is_displayed() {
		rlstaff.verifyreadinglistteachingtools();
	}

	@Then("click reading list icon")
	public void click_reading_list_icon() {
	   rlstaff.clickreadinglistteachingtools();
	}
	
	@Then("click reading list icon from course content area")
	public void clickreadinglistcoursecontent() {
		rlstaff.clickreadinglisticoncoursecontent();
	}
	
	@Then ("authenticate button is displayed")
	public void authenticatebutton() {
	//Switch driver to LTI frame
		
		
		rlstaff.verifyauthenticatebutton();
	}
	@Then("click on authenticate button")
	public void clickauthenticate() {
		rlstaff.clickauthenticatebutton();
		
	}
	@Then("library login screen is displayed")
	public void library_login_screen_is_displayed() {
	   rlstaff.verifylibraryloginscreen();
	}

	@Then("login to library with staff logon details")
	public void libraryloginasstaff() throws InterruptedException {
	   rlstaff.stafflibrarylogin();
	}

	@Then("user should be logged in and university reading list screen should be displayed")
	public void verifylibraryscreen() {
		rlstaff.verifylibraryscreen();
	    
	}
	@Then("click x icon on lti window from teaching tool")
	public void Xonlibraryscreen() {
		rlstaff.closelibraryltiscreen();
	}
   
	@And("click x icon on teaching tools")
	public void xiconteachingtools() {
		rlstaff.closeteachingtools();
	}
	@Then("click + icon on reading list  on Teaching tools")
	public void clickplusiconreadinglistteachingtools() {
	  rlstaff.plusiconreadinglistteachingtools();
	}

	@Then("library reading list should be added to content area")
	public void library_reading_list_should_be_added_to_content_area() {
		rlstaff.readinglistltilinkcontentarea();
	}

	@Then("update the visibility to visibile to students")
	public void makevisibiletostudents() {
	  rlstaff.clickvisibilitymenu();
	  rlstaff.selectvisibletostudents();
	}

	@Then("close browser")
	public void closebrowser() throws Exception {
	   Thread.sleep(5000);
	   BaseClass.afttermethod();
	}

// Student steps
	
	@Then ("click on reading list as student")
	public void studentclickreadinglist() {
		rlstaff.studentclickreadinglistlinkincontentarea();
	}

	@Then ("university reading list screen should be displayed to students")
	public void studenviewreadinglistlaunch() {
		
		rlstaff.verifyreadinglistscreenStudents();
	}
	@Then("click x icon on LTI window")
	public void xicononreadinglistscreen() {
		driver.switchTo().defaultContent();
		rlstaff.studentclosereadinglistwindow();
	}


}

package pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.platform.commons.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.model.Log;



public class TurnitinGradesandFeedback extends BaseClass {
	

	
//Initiate Elements
	public TurnitinGradesandFeedback() {
		
		PageFactory.initElements(driver, this);
		}

//Xpath or Locators

//Temporary assignment selection
	@FindBy(xpath="//a[@class=\"content-title\"]//child::span[text()='Grade Test 2']")
	public WebElement TIIassignment;
	
//Assignment inbox
	@FindBy(xpath="//a[@class=\"btn-link inbox-tab\"]")
	public WebElement TIIassigmentinbox;
	
//All rows in assingment submission table
	@FindBys({@FindBy(xpath="//table//tbody//tr")})
	public List<WebElement> tablesize;
	
//Search box
	@FindBy(xpath="//input[@id=\"filterbox\"]")
	public WebElement tiisearchbox;

// Assignment submission title 
	@FindBy(xpath="//table/tbody/tr[1]/td[@data-title=\"Submission Title\"]//child::span")
	public WebElement submissiontitlefield;
	
// Grade icon
	@FindBy(xpath="//table//tbody//tr[1]//td[7]")
	public WebElement gradeicon;
	
//Feedbackstudio name verification
	@FindBy(xpath="//h1/span[@class=\"author author-name\"]")
	public WebElement feedbackstudiostudentname;
	
//Grade entry
	@FindBy(xpath="//input[@type=\"text\"]")
	public WebElement feedbackstudiogradeentry;

//Grade availability
	@FindBy(xpath="//section[contains(@aria-label,\" out of 100 points\")]")
	public WebElement feedbackstudiogradeavailability;

//Feedback Summary
	@FindBy(xpath="//div[@role=\"button\" and @title=\"Feedback Summary\"]")
	public WebElement feedbacksummarybutton;
	
//feedback comments
	@FindBy(xpath="//div[contains(text(),'There is no text comment for this paper. Click here to leave a text comment.')]")
	public WebElement feedbackcomments;
	
//gradeverification
	@FindBy(xpath="//table//tbody//tr[1]//td[7]//child::span[2]")
	public WebElement gradeverificationonlist;
	
//Grade icon on content area
	@FindBy(xpath="//a[@title=\"Gradebook\"]")
	public WebElement gradebookicon;
	
//Gradebook launch verification
	@FindBy(xpath="//h1[@class=\"panel-title title-not-editable\"]//child::span")
	public WebElement gradebookpagetitle;
	
//Gradebook table
	@FindBy(xpath="//div[@class=\"grade-list-container\"]")
	public WebElement gradebooktable;

//Grid icon on gradebook
	@FindBy(xpath="(//div[@class=\"square-toggle\"])[2]//child::label[2]")
	public WebElement gridicongradebook;
	
//Grid view launch
	@FindBy(xpath="//div[@id=\"grade-grid-container\"]")
	public WebElement gridviewload;
	
//Search for assignment to grade
	@FindBy(xpath="//input[@name=\"typeaheadSearchBox\"]")
	public WebElement searchboxgradebook;

//Click search result opntion
	@FindBy(xpath="//div[@class=\"ellipse grade-title\"][1]")
	public WebElement assignmentsearchresult;

// Grade validation post grading on feedback studio
	@FindBy(xpath="//table//tbody//tr[1]//td[7]//child::a")
	public WebElement gradesontiiaftermarking;
	
// Fetching grades
	@FindBy(xpath="(//div[@class=\"score\" and contains(@aria-label,'testteam Student3')]//child::span)[1]")
	public WebElement gradebookstudentgrade;
	
	
	
/*
 * 
 * 
 * 
 */
	
// Methods or functions
	
	public void selecttiiassignment() {
		TIIassignment.click();
	}
	
//verify assignment inbox is displayed
	public void verifyassignmentinbox() {
		BaseClass.webdriverwaitclickable(TIIassigmentinbox);
		Assert.assertTrue("Assignment inbox is not loaded", TIIassigmentinbox.isDisplayed());
	}

//student search
	public void searchstudentandgrade() throws Exception {
		//int rowcount = tablesize.size();
		
//		ArrayList<String> staticstudentnamelist= new ArrayList<String>();
//		staticstudentnamelist.add("testteam Student2");
//		staticstudentnamelist.add("testteam Student3");
//		staticstudentnamelist.add("testteam Student4");
//		
		int studentnamearrysize=BaseClass.studentnamearray.length;
		//int studentlistsize= staticstudentnamelist.size();
//		System.out.println(studentlistsize);
//		System.out.println(staticstudentnamelist);
//		for(int i=1; i<rowcount; i++) {
//			
//			String studentname= driver.findElement(By.xpath("//table//tbody//tr[i]//td[2]//child::span")).getText();
			
			
		
		//for(int x=0; x<studentlistsize; x++) {
		for(int x=0; x<studentnamearrysize; x++) {
			//wait for gradeicon to be enabled
			BaseClass.webdriverwaitclickable(gradeicon);
			
			//Enter student name to search and load
			tiisearchbox.clear();
			tiisearchbox.sendKeys(BaseClass.studentnamearray[x]);
			
			// verify if submission is made for searched student
			if(!submissiontitlefield.getText().contains("Has not yet submitted")){
				//Verify when submission is made but is there any grade available on Turnitin screen
				BaseClass.screenshotv2("Assignment submission of " + BaseClass.studentnamearray[x], "Turnitin Grades");
				if(gradeverificationonlist.getText().contains("Open GradeMark in Feedback Studio"))
					{
					//If grades are vailable, print message and clear search field
					System.out.println("Assignment is already marked for " + BaseClass.studentnamearray[x]);
					BaseClass.screenshotv2("Assingment is already marked for " + BaseClass.studentnamearray[x], "Turnitin Grades");
					tiisearchbox.clear();
					}
				// If grades are not available, launch feedback studio and mark
				else 
					{
				
				BaseClass.parentwindowhandle=driver.getWindowHandle();
				BaseClass.webdriverwaitclickable(gradeicon);
				//Click grade icon to launch feedback studio
				gradeicon.click();
				BaseClass.windowhandle();
				driver.manage().window().maximize();
				// Verify Student name searched and student name on Feedback studio matches 
				BaseClass.screenshotv2("Feedbackstudio of " + BaseClass.studentnamearray[x] , "Turnitin Grades");
				Assert.assertTrue("Student name on feedback studio does not match for "+BaseClass.studentnamearray[x]+"", feedbackstudiostudentname.getText().equalsIgnoreCase(BaseClass.studentnamearray[x]));
				//Enter the grade as mentioned in properties file
				BaseClass.webdriverwaitclickable(feedbackstudiogradeentry);
				Thread.sleep(5000);
				feedbackstudiogradeentry.sendKeys(BaseClass.prop.getProperty("Grade"+x+""));
				
				BaseClass.screenshotv2("Grade assignment " + BaseClass.studentnamearray[x], "Turnitin Grades");
				
				//Click on feedback summary
				feedbacksummarybutton.click();
				//Click on feedback comments area
				Thread.sleep(5000);
				feedbackcomments.click();
				//	feedbackcomments.sendKeys("TestFeedback");
				Thread.sleep(5000);
				//Close feedback studio and clear search field
				driver.close();
				driver.switchTo().window(BaseClass.parentwindowhandle);
				BaseClass.switchtoframe("lti-launch-iframe");
				//driver.switchTo().frame("lti-launch-iframe");
				Thread.sleep(5000);
				tiisearchbox.clear();
				
				//Search for same student and verify the grades are displayed on Tii screen
				Thread.sleep(5000);
				tiisearchbox.sendKeys(BaseClass.studentnamearray[x]);
				Thread.sleep(10000);
				//System.out.println(gradesontiiaftermarking.getText());
				BaseClass.webdriverwaitvisible(gradesontiiaftermarking);
				Assert.assertTrue("Grades on Turnitin does not match with marked value on Feedback studio for "+BaseClass.studentnamearray[x]+"",gradesontiiaftermarking.getText().contains(BaseClass.prop.getProperty("Grade"+x+"")));
				}
				 				
			}
			else 
			{
				BaseClass.screenshotv2("Assignment is not submitted by " + BaseClass.studentnamearray[x], "Turnitin Grades");
				//if no submission is made for search student- print message and clear search field
				System.out.println("Assignment not submitted by " + BaseClass.studentnamearray[x]);
				tiisearchbox.clear();
			}
	
		}	
	}
	
// Click on Gradebook 
	public void clickgradebookicon() {
		BaseClass.webdriverwaitclickable(gradebookicon);
		BaseClass.highlighter(gradebookicon);
		gradebookicon.click();
	}
	
// Verify Gradebook launched completely
	public void verifygradebooklaunch() {
		BaseClass.webdriverwaitvisible(gradebooktable);
		BaseClass.highlighter(gradebookpagetitle);
		BaseClass.screenshotv2("Gradebook Launch", "Turnitin Grades");
			
	}
	
//Click Grid icon
	public void clickgridicon() {
		BaseClass.highlighter(gridicongradebook);
		gridicongradebook.click();
	}
	
//Verify grid view loaded successfully
	public void verifygridviewloading() {
		BaseClass.webdriverwaitclickable(gridviewload);
		BaseClass.screenshotv2("Gradebook - grid view", "Turnitin Grades");
		
	}
//Scroll to view assignment
	public void scrollright() {
		BaseClass.scrolltoright();
	}

// Enter Assignment title and select enter button to load it
	public void searchassignment() {
		BaseClass.highlighter(searchboxgradebook);
		String setupassignmenttitle= BaseClass.currentultratitle; //"UltraAutomationTest 2020-03-09 13-52-03";
		searchboxgradebook.sendKeys(setupassignmenttitle);
				
	}
	
//Select the search result assignment
	public void selectassignmentfromresult() {
		BaseClass.webdriverwaitclickable(assignmentsearchresult);
		assignmentsearchresult.click();
	}
//Gradebook
	/*
	 * Hard codes values for student names, update when student name changes
	 */
	public void searchandclickongrades() {
		
		//String setupassignmenttitle= BaseClass.currentultratitle; //"UltraAutomationTest 2020-03-09 13-52-03";
		try {
			Thread.sleep(5000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		int studentnamearrysize=BaseClass.studentnamearray.length;
		for(int x=0; x<studentnamearrysize; x++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			//System.out.println(BaseClass.studentnamearray[x]);
			//System.out.println(BaseClass.prop.getProperty("Grade"+x+""));
			WebElement marknowtext= driver.findElement(By.xpath("//div[@id=\"gradeNow\"and contains(@aria-label,'"+BaseClass.studentnamearray[x]+"')]//child::a"));
			WebElement mark=driver.findElement(By.xpath("(//div[@class=\"score\"and contains(@aria-label,'"+BaseClass.studentnamearray[x]+"')]//child::div//child::span)[1]"));
			String studentmark = mark.getText();
			//System.out.println(studentmark);
			String marknow=marknowtext.getText();
			if(!marknow.equalsIgnoreCase("Mark Now")) {
				BaseClass.scrollintoview(mark);
				BaseClass.highlighter(mark);
				
				//BaseClass.screenshotv2(""+BaseClass.studentnamearray[x]+" gradebook marks", "Turnitin Grades");
				Assert.assertTrue(""+BaseClass.studentnamearray[x]+" marks "+studentmark+" on Blackboard does not match with Turnitin." , studentmark.equalsIgnoreCase(BaseClass.prop.getProperty("Grade"+x+"")));
				System.out.println(""+BaseClass.studentnamearray[x]+" marks are displayed correctly on Blackboard");
			}
			else {
				System.out.println("Mark Now is displayed for "+BaseClass.studentnamearray[x]+"");
			}
			
			
		
		
		}
	}
	
	
	
	
}
		
		
		
		
		
	
		
		
/*		
		
		List<WebElement>marknowlist=driver.findElements(By.xpath("//div[@class=\"score\"and contains(@aria-label,'"+setupassignmenttitle+"')]"));
		//List<WebElement>marknowlist=driver.findElements(By.xpath("//div[@class=\"score\"]"));
				////div[@class=\"score\"and contains(@aria-label,'"+setupassignmenttitle+"')]//child::span[@id=\"display\"]"
				//(//div[@class=\"score\"and contains(@aria-label,'"+setupassignmenttitle+"')//child::span)]"));
		System.out.println(marknowlist.size());
		Iterator<WebElement> iter = marknowlist.iterator();
		
		while(iter.hasNext()) {
			WebElement xpaths=iter.next();
			//System.out.println(xpaths);
			
							
			
			if(xpaths.getAttribute("aria-label").contains("testteam Student2")) {
				
				//Assert.assertTrue("testteam Student 2 grades does not match on gradebook", xpaths.getText().equalsIgnoreCase(BaseClass.prop.getProperty("Grade0")));
				WebElement student2gradebookmark=driver.findElement(By.xpath("(//div[@class=\"score\"and contains(@aria-label,'testteam Student2')]//child::div//child::span)[1]"));
					// "//div[@class=\"score\"and contains(@aria-label,'testteam Student2')]//child::span[@id=\"display\"]"));
				WebElement student2marknow= driver.findElement(By.xpath("//div[@id=\"gradeNow\"and contains(@aria-label,'testteam Student2')]//child::a"));
				BaseClass.scrollintoview(student2gradebookmark);
				BaseClass.scrollintoview(student2marknow);
				BaseClass.highlighter(student2gradebookmark);
				BaseClass.highlighter(student2marknow);
				String student2gcmarknow=student2marknow.getText();
				String studentgradeGC2=student2gradebookmark.getText();
				System.out.println(studentgradeGC2);
				if(!studentgradeGC2.equalsIgnoreCase(BaseClass.prop.getProperty("Grade0"))){
					//if(studentgradeGC2!= null) 
					if(student2gcmarknow.equalsIgnoreCase("Mark Now"))
					{
					//throw new RuntimeException("testteam Student2 grades does not match with Turnitin grades");
					System.out.println("Testteam student2 grades are not displayed on gradebook, Mark now is displayed");
					}
				}
				else {
					System.out.println("Testteam student2's Turnitin marks displayed correctly on Blackboard gradebook.");
				}
				}
						
				if(xpaths.getAttribute("aria-label").contains("testteam Student2")) {
					
					//Assert.assertTrue("testteam Student 2 grades does not match on gradebook", xpaths.getText().equalsIgnoreCase(BaseClass.prop.getProperty("Grade0")));
					WebElement student2gradebookmark=driver.findElement(By.xpath("(//div[@class=\"score\"and contains(@aria-label,'testteam Student2')]//child::div//child::span)[1]"));
						// "//div[@class=\"score\"and contains(@aria-label,'testteam Student2')]//child::span[@id=\"display\"]"));
					WebElement student2marknow= driver.findElement(By.xpath("//div[@id=\"gradeNow\"and contains(@aria-label,'testteam Student2')]//child::a"));
					BaseClass.scrollintoview(student2gradebookmark);
					BaseClass.scrollintoview(student2marknow);
					BaseClass.highlighter(student2gradebookmark);
					BaseClass.highlighter(student2marknow);
					String student2gcmarknow=student2marknow.getText();
					String studentgradeGC2=student2gradebookmark.getText();
					System.out.println(studentgradeGC2);
					if(!studentgradeGC2.equalsIgnoreCase(BaseClass.prop.getProperty("Grade0"))){
						//if(studentgradeGC2!= null) 
						if(student2gcmarknow.equalsIgnoreCase("Mark Now"))
						{
						//throw new RuntimeException("testteam Student2 grades does not match with Turnitin grades");
						System.out.println("Testteam student2 grades are not displayed on gradebook, Mark now is displayed");
						}
					}
					else {
						System.out.println("Testteam student2's Turnitin marks displayed correctly on Blackboard gradebook.");
					}
				}
				
			
			
			else if(xpaths.getAttribute("aria-label").contains("testteam Student3")) {
				
				
				//Assert.assertTrue("testteam Student 3 grades does not match on gradebook", xpaths.getText().equalsIgnoreCase(BaseClass.prop.getProperty("Grade1")));
				WebElement student3gradebookmark=driver.findElement(By.xpath("(//div[@class=\"score\"and contains(@aria-label,'testteam Student3')]//child::div//child::span)[1]"));
						//"//div[@class=\"score\"and contains(@aria-label,'testteam Student3')]//child::span[@id=\"display\"]"));
				BaseClass.highlighter(student3gradebookmark);
				
				WebElement student3marknow= driver.findElement(By.xpath("//div[@id=\"gradeNow\"and contains(@aria-label,'testteam Student3')]//child::a"));
				BaseClass.scrollintoview(student3gradebookmark);
				BaseClass.scrollintoview(student3marknow);
				BaseClass.highlighter(student3marknow);
				String student3gcmarknow=student3marknow.getText();
				String studentgradeGC3=student3gradebookmark.getText();
				System.out.println(studentgradeGC3);
				if(!studentgradeGC3.equalsIgnoreCase(BaseClass.prop.getProperty("Grade1"))){
					//if(studentgradeGC3!=null) {
					//throw new RuntimeException("testteam Student3 grades does not match with Turnitin grades");
					if(student3gcmarknow.equalsIgnoreCase("Mark Now"))
					{
					
					System.out.println("Testteam Student3 grades are not displayed on gradebook, Mark now is displayed");
					}
					
				}
				else {
					System.out.println("Testteam student3's Turnitin marks displayed correctly on Blackboard gradebook.");
				}
				
			}
			
			
			else if(xpaths.getAttribute("aria-label").contains("testteam Student4")) {
				
				
				//Assert.assertTrue("testteam Student 4 grades does not match on gradebook", xpaths.getText().equalsIgnoreCase(BaseClass.prop.getProperty("Grade2")));
				WebElement student4gradebookmark=driver.findElement(By.xpath("(//div[@class=\"score\"and contains(@aria-label,'testteam Student4')]//child::div//child::span)[1]"));
						//"//div[@class=\"score\"and contains(@aria-label,'testteam Student4')]//child::span[@id=\"display\"]"));
				String studentgradeGC4=student4gradebookmark.getText();
				System.out.println(studentgradeGC4);
				WebElement student4marknow= driver.findElement(By.xpath("//div[@id=\"gradeNow\"and contains(@aria-label,'testteam Student4')]//child::a"));
				String student4gcmarknow=student4marknow.getText();
				BaseClass.scrollintoview(student4gradebookmark);
				BaseClass.scrollintoview(student4marknow);
				BaseClass.highlighter(student4gradebookmark);
				BaseClass.highlighter(student4marknow);
				if(!studentgradeGC4.equalsIgnoreCase(BaseClass.prop.getProperty("Grade2"))) {
					//if(studentgradeGC4!=null) {
					if(student4gcmarknow.equalsIgnoreCase("Mark Now"))
					{
						//throw new RuntimeException("testteam Student4 grades does not match with Turnitin grades");
						System.out.println("Testteam Student4 grades are not displayed on gradebook, Mark now is displayed");
					}
				}
				else {
					System.out.println("Testteam student4's Turnitin marks displayed correctly on Blackboard gradebook.");
				}
			}
		  

			
				
			
		BaseClass.screenshotv2("Turnitin grades on Blackboard gradebook", "Turnitin Grades");
		}
		}
		
	}
	*/
//Close Turnitin LTI screen
	
	
	
	
	
	
	
	
	


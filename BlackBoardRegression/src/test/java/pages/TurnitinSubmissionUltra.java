package pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.model.Log;

public class TurnitinSubmissionUltra extends BaseClass{
	
	
	
	
//Element locators 
	
//@FindBy(xpath="(//bb-svg-icon[@icon=\"calendar\"])[2]")
//public WebElement assignmenttitle;
@FindBy(xpath="(//a[@class=\"content-title\"])[1]")
public WebElement selectultraassignment;

@FindBy(xpath="//button[@class=\"button launch-link link\"]")
public WebElement launchbutton;
@FindBy(xpath="//button[@aria-controls=\"assignment\"]")
public WebElement assignmentinfo;
@FindBy(xpath="//a[text()='Summary']")
public WebElement summary;
@FindBy(xpath="//a[contains(text(),'Assignment Dashboard')]")
public WebElement assignmentdashboard;
//@FindBy(xpath="//button[contains(text(),'Upload')]")
@FindBy(xpath="//div[@class=\"student-submission-button\"]/child::button")
public WebElement uploadsubmissionbutton;
@FindBy(xpath="//button[contains(text(),'Cannot Upload')]")
public WebElement cannotuploadbutton;

//Text Upload 
@FindBy(xpath="//li[@id=\"submission-tab-text-stat\"]")
public WebElement textinput;
@FindBy(xpath= "//input[@data-test=\"submission-text-title\"]")
public WebElement textinputtitle;
@FindBy(xpath="//textarea[@data-test=\"submission-text-body\"]")
public WebElement textarea;
@FindBy(xpath="//button[@type=\"button\" and @data-test=\"submission-text-submit-button\"]")
public WebElement textuploadbutton;
@FindBy(xpath="//dd[@data-test=\"submission-review-title\"]")
public WebElement titlereview;


@FindBy(xpath="//button[@data-test=\"submission-review-button-preview\"]")
public WebElement previewbutton;
@FindBy(xpath="//button[@data-test=\"submission-review-button-close-preview\"]")
public WebElement textclosepreview;
@FindBy(xpath="//button[@data-test=\"submission-review-button-submit\"]")
public WebElement textsubmittoturnitin;
@FindBy(xpath="//*[contains(text(),'Submission uploaded successfully')]")
public WebElement successfulsubmissionmessage;
//@FindBy(xpath="(//div[@id=\"alert-successfull-submission\"]/child::text())[3]")
//@FindBy(xpath="((//div[@id=\"alert-successfull-submission\"])[1]/child::span")
@FindBy(xpath="(//div[@id=\"alert-successfull-submission\"])[1]")
public WebElement successfulsubmissionmessageelement;
@FindBy(xpath="//button[@aria-controls=\"assignment\"]/child::span[@class=\"assignmenttitle\"]")
public WebElement assignmenttitleonTII;
@FindBy(xpath="//h4[@id=\"max-points\"]")
public WebElement assignmentinfomaxpoints;
@FindBy(xpath="//dd[@class=\"title\"]")
public WebElement assignmenttitleonsummarypane;
@FindBy(xpath="//dd[@class=\"instructions\"]")
public WebElement assignmentinstructiononsummarypane;
@FindBy(xpath="//div[@class=\"paper-title-table\"]/child::a")
public WebElement assignmenttitleaftersubmission;

//File Upload submission
@FindBy(xpath="//input[@data-test=\"submission-file-title\"]")
public WebElement filesubmissiontitle;
@FindBy(xpath="//input[@data-test=\"submission-file-select\"]")
public WebElement filesubmissionchoosefilebutton;
@FindBy(xpath="//button[@data-test=\"submission-file-submit\"]")
public WebElement filesubmissionuploadandreviewbutton;
//@FindBy(xpath="//span[text()='Oops...']")
@FindBy(xpath="(//div[@data-test=\"loading-upload-error\"]/descendant::span)[2]")
public WebElement uploadfailoopsmessage;
@FindBy(xpath="//button[@type=\"button\"]/child::span[text()=\"Go Back\"]")
public WebElement uploadfailgobackbutton;
@FindBy(xpath="//p[@class=\"subtext\"]")
public WebElement uploadfailmessage;
@FindBy(xpath="//dd[@data-test=\"submission-review-title\"]")
public WebElement filesubmissionreviewtitle;
@FindBy(xpath="//button[@data-test=\"submission-review-button-submit\"]")
public WebElement filesubmissionsubmittoturnitinbutton;

// Dropbox upload
@FindBy(xpath="//a[@data-test=\"submission-tab-dropdown\"]")
public WebElement cloudsubmissiondropdown;
@FindBy(xpath="//div[@role=\"button\" and @data-test=\"submission-tab-dropdown-dropbox\"]")
public WebElement dropboxoption;
@FindBy(xpath="//input[@type=\"email\" and @name=\"login_email\"]")
public WebElement dropboxloginemail;
@FindBy(xpath="//input[@type=\"password\" and @name=\"login_password\"]")
public WebElement dropboxpassword;
@FindBy(xpath="//input[@type=\"checkbox\" and @name=\"remember_me\"]")
public WebElement dropboxremembermecheckbox;
@FindBy(xpath="//button[@type=\"submit\"]")
public WebElement dropboxsingin;
@FindBy(xpath="//input[@aria-label=\"Search\"]")
public WebElement dropboxsearch;
@FindBy(xpath="//div[@class=\"dropins-item-row-checkbox-container\"]")
public WebElement dropboxselectfiletouploadcheckbox;
@FindBy(xpath="//button[@class=\"mc-button mc-button-primary\"]/child::span")
public WebElement dropboxchoosebutton;




//Initiate Elements
public TurnitinSubmissionUltra() {
	
	PageFactory.initElements(driver, this);
	}

public void clickassignment() {
	//BaseClass.currentassignmentname();
	//	WebElement assignmenttitle= driver.findElement(By.xpath("//span[text()='"+BaseClass.currentassignmentname()+"']"));
	//	assignmenttitle.click();
	BaseClass.highlighter(selectultraassignment);
	String ultratitle= selectultraassignment.getText();
	if(ultratitle.equals(BaseClass.currentultratitle))//("UltraAutomationTest")) 
	//if(ultratitle.contains("UltraAutomationTest"))
		{
		selectultraassignment.click();
		}
	else {
		throw new RuntimeException("Assignment is not first item in content area");
		}
		 
	}

//Click Launch button on side panel
public void clicklaunch() {
	BaseClass.webdriverwaitvisible(launchbutton);
	BaseClass.screenshotv2("TII - Student launch assignment","Turnitin Assignments");
	launchbutton.click();
	
	}

/*
 * Turnitin assignment- Student view 
 */

//Verify assignment title on Turnitin
public void verifyassignmenttitleontii() {
	BaseClass.switchtoframe("lti-launch-iframe");
	//driver.switchTo().frame("lti-launch-iframe");
	BaseClass.webdriverwaitvisible(assignmenttitleonTII);
	BaseClass.highlighter(assignmenttitleonTII);
	String assignmenttitleontii= BaseClass.currentultratitle;//This stores runtime dynamic title in BaseClass
	Assert.assertTrue("Assignment title does not match on TII",assignmenttitleontii.equals(assignmenttitleonTII.getText()) );
	
	}

public void clickassignmentinfo() {
	//driver.switchTo().frame("lti-launch-iframe");
	BaseClass.webdriverwaitvisible(assignmentinfo);
	assignmentinfo.click();
	
	}

public void verifyassignmentinfolaunch() {
	BaseClass.webdriverwaitvisible(assignmentinfomaxpoints);
	Assert.assertTrue("Information panel is not displayed with Max points", assignmentinfomaxpoints.isDisplayed());
	
	}

public void clicksummary() {
	BaseClass.webdriverwaitvisible(summary);
	BaseClass.screenshotv2("TII - Student -Assingment Info","Turnitin Assignments");
	summary.click();
	
	}

public void summarypanelaunch() {
	BaseClass.webdriverwaitvisible(assignmenttitleonsummarypane);
	BaseClass.highlighter(assignmenttitleonsummarypane);
}
public void verifyassignmenttitleonsummarypane() {
	String assignmenttitleonsummary=BaseClass.currentultratitle;
	Assert.assertTrue("Title does not match on summary screen", assignmenttitleonsummary.equals(assignmenttitleonsummarypane.getText()));
	
	}

public void verifyassignmentinstructiononsummarypane() {
	BaseClass.highlighter(assignmentinstructiononsummarypane);
	String assignmentinstructiononsummary=BaseClass.prop.getProperty("tiiinstruction");
	Assert.assertTrue("Assignment title does not match on summary screen", assignmentinstructiononsummary.equals(assignmentinstructiononsummarypane.getText()));
	BaseClass.screenshotv2("TII- Student Assignment Summary","Turnitin Assignments");
	}

public void clickassignmentdashboard() {
	assignmentdashboard.click();
	
	}

public void verifyassignmentdashboard() {
	Assert.assertTrue("Assignment dashboard is not loaded with upload button", uploadsubmissionbutton.isDisplayed());
	
	}

public void clickuploadsubmission() {
	uploadsubmissionbutton.click();
	
	}

public void cannotuploadbutton() {
	cannotuploadbutton.isDisplayed();
	
	}

//Verify upload button is enabled for student or not
public void uploadcheck()   {
	//driver.switchTo().frame("lti-launch-iframe");
	BaseClass.screenshotv2("TII- Student Assignment Dashboard","Turnitin Assignments");
	try {
		if(uploadsubmissionbutton.isDisplayed()) {
			
			Assert.assertFalse("Student cannot upload as due date is passed and upload button is disabled",uploadsubmissionbutton.getText().equalsIgnoreCase(" Cannot Upload Submission"));
			Assert.assertTrue("Upload button is not displayed or enabled", uploadsubmissionbutton.getText().equalsIgnoreCase("Upload Submission"));
			uploadsubmissionbutton.click();
		}
	}
	catch(Exception e){
	 
		e.printStackTrace();
		
	
		}
	}

public void textinput() {
	BaseClass.switchtoframe("upload-modal-iframe");
	//driver.switchTo().frame("upload-modal-iframe");
	textinput.click();
	
	}

public void textinputtitle() {
	textinputtitle.sendKeys(BaseClass.prop.getProperty("texttitle"));
	
	}

public void textarea() {
	textarea.sendKeys(BaseClass.prop.getProperty("textcontent"));
	
	}

public void textupload() {
	BaseClass.screenshotv2("TII- Assignment Submission- Text","Turnitin Assignments");
	if (textuploadbutton.isEnabled()) {
		textuploadbutton.click();
	}
	else throw new RuntimeException("Upload button is not enabled");
	
	}

public void comparetitle() {
	BaseClass.highlighter(titlereview);
	BaseClass.screenshotv2("TII- Text submission title","Turnitin Assignments");
	Assert.assertTrue("Assignment title does not match on preview screen",titlereview.getText().equals(BaseClass.prop.getProperty("texttitle")));
		
	}

public void launchpreview() {
	BaseClass.webdriverwaitvisible(previewbutton);
	previewbutton.click();
	
}

public void submissionpreview() {
	Assert.assertTrue("Preview screen is not displayed",textclosepreview.isDisplayed());
	BaseClass.screenshotv2("TII-Submission Preview","Turnitin Assignments");
}

public void closepreview() {
	textclosepreview.click();
	
	}

public void textsubmittoTII() {
	textsubmittoturnitin.click();
	
	}

public void successfulsubmissionmessage() {
	driver.switchTo().parentFrame();
	//driver.switchTo().frame("lti-launch-iframe");
	//Assert.assertTrue("Successful submission message is not displayed",ultrasubmission.successfulsubmissionmessageelement.getText().contains("Submission uploaded successfully."));
	BaseClass.webdriverwaitvisible(successfulsubmissionmessageelement);
	Assert.assertTrue("Successful Submission message is not displayed",successfulsubmissionmessageelement.isDisplayed() );
	
	BaseClass.highlighter(successfulsubmissionmessageelement);
	BaseClass.screenshotv2("Successful submission message","Turnitin Assignments");
	
	}

//Verify assignment submission title on Turnitin screen
public void verifyassingmnettitleaftersubmission() {
	BaseClass.screenshotv2("TII- Successful assignment submission","Turnitin Assignments");
	String aftersubmission= assignmenttitleaftersubmission.getAttribute("data-paper-title");
	Assert.assertTrue("Uploaded and submitted assignment title does not match on Turnitin", aftersubmission.equalsIgnoreCase(BaseClass.prop.getProperty("texttitle")));
	
	}


/*
 * 
 * Assignment Submission - Local file upload
 */

//Enter assignment submission title based on the document type mentioned in properties file
public void enterfilesubmissiontitle() {
	BaseClass.switchtoframe("upload-modal-iframe");
	//driver.switchTo().frame("upload-modal-iframe");
	if(BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("pdf")) {
	
		filesubmissiontitle.sendKeys(BaseClass.prop.getProperty("pdftitle"));
		}
	else if (BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("word")) {
	
		filesubmissiontitle.sendKeys(BaseClass.prop.getProperty("wordtitle"));
		}
	else if (BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("image")) {
		
		filesubmissiontitle.sendKeys(BaseClass.prop.getProperty("imagetitle"));
		}
	else {
		throw new RuntimeException("Incorrect assignment type in properties file");
		}
	}

public void selectchoosebutton() {
	BaseClass.screenshotv2("TII-Assignment Submission- File Upload","Turnitin Assignments");
	BaseClass.implicitlywait(10);
	BaseClass.webdriverwaitclickable(filesubmissionchoosefilebutton);
	filesubmissionchoosefilebutton.click();
	
//	JavascriptExecutor js= (JavascriptExecutor)driver;
//	js.executeScript("arguments[0].click()",filesubmissionchoosefilebutton );
}

public void copyfilelocationclipboard()  {
	
	if(BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("pdf")) {
		
		BaseClass.copytoclipboard("pdflocation");
			
		}
	else if (BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("word")) {
				
		BaseClass.copytoclipboard("wordlocation");
		
		}
	else if (BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("image")) {
				
		BaseClass.copytoclipboard("imagelocation");
		
		}
	else {
		throw new RuntimeException("Incorrect assignment type in properties file");
		}
	
	}

//Enter file location and select open button on file explorer window
public void enterfileuploadfilelocation() throws AWTException, Exception {
		BaseClass.robotpastingfromclipboard();
		}

// Send local file location in sendkeys
public void selectafiletopupload() {
if(BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("pdf")) {
		
		filesubmissionchoosefilebutton.sendKeys(BaseClass.prop.getProperty("pdflocation"));
			
		}
	else if (BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("word")) {
				
		
		filesubmissionchoosefilebutton.sendKeys(BaseClass.prop.getProperty("wordlocation"));
		
		}
	else if (BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("image")) {
				
		
		filesubmissionchoosefilebutton.sendKeys(BaseClass.prop.getProperty("imagelocation"));
		
		}
	else {
		throw new RuntimeException("Incorrect assignment type in properties file");
		}
	}

public void filenameisdisplayed() {
	BaseClass.screenshotv2("TII-Assignment Submission- File upload- File Name","Turnitin Assignments");
}
public void filesubmituploadandreviewbutton() {
	
	BaseClass.webdriverwaitclickable(filesubmissionuploadandreviewbutton);
	Assert.assertTrue("Upload and Review button is not enabled for file upload", filesubmissionuploadandreviewbutton.isEnabled());
	
	}

public void clickuploadandreviewbuttonfileupload() {
	filesubmissionuploadandreviewbutton.click();
	
	}

public void comparefileuploadsubmissiontitle() {
	BaseClass.webdriverwaitvisible(titlereview);
	BaseClass.highlighter(titlereview);
	BaseClass.screenshotv2("TII-Student Submission-File upload- compare title","Turnitin Assignments");
	if(BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("pdf")){
	Assert.assertTrue("File upload pdf assignment does not match with entered title", titlereview.getText().equalsIgnoreCase(BaseClass.prop.getProperty("pdftitle")));
		}
	else if(BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("word")){
		Assert.assertTrue("File upload word assignment does not match with entered title", titlereview.getText().equalsIgnoreCase(BaseClass.prop.getProperty("wordtitle")));
		}
	else if(BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("image")){
		Assert.assertTrue("File upload word assignment does not match with entered title", titlereview.getText().equalsIgnoreCase(BaseClass.prop.getProperty("imagetitle")));
		}
	
	}

public void fileuploadverifytitleaftersubmission() {
	String aftersubmission= assignmenttitleaftersubmission.getAttribute("data-paper-title");
	if(BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("pdf")){
		Assert.assertTrue("Uploaded and submitted title does not match - file upload", aftersubmission.equalsIgnoreCase(BaseClass.prop.getProperty("pdftitle")));
			}
		else if(BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("word")){
			Assert.assertTrue("Uploaded and submitted title does not match - file upload", aftersubmission.equalsIgnoreCase(BaseClass.prop.getProperty("wordtitle")));
			}
		else if(BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("image")){
			Assert.assertTrue("Uploaded and submitted title does not match - file upload", aftersubmission.equalsIgnoreCase(BaseClass.prop.getProperty("imagetitle")));
			}
	
	}

/*
 * Assignment Submission - Dropbox upload
 */

public void clickcloudsubmission() {
	BaseClass.switchtoframe("upload-modal-iframe");
	//driver.switchTo().frame("upload-modal-iframe");
	cloudsubmissiondropdown.click();
	
	}

public void selectdropbox() {
	BaseClass.parentwindowhandle= driver.getWindowHandle();
	dropboxoption.click();
	
	}

public void verifydropboxlaunch() {
	BaseClass.windowhandle();
	BaseClass.webdriverwaitvisible(dropboxloginemail);
	Assert.assertTrue("Dropbox screen did not launch" , dropboxloginemail.isDisplayed());
	
	}

public void enterdropboxloginemail() {
	dropboxloginemail.sendKeys(BaseClass.prop.getProperty("dropboxstudent_id"));
	
	}

public void enterdropboxpassword() {
	dropboxpassword.sendKeys(BaseClass.prop.getProperty("dropboxstudent_pwd"));
	
	}

public void dropboxremembermecheckbox() {
	dropboxremembermecheckbox.click();
	
	}

public void dropboxsigninbutton() {
	dropboxsingin.click();
	
	}

public void verifydropboxlogin() {
	BaseClass.webdriverwaitvisible(dropboxsearch);
	Assert.assertTrue("Dropbox login is unsuccessful",dropboxsearch.isDisplayed());
	
	}

public void dropboxsearchfiletoupload() {
	if(BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("word")) {
		dropboxsearch.sendKeys(BaseClass.prop.getProperty("dropboxword"));
		}
	else if (BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("pdf")) {
		dropboxsearch.sendKeys(BaseClass.prop.getProperty("dropboxpdf"));
		}
	else if (BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("image")) {
		dropboxsearch.sendKeys(BaseClass.prop.getProperty("dropboximage"));
		}
	
	}

public  void dropboxselectfiletoupload() throws Exception {
	BaseClass.webdriverwaitvisible(dropboxselectfiletouploadcheckbox);
	Thread.sleep(5000);
	dropboxselectfiletouploadcheckbox.click();
	}

public void dropboxchoosebutton() throws Exception {
	BaseClass.webdriverwaitclickable(dropboxchoosebutton);
	Thread.sleep(5000);
	dropboxchoosebutton.click();
	driver.switchTo().window(BaseClass.parentwindowhandle);
	}

public void dropboxverifytitle() {
	
	driver.switchTo().defaultContent();
	BaseClass.switchtoframe("lti-launch-iframe");
	//driver.switchTo().frame("lti-launch-iframe");	
	BaseClass.switchtoframe("upload-modal-iframe");
	//driver.switchTo().frame("upload-modal-iframe");
	BaseClass.webdriverwaitvisible(titlereview);
	if(BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("word")) {
		Assert.assertTrue("Dropbox submission title does not match title on preview screen", titlereview.getText().equalsIgnoreCase(BaseClass.prop.getProperty("dropboxword")));
	}
	else if (BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("pdf")) {
		Assert.assertTrue("Dropbox submission title does not match title on preview screen", titlereview.getText().equalsIgnoreCase(BaseClass.prop.getProperty("dropboxpdf")));
		}
	else if (BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("image")) {
		Assert.assertTrue("Dropbox submission title does not match title on preview screen", titlereview.getText().equalsIgnoreCase(BaseClass.prop.getProperty("dropboximage")));
		}
	}

public void dropboxverifytitleaftersubmission() {
	String aftersubmission= assignmenttitleaftersubmission.getAttribute("data-paper-title");
	if(BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("word")){
		Assert.assertTrue("Uploaded and submitted title does not match - Dropbox upload", aftersubmission.equalsIgnoreCase(BaseClass.prop.getProperty("dropboxword")));
			}
		else if(BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("pdf")){
			Assert.assertTrue("Uploaded and submitted title does not match - Dropbox upload", aftersubmission.equalsIgnoreCase(BaseClass.prop.getProperty("dropboxpdf")));
			}
		else if(BaseClass.prop.getProperty("assignmenttype").equalsIgnoreCase("image")){
			Assert.assertTrue("Uploaded and submitted title does not match - Dropbox upload", aftersubmission.equalsIgnoreCase(BaseClass.prop.getProperty("dropboximage")));
			}
	}


}
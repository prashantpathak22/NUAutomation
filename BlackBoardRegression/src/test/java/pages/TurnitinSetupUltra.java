package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TurnitinSetupUltra extends BaseClass {
	
	 


//Course search 
	@FindBy(xpath="//span[text()='Modules and Programmes']")
	public WebElement modulesandprogrammeslink;
	@FindBy(xpath="//input[@aria-label=\"Search your modules\"]")
	public WebElement coursesearch;
	
	@FindBy(xpath="//h4[@title=\"Test Team Module 2019\"]")
	public WebElement ultracourse;
	@FindBy(xpath="//span[text()='Test Team Module 2019']")
	public WebElement coursename;
	//@FindBy(xpath="(//bb-svg-icon[@icon=\"add-circle-solid\"])[1]")
	@FindBy(xpath="(//bb-svg-icon[@icon=\"add\"])[1]")
	public WebElement plusicon;
	//@FindBy(xpath="//button[@name=\"Teaching Tools\"]")
	@FindBy(xpath="//button[@name=\"Teaching Tools\"] | //button[@name=\"Content Market\"]")
	public WebElement contentmarketbutton;
	//@FindBy(xpath="//button[@name=\"Teaching Tools\"]")
	//public WebElement contentmarketlabel;
	//@FindBy(xpath="//p[@title=\"Turnitin 1.3\"]")
	@FindBy(xpath="//p[contains(@title,'Turnitin')]")
	public WebElement turnitinsetuplti;
// Assignment Setup screen
	@FindBy(xpath="//input[@id=\"title\"]")
	public  WebElement assignmenttitleultra;
	@FindBy(xpath="//textarea[@id=\"instructions\"]")
	public WebElement instructions;
	@FindBy(xpath="//input[@id=\"max_points\"]")
	public WebElement maxpoints;
	@FindBy(xpath="//input[@aria-labelledby=\"date-post-label\"]")
	public WebElement feedbackreleasedate;
	@FindBy(xpath="//input[@aria-labelledby=\"date-end-label\"]")
	public  WebElement duedate;
//Optional settings
	@FindBy(xpath="//strong[text()='Optional Settings']")
	public WebElement optionalsettings;
	@FindBy(xpath="//select[@id=\"submit_papers_to\"]")
	public WebElement submitpapertodropdown;
	@FindBy(xpath="//input[@id=\"allow_non_or_submissions\"]")
	public WebElement anyfiletypechkbox;
	@FindBy(xpath="//input[@id=\"late_accept_flag\"]")
	public WebElement latesubmissionchbox;
	@FindBy(xpath="//input[@id=\"anonymous_marking_enabled\"]")
	public WebElement anonumousmarkingchbox;
//Compare against checkboxes
	@FindBy(xpath="//input[@id=\"student_paper_check\"]")
	public WebElement studentpaperrepositorychkbox;
	@FindBy(xpath="//input[@id=\"institution_check\"]")
	public WebElement instpaperrepositorychkbox;
	@FindBy(xpath="//input[@id=\"internet_check\"]")
	public WebElement websitecontentchkbox;
	@FindBy(xpath="//input[@id=\"journal_check\"]")
	public WebElement journalschkbox;
//Similarity reports	
	@FindBy(xpath="//select[@id=\"report_gen_speed\"]")
	public WebElement similarityreportgenerationdrpdwn;
	@FindBy(xpath="//input[@id=\"s_view_reports\"]")
	public WebElement allowtoviewsimilarityreportchkbox;
	@FindBy(xpath="//input[@id=\"use_biblio_exclusion\"]")
	public WebElement excludebibliographicchkbox;
	@FindBy(xpath="//input[@id=\"use_quoted_exclusion\"]")
	public WebElement excludequotedchkbox;
	@FindBy(xpath="//input[@id=\"exclude_small_sources\"]")
	public WebElement excludesmallsourcechkbox;
	@FindBy(xpath="//input[@id=\"exclude_words\"]")
	public WebElement excludewordsradiobtn;
	@FindBy(xpath="//input[@id=\"exclude_percentage\"]")
	public WebElement excludepercentageradiobtn;
	@FindBy(xpath="//input[@id=\"exclude_value\"]")
	public WebElement thresholdvalue;
	@FindBy(xpath="//input[@type=\"checkbox\" and @id=\"instructor_id_for_defaults\"]")
	public WebElement savesettingscheckbox;
	@FindBy(xpath="//button[text()='Submit']")
	public WebElement submitbutton;
	@FindBy(xpath="//h3[@class=\"submission-settings\" and text()='Submission settings']")
	public WebElement optionalsettingsview;
	@FindBy(xpath="(//div[@class=\"content-item-row\"])[1]//child::a[@class=\"content-title\"]//child::span")
	public WebElement addedturnitinassignmentinlist;
	@FindBy(xpath="//div[@class=\"outline-header inventory-header\"]//child::h2")
	public WebElement contentpageheader;
	@FindBy(xpath="(//p[@class=\"js-description\"])[1]")
	public WebElement assignmentinstructioncoursecontent;
	@FindBy(xpath="//button[@class=\"bb-close\"]")
	public WebElement xicononmodule;
	
	
//Object initialisation
	public TurnitinSetupUltra(){
		PageFactory.initElements(driver, this);
	}
	

  
   
   
	
//Operation methods
	
//Search the module to launch
	public void coursesearch(String x) {
		BaseClass.webdriverwaitvisible(coursesearch);
		coursesearch.sendKeys(x);
		BaseClass.implicitlywait(10);
			
	}
//Launch selected ultra module
	public void launchultramodule() {
		BaseClass.webdriverwaitvisible(ultracourse);
		Assert.assertTrue("Searched ultra module is not retrieved",ultracourse.isDisplayed());
		BaseClass.highlighter(ultracourse);
		//BaseClass.screenshotv2("Ultra_UltraCourselist","Standard flow");
		ultracourse.click();
	}

	public void validatecourselaunch(String x) {
		ultracourse.getText();
	}
//Click first + icon 
	public void clickplus(){
//		Actions a =new Actions(driver);
//		a.moveToElement(plusicon).build().perform();
//		plusicon.click();
		BaseClass.webdriverwaitclickable(plusicon);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",plusicon );
	
	}
// Click on content market link under + icon menu
	public void clickcontentmarket() {
		BaseClass.webdriverwaitclickable(contentmarketbutton);
		Assert.assertTrue(" Conetent market is not listed under + menu",contentmarketbutton.isDisplayed());
		BaseClass.highlighter(contentmarketbutton);
		//BaseClass.screenshotv2("Content Market link", "Standard flow");
		contentmarketbutton.click();
				
	}
	//public void validatecontentmarket(String x) {
	//	contentmarketlabel.getText();
	//}

//Click turnitin link on Content market screen
	public void clickturnitinlti() {
		BaseClass.webdriverwaitvisible(turnitinsetuplti);
		BaseClass.scrollintoview(turnitinsetuplti);
		Assert.assertTrue("Trunitin LTI link is not displayed on Content Market screen",turnitinsetuplti.isDisplayed());		
		BaseClass.highlighter(turnitinsetuplti);
		BaseClass.screenshotv2("Turnitin LTI link- Contnet Market","Turnitin Assignments");
		turnitinsetuplti.click();
	}
	
//Verify Turnitin screen is launched
	public void verifytiilaunch() {
		//Switch to Turnitin LTI frame
		BaseClass.switchtoframe("lti-launch-iframe");
		//driver.switchTo().frame("lti-launch-iframe");
		BaseClass.webdriverwaitvisible(submitbutton);
		Assert.assertTrue("Turnitin screen is not launched successfully with submit button",submitbutton.isDisplayed()); 
		BaseClass.screenshotv2("Turnitin Assignment setup","Turnitin Assignments");
	}
//Assignment setup

//Enter assignment title
	public void enterassignmenttitle(){
		Assert.assertTrue("Turnitin Assignment title is not displayed or is not enable",assignmenttitleultra.isDisplayed()&&assignmenttitleultra.isEnabled());
		BaseClass.highlighter(assignmenttitleultra);
		assignmenttitleultra.sendKeys(BaseClass.getultratitle());
	}
//Enter assignment instructions 
	public void enterinstructions() {
		instructions.sendKeys(BaseClass.prop.getProperty("tiiinstruction"));
		BaseClass.screenshotv2("Ultra_Turnitintitle","Turnitin Assignments");
	}
//Enter Max points
	public void entermaxpoints(int x) {
		maxpoints.sendKeys(String.valueOf(x));
	}
	public void clickoptionalsettings() {
		optionalsettings.click();
	}
	
// Update Feedback release date with current date
	public void updatefeedbackreleasedatetocurrent() throws AWTException {
		BaseClass.highlighter(feedbackreleasedate);
		Date date= new Date();
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(date);
		feedbackreleasedate.sendKeys(Keys.chord(Keys.CONTROL,"a"),timestamp);
			
	}
//Verify Optional settings pane launch
	public void verifyoptionalsettingspanelaunch() {
		Assert.assertTrue("Optional settings pane is not loaded",optionalsettingsview.isDisplayed());
		BaseClass.screenshotv2("OptionalSettingsview","Turnitin Assignments");
	}
	public void submitpaperto(int x){
		Select submitto=new Select (submitpapertodropdown);
		submitto.selectByValue(String.valueOf(x));;
	}
	public void anyfiletype(String x) {
		if(x.equalsIgnoreCase("any")) {
			if(!anyfiletypechkbox.isSelected()) {
				anyfiletypechkbox.click();
			}
		}
		else if(x.equalsIgnoreCase("limited")) {
			if(anyfiletypechkbox.isSelected()) {
				anyfiletypechkbox.click();
			}
		}
	}
	public void latesubmission(String x) {
		if(x.equalsIgnoreCase("check")) {
			if(!latesubmissionchbox.isSelected()) {
				latesubmissionchbox.click();
			}
		}
		else if(x.equalsIgnoreCase("uncheck")) {
			if(latesubmissionchbox.isSelected()) {
				latesubmissionchbox.click();
			}
		}
		BaseClass.screenshotv2("TII - Optional settings 1","Turnitin Assignments");
	}
	public void anonumousmarking(String x) {
		
		if(x.equalsIgnoreCase("check")) {
			if(!anonumousmarkingchbox.isSelected()) {
				anonumousmarkingchbox.click();
			}
		}
		else if(x.equalsIgnoreCase("uncheck")) {
			if(anonumousmarkingchbox.isSelected()) {
				anonumousmarkingchbox.click();
			}
		}
	}
	public void studentpaperrepository(String x) {
		if(x.equalsIgnoreCase("check")) {
			if(!studentpaperrepositorychkbox.isSelected()) {
				studentpaperrepositorychkbox.click();
			}
		}
		else if(x.equalsIgnoreCase("uncheck")) {
			if(studentpaperrepositorychkbox.isSelected()) {
				studentpaperrepositorychkbox.click();
			}
		}
	}
	public void instpaperrepository(String x) {
		
		if(x.equalsIgnoreCase("check")) {
			if(!instpaperrepositorychkbox.isSelected()) {
				instpaperrepositorychkbox.click();
			}
		}
		else if(x.equalsIgnoreCase("uncheck")) {
			if(instpaperrepositorychkbox.isSelected()) {
				instpaperrepositorychkbox.click();
			}
		}
	}
	public void websitecontent(String x) {
		
		if(x.equalsIgnoreCase("check")) {
			if(!websitecontentchkbox.isSelected()) {
				websitecontentchkbox.click();
			}
		}
		else if(x.equalsIgnoreCase("uncheck")) {
			if(websitecontentchkbox.isSelected()) {
				websitecontentchkbox.click();
			}
		}
		BaseClass.screenshotv2("Optional settings 2","Turnitin Assignments");
	}
	public void journals(String x) {
		
		if(x.equalsIgnoreCase("check")) {
			if(!journalschkbox.isSelected()) {
				journalschkbox.click();
			}
		}
		else if(x.equalsIgnoreCase("uncheck")) {
			if(journalschkbox.isSelected()) {
				journalschkbox.click();
			}
		}
	}
	public void similarityreportdrpdwn(int x) {
		Select similarityreport=new Select (similarityreportgenerationdrpdwn);
		similarityreport.selectByValue(String.valueOf(x));
	}
	public void allowtoviewsimilarityreport(String x) {
		
		if(x.equalsIgnoreCase("check")) {
			if(!allowtoviewsimilarityreportchkbox.isSelected()) {
				allowtoviewsimilarityreportchkbox.click();
			}
		}
		else if(x.equalsIgnoreCase("uncheck")) {
			if(allowtoviewsimilarityreportchkbox.isSelected()) {
				allowtoviewsimilarityreportchkbox.click();
			}
		}
	}
	public void excludebibliographicultra(String x) {
		
		if(x.equalsIgnoreCase("check")) {
			if(!excludebibliographicchkbox.isSelected()) {
				excludebibliographicchkbox.click();
			}
		}
		else if(x.equalsIgnoreCase("uncheck")) {
			if(excludebibliographicchkbox.isSelected()) {
				excludebibliographicchkbox.click();
			}
		}
	}
	public void excludequoted(String x) {
	
		if(x.equalsIgnoreCase("check")) {
			if(!excludequotedchkbox.isSelected()) {
				excludequotedchkbox.click();
			}
		}
		else if(x.equalsIgnoreCase("uncheck")) {
			if(excludequotedchkbox.isSelected()) {
				excludequotedchkbox.click();
			}
		}
	}
	public void excludesmallsource(String x, String y, int z) {
		
		if(x.equalsIgnoreCase("check")) {
			if(!excludesmallsourcechkbox.isSelected()) {
				excludesmallsourcechkbox.click();
				if (y.equalsIgnoreCase("words")) {
					excludewordsradiobtn.click();
					thresholdvalue.clear();
					thresholdvalue.sendKeys(String.valueOf(z));
					}
				else if (y.equalsIgnoreCase("percentage")) {
					excludepercentageradiobtn.click();
					thresholdvalue.clear();
					thresholdvalue.sendKeys(String.valueOf(z));
				}
			}
		}
		else if(x.equalsIgnoreCase("uncheck")) {
			if(excludesmallsourcechkbox.isSelected()) {
				excludesmallsourcechkbox.click();
			}
		}
		BaseClass.screenshotv2("TII - Optional Settings 3","Turnitin Assignments");
		
	}
	
//Save Turnitin assignment settings checkbox
	public void saveassignmentsettingscheckbox() {
		Assert.assertTrue("Save settings checkbox is not displayed on assignment setup screen", savesettingscheckbox.isDisplayed()&&savesettingscheckbox.isEnabled());
	}
	
	public void submit() {
		submitbutton.click();
	}
// Compare created assignment is added to the content area
	public void tiititlecomparefromcontentarea() throws Exception {
		Thread.sleep(5000);
		String assignmenttitletocompare= BaseClass.currentultratitle;
		BaseClass.webdriverwaitclickable(addedturnitinassignmentinlist);
		//System.out.println(addedturnitinassignmentinlist.getText());
		Assert.assertTrue("Assignment not added to content area",addedturnitinassignmentinlist.getText().equals(assignmenttitletocompare));
		BaseClass.screenshotv2("TII Assignment added to content area","Turnitin Assignments");
			
	}

//Compare assignment instructions
	public void verifyinstructiononblackboardcoursecontent() {
		String ultrainstruction=assignmentinstructioncoursecontent.getText();
		Assert.assertTrue("Instructions on Blackboard does not match with staff entered instructions on Turnitin", ultrainstruction.equals(BaseClass.prop.getProperty("tiiinstruction")));
		
	}
		
	public void contentheader() {
		BaseClass.webdriverwaitvisible(contentpageheader);
		Assert.assertTrue("Course content screen is not displayed after setup", contentpageheader.getText().contains("Content"));//.equalsIgnoreCase("Content"));
		
		
	}
	public void xicononmodule() {
		BaseClass.webdriverwaitclickable(xicononmodule);
		xicononmodule.click();
				
	}

	public void clickmodulesandprogrammes() {
		BaseClass.webdriverwaitclickable(modulesandprogrammeslink);
		modulesandprogrammeslink.click();
		
	}
}

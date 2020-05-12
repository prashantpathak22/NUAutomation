package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TurnitinSetupOriginal extends BaseClass
{

	
	/*
	*Locators
	*Created by Prashant Pathak
	*Date 04 apr 2019
	*version 0.1 
	*Note: use Xpath for better identification
	*/
	
	//Course search 
	@FindBy(xpath="//input[@aria-label=\"Search your courses\"]")
	public WebElement coursesearch;
	//Locators for Blackboard home page
	@FindBy(xpath="//h4[@title=\"Test Course- Student Survey 2019\"]")
	public WebElement originalmodule;
	
	//Locators for Blackboard Original course view page
	@FindBy(xpath="//span[@title=\"Turnitin\"]")
	public WebElement turnitinlink;
	@FindBy(xpath="//a[text()='Assessments ']")
	public WebElement assessmentslink;
	@FindBy(xpath="//a[text()='Turnitin Assignment']")
	public WebElement clickTurnitinAssignment;
	
	
//Locators for Turnitin Building block launch screen
	@FindBy(xpath="//li[@id=\"paper_assignment\"]")
	public WebElement selectpaperassessment;
	@FindBy(xpath="//input[@type=\"submit\"]")
	public WebElement nextstep;
	
//Locators for setup turnitin assignment screen
	@FindBy(xpath="//input[@id=\"title\"]")
	public WebElement assignmenttitle;
	@FindBy(xpath="//input[@id=\"max_points\"]")
	public WebElement maxpoints;
	@FindBy(xpath="//input[@id=\"allow_non_or_submissions_0\"]")
	public WebElement onlyturnitinfiletyperadiobutton;
	@FindBy(xpath="(//*[contains(text(),'Optional settings')])[2]")
	public WebElement clickoptionalsettings;
	@FindBy(xpath="//textarea[@id=\"instructions\"]")
	public WebElement instructiontextbox;
	
//Due date yes or no
	@FindBy(xpath="//input[@id=\"late_accept_flag_1\"]")
	public WebElement allowlatesubmission;
	@FindBy(xpath="//input[@id=\"late_accept_flag_0\"]")
	public WebElement donotallowlatesubmission;
	
//Due date yes or no
	@FindBy(xpath="//input[@id=\"generate_reports_1\"]")
	public WebElement generatereport;
	@FindBy(xpath="//input[@id=\"generate_reports_0\"]")
	public WebElement donotgeneratereport;
	
//Submission report dropdown
	@FindBy(xpath="//select[@id=\"report_gen_speed\"]")
	public WebElement submissionreportdropdown;
	
//Bibliographic yes or no
	@FindBy(xpath="//input[@id=\"use_biblio_exclusion_1\"]")
	public WebElement yesbibliographic;
	@FindBy(xpath="//input[@id=\"use_biblio_exclusion_0\"]")
	public WebElement nobibliographic;
	
//exclude quoted materials
	@FindBy(xpath="//input[@id=\"use_quoted_exclusion_1\"]")
	public WebElement yesexcludequoted;
	@FindBy(xpath="//input[@id=\"use_quoted_exclusion_0\"]")
	public WebElement noexcludequoted;
	
//Small source yes or no
	@FindBy(xpath="//input[@id=\"use_small_matches_1\"]")
	public WebElement yessmallsource;
	@FindBy(xpath="//input[@id=\"use_small_matches_0\"]")
	public WebElement nosmallsource;
	
// Threshold words or percentage
	@FindBy(xpath="//input[@id=\"exclude_by_words_radio\"]")
	public WebElement wordsradiobutton;
	@FindBy(xpath="//input[@id=\"exclude_by_words_value\"]")
	public WebElement wordsvalue;
	@FindBy(xpath="//input[@id=\"exclude_by_percent_radio\"]")
	public WebElement percentageradiobutton;
	@FindBy(xpath="//input[@id=\"exclude_by_percent_value\"]")
	public WebElement percentagevalue;
	
//Similarity report to students
	@FindBy(xpath="//input[@id=\"students_view_reports_1\"]")
	public WebElement yesstudentseesimilarityreport;
	@FindBy(xpath="//input[@id=\"students_view_reports_0\"]")
	public WebElement nostudentseesimilarityreport;
	
//Reveal grades post date
	@FindBy(xpath="//input[@id=\"bb_use_postdate_1\"]")
	public WebElement yesrevealgradesonlyonpostdate;
	@FindBy(xpath="//input[@id=\"bb_use_postdate_0\"]")
	public WebElement norevealgradesonlyonpostdate;
	
//Anonymous marking
	@FindBy(xpath="//input[@id=\"anonymous_marking_enabled_1\"]")
	public WebElement yesanonymousmarking;
	@FindBy(xpath="//input[@id=\"anonymous_marking_enabled_0\"]")
	public WebElement noanonymousmarking;
	
//Submit papers to dropdown
	@FindBy(xpath="//select[@id=\"submit_papers_to\"]")
	public WebElement submitpaperstodropdown;
	
//Search option checkbox
	@FindBy(xpath="//input[@id=\"student_paperDB\"]")
	public WebElement studentpaperchbx;
	@FindBy(xpath="//input[@id=\"node\"]")
	public WebElement instpaperchbx;
	@FindBy(xpath="//input[@id=\"internetDB\"]")
	public WebElement currentarchived;
	@FindBy(xpath="//input[@id=\"publicationsDB\"]")
	public WebElement publications;
	
//Rubrics
	@FindBy(xpath="//select[@id=\"assignment-rubric\"]")
	public WebElement rubricdropdown;
	
//Save default checkbox
	@FindBy(xpath="//input[@id=\"save_values_as_default\"]")
	public WebElement savedefault;
	
//Submit button
	@FindBy(xpath="//input[@value=\"Submit\"]")
	public WebElement submitbutton;
	@FindBy(xpath="//a[@id=\"assignment_success_ok\"]")
	public WebElement okbutton;
	@FindBy(xpath="//h1[contains(text(),'Turnitin Assignment successfully added.')]")
	public WebElement successmessage;

	

	
	
// Object initialisation 
	public TurnitinSetupOriginal()
	{
		PageFactory.initElements(driver, this);
	}
//Operation methods	
	
//Search courses
		public void coursesearch(String x) {
		coursesearch.sendKeys(x);
	}
	
//Blackboard home page
		public void launchOriginalModule()
		{
			originalmodule.click();
		}
				
//Original module view page
		public void clickTurnitinlink()
		{
			turnitinlink.click();
		}
		public void clickAssessments() {
			assessmentslink.click();
		}
		public void clickTurnitinAssignment() {
			clickTurnitinAssignment.click();
		}
		
//Turnitin setup assignment launch page
		
		public void selectPaperassignment() {
			selectpaperassessment.click();
		}
		
		public void clicknext()
		{
			nextstep.click();
		}
		
//Turnitin setup assignment page
		public void  enterassignmenttitle(String x) {
			 assignmenttitle.sendKeys(x);
			
		}
		public void entermaxpoints(int x) {
			maxpoints.sendKeys(String.valueOf(x));
		}
		public void onlyallowedfiletype() {
			onlyturnitinfiletyperadiobutton.click();
		}
		public void cickOptionalsettings() {
			clickoptionalsettings.click();
		}
		public void enterinstruction(String instr) {
			instructiontextbox.sendKeys(instr);
		}
		
//Due date yes or not
		public void yeslatesubmission() {
		allowlatesubmission.click();
		}
		public void nolatesubmission() {
		donotallowlatesubmission.click();
		}
		
// Generate similarity report yes or no
		public void yessimilarityreport() {
		generatereport.click();
		}
		public void nosimilarityreport() {
		donotgeneratereport.click();
		}
		
//Similarity report submission dropdown
		public void similarityreportdropdown(int x) {
		Select similarityreport=new Select(submissionreportdropdown);
		similarityreport.selectByIndex(x);
		}
		
//Bibliographic yes or no
		public void yesbibliographic() {
			yesbibliographic.click();
		}
		
		public void nobibliographic() {
			nobibliographic.click();
		}
		
//exclude quoted material yes or no
		public void yesexclude() {
		yesexcludequoted.click();
		}
		public void noexclude() {
		noexcludequoted.click();
		}
		
// small source yes or no 
		public void yessmallsource() {
		yessmallsource.click();
		}
		public void nosmallsource() {
		nosmallsource.click();
		}
		
//Threshold word or percentage
		public void selectwords() {
			wordsradiobutton.click();
		}
		public void enterwordsvalue(int z) {
			wordsvalue.clear();
			wordsvalue.sendKeys(String.valueOf(z));
		}
		public void selectpercentage() {
			percentageradiobutton.click();
		}
		public void enterpercentagevalue(int z) {
			percentagevalue.clear();
			percentagevalue.sendKeys(String.valueOf(z));
		}
		
//Allow students to see similarity reports yes or no
		public void yesseesimilarityreports() {
			yesstudentseesimilarityreport.click();
		}
		public void noseesimilarityreports() {
			nostudentseesimilarityreport.click();
		}
		
//Reveal grades to students only on post date yes or no
		public void yesrevealgrades() {
			yesrevealgradesonlyonpostdate.click();
		}
		public void norevealgrades() {
			norevealgradesonlyonpostdate.click();
		}
		
//Anonymous marking yes or no
		public void yesanonymousmarkig() {
			yesanonymousmarking.click();
		}
		public void noanonymousmarkig() {
			noanonymousmarking.click();
		}
		
		public void submitpaperstodropdown(int x) {
			Select submitpapersto=new Select(submitpaperstodropdown);
			submitpapersto.selectByIndex(x);
		}
		
//Search option checkboxes
		public void studentpaperchbx(String x) {
			if (x.equalsIgnoreCase("check")) {
				
				if(!studentpaperchbx.isSelected()) {
					studentpaperchbx.click();
				}
			}
			else if(x.equalsIgnoreCase("uncheck")) {
				
				if(studentpaperchbx.isSelected()) {
					studentpaperchbx.click();
				}
			}
			
		}
		public void instpaperchbx(String x) {
			if (x.equalsIgnoreCase("check")) {
				
				if(!instpaperchbx.isSelected()) {
					instpaperchbx.click();
				}
			}
			else if(x.equalsIgnoreCase("uncheck")) {
				
				if(instpaperchbx.isSelected()) {
					instpaperchbx.click();
				}
			}
			
			
		}
		public void currentarchivedchbx(String x) {
			if (x.equalsIgnoreCase("check")) {
				
				if(!currentarchived.isSelected()) {
					currentarchived.click();
				}
			}
			else if(x.equalsIgnoreCase("uncheck")) {
				
				if(currentarchived.isSelected()) {
					currentarchived.click();
				}
			}
		}
		public void publicationschbx(String x) {
			if (x.equalsIgnoreCase("check")) {
				
				if(!publications.isSelected()) {
					publications.click();
				}
			}
			else if(x.equalsIgnoreCase("uncheck")) {
				
				if(publications.isSelected()) {
					publications.click();
				}
			}
		}
		
		
//Rubrics
		public void rubricsdropdown( String x) {
			Select rubrics=new Select(rubricdropdown);
					rubrics.selectByVisibleText(x);
		}

// Save default checkbox
		public void savedefaultchbx(String x) {
			if (x.equalsIgnoreCase("check")) {
				
				if(!savedefault.isSelected()) {
					savedefault.click();
				}
			}
			else if(x.equalsIgnoreCase("uncheck")) {
				
				if(savedefault.isSelected()) {
					savedefault.click();
				}
			}
		}
		
//Submit button
		public void submitbuttonclick() {
			submitbutton.click();
		}
		
// Success message
		public void successmessage(String x) {
			successmessage.getText();
		}


}
		
package pages;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UniversityReadingListsStaff extends BaseClass {
	
// Object initialisation	
	public UniversityReadingListsStaff() {
		
		PageFactory.initElements(driver, this);
	}

	
//xpath locators
	
//Reading list icon on teaching tools screen
//@FindBy(xpath="//p[@title=\"University Library Reading List\" and @class=\"tool-title\"]")
@FindBy(xpath="//p[@title=\"University Library Reading List\" and @class=\"tool-title\"] | //p[@title=\"Reading List\" and @class=\"tool-title\"]")
public WebElement readinglisticonteachingtool;

//Plus icon on Reading list on teaching tools
//@FindBy(xpath="//p[@title=\"University Library Reading List\" and @class=\"tool-title\"]//following::button[1]")
@FindBy(xpath="//p[@title=\"University Library Reading List\" and @class=\"tool-title\"]//following::button[1] | //p[@title=\"Reading List\" and @class=\"tool-title\"]//following::button[1]")
public WebElement readinglistplusiconteachingtools;

//Books and tools link
@FindBy(xpath="//div[@class=\"name\"]//child::span[text()='Books & Tools']")
public WebElement readinglistandtoolslink;

// X icon on Books and tools
//@FindBy(xpath="//div[@data-page-title=\"Books & Course Tools\"]//child::button[@class=\"bb-close\"]")
//@FindBy(xpath="//div[@data-page-title=\"Books & Course Tools\"]//child::button[@class=\"bb-close\"]")
@FindBy(xpath="//div[@data-page-title=\"Books & Tools\"]//child::button[@class=\"bb-close\"]")
public WebElement xiconbookandtools;

//Reading list link on Books and tools side pane
//@FindBy(xpath="//a[@class=\"placement-link\"]//descendant::div[text()='University Library Reading List']")
@FindBy(xpath="//a[@class=\"placement-link\"]//descendant::div[text()='Reading List'] | //a[@class=\"placement-link\"]//descendant::div[text()='University Library Reading List']")
public WebElement readinglistlinkbooksandcoursetools;

//Plus icon on reading list link on Books and tools side pane
//@FindBy(xpath="//button[@class=\"standard-button light-background add-placement\" and @aria-label=\"Add University Library Reading List\"]")
@FindBy(xpath="//button[@class=\"standard-button light-background add-placement\" and @aria-label=\"Add University Library Reading List\"] | //button[@class=\"standard-button light-background add-placement\" and @aria-label=\"Add Reading List\"]")
public WebElement readinglistplusiconbooksandtools;

//Reading list item added to cours content area
@FindBy(xpath="//a[@class=\"content-title\"]//child::span[1]")
public WebElement readinglistitemcoursecontent;

//Reading list on content aread - Visibility menu
//@FindBy(xpath="(//span[text()='University Library Reading List'])[1]//following::div[1]")
@FindBy(xpath="(//span[text()='Reading List'or text()='University Library Reading List'])[1]//following::div[1]")
public WebElement readinglistvisibilitymenu;

//Reading list selecting visibile to sutdents
@FindBy(xpath="(//a[@class=\"visible-option visibility-label\"])[1]")
public WebElement readinglistmakevisibletostudents;

//Authenticate button on Reading list LTI launch
//@FindBy(xpath="//button[@id=\"popup-login-button\"]")
//@FindBy(xpath="//a[@id=\"loginContinue\"]")
@FindBy(xpath="(//button[contains(text(),'Start')])[1]")
public WebElement readinglistauthenticatebutton;

//Login id on library screen
@FindBy(xpath="//input[@id=\"userNameInput\"]")
public WebElement libraryloginid;

//Password on library screen
@FindBy(xpath="//input[@id=\"passwordInput\"]")
public WebElement librarypassword;

//Checkbox on library screen
@FindBy(xpath="//input[@type=\"checkbox\"]")
public WebElement librarylogincheckbox;

//Signin button on Library screen
@FindBy(xpath="//button[@type=\"submit\"]")
public WebElement librarysigninbutton;

//Reading list library LTI
@FindBy(xpath="//h1[text()='Reading Lists']")
public WebElement readinlistlibrarypage;

//X icon on LTI screen launched through Teaching tools
@FindBy(xpath="//div[@data-page-title=\"LTI Launch\"]//child::button[@class=\"bb-close\"]")
public WebElement xiconltiteachingtool;

//X icon on LTI screen launched through Books and tools
@FindBy(xpath="//div[@data-page-title=\"Books & Course Tools\"]//child::button[@class=\"bb-close\"]")
public WebElement xiconltibooksandtools;

//X icon on Teaching tools screen
@FindBy(xpath="//div[@data-page-title=\"Content Market\" or @data-page-title=\"Teaching Tools\"]//child::button[@class=\"bb-close\"]")
public WebElement xiconteachingtools;

//first reading list item in content area
//@FindBy(xpath="(//div[@class=\"content-item-row\"])[1]//descendant::span[text()='University Library Reading List']")
@FindBy(xpath="(//div[@class=\"content-item-row\"])[1]//descendant::span[text()='Reading List'] |(//div[@class=\"content-item-row\"])[1]//descendant::span[text()='University Library Reading List']")
public WebElement firstreadinglistiteminlist;

// Close reading list screen as student
@FindBy(xpath="(//button[@class=\"bb-close\"])[2]")
public WebElement xicononreadinglist;

// Methods

//Click book and tools link
	public void clickbooksandtoolslink() {
		BaseClass.webdriverwaitclickable(readinglistandtoolslink);
		BaseClass.highlighter(readinglistandtoolslink);
		readinglistandtoolslink.click();
	}

//Verfiy reading list is displayed on books and tools pane
	public void verifyreadinglistlink() {
		BaseClass.webdriverwaitclickable(readinglistlinkbooksandcoursetools);
		Assert.assertTrue("University Reading list LTI link is not displayed on Books & Tools pane",readinglistlinkbooksandcoursetools.isDisplayed());
		BaseClass.highlighter(readinglistlinkbooksandcoursetools);
		BaseClass.screenshotv2("Reading List LTI link - Books and Tools","Reading List");
		
	}
	
	
//Close books and tools side pane
	public void closebookandtools() {

		xiconbookandtools.click();
	}

//Verify reading list is displayed on teaching tools
	public void verifyreadinglistteachingtools() {
		BaseClass.webdriverwaitvisible(readinglisticonteachingtool);
		BaseClass.scrollintoview(readinglisticonteachingtool);
		Assert.assertTrue("University Reading list LTI link is not displayed on Teaching Tools screen",readinglisticonteachingtool.isDisplayed());
		BaseClass.highlighter(readinglisticonteachingtool);
		BaseClass.screenshotv2("Reading list LTI link - Teaching tools","Reading List");
			
	}
//Click reading list on teaching tools
	public void clickreadinglistteachingtools() {
		readinglisticonteachingtool.click();
	}
	

	
// Verify Authenticate button is displayed
	public void verifyauthenticatebutton() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().frame("lti-launch-iframe");
		
		Assert.assertTrue("Authenticate button on University Library LTI launch is not displayed",readinglistauthenticatebutton.isDisplayed());
		BaseClass.screenshotv2("Reading list LTI authenticate button","Reading List");
	}

// Click on Authenticate button
	public void clickauthenticatebutton() {
		readinglistauthenticatebutton.click();
		BaseClass.parentwindowhandle=driver.getWindowHandle();
		
	}

//Verify library login screen is displayed
	public void verifylibraryloginscreen() {
		BaseClass.windowhandle();
		Assert.assertTrue("Library login sceen is not displayed",libraryloginid.isDisplayed() );
		BaseClass.screenshotv2("Library login screen","Reading List");
	}
	
// Login to University library  
	public void stafflibrarylogin() throws InterruptedException {
		libraryloginid.sendKeys(BaseClass.prop.getProperty("staff_id"));
	    librarypassword.sendKeys(BaseClass.prop.getProperty("staff_pwd"));
		librarylogincheckbox.click();
		BaseClass.screenshotv2("Library login screen with login id","Reading List");
		librarysigninbutton.click();
	}
	
//Verify Library login is successful
	public void verifylibraryscreen() {
		driver.switchTo().window(BaseClass.parentwindowhandle);
		BaseClass.switchtoframe("lti-launch-iframe");
		//driver.switchTo().frame("lti-launch-iframe");
		Assert.assertTrue("University Reading list page is not displayed",readinlistlibrarypage.isDisplayed());
		BaseClass.highlighter(readinlistlibrarypage);
		BaseClass.screenshotv2("Library Reading list after login","Reading List");
		
	}
//Close library LTI screen
	public void closelibraryltiscreen() {
		driver.switchTo().defaultContent();
		BaseClass.webdriverwaitclickable(xiconltiteachingtool);
		xiconltiteachingtool.click();
	}

//Close Teaching tools sceen
	public void closeteachingtools() {
		xiconteachingtools.click();
	}

//Click plus icon on Reading list in Books and tools menu pane
	public void plusiconreadinglistbooksandtools(){
		BaseClass.highlighter(readinglistplusiconbooksandtools);
		BaseClass.screenshotv2("Reading list plus icon Books and tools","Reading List");
		readinglistplusiconbooksandtools.click();
	}
	
//Click plus icon on Reading list in Teaching tools
	public void plusiconreadinglistteachingtools() {
		BaseClass.highlighter(readinglistplusiconteachingtools);
		BaseClass.screenshotv2("Reading list plus icon Teaching tools","Reading List");
		readinglistplusiconteachingtools.click();
	}
	
// Verify addition of Reading list item in content area
	public void readinglistltilinkcontentarea() {
		String readinglistlink= firstreadinglistiteminlist.getText();
		Assert.assertTrue("Reading list LTI link is not added to content area", readinglistlink.contains("Reading List"));
	}

// Staff clicking on reading list item on course content area
	public void clickreadinglisticoncoursecontent() {
		firstreadinglistiteminlist.click();
	}
	
//Click on visibility list on University item on course content
	public void clickvisibilitymenu() {
		BaseClass.webdriverwaitclickable(firstreadinglistiteminlist);
		readinglistvisibilitymenu.click();
		BaseClass.screenshotv2("Readinglistvisbility","Reading List");
	}

//Select make visible to students
	public void selectvisibletostudents() {
		BaseClass.webdriverwaitclickable(readinglistmakevisibletostudents);
		readinglistmakevisibletostudents.click();
	}
	
//Reading list added to content area
	public void readinglistcontentarea() {
		BaseClass.webdriverwaitvisible(readinglistitemcoursecontent);
		Assert.assertTrue("University Reading list item is not added or not at the top",readinglistitemcoursecontent.getText().equalsIgnoreCase("University Reading Lists"));
		BaseClass.highlighter(readinglistitemcoursecontent);
		BaseClass.screenshotv2("Reading list added to content area","Reading List");
	}
	
	
// Student operation
	
	public void studentclickreadinglistlinkincontentarea() {
		firstreadinglistiteminlist.click();
	}
	
//Student can view reading list
	public void verifyreadinglistscreenStudents() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().frame("lti-launch-iframe");
		Assert.assertTrue("University Reading list page is not displayed",readinlistlibrarypage.isDisplayed());
		BaseClass.webdriverwaitvisible(readinlistlibrarypage);
		BaseClass.highlighter(readinlistlibrarypage);
		BaseClass.screenshotv2("Library Reading list after login Student","Reading List");
	}
// Student closing reading list window
	public void studentclosereadinglistwindow() {
		BaseClass.webdriverwaitclickable(xicononreadinglist);
		xicononreadinglist.click();
	}
	
}

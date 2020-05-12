package pages;

import java.awt.AWTException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PanoptoStaff extends BaseClass{
	
// Xpaths or locators
// Books and tools
	@FindBy(xpath="//div[@class=\"name\"]//child::span[text()='Reading List & Tools']")
	public WebElement readinglistandtoolslink;
	@FindBy(xpath="//a[@class=\"placement-link\"]//descendant::div[text()='Add Yourself to Panopto']")
	public WebElement panoptolinkbooksandtools;
	@FindBy(xpath="//button[@aria-label=\"Add Add Yourself to Panopto\"]")
	public WebElement panoptoplusiconbooksandtools;
	
// Panopto links on Teaching tools
	@FindBy(xpath="//p[@class=\"tool-title\" and @title=\"Panopto - Insert Video\"]")
	public WebElement panoptoinsertvideolinkteachingtools;
	@FindBy(xpath="//p[@class=\"tool-title\" and @title=\"Add Yourself to Panopto\"]")
	public WebElement panoptoaddyourselftopanoptoltilinkteachingtools;
	@FindBy(xpath="(//p[@class=\"tool-title\" and @title=\"Add Yourself to Panopto\"]/following::button)[1]")
	public WebElement panoptoaddyourselftopanoptoplusiconteachingtools;
	
// Panopto deeplinking
	@FindBy(xpath="//span[text()='Create']")
	public WebElement bbplusiconcreate;
	@FindBy(xpath="//h1[text()='Create Item']")
	public WebElement bbcreateitempane;
	@FindBy(xpath="//bb-translate[text()='Document']")
	public WebElement bbcreateitemdocumentlink;
	@FindBy(xpath="//h2[text()='Use this space to build your document.']")
	public WebElement bbnewdocumentscreenlaunch;
	@FindBy(xpath="//span[text()='Add Content']")
	public WebElement bbcreatedocumentaddcontentbutton;
	@FindBy(xpath="//div[@class=\"bb-editor-root\"]")
	public WebElement bbcreatedocumentaddcontenttextbox;
	//@FindBy(xpath="//button[@title=\"Insert Content\"]")
	@FindBy(xpath="//button[@title=\"Insert Content\" or @title=\"Insert content\"]")
	public WebElement bbcreatedocumentinsertcontentbutton;
	@FindBy(xpath="//button[@aria-label=\"Insert/Edit LTI Item\"]")
	public WebElement bbcreatedocumentinsertltiitem;
	@FindBy(xpath="//p[@class=\"tool-title\" and @title=\"Panopto - Insert Video\"]")
	public WebElement deeplinkingtechingtoolpanoptoinsertvideolink;
	@FindBy(xpath="//h1[text()='Teaching Tools'or text()='Content Market']")
	public WebElement teachingtoolslaunch;
	@FindBy(xpath="(//button[@class=\"bb-close\"])[2]")
	public WebElement xcreatedocumentscreen;
	
// Find elements for unavailability of Add yourself to Panopto on deeplinking
	@FindBys(@FindBy(xpath="//p[@class=\"tool-title\" and @title=\"Add Yourself to Panopto\"]"))
	public List<WebElement>nopanoptoprovisionondeeplink;

	
// Adding panopto folder to content area
	@FindBy(xpath="(//div[@class=\"content-item-row\"])[1]//child::a[@class=\"content-title\"]//child::span")
	public WebElement panoptofolderaddedtocontentarea;
	@FindBy(xpath="//button[@title=\"More options for Add Yourself to Panopto\"]")
	public WebElement panoptofolderellipsesbutton;
	@FindBy(xpath="//span[text()='Edit']")
	public WebElement panoptofoldercontentareaeditbutton;
	@FindBy(xpath="//h1[@title=\"Add Yourself to Panopto\"]")
	public WebElement panoptofoldereditpanelaunch;
	@FindBy(xpath="//button[@class=\"button super-clear edit-title\" and @type=\"button\"]")
	public WebElement panoptofoldercontentareaediticon;
	@FindBy(xpath="//div[@class=\"panel-title-input-container\"]/child::div/child::input")
	public WebElement panoptofolderedittitle;
//Visibility
	@FindBy(xpath="//div[@class=\"panel-row panel-content-inner\"]/descendant::bb-content-visibility-selector")
	public WebElement panoptoeditvisibility;
	@FindBy(xpath="//div[@class=\"panel-row panel-content-inner\"]/descendant::a[@class=\"visible-option visibility-label\"]")
	public WebElement panoptofoldermakevisibletostudents;
	@FindBy(xpath="//button[@type=\"submit\"]")
	public WebElement panoptofoldereditsavebutton;
	@FindBy(xpath="(//div[@class=\"visibility-label\"]/child::span)[1]")
	public WebElement visibilityoncontentarea;
//Panopto LTI screen
	@FindBy(xpath="//div[@id=\"createMenu\"]")
	public WebElement panoptoltiscreencreatebutton;
	@FindBy(xpath="//div[@class=\"input-controls\"]//child::input[@type=\"text\"]")
	public WebElement panoptofolderlist;
	@FindBy(xpath="//input[@id=\"searchQuery\"]")
	public WebElement panoptosearchbar;
	//@FindBy(xpath="//div[@class=\"folder selected\"]//div[@class=\"folder-title creator\"]")- -Only for instructor, below works for both student and staff
	@FindBy(xpath="//div[@class=\"folder selected\"]//div[@class=\"folder-title creator\" or @class=\"folder-title\"]")
	public WebElement panoptoltimodulefolder;
	@FindBy(xpath="//div[@class=\"main-text\" and text()='Upload media']")
	public WebElement panoptouploadmediabutton;
//Panopto Upload media 
	@FindBy(xpath="//div[@class=\"drop-target-inner-wrapper\"]")
	public WebElement panoptouploadcontentarea;
	@FindBy(xpath="//div[@id=\"batchHeader\"]//child::input[@type=\"text\"]")
	public WebElement uploadmediafolderlist;
	@FindBy(xpath="//div[@id=\"batchHeader\"]//child::div[@class=\"folder-picker inline\"]")
	public WebElement uploadmediaselectedfolder;
	@FindBy(xpath="//div[@id=\"batchHeader\"]//descendant::div[@class=\"folder selected\"]//child::div[@class=\"folder-title creator\"]")
	public WebElement uploadmediamodulefoldername;
	@FindBy(xpath="//div[@id=\"batchHeader\"]//descendant::a[@id=\"closeLink\"]")
	public WebElement uploadmediaclosebutton;
//Panopto - Add video link
	@FindBy(xpath="//div[@id=\"chooseTab\"]")
	public WebElement panoptochoosetab;
	@FindBy(xpath="//div[@id=\"uploadTab\"]")
	public WebElement panoptouploadtab;
	@FindBy(xpath="//div[@id=\"dropTarget\"]")
	public WebElement panoptouploadtabdragdrop;
	@FindBy(xpath="//div[@id=\"recordTab\"]")
	public WebElement panoptorecordtab;
	@FindBy(xpath="//input[@id=\"nameInput\"]")
	public WebElement panoptorecordtabentername;
	@FindBys(@FindBy(xpath="//table[@id=\"sessionList\"]//tr"))
	public List<WebElement> videosonpanopto;
	@FindBy(xpath="(//table[@id=\"sessionList\"]//tr)[1]")
	public WebElement firstvideoinlistonpanopto;
	@FindBy(xpath="//div[@id=\"ltiInsertButton\"]")
	public WebElement panoptoinsertbutton;
	@FindBy(xpath="(//table[@id=\"sessionList\"]//tr)[1]//div[@class=\"item-title\"]")
	public WebElement panoptovideotitle;
	@FindBy(xpath="(//a[@class=\"content-title\"])[1]")
	public WebElement panoptovideotitlebb;
	@FindBy(xpath="//div[@id=\"folderPicker\"]")
	public WebElement panoptofolderlistaddvideolink;
//Panopto add inline video to blackboard document
	@FindBy(xpath="//div[@class=\"editable-title-container\"]")
	public WebElement bbdocumenttitle;
	@FindBy(xpath="//button[text()='Save']")
	public WebElement bbdocumentsavebutton;
	@FindBy(xpath="//div[@class=\"action-item item-visibility\"]//child::button[@name=\"visibility-content\"]")
	public WebElement bbdocumentvisibility;
	@FindBy(xpath="//div[@class=\"action-item item-visibility\"]//child::button[@name=\"visibility-content\"]//following::span[text()='Visible to students']")
	public WebElement bbdocumentvisibletostudentoption;
	@FindBy(xpath="//button[@type=\"button\"]//descendant::span[text()='Insert']")
	public WebElement insertltiitembutton;
	@FindBy(xpath="//label[text()='Display Name']//following::input")
	public WebElement verifytitleinsertltipopup;
	@FindBy(xpath="(//a[@class=\"content-title\"])[1]")
	public WebElement bbdocumenttitleoncoursecontent;
	@FindBy(xpath="//div[@id=\"title\"]")
	public WebElement panoptovideotitlebbdocument;
	@FindBy(xpath="//i[@id=\"playIcon\"]")
	public WebElement bbdocumentvideoplayicon;
	
	
	
	
// Object initialisation
		public PanoptoStaff(){
			PageFactory.initElements(driver, this);
		}
//Public strings
		public static String videotitleonpanopto;

// Verify panopto link add yourself to panopto on Books and tools
		public void verifypanoptolinkbooksandtools() {
			BaseClass.webdriverwaitvisible(panoptolinkbooksandtools);
			Assert.assertTrue("Add yourself to Panopto is not displayed on Books and tools pane",panoptolinkbooksandtools.isDisplayed());
			BaseClass.highlighter(panoptolinkbooksandtools);
			BaseClass.screenshotv2("Panopto- Books and tools","Panopto");
		}
	
// Verify plus icon on Panopto - add yourself to panopto link
		public void verifypanoptolinkplusiconbooksandtools() {
			BaseClass.webdriverwaitvisible(panoptoplusiconbooksandtools);
			Assert.assertTrue("Plus icon next to Add yoursef to Panopto is not displayed", panoptoplusiconbooksandtools.isDisplayed());
			BaseClass.highlighter(panoptoplusiconbooksandtools);
		}
	
// Verify Panopto - Add video link on Teaching tools
		public void verifypanoptoaddvideolinkteachingtools() {
			BaseClass.scrollintoview(panoptoinsertvideolinkteachingtools);
			Assert.assertTrue("Panopto- Add video link is not displayed on Teaching tools", panoptoinsertvideolinkteachingtools.isDisplayed());
			BaseClass.highlighter(panoptoinsertvideolinkteachingtools);
		}
		
// Verify Panopto- Add yourself to Panopto LTI link is displayed on Teaching tools
		public void verifypanoptoaddyourselftopanoptoltilinkteachingtools() {
			BaseClass.highlighter(panoptoaddyourselftopanoptoltilinkteachingtools);
			//BaseClass.screenshotv2("Panopto folder provisioning- Content Market", "Panopto");
			Assert.assertTrue("Panopto Add yourself to Panopto lti link is not displayed on Teaching tools", panoptoaddyourselftopanoptoltilinkteachingtools.isDisplayed());			
		}

// Verify Panopto - Add yourself to Panopto plus icon is displayed on Teaching tools
		public void verifypanoptoaddyourselftopanoptoplusiconteachingtools() {
			Assert.assertTrue("Panopto Add yourself to Panopto plus icon not displayed on Teaching tools", panoptoaddyourselftopanoptoplusiconteachingtools.isDisplayed());
			BaseClass.screenshotv2("Panopto Links- Teaching tools", "Panopto");
		}

// Click on Create link on Blackboard content area
		public void bbclickcreate() {
			BaseClass.highlighter(bbplusiconcreate);
			//BaseClass.screenshotv2("Blackboard - Create", folder);
			bbplusiconcreate.click();
		}
		
//  Blackboard create item pane is displayed
		public void bbcreateitempane() {
			BaseClass.highlighter(bbcreateitempane);
		
		}

// Blackboard create item document link
		public void bbcreateitemdocumentlink() {
			BaseClass.webdriverwaitclickable(bbcreateitemdocumentlink);
			BaseClass.highlighter(bbcreateitemdocumentlink);
			BaseClass.screenshotv2("Blackboard- Create item- Document link", "Panopto");
			bbcreateitemdocumentlink.click();
		}

// Blackboard create new document screen
		public void bbcreatenewdocumentpage() {
			BaseClass.webdriverwaitvisible(bbnewdocumentscreenlaunch);
			Assert.assertTrue("Create new document screen is not loaded correctly", bbnewdocumentscreenlaunch.isDisplayed());
			BaseClass.screenshotv2("Blackboard- Create new document", "Panopto");
		}
		
// Blackboard create new document -  Click Add content button
		public void bbcreatedocumentaddcontentbutton(){
			BaseClass.highlighter(bbcreatedocumentaddcontentbutton);
			bbcreatedocumentaddcontentbutton.click();		
		}
		
// Blackboard create new document -  add content text box
		public void bbcreatedocumentaddcontenttextbox() {
			BaseClass.highlighter(bbcreatedocumentaddcontenttextbox);
			Assert.assertTrue("Add content text box is not displayed",bbcreatedocumentaddcontenttextbox.isDisplayed());
			BaseClass.screenshotv2("Blackboard - Create document Add content text box", "Panopto");
			
		}
		
// Blackboard create document -  click Insert content button	
		public void bbcreatedocumentinsertcontentbutton() {
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//			js.executeScript("arguments[0].click(, args);",bbcreatedocumentinsertcontentbutton);
			BaseClass.webdriverwaitvisible(bbcreatedocumentinsertcontentbutton);
			BaseClass.highlighter(bbcreatedocumentinsertcontentbutton);
			bbcreatedocumentinsertcontentbutton.click();
//			Actions a =new Actions(driver);
//			a.moveToElement(bbcreatedocumentinsertcontentbutton).click(bbcreatedocumentinsertcontentbutton).build().perform();
		}
		
// Blackboard create document- Insert LTI item
		public void bbcreatedocumentinsertltiitem() {
			Assert.assertTrue("Insert LTI item option is not listed on create document", bbcreatedocumentinsertltiitem.isDisplayed());
			BaseClass.highlighter(bbcreatedocumentinsertltiitem);
			BaseClass.screenshotv2("Blackboard- Create document- Insert LTI item", "Panopto");
			bbcreatedocumentinsertltiitem.click();
		}

// Teaching tools is launched
		public void teachingtoolslaunch() {
			BaseClass.webdriverwaitvisible(teachingtoolslaunch);
			Assert.assertTrue("Teaching tools screen is not displayed", teachingtoolslaunch.isDisplayed());
		}

// Deeplinking Teaching tools - Panopto- Insert Video link
		public void bbdeeplinkingteachingtoolspanoptoinsertvideolink() {
			BaseClass.scrollintoview(deeplinkingtechingtoolpanoptoinsertvideolink);
			Assert.assertTrue("Panopto - Insert video link is not displayed when teaching tools is launched through deeplink", deeplinkingtechingtoolpanoptoinsertvideolink.isDisplayed());
			BaseClass.highlighter(deeplinkingtechingtoolpanoptoinsertvideolink);
			BaseClass.screenshotv2("Deeplink Panopto insert video link", "Panopto");
		}
		
// Deeplinking teaching tools - Panopto Add yourself to Panopto should not be displayed
		public void bbdeeplinkingteachingtoolsaddyourselfnotdisplayed() {
			Assert.assertEquals(0, nopanoptoprovisionondeeplink.size());
	
		}
		
// Close Create document screen
		public void bbclosecreatedocumentscreen() {
			driver.switchTo().defaultContent();
			BaseClass.webdriverwaitvisible(xcreatedocumentscreen);
			xcreatedocumentscreen.click();
		}
		
/*
 * 
 * 
 * Add Panopto Folder to content area and access the module folder on Panopto
 * 
 * 		
 */
// Click + icon on Add yourself to Panopto on Teaching tools
		public void panoptoplusiconaddyourselfpanoptoteachingtools() {
			BaseClass.highlighter(panoptoaddyourselftopanoptoplusiconteachingtools);
			panoptoaddyourselftopanoptoplusiconteachingtools.click();
		}
		
// Verify Panopto folder is added to content area
		public void verifypanoptofolderoncontentarea() {
			BaseClass.webdriverwaitvisible(panoptofolderaddedtocontentarea);
			Assert.assertTrue("Panopto folder is not added to content area or not first itme in content area", panoptofolderaddedtocontentarea.getText().equalsIgnoreCase("Add Yourself to Panopto"));
			BaseClass.highlighter(panoptofolderaddedtocontentarea);
			BaseClass.screenshotv2("Panopto- Folder added to content area", "Panopto");
		}

// Click on ellipses button on Panopto folder on content area
		public void panoptofolderclickellipsescontentarea() {
			BaseClass.highlighter(panoptofolderellipsesbutton);
			panoptofolderellipsesbutton.click();
		}
		
// Click on edit button
		public void panoptofoldereditcontentarea() {
			panoptofoldercontentareaeditbutton.click();
		}
		
// 	Verify Edit Panopto folder item is launched
		public void verifypanoptofoldereditpane() {
			Assert.assertTrue("Edit pane is not launched", panoptofoldereditpanelaunch.isDisplayed());
		}
		
// Click on title to edit 
		public void editpanoptofoldertitleoncontentarea() {
			BaseClass.highlighter(panoptofoldercontentareaediticon);
			panoptofoldercontentareaediticon.click();
			BaseClass.webdriverwaitvisible(panoptofolderedittitle);
			panoptofolderedittitle.clear();
			BaseClass.webdriverwaitvisible(panoptofolderedittitle);
			panoptofolderedittitle.sendKeys(prop.getProperty("panoptotitle"));
		}
		
// Update visibility to visible to students
		public void panoptofoldermakevisibiletostudents() {
			BaseClass.highlighter(panoptoeditvisibility);
			panoptoeditvisibility.click();
			panoptofoldermakevisibletostudents.click();
			BaseClass.screenshotv2("Panopto folder- edit content area", "Panopto");
			
		}

// Click save button on Edit pane
		public void panoptofoldereditsavebutton() {
			panoptofoldereditsavebutton.click();
		}
	
	
		
// Verify new title on content area
		public void panoptoverifyupdatedtitleoncontentarea()  {
			BaseClass.webdriverwaitvisible(panoptofolderaddedtocontentarea);
			BaseClass.highlighter(panoptofolderaddedtocontentarea);
			Assert.assertTrue("Panopto folder updated title is not displayed on content area", panoptofolderaddedtocontentarea.getText().equalsIgnoreCase(prop.getProperty("panoptotitle")));
			
		}

// Verify update visibility status 
		public void panoptovisiblitypostedit() {
			Assert.assertTrue("Panopto Folder visibility is not visible to students on content area post edit", visibilityoncontentarea.getText().equalsIgnoreCase("Visible to Students"));
			BaseClass.highlighter(visibilityoncontentarea);
			BaseClass.screenshotv2("Panopto folder- after edit content area", "Panopto");
		}
	
// Click on Panopto folder link
		public void panoptofoldercontentareaclick() {
			panoptofolderaddedtocontentarea.click();
		}

// Verify Panopto LTI screen is displayed
		public void panoptoltilaunch() {
			BaseClass.switchtoframe("lti-launch-iframe");
			//driver.switchTo().frame("lti-launch-iframe");
			BaseClass.webdriverwaitclickable(panoptoltiscreencreatebutton);
			try {
			Assert.assertTrue("Create button on Panopto screen is not displayed",panoptoltiscreencreatebutton.isDisplayed());
			}
			catch(NoSuchElementException e) {
				System.out.println("Unable to locate Create button on Panopto LTI screen");
			
			}
		}
// Verify Module folder name on Panopto
		public void modulenameonpanoptolti() {
			
			panoptofolderlist.click();
			BaseClass.webdriverwaitvisible(panoptoltimodulefolder);
			try {
				Assert.assertTrue("Module name does not match with folder name on Panopto", panoptoltimodulefolder.getText().equals(BaseClass.prop.getProperty("coursenameultra")));
			}
			catch(NoSuchElementException e) {
				System.out.println("Unable to locate module folder name on Panopto LTI");
			}
		}
// Click create button on Panopto LTI screen
		public void clickcreatepanopto() {
			panoptosearchbar.click();
			//BaseClass.highlighter(panoptoltiscreencreatebutton);
			panoptoltiscreencreatebutton.click();
		}
		
// Click Upload media button
		public void clickuploadmediapanopto() {
			BaseClass.highlighter(panoptouploadmediabutton);
			BaseClass.screenshotv2("Panopto Upload media", "Panopto");
			panoptouploadmediabutton.click();
		}
// Upload content area is displayed
		public void uploadcontentareapanopto() {
			BaseClass.switchtoframe("modalIframe");// Switch to Upload media frame
			BaseClass.webdriverwaitclickable(panoptouploadcontentarea);
			BaseClass.screenshotv2("Panopto upload content", "Panopto");
			panoptouploadcontentarea.isDisplayed();
		}

// Click folder list on Upload media screen
		public void clickfolderlistuploadmedia() {
			BaseClass.highlighter(uploadmediafolderlist);
			uploadmediafolderlist.click();
		}
		
// Verify folder name on upload media screen and Panopto LTI screen
		public void modulefoldernameonpanopto() {
			BaseClass.highlighter(uploadmediamodulefoldername);
			
			Assert.assertTrue("Module folder name Panopto does not match the module name", uploadmediamodulefoldername.getText().equals(BaseClass.prop.getProperty("coursenameultra")));
			//uploadmediaselectedfolder.click();
			uploadmediafolderlist.sendKeys(Keys.ESCAPE);
		}

// Upload a local file 
		public void uploadfiletopanopto() throws AWTException, Exception {
			BaseClass.webdriverwaitclickable(panoptouploadcontentarea);
			panoptouploadcontentarea.click();
			try {
			Thread.sleep(5000);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
			BaseClass.copytoclipboard("videolocation1");
			Thread.sleep(5000);
			BaseClass.robotpastingfromclipboard();
			
		}
	
// Close Upload media screen
		public void closeuploadmediascreen() {
			BaseClass.screenshotv2("Panopto upload media module folder name", "Panopto");
			uploadmediaclosebutton.click();
			driver.switchTo().parentFrame();
		}
	

/*
 * 
 * Panopto Add video link
 * 		
 */

// Verify Panopto Insert video link on Content market
		public void clickpanoptoinsertvideo() {
			BaseClass.scrollintoview(panoptoinsertvideolinkteachingtools);
			BaseClass.highlighter(panoptoinsertvideolinkteachingtools);
			BaseClass.screenshotv2("Panopto Insert video link", "Panopto");
			panoptoinsertvideolinkteachingtools.click();
			//BaseClass.switchtoframe("lti-launch-iframe");
		}
		
//Verify module folder on Panopto insert video screen
		public void modulefolderonpanoptoinsertvideolink() {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			driver.switchTo().frame("lti-launch-iframe").switchTo().frame("ltiSessionPicker");
			BaseClass.implicitlywait(10);
			panoptofolderlistaddvideolink.click();
			//BaseClass.switchtoframe("ltiSessionPicker");
			BaseClass.highlighter(uploadmediamodulefoldername);
			
			Assert.assertTrue("Module folder name Panopto does not match the module name", uploadmediamodulefoldername.getText().equals(BaseClass.prop.getProperty("coursenameultra")));
			//uploadmediaselectedfolder.click();
			uploadmediafolderlist.sendKeys(Keys.ESCAPE);
		}
// Click Upload tab
		public void clickuploadtab() {
			BaseClass.webdriverwaitclickable(panoptouploadtab);
			panoptouploadtab.isDisplayed();
			BaseClass.highlighter(panoptouploadtab);
			panoptouploadtab.click();
		}

// Verify drag and drop section is displayed
		public void uploadtabdragdrop() {
			
			BaseClass.highlighter(panoptouploadtabdragdrop);
			panoptouploadtabdragdrop.isDisplayed();
			BaseClass.screenshotv2("Panopto Insert video- Upload tab", "Panopto");
		}
		
// Click Record tab
		public void clickrecordtab() {
			panoptorecordtab.isDisplayed();
			BaseClass.highlighter(panoptorecordtab);
			panoptorecordtab.click();
								
		}

//Verify Record tab is loaded
		public void recordentername() {
			BaseClass.webdriverwaitvisible(panoptorecordtabentername);
			panoptorecordtabentername.isDisplayed();
			BaseClass.highlighter(panoptorecordtabentername);
			BaseClass.screenshotv2("Panopto Insert video- Record tab", "Panopto");
		}
		
//Click Choose tab
		public void clickchoosetab() {
			panoptochoosetab.click();
		}

//Verfiy video is available to add
		public void verifyvideoavailabilitytoadd() {
			
			if(videosonpanopto.size()>0) {
				
				firstvideoinlistonpanopto.click();
				videotitleonpanopto = panoptovideotitle.getText();
				
					
			}
			else {
				throw new RuntimeException("No videos available on Panopto to add");
			}
			
		}
		
// Click on Insert button
		public void panoptoclickinsertbutton() {
			driver.switchTo().parentFrame();
			BaseClass.webdriverwaitvisible(panoptoinsertbutton);
			
			panoptoinsertbutton.click();
			
		}
//Verify video is added to Blackboard content area
		public void verifyvideolinkonBlackboard() {
			
			BaseClass.webdriverwaitclickable(panoptovideotitlebb);
			BaseClass.highlighter(panoptovideotitlebb);
			BaseClass.screenshotv2("Panopto video link on blackboard", "Panopto");
			Assert.assertTrue("Panopto video title on Blackboard does not match",panoptovideotitlebb.getText().contains(videotitleonpanopto));
		}
		
/*
 * 
 * 
 * Panopt0- Add inline video to Blackboard document
 * 	
 */
		
		
//Enter Blackboard document title
		public void bbdocumenttitle() {
		
			Actions act =new Actions(driver);
			act.sendKeys(BaseClass.prop.getProperty("bbdocumenttitlepanopto")).build().perform();
		}
		
// verify video title on insert lti popup on blackboard
		public void verifyvideotitleoninsertltipopup() {
			driver.switchTo().defaultContent();
			String displayname=verifytitleinsertltipopup.getAttribute("value");
					Assert.assertTrue("Panopto video title does not match with display name on insert lti popup", displayname.equals(PanoptoStaff.videotitleonpanopto));
			}
						
		
//Click insert button on insert lti item popup on Blackbord
		public void clickinsertltiitembb() {
			BaseClass.webdriverwaitclickable(insertltiitembutton);
			insertltiitembutton.click();
		}

//Verify save button is enabled and click
		public void savebuttonbbdocument() {
			
			
			BaseClass.webdriverwaitclickable(bbdocumentsavebutton);
			
			Assert.assertTrue("Save button is not enabled on blackboard document", bbdocumentsavebutton.isEnabled());
			bbdocumentsavebutton.click();
		}
	
// Update document visibility for students
		public void bbdocumentvisibility() {
			driver.switchTo().defaultContent();
			BaseClass.screenshotv2("Panopto inline video on Blackboard document", "Panopto");
			bbdocumentvisibility.click();
			BaseClass.webdriverwaitclickable(bbdocumentvisibletostudentoption);
			bbdocumentvisibletostudentoption.click();
		}

	
//Verify document is added to content area
		public void verifybbdocumentaddedtocoursecontent() {
			BaseClass.webdriverwaitvisible(bbdocumenttitleoncoursecontent);
			BaseClass.highlighter(bbdocumenttitleoncoursecontent);
			Assert.assertTrue("Blackboard document is not added to content area or is not the first item",bbdocumenttitleoncoursecontent.getText().equals(BaseClass.prop.getProperty("bbdocumenttitlepanopto")));
			
		}
		
//Verify Visibility of document on content area
		public void verifydocumentvisibility() {
			
			Assert.assertTrue("Blackboard document visibility is not visible to students on content area", visibilityoncontentarea.getText().equalsIgnoreCase("Visible to Students"));
			BaseClass.screenshotv2("Blackboard document with Panopto inline video link", "Panopto");
		}
		
// Verify video title on Blackboard document
		public void verifyvideotitleondocument() {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title=\"Embedded Content iFrame\"]")));
			BaseClass.webdriverwaitvisible(panoptovideotitlebbdocument);
			BaseClass.highlighter(panoptovideotitlebbdocument);
			Assert.assertTrue("Panopto video title on bb document does not match",panoptovideotitlebbdocument.getText().trim().equals(PanoptoStaff.videotitleonpanopto));
			bbdocumentvideoplayicon.click();
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

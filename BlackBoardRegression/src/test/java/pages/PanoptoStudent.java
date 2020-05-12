package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;



public class PanoptoStudent extends BaseClass{

	
// Object initialisation 
	public PanoptoStudent() {
		PageFactory.initElements(driver, this);
	}
	
// Xpaths or Locators 
	
//Panopto video link
	@FindBy(xpath="(//a[@class=\"content-title\"])[1]")
	public WebElement panoptovideotitlebbstudent;
	@FindBy(xpath="//div[@id=\"title\"]")
	public WebElement videotitleonpanoptostudent;
	@FindBy(xpath="//div[@id=\"playIconContainer\"]//child::i[@id=\"playIcon\"]")
	public WebElement videoplayiconstudent;
	@FindBy(xpath="//div[@data-page-title=\"LTI Launch\"]//button[@class=\"bb-close\"]")
	public WebElement xiconltiscreen;
	
	
	
	@FindBys(
			@FindBy(xpath="//button[@aria-label=\"Add Add Yourself to Panopto\"]"))
	public List<WebElement> noplusiconpanoptostudent;
	
	
	
	
// Methods
	
// verify plus icon for Panopto is not displayed for students on Books and tools
	public void noplusiconpanoptostudentsbooksandtools() {
		Assert.assertEquals(0, noplusiconpanoptostudent.size());
		BaseClass.screenshotv2("Panopto- Student- Books and tools", "Panopto Student");
	}
	
	
/*
 * 
 * Panopto Video link
 */
	
//Panopto Video link
	public void verifyvideolinkcontentareastudent() {
		BaseClass.highlighter(panoptovideotitlebbstudent);
		BaseClass.screenshotv2("Panopto video link- student", "Panopto Student");
		Assert.assertTrue("Panopto video link tile for students is not matching",panoptovideotitlebbstudent.getText().trim().contains(PanoptoStaff.videotitleonpanopto));
		
	}
	
//Click panopto video link
	public void clickpanoptovideolinkstudent() {
		
		panoptovideotitlebbstudent.click();
	}
	
//Compare video title on Panopto launch screen
	public void videotitleonpanoptostudent() {
		BaseClass.switchtoframe("lti-launch-iframe");
		BaseClass.webdriverwaitvisible(videotitleonpanoptostudent);
//		System.out.println(videotitleonpanoptostudent.getText().trim());
//		System.out.println(PanoptoStaff.videotitleonpanopto);  
		BaseClass.screenshotv2("Panopto- Launch video", "Panopto Student");
		Assert.assertTrue("Video title on Panopto screen does not match for students", videotitleonpanoptostudent.getText().trim().contains(PanoptoStaff.videotitleonpanopto));
		BaseClass.highlighter(videotitleonpanoptostudent);
	}
	
//Play icon is displayed
	public void playiconstudent() {
		Assert.assertTrue("Play icon is not displayed to students",videoplayiconstudent.isDisplayed());
		BaseClass.highlighter(videoplayiconstudent);
		
	}
	
// Click play button
	public void clickplayicon() {
		videoplayiconstudent.click();
	}
	
	
// Click X icon on LTI screen
	public void clickxiconltiscreen() {
		driver.switchTo().defaultContent();
		xiconltiscreen.click();
	}
	
	
//Click First item in course content area as student
	public void  clickbbdocumentoncoursecontent() {
		
		panoptovideotitlebbstudent.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}

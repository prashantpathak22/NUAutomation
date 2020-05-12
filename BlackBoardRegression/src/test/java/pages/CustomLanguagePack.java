package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomLanguagePack extends BaseClass{
	
	
	
public CustomLanguagePack() {
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//h1[@id=\"main-heading\"]")
	public WebElement modulesandprogrames;
	@FindBy(xpath="//h2[@bb-translate=\"course.outline.contentHeaderLabel\"]")
	public WebElement contentarea;

	
	
	
	
	
	
		
	
	
}

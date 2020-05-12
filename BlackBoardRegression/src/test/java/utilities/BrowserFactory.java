package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BrowserFactory {
 public static Properties prop;
	
 @Before
	public static WebDriver beforemethod(WebDriver driver) throws IOException {
		prop=new Properties();
		FileInputStream propfile= new FileInputStream("C:\\Users\\LLHQ6\\eclipse-workspace\\BlackBoardRegression\\src\\test\\resources\\bbresources\\properties.properties");
		prop.load(propfile);
		String browser=	prop.getProperty("browsertolaunch");
		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", prop.getProperty("Chromedriver"));
			driver = new ChromeDriver();
						
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", prop.getProperty("Geckodriver"));
			driver = new FirefoxDriver();
		
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", prop.getProperty("Edgedriver"));
			driver = new EdgeDriver();
			
		}
		else if(browser.equalsIgnoreCase("Safari"))
		{
			System.setProperty("webdriver.safari.driver", prop.getProperty("Safaridriver"));
			driver = new SafariDriver();
			
		}
		else
		{
			System.out.println("Invalid browser name in properties file");;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get(prop.getProperty("BBStagingurl"));
		return driver;
	}
	
 @After
	public static void afttermethod(WebDriver driver) {
		
		driver.quit();
		
	}
	
}

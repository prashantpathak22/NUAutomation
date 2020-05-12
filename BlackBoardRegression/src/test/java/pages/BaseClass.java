package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.BrowserFactory;

public class BaseClass {
	 protected static WebDriver driver;
	 protected static Properties prop;

/**
 * BaseClass is the super class, holds reusable functions
 * any modifications to this will impact every other test class
 * Keep all method static so that they can be called by Class name
 * Created - 02 May 2019
 * Created by- Prashant Pathak
 * 
 */
	 
	 
// Variable for current Turnitin assignment
	 public static String currentultratitle ;
	 

	 
	
	 
 
//Loading property file	
	public static void loadprop() {
		prop=new Properties();
		FileInputStream propfile;
		try {
			propfile = new FileInputStream("C:\\Users\\LLHQ6\\eclipse-workspace\\BlackBoardRegression\\src\\test\\resources\\bbresources\\properties.properties");
			prop.load(propfile);
			} 
		catch (IOException e) {
			
			e.printStackTrace();
			}
		}


	
//Initialisations , setting up driver and launching browser
	public static void initialisation() throws IOException {
		loadprop();
	
		String browser=	prop.getProperty("browsertolaunch");
		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", prop.getProperty("Chromedriver"));
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
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
		driver.manage().deleteAllCookies();		
		driver.get(prop.getProperty("BBStagingurl"));
		}
	public static void studentlogin() {
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='button-1']")).click();
		driver.findElement(By.xpath("//input[@id='user_id']")).sendKeys(BaseClass.prop.getProperty("student_id"));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(BaseClass.prop.getProperty("student_pwd"));
		driver.findElement(By.xpath("//input[@id='entry-login']")).click();
		}
	public static void studentlogin2() {
		driver.findElement(By.xpath("//button[@class='button-1']")).click();
		driver.findElement(By.xpath("//input[@id='user_id']")).sendKeys(BaseClass.prop.getProperty("student_id2"));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(BaseClass.prop.getProperty("student_pwd"));
		driver.findElement(By.xpath("//input[@id='entry-login']")).click();
		}
	public static void studentlogin3() {
		driver.findElement(By.xpath("//button[@class='button-1']")).click();
		driver.findElement(By.xpath("//input[@id='user_id']")).sendKeys(BaseClass.prop.getProperty("student_id3"));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(BaseClass.prop.getProperty("student_pwd"));
		driver.findElement(By.xpath("//input[@id='entry-login']")).click();
		}
	
	public static void stafflogin() {
		driver.findElement(By.xpath("//button[@class='button-1']")).click();
		driver.findElement(By.xpath("//input[@id='user_id']")).sendKeys(BaseClass.prop.getProperty("staff_id"));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(BaseClass.prop.getProperty("staff_pwd"));
		driver.findElement(By.xpath("//input[@id='entry-login']")).click();
		}
		
//Close method
	
	public static void afttermethod() {
		
		driver.quit();
		
		}
	
	
//Screen capture	
	public  static void screenshot(String filename) {
		
		try {
			TakesScreenshot scrnshot = ((TakesScreenshot)driver);
			File srcFile= scrnshot.getScreenshotAs(OutputType.FILE);
			Date date= new Date();
			String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(date);
			File destFile= new File( "C:\\Automation\\Screenshots\\"+filename+" "+timestamp+".png");
			FileUtils.copyFile(srcFile, destFile);
			}
			
			 
		catch (IOException e) {
	
			e.printStackTrace();
			}
		}
	
	
// New Screen capture to store screen shots at specific folder
		
public  static void screenshotv2(String filename, String folder) {
		
		try {
			TakesScreenshot scrnshot = ((TakesScreenshot)driver);
			File srcFile= scrnshot.getScreenshotAs(OutputType.FILE);
			Date date= new Date();
			String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(date);
			String currentdate = new SimpleDateFormat("yyyy-MM-dd").format(date);
		//Folder creation date check
			String dynamicfolder= "C:\\Automation\\Screenshots\\"+folder+"\\"+currentdate+"\\";
			File dynamicfilelocation = new File("C:\\Automation\\Screenshots\\"+folder+"\\"+currentdate);
		//Check for folder availability
			if(dynamicfilelocation.isDirectory()) {
				File destFile= new File( dynamicfolder+filename+" "+timestamp+".png");
				FileUtils.copyFile(srcFile, destFile);
			}
			else {
				dynamicfilelocation.mkdirs();
				File destFile= new File( dynamicfolder+filename+" "+timestamp+".png");
				FileUtils.copyFile(srcFile, destFile);
			}
			
//			File destFile= new File( dynamicfolder+filename+" "+timestamp+".png");
//			FileUtils.copyFile(srcFile, destFile);
//			}
//			else if(folder.equalsIgnoreCase("Reading List")) {
//				String dynamicfolder= "C:\\Automation\\Screenshots\\Panopto\\";
//				
//				File destFile= new File( dynamicfolder+filename+" "+timestamp+".png");
//				FileUtils.copyFile(srcFile, destFile);
//			}
			
		} 
		catch (IOException e) {
	
			e.printStackTrace();
			}
		}
//Element higlighter	
	public static  void highlighter(WebElement element) {
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background:Yellow; border:2px solid red')",element);
		}
	
//Scroll to bottom	
	public static void scrolltobottom() throws AWTException  {
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}

//Scroll to Right
	public static void scrolltoright() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(5000,0)");
			
		
	}
	
//Get xml configuration file path
	public static String getextentconfigpath() {
		String configpath=prop.getProperty("extentreportconfigpath");
		if(configpath!=null)return configpath;
		else throw new RuntimeException("Report config path is not correct or specified");
		}
	
	
//Current date	
	public static String currenttimestamp() {
		Date date= new Date();
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(date);
		return timestamp;
		}
	
//Ultra Title name 	
	public static String getultratitle() {
		//String ultratitle= prop.getProperty("UltraTitle") + currenttimestamp();
		//return ultratitle;
		 currentultratitle= prop.getProperty("UltraTitle") +" "+currenttimestamp();
		return currentultratitle;
		
		}
	
//Scroll into view	
	public static void scrollintoview(WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		}

// Implicit wait
	public static void implicitlywait(int x) {
		driver.manage().timeouts().implicitlyWait(x,TimeUnit.SECONDS);
		}
	
//WebDriver Wait till element clickable 
	public static void webdriverwaitclickable(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,20);
		element = wait.until(ExpectedConditions.elementToBeClickable(element));
		}

//WebDriver wait till element is visible
	public static void webdriverwaitvisible(WebElement element) {
		WebDriverWait wait= new WebDriverWait(driver,20);
		element=wait.until(ExpectedConditions.visibilityOf(element));
	}



//File Upload utility 
	public static void copytoclipboard(String location) {
		Clipboard clip= Toolkit.getDefaultToolkit().getSystemClipboard();
		String filelocation= prop.getProperty(location);
		StringSelection stringselection= new StringSelection(filelocation);
		clip.setContents(stringselection, null);
		
	}
//Robot for pasting from Clipboard
	public static void robotpastingfromclipboard() throws AWTException, Exception {
		Thread.sleep(5000);
		Robot rb= new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
//Window handle
	public static String parentwindowhandle;
	public static void  windowhandle() {
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles();
		//System.out.println(handles.size());
	
		Iterator<String> iterator = handles.iterator();
		//for(String handler : driver.getWindowHandles()){
	while(iterator.hasNext()){
		 subWindowHandler = iterator.next();
		 if(!parentwindowhandle.equalsIgnoreCase(subWindowHandler)) {
			 driver.switchTo().window(subWindowHandler);
			// System.out.println(subWindowHandler);
		
		 	}
		}
	}
	
	
	
	
//Switch to LTI frame
	public static void switchtoframe(String frameidorname) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().frame(frameidorname);
	}
	
	


	
// public array with student names
	public static String[] studentnamearray= new String[] {"testteam Student2","testteam Student3","testteam Student4"};
	
	
// 
//Get current scenario name


//	staticstudentnamelist.add("testteam Student2");
//	staticstudentnamelist.add("testteam Student3");
//	staticstudentnamelist.add("testteam Student4");
	
	//select created Turnitinassignment
	//public static  String currentassignment = null ;
	//public  static String currentassignmentname() {
//		//String currentassignment = "UltraAssignmentTest1907";
//		String currentassignment;
//		WebElement e = driver.findElement(By.xpath("//input[@id=\"title\"]"));
//		  currentassignment= e.getText();
//		  return currentassignment;
	//}
	//public static String studentselectingassignment() {
	//	
//		String assignmenttitletoselect = currentassignment;
//		return assignmenttitletoselect;
	//}
}


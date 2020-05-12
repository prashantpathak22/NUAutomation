package testRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

//import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pages.BaseClass;



@RunWith(Cucumber.class)
@CucumberOptions(junit= "--step-notifications",
features= "src/test/resources/featurefiles",
glue= {"stepdefinition"},
tags= {//"@Panoptoplacements"
		//"@PanoptoStaff"
		//"@PanoptoComplete"
		"@BlackboardRegression"
		//"@ReadinglistComplete"
		//"@UltraTIIsubmissiondropbox"
		//"@UltraTIIsubmissionFile"
		//"@UltraTIIComplete,@Turnitingradestaff"
		//"@UltraTIIComplete"
		//"@UltraTIIsubmissionText"
		//"@Readingliststaff"
		//"@UltraTIIsetup"
		//"@Readingliststudent"
		//"@Turnitingradestaff",
		},

plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
//"com.vimalselvam.cucumber.ExtentCucumberFormatter:target/reports/ExtentReport.html"},
//"com.cucumber.listener.ExtentCucumberFormatter:target/reports/ExtentReportCucumber.html"},
//"pretty", "html:target/reports/reports.html"},
monochrome=true)

public class Runner {
/**
@AfterClass
 public static void writeextentreport() {
   Reporter.loadXMLConfig(new File("/BlackBoardRegression/src/test/resources/bbresources/extentreportconfig.XML"));
   BaseClass.afttermethod();
 }
 **/
	
@AfterClass
public static void closeeverything() {
	BaseClass.afttermethod();
}


@BeforeClass
 public static void reportproperties() {
  System.setProperty("extent.reporter.html.start", "true");
  System.setProperty("extent.reporter.html.config", "C:\\Users\\LLHQ6\\eclipse-workspace\\BlackBoardRegression\\src\\test\\resources\\bbresources\\extentreportconfig.XML");
  System.setProperty("extent.reporter.html.out", "target/HtmlReport/BlackboardReport.html");
}
}




	




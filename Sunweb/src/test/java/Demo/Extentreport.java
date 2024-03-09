package Demo;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import baseclass.base;

public class Extentreport  extends base{
	
	
	@Test
	
	public void logintest() {
		
		ExtentReports report = new ExtentReports("./Advanced reports/logintest.html");
		ExtentTest test =report.startTest("logintest");
		test.log(LogStatus.INFO,"Navigated to welcome screen");
		test.log(LogStatus.INFO,"Clicked on login button");
		test.log(LogStatus.FAIL,"Login page is not displayed");
		report.endTest(test);
		report.flush();
	
		
		
		
		
		
	}

}

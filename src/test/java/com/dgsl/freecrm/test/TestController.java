package com.dgsl.freecrm.test;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.*;

import com.dgsl.freecrm.base.TestBase;
import com.dgsl.freecrm.util.Resources;
import com.dgsl.freecrm.util.ScreenshotUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class TestController extends Resources{
	
	@BeforeMethod
	public void setUp() throws IOException{
		Initialize();
		}
	
	
	@BeforeTest
	public void extentTest(){
		report = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentReport.html", true);
		report.addSystemInfo("OS", "Windows - PC");
		report.addSystemInfo("Environment", "Test Environment");
		report.addSystemInfo("Test Name", "Smoke Test");
		}
	
	
	@Test
	public void TestCaseController() throws Exception{
		
		//Loop through the Test case
		for(int TC = 2; TC<=TestSuite.getRowCount("TestCase"); TC++){
			
			String TestCaseID = TestSuite.getCellData("TestCase", "TCID", TC);
			String RunMode = TestSuite.getCellData("TestCase", "RunMode", TC);
			
			if(RunMode.equals("Y")){
				String TSStatus = "Pass";
				
				TestBase.initConfig();
				TestBase.initBrowser();
				
				int rows = TestSuiteData.getRowCount(TestCaseID);
				if(rows<2){
					rows = 2;
				}
				
				//Loop through the Test Suite Data i.e Loop through
				//the number of rows of test data
				for(int TD = 2; TD<=rows; TD++){
					
					//Loop Through the Test Steps in Test suite
					System.out.println("TestSuite.getRowCount(TestCaseID)" + TestSuite.getRowCount(TestCaseID));
					
					for(int TS=2; TS<=TestSuite.getRowCount(TestCaseID); TS++){
						keyword = TestSuite.getCellData(TestCaseID, "Keyword", TS);
						webElement = TestSuite.getCellData(TestCaseID, "WebElement", TS);
						TSID = TestSuite.getCellData(TestCaseID, "TSID", TS);
						Description = TestSuite.getCellData(TestCaseID, "Description", TS);
						
						TestDataField = TestSuite.getCellData(TestCaseID, "TestDataField", TS);
						
						TestData = TestSuiteData.getCellData(TestCaseID, TestDataField, TD);		
						
						Method method = Keywords.class.getMethod(keyword);
						TSStatus = (String)method.invoke(method);
						
						if(TSStatus == "Fail"){
							ScreenshotUtil.getScreenshot(driver, getClass().getSimpleName());
						}
						
					}
				}	
			}
		}
	}
	
	
	@AfterMethod
	public void endReport(ITestResult result) throws IOException{
		if(result.getStatus() == ITestResult.FAILURE){
			test.log(LogStatus.FAIL, "Test Case Failed is : " + result.getName());
			test.log(LogStatus.FAIL, "Test Case Failed is : " +result.getThrowable());
			
			String screenshotPath = ScreenshotUtil.getScreenshot(driver, result.getName());
			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
		}else if(result.getStatus() == ITestResult.SUCCESS){
			test.log(LogStatus.PASS, "Test Case Passed is : " + result.getName());
		}else if(result.getStatus() == ITestResult.SKIP){
			test.log(LogStatus.SKIP, "Test Case Skipped is : " +result.getName());
		}
	}
	
	
	@AfterTest
	public void tearDown(){
		report.flush();
		report.close();
		driver.quit();
	}
}

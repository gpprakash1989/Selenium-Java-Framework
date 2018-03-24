package com.dgsl.freecrm.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.dgsl.freecrm.util.Constants;
import com.dgsl.freecrm.util.Xls_Reader;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Resources {
	
	protected static WebDriver driver;
	
	protected static File file;
	protected static String keyword;
	protected static String webElement;
	protected static String TSID;
	protected static String Description;
	protected static String TestDataField;
	protected static String TestData;
	protected static ExtentReports report;
	protected static ExtentTest test;
	protected static EventFiringWebDriver e_driver;
	protected static WebEventListener eventListener;
	protected static FileInputStream inputStream;
	
	protected static Xls_Reader TestSuiteData;
	protected static Xls_Reader TestSuite;
	protected static Properties prop = new Properties();
	
	
	public static void Initialize() throws IOException {
		
		TestSuite = new Xls_Reader(Constants.TESTSUITE_FILE);
		TestSuiteData = new Xls_Reader(Constants.TESTSUITEDATA_FILE);
	
		file = new File(Constants.LOGIN_PROPERTIES);
		inputStream = new FileInputStream(file);
		prop.load(inputStream);
	
	
		file = new File(Constants.REGISTRATION_PROPERTIES);
		inputStream = new FileInputStream(file);
		prop.load(inputStream);
	}
}
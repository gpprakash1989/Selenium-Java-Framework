package com.dgsl.freecrm.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.dgsl.freecrm.util.Constants;
import com.dgsl.freecrm.util.Resources;
import com.dgsl.freecrm.util.WebEventListener;

	public class TestBase extends Resources{
		
		public static void initConfig(){
			try{
				file = new File(System.getProperty(Constants.CONFIG_FILE));
				inputStream = new FileInputStream(file);
				prop.load(inputStream);
				}catch(FileNotFoundException e){
					e.printStackTrace();
					}catch(IOException e){
						e.printStackTrace();
						}
			}
	
	public static void initBrowser() throws Exception{
		if(driver == null){
			String browserName = prop.getProperty("Browser");
			if(browserName.equalsIgnoreCase("firefox")){
				driver = new FirefoxDriver();
				}
			
			else if(browserName.equalsIgnoreCase("Chrome")){
				System.setProperty("webdriver.chrome.driver",
						System.getProperty(Constants.CHROMEDRIVER_FILE));
				driver = new ChromeDriver();
				}
			
			else if(browserName.equalsIgnoreCase("IE")){
				System.setProperty("webdriver.ie.driver",
						System.getProperty(Constants.IEDRIVER_FILE));
				driver = new InternetExplorerDriver();
				}
			
			else{
				throw new Exception("Invalid Browser Name");
				}
			
			e_driver = new EventFiringWebDriver(driver);
			//Creating object of EventListener to register it with EventFiringWebDriver
			eventListener = new WebEventListener();
			//Registering object of WebEventListener() with EventFiringWebDriver()
			e_driver.register(eventListener);
			driver = e_driver;
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			Long IMPLICIT_WAIT = Long.parseLong(prop.getProperty("implicitwait"));
			driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
			}		

			driver.get(prop.getProperty("appURL"));
			}
		}
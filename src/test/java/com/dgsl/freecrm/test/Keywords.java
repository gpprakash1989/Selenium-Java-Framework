package com.dgsl.freecrm.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.dgsl.freecrm.base.TestBase;

public class Keywords extends TestBase{
	
	public static WebElement getWebElement(String locator) throws Exception{
		test = report.startTest("getWebElement");
		System.out.println("locator data: " + locator + "is--" + prop.getProperty(locator));
		return getLocator(prop.getProperty(locator));
		}
	
	
	public static List<WebElement> getWebElements(String locator) throws Exception{
		test = report.startTest("getWebElements");
		return getLocators(prop.getProperty(locator));
		}
	
	
	public static WebElement getLocator(String locator) throws Exception{
		test = report.startTest("getLocator");
		String[] split = locator.split(":");
		String locatorType = split[0];
		String locatorValue = split[1];
		
		if(locatorType.equalsIgnoreCase("id"))
			return driver.findElement(By.id(locatorValue));
		else if(locatorType.equalsIgnoreCase("xpath"))
			return driver.findElement(By.xpath(locatorValue));
		else if(locatorType.equalsIgnoreCase("classname"))
			return driver.findElement(By.className(locatorValue));
		else
			throw new Exception("Incorrect '" + locatorType + "'");
		}
	
	
	public static List<WebElement> getLocators(String locator) throws Exception{
		test = report.startTest("getLocators");
		String split[] = locator.split(":");
		String locatorType = split[0];
		String locatorValue = split[1];
		
		if(locatorType.equalsIgnoreCase("id"))
			return driver.findElements(By.id(locatorValue));
		else if(locatorType.equalsIgnoreCase("xpath"))
			return driver.findElements(By.xpath(locatorValue));
		else if(locatorType.equalsIgnoreCase("classname"))
			return driver.findElements(By.className(locatorValue));
		else
			throw new Exception("Incorrect '" + locatorType + "'");
		}
	
	
	public static String Navigate(){
		test = report.startTest("Navigate");
		driver.get(webElement);
		return "Pass";
	}
	
	
	public static String InputText(){
		test = report.startTest("InputText");
		try {
			getWebElement(webElement).sendKeys(TestData);
		} catch (Throwable e) {
			return "Failed - " + webElement + "not found.";
		}
		return "Pass";
		}
	
	
	public static String ClickOnLink(){
		test = report.startTest("ClickOnLink");
		try {
			getWebElement(webElement).click();
		} catch (Exception e) {
			return "Failed - " + webElement + "not found.";
		}
		return "Pass";	
	}
	
	
	public static String waitFor(){
		test = report.startTest("waitFor");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			return "Failed - Unable To Load Page";
		}
		return "Pass";
	}
	
	
	public static String selectFromDropdown(String locator){
		test = report.startTest("selectFromDropdown");
		WebElement dropdown = null;
		try {
			dropdown = getWebElement(webElement);
		} catch (Exception e) {
			return "Failed - " + webElement + "not Found.";
		}
		Select option = new Select(dropdown);
		option.selectByVisibleText(TestData);
		return "Pass";
	}
}

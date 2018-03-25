package com.dgsl.phptravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dgsl.phptravels.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	@CacheLookup
	private WebElement email;
	
	@FindBy(xpath = "//*[@placeholder='Password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	@CacheLookup
	private WebElement loginBtn;
	
	
	//Initializing Page objects
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public AccountPage getLogin(String e_mail, String pwd){
		email.sendKeys(e_mail);
		password.sendKeys(pwd);
		loginBtn.click();
		return new AccountPage();
	}

}
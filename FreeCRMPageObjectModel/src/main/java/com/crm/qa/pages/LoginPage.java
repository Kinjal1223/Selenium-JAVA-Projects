package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory or Object Repository
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath="//button[contains(),'Sign Up')]")
	WebElement Signup;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmlogo;
	
	//initialize page objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	//Actions: Features that available on loginpage
	public String ValidateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateCRMImage()
	{
		//from line 26
		return crmlogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new HomePage();
	}
}

package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//td[contains(text(),'User: Ashish Patel')]")
	@CacheLookup
	WebElement usernameLable;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Delas')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement TasksLink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement NewContactLink;
	
	//initialize page objects
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUsername()
	{
		return usernameLable.isDisplayed();
	}
	
	//Browser open Contacts Page
	public ContactsPage clickOnContactsLink()
	{
		contactsLink.click();
		return new ContactsPage();
	}

	//Browser open Deals Page
	public DealsPage clickOnDelasLink()
	{
		dealsLink.click();
		return new DealsPage();
	}
	
	//Browser open Task Page
	public TaskPage clickOnTaskLink()
	{
		dealsLink.click();
		return new TaskPage();
	}
	
	public void clickOnNewContactLink()
	{
		Actions action = new Actions(driver);
				
		action.moveToElement(contactsLink).build().perform();
		
		//WebDriverWait wait = new WebDriverWait(driver, 40);
		//wait.until(ExpectedConditions.visibilityOf(NewContactLink)).click();;
		
		NewContactLink.click();
	}

}

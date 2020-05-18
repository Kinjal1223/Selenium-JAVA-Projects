package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(className="logo_text")
	public WebElement logoname;
	
	@FindBy(xpath="//a[@title='Deals']")
	public WebElement deals;
	
	@FindBy(xpath="//a[@title='New Deal']")
	public WebElement newdeal;
	
	@FindBy(xpath="//a[@title='Contacts']")
	public WebElement contacts;
	
	@FindBy(xpath="//a[@title='New Contact']")
	public WebElement newContact;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String CheckLogoName()
	{
	   return driver.getTitle();
	}
	
	public DealsPage clickonDeals()
	{
		deals.click();
		return new DealsPage();
	}
	
	public void clickNewDeals()
	{
		Actions action = new Actions(driver);
		action.moveToElement(deals).build().perform();
		
		newdeal.click();
	}
	public void ClickNewContact()
	{
		Actions action = new Actions(driver);
		action.moveToElement(contacts).build().perform();
		
		newContact.click();
	}
	
}

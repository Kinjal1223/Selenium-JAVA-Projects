package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class ContactPage extends TestBase {
	
	@FindBy(id="first_name")
	public WebElement firstName;
	
	@FindBy(id="surname")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@type='submit' and @value='Save']")
	public WebElement SaveContact;
	
	public ContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AddToNewContact(String gender, String fname, String lname)
	{
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByValue(gender);
		
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		
		SaveContact.click();
	}
	
	
	
	
	
	
}

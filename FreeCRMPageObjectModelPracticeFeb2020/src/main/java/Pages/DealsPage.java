package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class DealsPage extends TestBase {
	
	@FindBy(id="title")
	public WebElement tit;
	
	@FindBy(xpath="//input[@type='text' and @name='client_lookup']")
	public WebElement company;
	
	//@FindBy(className="select")
	//public static WebElement selectType;
	
	@FindBy(xpath="//input[@type='submit' and @value='Save']")
	public WebElement SaveDeal;
	
	public DealsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createNewDeals(String dealtitle, String dealcompany, String select)
	{
		tit.sendKeys(dealtitle);
		company.sendKeys(dealcompany);
				
	    Select dropdown = new Select(driver.findElement(By.name("type")));
		dropdown.selectByVisibleText(select);
		
		SaveDeal.click();
	}
	
}

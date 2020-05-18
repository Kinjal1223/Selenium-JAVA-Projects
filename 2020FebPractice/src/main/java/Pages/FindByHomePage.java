package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindByHomePage {
	
	@FindBy(name="username")
	public WebElement username;
	
    @FindBy(name="password")
    public WebElement password;
    
    @FindBy(xpath="//input[@type='submit']")
    public WebElement signup;
	
	@FindBy(xpath="//td[contains(text(),'User: Ashish Patel')]")
	WebElement usernameLable;
	
	protected static WebDriver driver;
	//PageFactory is used to find elements with @FindBy specified
	
	public void homepage() 
	{
		username.sendKeys("apatel");
		
    	driver.navigate().refresh();
    	    	
    	password.sendKeys("Pulsure");
    	
    	JavascriptExecutor js = (JavascriptExecutor)driver;
 	    js.executeScript("arguments[0].click();", signup);
 	       	
    	System.out.println("Logged in");
    	
    	usernameLable.getText();
	}
}

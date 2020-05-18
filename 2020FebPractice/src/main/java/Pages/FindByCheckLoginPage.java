package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FindByCheckLoginPage {
	
	protected static WebDriver driver;

	@FindBy(name="username")
	public WebElement username;
	
    @FindBy(name="password")
    public WebElement password;
    
    @FindBy(xpath="//input[@type='submit']")
    public WebElement signup;
        
	
	public void login() 
	{
		username.sendKeys("apatel");
    	
    	driver.navigate().refresh();
    	
    	password.sendKeys("Pulsure");
    	
    	JavascriptExecutor js = (JavascriptExecutor)driver;
 	    js.executeScript("arguments[0].click();", signup);
 	       	
    	System.out.println("Logged in");	
	}
	
	
    /*
      public static void main(String[] args)
	{
    	System.setProperty("webdriver.gecko.driver","C:\\Eclips\\SELENIUM PROJECTS\\geckodriver.exe");
		
		driver = new FirefoxDriver();

		driver.get("https://www.crmpro.com/");
		
		
		WebElement username = driver.findElement(By.name("username"));
		driver.navigate().refresh();

		username.sendKeys("apatel");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Pulsure");
		
		WebElement loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", loginbtn);
	    
	    System.out.println("Login Clicked");
	    
	   WebElement hometext=  driver.findElement(By.xpath("//td[contains(text(),'User: Ashish Patel')]"));
	   System.out.println("Home Text: "+hometext);
	   
	  }
	  
	   */
	
    }
    
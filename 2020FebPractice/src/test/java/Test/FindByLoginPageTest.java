package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.FindByCheckLoginPage;

public class FindByLoginPageTest extends FindByCheckLoginPage {
	

	/*
	public static void main(String[] args)
	{
    	System.setProperty("webdriver.gecko.driver","C:\\Eclips\\SELENIUM PROJECTS\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.crmpro.com/");
		
		FindByCheckLoginPage login = new FindByCheckLoginPage();
		
		//PageFactory is used to find elements with @FindBy specified
        PageFactory.initElements(driver, login);
		
		login.login();
		
		driver.quit();
		
	}
	  
   */
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Eclips\\SELENIUM PROJECTS\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.crmpro.com/");
		
		Thread.sleep(1000);
		
		//driver.findElement(By.linkText("Sign Up")).click();
		
		//driver.navigate().back();
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("apatel");
		
		driver.navigate().refresh();
						
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Pulsure");
		
		WebElement loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", loginbtn);
	    
	    System.out.println("Login Clicked");
	    
		WebElement hometext=  driver.findElement(By.xpath("//td[contains(text(),'User: Ashish Patel')]"));
		System.out.println("Home Text: "+hometext);
		   
		driver.quit();	
	}
}


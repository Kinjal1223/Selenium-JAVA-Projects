package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Contacts {
	
	WebDriver driver;
	
	@Given("^user on login page$")
	public void user_on_login_page() {
	    
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\SELENIUM PROJECTS\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com/");	
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password)
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	    
	}

	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button()
	{
				
		WebElement loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", loginbtn);
	}

	@Then("^user mouse hover on Contacts$")
	public void user_mouse_hover_on_Contacts() 
	{
		driver.switchTo().frame("mainpanel");

		Actions action = new Actions(driver);
		WebElement contact = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));

		action.moveToElement(contact).build().perform();
		WebElement newcontact = driver.findElement(By.xpath("//a[contains(text(),'New Contact')]"));
		newcontact.click();
	}

	@Then("^Enters on contact page \"([^\"]*)\" and \"([^\"]*)\"$")
	public void Enters_on_contact_page_Firsrname_and_NON(String Firstname, String LastName) 
	{
			driver.findElement(By.id("first_name")).sendKeys(Firstname);
			driver.findElement(By.id("surname")).sendKeys(LastName);			
	}

	@Then("^Save button$")
	public void save_button()
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

	@Then("^Close the browser$")
	public void close_the_browser()
	{
		driver.quit();
	}

	}

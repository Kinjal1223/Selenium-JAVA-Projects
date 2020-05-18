
package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^User on Login Page$")
	public void User_on_Login_Page()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\SELENIUM PROJECTS\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com/");	
	}
	
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_crm()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO  - CRM software for customer relationship management, sales, and support.", title);
	}
	
  		
//	Data Driven Without Example Keyword
//	Reg Exp:
//	(1) \"([^\"]*)\" 
//	(2) \"(.*)\"
	 
	 @Then("^User will enter Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	 public void user_enters_username_and_password(String username, String password)
	 {
	 	 driver.findElement(By.name("username")).sendKeys(username);
	 	 driver.findElement(By.name("password")).sendKeys(password);
	 }
	 	
	 @Then("^user clicks on login button$")
		public void user_clicks_on_login_button()
		{
		   WebElement loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("arguments[0].click();", loginbtn);
		}
	//Hardcode data
	/*
	@Then("^Enter username and password$")
	public void Enter_username_and_password()
	{
	    driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
	    driver.findElement(By.name("email")).sendKeys("kinju_patel23@yahoo.in");
	    driver.findElement(By.name("password")).sendKeys("Ilove2ashu");
	}
	
	*/
		@Then("^user is on home page$")
		public void user_is_on_home_page()
		{
		
			String title = driver.getTitle();
			System.out.println("Home Page Title " + title);
			Assert.assertEquals("CRMPRO", title);
			//driver.close();
		}
	
	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() 
	{
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		WebElement contact = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		action.moveToElement(contact).build().perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();	
	}
	
	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and_and(String firstname, String lastname, String department)
	{
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("surname")).sendKeys(lastname);
		driver.findElement(By.id("department")).sendKeys(department);
	}

	
	@Then("^user clicks on save$")
	public void user_clicks_on_save()
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	
}

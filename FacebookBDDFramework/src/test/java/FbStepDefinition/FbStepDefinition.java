package FbStepDefinition;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class FbStepDefinition {

	WebDriver driver;
	
	@Given("^User on ArtOfTesting webpage$")
	public void user_on_ArtOfTesting_webpage()
	{
	    System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\SELENIUM PROJECTS\\chromedriver.exe");
	    driver = new ChromeDriver();

	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    
	    driver.get("https://artoftesting.com/");
	    
	}

	@Then("^User mouse over on Manual$")
	public void user_mouse_over_on_Manual()
	{
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Manual"));
		action.moveToElement(element).build().perform();
		
	}
	
	@Then("^User clicks on Manual Testing Tutorial$")
	public void user_clicks_on_Manual_Testing_Tutorial()
	{
		driver.findElement(By.linkText("Manual Testing Tutorial")).click();
		System.out.println("Manual Testing Tutorial");
	}


	@Then("^User Clicks on What is Software Testing$")
	public void user_Clicks_on_What_is_Software_Testing()
	{
		WebElement link = driver.findElement(By.linkText("Unit Testing"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", link);
		
		String title = driver.getTitle();
		Assert.assertEquals("What is Unit Testing?", title);
		System.out.println("Clicked on Unit Testing?");
	}
	
	@Then("^close browser$")
	public void close_browser()
	{
		driver.quit();
	}

	
	/*
	 
	@Given("^User on facebook login page$")
	public void User_on_facebook_login_page()
	{
		 ChromeOptions ops = new ChromeOptions();
		 
		 Map prefs=new HashMap();
		 
		 prefs.put("profile.default_content_setting_values.notifications", 1);
		 
		 ops.setExperimentalOption("prefs",prefs);
		 
	   //  ops.addArguments("\"--disable-notifications\"");
	     
	    System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\SELENIUM PROJECTS\\chromedriver.exe");
	    driver = new ChromeDriver(ops);
	    //driver.get("https://www.facebook.com/");
	    driver.get("https://artoftesting.com/");

	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	}
	
	 @Then("^User Enters \"(.*)\" and \"(.*)\"$")
		public void user_Enters_email_id_and_Password(String username, String password)
		{
	    	driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
	    	driver.findElement(By.id("pass")).sendKeys(password);
	   	}

	/*
	 * @Then("^User Enters email_id and Password$") public void
	 * user_Enters_email_id_and_Password() {
	 * driver.findElement(By.xpath("//input[@type='email']")).sendKeys(
	 * "abc@yahoo.com"); driver.findElement(By.id("pass")).sendKeys("hello123@"); }
	 

	@Then("^User Click for login$")
	public void user_Click_for_login()
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
		
	 @Then("^User clicks on profile button$") 
	 public void User_clicks_on_profile_button() 
	 {
		 driver.findElement(By.linkText("Kinjal Patel")).click();
	 }
	 
	 @Then("^The display message for user is in profile$")
	 public void the_display_message_for_user_is_in_profile()
	 {
	    driver.findElement(By.linkText("Photos")).click();
	    System.out.println("Photos link clicked");	 
	 }
		
	
	@Then("^close the browser$")
	public void close_the_browser()
	{
		driver.quit();
	}
	
	*/
	
	

}

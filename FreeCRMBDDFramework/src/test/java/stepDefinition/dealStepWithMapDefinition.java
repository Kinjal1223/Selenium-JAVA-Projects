// https://www.youtube.com/watch?v=99qAnsYIYA0&t=1s : Start from 7:39

package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

//Data table with Maps : for parameterization of test cases

public class dealStepWithMapDefinition {

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
	
	 @Then("^User enters username and password$")
	 public void user_enters_username_and_password(DataTable credentials)
	 {
		 for(Map<String, String> data : credentials.asMaps(String.class, String.class))
		 {
			 driver.findElement(By.name("username")).sendKeys(data.get("username"));
		 	 driver.findElement(By.name("password")).sendKeys(data.get("password"));
		 }
	 	
	 }
	 	
	 @Then("^user clicks on login button$")
		public void user_clicks_on_login_button()
		{
		   WebElement loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("arguments[0].click();", loginbtn);
		}
	 
	 @Then("^user moves to new deal page$")
	 public void user_moves_to_new_deal_page()
	 {
		 driver.switchTo().frame("mainpanel");
		 
		 Actions action = new Actions(driver);
		 WebElement deals =  driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
		 action.moveToElement(deals).build().perform();
		 
		 driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	 }
	 
	 @Then("^user enters deal deatils$")
	 public void user_enters_deal_deatils(DataTable dealData)
	 {
		 for(Map<String, String> data : dealData.asMaps(String.class, String.class))
		 {
			 driver.findElement(By.id("title")).sendKeys(data.get("title"));
			 driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
			 driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
			 driver.findElement(By.id("commission")).sendKeys(data.get("commition"));
			 
			 driver.findElement(By.xpath("//input[@type='submit']")).click();
				
			 //move to new deal page
			 Actions action = new Actions(driver);
			 WebElement deals =  driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
			 action.moveToElement(deals).build().perform();
			 
			 driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		 }  
	 }
	 
	 @Then("^user close the browser$")
	 public void user_close_the_browser()
	 {
		 driver.quit();
	 }

}

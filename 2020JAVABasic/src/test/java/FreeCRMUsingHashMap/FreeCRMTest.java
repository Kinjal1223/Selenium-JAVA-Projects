package FreeCRMUsingHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FreeCRMTest {

	   public WebDriver driver; 
	   public String Credentials;
	   public  String credentialsInfo[];
	
        @BeforeTest
        public void setUp()
        {
        	System.setProperty("webdriver.chrome.driver", "C:\\Eclips\\SELENIUM PROJECTS\\chromedriver.exe");
    		driver = new ChromeDriver();
    		driver.get("https://www.crmpro.com/");
        }
		
		@Test(priority=1)
		public void loginWithCustomerTest() throws InterruptedException
		{
			Credentials = Data.getUserLoginInfo().get("apatel");
			credentialsInfo = Credentials.split("_");
			
			driver.findElement(By.name("username")).sendKeys(credentialsInfo[0]);
		    driver.findElement(By.name("password")).sendKeys(credentialsInfo[1]);
		
		    /*
		    //Click login button in div tag using XPath
		    WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("arguments[0].click()",login);
		    */
		    
		    //Click login button in div tag without using XPath, Use className from DIV tag, not from input tag
		    WebElement login1 = driver.findElement(By.className("input-group-btn"));
		    login1.click();
		
		    Thread.sleep(3000);
		    
		    driver.switchTo().frame("mainpanel");
		    Select select = new Select (driver.findElement(By.name("slcMonth")));
		    select.selectByVisibleText(Data.monthMap().get(10));
		}
		
		@Test(priority=2)
		public void loginWithPatelTest()
		{
			Credentials = Data.getUserLoginInfo().get("Customer");
			credentialsInfo = Credentials.split("_");
			
			driver.findElement(By.name("username")).sendKeys(credentialsInfo[0]);
		    driver.findElement(By.name("password")).sendKeys(credentialsInfo[1]);
		
		    WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("arguments[0].click()",login);
		}
		
		@AfterTest
		public void tearDown()
		{
			//driver.quit();
		}
		

}

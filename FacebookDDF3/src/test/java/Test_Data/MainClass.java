 package Test_Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util_Class.TestUtil;

public class MainClass {
	
	WebDriver driver;

	@BeforeMethod
	public void SetUP()
	{

		//WebDriverManager.chromedriver().setup();
		
		
        System.setProperty("webdriver.gecko.driver","D:\\Eclips\\SELENIUM PROJECTS\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\SELENIUM PROJECTS\\chromedriver.exe");
		//driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData()
	{
		ArrayList<Object[]> array = TestUtil.getDataFromExcel();
		return array.iterator();
	}
	
	@Test(dataProvider = "getTestData")
	public void Register(String firstname, String lastname, String email, String password)
	{
		driver.findElement(By.xpath("//input[@id='u_3_b']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='u_3_d']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id='u_3_g']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='u_3_l']")).sendKeys(password);
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}

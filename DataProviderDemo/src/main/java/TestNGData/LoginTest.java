package TestNGData;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.TestUtilFromExcelFile;

public class LoginTest {

WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException	
	{

		System.setProperty("webdriver.chrome.driver","D:\\Eclips\\SELENIUM PROJECTS\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); //Launches firefox Browser
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/ap/register?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_custrec_newcust"); //browses the application URL
		
		Thread.sleep(3000);
	}
	
	
	@DataProvider
	//Fetch data from excel fila
	public Iterator<Object[]> getTestData()
	{
		//calling method "getDataFromExcel()" from TestUtil.java class. 
		//No need to create object of class because method is "Static"
		ArrayList<Object[]> testData = TestUtilFromExcelFile.getDataFromExcel();
				return testData.iterator();
	}
	
	
	@Test(dataProvider="getTestData")
	public void LoginTest(String fname, String email, String password, String reenter)
	{
		
		driver.findElement(By.id("ap_customer_name")).clear();
		driver.findElement(By.id("ap_customer_name")).sendKeys(fname);
		
		//WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath()));
		//element1.sendKeys(fname);		
		
		driver.findElement(By.id("ap_email")).clear();
		driver.findElement(By.id("ap_email")).sendKeys(email);
		
		driver.findElement(By.id("ap_password")).clear();
		driver.findElement(By.id("ap_password")).sendKeys(password);
		
		driver.findElement(By.id("ap_password_check")).clear();
		driver.findElement(By.id("ap_password_check")).sendKeys(reenter);
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}

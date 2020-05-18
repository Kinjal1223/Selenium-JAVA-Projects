package DDF_Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DDF_Test_Utility.Xls_Reader1;

public class DataDrivenTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		 Xls_Reader1 reader = new Xls_Reader1("D:\\Eclips\\Selenium_Practice_Projects\\src\\DDF_Test_Data\\DataforRegistration.xlsx");
		 
		 System.setProperty("webdriver.chrome.driver","D:\\Eclips\\SELENIUM PROJECTS\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver(); //Launches firefox Browser
			driver.manage().deleteAllCookies();
		    driver.get("https://www.amazon.com/ap/register?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_custrec_newcust"); //browses the application URL
			 
		 /* Only for single row
		 String fname = reader.getCellData("Facebook_Regstration", "First_Name", 2);
		 System.out.println(fname);
		 
		 String lname = reader.getCellData("Facebook_Regstration", "Last_Name", 2);
		 System.out.println(lname);
		 
		 String email = reader.getCellData("Facebook_Regstration", "Email", 2);
		 System.out.println(email);
		 
		 String password = reader.getCellData("Facebook_Regstration", "New_Password", 2);
		 System.out.println(password);
		 
		  */
		 
		int rowcount = reader.getRowCount("Facebook_Regstration");
		
		reader.addColumn("Facebook_Regstration", "status");
		
		for(int rowNum = 2; rowNum<=rowcount; rowNum++)
	    {
			String fname = reader.getCellData("Facebook_Regstration","First_Name", rowNum);
			System.out.println(fname);
			
			String lname = reader.getCellData("Facebook_Regstration","Last_Name", rowNum);
			System.out.println(lname);
			
			String email = reader.getCellData("Facebook_Regstration","Email", rowNum);
			System.out.println(email);
			
			String password = reader.getCellData("Facebook_Regstration","New_Password", rowNum);
			System.out.println(password);
			
			String reenter = reader.getCellData("Facebook_Regstration","New_Password", rowNum);
			System.out.println(reenter);
			
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			 
			WebDriverWait wait = new WebDriverWait(driver,30);

			driver.findElement(By.id("ap_customer_name")).clear();
			WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ap_customer_name']")));
			element1.sendKeys(fname);		
			
			driver.findElement(By.id("ap_email")).clear();
			driver.findElement(By.id("ap_email")).sendKeys(email);
			
			driver.findElement(By.id("ap_password")).clear();
			driver.findElement(By.id("ap_password")).sendKeys(password);
			
			driver.findElement(By.id("ap_password_check")).clear();
			driver.findElement(By.id("ap_password_check")).sendKeys(reenter);
			
			reader.setCellData("Facebook_Regstration", "status", rowNum, "Pass");

		 }		

	}

}

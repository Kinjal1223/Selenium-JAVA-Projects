package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.baseTest;


public class LoginTest extends baseTest {
	
	@BeforeMethod
	public void init()
	{
		initialise();
		loadBrowser("chrome");
		openURL("Appurl");		
	}
	
	@Test
	public void windowHandle()
	{		
		driver.findElement(By.id("selenium143")).click();
		
		//handle two windows
		Set<String> set =  driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	@Test
	public void multiWindowHandle()
	{
		driver.findElement(By.linkText("Open a popup window")).click();
		driver.findElement(By.linkText("Blogger")).click();
		
		String ParentWindow = driver.getWindowHandle();
		Set<String> set1 = driver.getWindowHandles();
		Iterator<String> itr1 = set1.iterator();
		while(itr1.hasNext())
		{
			String childWindow = itr1.next(); // here, parent window will come and store into 'ChildWindowID'
			 if(!ParentWindow.equals(childWindow)) // here, outof three window 
			 {
				 driver.switchTo().window(childWindow);
				 
				 System.out.println(driver.getTitle());
			 }
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}


}

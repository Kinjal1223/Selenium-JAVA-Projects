package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.baseTest;

public class EnterKey extends baseTest{
	
	@BeforeMethod
	public void init()
	{
		initialise();
		loadBrowser("chrome");
		openURL("Appurl");		
	}
	
	@Test
	public void enterKEy()
	{
		driver.findElement(By.className("gsc-input")).sendKeys(Keys.ENTER);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}

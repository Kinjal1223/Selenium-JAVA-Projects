package TestClass;

import org.testng.annotations.AfterMethod;

//This is home page 
//tyht
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.ContactPage;
import Pages.DealsPage;
import Pages.HomePage;
import Pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	DealsPage dealspage;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		LoginPage loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		dealspage = new DealsPage();
	}
	
	@Test(priority=1)
	public void checklogo()
	{
		String title = homepage.CheckLogoName();	
	}
	
	@Test(priority=2)
	public void clickdeals()
	{
		driver.switchTo().frame("mainpanel");

		dealspage = homepage.clickonDeals();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}

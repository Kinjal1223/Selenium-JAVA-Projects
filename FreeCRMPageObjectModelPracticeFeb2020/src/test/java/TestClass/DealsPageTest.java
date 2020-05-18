package TestClass;

import org.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DealsPage;
import Pages.HomePage;
import Pages.LoginPage;
import TestUtil.TestUtil;

public class DealsPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	DealsPage dealspage;
	TestUtil testutil;
	String SheetName = "DealTestData";
	
	public DealsPageTest()
	{
		super();
	}
	
	@BeforeMethod()
	public void setUp()
	{
		initialization();
		testutil = new TestUtil();
		dealspage = new DealsPage();

		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("mainpanel");
	}
	
	@Test
	public void newdealclick() 
	{
		homepage.clickNewDeals();
	}
	
	/*
	@Test
	public void sendDataToDeal()
	{
		homepage.clickNewDeals();
		dealspage.createNewDeals("BOGO", "Almac", "New");
	}
	*/
	
	@DataProvider(name="NewDealData")
	public Object[][] getNewDealData() throws InvalidFormatException
	{
		Object data[][] = TestUtil.getTestData(SheetName);
		return data;
	}
	
	@Test(dataProvider="NewDealData")
	public void sendDataToDeal(String dealtit, String dealcomp, String dealtype )
	{
		homepage.clickNewDeals();
		dealspage.createNewDeals(dealtit, dealcomp, dealtype);
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}

}

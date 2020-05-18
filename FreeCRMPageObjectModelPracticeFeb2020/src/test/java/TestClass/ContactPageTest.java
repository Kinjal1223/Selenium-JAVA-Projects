package TestClass;

import org.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.ContactPage;
import Pages.HomePage;
import Pages.LoginPage;
import TestUtil.TestUtil;

public class ContactPageTest extends TestBase{
	
	HomePage homepage;
	LoginPage loginpage;
	TestUtil testutil;
	ContactPage contactPage;
	String SheetName = "ContactTestData"; 
	
	public ContactPageTest()
	{
		super();
	}
		
	@BeforeMethod
	public void SetUp()
	{
		initialization();
		
		testutil = new TestUtil();
		contactPage = new ContactPage();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("mainpanel");
	}
	
	@DataProvider(name="addnewContact")
	public Object[][] AddNewContactData() throws InvalidFormatException
	{
		Object data[][] = TestUtil.getTestData(SheetName);
		return data;		
	}
	
	@Test(dataProvider="addnewContact")
	public void addNewContact(String gender, String FirstName, String LastName)
	{
		homepage.ClickNewContact();
		contactPage.AddToNewContact(gender,FirstName,LastName);
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}
	
	
}

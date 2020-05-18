package TestClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {
	 
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginpage = new LoginPage();
	}
	
	@Test
	public void loginTest()
	{
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	/*public void test()
	{
		ExtentReports eReports = ExtentManager.getInstance();
		ExtentTest eTest = eReports.startTest("LoginPageTest");
		eTest.log(LogStatus.INFO, "Login Test has started");
	}
	*/
	
	
}

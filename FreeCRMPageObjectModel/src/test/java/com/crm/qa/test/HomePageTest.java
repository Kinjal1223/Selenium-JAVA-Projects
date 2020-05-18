package com.crm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	ContactsPage contactspage;
	
	public HomePageTest()
	{
		//call TestBase() class constructore "TestBase()" and properties will be initiaized
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		
		testutil = new TestUtil();
		//To access login method
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactspage = new ContactsPage();
	}
	
	@Test(priority=1)
	public void verifyHomePageTitle()
	{
		String homepagetitle = homepage.verifyHomePageTitle();
		Assert.assertEquals(homepagetitle, "CRMPRO", "HomePage title not matched");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest()
	{
		testutil.switchToFrame();
		Assert.assertTrue(homepage.verifyCorrectUsername());
	}
	
	@Test(priority=3)
	public void verifyContactslinkTest()
	{
		testutil.switchToFrame();
		contactspage = homepage.clickOnContactsLink();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();		
	}

}

package com.crm.qa.test;

import org.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	ContactsPage contactspage;
	String sheetName = "Contacts"; 
	
	public ContactsPageTest()
	{
		super();
	}
	
	@BeforeMethod()
	public void setUp() throws InterruptedException
	{
		initialization();
		
		testutil = new TestUtil();
		contactspage = new ContactsPage();
		//To access login method
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		testutil.switchToFrame();

	}
	
	@Test(priority=1)
	public void verifyContactsLabel()
	{
		contactspage = homepage.clickOnContactsLink();
		Assert.assertTrue(contactspage.verifyContactsLabel(), "Contact label is missing on the page");
	}
	
	@Test(priority=2)
	public void selectSingleContactsByNameTest()
	{
		contactspage = homepage.clickOnContactsLink();
		contactspage.selectContactsByName("Sachin Tendulkar");
	}
	
	@Test(priority=3)
	public void selectMultipleContactsByNameTest()
	{
		contactspage = homepage.clickOnContactsLink();
		contactspage.selectContactsByName("Jagga Jasoos");
		contactspage.selectContactsByName("kinjal patel");
	}
	
	@DataProvider(name="getCRMTestData")
	public Object[][] getCRMTestData() throws InvalidFormatException
	{
		Object data[][] = TestUtil.getTestData(sheetName); 
		return data;
	}
	
	@Test(priority=4, dataProvider="getCRMTestData")
	public void validateCreateNewContact(String title, String firstname, String lastname, String company)
	{ 	
		homepage.clickOnNewContactLink();
		//contactspage.createNewContact("Mr.", "Tree", "Peter", "Google");
		contactspage.createNewContact(title, firstname, lastname, company);
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}
	
	

}

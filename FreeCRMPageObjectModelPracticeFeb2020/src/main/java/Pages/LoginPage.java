package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
	
		@FindBy(name="username")
		public WebElement username;
		
		@FindBy(name="password")
		public WebElement password;
		
		@FindBy(xpath="//input[@type='submit']")
		public WebElement login;
		
		public LoginPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		public HomePage login(String uname, String pass)
		{
			username.sendKeys(uname);
			password.sendKeys(pass);
			
			login.click();
			return new HomePage();
		}
	}


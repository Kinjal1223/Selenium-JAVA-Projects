package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.FindByCheckLoginPage;
import Pages.FindByHomePage;

public class FindByHomePageTest extends FindByHomePage {

	FindByCheckLoginPage loginpage;
	FindByHomePage homepage;
	
	public static void main(String[] args)
	{
    	System.setProperty("webdriver.gecko.driver","C:\\Eclips\\SELENIUM PROJECTS\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.crmpro.com/");
		
		FindByHomePage homepage = new FindByHomePage();

		//PageFactory is used to find elements with @FindBy specified
        PageFactory.initElements(driver, homepage);
				
		homepage.homepage();
		
		driver.quit();
		
	}

}

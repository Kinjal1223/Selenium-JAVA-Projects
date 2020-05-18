package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase()
	{
		try
		{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Eclips\\FreeCRMPageObjectModelPracticeFeb2020\\src\\main\\java\\Properties\\config.properties");
			prop.load(fis);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		String chrome = prop.getProperty("chromebrowser");
		System.setProperty("webdriver.chrome.driver", chrome);
		driver = new ChromeDriver();
		
		/*
		String browsername = prop.getProperty("chrome");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Eclips\\SELENIUM PROJECTS\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Eclips\\SELENIUM PROJECTS\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		*/
		
		driver.get(prop.getProperty("url"));

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
	}
	
}


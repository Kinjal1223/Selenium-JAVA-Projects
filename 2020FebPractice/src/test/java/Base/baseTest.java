package Base;

import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseTest {

	protected WebDriver driver = null;
	Properties prop = null;
	FileInputStream fis;
	
	//Initialize
	public void initialise()
	{
		prop = new Properties();
		try
		{
			fis = new FileInputStream("C:\\Eclips\\SELENIUM PROJECTS\\chromedriver.exe");
			prop.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	//Load Browse
	public void loadBrowser(String browserType)
	{
		if(browserType.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriverpath"));
			driver = new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxdriverpath"));
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	}
	
	//Open URL
	public void openURL(String url)
	{
		driver.get(prop.getProperty(url));
	}
	
	/*
	public ExtentReports generateReport()
	{
		Date date = new Date();
		String filetype = date.toString();
		String reportfile = "reports//" + filetype;
		//ExtentReports report = new ExtentReports(reportfile);
		return report;
		
	}
	*/
	
	
}

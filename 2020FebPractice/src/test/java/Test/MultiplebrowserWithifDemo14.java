package Test;

//Day 39

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiplebrowserWithifDemo14 {
	
	public static void main(String[] args) {
		
		WebDriver driver = null;
		String browsername = "FireFox";
		
		if(browsername.equals("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Eclips\\SELENIUM PROJECTS\\geckodriver.exe");
			
			driver = new FirefoxDriver();
		}
		else if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Eclips\\SELENIUM PROJECTS\\chromedriver.exe");
			
			driver = new ChromeDriver(); 
		}
		
		else
		{
			System.out.println("No browser match");
		}
		
		driver.get("http://omayo.blogspot.com/");
				
	}

}

package Test;
//Session 34

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NevigateDemo4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Eclips\\SELENIUM PROJECTS\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		// driver.get("http://omayo.blogspot.com/"); browses the application URL
		 
		 driver.navigate().to("http://omayo.blogspot.com/"); //Same as 'get' command
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
	     //Below code throws ElementNotInteractableException
		 // WebElement element = driver.findElement(By.id("hbutton"));	

		 
		 WebElement element = driver.findElement(By.linkText("newtours"));
		 element.click();
		 
		// driver.navigate().back();
		 
	    // element.click(); // This will throw StaleElementReferenceException
		 
		 
         /*
		 driver.navigate().forward();
		 
		 Thread.sleep(3000);

		 driver.navigate().refresh();
		 
		 String str = driver.getPageSource();
		 System.out.println("Page Source"+str);
		 */
		 
		// driver.navigate().back();
		 
		// element.click(); // This will throw StaleElementReferenceException
		
		 
	}

}

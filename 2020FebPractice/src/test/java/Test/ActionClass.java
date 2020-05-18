package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Eclips\\SELENIUM PROJECTS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MICROSECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("http://mrbool.com/");
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.className("menulink"));
		
		action.moveToElement(element).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Articles']")).click();
		
		WebElement Checklinkname = driver.findElement(By.xpath("//button[@type='submit' & test='search']"));
				
		Assert.assertEquals("search", Checklinkname);
		System.out.println("true");
		
		driver.quit();
	
	}
	
}

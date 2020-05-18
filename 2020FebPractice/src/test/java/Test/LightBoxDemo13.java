package Test;

//Day 38 : Not working this program
// Day 38 include IE driver installation

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LightBoxDemo13 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Eclips\\SELENIUM PROJECTS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Login & Signup")).click();
		
		driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']")).click();
		
		//driver.findElement(By.id("identify_email")).sendKeys("keenjoo@gmail.com");
		
	}
}

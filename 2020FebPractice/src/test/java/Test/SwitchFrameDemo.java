package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrameDemo {

	public static void main(String[] args) {
		
		
        System.setProperty("webdriver.chrome.driver","C:\\Eclips\\SELENIUM PROJECTS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	
		driver.manage().window().maximize();
		
		/* 
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		*/
		
		driver.get("http://omayo.blogspot.com");
		
		WebElement frameone = driver.findElement(By.id("iframe1"));
		
		driver.switchTo().frame(frameone);
		
		driver.findElement(By.linkText("Hotels")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.name("q")).sendKeys("Kinjal");;

	}

}

package Test;

//Day 37

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlemultiselectiondemo11 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\Eclips\\SELENIUM PROJECTS\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://omayo.blogspot.com");
		
		WebElement multiselectionfield = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(multiselectionfield);
		
		select.selectByVisibleText("Swift");
		select.selectByVisibleText("Audi");
		
		Thread.sleep(3000);
		
		select.deselectByVisibleText("Swift");
				
		
	}

}

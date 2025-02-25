package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Eclips\\SELENIUM PROJECTS\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("http://omayo.blogspot.com/"); //browses the application URL
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='New_']")));

		WebElement element = driver.findElement(By.xpath("\"//a[text()='Hi_"));
		element.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='New_']")));
		
		wait.until(ExpectedConditions.textToBePresentInElement(element, "Hi"));
				
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id(null)));
		
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("")));

}

}

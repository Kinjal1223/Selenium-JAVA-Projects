package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//Day 37

public class HandleDropdowndemo10 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Eclips\\SELENIUM PROJECTS\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		WebElement dropdownfield = driver.findElement(By.id("drop1"));
		
		Select select = new Select(dropdownfield);
		
		select.selectByVisibleText("doc 3");
		
	}

}

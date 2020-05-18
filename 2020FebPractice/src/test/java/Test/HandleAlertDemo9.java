package Test;
 import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Day 37: "Alert" is an interface

public class HandleAlertDemo9 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\Eclips\\SELENIUM PROJECTS\\geckodriver.exe");
		
		WebDriver  driver = new FirefoxDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.id("alert1")).click(); // find button with id 'alert1' and click on it
		
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert(); // take to another window window with message hello and ok button
		
		Thread.sleep(3000);
		
		String textonalert = alt.getText(); // get text from alert window
		System.out.println(textonalert); // display that text
		
		alt.accept(); // This will click on ok
		
		driver.switchTo().defaultContent();
		
		driver.close(); // close the window
		
	}

}

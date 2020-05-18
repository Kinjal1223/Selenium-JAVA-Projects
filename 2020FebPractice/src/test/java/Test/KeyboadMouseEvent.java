package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboadMouseEvent {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Eclips\\SELENIUM PROJECTS\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();

		 driver.navigate().to("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();

	    driver.findElement(By.id("ta1")).sendKeys(Keys.ENTER);
	    
        //Handle multiple keys using chord ,
		//This will display capital "HELLO BROTHER"
		//Release Shift key
		//Make a Space between HELLO BROTHER and kssk
		//Output: HELLO BROTHER hi
		driver.findElement(By.id("ta1"))
		                     .sendKeys(Keys.chord(Keys.SHIFT, "hello Brother",
		                    		   Keys.LEFT_SHIFT,
		                    		   Keys.SPACE, "hi"));

		}
	}

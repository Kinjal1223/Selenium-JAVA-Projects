package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IDLocator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Eclips\\SELENIUM PROJECTS\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		 driver.get("http://omayo.blogspot.com/"); //browses the application URL
		 
		 String str =  driver.findElement(By.id("textbox1")).getAttribute("value"); //retrive attribute name
		 System.out.println(str);
	 
		 String str1 =  driver.findElement(By.id("textbox1")).getAttribute("name");
		 System.out.println(str1);
		 
		 Boolean b = driver.findElement(By.id("but2")).isDisplayed();
		 System.out.println("Button Displayed?"+b);
		 
		 boolean b2= driver.findElement(By.id("but2")).isEnabled();
		 System.out.println("Button enabled?"+b2);
		 
		 boolean b3 = driver.findElement(By.xpath("//*[@name='vehicle'][@value='Bike']")).isSelected();
		 System.out.println("Radio button selected?"+b3);
		 
		 driver.close();
		

	}

}

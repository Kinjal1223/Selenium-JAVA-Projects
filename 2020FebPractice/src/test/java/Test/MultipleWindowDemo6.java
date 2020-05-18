package Test;
//Day 35

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowDemo6 {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Eclips\\SELENIUM PROJECTS\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		 driver.get("http://omayo.blogspot.com/"); //browses the application URL: 1st window
		  
		 driver.findElement(By.linkText("Open a popup window")).click(); // 2nd window
		 
		 //driver.findElement(By.id("para1")).getText(); will display error as this attribute on different window
		 
		 //switch to the child window from main window
		 
		 Set<String> set =  driver.getWindowHandles();
		 
		 Iterator<String> itr = set.iterator();
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
		 /* Instead of usting 'while'
		  
		  String mainwindowID = itr.next();
		  String childwindowID = itr.next();
		  
		  driver.switchTo().window(childwindowID); switching focus to child window
		  
		  String str2 = driver.findElement(By.id("para1")).getText();
		  
		  System.out.println(str2);
		  */
}
	
}


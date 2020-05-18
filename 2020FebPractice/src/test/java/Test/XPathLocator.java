package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathLocator {

	public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.gecko.driver","C:\\Eclips\\SELENIUM PROJECTS\\geckodriver.exe");

			 WebDriver driver = new FirefoxDriver(); //Launches firefox Browser
			 
			 driver.get("http://omayo.blogspot.com/"); //browses the application URL
			 
			 driver.manage().window().maximize(); //Maximize browser
			 
			 /*
			 Thread.sleep(10000);  
			 
			 Dimension newDimension = new Dimension(700,600);
			 driver.manage().window().setSize(newDimension);
			 
			 driver.findElement(By.id("confirm")).click(); //Find 'getConfirmation' button which has id 'confirm' & Click on  button
			 		 
			 Thread.sleep(500);  
			
			 driver.findElement(By.name("SiteMap")).click(); // locate element which has name 'SiteMap'
			 
			 driver.findElement(By.className("classone")).sendKeys("Kinjal Patel"); //Fill text box with 'Kinjal Patel'
			 
			 Thread.sleep(500);  
			 
			 driver.findElement(By.className("classone")).clear(); // Clear the text from text box
	   
			  */
			 
			 //driver.findElement(By.linkText("Selenium143")).click();

			 String str = driver.findElement(By.linkText("Selenium143")).getText();
			 System.out.println(str);
			 
			 String str1 = driver.findElement(By.id("pah")).getText();
			 System.out.println(str1);
			 
			 String str2 = driver.findElement(By.partialLinkText("Selenium")).getText(); // Here don't need to provide full text
			 System.out.println(str);

			 driver.findElement(By.xpath("//*[@id='confirm']")).click();
			 
			 driver.findElement(By.cssSelector("#confirm")).click();
			 
			 WebElement element = driver.findElement(By.cssSelector("#confirm")); // Above statement is same
			 element.click();

			 
			 
			 
			 String PageTitle =  driver.getTitle();
			System.out.println(PageTitle); //print page title
				 
			String CurrentURL=  driver.getCurrentUrl();
			System.out.println(CurrentURL); //print current URL
				 
			driver.findElement(By.linkText("newtours")).click();
			String CurrentURL2 = driver.getCurrentUrl();
			System.out.println(CurrentURL2);

	}

}

package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Eclips\\SELENIUM PROJECTS\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		//List<WebElemet> is written type of findElements()
	    List<WebElement> List =	driver.findElements(By.xpath("//div[@class='widget-content']/ul/li/a"));
	    
	    for (int i=0;i<List.size();i++)
	    {
	    	System.out.println("------Find element with xpath-------");
	    	System.out.println(List.get(i)); //display xpath
	    	System.out.println(List.get(i).getText()); //display elements
	    	System.out.println(List.get(i).getAttribute("href"));
	    }
	    
	    List<WebElement> List1 = driver.findElements(By.tagName("a"));
	    
	    for(int j=0;j<List1.size();j++)
	    {
	    	System.out.println("------Find element with t agname------");
	    	System.out.println(List.get(j).getText());
	    	System.out.println(List.get(j).getAttribute("href"));
	    }
	    
	    driver.close();
		
	}

}

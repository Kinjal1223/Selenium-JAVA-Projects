package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclips\\SELENIUM PROJECTS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MICROSECONDS);
		driver.manage().deleteAllCookies();
		
		Thread.sleep(1000);
		
		String UserName="admin";
		String Password="admin";
		
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.get("http://"+UserName+":"+Password+"@"+"the-internet.herokuapp.com/basic_auth");
		
	}

}

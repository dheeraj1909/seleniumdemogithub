package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowHandles {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "E://udemyjava//Introduction/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
//		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
//		driver.findElement(By.cssSelector(".blinkingText")).click();
//		
//		                     //parent id,child id 		
//		
//		Set<String>  windows=driver.getWindowHandles(); //parent id,child id 
//		//above in windows id's of two are sitting so we use iterator to select which window you want switch
//		Iterator<String> it=windows.iterator();
//		
//		//above in windows
//		
//		String parentid=it.next();  //it will select parent id
//		String childid=it.next();   // it will select child id
//		driver .switchTo().window(childid);  // give command to switch to child window
//		Thread.sleep(5000);
//		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
//		String email=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split("with")[0].trim();
//		// watch this in command window
//		driver.switchTo().window(parentid);
//		driver.findElement(By.id("username")).sendKeys(email);
		
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a[target='_blank']")).click();
		Set <String> windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String parentid =it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		Thread.sleep(3000);
		String emailid=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentid);
		driver.findElement(By.id("username")).sendKeys(emailid);
		
		
		
	}

}

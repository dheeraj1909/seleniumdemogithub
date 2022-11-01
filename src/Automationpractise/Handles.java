package Automationpractise;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://udemyjava//Introduction/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
	//	driver.findElement(By.id(""));
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> it=driver.getWindowHandles();
	         java.util.Iterator<String> a=it.iterator();	
	         String Parent=a.next();
	         String Child=a.next();
	         driver.switchTo().window(Child);	
	}

}

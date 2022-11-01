package Automationpractise;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Internet {

	public static void main(String[] args) throws InterruptedException {
	
     System.setProperty("webdriver.chrome.driver", "E://udemyjava//Introduction/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 driver.get("https://the-internet.herokuapp.com/dropdown");
	 driver.findElement(By.cssSelector("a[href='/dropdown']")).click();
	 
//	  Set<String> windowhandles=driver.getWindowHandles();
//	  java.util.Iterator<String> it=windowhandles.iterator();
//	 String parentid=it.next();
//	 String childid=it.next();
//	 driver.switchTo().window(childid);
//	 Thread.sleep(3000);
//	WebElement ststicdropdown=driver.findElement(By.id("dropdown"));
//	Select dropdown =new Select(ststicdropdown);
//	dropdown.selectByIndex(2);		
	}

}

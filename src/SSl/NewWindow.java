a package SSl;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;


public class NewWindow {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.gecko.driver", "E://udemyjava//Introduction/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();	
		
		
//		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		driver.switchTo().newWindow(WindowType.TAB);
//		Set <String> window=driver.getWindowHandles();
//		Iterator<String> it= window.iterator();
//		String parentid=it.next();
//		String child=it.next();
//		driver.switchTo().window(child);
//		Thread.sleep(5000);
//		String coursename=driver.findElement(By.cssSelector("a[href=\'https://courses.rahulshettyacademy.com/p/get-access-to-all-courses\']")).getText();
//		driver.switchTo().window(parentid);
//		driver.findElement(By.cssSelector("input[name='name']")).sendKeys(coursename);
		                          
		
		                                                 //practice
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(5000);
		//switching window
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> abc=driver.getWindowHandles();
		               Iterator<String> it=abc.iterator();
	                  String parentid=it.next();
	                  String childid=it.next();
	                  driver.switchTo().window(childid);
	                  driver.get("https://rahulshettyacademy.com/#/index");
	                 String coursename =driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentid);
		WebElement name=driver.findElement(By.cssSelector("input[name='name']"));
				name.sendKeys(coursename);
				//screenshot
				File file=name.getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(file, new File("logo.png"));
				System.out.println(name.getRect().getDimension().getHeight());
				System.out.println(name.getRect().getDimension().getWidth());
		
	}

}

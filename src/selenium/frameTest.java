package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E://udemyjava//Introduction/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
//		driver.get("https://jqueryui.com/droppable/");
//		//driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
//		//or
//		System.out.println(driver.findElements(By.tagName("iframe")).size());
//		driver.switchTo().frame(0); //by giving index of the frame 
//		
//		driver.findElement(By.id("draggable")).click();
//		Actions a=new Actions(driver);
//		a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		
		
		
		
		Actions a=new Actions(driver);
a.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

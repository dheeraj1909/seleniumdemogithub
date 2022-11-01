package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//(imp for interview)
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E://udemyjava//Introduction/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//
//		// 1.print the link count in a page---
//		System.out.println(driver.findElements(By.tagName("a")).size());
//
//		// 2. print the count of footer section
//		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); // limiting webdriver scope
//		System.out.println(footerdriver.findElements(By.tagName("a")).size());
//
//		// 3.print the count of link in in first column
//		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
//		System.out.println(columndriver.findElements(By.tagName("a")).size());
//
//		// 4.click on each link column and check if the page are openings.
//		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
//
//			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
//			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
//			Thread.sleep(5000);
//		} // this loop opens all the tabs
//		Set<String> windows = driver.getWindowHandles();
//		Iterator<String> it = windows.iterator();
//
//		while (it.hasNext())// whether the next index is present or not
		{
//
//			driver.switchTo().window(it.next()); // it moves window to next window
//			System.out.println(driver.getTitle());

			// what is the special you have done in your automation.

//  we have some 30 links and we have to validate all the 30 links so we have script where we  have to click on each and every link
			// and comeback and again click like we use to take 5 minutes but thereafter you
			// brought some concept like this and everything opening in separate tab on one
			// single short and that gradually decrease time from 15 to 1 minute.	
		}
	                                                                            	//practice
//		
	//driver.get("https://rahulshettyacai.demy.com/AutomationPractice/");
//	System.out.println(driver.findElements(By.tagName("a")).size());    //size() gives total count of links.
//	WebElement 	footersection=driver.findElement(By.id("gf-BIG")); //limiting the scope
//	System.out.println(footersection.findElements(By.tagName("a")).size());
//	WebElement columndriver=footersection.findElement(By.xpath("//tbody/tr/td[1]/ul"));
//	System.out.println(columndriver.findElements(By.tagName("a")).size());
//		
//		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
//		{
//			                String clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
//			                columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
//			                Thread.sleep(5000);
//		}
//			                Set<String> abc=driver.getWindowHandles();
//			                Iterator<String> it=abc.iterator();
//			                while(it.hasNext())  // hasNext tellsus whether next index is present or not 
//			                {
//			                	driver.switchTo().window(it.next());  //it.next actually moves it
//			                	System.out.println(driver.getTitle());
//			                }
			                
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement a=driver.findElement(By.id("gf-BIG"));
	//	System.out.println(driver.findElements(By.tagName("a")).size());)
		System.out.println(a.findElements(By.tagName("a")).size());
		WebElement columndriver=a.findElement(By.xpath("//tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
			              for(int i=0;i<=columndriver.findElements(By.tagName("a")).size();i++)
			              {
			            	 
			            	  String clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
				                columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			                Thread.sleep(5000);
//			}
			            	  
			              }
			              Set<String> ab=driver.getWindowHandles();
			              Iterator abc=ab.iterator();
			              while(abc.hasNext())
			              {
			            	  driver.switchTo().window((String) abc.next());
			            	  System.out.println(driver.getTitle());
			              }
                                                                  
	}

}

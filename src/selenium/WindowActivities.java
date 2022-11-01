package selenium;

import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowActivities {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E://udemyjava//Introduction/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("http://google.com");// there is difference in the synchronisation of line 13 and 14 in get method
//										// selenium will wait untill goole page is fully open.
//		driver.navigate().to("https://rahulshettyacademy.com");// here it will not wait
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.quit();
		
		
	                                                 //practice
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//		driver.manage().window().maximize();
//		driver.get("http://google.com");
//		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.navigate().back();
//		
                                                    //practice

	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
	driver.get("https://www.google.co.in/");
	driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
	driver.navigate().back();
	
//	  String   tooltiptext=driver.findElement(By.cssSelector(".gLFyf ")).getAttribute("title");
//	  System.out.println(tooltiptext);
	
	     File a=((takesscreenshot)driver).getscreenshotAs(OutputType,File)
	    		 //takesscreenshot)driver -type casting
	FileUtils.copyFile(a, new location)
	
	
	
	//*[contains(@text,sahgdyasdgf)]
	
	
	//*[text(),'shgdyagsdcasc']
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

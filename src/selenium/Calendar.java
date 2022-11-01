package selenium;
// CLICKING A SPECIFIC DATE SUCH THAT IF YOU RUN THE PROGRAM IT SHOWS THAT PARTICULAR DATE ONLY.
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E://udemyjava//Introduction/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.airindia.in/");
//		//
//		driver.findElement(By.cssSelector("#travel_date")).click();
//		driver.findElement(By.cssSelector("//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']")).click();
//		
//		
//	
//    List <WebElement> dates=driver.findElements(By.className("day"));   //we are making list to grab all the element
//    int count=driver.findElements(By.className("day")).size();
//    for(int i=0;i<count;i++)  
//		{
//    	String text=driver.findElements(By.className("day")).get(i).getText();
//	System.out.println(driver.findElements(By.className("day")).get(i).getText());
//    	
//    	if(text.equalsIgnoreCase("23"))
//    		
//   	{
//    		driver.findElements(By.className("day")).get(i).click();
//    		break;
//    	}    }	
        
//        driver.get("https://www.alaskaair.com/");
//       Thread.sleep(4000);
//       // driver.findElement(By.cssSelector("img[alt='close']")).click();
//       // driver.findElement(By.cssSelector("input[id='oneway']")).click();
//      // driver.findElement(By.id("id=\"month-dropdown\"")).click();
//      // driver.findElement(By.)
//        driver.findElement(By.id("departureDate1")).click();
//        Thread.sleep(6000);
//       driver.findElement(By.id("month-dropdown")).click();
//      // driver.findElement(By.cssSelector("div[id='month'] option[value='Thu Sep 01 2022 12:43:50 GMT+0530 (India Standard Time)']")).click();)
//        driver.findElement(By.cssSelector("div[id='month'] option[value='Thu Sep 01 2022 12:43:50 GMT+0530 (India Standard Time)']")).click();
////         List<WebElement> dates=driver.findElements(By.cssSelector("td[role='gridcell']"));
//         for(int i=0;i< dates.size();i++)
        {
//        	 String text=driver.findElements(By.cssSelector("td[role='gridcell']")).get(i).getText();
//        	 Thread.sleep(5000);
//         
//         if(text.equalsIgnoreCase("23"))
//         {
//        	 driver.findElements(By.cssSelector("td[role='gridcell']")).get(i).click();
//        	 break;
//         }
        	
        	
        	driver.findElement(By.cssSelector((".input-group.date .ui-datepicker-trigger:nth-child(2)"))).click();
        	//driver.findElement(By.xpath("(//*[name()='svg'])[22]")).click();
        	List <WebElement> day=driver.findElements(By.cssSelector("[data-handler=\"selectDay\"]"));
        	for(int i=0;i<=day.size();i++)
        	{
        		List<WebElement> a=driver.findElements(By.cssSelector("[data-handler=\"selectDay\"]"));
        		if(a.get(i).getText().equalsIgnoreCase("23"))
        		{
        			a.get(i).click();
        		}
        	}
    	
//      
         }
	}
	}

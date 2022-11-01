package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "E://udemyjava//Introduction/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//a[@value='BLR']")).click();
//		// driver.findElement(By.xpath("(//a[@text='Chennai (MAA)'])[2]"));
//		driver.findElement(
//				By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Chennai (MAA)']"))
//				.click();
//
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
//		// to find chennai 2 x path is given to find chennai because chennai is present
//		// in both i>s from and to so system gets confused which one to select so firstly
//		// we can do it byusing indexes but without using index method we can use parent
//		// child relation
//		// driver.findElement(By.xpath("//div[contains(text(),'AGR')]")).click();
		
		
		//                               practice
		
		
		System.setProperty("webdriver.gecko.driver", "E://udemyjava//Introduction/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click(); //
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'glsctl00_mainContent_ddl_destinationStation1_CTNR\'] //a[@value='MAA']")).click();//(parent child relationship using xpath)
            Thread.sleep(3000);
            System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
            
            driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
      //  driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        
        //driver.findElement(By.xpath("(//a[@value=\"MAA\"])[2]")).click();
        
		
		

	}

}

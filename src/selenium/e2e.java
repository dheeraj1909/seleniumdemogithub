package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "E://udemyjava//Introduction/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); // before selecting clicking on
//																						// from
//		driver.findElement(By.xpath("//a[@value='DEL']")).click(); // selecting from
//		// driver.findElement(By.xpath("(//a[@text='Chennai (MAA)'])[2]"));
//		Thread.sleep(2000);
//		driver.findElement(
//				By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Chennai (MAA)']"))
//				.click(); // selecting to
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();// selecting the calander
//																							// date ( note no need to
//																							// open it directly opens)
//
//		if (driver.findElement(By.id("Div1")).getAttribute("style").contains(".5")) {
//			System.out.println("it is desabled");
//			Assert.assertTrue(true);
//		} else {
//			Assert.assertTrue(true);
//		}
//
//		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();//
//		driver.findElement(By.id("divpaxinfo")).click();
//		// driver.findElement(By.id("hrefIncAdt")).click();
//		Thread.sleep(2000);
//
//		int i = 1;
//		while (i < 4) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
//
//		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		                                                        //practice

		System.setProperty("webdriver.gecko.driver", "E://udemyjava//Introduction/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click(); //
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'glsctl00_mainContent_ddl_destinationStation1_CTNR\'] //a[@value='MAA']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains(".5"))
        {
        	System.out.println("its disabled");
        	Assert.assertTrue(true);
        }
        else
        {
        	Assert.assertTrue(false);
        }
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        driver.findElement(By.id("divpaxinfo")).click();
         Thread.sleep(2000);
        int i=1;
        while(i<5)
        {
        	 driver.findElement(By.id("hrefIncAdt")).click();
        	 i++;
        }
        
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        
	}

}

package selenium;

import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "E://udemyjava//Introduction/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		// driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
//		// Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']"))
//				.isSelected());
//		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
//		// Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//
//		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']"))
//				.isSelected());
//
//		// Count the number of checkboxes
//
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
//		// element is used
//		// instead of
//		// eleements because
//		// checkbox is more
//		// than one
//		driver.findElement(By.id("divpaxinfo")).click();
//		// driver.findElement(By.id("hrefIncAdt")).click();
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//
//		int i = 1;
//		while (i < 4) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//
//		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
//			System.out.println("it is enabled");
//			Assert.assertTrue(true);
//		} else {
//			Assert.assertTrue(false);
//		}
        
        
                                             //practice
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       // System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
      //  System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        
       // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
  //  driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
   // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains(".5"))
        {
        	System.out.println("its enabled");
        	Assert.assertTrue(true);
        }
        else
        {
        	Assert.assertTrue(false);
        }
        
        
        
        
        
        //count the no. of checkboxes 
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        driver.findElement(By.id("divpaxinfo")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"1 Adult");
        int i=1;
        while(i<5)
        {
        	 driver.findElement(By.id("hrefIncAdt")).click();
        	 i++;
        }
   
//        driver.findElement(By.id("hrefIncAdt")).click();
//        driver.findElement(By.id("hrefIncAdt")).click();
//        driver.findElement(By.id("hrefIncAdt")).click();
        driver.findElement(By.id("btnclosepaxoption")).click();   //done button on adult option
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
        

	}

}

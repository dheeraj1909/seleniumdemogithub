package interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Validate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E://udemyjava//Introduction/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
//        driver.get("https://www.amazon.in/");
//        String a=driver.getTitle();
//Assert.assertEquals(a,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("adsf");
        driver.findElement(By.cssSelector("[placeholder=\"Password\"]")).sendKeys("dshgfh");
        driver.findElement(By.cssSelector(".submit")).click();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.cssSelector(".error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click(); 
        
        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("adsf");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("dshgfh");
        driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("2135621443");
        driver.findElement(By.cssSelector(".submit")).click();
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        
       //.reset-pwd-btn 
        
        
	}

}

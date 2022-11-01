package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException   {

		// implicit wait-5 seconds time out it will wait 5 seconds utill message is
		// displayed
		
		System.setProperty("webdriver.gecko.driver", "E://udemyjava//Introduction/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.findElement(By.id("inputUsername")).sendKeys("dheeraj");
//		driver.findElement(By.name("inputPassword")).sendKeys("sadf213");
//		driver.findElement(By.className("signInBtn")).click();
//		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//		driver.findElement(By.linkText("Forgot your password?")).click();vvv
//		// Thread.sleep(1000); you did not need this
//		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("dheeraj");
//		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("dheeraj@080");
//		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
//		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("dheeraj080");
//		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9314212346");
//		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//
//		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
//		
//		// Thread.sleep(1000); you did not need this
//		
//		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
//		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
//		driver.findElement(By.id("chkboxOne")).click();
//		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        
                                                  //practise
        
        
        
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //waiting for the object to show on the page
//        driver.get("https://rahulshettyacademy.com/locatorspractice/");
//        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
//        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
//        driver.findElement(By.className("submit")).click();
//       System.out.println( driver.findElement(By.cssSelector(".error")).getText());
//       driver.findElement(By.linkText("Forgot your password?")).click();
//       Thread.sleep(3000);  //when we are moving to the new page we are waiting for the element to show
//       driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("dheeraj");
//        driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("dheerajyadav080@gmail.com");
//        driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).clear();
//       // driver.findElement(By.xpath(" //input[@type=\"text\"][2]")).sendKeys("shfgyfdgsdaf");
//        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("dheerajyadav080@gmail.com");
//        driver.findElement(By.xpath("//form/input[3] ")).sendKeys("323452145");
//        driver.findElement(By.className("reset-pwd-btn")).click();
//       System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//       driver.findElement(By.xpath("//div[@class=\"forgot-pwd-btn-conainer\"]/button[1]")).click();
//       Thread.sleep(5000);
//       driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
//       driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
//       driver.findElement(By.id("chkboxOne")).click();
//       driver.findElement(By.xpath("//button[@class=\"submit signInBtn\"]")).click();
       
       // driver.quit();
                                                   //practise
        
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        Thread.sleep(5000);
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("rahul");
        driver.findElement(By.cssSelector(".submit")).click();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.cssSelector(".error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("duygfui");
        driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("sqdq");
        driver.findElement(By.cssSelector("[placeholder=\"Phone Number\"]")).sendKeys("9011661244");
        driver.findElement(By.cssSelector("[class=\"forgot-pwd-btn-conainer\"] button:nth-child(2)")).click();
        System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector(".submit")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".logout-btn")).click();
	}

}

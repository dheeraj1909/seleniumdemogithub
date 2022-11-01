package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException  {
//		String name = "rahul";
		System.setProperty("webdriver.gecko.driver", "E://udemyjava//Introduction/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.edge.driver", "E://udemyjava//Introduction/msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		// System.setProperty("webdriver.chrome.driver","E://udemyjava//Introduction/chromedriver.exe");
//		// WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		String password = getpassword(driver);
//
//		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.findElement(By.id("inputUsername")).sendKeys(name);
//		driver.findElement(By.name("inputPassword")).sendKeys(password);
//		driver.findElement(By.className("signInBtn")).click();
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.tagName("p")).getText());
//		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
//		// to use assert go in pom file and delete scope commond
//		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
//				"Hello " + name + ",");
//		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
//		driver.close();
		
		
		
		                                                   //practise
		
                                                            //practise
		String name="dheeraj";
                              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                              String pass= getpassword(driver);
                              driver.get("https://rahulshettyacademy.com/locatorspractice/");
                              driver.findElement(By.id("inputUsername")).sendKeys(name);
                            
                              driver.findElement(By.name("inputPassword")).sendKeys(pass);
                              driver.findElement(By.className("submit")).click();
                              Thread.sleep(5000);
                             System.out.println( driver.findElement(By.tagName("p")).getText());
                              Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
                             Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"login-container\"]/h2")).getText(),"Hello "+name+",");
                              // keep in mind in aeertion even the small spaces as well.
                             driver.findElement(By.xpath("//button[text()='Log Out']")).click();
                             driver.quit();


	}

//	public static String getpassword(WebDriver driver) throws InterruptedException {
//		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.findElement(By.linkText("Forgot your password?")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//		String passwordText = (driver.findElement(By.cssSelector("form p")).getText());
//		String passwordArray[] = passwordText.split("'");
//		String passwordArray2[] = passwordArray[1].split("'");
//		String password = passwordArray2[0];
//		return password;
//		
//		                                                    
		public static String getpassword(WebDriver driver) throws InterruptedException {
			
			 
              driver.get("https://rahulshettyacademy.com/locatorspractice/");
              driver.findElement(By.linkText("Forgot your password?")).click();
              Thread.sleep(3000);
              driver.findElement(By.className("reset-pwd-btn")).click();
              String passworda=driver.findElement(By.cssSelector("form p")).getText();
              String[]  passwordb=passworda.split("'");
                                 String[] passwordc=passwordb[1].split("'");
                                String  password=passwordc[0];
                                return password;
			
			
			
		}
		
		                                     		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	}
}

package selenium;
               // to hoverover the amazon signin menu and to fill in search with capital letter
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E://udemyjava//Introduction/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//		driver.get("https://www.amazon.com/");
		// WebElement move=driver.findElement(By.id("input[id=twotabsearchtextbox]")); insted of using locatores id write move
//		Actions a=new  Actions(driver);
//		a.moveToElement(driver.findElement(By.cssSelector("a[id=nav-link-accountList]"))).build().perform();
//		a.moveToElement(driver.findElement(By.id("input[id=twotabsearchtextbox]"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
//        a.moveToElement(driver.findElement(By.id("input[id=twotabsearchtextbox]"))).contextClick().build().perform();
        
        //build().perform() -it is compulsion to write this to perform the action
        
        
        
                                                       //practice
//        driver.get("https://www.amazon.com/"); 
//        Actions a=new  Actions(driver);
//        
//        WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
//        a.moveToElement(driver.findElement(By.cssSelector("input[id=\'twotabsearchtextbox\']"))).click().keyDown(Keys.SHIFT).sendKeys("hello");
//        a.moveToElement(move).contextClick().build().perform();
      //  driver.findElement(By.id("nav-link-accountList-nav-line-1");
        
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Actions b=new Actions(driver);
        b.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
        b.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
        b.moveToElement(driver.findElement(By.xpath("//span[text()='Returns']"))).contextClick().build().perform();
        
	}

}

package selenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Amazoninterview {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E://udemyjava//Introduction/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
       // driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebDriverWait w=new WebDriverWait(driver,null);
		
		
//		String[] itemsneeded = { "Cucumber", "Brocolli", "Beetroot" };
//		driver.get("https://rahulshettyacademy.com/seleniumPractise");
//		Thread.sleep(3000);
//		//addItems(driver,itemsneeded);
//		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
//		driver.findElement(By.cssSelector("//button[contains(text(),'Apply')]")).click();
//		driver.findElement(By.cssSelector("//button[contains(text(),'Place Order')]")).click();
    	
		String [] itemsNeeded= {"Brocolli","Cauliflower","Cucumber","Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
		Thread.sleep(3000);
		 additems( driver,itemsNeeded);
		 driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		 driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));

		 driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		 driver.findElement(By.cssSelector(".promoBtn")).click();
		 //explicit wait applied in two ways 1] WebDriver wait=10 seconds - it will search for each milliseconds
		                                  // 2]fluent wait=10 seconds,polling 2sec- it will will search after each 2 seconds.
		 
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		 System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		 driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		 
		 //)
		 
		 
		
		
	}
	
	public static void additems(WebDriver driver,String [] itemsNeeded) {
		int j=0;
		List<WebElement> products=driver.findElements(By.cssSelector(".product-name"));
		for(int i=0;i<products.size();i++)
		{
			String []name=products.get(i).getText().split("-");
			String formattedname =name[0].trim();
			
			List itemsNeededList=Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formattedname))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==itemsNeeded.length)
				{
					break;
				}
			}	
		}
		
		
		//implicit wait is applied globally while implicit wait is applied specifically for particular instance.
		
		
		
	}
}

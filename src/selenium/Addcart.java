package selenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addcart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E://udemyjava//Introduction/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		// implicit wait
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		//implicit wait applied to each row
		// explicit wait applies to specific element for which it is mentioned.
		//FluentWait(polling time=2 sec) -based on pollingtime it checks at that particular interaval that element is present or not ex. it will check after 2sec 4 sec 6 sec .

		int j = 0;
		String[] itemsneeded = { "Cucumber", "Brocolli", "Beetroot" };

		// driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String formattedname = name[0].trim();

			List itemsneededList = Arrays.asList(itemsneeded);
			if (itemsneededList.contains(formattedname)) {
				j++;
				// click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == 3)
					break;
			}
		}
Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class=' ']")).click();

		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		// WebDriverWait wait=new WebDriverWait(driver,5);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promocode"))); // locators whose
																										// text is to be
																										// visible
Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
	}

}

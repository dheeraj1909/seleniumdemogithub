package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "E://udemyjava//Introduction/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.id("autosuggest")).sendKeys("ind");
//		Thread.sleep(3000);
//		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//
//		for (WebElement option : options) // Webelement return type of options
//		{
//			if (option.getText().equals("India")) {
//				option.click();
//				break;
//			}
//		}
		                                 //practice
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		
		List<WebElement> options=driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"] /a"));
		 
//		for(WebElement option:options)
//		{
//			if(option.getText().equalsIgnoreCase("India"))
//			{
//				option.click();
//				break;
//			}
//			
//		}
	for(int i=0;i<options.size();i++)
	{
		if(options.get(i).equals("India"))
		{
			options.get(i).click();
		}
	}
	
	}

}

package Automationpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E://udemyjava//Introduction/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 Select dropdown=new Select(staticdropdown);
		 dropdown.selectByIndex(2);
		 driver.findElement(By.id("divpaxinfo")).click();
		 int i=0;
		 for(i=0;i<=4;i++)
		 {
			 driver.findElement(By.id("hrefIncAdt")).click();
		 }
		 
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 driver.findElement(By.cssSelector("[text=\"Varanasi (VNS)\"]")).click();
		 driver.findElement(By.cssSelector("[id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] [text=\"Pune (PNQ)\"]")).click();
		 driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		List<WebElement>  options=driver.findElements(By.cssSelector(".ui-menu-item"));
		  for (WebElement option:options)
		  {
			  if(option.getText().equalsIgnoreCase("India"))
			  {
				  option.click();
				  break;
			  }
		  }
		  Thread.sleep(3000);
		 driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		 
		 driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		 
		 
		 
		 
	}

}

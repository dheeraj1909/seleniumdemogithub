package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "E://udemyjava//Introduction/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
//		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
		
		
		                                //practice
		
             System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	}

}

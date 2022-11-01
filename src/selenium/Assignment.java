package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "E://udemyjava//Introduction/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("name")).sendKeys("dheeraj");
        driver.findElement(By.id("alertbtn")).click();
//        System.out.println(driver.switchTo().alert().getText()); // to grab the text present on alert  box. 
//        driver.switchTo().alert().accept();           // setting the webdriver to alert and accepting theallert
//        driver.findElement(By.id("confirmbtn")).click();
//        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().dismiss();
	}

}

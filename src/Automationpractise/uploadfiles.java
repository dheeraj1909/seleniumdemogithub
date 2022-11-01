package Automationpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfiles {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E://udemyjava//Introduction/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.monsterindia.com/");
        driver.findElement(By.xpath("//span[@class=\"uprcse semi-bold\"]")).click();
       // driver.findElement(By.xpath("(//input[@id='file-upload'])[1]")).sendKeys("F:\\21.pdf");
		
      String projectpath=System.getProperty("user.dir");
 	   driver.findElement(By.xpath("(//input[@id='file-upload'])[1]")).sendKeys("E:\\udemyjava\\selenium\\src\\Automationpractise\\21.pdf");
		
		
		
	}

}
 
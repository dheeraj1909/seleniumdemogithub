package Automationpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Itera {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E://udemyjava//Introduction/chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.findElement(By.id("name")).sendKeys("Dheeraj");                       //id
        driver.findElement(By.xpath("//input[@aria-describedby='phone']")).sendKeys("1234567890"); //   xpath
	    driver.findElement(By.cssSelector("input[placeholder='Enter email']")).sendKeys("Yadavdheeraj080@gmail.com"); //  css  
	    driver.findElement(By.xpath("//div[@class='form-group']/input[@type='password']")).sendKeys("Dheeraj@1909");//Parent-child
	    driver.findElement(By.cssSelector("div textarea")).sendKeys("Flat no.10 domhel road wagholi pune 412207");// parent-child
	    driver.findElement(By.cssSelector(".btn.btn-primary")).click();      //class
	    driver.findElement(By.name("optionsRadios")).click();         //name
	    driver.findElement(By.xpath("//label[@class='form-check-label']/input[@id='monday']")).click();//parent -child
//	    driver.findElement(By.cssSelector(".custom-select")).click();
//	    driver.findElement(By.xpath("//select[@class='custom-select']/option[@value='4']")).click();
         	    //or
	    WebElement Staticdropdown=driver.findElement(By.cssSelector(".custom-select"));
	    Select dropdown =new Select(Staticdropdown);
	    dropdown.selectByIndex(4);
	    driver.findElement(By.xpath("//label[@for='2years']")).click();
	    driver.findElement(By.xpath("//label[@for='selenium']")).click();
	    
	                                       //upload file from folder 
	      
	                                     
	    driver.findElement(By.xpath("//input[@class='custom-file-input']")).sendKeys("F:\\21.pdf");
                                           //upload file from project	    
	    //String projectpath=System.getProperty("user.dir");
	   //driver.findElement(By.xpath("//input[@class='custom-file-input']")).sendKeys(projectpath+"E:\\udemyjava\\selenium\\src\\selenium\\21.pdf");

	}

}

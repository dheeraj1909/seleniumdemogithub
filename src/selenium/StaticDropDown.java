package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class StaticDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E://udemyjava//Introduction/chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		// dropdown with select tag
//		Select dropdown = new Select(staticDropdown);// select is a class
//		dropdown.selectByIndex(3);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByValue("AED"); // value is attribute
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByVisibleText("INR");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
        
                                                       //practice
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       WebElement staticdropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
                                                        //DROPDOWN WITH SELECT TAG is static dropdown( so pass in select).
        Select dropdown=new Select(staticdropdown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        

	}

}

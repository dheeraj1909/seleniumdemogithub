package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintroduction {

	public static void main(String[] args) throws InterruptedException {

		// Invoking browser
		// Chrome - ChromeDriver ->Methods (close method)
		// Firefox - FirefoxDriver ->Methods(close method)
		// safari SaariDrier ->Methods(close method)
		// Chrome-ChromeDriver->Methods

		// chromdriver.exe->Chrome browser
		// System.setProperty("webdriver.chrome.driver","E://udemyjava//Introduction/chromedriver.exe");//
		// drivername with its path of
		// Webdriver.chrome.driver(key)-> value of path
		// WebDriver driver=new ChromeDriver(); // class(ChromeDriver) with reference of
		// Webdriver.

		// Firefox Launch
		// geckodriver

		System.setProperty("webdriver.gecko.driver", "E://udemyjava//Introduction/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

//		driver.get("https://rahulshettyacademy.com"); // which link to open
//		System.out.println(driver.getTitle()); // title of rahulshetty
//		System.out.println(driver.getCurrentUrl()); // where exactly the cursor is
//		driver.close(); // close current window
//		driver.quit(); // closes all the associated window.
		
		                                                //practice second time
		
		driver.get("https://www.amazon.com/");
		//driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		//driver.close();  //use either of them
		driver.quit();
		
		

	}

}

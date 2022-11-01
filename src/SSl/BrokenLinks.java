package SSl;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.gecko.driver", "E://udemyjava//Introduction/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
		
		//broken links - the link which are not working i.e showing 404 error is called broken link.
		// page not found
		//java methods will call URL"s and gets you the status code
		//if status code > 400 then that url is not working->link which tied to url is broken
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/#");
		
	List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	SoftAssert a =new SoftAssert(); // object made to  carry forward the process once broken link is found out. 
	for(WebElement link:links)
	{
		String src=link.getAttribute("href");
		 HttpURLConnection conn=(HttpURLConnection)new URL(src).openConnection();
		// you have to call open connection method and that method is present in url class
		 conn.setRequestMethod("HEAD");
		 conn.connect();
		int res= conn.getResponseCode();
		 System.out.println(res);
		 a.assertTrue(res<400, "The link with Text"+link.getText()+"is broken with code"+res);
		    //first statement is true while second statement is false 
	}	
		a.assertAll(); //to report the failure links	
	}

}

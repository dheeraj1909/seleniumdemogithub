package SSl;

import java.io.File;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Miscellaneous {

	public static void main(String[] args) throws IOException {
		//any thing on the browser we do it by manage 

		System.setProperty("webdriver.gecko.driver", "E://udemyjava//Introduction/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("te5eyt");
		//int a=5;
	//	getscreenshot(driver);
		
		
		
		//click on any link 
		//login page-verify login url
		
		//driver.get("http://google.com");
		
		
		     // File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		      //we are casting driver object to takes screenshot driver object
		      //getScreenshotAs- we are telling that after taking screenshot we are telling to store as a file.
		      
		     // FileUtils.copyFile(src,new File("F:\\ZIPFILE.png"));
		
		driver.get("https://www.google.com/");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\zipfile2.png"));
		
		     
	}
	
//	public static void getscreenshot(WebDriver driver) throws IOException
//	{
//		driver.get("http://google.com");
//		 File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
//		 FileUtils.copyFile(src,new File("F:\\ZIPFILE.png"));
//		
//	}

}

package SSl;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E://udemyjava//Introduction/geckodriver.exe");
       
//		options.setAcceptInsecureCerts(true); // we are setting it because when we are coming to certification we are accepting it
//		
//		System.setProperty("webdriver.chrome.driver","E://RWD/chromedriver.exe");
//		//consider option as behaviour so we are passing the behaviour to chrome web driver  to excute the chrome.
//		WebDriver driver=new ChromeDriver(options);
//		driver.get("https://expired.badssl.com/");
//		System.out.println(driver.getTitle());
//		
		                                                     //practice
		FirefoxOptions options=new  FirefoxOptions();
		Proxy proxy=new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);
		
		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", "/directory/path");

		options.setExperimentalOption("prefs", prefs);
		
		
		
		
		options.setAcceptInsecureCerts(true);
		 WebDriver driver = new FirefoxDriver(options);
		 driver.get("https://expired.badssl.com/");
		System.out.println( driver.getTitle());		
		
		
	}

}

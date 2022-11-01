package SSl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;

public class RelativeLoc1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E://udemyjava//Introduction/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

//		driver.get("https://rahulshettyacademy.com/angularpractice/");  //"input[name=\"name\"]"
//		WebElement editbox=driver.findElement((By.cssSelector("input[name='name']")));
//		System.out.println(driver.findElement(with(By.tagName("label")).above(editbox)).getText());
//		
//		WebElement birthday=driver.findElement(By.cssSelector("label[for=\"dateofBirth\"]"));
//		driver.findElement(with(By.tagName("input")).below(birthday)).click();
//		
//		WebElement checkbox=driver.findElement(By.cssSelector("label[for=\"exampleCheck1\"]"));
//		driver.findElement(with(By.tagName("input")).toLeftOf(checkbox)).click();
//		
//		WebElement radiobutton=driver.findElement(By.cssSelector("input[name=\"inlineRadioOptions\"]"));
//		
//		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radiobutton)).getText());
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//driver.findElement(By.cssSelector("input[name='name']"));)
		WebElement nameEditbox=driver.findElement(By.cssSelector("input[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above( nameEditbox)).getText());

		WebElement dob=driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		
		WebElement dob1=driver.findElement(By.cssSelector("label[for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(dob1)).click();
		
		
		WebElement dob2=driver.findElement(By.cssSelector("[name='inlineRadioOptions']"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(dob2)).getText());
		
	}

}

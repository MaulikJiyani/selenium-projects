package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		//FirefoxDriver driver= new FirefoxDriver(); //open firefox
		
		WebDriver driver = new FirefoxDriver(); //FirefoxDriver is actually belonging from Webdriver interface.
		driver.get("https://www.facebook.com/"); //open facebook
		
		WebElement email=driver.findElement(By.name("email")); 
		email.sendKeys("abc@hdahdahsa"); // wrong email
		
		WebElement password =driver.findElement(By.name("pass"));
		password.sendKeys("dsfdssdfcvvc"); //wrong password
		
		WebElement login = driver.findElement(By.tagName("button"));
		login.click();
	}

}

package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver(); 
		
		driver.get("https://www.facebook.com/");
		
		//1 Name
		//Use of web element, you can just identify as int, float. and use small
		//name frequently and easily.
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("abc@hdahdahsa");
		
		//2 ID
		WebElement password =driver.findElement(By.name("pass"));
		password.sendKeys("dsfdssdfcvvc");
		
		//3 Tag name
		WebElement login = driver.findElement(By.tagName("button"));
		login.click();
		
	}

}

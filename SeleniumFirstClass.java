package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {
SeleniumFirstClass t1 = new SeleniumFirstClass();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver(); 
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("hjgdsjdhgajhgd");
		driver.findElement(By.id("pass")).sendKeys("abcdefg");
		driver.findElement(By.name("login")).click();

	}
	
}

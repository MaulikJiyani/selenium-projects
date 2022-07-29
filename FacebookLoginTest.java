package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver(); 
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//1 Name
		driver.findElement(By.name("email")).sendKeys("abc@hdahdahsa");
		
		//2 ID
		driver.findElement(By.id("pass")).sendKeys("dsfdssdfcvvc");
		
		//3 Tag name
		driver.findElement(By.tagName("button")).click();
		
		String expectedTitle = "Facebook - log in or sign up";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedURL = "https://www.facebook.com/";
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		
		if(expectedTitle.equals(actualTitle) & expectedURL.contains(actualURL)) {
			System.out.println("pass");
		}else
		{
			System.out.println("fail");
		}	

	}
}

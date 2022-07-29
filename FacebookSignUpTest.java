package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookSignUpTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver(); 
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("fdfdvcvc");
		driver.findElement(By.name("reg_email__")).sendKeys("dsfdssdfcvvc");
		driver.findElement(By.id("password_step_input")).sendKeys("dsfdssdfcvvc");
		
		driver.findElement(By.name("websubmit")).click();
		
	}

}

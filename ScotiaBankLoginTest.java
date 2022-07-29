package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver(); 
		
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=2krp1IAkmuc&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5nb29nbGUuY29tXC8iLCJvYXV0aF9rZXkiOiIya3JwMUlBa211YyIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjU4NTMyNzQ2LCJpYXQiOjE2NTg1MzE1NDYsImp0aSI6IjE3MWUwZTBmLWQwZjktNGI2Zi1iMjNmLTUxYzMxMWMwMzlmMiIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.AiugQ458w3_Yc8pGsTxgV3mUXYUjC-uVGyHyZ6RWNzUVBtQyx78lx63AZ9pdZ1q6vbRhq3NZXNR_PeWtWWWMf8X_ld7A0RUGAm-qsEGUykxY348StcMvD8NTO3SMvY7LPyQ_7N_tKvpdgSy-vjhzr5L0_A8ZpN7iXz6_KKl_bQf1KJIIgeP1Ep_HFGZm1PuUGXj5No__yEmYlJokmkSvyDl0kkpKsbvXCZ-2ev1LyKtJFdHoKiMVfWWfFb1OSPFIZFcR2DV4qN962x1S1VWJNkr6Z2PehT7sZa_jLMGInRY7yJKEUSw9PNBigPuWANphxzvLJoYABnA9iR8wQ9dgQg&preferred_environment=");
		driver.findElement(By.id("usernameInput-input")).sendKeys("dsadsdda");
		driver.findElement(By.name("password")).sendKeys("dsadsdda");
		
		driver.findElement(By.id("signIn")).click();
		
		String expectedErr= "Please enter your username or card number.";
		String actualErr=driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		
		if(expectedErr.equals(actualErr))
		{
			System.out.print("Pass");
		}
		else
		{
			System.out.print("Fail");
		}
	
	}

}

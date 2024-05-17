package week3.homeassignments;

import org.openqa.selenium.By;

public class LoginTestData extends TestData{
	public void enterUsername() {

		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");

	}
	public void enterPassword() {

		driver.findElement(By.id("pass")).sendKeys("Test123");
	}
	
	public static void main(String[] args) {
		LoginTestData lt= new LoginTestData();
		lt.navigateToHomePage();
		lt.enterCredentials();
		lt.enterUsername();
		lt.enterPassword();
	}

}

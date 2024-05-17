package week3.homeassignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestData {
	
	ChromeDriver driver= new ChromeDriver();
	public void enterCredentials() {
		System.out.println("Enter the Login credentials");
	}
	public void navigateToHomePage() {
		
	
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
	}

}

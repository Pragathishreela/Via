package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementUsingCssSelector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("a[href='/register']")).click();
		driver.findElement(By.cssSelector("input[id='gender-female']")).click();
		driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys("Pragathi");
		driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys("Shreela");
		driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("Pragathi2203200@gmail.com");
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("Pragathi@123");
		driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("Pragathi@123");
		driver.findElement(By.cssSelector("input[name='register-button']")).click();
		
	}
}
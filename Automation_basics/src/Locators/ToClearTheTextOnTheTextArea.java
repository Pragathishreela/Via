package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClearTheTextOnTheTextArea {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
		WebElement usernameTf = driver.findElement(By.xpath("//input[@name='username']"));
		usernameTf.clear();
		usernameTf.sendKeys("Pragathi");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.clear();
		password.sendKeys("Pragathi@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
	}
}

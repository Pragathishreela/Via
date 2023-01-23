package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandActiveElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String emailId = "pragathi22032000@gmail.com";
		String password = "Pragathi9108@";
		driver.manage().window().maximize();
		driver.get("https://www.firelawn.com/");
		driver.findElement(By.id("fl_login_btn")).click();
		driver.findElement(By.id("fl_email")).sendKeys(emailId,Keys.TAB);
		driver.switchTo().activeElement().sendKeys(password);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
	}
}

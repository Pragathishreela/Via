package Locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandSendKeys {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapchat.com/");
		driver.findElement(By.xpath("//p[text()='Log in to chat']")).click();
		Thread.sleep(6000);
		Set<String> windowIds = driver.getWindowHandles();
		for(String windowId : windowIds) {
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());
		}
		//driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("Pragathi",Keys.CONTROL+"a");
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"v");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='home_children_button']")).click();
	}
}

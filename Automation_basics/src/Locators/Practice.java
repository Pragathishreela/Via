package Locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapchat.com/");
		driver.findElement(By.xpath("//p[text()='Log in to chat']")).click();
		Set<String> windowIds = driver.getWindowHandles();
		String expectedtitle = "";
		for(String windowId : windowIds) {
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());
			}
		}
	}


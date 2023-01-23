package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreFrames {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
		driver.switchTo().frame("app");
		//driver.findElement(By.linkText("Maps")).click();
	}
}

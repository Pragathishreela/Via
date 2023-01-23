package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreGetRectAndCssValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Rectangle userName = driver.findElement(By.xpath("//input[@id='username']")).getRect();
		System.out.println(userName.getDimension());
		System.out.println(userName.getPoint());
		WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
		System.out.println(login.getCssValue("display"));
		System.out.println();
		driver.quit();
	}
}

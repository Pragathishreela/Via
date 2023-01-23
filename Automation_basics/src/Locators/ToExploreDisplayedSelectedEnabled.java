package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreDisplayedSelectedEnabled {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
		System.out.println(login.isDisplayed());
		System.out.println(login.isSelected());
		System.out.println(login.isEnabled());
	}
}

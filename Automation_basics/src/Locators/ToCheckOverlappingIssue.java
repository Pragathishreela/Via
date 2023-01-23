package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckOverlappingIssue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		int userNameHeight = userName.getSize().getHeight();
		int userNameLocation = userName.getLocation().getY();
		System.out.println(userNameHeight+userNameLocation+0.03);
		WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
		System.out.println(password.getLocation().getY());
		driver.quit();
		
		 
		
	}
}

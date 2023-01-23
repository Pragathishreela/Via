package Assignment_01;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTochildInFirelawn {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://firelawn.com/products_page/7");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("fl_compare")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		windowHandles.remove(parentWindow);		
	/*	for(String i:windowHandles) {
			driver.switchTo().window(i);
			System.out.println(driver.getCurrentUrl());
		}*/
		for(String i:windowHandles) {
			driver.switchTo().window(i);
			if("https://www.amazon.in/".equals(driver.getCurrentUrl())) {
				driver.close();
			}
		}
	}
}
package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandTheDiffBetweenCloseAndQuit {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.findElementByXPath("//input[@value='Open Food Sites']").click();
		Thread.sleep(2000);
		Set<String> allWindowsIds = driver.getWindowHandles();
		System.out.println("Size of set = "+allWindowsIds.size());
		for(String windowId : allWindowsIds) {
			System.out.println(windowId);
		}
		driver.quit();
	}
}

package Assignment_01;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetThePositionOfTheWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Point toMoveTheWindow = new Point(100,50);
		Thread.sleep(3000);
		driver.manage().window().setPosition(toMoveTheWindow);
		driver.quit();
	}
}

package Locators;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempScreenShot = ts.getScreenshotAs(OutputType.FILE);
		//File targetScreenShot = new File("C:\\Users\\user\\Desktop\\Java Papers\\ErroeScreenShots/Snap1.png");
		//tempScreenShot.renameTo(targetScreenShot);
		File targetScreenShot = new File("./ErrorScreenShots/Snap1");
		FileHandler.copy(tempScreenShot, targetScreenShot);
		Thread.sleep(5000);	
	}
}

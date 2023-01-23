package Locators;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToExploreFramesInReddifApp {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys("sumanthElfBatch@rediffmail.com",Keys.TAB);
		driver.findElement(By.id("password")).sendKeys("Testing@123",Keys.ENTER);
		driver.findElement(By.xpath("//b[text()='Write mail']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[11]")).sendKeys("Pragathi",Keys.TAB);
		WebElement frame = driver.findElement(By.xpath("//iframe[contains(@title,'Rich ')]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//body[contains(@class,'cke_editable cke')]")).sendKeys("Hi sir im pragathi");
		//Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Send")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Pragathi']/..//cite[@title='Select mail']")).click();
		driver.findElement(By.id("captchaText")).click();
		//Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		//Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		//Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		//explicitWait.until(ExpectedConditions.)
		//driver.findElement(By.id("rdNotify"));
		File tempScreenShot = ts.getScreenshotAs(OutputType.FILE);
		File targetScreenShot = new File("./ErrorScreenShots/SnapRediff1.png");
		FileHandler.copy(tempScreenShot, targetScreenShot);
		driver.quit();
	}
}
package pop_ups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LicToExploreOnAlertPopUps {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://licindia.in/");
		String parentWindowId = driver.getWindowHandle();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for(;;) {
			try {
				driver.findElement(By.linkText("Agents Portal")).click();
				break;
			}
			catch(Exception e) {
				js.executeScript("window.scrollBy(0,300);");
			}
		}
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Set<String> windowHandles = driver.getWindowHandles();
		windowHandles.remove(parentWindowId);
		for(String i:windowHandles) {
			driver.switchTo().window(i);
		}
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		String errorMsg = driver.findElement(By.xpath("//li[text()='Please enter your Agent Code or Email or Mobile']")).getText();
		System.out.println(errorMsg);
	}
}

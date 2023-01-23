package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopUps {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://firelawn.com/");
		driver.findElement(By.id("fl_login_btn")).click();
		driver.findElement(By.id("fl_email")).sendKeys("pragathi22032000@gmail.com",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Pragathi9108@",Keys.ENTER);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@aria-label='Account settings']")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Edit Profile')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys(Keys.CONTROL+"a");
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("Prag",Keys.ENTER);
		Thread.sleep(3000);
		Alert alertRef = driver.switchTo().alert();
		System.out.println(alertRef.getText());
		alertRef.accept();
	}
}

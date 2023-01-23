package pop_ups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAvoidFileUploadPopUps {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.freshersworld.com/");
		driver.findElement(By.id("reg_new_btn")).click();
		driver.findElement(By.id("file-upload")).sendKeys("E:\\Photos\\Ammu\\IMG_20211014_191726.jpg");
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		driver.findElement(By.id("file-upload")).click();
		//driver.findElement(By.id("file-upload")).sendKeys("H:\\My Drive\\College\\4th sem CAD/CANTEEN PP.pdf");
		Runtime.getRuntime().exec("./autoItScripts/freshersWorld.exe");
			
	}
}
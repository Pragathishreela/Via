package Assignments;

/*import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ToOpenFlipKartAppAndToCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("lipstick",Keys.ENTER);
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@target='_blank'][1]")).click();
		Set<String> ids = driver.getWindowHandles();
		for(String i : ids) {
			driver.switchTo().window(i);
		}
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("lipbalm",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@target='_blank'][1]")).click();
		Set<String> idss = driver.getWindowHandles();
		for(String i : idss) {
			driver.switchTo().window(i);
		}
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("kajal",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@target='_blank'][1]")).click();
		Set<String> idsss = driver.getWindowHandles();
		for(String i : idsss) {
			driver.switchTo().window(i);
		}
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();/*

}
}*/

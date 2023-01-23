package Assignment_01;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToCountTheNumberOfAirPlanes {
	public static void main(String[] args) throws InterruptedException {
		LocalDateTime systemDateTime = LocalDateTime.now().plusDays(2);
		String monthName = systemDateTime.getMonth().name();
		String month = ""+monthName.charAt(0)+monthName.substring(1,monthName.length()).toLowerCase();
		int year = systemDateTime.getYear();
		int date = systemDateTime.getDayOfMonth();
		System.out.println(month);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Actions action = new Actions(driver);
		WebDriverWait explicit = new WebDriverWait(driver, 15);
		action.click().perform();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.switchTo().activeElement().sendKeys("Banglore");
		WebElement from = driver.findElement(By.xpath("(//li[@role='option'][1])"));
		try {
			explicit.until(ExpectedConditions.elementToBeSelected(from));
		}catch(Exception e) {
			
		}
		action.moveToElement(from).click().perform();
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("turkey");
		WebElement To = driver.findElement(By.xpath("(//li[@role='option'][1])"));
		try {
			explicit.until(ExpectedConditions.elementToBeSelected(To));
		}catch(Exception e) {
			
		}
		action.moveToElement(To).click().perform();
		driver.switchTo().activeElement().click();
		driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+date+"']")).click();
		WebElement search = driver.findElement(By.linkText("SEARCH"));
		action.moveByOffset(544, -229);
		action.moveToElement(search).click().perform();
		driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();
		
		
		
		
		
		
		
		
		
		
		
	}
}
